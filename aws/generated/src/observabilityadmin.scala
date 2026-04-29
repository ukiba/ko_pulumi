package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object observabilityadmin:
  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Pipeline.
   *  
   *  Telemetry pipelines allow you to collect, transform, and route telemetry data from AWS services. Each pipeline defines a source, optional processors, and one or more sinks for the telemetry data.
   *  
   *  For more information, see the [AWS CloudWatch Observability Admin Telemetry Pipelines documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   *  
   *  &gt; **NOTE:** Only one telemetry pipeline per data source type is allowed per account. For example, you can have one pipeline for `amazon_api_gateway/access` and another for `amazon_vpc/flow`, but not two pipelines for the same data source type.
   */
  def TelemetryPipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.observabilityadmin.TelemetryPipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder)
    /**
     * @param configuration Configuration block for the telemetry pipeline. See `configuration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Enrichment.
   *  
   *  Telemetry enrichment enables resource tags for telemetry data in your account, enhancing telemetry with additional resource metadata from AWS Resource Explorer to provide richer context for monitoring and observability.
   *  
   *  For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   *  
   *  &gt; **NOTE:** Only one telemetry enrichment can exist per account per region. Creating this resource enables the feature; destroying it disables the feature.
   */
  def TelemetryEnrichment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.builder
    
    com.pulumi.aws.observabilityadmin.TelemetryEnrichment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     * @param logGroupNameConfiguration Configuration block for a naming pattern for destination log groups created during centralization. See `logGroupNameConfiguration` below.
     * @return builder
     */
    def logGroupNameConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogGroupNameConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogGroupNameConfigurationArgs.builder
      builder.logGroupNameConfiguration(args(argsBuilder).build)

    /**
     * @param logsEncryptionConfiguration Configuration block for logs encryption settings. See `logsEncryptionConfiguration` below.
     * @return builder
     */
    def logsEncryptionConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogsEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogsEncryptionConfigurationArgs.builder
      builder.logsEncryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineState.Builder)
    /**
     * @param configuration Configuration block for the telemetry pipeline. See `configuration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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
