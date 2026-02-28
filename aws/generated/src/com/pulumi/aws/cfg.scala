package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cfg:
  extension (builder: com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder)
    /**
     * @param accountAggregationSource The account(s) to aggregate config data from as documented below.
     * @return builder
     */
    def accountAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.builder
      builder.accountAggregationSource(args(argsBuilder).build)

    /**
     * @param organizationAggregationSource The organization to aggregate config data from as documented below.
     * @return builder
     */
    def organizationAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.builder
      builder.organizationAggregationSource(args(argsBuilder).build)

  /**
   * Manages status (recording / stopped) of an AWS Config Configuration Recorder.
   *  
   *  &gt; **Note:** Starting Configuration Recorder requires a Delivery Channel to be present. Use of `dependsOn` (as shown below) is recommended to avoid race conditions.
   */
  def RecorderStatus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.RecorderStatusArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.RecorderStatusArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.RecorderStatus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Config Configuration Aggregator */
  def ConfigurationAggregator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.ConfigurationAggregatorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.ConfigurationAggregatorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cfg.ConfigurationAggregator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cfg.RuleArgs.Builder)
    /**
     * @param evaluationModes The modes the Config rule can be evaluated in. See Evaluation Mode for more details.
     * @return builder
     */
    def evaluationModes(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.Builder]*):
        com.pulumi.aws.cfg.RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.builder
      builder.evaluationModes(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Scope defines which resources can trigger an evaluation for the rule. See Scope Below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleScopeArgs.Builder]):
        com.pulumi.aws.cfg.RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    /**
     * @param source Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources. See Source Below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder]):
        com.pulumi.aws.cfg.RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.OrganizationConformancePackArgs.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.OrganizationConformancePackArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.DeliveryChannelArgs.Builder)
    /**
     * @param snapshotDeliveryProperties Options for how AWS Config delivers configuration snapshots. See below
     * @return builder
     */
    def snapshotDeliveryProperties(args: Endofunction[com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.Builder]):
        com.pulumi.aws.cfg.DeliveryChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.builder
      builder.snapshotDeliveryProperties(args(argsBuilder).build)

  /**
   * Manages a Config Organization Custom Rule. More information about these rules can be found in the [Enabling AWS Config Rules Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/config-rule-multi-account-deployment.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. For working with Organization Managed Rules (those invoking an AWS managed rule), see the `aws_config_organization_managed__rule` resource.
   *  
   *  &gt; **NOTE:** This resource must be created in the Organization master account and rules will include the master account unless its ID is added to the `excludedAccounts` argument.
   *  
   *  &gt; **NOTE:** The proper Lambda permission to allow the AWS Config service invoke the Lambda Function must be in place before the rule will successfully create or update. See also the `aws.lambda.Permission` resource.
   */
  def OrganizationCustomRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.OrganizationCustomRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.OrganizationCustomRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.OrganizationCustomRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage the AWS Config retention configuration.
   *  The retention configuration defines the number of days that AWS Config stores historical information.
   */
  def RetentionConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.RetentionConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cfg.RetentionConfigurationArgs.builder
    
    com.pulumi.aws.cfg.RetentionConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS Config Remediation Configuration.
   *  
   *  &gt; **Note:** Config Remediation Configuration requires an existing Config Rule to be present.
   */
  def RemediationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cfg.RemediationConfigurationArgs.builder
    
    com.pulumi.aws.cfg.RemediationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Config Organization Managed Rule. More information about these rules can be found in the [Enabling AWS Config Rules Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/config-rule-multi-account-deployment.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. For working with Organization Custom Rules (those invoking a custom Lambda Function), see the `aws.cfg.OrganizationCustomRule` resource.
   *  
   *  &gt; **NOTE:** This resource must be created in the Organization master account and rules will include the master account unless its ID is added to the `excludedAccounts` argument.
   *  
   *  &gt; **NOTE:** Every Organization account except those configured in the `excludedAccounts` argument must have a Configuration Recorder with proper IAM permissions before the rule will successfully create or update. See also the `aws.cfg.Recorder` resource.
   */
  def OrganizationManagedRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.OrganizationManagedRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.OrganizationManagedRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.OrganizationManagedRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Config Conformance Pack. More information about this collection of Config rules and remediation actions can be found in the
   *  [Conformance Packs](https://docs.aws.amazon.com/config/latest/developerguide/conformance-packs.html) documentation.
   *  Sample Conformance Pack templates may be found in the
   *  [AWS Config Rules Repository](https://github.com/awslabs/aws-config-rules/tree/master/aws-config-conformance-packs).
   *  
   *  &gt; **NOTE:** The account must have a Configuration Recorder with proper IAM permissions before the Conformance Pack will
   *  successfully create or update. See also the
   *  `aws.cfg.Recorder` resource.
   */
  def ConformancePack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.ConformancePackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.ConformancePackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.ConformancePack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder)
    /**
     * @param executionControls Configuration block for execution controls. See below.
     * @return builder
     */
    def executionControls(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder]):
        com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.builder
      builder.executionControls(args(argsBuilder).build)

    /**
     * @param parameters Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.Builder]*):
        com.pulumi.aws.cfg.RemediationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.RecorderArgs.Builder)
    /**
     * @param recordingGroup Recording group - see below.
     * @return builder
     */
    def recordingGroup(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder]):
        com.pulumi.aws.cfg.RecorderArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.builder
      builder.recordingGroup(args(argsBuilder).build)

    /**
     * @param recordingMode Recording mode - see below.
     * @return builder
     */
    def recordingMode(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder]):
        com.pulumi.aws.cfg.RecorderArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.builder
      builder.recordingMode(args(argsBuilder).build)

  /**
   * Manages a Config Organization Conformance Pack. More information can be found in the [Managing Conformance Packs Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/conformance-pack-organization-apis.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. Example conformance pack templates may be found in the [AWS Config Rules Repository](https://github.com/awslabs/aws-config-rules/tree/master/aws-config-conformance-packs).
   *  
   *  &gt; **NOTE:** This resource must be created in the Organization master account or a delegated administrator account, and the Organization must have all features enabled. Every Organization account except those configured in the `excludedAccounts` argument must have a Configuration Recorder with proper IAM permissions before the Organization Conformance Pack will successfully create or update. See also the `aws.cfg.Recorder` resource.
   */
  def OrganizationConformancePack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.OrganizationConformancePackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.OrganizationConformancePackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.OrganizationConformancePack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS Config Configuration Recorder. Please note that this resource **does not start** the created recorder automatically.
   *  
   *  &gt; **Note:** _Starting_ the Configuration Recorder requires a delivery channel (while delivery channel creation requires Configuration Recorder). This is why `aws.cfg.RecorderStatus` is a separate resource.
   */
  def Recorder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.RecorderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.RecorderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.Recorder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS Config Rule.
   *  
   *  &gt; **Note:** Config Rule requires an existing Configuration Recorder to be present. Use of `dependsOn` is recommended (as shown below) to avoid race conditions.
   */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.RuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.RuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cfg.Rule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Config Aggregate Authorization */
  def AggregateAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.AggregateAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.AggregateAuthorizationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cfg.AggregateAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Config Organization Custom Policy Rule. More information about these rules can be found in the [Enabling AWS Config Rules Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/config-rule-multi-account-deployment.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. For working with Organization Managed Rules (those invoking an AWS managed rule), see the `aws_config_organization_managed__rule` resource.
   *  
   *  &gt; **NOTE:** This resource must be created in the Organization master account and rules will include the master account unless its ID is added to the `excludedAccounts` argument.
   */
  def OrganizationCustomPolicyRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.OrganizationCustomPolicyRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.OrganizationCustomPolicyRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.OrganizationCustomPolicyRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.ConformancePackState.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.ConformancePackState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder)
    /**
     * @param recordingModeOverride Recording mode overrides. Detailed below.
     * @return builder
     */
    def recordingModeOverride(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingModeRecordingModeOverrideArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingModeRecordingModeOverrideArgs.builder
      builder.recordingModeOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder)
    /**
     * @param ssmControls Configuration block for SSM controls. See below.
     * @return builder
     */
    def ssmControls(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsSsmControlsArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsSsmControlsArgs.builder
      builder.ssmControls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder)
    /**
     * @param customPolicyDetails Provides the runtime system, policy definition, and whether debug logging is enabled. Required when owner is set to `CUSTOM_POLICY`. See Custom Policy Details Below.
     * @return builder
     */
    def customPolicyDetails(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceCustomPolicyDetailsArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceCustomPolicyDetailsArgs.builder
      builder.customPolicyDetails(args(argsBuilder).build)

    /**
     * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA` or `CUSTOM_POLICY`. See Source Detail Below.
     * @return builder
     */
    def sourceDetails(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceSourceDetailArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceSourceDetailArgs.builder
      builder.sourceDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder)
    /**
     * @param exclusionByResourceTypes An object that specifies how AWS Config excludes resource types from being recorded by the configuration recorder.To use this option, you must set the useOnly field of RecordingStrategy to `EXCLUSION_BY_RESOURCE_TYPES` Requires `allSupported = false`. Conflicts with `resourceTypes`.
     * @return builder
     */
    def exclusionByResourceTypes(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupExclusionByResourceTypeArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupExclusionByResourceTypeArgs.builder
      builder.exclusionByResourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param recordingStrategies Recording Strategy. Detailed below.
     * @return builder
     */
    def recordingStrategies(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupRecordingStrategyArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupRecordingStrategyArgs.builder
      builder.recordingStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RemediationConfigurationState.Builder)
    /**
     * @param executionControls Configuration block for execution controls. See below.
     * @return builder
     */
    def executionControls(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RemediationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsArgs.builder
      builder.executionControls(args(argsBuilder).build)

    /**
     * @param parameters Can be specified multiple times for each parameter. Each parameter block supports arguments below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RemediationConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RemediationConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.DeliveryChannelState.Builder)
    /**
     * @param snapshotDeliveryProperties Options for how AWS Config delivers configuration snapshots. See below
     * @return builder
     */
    def snapshotDeliveryProperties(args: Endofunction[com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.Builder]):
        com.pulumi.aws.cfg.inputs.DeliveryChannelState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesArgs.builder
      builder.snapshotDeliveryProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.OrganizationConformancePackState.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.OrganizationConformancePackState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.OrganizationConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cfg.inputs.RuleState.Builder)
    /**
     * @param evaluationModes The modes the Config rule can be evaluated in. See Evaluation Mode for more details.
     * @return builder
     */
    def evaluationModes(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.Builder]*):
        com.pulumi.aws.cfg.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.RuleEvaluationModeArgs.builder
      builder.evaluationModes(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Scope defines which resources can trigger an evaluation for the rule. See Scope Below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleScopeArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleScopeArgs.builder
      builder.scope(args(argsBuilder).build)

    /**
     * @param source Source specifies the rule owner, the rule identifier, and the notifications that cause the function to evaluate your AWS resources. See Source Below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.cfg.inputs.RuleSourceArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.ConfigurationAggregatorState.Builder)
    /**
     * @param accountAggregationSource The account(s) to aggregate config data from as documented below.
     * @return builder
     */
    def accountAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.inputs.ConfigurationAggregatorState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs.builder
      builder.accountAggregationSource(args(argsBuilder).build)

    /**
     * @param organizationAggregationSource The organization to aggregate config data from as documented below.
     * @return builder
     */
    def organizationAggregationSource(args: Endofunction[com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.Builder]):
        com.pulumi.aws.cfg.inputs.ConfigurationAggregatorState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs.builder
      builder.organizationAggregationSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.inputs.RecorderState.Builder)
    /**
     * @param recordingGroup Recording group - see below.
     * @return builder
     */
    def recordingGroup(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RecorderState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs.builder
      builder.recordingGroup(args(argsBuilder).build)

    /**
     * @param recordingMode Recording mode - see below.
     * @return builder
     */
    def recordingMode(args: Endofunction[com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.Builder]):
        com.pulumi.aws.cfg.inputs.RecorderState.Builder =
      val argsBuilder = com.pulumi.aws.cfg.inputs.RecorderRecordingModeArgs.builder
      builder.recordingMode(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cfg.ConformancePackArgs.Builder)
    /**
     * @param inputParameters Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `templateBody` or in the template stored in Amazon S3 if using `templateS3Uri`.
     * @return builder
     */
    def inputParameters(args: Endofunction[com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.Builder]*):
        com.pulumi.aws.cfg.ConformancePackArgs.Builder =
      def argsBuilder = com.pulumi.aws.cfg.inputs.ConformancePackInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

  /**
   * Provides an AWS Config Delivery Channel.
   *  
   *  &gt; **Note:** Delivery Channel requires a Configuration Recorder to be present. Use of `dependsOn` (as shown below) is recommended to avoid race conditions.
   */
  def DeliveryChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cfg.DeliveryChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cfg.DeliveryChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cfg.DeliveryChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
