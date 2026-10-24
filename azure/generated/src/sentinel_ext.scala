package jp.ukiba.ko_pulumi
package azure

object sentinel_ext:
  extension (builder: com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder)
    /**
     * @param multiSelectObservations A list of `multiSelectObservation` blocks as defined below.
     * @return builder
     */
    def multiSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.builder
      builder.multiSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param prioritizedExcludeObservations A list of `prioritizedExcludeObservation` blocks as defined below.
     * @return builder
     */
    def prioritizedExcludeObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.builder
      builder.prioritizedExcludeObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param singleSelectObservations A list of `singleSelectObservation` blocks as defined below.
     * @return builder
     */
    def singleSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.builder
      builder.singleSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdObservations A list of `thresholdObservation` blocks as defined below.
     * 
     * &gt; **Note:** un-specified `multiSelectObservation`, `singleSelectObservation`, `prioritizedExcludeObservation` and `thresholdObservation` will be inherited from the built-in Anomaly Alert Rule.
     * @return builder
     */
    def thresholdObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleAnomalyDuplicateArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.builder
      builder.thresholdObservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder)
    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleFusionArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     * &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 5.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleNrtArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     * &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 10.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.AlertRuleScheduledArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     * &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.AuthomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.AutomationRuleArgs.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     * &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.AutomationRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.MetadataArgs.Builder)
    /**
     * @param author An `author` blocks as defined below.
     * @return builder
     */
    def author(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.builder
      builder.author(args(argsBuilder).build)

    /**
     * @param category A `category` block as defined below.
     * @return builder
     */
    def category(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.builder
      builder.category(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param support A `support` block as defined below.
     * @return builder
     */
    def support(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.Builder]):
        com.pulumi.azure.sentinel.MetadataArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.builder
      builder.support(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder)
    /**
     * @param externalReferences One or more `externalReference` blocks as defined below.
     * @return builder
     */
    def externalReferences(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.Builder]*):
        com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.builder
      builder.externalReferences(args.map(_(argsBuilder).build)*)

    /**
     * @param granularMarkings One or more `granularMarking` blocks as defined below.
     * @return builder
     */
    def granularMarkings(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.Builder]*):
        com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.builder
      builder.granularMarkings(args.map(_(argsBuilder).build)*)

    /**
     * @param killChainPhases One or more `killChainPhase` blocks as defined below.
     * @return builder
     */
    def killChainPhases(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.Builder]*):
        com.pulumi.azure.sentinel.ThreatIntelligenceIndicatorArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.builder
      builder.killChainPhases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder)
    /**
     * @param multiSelectObservations A list of `multiSelectObservation` blocks as defined below.
     * @return builder
     */
    def multiSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInMultiSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInMultiSelectObservationArgs.builder
      builder.multiSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param prioritizedExcludeObservations A list of `prioritizedExcludeObservation` blocks as defined below.
     * @return builder
     */
    def prioritizedExcludeObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationArgs.builder
      builder.prioritizedExcludeObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDataConnectors A `requiredDataConnector` block as defined below.
     * @return builder
     */
    def requiredDataConnectors(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorArgs.builder
      builder.requiredDataConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param singleSelectObservations A list of `singleSelectObservation` blocks as defined below.
     * @return builder
     */
    def singleSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInSingleSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInSingleSelectObservationArgs.builder
      builder.singleSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdObservations A list of `thresholdObservation` blocks as defined below.
     * @return builder
     */
    def thresholdObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInThresholdObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyBuiltInThresholdObservationArgs.builder
      builder.thresholdObservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder)
    /**
     * @param multiSelectObservations A list of `multiSelectObservation` blocks as defined below.
     * @return builder
     */
    def multiSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs.builder
      builder.multiSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param prioritizedExcludeObservations A list of `prioritizedExcludeObservation` blocks as defined below.
     * @return builder
     */
    def prioritizedExcludeObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs.builder
      builder.prioritizedExcludeObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param requiredDataConnectors A `requiredDataConnector` block as defined below.
     * @return builder
     */
    def requiredDataConnectors(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateRequiredDataConnectorArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateRequiredDataConnectorArgs.builder
      builder.requiredDataConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param singleSelectObservations A list of `singleSelectObservation` blocks as defined below.
     * @return builder
     */
    def singleSelectObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs.builder
      builder.singleSelectObservations(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdObservations A list of `thresholdObservation` blocks as defined below.
     * 
     * &gt; **Note:** un-specified `multiSelectObservation`, `singleSelectObservation`, `prioritizedExcludeObservation` and `thresholdObservation` will be inherited from the built-in Anomaly Alert Rule.
     * @return builder
     */
    def thresholdObservations(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs.builder
      builder.thresholdObservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder)
    /**
     * @param subTypes One or more `subType` blocks as defined below.
     * @return builder
     */
    def subTypes(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceSubTypeArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceSubTypeArgs.builder
      builder.subTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleFusionState.Builder)
    /**
     * @param sources One or more `source` blocks as defined below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleFusionState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleFusionSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder)
    /**
     * @param dynamicProperties A list of `dynamicProperty` blocks as defined below.
     * @return builder
     */
    def dynamicProperties(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideDynamicPropertyArgs.builder
      builder.dynamicProperties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder)
    /**
     * @param fieldMappings A list of `fieldMapping` blocks as defined below.
     * @return builder
     */
    def fieldMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingFieldMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingFieldMappingArgs.builder
      builder.fieldMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder)
    /**
     * @param grouping A `grouping` block as defined below.
     * @return builder
     */
    def grouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentGroupingArgs.builder
      builder.grouping(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     * &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 5.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleNrtState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleNrtSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder)
    /**
     * @param dynamicProperties A list of `dynamicProperty` blocks as defined below.
     * @return builder
     */
    def dynamicProperties(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs.builder
      builder.dynamicProperties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder)
    /**
     * @param fieldMappings A list of `fieldMapping` blocks as defined below.
     * @return builder
     */
    def fieldMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingFieldMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingFieldMappingArgs.builder
      builder.fieldMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder)
    /**
     * @param grouping A `grouping` block as defined below.
     * @return builder
     */
    def grouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentGroupingArgs.builder
      builder.grouping(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder)
    /**
     * @param alertDetailsOverrides An `alertDetailsOverride` block as defined below.
     * @return builder
     */
    def alertDetailsOverrides(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledAlertDetailsOverrideArgs.builder
      builder.alertDetailsOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param entityMappings A list of `entityMapping` blocks as defined below.
     * @return builder
     */
    def entityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEntityMappingArgs.builder
      builder.entityMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param eventGrouping A `eventGrouping` block as defined below.
     * @return builder
     */
    def eventGrouping(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledEventGroupingArgs.builder
      builder.eventGrouping(args(argsBuilder).build)

    /**
     * @param incident A `incident` block as defined below.
     * @return builder
     */
    def incident(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledIncidentArgs.builder
      builder.incident(args(argsBuilder).build)

    /**
     * @param sentinelEntityMappings A list of `sentinelEntityMapping` blocks as defined below.
     * 
     * &gt; **Note:** `entityMapping` and `sentinelEntityMapping` together can&#39;t exceed 10.
     * @return builder
     */
    def sentinelEntityMappings(args: Endofunction[com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AlertRuleScheduledState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AlertRuleScheduledSentinelEntityMappingArgs.builder
      builder.sentinelEntityMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     * &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AuthomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AuthomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder)
    /**
     * @param actionIncidentTasks One or more `actionIncidentTask` blocks as defined below.
     * @return builder
     */
    def actionIncidentTasks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentTaskArgs.builder
      builder.actionIncidentTasks(args.map(_(argsBuilder).build)*)

    /**
     * @param actionIncidents One or more `actionIncident` blocks as defined below.
     * @return builder
     */
    def actionIncidents(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionIncidentArgs.builder
      builder.actionIncidents(args.map(_(argsBuilder).build)*)

    /**
     * @param actionPlaybooks One or more `actionPlaybook` blocks as defined below.
     * 
     * &gt; **Note:** Either one `actionIncident` block or `actionPlaybook` block has to be specified.
     * @return builder
     */
    def actionPlaybooks(args: Endofunction[com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.AutomationRuleState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.AutomationRuleActionPlaybookArgs.builder
      builder.actionPlaybooks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.MetadataState.Builder)
    /**
     * @param author An `author` blocks as defined below.
     * @return builder
     */
    def author(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataAuthorArgs.builder
      builder.author(args(argsBuilder).build)

    /**
     * @param category A `category` block as defined below.
     * @return builder
     */
    def category(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataCategoryArgs.builder
      builder.category(args(argsBuilder).build)

    /**
     * @param source A `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param support A `support` block as defined below.
     * @return builder
     */
    def support(args: Endofunction[com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.Builder]):
        com.pulumi.azure.sentinel.inputs.MetadataState.Builder =
      val argsBuilder = com.pulumi.azure.sentinel.inputs.MetadataSupportArgs.builder
      builder.support(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.Builder)
    /**
     * @param patternTypeValues A `patternTypeValues` block as defined below.
     * @return builder
     */
    def patternTypeValues(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs.builder
      builder.patternTypeValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder)
    /**
     * @param externalReferences One or more `externalReference` blocks as defined below.
     * @return builder
     */
    def externalReferences(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorExternalReferenceArgs.builder
      builder.externalReferences(args.map(_(argsBuilder).build)*)

    /**
     * @param granularMarkings One or more `granularMarking` blocks as defined below.
     * @return builder
     */
    def granularMarkings(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorGranularMarkingArgs.builder
      builder.granularMarkings(args.map(_(argsBuilder).build)*)

    /**
     * @param killChainPhases One or more `killChainPhase` blocks as defined below.
     * @return builder
     */
    def killChainPhases(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorKillChainPhaseArgs.builder
      builder.killChainPhases(args.map(_(argsBuilder).build)*)

    /**
     * @param parsedPatterns A `parsedPattern` block as defined below.
     * @return builder
     */
    def parsedPatterns(args: Endofunction[com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.Builder]*):
        com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorState.Builder =
      def argsBuilder = com.pulumi.azure.sentinel.inputs.ThreatIntelligenceIndicatorParsedPatternArgs.builder
      builder.parsedPatterns(args.map(_(argsBuilder).build)*)
