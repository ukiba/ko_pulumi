package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object observabilityadmin:
  /**
   * Manages an AWS CloudWatch Observability Admin Centralization Rule For Organization.
   *  
   *  Centralization rules enable you to centralize log data from multiple AWS accounts and regions within your organization to a single destination account and region. This helps with log management, compliance, and cost optimization by consolidating logs in a central location.
   *  
   *  This requires an AWS account within an organization with at least [delegated administrator permissions](https://docs.aws.amazon.com/organizations/latest/APIReference/API_RegisterDelegatedAdministrator.html).
   */
  def CentralizationRuleForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder)
    /**
     * @param rule Configuration block for the centralization rule. See `rule` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder)
    /**
     * @param backupConfiguration Configuration block for backup settings. See `backupConfiguration` below.
     * @return builder
     */
    def backupConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationBackupConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationBackupConfigurationArgs.builder
      builder.backupConfiguration(args(argsBuilder).build)

    /**
     * @param logsEncryptionConfiguration Configuration block for logs encryption settings. See `logsEncryptionConfiguration` below.
     * @return builder
     */
    def logsEncryptionConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogsEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogsEncryptionConfigurationArgs.builder
      builder.logsEncryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder)
    /**
     * @param destination Configuration block for the destination where logs will be centralized. See `destination` below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Configuration block for the source of logs to be centralized. See `source` below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder)
    /**
     * @param sourceLogsConfiguration Configuration block for source logs settings. See `sourceLogsConfiguration` below.
     * @return builder
     */
    def sourceLogsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceLogsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceLogsConfigurationArgs.builder
      builder.sourceLogsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder)
    /**
     * @param destinationLogsConfiguration Configuration block for destination logs settings. See `destinationLogsConfiguration` below.
     * @return builder
     */
    def destinationLogsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.builder
      builder.destinationLogsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationState.Builder)
    /**
     * @param rule Configuration block for the centralization rule. See `rule` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
