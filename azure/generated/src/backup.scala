package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object backup:
  /** Manages an Azure Backup VM Backup Policy. */
  def PolicyVM(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.backup.PolicyVMArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.backup.PolicyVMArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.backup.PolicyVM(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure VM Workload Backup Policy within a Recovery Services vault. */
  def PolicyVMWorkload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.backup.PolicyVMWorkloadArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.backup.PolicyVMWorkload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.backup.PolicyFileShareArgs.Builder)
    /**
     * @param backup Configures the Policy backup frequency and times as documented in the `backup` block below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below.
     * @return builder
     */
    def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below.
     * @return builder
     */
    def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

  /** Manages an Azure File Share Backup Policy within a Recovery Services vault. */
  def PolicyFileShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.backup.PolicyFileShareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.backup.PolicyFileShareArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.backup.PolicyFileShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object BackupFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing File Share Backup Policy. */
    inline def getPolicyFileshare(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyFileshareArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.backup.outputs.GetPolicyFileshareResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyFileshareArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyFileshare(args(argsBuilder).build)

    /** Use this data source to access information about an existing File Share Backup Policy. */
    inline def getPolicyFilesharePlain(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyFilesharePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.backup.outputs.GetPolicyFileshareResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyFilesharePlainArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyFilesharePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing VM Backup Policy. */
    inline def getPolicyVM(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyVMArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.backup.outputs.GetPolicyVMResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyVMArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyVM(args(argsBuilder).build)

    /** Use this data source to access information about an existing VM Backup Policy. */
    inline def getPolicyVMPlain(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyVMPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.backup.outputs.GetPolicyVMResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyVMPlainArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyVMPlain(args(argsBuilder).build)

  /** Manages an Azure Backup Protected Virtual Machine. */
  def ProtectedVM(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.backup.ProtectedVMArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.backup.ProtectedVMArgs.builder
    com.pulumi.azure.backup.ProtectedVM(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.backup.PolicyVMArgs.Builder)
    /**
     * @param backup Configures the Policy backup frequency, times &amp; days as documented in the `backup` block below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param instantRestoreResourceGroup Specifies the instant restore resource group name as documented in the `instantRestoreResourceGroup` block below.
     * @return builder
     */
    def instantRestoreResourceGroup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.builder
      builder.instantRestoreResourceGroup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below. Required when backup frequency is `Daily`.
     * @return builder
     */
    def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below. Required when backup frequency is `Weekly`.
     * @return builder
     */
    def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

    /**
     * @param tieringPolicy A `tieringPolicy` block as defined below.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  /** Manages an Azure Backup Protected File Share to enable backups for file shares within an Azure Storage Account */
  def ProtectedFileShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.backup.ProtectedFileShareArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.backup.ProtectedFileShareArgs.builder
    com.pulumi.azure.backup.ProtectedFileShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages registration of a storage account with Azure Backup. Storage accounts must be registered with an Azure Recovery Vault in order to backup file shares within the storage account. Registering a storage account with a vault creates what is known as a protection container within Azure Recovery Services. Once the container is created, Azure file shares within the storage account can be backed up using the `azure.backup.ProtectedFileShare` resource. */
  def ContainerStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.backup.ContainerStorageAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.backup.ContainerStorageAccountArgs.builder
    com.pulumi.azure.backup.ContainerStorageAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder)
    /**
     * @param protectionPolicies One or more `protectionPolicy` blocks as defined below.
     * @return builder
     */
    def protectionPolicies(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder]*):
        com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder =
      def argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.builder
      builder.protectionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param settings A `settings` block as defined below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder)
    /**
     * @param hourly A `hourly` block defined as below. This is required when `frequency` is set to `Hourly`.
     * @return builder
     */
    def hourly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareBackupHourlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareBackupHourlyArgs.builder
      builder.hourly(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMWorkloadState.Builder)
    /**
     * @param protectionPolicies One or more `protectionPolicy` blocks as defined below.
     * @return builder
     */
    def protectionPolicies(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder]*):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadState.Builder =
      def argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.builder
      builder.protectionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param settings A `settings` block as defined below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMState.Builder)
    /**
     * @param backup Configures the Policy backup frequency, times &amp; days as documented in the `backup` block below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param instantRestoreResourceGroup Specifies the instant restore resource group name as documented in the `instantRestoreResourceGroup` block below.
     * @return builder
     */
    def instantRestoreResourceGroup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.builder
      builder.instantRestoreResourceGroup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below. Required when backup frequency is `Daily`.
     * @return builder
     */
    def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below. Required when backup frequency is `Weekly`.
     * @return builder
     */
    def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

    /**
     * @param tieringPolicy A `tieringPolicy` block as defined below.
     * @return builder
     */
    def tieringPolicy(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder)
    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyBackupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param retentionDaily A `retentionDaily` block as defined below.
     * @return builder
     */
    def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly A `retentionMonthly` block as defined below.
     * @return builder
     */
    def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly A `retentionWeekly` block as defined below.
     * @return builder
     */
    def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly A `retentionYearly` block as defined below.
     * @return builder
     */
    def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

    /**
     * @param simpleRetention A `simpleRetention` block as defined below.
     * @return builder
     */
    def simpleRetention(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicySimpleRetentionArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicySimpleRetentionArgs.builder
      builder.simpleRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder)
    /**
     * @param archivedRestorePoint An `archivedRestorePoint` block as defined below.
     * @return builder
     */
    def archivedRestorePoint(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArchivedRestorePointArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArchivedRestorePointArgs.builder
      builder.archivedRestorePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder)
    /**
     * @param backup Configures the Policy backup frequency and times as documented in the `backup` block below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below.
     * @return builder
     */
    def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below.
     * @return builder
     */
    def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)
