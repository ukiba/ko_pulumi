package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object automanage:
  extension (builder: com.pulumi.azure.automanage.ConfigurationArgs.Builder)
    /**
     * @param antimalware A `antimalware` block as defined below.
     * @return builder
     */
    def antimalware(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareArgs.Builder]):
        com.pulumi.azure.automanage.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareArgs.builder
      builder.antimalware(args(argsBuilder).build)

    /**
     * @param azureSecurityBaseline A `azureSecurityBaseline` block as defined below.
     * @return builder
     */
    def azureSecurityBaseline(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationAzureSecurityBaselineArgs.Builder]):
        com.pulumi.azure.automanage.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationAzureSecurityBaselineArgs.builder
      builder.azureSecurityBaseline(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.Builder]):
        com.pulumi.azure.automanage.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automanage.ConfigurationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Automanage Configuration. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automanage.ConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automanage.ConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automanage.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyArgs.Builder)
    /**
     * @param dailySchedule A `dailySchedule` block as defined below.
     * @return builder
     */
    def dailySchedule(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyDailyScheduleArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule A `weeklySchedule` block as defined below.
     * @return builder
     */
    def weeklySchedule(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyDailyScheduleArgs.Builder)
    /**
     * @param retentionDuration A `retentionDuration` block as defined below.
     * @return builder
     */
    def retentionDuration(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyDailyScheduleRetentionDurationArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyDailyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyDailyScheduleRetentionDurationArgs.builder
      builder.retentionDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automanage.inputs.ConfigurationState.Builder)
    /**
     * @param antimalware A `antimalware` block as defined below.
     * @return builder
     */
    def antimalware(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareArgs.builder
      builder.antimalware(args(argsBuilder).build)

    /**
     * @param azureSecurityBaseline A `azureSecurityBaseline` block as defined below.
     * @return builder
     */
    def azureSecurityBaseline(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationAzureSecurityBaselineArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationAzureSecurityBaselineArgs.builder
      builder.azureSecurityBaseline(args(argsBuilder).build)

    /**
     * @param backup A `backup` block as defined below.
     * @return builder
     */
    def backup(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.builder
      builder.backup(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automanage.inputs.ConfigurationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.Builder)
    /**
     * @param retentionPolicy A `retentionPolicy` block as defined below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param schedulePolicy A `schedulePolicy` block as defined below.
     * @return builder
     */
    def schedulePolicy(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupSchedulePolicyArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupSchedulePolicyArgs.builder
      builder.schedulePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleArgs.Builder)
    /**
     * @param retentionDuration A `retentionDuration` block as defined below.
     * @return builder
     */
    def retentionDuration(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs.builder
      builder.retentionDuration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareArgs.Builder)
    /**
     * @param exclusions A `exclusions` block as defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareExclusionsArgs.Builder]):
        com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareArgs.Builder =
      val argsBuilder = com.pulumi.azure.automanage.inputs.ConfigurationAntimalwareExclusionsArgs.builder
      builder.exclusions(args(argsBuilder).build)
