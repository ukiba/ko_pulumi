package jp.ukiba.ko_pulumi
package aws

object observabilityadmin_ext:
  extension (builder: com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder)
    /**
     * @param rule Configuration block for the centralization rule. See `rule` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.CentralizationRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder)
    /**
     * @param encryption Encryption configuration block. Documented below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.S3TableIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEnrichmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEvaluationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryEvaluationForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder)
    /**
     * @param configuration Configuration block for the telemetry pipeline. See `configuration` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryPipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder)
    /**
     * @param rule Configuration block for the telemetry rule. See `rule` below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder)
    /**
     * @param rule Configuration block for the organization telemetry rule. See `rule` below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.TelemetryRuleForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder)
    /**
     * @param destination Configuration block for the destination where telemetry will be centralized. See `destination` below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Configuration block for the source of logs to be centralized. See `source` below.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder)
    /**
     * @param destinationLogsConfiguration Configuration block for destination logs settings. See `destinationLogsConfiguration` below.
     * @return builder
     */
    inline def destinationLogsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.builder
      builder.destinationLogsConfiguration(args(argsBuilder).build)

    /**
     * @param destinationMetricsConfiguration Configuration block for destination metrics settings. See `destinationMetricsConfiguration` below.
     * @return builder
     */
    inline def destinationMetricsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.builder
      builder.destinationMetricsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder)
    /**
     * @param backupConfiguration Configuration block for backup settings. See `backupConfiguration` below.
     * @return builder
     */
    inline def backupConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationBackupConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationBackupConfigurationArgs.builder
      builder.backupConfiguration(args(argsBuilder).build)

    /**
     * @param logGroupNameConfiguration Configuration block for a naming pattern for destination log groups created during centralization. See `logGroupNameConfiguration` below.
     * @return builder
     */
    inline def logGroupNameConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogGroupNameConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogGroupNameConfigurationArgs.builder
      builder.logGroupNameConfiguration(args(argsBuilder).build)

    /**
     * @param logsEncryptionConfiguration Configuration block for logs encryption settings. See `logsEncryptionConfiguration` below.
     * @return builder
     */
    inline def logsEncryptionConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogsEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationLogsEncryptionConfigurationArgs.builder
      builder.logsEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param tagPropagationConfiguration Configuration block for propagating source resource tags to centralized destination log groups. See `tagPropagationConfiguration` below.
     * @return builder
     */
    inline def tagPropagationConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationTagPropagationConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationLogsConfigurationTagPropagationConfigurationArgs.builder
      builder.tagPropagationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.Builder)
    /**
     * @param backupConfiguration Configuration block for metrics backup settings. See `destinationMetricsBackupConfiguration` below.
     * @return builder
     */
    inline def backupConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationBackupConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleDestinationDestinationMetricsConfigurationBackupConfigurationArgs.builder
      builder.backupConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder)
    /**
     * @param sourceLogsConfiguration Configuration block for source logs settings. See `sourceLogsConfiguration` below.
     * @return builder
     */
    inline def sourceLogsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceLogsConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceLogsConfigurationArgs.builder
      builder.sourceLogsConfiguration(args(argsBuilder).build)

    /**
     * @param sourceMetricsConfiguration Configuration block for source metrics settings. See `sourceMetricsConfiguration` below.
     * @return builder
     */
    inline def sourceMetricsConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleSourceSourceMetricsConfigurationArgs.Builder]):
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
    inline def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.CentralizationRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationState.Builder)
    /**
     * @param encryption Encryption configuration block. Documented below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.S3TableIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEnrichmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryEvaluationTimeoutsArgs.Builder]):
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
    inline def configuration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryPipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder)
    /**
     * @param destinationConfiguration Configuration block specifying where and how the telemetry data is delivered. See `destinationConfiguration` below.
     * @return builder
     */
    inline def destinationConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder)
    /**
     * @param cloudtrailParameters CloudTrail-specific parameters when CloudTrail is the source. See `cloudtrailParameters` below.
     * @return builder
     */
    inline def cloudtrailParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.builder
      builder.cloudtrailParameters(args(argsBuilder).build)

    /**
     * @param elbLoadBalancerLoggingParameters ELB load balancer logging parameters when the resource is an ELB. See `elbLoadBalancerLoggingParameters` below.
     * @return builder
     */
    inline def elbLoadBalancerLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.builder
      builder.elbLoadBalancerLoggingParameters(args(argsBuilder).build)

    /**
     * @param logDeliveryParameters Amazon Bedrock AgentCore log delivery parameters. See `logDeliveryParameters` below.
     * @return builder
     */
    inline def logDeliveryParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationLogDeliveryParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationLogDeliveryParametersArgs.builder
      builder.logDeliveryParameters(args(argsBuilder).build)

    /**
     * @param mskMonitoringParameters Amazon MSK cluster monitoring parameters. See `mskMonitoringParameters` below.
     * @return builder
     */
    inline def mskMonitoringParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationMskMonitoringParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationMskMonitoringParametersArgs.builder
      builder.mskMonitoringParameters(args(argsBuilder).build)

    /**
     * @param vpcFlowLogParameters VPC Flow Logs-specific parameters when the resource is `AWS::EC2::VPC`. See `vpcFlowLogParameters` below.
     * @return builder
     */
    inline def vpcFlowLogParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationVpcFlowLogParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationVpcFlowLogParametersArgs.builder
      builder.vpcFlowLogParameters(args(argsBuilder).build)

    /**
     * @param wafLoggingParameters WAF logging parameters when the resource is `AWS::WAFv2::WebACL`. See `wafLoggingParameters` below.
     * @return builder
     */
    inline def wafLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.builder
      builder.wafLoggingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors List of field selectors that compose the selector statement. See `fieldSelectors` below.
     * @return builder
     */
    inline def fieldSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.Builder)
    /**
     * @param advancedEventSelectors List of advanced event selectors used to filter CloudTrail events. See `advancedEventSelectors` below.
     * @return builder
     */
    inline def advancedEventSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder)
    /**
     * @param loggingFilter Filter configuration that determines which WAF log records to include or exclude. See `loggingFilter` below.
     * @return builder
     */
    inline def loggingFilter(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.builder
      builder.loggingFilter(args(argsBuilder).build)

    /**
     * @param redactedFields List of fields to redact from WAF logs. See `redactedFields` below.
     * @return builder
     */
    inline def redactedFields(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.builder
      builder.redactedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder)
    /**
     * @param filters List of filter configurations. See `filters` below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder)
    /**
     * @param conditions Conditions that determine if a log record matches this filter. See `conditions` below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder)
    /**
     * @param actionCondition Condition that matches based on the WAF action. See `actionCondition` below.
     * @return builder
     */
    inline def actionCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.builder
      builder.actionCondition(args(argsBuilder).build)

    /**
     * @param labelNameCondition Condition that matches based on WAF rule labels. See `labelNameCondition` below.
     * @return builder
     */
    inline def labelNameCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.builder
      builder.labelNameCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder)
    /**
     * @param singleHeader Redact a specific header by name from WAF logs. See `singleHeader` below.
     * @return builder
     */
    inline def singleHeader(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationState.Builder)
    /**
     * @param rule Configuration block for the organization telemetry rule. See `rule` below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleForOrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder)
    /**
     * @param destinationConfiguration Configuration block specifying where and how the telemetry data is delivered. See `destinationConfiguration` below.
     * @return builder
     */
    inline def destinationConfiguration(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder)
    /**
     * @param cloudtrailParameters CloudTrail-specific parameters when CloudTrail is the source. See `cloudtrailParameters` below.
     * @return builder
     */
    inline def cloudtrailParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.builder
      builder.cloudtrailParameters(args(argsBuilder).build)

    /**
     * @param elbLoadBalancerLoggingParameters ELB load balancer logging parameters when the resource is an ELB. See `elbLoadBalancerLoggingParameters` below.
     * @return builder
     */
    inline def elbLoadBalancerLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationElbLoadBalancerLoggingParametersArgs.builder
      builder.elbLoadBalancerLoggingParameters(args(argsBuilder).build)

    /**
     * @param logDeliveryParameters Amazon Bedrock AgentCore log delivery parameters. See `logDeliveryParameters` below.
     * @return builder
     */
    inline def logDeliveryParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationLogDeliveryParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationLogDeliveryParametersArgs.builder
      builder.logDeliveryParameters(args(argsBuilder).build)

    /**
     * @param mskMonitoringParameters Amazon MSK cluster monitoring parameters. See `mskMonitoringParameters` below.
     * @return builder
     */
    inline def mskMonitoringParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationMskMonitoringParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationMskMonitoringParametersArgs.builder
      builder.mskMonitoringParameters(args(argsBuilder).build)

    /**
     * @param vpcFlowLogParameters VPC Flow Logs-specific parameters when the resource is `AWS::EC2::VPC`. See `vpcFlowLogParameters` below.
     * @return builder
     */
    inline def vpcFlowLogParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationVpcFlowLogParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationVpcFlowLogParametersArgs.builder
      builder.vpcFlowLogParameters(args(argsBuilder).build)

    /**
     * @param wafLoggingParameters WAF logging parameters when the resource is `AWS::WAFv2::WebACL`. See `wafLoggingParameters` below.
     * @return builder
     */
    inline def wafLoggingParameters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.builder
      builder.wafLoggingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors List of field selectors that compose the selector statement. See `fieldSelectors` below.
     * @return builder
     */
    inline def fieldSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.Builder)
    /**
     * @param advancedEventSelectors List of advanced event selectors used to filter CloudTrail events. See `advancedEventSelectors` below.
     * @return builder
     */
    inline def advancedEventSelectors(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationCloudtrailParametersAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder)
    /**
     * @param loggingFilter Filter configuration that determines which WAF log records to include or exclude. See `loggingFilter` below.
     * @return builder
     */
    inline def loggingFilter(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.builder
      builder.loggingFilter(args(argsBuilder).build)

    /**
     * @param redactedFields List of fields to redact from WAF logs. See `redactedFields` below.
     * @return builder
     */
    inline def redactedFields(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.builder
      builder.redactedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder)
    /**
     * @param filters List of filter configurations. See `filters` below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder)
    /**
     * @param conditions Conditions that determine if a log record matches this filter. See `conditions` below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder]*):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder)
    /**
     * @param actionCondition Condition that matches based on the WAF action. See `actionCondition` below.
     * @return builder
     */
    inline def actionCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionActionConditionArgs.builder
      builder.actionCondition(args(argsBuilder).build)

    /**
     * @param labelNameCondition Condition that matches based on WAF rule labels. See `labelNameCondition` below.
     * @return builder
     */
    inline def labelNameCondition(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersLoggingFilterFilterConditionLabelNameConditionArgs.builder
      builder.labelNameCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder)
    /**
     * @param singleHeader Redact a specific header by name from WAF logs. See `singleHeader` below.
     * @return builder
     */
    inline def singleHeader(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleDestinationConfigurationWafLoggingParametersRedactedFieldSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleState.Builder)
    /**
     * @param rule Configuration block for the telemetry rule. See `rule` below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.Builder]):
        com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleState.Builder =
      val argsBuilder = com.pulumi.aws.observabilityadmin.inputs.TelemetryRuleTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
