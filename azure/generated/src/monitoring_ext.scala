package jp.ukiba.ko_pulumi
package azure

object monitoring_ext:
  extension (builder: com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * @return builder
     */
    inline def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.AadDiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.ActionGroupArgs.Builder)
    /**
     * @param armRoleReceivers One or more `armRoleReceiver` blocks as defined below.
     * @return builder
     */
    inline def armRoleReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.builder
      builder.armRoleReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param automationRunbookReceivers One or more `automationRunbookReceiver` blocks as defined below.
     * @return builder
     */
    inline def automationRunbookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.builder
      builder.automationRunbookReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureAppPushReceivers One or more `azureAppPushReceiver` blocks as defined below.
     * @return builder
     */
    inline def azureAppPushReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.builder
      builder.azureAppPushReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureFunctionReceivers One or more `azureFunctionReceiver` blocks as defined below.
     * @return builder
     */
    inline def azureFunctionReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.builder
      builder.azureFunctionReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param emailReceivers One or more `emailReceiver` blocks as defined below.
     * @return builder
     */
    inline def emailReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.builder
      builder.emailReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventHubReceivers One or more `eventHubReceiver` blocks as defined below.
     * @return builder
     */
    inline def eventHubReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.builder
      builder.eventHubReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param itsmReceivers One or more `itsmReceiver` blocks as defined below.
     * @return builder
     */
    inline def itsmReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.builder
      builder.itsmReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param logicAppReceivers One or more `logicAppReceiver` blocks as defined below.
     * @return builder
     */
    inline def logicAppReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.builder
      builder.logicAppReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param smsReceivers One or more `smsReceiver` blocks as defined below.
     * @return builder
     */
    inline def smsReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.builder
      builder.smsReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param voiceReceivers One or more `voiceReceiver` blocks as defined below.
     * @return builder
     */
    inline def voiceReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.builder
      builder.voiceReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param webhookReceivers One or more `webhookReceiver` blocks as defined below.
     * @return builder
     */
    inline def webhookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.ActionGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.builder
      builder.webhookReceivers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.ActivityLogAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.AlertProcessingRuleSuppressionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder]*):
        com.pulumi.azure.monitoring.AlertPrometheusRuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder)
    /**
     * @param notification Specifies a `notification` block as defined below.
     * @return builder
     */
    inline def notification(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder]):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.builder
      builder.notification(args(argsBuilder).build)

    /**
     * @param predictive A `predictive` block as defined below.
     * @return builder
     */
    inline def predictive(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.Builder]):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.builder
      builder.predictive(args(argsBuilder).build)

    /**
     * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
     * @return builder
     */
    inline def profiles(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder]*):
        com.pulumi.azure.monitoring.AutoscaleSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder)
    /**
     * @param dataFlows One or more `dataFlow` blocks as defined below.
     * @return builder
     */
    inline def dataFlows(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.Builder]*):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.builder
      builder.dataFlows(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSources A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * @return builder
     */
    inline def dataSources(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.builder
      builder.dataSources(args(argsBuilder).build)

    /**
     * @param destinations A `destinations` block as defined below.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.builder
      builder.destinations(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.Builder]):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param streamDeclarations A `streamDeclaration` block as defined below.
     * @return builder
     */
    inline def streamDeclarations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder]*):
        com.pulumi.azure.monitoring.DataCollectionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.builder
      builder.streamDeclarations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * 
     * &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified. At least one type of Log or Metric must be enabled.
     * @return builder
     */
    inline def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param enabledMetrics One or more `enabledMetric` blocks as defined below.
     * 
     * &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified.
     * @return builder
     */
    inline def enabledMetrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.builder
      builder.enabledMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated `metric` has been deprecated in favour of the `enabledMetric` property and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated("`metric` has been deprecated in favour of the `enabledMetric` property and will be removed in v5.0 of the AzureRM provider") inline def metrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.DiagnosticSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.MetricAlertArgs.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationInsightsWebTestLocationAvailabilityCriteria A `applicationInsightsWebTestLocationAvailabilityCriteria` block as defined below.
     * 
     * &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    inline def applicationInsightsWebTestLocationAvailabilityCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.builder
      builder.applicationInsightsWebTestLocationAvailabilityCriteria(args(argsBuilder).build)

    /**
     * @param criterias One or more (static) `criteria` blocks as defined below.
     * 
     * &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    inline def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicCriteria A `dynamicCriteria` block as defined below.
     * 
     * &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    inline def dynamicCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.MetricAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.builder
      builder.dynamicCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param criterias A `criteria` block as defined below.
     * @return builder
     */
    inline def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesAlertV2Args.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.ScheduledQueryRulesLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder)
    /**
     * @param actionGroup An `actionGroup` block as defined below.
     * @return builder
     */
    inline def actionGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.Builder]):
        com.pulumi.azure.monitoring.SmartDetectorAlertRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.builder
      builder.actionGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder)
    /**
     * @return builder
     * @deprecated Azure does not support retention for new Azure Active Directory Diagnostic Settings
     */
    @deprecated("Azure does not support retention for new Azure Active Directory Diagnostic Settings") inline def retentionPolicy(args: Endofunction[com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingState.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * @return builder
     */
    inline def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder)
    /**
     * @param armRoleReceivers One or more `armRoleReceiver` blocks as defined below.
     * @return builder
     */
    inline def armRoleReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupArmRoleReceiverArgs.builder
      builder.armRoleReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param automationRunbookReceivers One or more `automationRunbookReceiver` blocks as defined below.
     * @return builder
     */
    inline def automationRunbookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAutomationRunbookReceiverArgs.builder
      builder.automationRunbookReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureAppPushReceivers One or more `azureAppPushReceiver` blocks as defined below.
     * @return builder
     */
    inline def azureAppPushReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureAppPushReceiverArgs.builder
      builder.azureAppPushReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param azureFunctionReceivers One or more `azureFunctionReceiver` blocks as defined below.
     * @return builder
     */
    inline def azureFunctionReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupAzureFunctionReceiverArgs.builder
      builder.azureFunctionReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param emailReceivers One or more `emailReceiver` blocks as defined below.
     * @return builder
     */
    inline def emailReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEmailReceiverArgs.builder
      builder.emailReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param eventHubReceivers One or more `eventHubReceiver` blocks as defined below.
     * @return builder
     */
    inline def eventHubReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupEventHubReceiverArgs.builder
      builder.eventHubReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param itsmReceivers One or more `itsmReceiver` blocks as defined below.
     * @return builder
     */
    inline def itsmReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupItsmReceiverArgs.builder
      builder.itsmReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param logicAppReceivers One or more `logicAppReceiver` blocks as defined below.
     * @return builder
     */
    inline def logicAppReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupLogicAppReceiverArgs.builder
      builder.logicAppReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param smsReceivers One or more `smsReceiver` blocks as defined below.
     * @return builder
     */
    inline def smsReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupSmsReceiverArgs.builder
      builder.smsReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param voiceReceivers One or more `voiceReceiver` blocks as defined below.
     * @return builder
     */
    inline def voiceReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupVoiceReceiverArgs.builder
      builder.voiceReceivers(args.map(_(argsBuilder).build)*)

    /**
     * @param webhookReceivers One or more `webhookReceiver` blocks as defined below.
     * @return builder
     */
    inline def webhookReceivers(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActionGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.builder
      builder.webhookReceivers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder)
    /**
     * @param aadAuth The `aadAuth` block as defined below.
     * 
     * &gt; **Note:** Before adding a secure webhook receiver by setting `aadAuth`, please read [the configuration instruction of the AAD application](https://docs.microsoft.com/azure/azure-monitor/platform/action-groups#secure-webhook).
     * @return builder
     */
    inline def aadAuth(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverAadAuthArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActionGroupWebhookReceiverAadAuthArgs.builder
      builder.aadAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder)
    /**
     * @param resourceHealth A block to define fine grain resource health settings.
     * @return builder
     */
    inline def resourceHealth(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaResourceHealthArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaResourceHealthArgs.builder
      builder.resourceHealth(args(argsBuilder).build)

    /**
     * @param serviceHealth A block to define fine grain service health settings.
     * @return builder
     */
    inline def serviceHealth(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaServiceHealthArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaServiceHealthArgs.builder
      builder.serviceHealth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ActivityLogAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder)
    /**
     * @param alertContext A `alertContext` block as defined above.
     * @return builder
     */
    inline def alertContext(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertContextArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertContextArgs.builder
      builder.alertContext(args(argsBuilder).build)

    /**
     * @param alertRuleId A `alertRuleId` block as defined above.
     * @return builder
     */
    inline def alertRuleId(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleIdArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleIdArgs.builder
      builder.alertRuleId(args(argsBuilder).build)

    /**
     * @param alertRuleName A `alertRuleName` block as defined above.
     * @return builder
     */
    inline def alertRuleName(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleNameArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionAlertRuleNameArgs.builder
      builder.alertRuleName(args(argsBuilder).build)

    /**
     * @param description A `description` block as defined below.
     * @return builder
     */
    inline def description(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionDescriptionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionDescriptionArgs.builder
      builder.description(args(argsBuilder).build)

    /**
     * @param monitorCondition A `monitorCondition` block as defined below.
     * @return builder
     */
    inline def monitorCondition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorConditionArgs.builder
      builder.monitorCondition(args(argsBuilder).build)

    /**
     * @param monitorService A `monitorService` block as defined below.
     * @return builder
     */
    inline def monitorService(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorServiceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionMonitorServiceArgs.builder
      builder.monitorService(args(argsBuilder).build)

    /**
     * @param severity A `severity` block as defined below.
     * @return builder
     */
    inline def severity(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSeverityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSeverityArgs.builder
      builder.severity(args(argsBuilder).build)

    /**
     * @param signalType A `signalType` block as defined below.
     * @return builder
     */
    inline def signalType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSignalTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionSignalTypeArgs.builder
      builder.signalType(args(argsBuilder).build)

    /**
     * @param targetResource A `targetResource` block as defined below.
     * @return builder
     */
    inline def targetResource(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceArgs.builder
      builder.targetResource(args(argsBuilder).build)

    /**
     * @param targetResourceGroup A `targetResourceGroup` block as defined below.
     * @return builder
     */
    inline def targetResourceGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceGroupArgs.builder
      builder.targetResourceGroup(args(argsBuilder).build)

    /**
     * @param targetResourceType A `targetResourceType` block as defined below.
     * 
     * &gt; **Note:** At least one of the `alertContext`, `alertRuleId`, `alertRuleName`, `description`, `monitorCondition`, `monitorService`, `severity`, `signalType`, `targetResource`, `targetResourceGroup`, `targetResourceType` must be specified.
     * @return builder
     */
    inline def targetResourceType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionTargetResourceTypeArgs.builder
      builder.targetResourceType(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as defined above.
     * @return builder
     */
    inline def recurrence(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder)
    /**
     * @param dailies One or more `daily` blocks as defined above.
     * @return builder
     */
    inline def dailies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceDailyArgs.builder
      builder.dailies(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlies One or more `monthly` blocks as defined above.
     * @return builder
     */
    inline def monthlies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklies One or more `weekly` blocks as defined below.
     * @return builder
     */
    inline def weeklies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleRecurrenceWeeklyArgs.builder
      builder.weeklies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleActionGroupScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder)
    /**
     * @param alertContext A `alertContext` block as defined above.
     * @return builder
     */
    inline def alertContext(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertContextArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertContextArgs.builder
      builder.alertContext(args(argsBuilder).build)

    /**
     * @param alertRuleId A `alertRuleId` block as defined above.
     * @return builder
     */
    inline def alertRuleId(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleIdArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleIdArgs.builder
      builder.alertRuleId(args(argsBuilder).build)

    /**
     * @param alertRuleName A `alertRuleName` block as defined above.
     * @return builder
     */
    inline def alertRuleName(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleNameArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionAlertRuleNameArgs.builder
      builder.alertRuleName(args(argsBuilder).build)

    /**
     * @param description A `description` block as defined below.
     * @return builder
     */
    inline def description(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionDescriptionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionDescriptionArgs.builder
      builder.description(args(argsBuilder).build)

    /**
     * @param monitorCondition A `monitorCondition` block as defined below.
     * @return builder
     */
    inline def monitorCondition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorConditionArgs.builder
      builder.monitorCondition(args(argsBuilder).build)

    /**
     * @param monitorService A `monitorService` block as defined below.
     * @return builder
     */
    inline def monitorService(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorServiceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionMonitorServiceArgs.builder
      builder.monitorService(args(argsBuilder).build)

    /**
     * @param severity A `severity` block as defined below.
     * @return builder
     */
    inline def severity(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSeverityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSeverityArgs.builder
      builder.severity(args(argsBuilder).build)

    /**
     * @param signalType A `signalType` block as defined below.
     * @return builder
     */
    inline def signalType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSignalTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionSignalTypeArgs.builder
      builder.signalType(args(argsBuilder).build)

    /**
     * @param targetResource A `targetResource` block as defined below.
     * @return builder
     */
    inline def targetResource(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceArgs.builder
      builder.targetResource(args(argsBuilder).build)

    /**
     * @param targetResourceGroup A `targetResourceGroup` block as defined below.
     * @return builder
     */
    inline def targetResourceGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceGroupArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceGroupArgs.builder
      builder.targetResourceGroup(args(argsBuilder).build)

    /**
     * @param targetResourceType A `targetResourceType` block as defined below.
     * @return builder
     */
    inline def targetResourceType(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceTypeArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionTargetResourceTypeArgs.builder
      builder.targetResourceType(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as defined above.
     * @return builder
     */
    inline def recurrence(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder)
    /**
     * @param dailies One or more `daily` blocks as defined above.
     * @return builder
     */
    inline def dailies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceDailyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceDailyArgs.builder
      builder.dailies(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlies One or more `monthly` blocks as defined above.
     * @return builder
     */
    inline def monthlies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceMonthlyArgs.builder
      builder.monthlies(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklies One or more `weekly` blocks as defined below.
     * @return builder
     */
    inline def weeklies(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceWeeklyArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleRecurrenceWeeklyArgs.builder
      builder.weeklies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder)
    /**
     * @param condition A `condition` block as defined below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` block as defined below.
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertProcessingRuleSuppressionScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder)
    /**
     * @param actions An `action` block as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleActionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param alertResolution An `alertResolution` block as defined below.
     * @return builder
     */
    inline def alertResolution(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleAlertResolutionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleAlertResolutionArgs.builder
      builder.alertResolution(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupState.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AlertPrometheusRuleGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder)
    /**
     * @param email A `email` block as defined below.
     * @return builder
     */
    inline def email(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationEmailArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationEmailArgs.builder
      builder.email(args(argsBuilder).build)

    /**
     * @param webhooks One or more `webhook` blocks as defined below.
     * @return builder
     */
    inline def webhooks(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationWebhookArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationWebhookArgs.builder
      builder.webhooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder)
    /**
     * @param capacity A `capacity` block as defined below.
     * @return builder
     */
    inline def capacity(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileCapacityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param fixedDate A `fixedDate` block as defined below. This cannot be specified if a `recurrence` block is specified.
     * @return builder
     */
    inline def fixedDate(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileFixedDateArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileFixedDateArgs.builder
      builder.fixedDate(args(argsBuilder).build)

    /**
     * @param recurrence A `recurrence` block as defined below. This cannot be specified if a `fixedDate` block is specified.
     * @return builder
     */
    inline def recurrence(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRecurrenceArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

    /**
     * @param rules One or more (up to 10) `rule` blocks as defined below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder)
    /**
     * @param metricTrigger A `metricTrigger` block as defined below.
     * @return builder
     */
    inline def metricTrigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.builder
      builder.metricTrigger(args(argsBuilder).build)

    /**
     * @param scaleAction A `scaleAction` block as defined below.
     * @return builder
     */
    inline def scaleAction(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleScaleActionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleScaleActionArgs.builder
      builder.scaleAction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.Builder)
    /**
     * @param dimensions One or more `dimensions` block as defined below.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileRuleMetricTriggerDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder)
    /**
     * @param notification Specifies a `notification` block as defined below.
     * @return builder
     */
    inline def notification(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingNotificationArgs.builder
      builder.notification(args(argsBuilder).build)

    /**
     * @param predictive A `predictive` block as defined below.
     * @return builder
     */
    inline def predictive(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingPredictiveArgs.builder
      builder.predictive(args(argsBuilder).build)

    /**
     * @param profiles Specifies one or more (up to 20) `profile` blocks as defined below.
     * @return builder
     */
    inline def profiles(args: Endofunction[com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.AutoscaleSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.AutoscaleSettingProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder)
    /**
     * @param dataImport A `dataImport` block as defined above.
     * @return builder
     */
    inline def dataImport(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.builder
      builder.dataImport(args(argsBuilder).build)

    /**
     * @param extensions One or more `extension` blocks as defined below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesExtensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param iisLogs One or more `iisLog` blocks as defined below.
     * @return builder
     */
    inline def iisLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesIisLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesIisLogArgs.builder
      builder.iisLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param logFiles One or more `logFile` blocks as defined below.
     * @return builder
     */
    inline def logFiles(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.builder
      builder.logFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceCounters One or more `performanceCounter` blocks as defined below.
     * @return builder
     */
    inline def performanceCounters(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs.builder
      builder.performanceCounters(args.map(_(argsBuilder).build)*)

    /**
     * @param platformTelemetries One or more `platformTelemetry` blocks as defined below.
     * @return builder
     */
    inline def platformTelemetries(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPlatformTelemetryArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPlatformTelemetryArgs.builder
      builder.platformTelemetries(args.map(_(argsBuilder).build)*)

    /**
     * @param prometheusForwarders One or more `prometheusForwarder` blocks as defined below.
     * @return builder
     */
    inline def prometheusForwarders(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.builder
      builder.prometheusForwarders(args.map(_(argsBuilder).build)*)

    /**
     * @param syslogs One or more `syslog` blocks as defined below.
     * @return builder
     */
    inline def syslogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesSyslogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesSyslogArgs.builder
      builder.syslogs(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsEventLogs One or more `windowsEventLog` blocks as defined below.
     * @return builder
     */
    inline def windowsEventLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs.builder
      builder.windowsEventLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsFirewallLogs One or more `windowsFirewallLog` blocks as defined below.
     * @return builder
     */
    inline def windowsFirewallLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsFirewallLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsFirewallLogArgs.builder
      builder.windowsFirewallLogs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.Builder)
    /**
     * @param eventHubDataSources An `eventHubDataSource` block as defined below.
     * @return builder
     */
    inline def eventHubDataSources(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs.builder
      builder.eventHubDataSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.Builder)
    /**
     * @param settings A `settings` block as defined below.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.Builder)
    /**
     * @param text A `text` block as defined below.
     * @return builder
     */
    inline def text(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsTextArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesLogFileSettingsTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.Builder)
    /**
     * @param labelIncludeFilters One or more `labelIncludeFilter` blocks as defined above.
     * @return builder
     */
    inline def labelIncludeFilters(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs.builder
      builder.labelIncludeFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder)
    /**
     * @param azureMonitorMetrics A `azureMonitorMetrics` block as defined above.
     * @return builder
     */
    inline def azureMonitorMetrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsAzureMonitorMetricsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsAzureMonitorMetricsArgs.builder
      builder.azureMonitorMetrics(args(argsBuilder).build)

    /**
     * @param eventHub One or more `eventHub` blocks as defined below.
     * @return builder
     */
    inline def eventHub(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubArgs.builder
      builder.eventHub(args(argsBuilder).build)

    /**
     * @param eventHubDirect One or more `eventHub` blocks as defined below.
     * @return builder
     */
    inline def eventHubDirect(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubDirectArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsEventHubDirectArgs.builder
      builder.eventHubDirect(args(argsBuilder).build)

    /**
     * @param logAnalytics One or more `logAnalytics` blocks as defined below.
     * @return builder
     */
    inline def logAnalytics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsLogAnalyticArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsLogAnalyticArgs.builder
      builder.logAnalytics(args.map(_(argsBuilder).build)*)

    /**
     * @param monitorAccounts One or more `monitorAccount` blocks as defined below.
     * @return builder
     */
    inline def monitorAccounts(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsMonitorAccountArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsMonitorAccountArgs.builder
      builder.monitorAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param storageBlobDirects One or more `storageBlobDirect` blocks as defined below.
     * @return builder
     */
    inline def storageBlobDirects(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobDirectArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobDirectArgs.builder
      builder.storageBlobDirects(args.map(_(argsBuilder).build)*)

    /**
     * @param storageBlobs One or more `storageBlob` blocks as defined below.
     * @return builder
     */
    inline def storageBlobs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageBlobArgs.builder
      builder.storageBlobs(args.map(_(argsBuilder).build)*)

    /**
     * @param storageTableDirects One or more `storageTableDirect` blocks as defined below.
     * 
     * &gt; **Note:** `eventHubDirect`, `storageBlobDirect`, and `storageTableDirect` are only available for rules of kind `AgentDirectToStore`.
     * 
     * &gt; **Note:** At least one of `azureMonitorMetrics`, `eventHub`, `eventHubDirect`, `logAnalytics`, `monitorAccount`, `storageBlob`, `storageBlobDirect`,and `storageTableDirect` blocks must be specified.
     * @return builder
     */
    inline def storageTableDirects(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageTableDirectArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsStorageTableDirectArgs.builder
      builder.storageTableDirects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder)
    /**
     * @param dataFlows One or more `dataFlow` blocks as defined below.
     * @return builder
     */
    inline def dataFlows(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataFlowArgs.builder
      builder.dataFlows(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSources A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * @return builder
     */
    inline def dataSources(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesArgs.builder
      builder.dataSources(args(argsBuilder).build)

    /**
     * @param destinations A `destinations` block as defined below.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleDestinationsArgs.builder
      builder.destinations(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param streamDeclarations A `streamDeclaration` block as defined below.
     * @return builder
     */
    inline def streamDeclarations(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.builder
      builder.streamDeclarations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder)
    /**
     * @param columns One or more `column` blocks as defined above.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationColumnArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DataCollectionRuleStreamDeclarationColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder)
    /**
     * @return builder
     * @deprecated `retentionPolicy` has been deprecated in favour of `azure.storage.ManagementPolicy` resource and will be removed in v5.0 of the AzureRM provider - to learn more https://aka.ms/diagnostic_settings_log_retention
     */
    @deprecated("`retentionPolicy` has been deprecated in favour of `azure.storage.ManagementPolicy` resource and will be removed in v5.0 of the AzureRM provider - to learn more https://aka.ms/diagnostic_settings_log_retention") inline def retentionPolicy(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogRetentionPolicyArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder)
    /**
     * @return builder
     * @deprecated `retentionPolicy` has been deprecated in favour of the `azure.storage.ManagementPolicy` resource and will be removed in v5.0 of the AzureRM provider - to learn more go to https://aka.ms/diagnostic_settings_log_retention
     */
    @deprecated("`retentionPolicy` has been deprecated in favour of the `azure.storage.ManagementPolicy` resource and will be removed in v5.0 of the AzureRM provider - to learn more go to https://aka.ms/diagnostic_settings_log_retention") inline def retentionPolicy(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricRetentionPolicyArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder)
    /**
     * @param enabledLogs One or more `enabledLog` blocks as defined below.
     * 
     * &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified. At least one type of Log or Metric must be enabled.
     * @return builder
     */
    inline def enabledLogs(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledLogArgs.builder
      builder.enabledLogs(args.map(_(argsBuilder).build)*)

    /**
     * @param enabledMetrics One or more `enabledMetric` blocks as defined below.
     * 
     * &gt; **Note:** At least one `enabledLog` or `enabledMetric` block must be specified.
     * @return builder
     */
    inline def enabledMetrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingEnabledMetricArgs.builder
      builder.enabledMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated `metric` has been deprecated in favour of the `enabledMetric` property and will be removed in v5.0 of the AzureRM provider
     */
    @deprecated("`metric` has been deprecated in favour of the `enabledMetric` property and will be removed in v5.0 of the AzureRM provider") inline def metrics(args: Endofunction[com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.DiagnosticSettingState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.DiagnosticSettingMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder)
    /**
     * @param actions One or more `action` blocks as defined below.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param applicationInsightsWebTestLocationAvailabilityCriteria A `applicationInsightsWebTestLocationAvailabilityCriteria` block as defined below.
     * 
     * &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    inline def applicationInsightsWebTestLocationAvailabilityCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertApplicationInsightsWebTestLocationAvailabilityCriteriaArgs.builder
      builder.applicationInsightsWebTestLocationAvailabilityCriteria(args(argsBuilder).build)

    /**
     * @param criterias One or more (static) `criteria` blocks as defined below.
     * 
     * &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    inline def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertCriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param dynamicCriteria A `dynamicCriteria` block as defined below.
     * 
     * &gt; **Note:** One of either `criteria`, `dynamicCriteria` or `applicationInsightsWebTestLocationAvailabilityCriteria` must be specified.
     * @return builder
     */
    inline def dynamicCriteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.MetricAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.MetricAlertDynamicCriteriaArgs.builder
      builder.dynamicCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder)
    /**
     * @param metricTrigger A `metricTrigger` block as defined above. Trigger condition for metric query rule.
     * @return builder
     */
    inline def metricTrigger(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerMetricTriggerArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertTriggerMetricTriggerArgs.builder
      builder.metricTrigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder)
    /**
     * @param dimensions A `dimension` block as defined below.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param failingPeriods A `failingPeriods` block as defined below.
     * @return builder
     */
    inline def failingPeriods(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaFailingPeriodsArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaFailingPeriodsArgs.builder
      builder.failingPeriods(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder)
    /**
     * @param action An `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2ActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param criterias A `criteria` block as defined below.
     * @return builder
     */
    inline def criterias(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2CriteriaArgs.builder
      builder.criterias(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2State.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesAlertV2IdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder)
    /**
     * @param dimensions A `dimension` block as defined below.
     * @return builder
     */
    inline def dimensions(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaDimensionArgs.Builder]*):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogState.Builder)
    /**
     * @param criteria A `criteria` block as defined below.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleState.Builder)
    /**
     * @param actionGroup An `actionGroup` block as defined below.
     * @return builder
     */
    inline def actionGroup(args: Endofunction[com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.Builder]):
        com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleState.Builder =
      val argsBuilder = com.pulumi.azure.monitoring.inputs.SmartDetectorAlertRuleActionGroupArgs.builder
      builder.actionGroup(args(argsBuilder).build)
