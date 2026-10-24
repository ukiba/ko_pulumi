package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object backup:
  object BackupFunctions:
    /** Use this data source to get information on an existing backup framework. */
    inline def getFramework(args: Endofunction[com.pulumi.aws.backup.inputs.GetFrameworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetFrameworkArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getFramework(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing backup framework. */
    inline def getFrameworkPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetFrameworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetFrameworkPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getFrameworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on an existing backup plan. */
    inline def getPlan(args: Endofunction[com.pulumi.aws.backup.inputs.GetPlanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetPlanArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getPlan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing backup plan. */
    inline def getPlanPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetPlanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getPlanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on an existing backup report plan. */
    inline def getReportPlan(args: Endofunction[com.pulumi.aws.backup.inputs.GetReportPlanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetReportPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetReportPlanArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getReportPlan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing backup report plan. */
    inline def getReportPlanPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetReportPlanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetReportPlanResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetReportPlanPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getReportPlanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on an existing backup selection. */
    inline def getSelection(args: Endofunction[com.pulumi.aws.backup.inputs.GetSelectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetSelectionResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetSelectionArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getSelection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing backup selection. */
    inline def getSelectionPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetSelectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetSelectionResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetSelectionPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getSelectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on an existing backup vault. */
    inline def getVault(args: Endofunction[com.pulumi.aws.backup.inputs.GetVaultArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.backup.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetVaultArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getVault(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing backup vault. */
    inline def getVaultPlain(args: Endofunction[com.pulumi.aws.backup.inputs.GetVaultPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.backup.outputs.GetVaultResult] =
      val argsBuilder = com.pulumi.aws.backup.inputs.GetVaultPlainArgs.builder
      com.pulumi.aws.backup.BackupFunctions.getVaultPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides an AWS Backup Framework resource.
   * 
   * &gt; **Note:** For the Deployment Status of the Framework to be successful, please turn on resource tracking to enable AWS Config recording to track configuration changes of your backup resources. This can be done from the AWS Console.
   */
  def Framework(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.FrameworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.FrameworkArgs.builder
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
    com.pulumi.aws.backup.Framework(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an AWS Backup Global Settings resource.
   * 
   * &gt; **Note:** This resource will show perpetual differences for any supported settings not explicitly configured in the `globalSettings` configuration block. To avoid this, specify all supported options with their default values (typically `&#34;false&#34;`, but check the plan diff for the actual value). See [UpdateGlobalSettings](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_UpdateGlobalSettings.html) in the AWS Backup Developer Guide for available settings.
   */
  def GlobalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.GlobalSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.backup.GlobalSettingsArgs.builder
    com.pulumi.aws.backup.GlobalSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Backup Logically Air Gapped Vault. */
  def LogicallyAirGappedVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.LogicallyAirGappedVaultArgs.builder
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
    com.pulumi.aws.backup.LogicallyAirGappedVault(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup plan resource. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.PlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.PlanArgs.builder
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
    com.pulumi.aws.backup.Plan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup Region Settings resource. */
  def RegionSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.RegionSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.backup.RegionSettingsArgs.builder
    com.pulumi.aws.backup.RegionSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup Report Plan resource. */
  def ReportPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.ReportPlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.ReportPlanArgs.builder
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
    com.pulumi.aws.backup.ReportPlan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Backup Restore Testing Plan. */
  def RestoreTestingPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.RestoreTestingPlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.RestoreTestingPlanArgs.builder
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
    com.pulumi.aws.backup.RestoreTestingPlan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Backup Restore Testing Selection. */
  def RestoreTestingSelection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.RestoreTestingSelectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.RestoreTestingSelectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.backup.RestoreTestingSelection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages selection conditions for AWS Backup plan resources. */
  def Selection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.SelectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.SelectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.backup.Selection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup vault resource. */
  def Vault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.backup.VaultArgs.builder
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
    com.pulumi.aws.backup.Vault(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup vault lock configuration resource. */
  def VaultLockConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultLockConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.backup.VaultLockConfigurationArgs.builder
    com.pulumi.aws.backup.VaultLockConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup vault notifications resource. */
  def VaultNotifications(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultNotificationsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.backup.VaultNotificationsArgs.builder
    com.pulumi.aws.backup.VaultNotifications(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS Backup vault policy resource. */
  def VaultPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.backup.VaultPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.backup.VaultPolicyArgs.builder
    com.pulumi.aws.backup.VaultPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
