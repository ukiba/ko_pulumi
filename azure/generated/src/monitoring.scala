package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object monitoring:
  /** Manages a Metric Alert within Azure Monitor. */
  def MetricAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.MetricAlertArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.MetricAlertArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.MetricAlert(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Monitor Private Link Scoped Service. */
  def PrivateLinkScopedService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.PrivateLinkScopedServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.PrivateLinkScopedServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.PrivateLinkScopedService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder]*):
        com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Alert Management Prometheus Rule Group. */
  def AlertPrometheusRuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.AlertPrometheusRuleGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AlertingAction Scheduled Query Rules resource within Azure Monitor.
   * 
   *  &gt; **Note:** This resource is using an older AzureRM API version which is known to cause problems e.g. with custom webhook properties not included in triggered alerts. This resource is superseded by the azure.monitoring.ScheduledQueryRulesAlertV2 resource using newer API versions.
   */
  def ScheduledQueryRulesAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.ScheduledQueryRulesAlert(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Data Collection Endpoint. */
  def DataCollectionEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DataCollectionEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DataCollectionEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.DataCollectionEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Activity Log Alert within Azure Monitor. */
  def ActivityLogAlert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ActivityLogAlertArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.ActivityLogAlert(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Action Group within Azure Monitor. */
  def ActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ActionGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ActionGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.ActionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Alert Processing Rule which apply action group. */
  def AlertProcessingRuleActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.AlertProcessingRuleActionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Diagnostic Setting for an existing Resource. */
  def DiagnosticSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DiagnosticSettingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.DiagnosticSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.MetricAlertArgs.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationInsightsWebTestLocationAvailabilityCriteria A `applicationInsightsWebTestLocationAvailabilityCriteria` block as defined below.
     * 
     *  &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    def applicationInsightsWebTestLocationAvailabilityCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.builder
      builder.applicationInsightsWebTestLocationAvailabilityCriteria(args(argsBuilder).build)

    /**
     * @param criterias One or more (static) `criteria` blocks as defined below.
     * 
     *  &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicCriteria A `dynamicCriteria` block as defined below.
     * 
     *  &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    def dynamicCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.builder
      builder.dynamicCriteria(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * @return builder
     */
    def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder)
    /**
     * @param notification Specifies a `notification` block as defined below.
     * @return builder
     */
    def notification(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder]):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.builder
      builder.notification(args(argsBuilder).build)

    /**
     * @param predictive A `predictive` block as defined below.
     * @return builder
     */
    def predictive(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.Builder]):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.builder
      builder.predictive(args(argsBuilder).build)

    /**
     * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
     * @return builder
     */
    def profiles(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder]*):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * 
     *  &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified. At least one type of Log or Metric must be enabled.
     * @return builder
     */
    def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param enabledMetrics One or more `enabledMetric` blocks as defined below.
     * 
     *  &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified.
     * @return builder
     */
    def enabledMetrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.builder
      builder.enabledMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated `metric` has been deprecated in favour of the `enabledMetric` property and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def metrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Data Collection Rule.
   * 
   *  ## Import
   * 
   *  Data Collection Rules can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:monitoring/dataCollectionRule:DataCollectionRule example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Insights/dataCollectionRules/rule1
   *  ```
   */
  def DataCollectionRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DataCollectionRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.DataCollectionRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Alert Processing Rule which suppress notifications. */
  def AlertProcessingRuleSuppression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.AlertProcessingRuleSuppression(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.ActionGroupArgs.Builder)
    /**
     * @param armRoleReceivers One or more `armRoleReceiver` blocks as defined below.
     * @return builder
     */
    def armRoleReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.builder
      builder.armRoleReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param automationRunbookReceivers One or more `automationRunbookReceiver` blocks as defined below.
     * @return builder
     */
    def automationRunbookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.builder
      builder.automationRunbookReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureAppPushReceivers One or more `azureAppPushReceiver` blocks as defined below.
     * @return builder
     */
    def azureAppPushReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.builder
      builder.azureAppPushReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureFunctionReceivers One or more `azureFunctionReceiver` blocks as defined below.
     * @return builder
     */
    def azureFunctionReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.builder
      builder.azureFunctionReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param emailReceivers One or more `emailReceiver` blocks as defined below.
     * @return builder
     */
    def emailReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.builder
      builder.emailReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventHubReceivers One or more `eventHubReceiver` blocks as defined below.
     * @return builder
     */
    def eventHubReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.builder
      builder.eventHubReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param itsmReceivers One or more `itsmReceiver` blocks as defined below.
     * @return builder
     */
    def itsmReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.builder
      builder.itsmReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param logicAppReceivers One or more `logicAppReceiver` blocks as defined below.
     * @return builder
     */
    def logicAppReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.builder
      builder.logicAppReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param smsReceivers One or more `smsReceiver` blocks as defined below.
     * @return builder
     */
    def smsReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.builder
      builder.smsReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param voiceReceivers One or more `voiceReceiver` blocks as defined below.
     * @return builder
     */
    def voiceReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.builder
      builder.voiceReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param webhookReceivers One or more `webhookReceiver` blocks as defined below.
     * @return builder
     */
    def webhookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.builder
      builder.webhookReceivers(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Data Collection Rule Association. */
  def DataCollectionRuleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.DataCollectionRuleAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.DataCollectionRuleAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.DataCollectionRuleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Monitor Private Link Scope. */
  def PrivateLinkScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.PrivateLinkScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.PrivateLinkScopeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.PrivateLinkScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param criterias A `criteria` block as defined below.
     * @return builder
     */
    def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type MonitoringFunctions = com.pulumi.azure.monitoring.MonitoringFunctions
  object MonitoringFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.monitoring.MonitoringFunctions.*
  extension (self: MonitoringFunctions.type)
    /** Use this data source to access the properties of an Action Group. */
    def getActionGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetActionGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetActionGroupResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetActionGroupArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getActionGroup(args(argsBuilder).build)

    /** Use this data source to access the properties of an Action Group. */
    def getActionGroupPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetActionGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetActionGroupResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetActionGroupPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getActionGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Endpoint. */
    def getDataCollectionEndpoint(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetDataCollectionEndpointResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionEndpoint(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Endpoint. */
    def getDataCollectionEndpointPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetDataCollectionEndpointResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionEndpointPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionEndpointPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Rule. */
    def getDataCollectionRule(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetDataCollectionRuleResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionRuleArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Data Collection Rule. */
    def getDataCollectionRulePlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDataCollectionRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetDataCollectionRuleResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDataCollectionRulePlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDataCollectionRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about the Monitor Diagnostics Categories supported by an existing Resource. */
    def getDiagnosticCategories(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetDiagnosticCategoriesResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDiagnosticCategories(args(argsBuilder).build)

    /** Use this data source to access information about the Monitor Diagnostics Categories supported by an existing Resource. */
    def getDiagnosticCategoriesPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetDiagnosticCategoriesResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetDiagnosticCategoriesPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getDiagnosticCategoriesPlain(args(argsBuilder).build)

    /** Use this data source to access the properties of an AlertingAction scheduled query rule. */
    def getScheduledQueryRulesAlert(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesAlertResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesAlert(args(argsBuilder).build)

    /** Use this data source to access the properties of an AlertingAction scheduled query rule. */
    def getScheduledQueryRulesAlertPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesAlertResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesAlertPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesAlertPlain(args(argsBuilder).build)

    /** Use this data source to access the properties of a LogToMetricAction scheduled query rule. */
    def getScheduledQueryRulesLog(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesLogResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesLog(args(argsBuilder).build)

    /** Use this data source to access the properties of a LogToMetricAction scheduled query rule. */
    def getScheduledQueryRulesLogPlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetScheduledQueryRulesLogResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetScheduledQueryRulesLogPlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getScheduledQueryRulesLogPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Workspace. */
    def getWorkspace(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.monitoring.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Workspace. */
    def getWorkspacePlain(args: Endofunction[com.pulumi.azure.monitoring.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.monitoring.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.monitoring.MonitoringFunctions.getWorkspacePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder)
    /**
     * @param dataFlows One or more `dataFlow` blocks as defined below.
     * @return builder
     */
    def dataFlows(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.Builder]*):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.builder
      builder.dataFlows(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSources A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * @return builder
     */
    def dataSources(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.builder
      builder.dataSources(args(argsBuilder).build)

    /**
     * @param destinations A `destinations` block as defined below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.builder
      builder.destinations(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.Builder]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param streamDeclarations A `streamDeclaration` block as defined below.
     * @return builder
     */
    def streamDeclarations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder]*):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.builder
      builder.streamDeclarations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Monitor Workspace. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Monitor Smart Detector Alert Rule. */
  def SmartDetectorAlertRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.SmartDetectorAlertRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder)
    /**
     * @param actionGroup An `actionGroup` block as defined below.
     * @return builder
     */
    def actionGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.Builder]):
        com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.builder
      builder.actionGroup(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an Azure Active Directory Diagnostic Setting for Azure Monitor.
   * 
   *  &gt; **Note:** When using Service Principal authentication, the Service Principal must be assigned the _Contributor_ role at the scope `/providers/Microsoft.aadiam`. You can assign this role using the `az` CLI command: `az role assignment create --assignee-principal-type ServicePrincipal --assignee-object-id &#34;&lt;sp-object-id&gt;&#34; --scope &#34;/providers/Microsoft.aadiam&#34; --role &#34;Contributor&#34;`. The assigning user must be a User Access Administrator at the root level. Refer to the [Azure elevation guide](https://learn.microsoft.com/en-us/azure/role-based-access-control/elevate-access-global-admin) for details.
   */
  def AadDiagnosticSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.monitoring.AadDiagnosticSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AlertingAction Scheduled Query Rules Version 2 resource within Azure Monitor */
  def ScheduledQueryRulesAlertV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder)
    /**
     * @param columns One or more `column` blocks as defined above.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationColumnArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogState.Builder)
    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * 
     *  &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified. At least one type of Log or Metric must be enabled.
     * @return builder
     */
    def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param enabledMetrics One or more `enabledMetric` blocks as defined below.
     * 
     *  &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified.
     * @return builder
     */
    def enabledMetrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.builder
      builder.enabledMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated `metric` has been deprecated in favour of the `enabledMetric` property and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated def metrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as defined above.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationInsightsWebTestLocationAvailabilityCriteria A `applicationInsightsWebTestLocationAvailabilityCriteria` block as defined below.
     * 
     *  &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    def applicationInsightsWebTestLocationAvailabilityCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.builder
      builder.applicationInsightsWebTestLocationAvailabilityCriteria(args(argsBuilder).build)

    /**
     * @param criterias One or more (static) `criteria` blocks as defined below.
     * 
     *  &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicCriteria A `dynamicCriteria` block as defined below.
     * 
     *  &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    def dynamicCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.builder
      builder.dynamicCriteria(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder)
    /**
     * @param notification Specifies a `notification` block as defined below.
     * @return builder
     */
    def notification(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.builder
      builder.notification(args(argsBuilder).build)

    /**
     * @param predictive A `predictive` block as defined below.
     * @return builder
     */
    def predictive(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.builder
      builder.predictive(args(argsBuilder).build)

    /**
     * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
     * @return builder
     */
    def profiles(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder)
    /**
     * @param dataFlows One or more `dataFlow` blocks as defined below.
     * @return builder
     */
    def dataFlows(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.builder
      builder.dataFlows(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSources A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * @return builder
     */
    def dataSources(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.builder
      builder.dataSources(args(argsBuilder).build)

    /**
     * @param destinations A `destinations` block as defined below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.builder
      builder.destinations(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param streamDeclarations A `streamDeclaration` block as defined below.
     * @return builder
     */
    def streamDeclarations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.builder
      builder.streamDeclarations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder)
    /**
     * @param dataImport A `dataImport` block as defined above.
     * @return builder
     */
    def dataImport(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.builder
      builder.dataImport(args(argsBuilder).build)

    /**
     * @param extensions One or more `extension` blocks as defined below.
     * @return builder
     */
    def extensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesExtensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param iisLogs One or more `iisLog` blocks as defined below.
     * @return builder
     */
    def iisLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesIisLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesIisLogArgs.builder
      builder.iisLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param logFiles One or more `logFile` blocks as defined below.
     * @return builder
     */
    def logFiles(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.builder
      builder.logFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceCounters One or more `performanceCounter` blocks as defined below.
     * @return builder
     */
    def performanceCounters(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs.builder
      builder.performanceCounters(args.map(_(argsBuilder).build)*)

    /**
     * @param platformTelemetries One or more `platformTelemetry` blocks as defined below.
     * @return builder
     */
    def platformTelemetries(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPlatformTelemetryArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPlatformTelemetryArgs.builder
      builder.platformTelemetries(args.map(_(argsBuilder).build)*)

    /**
     * @param prometheusForwarders One or more `prometheusForwarder` blocks as defined below.
     * @return builder
     */
    def prometheusForwarders(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.builder
      builder.prometheusForwarders(args.map(_(argsBuilder).build)*)

    /**
     * @param syslogs One or more `syslog` blocks as defined below.
     * @return builder
     */
    def syslogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesSyslogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesSyslogArgs.builder
      builder.syslogs(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsEventLogs One or more `windowsEventLog` blocks as defined below.
     * @return builder
     */
    def windowsEventLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs.builder
      builder.windowsEventLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsFirewallLogs One or more `windowsFirewallLog` blocks as defined below.
     * @return builder
     */
    def windowsFirewallLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsFirewallLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsFirewallLogArgs.builder
      builder.windowsFirewallLogs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.Builder)
    /**
     * @param eventHubDataSources An `eventHubDataSource` block as defined below.
     * @return builder
     */
    def eventHubDataSources(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs.builder
      builder.eventHubDataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder)
    /**
     * @param actions An `action` block as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleActionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param alertResolution An `alertResolution` block as defined below.
     * @return builder
     */
    def alertResolution(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleAlertResolutionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleAlertResolutionArgs.builder
      builder.alertResolution(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder)
    /**
     * @param resourceHealth A block to define fine grain resource health settings.
     * @return builder
     */
    def resourceHealth(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaResourceHealthArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaResourceHealthArgs.builder
      builder.resourceHealth(args(argsBuilder).build)

    /**
     * @param serviceHealth A block to define fine grain service health settings.
     * @return builder
     */
    def serviceHealth(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaServiceHealthArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaServiceHealthArgs.builder
      builder.serviceHealth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder)
    /**
     * @param armRoleReceivers One or more `armRoleReceiver` blocks as defined below.
     * @return builder
     */
    def armRoleReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.builder
      builder.armRoleReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param automationRunbookReceivers One or more `automationRunbookReceiver` blocks as defined below.
     * @return builder
     */
    def automationRunbookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.builder
      builder.automationRunbookReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureAppPushReceivers One or more `azureAppPushReceiver` blocks as defined below.
     * @return builder
     */
    def azureAppPushReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.builder
      builder.azureAppPushReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureFunctionReceivers One or more `azureFunctionReceiver` blocks as defined below.
     * @return builder
     */
    def azureFunctionReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.builder
      builder.azureFunctionReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param emailReceivers One or more `emailReceiver` blocks as defined below.
     * @return builder
     */
    def emailReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.builder
      builder.emailReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventHubReceivers One or more `eventHubReceiver` blocks as defined below.
     * @return builder
     */
    def eventHubReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.builder
      builder.eventHubReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param itsmReceivers One or more `itsmReceiver` blocks as defined below.
     * @return builder
     */
    def itsmReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.builder
      builder.itsmReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param logicAppReceivers One or more `logicAppReceiver` blocks as defined below.
     * @return builder
     */
    def logicAppReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.builder
      builder.logicAppReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param smsReceivers One or more `smsReceiver` blocks as defined below.
     * @return builder
     */
    def smsReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.builder
      builder.smsReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param voiceReceivers One or more `voiceReceiver` blocks as defined below.
     * @return builder
     */
    def voiceReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.builder
      builder.voiceReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param webhookReceivers One or more `webhookReceiver` blocks as defined below.
     * @return builder
     */
    def webhookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.builder
      builder.webhookReceivers(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleState.Builder)
    /**
     * @param actionGroup An `actionGroup` block as defined below.
     * @return builder
     */
    def actionGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.builder
      builder.actionGroup(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder)
    /**
     * @param dailies One or more `daily` blocks as defined above.
     * @return builder
     */
    def dailies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs.builder
      builder.dailies(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlies One or more `monthly` blocks as defined above.
     * @return builder
     */
    def monthlies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklies One or more `weekly` blocks as defined below.
     * @return builder
     */
    def weeklies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs.builder
      builder.weeklies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder)
    /**
     * @return builder
     * @deprecated `retentionPolicy` has been deprecated in favour of `azure.storage.ManagementPolicy` resource and will be removed in v5.0 of the AzureRM provider - to learn more https://aka.ms/diagnostic_settings_log_retention
     */
    @deprecated def retentionPolicy(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder)
    /**
     * @param alertContext A `alertContext` block as defined above.
     * @return builder
     */
    def alertContext(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertContextArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertContextArgs.builder
      builder.alertContext(args(argsBuilder).build)

    /**
     * @param alertRuleId A `alertRuleId` block as defined above.
     * @return builder
     */
    def alertRuleId(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleIdArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleIdArgs.builder
      builder.alertRuleId(args(argsBuilder).build)

    /**
     * @param alertRuleName A `alertRuleName` block as defined above.
     * @return builder
     */
    def alertRuleName(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleNameArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleNameArgs.builder
      builder.alertRuleName(args(argsBuilder).build)

    /**
     * @param description A `description` block as defined below.
     * @return builder
     */
    def description(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionDescriptionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionDescriptionArgs.builder
      builder.description(args(argsBuilder).build)

    /**
     * @param monitorCondition A `monitorCondition` block as defined below.
     * @return builder
     */
    def monitorCondition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorConditionArgs.builder
      builder.monitorCondition(args(argsBuilder).build)

    /**
     * @param monitorService A `monitorService` block as defined below.
     * @return builder
     */
    def monitorService(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorServiceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorServiceArgs.builder
      builder.monitorService(args(argsBuilder).build)

    /**
     * @param severity A `severity` block as defined below.
     * @return builder
     */
    def severity(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSeverityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSeverityArgs.builder
      builder.severity(args(argsBuilder).build)

    /**
     * @param signalType A `signalType` block as defined below.
     * @return builder
     */
    def signalType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSignalTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSignalTypeArgs.builder
      builder.signalType(args(argsBuilder).build)

    /**
     * @param targetResource A `targetResource` block as defined below.
     * @return builder
     */
    def targetResource(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceArgs.builder
      builder.targetResource(args(argsBuilder).build)

    /**
     * @param targetResourceGroup A `targetResourceGroup` block as defined below.
     * @return builder
     */
    def targetResourceGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceGroupArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceGroupArgs.builder
      builder.targetResourceGroup(args(argsBuilder).build)

    /**
     * @param targetResourceType A `targetResourceType` block as defined below.
     * @return builder
     */
    def targetResourceType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceTypeArgs.builder
      builder.targetResourceType(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.Builder)
    /**
     * @param dimensions One or more `dimensions` block as defined below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder)
    /**
     * @param dimensions A `dimension` block as defined below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder)
    /**
     * @param alertContext A `alertContext` block as defined above.
     * @return builder
     */
    def alertContext(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertContextArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertContextArgs.builder
      builder.alertContext(args(argsBuilder).build)

    /**
     * @param alertRuleId A `alertRuleId` block as defined above.
     * @return builder
     */
    def alertRuleId(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleIdArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleIdArgs.builder
      builder.alertRuleId(args(argsBuilder).build)

    /**
     * @param alertRuleName A `alertRuleName` block as defined above.
     * @return builder
     */
    def alertRuleName(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleNameArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleNameArgs.builder
      builder.alertRuleName(args(argsBuilder).build)

    /**
     * @param description A `description` block as defined below.
     * @return builder
     */
    def description(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionDescriptionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionDescriptionArgs.builder
      builder.description(args(argsBuilder).build)

    /**
     * @param monitorCondition A `monitorCondition` block as defined below.
     * @return builder
     */
    def monitorCondition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorConditionArgs.builder
      builder.monitorCondition(args(argsBuilder).build)

    /**
     * @param monitorService A `monitorService` block as defined below.
     * @return builder
     */
    def monitorService(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorServiceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorServiceArgs.builder
      builder.monitorService(args(argsBuilder).build)

    /**
     * @param severity A `severity` block as defined below.
     * @return builder
     */
    def severity(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSeverityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSeverityArgs.builder
      builder.severity(args(argsBuilder).build)

    /**
     * @param signalType A `signalType` block as defined below.
     * @return builder
     */
    def signalType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSignalTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSignalTypeArgs.builder
      builder.signalType(args(argsBuilder).build)

    /**
     * @param targetResource A `targetResource` block as defined below.
     * @return builder
     */
    def targetResource(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceArgs.builder
      builder.targetResource(args(argsBuilder).build)

    /**
     * @param targetResourceGroup A `targetResourceGroup` block as defined below.
     * @return builder
     */
    def targetResourceGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs.builder
      builder.targetResourceGroup(args(argsBuilder).build)

    /**
     * @param targetResourceType A `targetResourceType` block as defined below.
     * 
     *  &gt; **Note:** At least one of the `alertContext`, `alertRuleId`, `alertRuleName`, `description`, `monitorCondition`, `monitorService`, `severity`, `signalType`, `targetResource`, `targetResourceGroup`, `targetResourceType` must be specified.
     * @return builder
     */
    def targetResourceType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs.builder
      builder.targetResourceType(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder)
    /**
     * @param dailies One or more `daily` blocks as defined above.
     * @return builder
     */
    def dailies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceDailyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceDailyArgs.builder
      builder.dailies(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlies One or more `monthly` blocks as defined above.
     * @return builder
     */
    def monthlies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklies One or more `weekly` blocks as defined below.
     * @return builder
     */
    def weeklies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceWeeklyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceWeeklyArgs.builder
      builder.weeklies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder)
    /**
     * @param email A `email` block as defined below.
     * @return builder
     */
    def email(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationEmailArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationEmailArgs.builder
      builder.email(args(argsBuilder).build)

    /**
     * @param webhooks One or more `webhook` blocks as defined below.
     * @return builder
     */
    def webhooks(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationWebhookArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationWebhookArgs.builder
      builder.webhooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder)
    /**
     * @param metricTrigger A `metricTrigger` block as defined below.
     * @return builder
     */
    def metricTrigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.builder
      builder.metricTrigger(args(argsBuilder).build)

    /**
     * @param scaleAction A `scaleAction` block as defined below.
     * @return builder
     */
    def scaleAction(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleScaleActionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleScaleActionArgs.builder
      builder.scaleAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingState.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * @return builder
     */
    def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.Builder)
    /**
     * @param text A `text` block as defined below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsTextArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder)
    /**
     * @param metricTrigger A `metricTrigger` block as defined above. Trigger condition for metric query rule.
     * @return builder
     */
    def metricTrigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerMetricTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerMetricTriggerArgs.builder
      builder.metricTrigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder)
    /**
     * @param dimensions A `dimension` block as defined below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param failingPeriods A `failingPeriods` block as defined below.
     * @return builder
     */
    def failingPeriods(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaFailingPeriodsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaFailingPeriodsArgs.builder
      builder.failingPeriods(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.Builder)
    /**
     * @param settings A `settings` block as defined below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.Builder)
    /**
     * @param labelIncludeFilters One or more `labelIncludeFilter` blocks as defined above.
     * @return builder
     */
    def labelIncludeFilters(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs.builder
      builder.labelIncludeFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder)
    /**
     * @param aadAuth The `aadAuth` block as defined below.
     * 
     *  &gt; **Note:** Before adding a secure webhook receiver by setting `aadAuth`, please read [the configuration instruction of the AAD application](https://docs.microsoft.com/azure/azure-monitor/platform/action-groups#secure-webhook).
     * @return builder
     */
    def aadAuth(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverAadAuthArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverAadAuthArgs.builder
      builder.aadAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as defined above.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder)
    /**
     * @return builder
     * @deprecated `retentionPolicy` has been deprecated in favour of the `azure.storage.ManagementPolicy` resource and will be removed in v5.0 of the AzureRM provider - to learn more go to https://aka.ms/diagnostic_settings_log_retention
     */
    @deprecated def retentionPolicy(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricRetentionPolicyArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param criterias A `criteria` block as defined below.
     * @return builder
     */
    def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder)
    /**
     * @param capacity A `capacity` block as defined below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileCapacityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param fixedDate A `fixedDate` block as defined below. This cannot be specified if a `recurrence` block is specified.
     * @return builder
     */
    def fixedDate(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileFixedDateArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileFixedDateArgs.builder
      builder.fixedDate(args(argsBuilder).build)

    /**
     * @param recurrence A `recurrence` block as defined below. This cannot be specified if a `fixedDate` block is specified.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRecurrenceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

    /**
     * @param rules One or more (up to 10) `rule` blocks as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder)
    /**
     * @param azureMonitorMetrics A `azureMonitorMetrics` block as defined above.
     * @return builder
     */
    def azureMonitorMetrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsAzureMonitorMetricsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsAzureMonitorMetricsArgs.builder
      builder.azureMonitorMetrics(args(argsBuilder).build)

    /**
     * @param eventHub One or more `eventHub` blocks as defined below.
     * @return builder
     */
    def eventHub(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubArgs.builder
      builder.eventHub(args(argsBuilder).build)

    /**
     * @param eventHubDirect One or more `eventHub` blocks as defined below.
     * @return builder
     */
    def eventHubDirect(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubDirectArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubDirectArgs.builder
      builder.eventHubDirect(args(argsBuilder).build)

    /**
     * @param logAnalytics One or more `logAnalytics` blocks as defined below.
     * @return builder
     */
    def logAnalytics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsLogAnalyticArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsLogAnalyticArgs.builder
      builder.logAnalytics(args.map(_(argsBuilder).build)*)

    /**
     * @param monitorAccounts One or more `monitorAccount` blocks as defined below.
     * @return builder
     */
    def monitorAccounts(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsMonitorAccountArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsMonitorAccountArgs.builder
      builder.monitorAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param storageBlobDirects One or more `storageBlobDirect` blocks as defined below.
     * @return builder
     */
    def storageBlobDirects(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobDirectArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobDirectArgs.builder
      builder.storageBlobDirects(args.map(_(argsBuilder).build)*)

    /**
     * @param storageBlobs One or more `storageBlob` blocks as defined below.
     * @return builder
     */
    def storageBlobs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobArgs.builder
      builder.storageBlobs(args.map(_(argsBuilder).build)*)

    /**
     * @param storageTableDirects One or more `storageTableDirect` blocks as defined below.
     * 
     *  &gt; **Note:** `eventHubDirect`, `storageBlobDirect`, and `storageTableDirect` are only available for rules of kind `AgentDirectToStore`.
     * 
     *  &gt; **Note:** At least one of `azureMonitorMetrics`, `eventHub`, `eventHubDirect`, `logAnalytics`, `monitorAccount`, `storageBlob`, `storageBlobDirect`,and `storageTableDirect` blocks must be specified.
     * @return builder
     */
    def storageTableDirects(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageTableDirectArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageTableDirectArgs.builder
      builder.storageTableDirects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder)
    /**
     * @return builder
     * @deprecated Azure does not support retention for new Azure Active Directory Diagnostic Settings
     */
    @deprecated def retentionPolicy(args: Endofunction[com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a LogToMetricAction Scheduled Query Rules resource within Azure Monitor. */
  def ScheduledQueryRulesLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.ScheduledQueryRulesLog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a AutoScale Setting which can be applied to Virtual Machine Scale Sets, App Services and other scalable resources. */
  def AutoscaleSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.monitoring.AutoscaleSettingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.monitoring.AutoscaleSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
