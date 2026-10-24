package jp.ukiba.ko_pulumi
package azure

object backup_ext:
  extension (builder: com.pulumi.azure.backup.PolicyFileShareArgs.Builder)
    /**
     * @param backup Configures the Policy backup frequency and times as documented in the `backup` block below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below.
     * @return builder
     */
    inline def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    inline def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below.
     * @return builder
     */
    inline def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    inline def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyFileShareArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.PolicyVMArgs.Builder)
    /**
     * @param backup Configures the Policy backup frequency, times &amp; days as documented in the `backup` block below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param instantRestoreResourceGroup Specifies the instant restore resource group name as documented in the `instantRestoreResourceGroup` block below.
     * @return builder
     */
    inline def instantRestoreResourceGroup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.builder
      builder.instantRestoreResourceGroup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below. Required when backup frequency is `Daily`.
     * @return builder
     */
    inline def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    inline def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below. Required when backup frequency is `Weekly`.
     * @return builder
     */
    inline def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    inline def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

    /**
     * @param tieringPolicy A `tieringPolicy` block as defined below.
     * @return builder
     */
    inline def tieringPolicy(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder)
    /**
     * @param protectionPolicies One or more `protectionPolicy` blocks as defined below.
     * @return builder
     */
    inline def protectionPolicies(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder]*):
        com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder =
      def argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.builder
      builder.protectionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param settings A `settings` block as defined below.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.Builder]):
        com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder)
    /**
     * @param hourly A `hourly` block defined as below. This is required when `frequency` is set to `Hourly`.
     * @return builder
     */
    inline def hourly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareBackupHourlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareBackupHourlyArgs.builder
      builder.hourly(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder)
    /**
     * @param backup Configures the Policy backup frequency and times as documented in the `backup` block below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below.
     * @return builder
     */
    inline def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    inline def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below.
     * @return builder
     */
    inline def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    inline def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyFileShareState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyFileShareRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMState.Builder)
    /**
     * @param backup Configures the Policy backup frequency, times &amp; days as documented in the `backup` block below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param instantRestoreResourceGroup Specifies the instant restore resource group name as documented in the `instantRestoreResourceGroup` block below.
     * @return builder
     */
    inline def instantRestoreResourceGroup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMInstantRestoreResourceGroupArgs.builder
      builder.instantRestoreResourceGroup(args(argsBuilder).build)

    /**
     * @param retentionDaily Configures the policy daily retention as documented in the `retentionDaily` block below. Required when backup frequency is `Daily`.
     * @return builder
     */
    inline def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly Configures the policy monthly retention as documented in the `retentionMonthly` block below.
     * @return builder
     */
    inline def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly Configures the policy weekly retention as documented in the `retentionWeekly` block below. Required when backup frequency is `Weekly`.
     * @return builder
     */
    inline def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly Configures the policy yearly retention as documented in the `retentionYearly` block below.
     * @return builder
     */
    inline def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

    /**
     * @param tieringPolicy A `tieringPolicy` block as defined below.
     * @return builder
     */
    inline def tieringPolicy(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.builder
      builder.tieringPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder)
    /**
     * @param archivedRestorePoint An `archivedRestorePoint` block as defined below.
     * @return builder
     */
    inline def archivedRestorePoint(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArchivedRestorePointArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMTieringPolicyArchivedRestorePointArgs.builder
      builder.archivedRestorePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder)
    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    inline def backup(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyBackupArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    /**
     * @param retentionDaily A `retentionDaily` block as defined below.
     * @return builder
     */
    inline def retentionDaily(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionDailyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionDailyArgs.builder
      builder.retentionDaily(args(argsBuilder).build)

    /**
     * @param retentionMonthly A `retentionMonthly` block as defined below.
     * @return builder
     */
    inline def retentionMonthly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs.builder
      builder.retentionMonthly(args(argsBuilder).build)

    /**
     * @param retentionWeekly A `retentionWeekly` block as defined below.
     * @return builder
     */
    inline def retentionWeekly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs.builder
      builder.retentionWeekly(args(argsBuilder).build)

    /**
     * @param retentionYearly A `retentionYearly` block as defined below.
     * @return builder
     */
    inline def retentionYearly(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs.builder
      builder.retentionYearly(args(argsBuilder).build)

    /**
     * @param simpleRetention A `simpleRetention` block as defined below.
     * @return builder
     */
    inline def simpleRetention(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicySimpleRetentionArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicySimpleRetentionArgs.builder
      builder.simpleRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.backup.inputs.PolicyVMWorkloadState.Builder)
    /**
     * @param protectionPolicies One or more `protectionPolicy` blocks as defined below.
     * @return builder
     */
    inline def protectionPolicies(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.Builder]*):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadState.Builder =
      def argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyArgs.builder
      builder.protectionPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param settings A `settings` block as defined below.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.Builder]):
        com.pulumi.azure.backup.inputs.PolicyVMWorkloadState.Builder =
      val argsBuilder = com.pulumi.azure.backup.inputs.PolicyVMWorkloadSettingsArgs.builder
      builder.settings(args(argsBuilder).build)
