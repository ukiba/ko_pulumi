package jp.ukiba.ko_pulumi
package aws

object cfg_ext:
  extension (builder: com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder)
    /**
     * @param accountAggregationSource The account(s) to aggregate config data from as documented below.
     * @return builder
     */
    inline def accountAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.builder
      builder.accountAggregationSource(args(argsBuilder).build)

    /**
     * @param organizationAggregationSource The organization to aggregate config data from as documented below.
     * @return builder
     */
    inline def organizationAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.builder
      builder.organizationAggregationSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.ConformancePackArgs.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    inline def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.ConformancePackArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.DeliveryChannelArgs.Builder)
    /**
     * @param snapshotDeliveryProperties Options for how AWS Config delivers configuration snapshots. See below
     * @return builder
     */
    inline def snapshotDeliveryProperties(args: Endofunction[com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.Builder]):
        com.pulumi.aws.cfg.DeliveryChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.builder
      builder.snapshotDeliveryProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.OrganizationConformancePackArgs.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    inline def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.OrganizationConformancePackArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.RecorderArgs.Builder)
    /**
     * @param recordingGroup Recording group - see below.
     * @return builder
     */
    inline def recordingGroup(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder]):
        com.pulumi.aws.cfg.RecorderArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.builder
      builder.recordingGroup(args(argsBuilder).build)

    /**
     * @param recordingMode Recording mode - see below.
     * @return builder
     */
    inline def recordingMode(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder]):
        com.pulumi.aws.cfg.RecorderArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.builder
      builder.recordingMode(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder)
    /**
     * @param executionControls Configuration block for execution controls. See below.
     * @return builder
     */
    inline def executionControls(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder]):
        com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.builder
      builder.executionControls(args(argsBuilder).build)

    /**
     * @param parameters Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.Builder]*):
        com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.RuleArgs.Builder)
    /**
     * @param evaluationModes The modes the Config rule can be evaluated in. See Evaluation Mode for more details.
     * @return builder
     */
    inline def evaluationModes(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.Builder]*):
        com.pulumi.aws.cfg.RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.builder
      builder.evaluationModes(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Scope defines which resources can trigger an evaluation for the rule. See Scope Below.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleScopeArgs.Builder]):
        com.pulumi.aws.cfg.RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    /**
     * @param source Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources. See Source Below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder]):
        com.pulumi.aws.cfg.RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.ConfigurationAggregatorState.Builder)
    /**
     * @param accountAggregationSource The account(s) to aggregate config data from as documented below.
     * @return builder
     */
    inline def accountAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.inputs.ConfigurationAggregatorState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.builder
      builder.accountAggregationSource(args(argsBuilder).build)

    /**
     * @param organizationAggregationSource The organization to aggregate config data from as documented below.
     * @return builder
     */
    inline def organizationAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.inputs.ConfigurationAggregatorState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.builder
      builder.organizationAggregationSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.ConformancePackState.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    inline def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.ConformancePackState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.DeliveryChannelState.Builder)
    /**
     * @param snapshotDeliveryProperties Options for how AWS Config delivers configuration snapshots. See below
     * @return builder
     */
    inline def snapshotDeliveryProperties(args: Endofunction[com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.Builder]):
        com.pulumi.aws.cfg.inputs.DeliveryChannelState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.builder
      builder.snapshotDeliveryProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.OrganizationConformancePackState.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    inline def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.OrganizationConformancePackState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder)
    /**
     * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource types from being recorded by the configuration recorder.To use this option, you must set the useOnly field of RecordingStrategy to `EXCLUSION_BY_RESOURCE_TYPES` Requires `allSupported = false`. Conflicts with `resourceTypes`.
     * @return builder
     */
    inline def exclusionByResourceTypes(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupExclusionByResourceTypeArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupExclusionByResourceTypeArgs.builder
      builder.exclusionByResourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param recordingStrategies Recording Strategy. Detailed below.
     * @return builder
     */
    inline def recordingStrategies(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupRecordingStrategyArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupRecordingStrategyArgs.builder
      builder.recordingStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder)
    /**
     * @param recordingModeOverride Recording mode overrides. Detailed below.
     * @return builder
     */
    inline def recordingModeOverride(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingModeRecordingModeOverrideArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingModeRecordingModeOverrideArgs.builder
      builder.recordingModeOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.RecorderState.Builder)
    /**
     * @param recordingGroup Recording group - see below.
     * @return builder
     */
    inline def recordingGroup(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RecorderState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.builder
      builder.recordingGroup(args(argsBuilder).build)

    /**
     * @param recordingMode Recording mode - see below.
     * @return builder
     */
    inline def recordingMode(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RecorderState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.builder
      builder.recordingMode(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder)
    /**
     * @param ssmControls Configuration block for SSM controls. See below.
     * @return builder
     */
    inline def ssmControls(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsSsmControlsArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsSsmControlsArgs.builder
      builder.ssmControls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.RemediationConfigurationState.Builder)
    /**
     * @param executionControls Configuration block for execution controls. See below.
     * @return builder
     */
    inline def executionControls(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RemediationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.builder
      builder.executionControls(args(argsBuilder).build)

    /**
     * @param parameters Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RemediationConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder)
    /**
     * @param customPolicyDetails Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
     * @return builder
     */
    inline def customPolicyDetails(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceCustomPolicyDetailsArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceCustomPolicyDetailsArgs.builder
      builder.customPolicyDetails(args(argsBuilder).build)

    /**
     * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
     * @return builder
     */
    inline def sourceDetails(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceSourceDetailArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceSourceDetailArgs.builder
      builder.sourceDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RuleState.Builder)
    /**
     * @param evaluationModes The modes the Config rule can be evaluated in. See Evaluation Mode for more details.
     * @return builder
     */
    inline def evaluationModes(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.builder
      builder.evaluationModes(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Scope defines which resources can trigger an evaluation for the rule. See Scope Below.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleScopeArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    /**
     * @param source Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources. See Source Below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceArgs.builder
      builder.source(args(argsBuilder).build)
