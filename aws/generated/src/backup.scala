package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object backup:
  extension (builder: com.pulumi.aws.backup.SelectionArgs.Builder)
    /**
     * @param conditions Condition-based filters used to specify sets of resources for a backup plan. See below for details.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder]*):
        com.pulumi.aws.backup.SelectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param selectionTags Tag-based conditions used to specify a set of resources to assign to a backup plan. See below for details.
     * @return builder
     */
    def selectionTags(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.Builder]*):
        com.pulumi.aws.backup.SelectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.builder
      builder.selectionTags(args.map(_(argsBuilder).build)*)

  /** Provides an AWS Backup Report Plan resource. */
  def ReportPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.ReportPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.ReportPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.backup.ReportPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.Builder]):
        com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Backup Restore Testing Plan. */
  def RestoreTestingPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.RestoreTestingPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.RestoreTestingPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.backup.RestoreTestingPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Backup Region Settings resource. */
  def RegionSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.RegionSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.backup.RegionSettingsArgs.builder
    
    com.pulumi.aws.backup.RegionSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Backup vault notifications resource. */
  def VaultNotifications(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultNotificationsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.backup.VaultNotificationsArgs.builder
    
    com.pulumi.aws.backup.VaultNotifications(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Backup vault lock configuration resource. */
  def VaultLockConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultLockConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.backup.VaultLockConfigurationArgs.builder
    
    com.pulumi.aws.backup.VaultLockConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages selection conditions for AWS Backup plan resources. */
  def Selection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.SelectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.SelectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.backup.Selection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Backup vault policy resource. */
  def VaultPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.backup.VaultPolicyArgs.builder
    
    com.pulumi.aws.backup.VaultPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Backup Restore Testing Selection. */
  def RestoreTestingSelection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.RestoreTestingSelectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.RestoreTestingSelectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.backup.RestoreTestingSelection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS Backup Framework resource.
   *  
   *  &gt; **Note:** For the Deployment Status of the Framework to be successful, please turn on resource tracking to enable AWS Config recording to track configuration changes of your backup resources. This can be done from the AWS Console.
   */
  def Framework(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.FrameworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.FrameworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.backup.Framework(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.backup.PlanArgs.Builder)
    /**
     * @param advancedBackupSettings An object that specifies backup options for each resource type.
     * @return builder
     */
    def advancedBackupSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.Builder]*):
        com.pulumi.aws.backup.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.builder
      builder.advancedBackupSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder]*):
        com.pulumi.aws.backup.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param scanSettings Block for scanning configuration for the backup rule and includes the malware scanner, and scan mode of either full or incremental. Detailed below.
     * @return builder
     */
    def scanSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanScanSettingArgs.Builder]*):
        com.pulumi.aws.backup.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanScanSettingArgs.builder
      builder.scanSettings(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS Backup Logically Air Gapped Vault. */
  def LogicallyAirGappedVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.backup.LogicallyAirGappedVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type BackupFunctions = com.pulumi.aws.backup.BackupFunctions
  object BackupFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.backup.BackupFunctions.*
  extension (self: BackupFunctions.type)
    /** Use this data source to get information on an existing backup framework. */
    def getFramework(args: Endofunction[com.pulumi.aws.backup.inputs.GetFrameworkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetFrameworkArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getFramework(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup framework. */
    def getFrameworkPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetFrameworkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetFrameworkPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getFrameworkPlain(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup plan. */
    def getPlan(args: Endofunction[com.pulumi.aws.backup.inputs.GetPlanArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetPlanArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getPlan(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup plan. */
    def getPlanPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetPlanPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getPlanPlain(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup report plan. */
    def getReportPlan(args: Endofunction[com.pulumi.aws.backup.inputs.GetReportPlanArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetReportPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetReportPlanArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getReportPlan(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup report plan. */
    def getReportPlanPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetReportPlanPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetReportPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetReportPlanPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getReportPlanPlain(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup selection. */
    def getSelection(args: Endofunction[com.pulumi.aws.backup.inputs.GetSelectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetSelectionResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetSelectionArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getSelection(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup selection. */
    def getSelectionPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetSelectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetSelectionResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetSelectionPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getSelectionPlain(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup vault. */
    def getVault(args: Endofunction[com.pulumi.aws.backup.inputs.GetVaultArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetVaultArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getVault(args(argsBuilder).build)

    /** Use this data source to get information on an existing backup vault. */
    def getVaultPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetVaultPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetVaultPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getVaultPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.RestoreTestingSelectionArgs.Builder)
    /**
     * @param protectedResourceConditions The conditions for the protected resource.
     * @return builder
     */
    def protectedResourceConditions(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder]):
        com.pulumi.aws.backup.RestoreTestingSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.builder
      builder.protectedResourceConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.ReportPlanArgs.Builder)
    /**
     * @param reportDeliveryChannel An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
     * @return builder
     */
    def reportDeliveryChannel(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.Builder]):
        com.pulumi.aws.backup.ReportPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.builder
      builder.reportDeliveryChannel(args(argsBuilder).build)

    /**
     * @param reportSetting An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
     * @return builder
     */
    def reportSetting(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.Builder]):
        com.pulumi.aws.backup.ReportPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.builder
      builder.reportSetting(args(argsBuilder).build)

  /** Provides an AWS Backup plan resource. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.PlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.PlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.backup.Plan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Backup vault resource. */
  def Vault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.VaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.backup.Vault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.backup.FrameworkArgs.Builder)
    /**
     * @param controls One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
     * @return builder
     */
    def controls(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder]*):
        com.pulumi.aws.backup.FrameworkArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlArgs.builder
      builder.controls(args.map(_(argsBuilder).build)*)

  /**
   * Provides an AWS Backup Global Settings resource.
   *  
   *  &gt; **Note:** This resource will show perpetual differences for any supported settings not explicitly configured in the `globalSettings` configuration block. To avoid this, specify all supported options with their default values (typically `&#34;false&#34;`, but check the plan diff for the actual value). See [UpdateGlobalSettings](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_UpdateGlobalSettings.html) in the AWS Backup Developer Guide for available settings.
   */
  def GlobalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.GlobalSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.backup.GlobalSettingsArgs.builder
    
    com.pulumi.aws.backup.GlobalSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.backup.RestoreTestingPlanArgs.Builder)
    /**
     * @param recoveryPointSelection Specifies the recovery point selection configuration. See RecoveryPointSelection section for more details.
     * @return builder
     */
    def recoveryPointSelection(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.Builder]):
        com.pulumi.aws.backup.RestoreTestingPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.builder
      builder.recoveryPointSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.ReportPlanState.Builder)
    /**
     * @param reportDeliveryChannel An object that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. Detailed below.
     * @return builder
     */
    def reportDeliveryChannel(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.Builder]):
        com.pulumi.aws.backup.inputs.ReportPlanState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportDeliveryChannelArgs.builder
      builder.reportDeliveryChannel(args(argsBuilder).build)

    /**
     * @param reportSetting An object that identifies the report template for the report. Reports are built using a report template. Detailed below.
     * @return builder
     */
    def reportSetting(args: Endofunction[com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.Builder]):
        com.pulumi.aws.backup.inputs.ReportPlanState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.ReportPlanReportSettingArgs.builder
      builder.reportSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder)
    /**
     * @param stringEquals Filters the values of your tagged resources for only those resources that you tagged with the same value. Also called &#34;exact matching&#34;. See below for details.
     * @return builder
     */
    def stringEquals(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs.builder
      builder.stringEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param stringLikes Filters the values of your tagged resources for matching tag values with the use of a wildcard character (`*`) anywhere in the string. For example, `prod*` or `*rod*` matches the tag value `production`. See below for details.
     * @return builder
     */
    def stringLikes(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs.builder
      builder.stringLikes(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEquals Filters the values of your tagged resources for only those resources that you tagged that do not have the same value. Also called &#34;negated matching&#34;. See below for details.
     * @return builder
     */
    def stringNotEquals(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs.builder
      builder.stringNotEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotLikes Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (`*`) anywhere in the string. See below for details.
     * @return builder
     */
    def stringNotLikes(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs.builder
      builder.stringNotLikes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.Builder]):
        com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.LogicallyAirGappedVaultTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.RestoreTestingSelectionState.Builder)
    /**
     * @param protectedResourceConditions The conditions for the protected resource.
     * @return builder
     */
    def protectedResourceConditions(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder]):
        com.pulumi.aws.backup.inputs.RestoreTestingSelectionState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.builder
      builder.protectedResourceConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.Builder)
    /**
     * @param lifecycle The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * @return builder
     */
    def lifecycle(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleCopyActionLifecycleArgs.Builder]):
        com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleCopyActionLifecycleArgs.builder
      builder.lifecycle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.PlanState.Builder)
    /**
     * @param advancedBackupSettings An object that specifies backup options for each resource type.
     * @return builder
     */
    def advancedBackupSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingArgs.builder
      builder.advancedBackupSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param rules A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param scanSettings Block for scanning configuration for the backup rule and includes the malware scanner, and scan mode of either full or incremental. Detailed below.
     * @return builder
     */
    def scanSettings(args: Endofunction[com.pulumi.aws.backup.inputs.PlanScanSettingArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanScanSettingArgs.builder
      builder.scanSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder)
    /**
     * @param stringEquals The list of string equals conditions for resource tags. Filters the values of your tagged resources for only those resources that you tagged with the same value. Also called &#34;exact matching.&#34;. See the structure for details
     * @return builder
     */
    def stringEquals(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringEqualArgs.builder
      builder.stringEquals(args.map(_(argsBuilder).build)*)

    /**
     * @param stringNotEquals The list of string not equals conditions for resource tags. Filters the values of your tagged resources for only those resources that you tagged that do not have the same value. Also called &#34;negated matching.&#34;. See the structure for details
     * @return builder
     */
    def stringNotEquals(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringNotEqualArgs.Builder]*):
        com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingSelectionProtectedResourceConditionsStringNotEqualArgs.builder
      builder.stringNotEquals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.FrameworkState.Builder)
    /**
     * @param controls One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
     * @return builder
     */
    def controls(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder]*):
        com.pulumi.aws.backup.inputs.FrameworkState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlArgs.builder
      builder.controls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.SelectionState.Builder)
    /**
     * @param conditions Condition-based filters used to specify sets of resources for a backup plan. See below for details.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionConditionArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param selectionTags Tag-based conditions used to specify a set of resources to assign to a backup plan. See below for details.
     * @return builder
     */
    def selectionTags(args: Endofunction[com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.Builder]*):
        com.pulumi.aws.backup.inputs.SelectionState.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.SelectionSelectionTagArgs.builder
      builder.selectionTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.RestoreTestingPlanState.Builder)
    /**
     * @param recoveryPointSelection Specifies the recovery point selection configuration. See RecoveryPointSelection section for more details.
     * @return builder
     */
    def recoveryPointSelection(args: Endofunction[com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.Builder]):
        com.pulumi.aws.backup.inputs.RestoreTestingPlanState.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.RestoreTestingPlanRecoveryPointSelectionArgs.builder
      builder.recoveryPointSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder)
    /**
     * @param copyActions Configuration block(s) with copy operation settings. Detailed below.
     * @return builder
     */
    def copyActions(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleCopyActionArgs.builder
      builder.copyActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.  Fields documented below.
     * @return builder
     */
    def lifecycle(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleLifecycleArgs.Builder]):
        com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleLifecycleArgs.builder
      builder.lifecycle(args(argsBuilder).build)

    /**
     * @param scanActions Block for scanning configuration for the backup rule and includes the malware scanner, and scan mode of either full or incremental.
     * @return builder
     */
    def scanActions(args: Endofunction[com.pulumi.aws.backup.inputs.PlanRuleScanActionArgs.Builder]*):
        com.pulumi.aws.backup.inputs.PlanRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.PlanRuleScanActionArgs.builder
      builder.scanActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder)
    /**
     * @param inputParameters One or more input parameter blocks. An example of a control with two parameters is: &#34;backup plan frequency is at least daily and the retention period is at least 1 year&#34;. The first parameter is daily. The second parameter is 1 year. Detailed below.
     * @return builder
     */
    def inputParameters(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlInputParameterArgs.Builder]*):
        com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlInputParameterArgs.builder
      builder.inputParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param scope The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans. Detailed below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.backup.inputs.FrameworkControlScopeArgs.Builder]):
        com.pulumi.aws.backup.inputs.FrameworkControlArgs.Builder =
      val argsBuilder = com.pulumi.aws.backup.inputs.FrameworkControlScopeArgs.builder
      builder.scope(args(argsBuilder).build)
