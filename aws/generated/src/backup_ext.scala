package jp.ukiba.ko_pulumi
package aws

object backup_ext:
  extension (builder: com.pulumi.aws.backup.FrameworkArgs.Builder)
    /**
     * @param controls One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
     * @return builder
     */
    inline def controls(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder]*):
        com.pulumi.aws.backup.FrameworkArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlArgs.builder
      builder.controls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.Builder]):
        com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.PlanArgs.Builder)
    /**
     * @param advancedBackupSettings Object that specifies backup options for each resource type. Detailed below.
     * @return builder
     */
    inline def advancedBackupSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.Builder]*):
        com.pulumi.aws.backup.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.builder
      builder.advancedBackupSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param rules Rule that specifies a scheduled task used to back up a selection of resources. Detailed below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder]*):
        com.pulumi.aws.backup.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param scanSettings Block for scanning configuration for the backup rule and includes the malware scanner, and scan mode of either full or incremental. Detailed below.
     * @return builder
     */
    inline def scanSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanScanSettingArgs.Builder]*):
        com.pulumi.aws.backup.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanScanSettingArgs.builder
      builder.scanSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.ReportPlanArgs.Builder)
    /**
     * @param reportDeliveryChannel Object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
     * @return builder
     */
    inline def reportDeliveryChannel(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.Builder]):
        com.pulumi.aws.backup.ReportPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.builder
      builder.reportDeliveryChannel(args(argsBuilder).build)

    /**
     * @param reportSetting Object that identifies the report template for the report. Reports are built using a report template. Detailed below.
     * @return builder
     */
    inline def reportSetting(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.Builder]):
        com.pulumi.aws.backup.ReportPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.builder
      builder.reportSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.RestoreTestingPlanArgs.Builder)
    /**
     * @param recoveryPointSelection Recovery point selection configuration. See `recoveryPointSelection` below.
     * @return builder
     */
    inline def recoveryPointSelection(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.Builder]):
        com.pulumi.aws.backup.RestoreTestingPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.builder
      builder.recoveryPointSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.RestoreTestingSelectionArgs.Builder)
    /**
     * @param protectedResourceConditions Conditions for the protected resource. See `protectedResourceConditions` below.
     * @return builder
     */
    inline def protectedResourceConditions(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder]):
        com.pulumi.aws.backup.RestoreTestingSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.builder
      builder.protectedResourceConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.SelectionArgs.Builder)
    /**
     * @param conditions Condition-based filters used to specify sets of resources for a backup plan. See below for details.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder]*):
        com.pulumi.aws.backup.SelectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param selectionTags Tag-based conditions used to specify a set of resources to assign to a backup plan. See below for details.
     * @return builder
     */
    inline def selectionTags(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.Builder]*):
        com.pulumi.aws.backup.SelectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.builder
      builder.selectionTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder)
    /**
     * @param inputParameters One or more input parameter blocks. An example of a control with two parameters is: &#34;backup plan frequency is at least daily and the retention period is at least 1 year&#34;. The first parameter is daily. The second parameter is 1 year. Detailed below.
     * @return builder
     */
    inline def inputParameters(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlInputParameterArgs.Builder]*):
        com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param scope Scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. Detailed below.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlScopeArgs.Builder]):
        com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.FrameworkState.Builder)
    /**
     * @param controls One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
     * @return builder
     */
    inline def controls(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder]*):
        com.pulumi.aws.backup.inputs.FrameworkState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlArgs.builder
      builder.controls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.Builder]):
        com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder)
    /**
     * @param copyActions Configuration block(s) with copy operation settings. Detailed below.
     * @return builder
     */
    inline def copyActions(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.builder
      builder.copyActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycle Lifecycle that defines when a protected resource is transitioned to cold storage and when it expires. Detailed below.
     * @return builder
     */
    inline def lifecycle(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleLifecycleArgs.Builder]):
        com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleLifecycleArgs.builder
      builder.lifecycle(args(argsBuilder).build)

    /**
     * @param scanActions Block for scanning configuration for the backup rule and includes the malware scanner, and scan mode of either full or incremental. Detailed below.
     * @return builder
     */
    inline def scanActions(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleScanActionArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleScanActionArgs.builder
      builder.scanActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.Builder)
    /**
     * @param lifecycle Lifecycle that defines when a protected resource is copied over to a backup vault and when it expires. Detailed below.
     * @return builder
     */
    inline def lifecycle(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleCopyActionLifecycleArgs.Builder]):
        com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleCopyActionLifecycleArgs.builder
      builder.lifecycle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.PlanState.Builder)
    /**
     * @param advancedBackupSettings Object that specifies backup options for each resource type. Detailed below.
     * @return builder
     */
    inline def advancedBackupSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.builder
      builder.advancedBackupSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param rules Rule that specifies a scheduled task used to back up a selection of resources. Detailed below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param scanSettings Block for scanning configuration for the backup rule and includes the malware scanner, and scan mode of either full or incremental. Detailed below.
     * @return builder
     */
    inline def scanSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanScanSettingArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanScanSettingArgs.builder
      builder.scanSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.ReportPlanState.Builder)
    /**
     * @param reportDeliveryChannel Object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
     * @return builder
     */
    inline def reportDeliveryChannel(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.Builder]):
        com.pulumi.aws.backup.inputs.ReportPlanState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.builder
      builder.reportDeliveryChannel(args(argsBuilder).build)

    /**
     * @param reportSetting Object that identifies the report template for the report. Reports are built using a report template. Detailed below.
     * @return builder
     */
    inline def reportSetting(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.Builder]):
        com.pulumi.aws.backup.inputs.ReportPlanState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.builder
      builder.reportSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.RestoreTestingPlanState.Builder)
    /**
     * @param recoveryPointSelection Recovery point selection configuration. See `recoveryPointSelection` below.
     * @return builder
     */
    inline def recoveryPointSelection(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.Builder]):
        com.pulumi.aws.backup.inputs.RestoreTestingPlanState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.builder
      builder.recoveryPointSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder)
    /**
     * @param stringEquals List of string equals conditions for resource tags. Filters the values of your tagged resources for only those resources that you tagged with the same value. Also called &#34;exact matching.&#34;. See `stringEquals` below.
     * @return builder
     */
    inline def stringEquals(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringEqualArgs.builder
      builder.stringEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEquals List of string not equals conditions for resource tags. Filters the values of your tagged resources for only those resources that you tagged that do not have the same value. Also called &#34;negated matching.&#34;. See `stringNotEquals` below.
     * @return builder
     */
    inline def stringNotEquals(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringNotEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringNotEqualArgs.builder
      builder.stringNotEquals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.RestoreTestingSelectionState.Builder)
    /**
     * @param protectedResourceConditions Conditions for the protected resource. See `protectedResourceConditions` below.
     * @return builder
     */
    inline def protectedResourceConditions(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder]):
        com.pulumi.aws.backup.inputs.RestoreTestingSelectionState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.builder
      builder.protectedResourceConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder)
    /**
     * @param stringEquals Filters the values of your tagged resources for only those resources that you tagged with the same value. Also called &#34;exact matching&#34;. See below for details.
     * @return builder
     */
    inline def stringEquals(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs.builder
      builder.stringEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param stringLikes Filters the values of your tagged resources for matching tag values with the use of a wildcard character (`*`) anywhere in the string. For example, `prod*` or `*rod*` matches the tag value `production`. See below for details.
     * @return builder
     */
    inline def stringLikes(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs.builder
      builder.stringLikes(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEquals Filters the values of your tagged resources for only those resources that you tagged that do not have the same value. Also called &#34;negated matching&#34;. See below for details.
     * @return builder
     */
    inline def stringNotEquals(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs.builder
      builder.stringNotEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotLikes Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (`*`) anywhere in the string. See below for details.
     * @return builder
     */
    inline def stringNotLikes(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs.builder
      builder.stringNotLikes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.SelectionState.Builder)
    /**
     * @param conditions Condition-based filters used to specify sets of resources for a backup plan. See below for details.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param selectionTags Tag-based conditions used to specify a set of resources to assign to a backup plan. See below for details.
     * @return builder
     */
    inline def selectionTags(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.builder
      builder.selectionTags(args.map(_(argsBuilder).build)*)
