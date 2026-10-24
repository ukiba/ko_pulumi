package jp.ukiba.ko_pulumi
package aws

object ssm_ext:
  extension (builder: com.pulumi.aws.ssm.AssociationArgs.Builder)
    /**
     * @param outputLocation An output location block. Output Location is documented below.
     * @return builder
     */
    inline def outputLocation(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.Builder]):
        com.pulumi.aws.ssm.AssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.builder
      builder.outputLocation(args(argsBuilder).build)

    /**
     * @param targets A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationTargetArgs.Builder]*):
        com.pulumi.aws.ssm.AssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.AssociationTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.ContactsRotationArgs.Builder)
    /**
     * @param recurrence Information about when an on-call rotation is in effect and how long the rotation period lasts. Exactly one of either `dailySettings`, `monthlySettings`, or `weeklySettings` must be populated. See Recurrence for more details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def recurrence(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder]):
        com.pulumi.aws.ssm.ContactsRotationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.DocumentArgs.Builder)
    /**
     * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. See `attachmentsSource` block below for details.
     * @return builder
     */
    inline def attachmentsSources(args: Endofunction[com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.Builder]*):
        com.pulumi.aws.ssm.DocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.builder
      builder.attachmentsSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.Builder)
    /**
     * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.Builder]*):
        com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder)
    /**
     * @param targets The targets (either instances or window target IDs). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target IDs are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.Builder]*):
        com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

    /**
     * @param taskInvocationParameters Configuration block with parameters for task execution.
     * @return builder
     */
    inline def taskInvocationParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder]):
        com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.builder
      builder.taskInvocationParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.PatchBaselineArgs.Builder)
    /**
     * @param approvalRules Set of rules used to include patches in the baseline. Up to 10 approval rules can be specified. See `approvalRule` below.
     * @return builder
     */
    inline def approvalRules(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder]*):
        com.pulumi.aws.ssm.PatchBaselineArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.builder
      builder.approvalRules(args.map(_(argsBuilder).build)*)

    /**
     * @param globalFilters Set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     * @return builder
     */
    inline def globalFilters(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.Builder]*):
        com.pulumi.aws.ssm.PatchBaselineArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.builder
      builder.globalFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Configuration block with alternate sources for patches. Applies to Linux instances only. See `source` below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.Builder]*):
        com.pulumi.aws.ssm.PatchBaselineArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder)
    /**
     * @param configurationDefinition Definition of the Quick Setup configuration that the configuration manager deploys. See `configurationDefinition` below.
     * @return builder
     */
    inline def configurationDefinition(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.builder
      builder.configurationDefinition(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.Builder]):
        com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.ResourceDataSyncArgs.Builder)
    /**
     * @param s3Destination Amazon S3 configuration details for the sync.
     * @return builder
     */
    inline def s3Destination(args: Endofunction[com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.Builder]):
        com.pulumi.aws.ssm.ResourceDataSyncArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.AssociationState.Builder)
    /**
     * @param outputLocation An output location block. Output Location is documented below.
     * @return builder
     */
    inline def outputLocation(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.Builder]):
        com.pulumi.aws.ssm.inputs.AssociationState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs.builder
      builder.outputLocation(args(argsBuilder).build)

    /**
     * @param targets A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.AssociationTargetArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.AssociationState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.AssociationTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder)
    inline def dailySettings(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceDailySettingArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceDailySettingArgs.builder
      builder.dailySettings(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlySettings (Optional) Information about on-call rotations that recur monthly. See Monthly Settings for more details.
     * @return builder
     */
    inline def monthlySettings(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.builder
      builder.monthlySettings(args.map(_(argsBuilder).build)*)

    /**
     * @param shiftCoverages (Optional) Information about the days of the week that the on-call rotation coverage includes. See Shift Coverages for more details.
     * @return builder
     */
    inline def shiftCoverages(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.builder
      builder.shiftCoverages(args.map(_(argsBuilder).build)*)

    /**
     * @param weeklySettings (Optional) Information about on-call rotations that recur weekly. See Weekly Settings for more details.
     * @return builder
     */
    inline def weeklySettings(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.builder
      builder.weeklySettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.Builder)
    /**
     * @param handOffTime (Required) The hand off time. See Hand Off Time for more details.
     * @return builder
     */
    inline def handOffTime(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingHandOffTimeArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceMonthlySettingHandOffTimeArgs.builder
      builder.handOffTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.Builder)
    /**
     * @param coverageTimes (Required) Information about when an on-call shift begins and ends. See Coverage Times for more details.
     * @return builder
     */
    inline def coverageTimes(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.builder
      builder.coverageTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder)
    /**
     * @param end (Required) The end time of the on-call shift. See Hand Off Time for more details.
     * @return builder
     */
    inline def end(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeEndArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeEndArgs.builder
      builder.end(args(argsBuilder).build)

    /**
     * @param start (Required) The start time of the on-call shift. See Hand Off Time for more details.
     * @return builder
     */
    inline def start(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeStartArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceShiftCoverageCoverageTimeStartArgs.builder
      builder.start(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.Builder)
    /**
     * @param handOffTime (Required) The hand off time. See Hand Off Time for more details.
     * @return builder
     */
    inline def handOffTime(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingHandOffTimeArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceWeeklySettingHandOffTimeArgs.builder
      builder.handOffTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ContactsRotationState.Builder)
    /**
     * @param recurrence Information about when an on-call rotation is in effect and how long the rotation period lasts. Exactly one of either `dailySettings`, `monthlySettings`, or `weeklySettings` must be populated. See Recurrence for more details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def recurrence(args: Endofunction[com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ContactsRotationState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.DocumentState.Builder)
    /**
     * @param attachmentsSources One or more configuration blocks describing attachments sources to a version of a document. See `attachmentsSource` block below for details.
     * @return builder
     */
    inline def attachmentsSources(args: Endofunction[com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.DocumentState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs.builder
      builder.attachmentsSources(args.map(_(argsBuilder).build)*)

    /**
     * @param parameters One or more configuration blocks describing the parameters for the document. See `parameter` block below for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.ssm.inputs.DocumentParameterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.DocumentState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.DocumentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetInstancesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.GetInstancesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetInstancesPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesFilter.Builder]*):
        com.pulumi.aws.ssm.inputs.GetInstancesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsFilter.Builder]*):
        com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.Builder)
    /**
     * @param filters Key-value pairs used to filter the results. See `filter` below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.GetPatchBaselinesPlainArgs.Builder)
    /**
     * @param filters Key-value pairs used to filter the results. See `filter` below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesFilter.Builder]*):
        com.pulumi.aws.ssm.inputs.GetPatchBaselinesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetState.Builder)
    /**
     * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState.Builder)
    /**
     * @param targets The targets (either instances or window target IDs). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target IDs are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * @return builder
     */
    inline def targets(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

    /**
     * @param taskInvocationParameters Configuration block with parameters for task execution.
     * @return builder
     */
    inline def taskInvocationParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.builder
      builder.taskInvocationParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder)
    /**
     * @param automationParameters The parameters for an AUTOMATION task type. Documented below.
     * @return builder
     */
    inline def automationParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.builder
      builder.automationParameters(args(argsBuilder).build)

    /**
     * @param lambdaParameters The parameters for a LAMBDA task type. Documented below.
     * @return builder
     */
    inline def lambdaParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs.builder
      builder.lambdaParameters(args(argsBuilder).build)

    /**
     * @param runCommandParameters The parameters for a RUN_COMMAND task type. Documented below.
     * @return builder
     */
    inline def runCommandParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.builder
      builder.runCommandParameters(args(argsBuilder).build)

    /**
     * @param stepFunctionsParameters The parameters for a STEP_FUNCTIONS task type. Documented below.
     * @return builder
     */
    inline def stepFunctionsParameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs.builder
      builder.stepFunctionsParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.Builder)
    /**
     * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder)
    /**
     * @param cloudwatchConfig Configuration options for sending command output to CloudWatch Logs. Documented below.
     * @return builder
     */
    inline def cloudwatchConfig(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs.builder
      builder.cloudwatchConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * @return builder
     */
    inline def notificationConfig(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs.Builder]):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param parameters The parameters for the RUN_COMMAND task execution. Documented below.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder)
    /**
     * @param patchFilters Patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid combinations of these Keys and the `operatingSystem` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values. `PATCH_SET` defaults to `OS` if unspecified
     * @return builder
     */
    inline def patchFilters(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterArgs.builder
      builder.patchFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder)
    /**
     * @param approvalRules Set of rules used to include patches in the baseline. Up to 10 approval rules can be specified. See `approvalRule` below.
     * @return builder
     */
    inline def approvalRules(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRuleArgs.builder
      builder.approvalRules(args.map(_(argsBuilder).build)*)

    /**
     * @param globalFilters Set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     * @return builder
     */
    inline def globalFilters(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineGlobalFilterArgs.builder
      builder.globalFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param sources Configuration block with alternate sources for patches. Applies to Linux instances only. See `source` below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.PatchBaselineState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.PatchBaselineSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder)
    /**
     * @param configurationDefinition Definition of the Quick Setup configuration that the configuration manager deploys. See `configurationDefinition` below.
     * @return builder
     */
    inline def configurationDefinition(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.Builder]):
        com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerConfigurationDefinitionArgs.builder
      builder.configurationDefinition(args(argsBuilder).build)

    /**
     * @param statusSummaries A summary of the state of the configuration manager. This includes deployment statuses, association statuses, drift statuses, health checks, and more. See `statusSummaries` below.
     * @return builder
     */
    inline def statusSummaries(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerStatusSummaryArgs.Builder]*):
        com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder =
      def argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerStatusSummaryArgs.builder
      builder.statusSummaries(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.Builder]):
        com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.QuicksetupConfigurationManagerTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.Builder)
    /**
     * @param destinationDataSharing Enables destination data sharing.
     * See `destinationDataSharing` below.
     * @return builder
     */
    inline def destinationDataSharing(args: Endofunction[com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationDestinationDataSharingArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationDestinationDataSharingArgs.builder
      builder.destinationDataSharing(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssm.inputs.ResourceDataSyncState.Builder)
    /**
     * @param s3Destination Amazon S3 configuration details for the sync.
     * @return builder
     */
    inline def s3Destination(args: Endofunction[com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.Builder]):
        com.pulumi.aws.ssm.inputs.ResourceDataSyncState.Builder =
      val argsBuilder = com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)
