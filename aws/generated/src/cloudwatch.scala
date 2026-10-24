package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudwatch:
  /** Manages an AWS CloudWatch Alarm Mute Rule. */
  def AlarmMuteRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.AlarmMuteRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS CloudWatch Contributor Managed Insight Rules. */
    inline def getContributorManagedInsightRules(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetContributorManagedInsightRulesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getContributorManagedInsightRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CloudWatch Contributor Managed Insight Rules. */
    inline def getContributorManagedInsightRulesPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetContributorManagedInsightRulesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetContributorManagedInsightRulesPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getContributorManagedInsightRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * This data source can be used to fetch information about a specific
     * EventBridge event bus. Use this data source to compute the ARN of
     * an event bus, given the name of the bus.
     */
    inline def getEventBus(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventBusResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBus(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * This data source can be used to fetch information about a specific
     * EventBridge event bus. Use this data source to compute the ARN of
     * an event bus, given the name of the bus.
     */
    inline def getEventBusPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventBusResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBusPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS EventBridge Event Buses. */
    inline def getEventBuses(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventBusesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusesArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBuses(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS EventBridge Event Buses. */
    inline def getEventBusesPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventBusesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventBusesResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventBusesPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventBusesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to retrieve information about an EventBridge connection.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventConnection(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventConnectionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventConnectionResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventConnectionArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to retrieve information about an EventBridge connection.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventConnectionPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventConnectionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventConnectionResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventConnectionPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventSource(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventSourceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetEventSourceResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventSourceArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventSource(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get information about an EventBridge Partner Event Source. This data source will only return one partner event source. An error will be returned if multiple sources match the same name prefix.
     * 
     * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
     */
    inline def getEventSourcePlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetEventSourcePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetEventSourceResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetEventSourcePlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getEventSourcePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `aws.cloudwatch.LogDataProtectionPolicy` resource.
     * 
     * &gt; For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
     */
    inline def getLogDataProtectionPolicyDocument(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogDataProtectionPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogDataProtectionPolicyDocument(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Generates a CloudWatch Log Group Data Protection Policy document in JSON format for use with the `aws.cloudwatch.LogDataProtectionPolicy` resource.
     * 
     * &gt; For more information about data protection policies, see the [Help protect sensitive log data with masking](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
     */
    inline def getLogDataProtectionPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogDataProtectionPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogDataProtectionPolicyDocumentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an AWS CloudWatch Log Group */
    inline def getLogGroup(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an AWS CloudWatch Log Group */
    inline def getLogGroupPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get a list of AWS CloudWatch Log Groups */
    inline def getLogGroups(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudwatch.outputs.GetLogGroupsResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupsArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get a list of AWS CloudWatch Log Groups */
    inline def getLogGroupsPlain(args: Endofunction[com.pulumi.aws.cloudwatch.inputs.GetLogGroupsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudwatch.outputs.GetLogGroupsResult] =
      val argsBuilder = com.pulumi.aws.cloudwatch.inputs.GetLogGroupsPlainArgs.builder
      com.pulumi.aws.cloudwatch.CloudwatchFunctions.getLogGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides a CloudWatch Composite Alarm resource.
   * 
   * &gt; **NOTE:** An alarm (composite or metric) cannot be destroyed when there are other composite alarms depending on it. This can lead to a cyclical dependency on update, as the provider will unsuccessfully attempt to destroy alarms before updating the rule. Consider using `dependsOn`, references to alarm names, and two-stage updates.
   */
  def CompositeAlarm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.CompositeAlarmArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def ContributorInsightRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ContributorInsightRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def ContributorManagedInsightRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ContributorManagedInsightRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def Dashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.DashboardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.DashboardArgs.builder
    com.pulumi.aws.cloudwatch.Dashboard(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge event API Destination resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventApiDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventApiDestinationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def EventArchive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventArchiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def EventBus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventBusArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def EventBusPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventBusPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventBusPolicyArgs.builder
    com.pulumi.aws.cloudwatch.EventBusPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge connection resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def EventEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def EventPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventPermissionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventPermissionArgs.builder
    com.pulumi.aws.cloudwatch.EventPermission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an EventBridge Rule resource.
   * 
   * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def EventRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def EventTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.EventTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.EventTargetArgs.builder
    com.pulumi.aws.cloudwatch.EventTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Internet Monitor Monitor resource. */
  def InternetMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.InternetMonitorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogAccountPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogAccountPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogAccountPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogAccountPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Log Anomaly Detector. */
  def LogAnomalyDetector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogAnomalyDetectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogDataProtectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogDataProtectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery. A delivery is a connection between an `aws.cloudwatch.LogDeliverySource` and an `aws.cloudwatch.LogDeliveryDestination`. */
  def LogDelivery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogDeliveryDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryDestinationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogDeliveryDestinationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogDeliveryDestinationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Delivery Source. */
  def LogDeliverySource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDeliverySourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDestinationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogDestinationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogDestinationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Group resource. */
  def LogGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogIndexPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogIndexPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogIndexPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogIndexPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Metric Filter resource. */
  def LogMetricFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogMetricFilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogMetricFilterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.LogMetricFilter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage a CloudWatch log resource policy. */
  def LogResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def LogS3TableIntegrationSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogS3TableIntegrationSourceArgs.builder
    com.pulumi.aws.cloudwatch.LogS3TableIntegrationSource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a CloudWatch Logs account-level storage tier policy. When set to `INTELLIGENT_TIERING`, CloudWatch Logs automatically moves log data to the most cost-effective storage tier based on access frequency.
   * 
   * &gt; Deletion of this resource will reset the storage tier policy to `STANDARD` (the default state).
   */
  def LogStorageTierPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogStorageTierPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogStorageTierPolicyArgs.builder
    com.pulumi.aws.cloudwatch.LogStorageTierPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Log Stream resource. */
  def LogStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogStreamArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.LogStream(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Logs subscription filter resource. */
  def LogSubscriptionFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatch.LogSubscriptionFilterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatch.LogSubscriptionFilter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudWatch Logs Transformer. */
  def LogTransformer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.LogTransformerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.LogTransformerArgs.builder
    com.pulumi.aws.cloudwatch.LogTransformer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Metric Alarm resource. */
  def MetricAlarm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.MetricAlarmArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def MetricStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.MetricStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def OtelEnrichment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.OtelEnrichmentArgs.builder
    com.pulumi.aws.cloudwatch.OtelEnrichment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudWatch Logs query definition resource. */
  def QueryDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.QueryDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def ResourceMetricsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatch.ResourceMetricsConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudwatch.ResourceMetricsConfigurationArgs.builder
    com.pulumi.aws.cloudwatch.ResourceMetricsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
