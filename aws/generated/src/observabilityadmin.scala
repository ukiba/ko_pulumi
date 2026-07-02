package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object observabilityadmin:
  /**
   * Manages an AWS CloudWatch Observability Admin Centralization Rule For Organization.
   * 
   * Centralization rules enable you to centralize log data from multiple AWS accounts and regions within your organization to a single destination account and region. This helps with log management, compliance, and cost optimization by consolidating logs in a central location.
   * 
   * This requires an AWS account within an organization with at least [delegated administrator permissions](https://docs.aws.amazon.com/organizations/latest/APIReference/API_RegisterDelegatedAdministrator.html).
   */
  def CentralizationRuleForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganization(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder)
    /**
     * @param rule Configuration block for the centralization rule. See `rule` below.
     * 
     * The following arguments are optional:
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

  /**
   * Manages a CloudWatch Observability Admin S3 Table Integration. This integration enables CloudWatch to duplicate telemetry data to Amazon S3 Tables, making it available for analysis by tools such as Amazon Athena and Amazon Redshift.
   * 
   * For more information, see the [CloudWatch Logs S3 Tables integration documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/s3-tables-integration.html).
   */
  def S3TableIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.S3TableIntegration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder)
    /**
     * @param encryption Encryption configuration block. Documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Enrichment.
   * 
   * Telemetry enrichment enables resource tags for telemetry data in your account, enhancing telemetry with additional resource metadata from AWS Resource Explorer to provide richer context for monitoring and observability.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** Only one telemetry enrichment can exist per account per region. Creating this resource enables the feature; destroying it disables the feature.
   */
  def TelemetryEnrichment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.builder
    com.pulumi.aws.observabilityadmin.TelemetryEnrichment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Evaluation.
   * 
   * Telemetry evaluation begins onboarding the caller AWS account to the telemetry config feature, enabling CloudWatch to evaluate and discover the state of telemetry configuration for your AWS resources.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** Only one telemetry evaluation can exist per account per region. Creating this resource enables the feature; destroying it disables the feature.
   * 
   * &gt; **NOTE:** Do not use this resource in an account where telemetry evaluation is centrally managed by an AWS Organization via `aws.observabilityadmin.TelemetryEvaluationForOrganization`. In that case, the per-account `StartTelemetryEvaluation` API silently returns success without changing per-account state, and `GetTelemetryEvaluationStatus` reports the org-derived `RUNNING` status \u2014 so `pulumi up` appears to succeed. However, the matching `StopTelemetryEvaluation` call is rejected with `ValidationException: Telemetry evaluation is managed by the caller&#39;s organization`, so a later `terraform destroy` will fail and leave the resource in state. Use the organization variant from the management account instead.
   */
  def TelemetryEvaluation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.builder
    com.pulumi.aws.observabilityadmin.TelemetryEvaluation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Evaluation For Organization.
   * 
   * Telemetry evaluation for organization begins onboarding the organization and all member accounts to the telemetry config feature, enabling CloudWatch to evaluate and discover the state of telemetry configuration for AWS resources across the organization.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** This resource can only be used from the management account or a delegated admin account of an AWS Organization. Only one telemetry evaluation for organization can exist per organization. Creating this resource enables the feature; destroying it disables the feature.
   */
  def TelemetryEvaluationForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.builder
    com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Pipeline.
   * 
   * Telemetry pipelines allow you to collect, transform, and route telemetry data from AWS services. Each pipeline defines a source, optional processors, and one or more sinks for the telemetry data.
   * 
   * For more information, see the [AWS CloudWatch Observability Admin Telemetry Pipelines documentation](https://docs.aws.amazon.com/cloudwatch/latest/observabilityadmin/what-is-observabilityadmin.html).
   * 
   * &gt; **NOTE:** Only one telemetry pipeline per data source type is allowed per account. For example, you can have one pipeline for `amazon_api_gateway/access` and another for `amazon_vpc/flow`, but not two pipelines for the same data source type.
   */
  def TelemetryPipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.builder
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
    com.pulumi.aws.observabilityadmin.TelemetryPipeline(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder)
    /**
     * @param configuration Configuration block for the telemetry pipeline. See `configuration` below.
     * 
     * The following arguments are optional:
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
   * Manages an AWS CloudWatch Observability Admin Telemetry Rule.
   * 
   * A telemetry rule defines how telemetry data (logs, metrics, or traces) should be collected for AWS resources within an AWS account. The rule can target one or more Regions and optionally configure a destination (such as CloudWatch Logs or S3) along with source-specific parameters for VPC flow logs, WAF logs, CloudTrail events, ELB access logs, and more.
   * 
   * &gt; **NOTE:** Before using this resource, telemetry evaluation must be enabled for your AWS account. Use the `aws.observabilityadmin.TelemetryEvaluation` resource to enable it.
   */
  def TelemetryRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.TelemetryRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder)
    /**
     * @param rule Configuration block for the telemetry rule. See `rule` below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS CloudWatch Observability Admin Telemetry Rule for an AWS Organization.
   * 
   * An organization-wide telemetry rule defines how telemetry data (logs, metrics, or traces) should be collected for AWS resources across the accounts in your organization. The rule can target one or more Regions and configure a destination (such as CloudWatch Logs or S3) along with source-specific parameters for VPC flow logs, WAF logs, CloudTrail events, ELB access logs, and more.
   * 
   * &gt; **NOTE:** Before using this resource, telemetry evaluation for organization must be enabled. Use the `aws.observabilityadmin.TelemetryEvaluationForOrganization` resource to enable it.
   * 
   * &gt; **NOTE:** This resource can only be used from the organization management account.
   */
  def TelemetryRuleForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganization(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder)
    /**
     * @param rule Configuration block for the organization telemetry rule. See `rule` below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder)
    /**
     * @param destination Configuration block for the destination where telemetry will be centralized. See `destination` below.
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

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder)
    /**
     * @param destinationLogsConfiguration Configuration block for destination logs settings. See `destinationLogsConfiguration` below.
     * @return builder
     */
    def destinationLogsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.builder
      builder.destinationLogsConfiguration(args(argsBuilder).build)

    /**
     * @param destinationMetricsConfiguration Configuration block for destination metrics settings. See `destinationMetricsConfiguration` below.
     * @return builder
     */
    def destinationMetricsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.builder
      builder.destinationMetricsConfiguration(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.Builder)
    /**
     * @param backupConfiguration Configuration block for metrics backup settings. See `destinationMetricsBackupConfiguration` below.
     * @return builder
     */
    def backupConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationBackupConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationBackupConfigurationArgs.builder
      builder.backupConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder)
    /**
     * @param sourceLogsConfiguration Configuration block for source logs settings. See `sourceLogsConfiguration` below.
     * @return builder
     */
    def sourceLogsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceLogsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceLogsConfigurationArgs.builder
      builder.sourceLogsConfiguration(args(argsBuilder).build)

    /**
     * @param sourceMetricsConfiguration Configuration block for source metrics settings. See `sourceMetricsConfiguration` below.
     * @return builder
     */
    def sourceMetricsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceMetricsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceMetricsConfigurationArgs.builder
      builder.sourceMetricsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationState.Builder)
    /**
     * @param rule Configuration block for the centralization rule. See `rule` below.
     * 
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationState.Builder)
    /**
     * @param encryption Encryption configuration block. Documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineState.Builder)
    /**
     * @param configuration Configuration block for the telemetry pipeline. See `configuration` below.
     * 
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder)
    /**
     * @param destinationConfiguration Configuration block specifying where and how the telemetry data is delivered. See `destinationConfiguration` below.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder)
    /**
     * @param cloudtrailParameters CloudTrail-specific parameters when CloudTrail is the source. See `cloudtrailParameters` below.
     * @return builder
     */
    def cloudtrailParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.builder
      builder.cloudtrailParameters(args(argsBuilder).build)

    /**
     * @param elbLoadBalancerLoggingParameters ELB load balancer logging parameters when the resource is an ELB. See `elbLoadBalancerLoggingParameters` below.
     * @return builder
     */
    def elbLoadBalancerLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.builder
      builder.elbLoadBalancerLoggingParameters(args(argsBuilder).build)

    /**
     * @param logDeliveryParameters Amazon Bedrock AgentCore log delivery parameters. See `logDeliveryParameters` below.
     * @return builder
     */
    def logDeliveryParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationLogDeliveryParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationLogDeliveryParametersArgs.builder
      builder.logDeliveryParameters(args(argsBuilder).build)

    /**
     * @param mskMonitoringParameters Amazon MSK cluster monitoring parameters. See `mskMonitoringParameters` below.
     * @return builder
     */
    def mskMonitoringParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationMskMonitoringParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationMskMonitoringParametersArgs.builder
      builder.mskMonitoringParameters(args(argsBuilder).build)

    /**
     * @param vpcFlowLogParameters VPC Flow Logs-specific parameters when the resource is `AWS::EC2::VPC`. See `vpcFlowLogParameters` below.
     * @return builder
     */
    def vpcFlowLogParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationVpcFlowLogParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationVpcFlowLogParametersArgs.builder
      builder.vpcFlowLogParameters(args(argsBuilder).build)

    /**
     * @param wafLoggingParameters WAF logging parameters when the resource is `AWS::WAFv2::WebACL`. See `wafLoggingParameters` below.
     * @return builder
     */
    def wafLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.builder
      builder.wafLoggingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors List of field selectors that compose the selector statement. See `fieldSelectors` below.
     * @return builder
     */
    def fieldSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.Builder)
    /**
     * @param advancedEventSelectors List of advanced event selectors used to filter CloudTrail events. See `advancedEventSelectors` below.
     * @return builder
     */
    def advancedEventSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder)
    /**
     * @param loggingFilter Filter configuration that determines which WAF log records to include or exclude. See `loggingFilter` below.
     * @return builder
     */
    def loggingFilter(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.builder
      builder.loggingFilter(args(argsBuilder).build)

    /**
     * @param redactedFields List of fields to redact from WAF logs. See `redactedFields` below.
     * @return builder
     */
    def redactedFields(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.builder
      builder.redactedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder)
    /**
     * @param filters List of filter configurations. See `filters` below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder)
    /**
     * @param conditions Conditions that determine if a log record matches this filter. See `conditions` below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder)
    /**
     * @param actionCondition Condition that matches based on the WAF action. See `actionCondition` below.
     * @return builder
     */
    def actionCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.builder
      builder.actionCondition(args(argsBuilder).build)

    /**
     * @param labelNameCondition Condition that matches based on WAF rule labels. See `labelNameCondition` below.
     * @return builder
     */
    def labelNameCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.builder
      builder.labelNameCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder)
    /**
     * @param singleHeader Redact a specific header by name from WAF logs. See `singleHeader` below.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationState.Builder)
    /**
     * @param rule Configuration block for the organization telemetry rule. See `rule` below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder)
    /**
     * @param destinationConfiguration Configuration block specifying where and how the telemetry data is delivered. See `destinationConfiguration` below.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder)
    /**
     * @param cloudtrailParameters CloudTrail-specific parameters when CloudTrail is the source. See `cloudtrailParameters` below.
     * @return builder
     */
    def cloudtrailParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.builder
      builder.cloudtrailParameters(args(argsBuilder).build)

    /**
     * @param elbLoadBalancerLoggingParameters ELB load balancer logging parameters when the resource is an ELB. See `elbLoadBalancerLoggingParameters` below.
     * @return builder
     */
    def elbLoadBalancerLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.builder
      builder.elbLoadBalancerLoggingParameters(args(argsBuilder).build)

    /**
     * @param logDeliveryParameters Amazon Bedrock AgentCore log delivery parameters. See `logDeliveryParameters` below.
     * @return builder
     */
    def logDeliveryParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationLogDeliveryParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationLogDeliveryParametersArgs.builder
      builder.logDeliveryParameters(args(argsBuilder).build)

    /**
     * @param mskMonitoringParameters Amazon MSK cluster monitoring parameters. See `mskMonitoringParameters` below.
     * @return builder
     */
    def mskMonitoringParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationMskMonitoringParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationMskMonitoringParametersArgs.builder
      builder.mskMonitoringParameters(args(argsBuilder).build)

    /**
     * @param vpcFlowLogParameters VPC Flow Logs-specific parameters when the resource is `AWS::EC2::VPC`. See `vpcFlowLogParameters` below.
     * @return builder
     */
    def vpcFlowLogParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationVpcFlowLogParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationVpcFlowLogParametersArgs.builder
      builder.vpcFlowLogParameters(args(argsBuilder).build)

    /**
     * @param wafLoggingParameters WAF logging parameters when the resource is `AWS::WAFv2::WebACL`. See `wafLoggingParameters` below.
     * @return builder
     */
    def wafLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.builder
      builder.wafLoggingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors List of field selectors that compose the selector statement. See `fieldSelectors` below.
     * @return builder
     */
    def fieldSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.Builder)
    /**
     * @param advancedEventSelectors List of advanced event selectors used to filter CloudTrail events. See `advancedEventSelectors` below.
     * @return builder
     */
    def advancedEventSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder)
    /**
     * @param loggingFilter Filter configuration that determines which WAF log records to include or exclude. See `loggingFilter` below.
     * @return builder
     */
    def loggingFilter(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.builder
      builder.loggingFilter(args(argsBuilder).build)

    /**
     * @param redactedFields List of fields to redact from WAF logs. See `redactedFields` below.
     * @return builder
     */
    def redactedFields(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.builder
      builder.redactedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder)
    /**
     * @param filters List of filter configurations. See `filters` below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder)
    /**
     * @param conditions Conditions that determine if a log record matches this filter. See `conditions` below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder)
    /**
     * @param actionCondition Condition that matches based on the WAF action. See `actionCondition` below.
     * @return builder
     */
    def actionCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.builder
      builder.actionCondition(args(argsBuilder).build)

    /**
     * @param labelNameCondition Condition that matches based on WAF rule labels. See `labelNameCondition` below.
     * @return builder
     */
    def labelNameCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.builder
      builder.labelNameCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder)
    /**
     * @param singleHeader Redact a specific header by name from WAF logs. See `singleHeader` below.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleState.Builder)
    /**
     * @param rule Configuration block for the telemetry rule. See `rule` below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
