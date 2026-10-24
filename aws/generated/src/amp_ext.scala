package jp.ukiba.ko_pulumi
package aws

object amp_ext:
  extension (builder: com.pulumi.aws.amp.AnomalyDetectorArgs.Builder)
    /**
     * @param configuration Configuration block for the anomaly detector algorithm. See `configuration` below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationArgs.Builder]):
        com.pulumi.aws.amp.AnomalyDetectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param missingDataAction Configuration block for the action to take when data is missing. See `missingDataAction` below.
     * @return builder
     */
    def missingDataAction(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorMissingDataActionArgs.Builder]):
        com.pulumi.aws.amp.AnomalyDetectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorMissingDataActionArgs.builder
      builder.missingDataAction(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.AnomalyDetectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder)
    /**
     * @param destinations Configuration block for the logging destinations. See `destination` Block.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder]*):
        com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.QueryLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.ResourcePolicyArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.ResourcePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.ScraperArgs.Builder)
    /**
     * @param destination Configuration block for the managed scraper to send metrics to. See `destination` Block for details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param exporter Configuration block for additional exporters. See `exporter` Block for details.
     * @return builder
     */
    def exporter(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperExporterArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperExporterArgs.builder
      builder.exporter(args(argsBuilder).build)

    /**
     * @param roleConfiguration Configuration block to enable writing to an Amazon Managed Service for Prometheus workspace in a different account. See `roleConfiguration` Block for details.
     * @return builder
     */
    def roleConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.builder
      builder.roleConfiguration(args(argsBuilder).build)

    /**
     * @param source Configuration block to specify where the managed scraper will collect metrics from. See `source` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.ScraperArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.ScraperLoggingConfigurationArgs.Builder)
    /**
     * @param loggingDestination Configuration block for the logging destination. See `loggingDestination` Block below.
     * @return builder
     */
    def loggingDestination(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationArgs.Builder]):
        com.pulumi.aws.amp.ScraperLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationArgs.builder
      builder.loggingDestination(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.ScraperLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.WorkspaceArgs.Builder)
    /**
     * @param loggingConfiguration Logging configuration for the workspace. See `loggingConfiguration` Block below for details.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.amp.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder)
    /**
     * @param limitsPerLabelSets Configuration block for setting limits on metrics with specific label sets. Detailed below.
     * @return builder
     */
    def limitsPerLabelSets(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder]*):
        com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.builder
      builder.limitsPerLabelSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.WorkspaceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationArgs.Builder)
    /**
     * @param randomCutForest Configuration block for the Random Cut Forest anomaly detection algorithm. See `randomCutForest` below.
     * @return builder
     */
    def randomCutForest(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestArgs.Builder]):
        com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestArgs.builder
      builder.randomCutForest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestArgs.Builder)
    /**
     * @param ignoreNearExpectedFromAbove Configuration block for suppressing anomalies when the observed value is slightly above the expected value. See `ignoreNearExpectedFromAbove` below.
     * @return builder
     */
    def ignoreNearExpectedFromAbove(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestIgnoreNearExpectedFromAboveArgs.Builder]):
        com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestIgnoreNearExpectedFromAboveArgs.builder
      builder.ignoreNearExpectedFromAbove(args(argsBuilder).build)

    /**
     * @param ignoreNearExpectedFromBelow Configuration block for suppressing anomalies when the observed value is slightly below the expected value. See `ignoreNearExpectedFromBelow` below.
     * @return builder
     */
    def ignoreNearExpectedFromBelow(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestIgnoreNearExpectedFromBelowArgs.Builder]):
        com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationRandomCutForestIgnoreNearExpectedFromBelowArgs.builder
      builder.ignoreNearExpectedFromBelow(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.AnomalyDetectorState.Builder)
    /**
     * @param configuration Configuration block for the anomaly detector algorithm. See `configuration` below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationArgs.Builder]):
        com.pulumi.aws.amp.inputs.AnomalyDetectorState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param missingDataAction Configuration block for the action to take when data is missing. See `missingDataAction` below.
     * @return builder
     */
    def missingDataAction(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorMissingDataActionArgs.Builder]):
        com.pulumi.aws.amp.inputs.AnomalyDetectorState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorMissingDataActionArgs.builder
      builder.missingDataAction(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.AnomalyDetectorTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.AnomalyDetectorState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.AnomalyDetectorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block for CloudWatch Logs destination. See `cloudwatchLogs` Block.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param filters List of filter configurations that specify which logs should be sent to the destination. See `filters` Block.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationFiltersArgs.Builder]):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.QueryLoggingConfigurationState.Builder)
    /**
     * @param destinations Configuration block for the logging destinations. See `destination` Block.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.Builder]*):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.QueryLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.QueryLoggingConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ResourcePolicyState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.ResourcePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ResourcePolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder)
    /**
     * @param amp Configuration block for an Amazon Managed Prometheus workspace destination. See `amp` Block for details.
     * @return builder
     */
    def amp(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationAmpArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationAmpArgs.builder
      builder.amp(args(argsBuilder).build)

    /**
     * @param cloudwatch Configuration block for a CloudWatch Metrics destination. See `cloudwatch` Block for details.
     * 
     * &gt; **NOTE:** Either `amp` or `cloudwatch` must be specified, but not both.
     * @return builder
     */
    def cloudwatch(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationCloudwatchArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationCloudwatchArgs.builder
      builder.cloudwatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperExporterArgs.Builder)
    /**
     * @param opensearch Configuration block for an OpenSearch exporter. See `opensearch` Block for details.
     * @return builder
     */
    def opensearch(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperExporterOpensearchArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperExporterArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperExporterOpensearchArgs.builder
      builder.opensearch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block for CloudWatch Logs destination. See `cloudwatchLogs` Block below.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationState.Builder)
    /**
     * @param loggingDestination Configuration block for the logging destination. See `loggingDestination` Block below.
     * @return builder
     */
    def loggingDestination(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationLoggingDestinationArgs.builder
      builder.loggingDestination(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperLoggingConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder)
    /**
     * @param eks Configuration block for an EKS cluster source. See `eks` Block for details.
     * @return builder
     */
    def eks(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceEksArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceEksArgs.builder
      builder.eks(args(argsBuilder).build)

    /**
     * @param vpc Configuration block for a VPC source. See `vpc` Block for details.
     * 
     * &gt; **NOTE:** Either `eks` or `vpc` must be specified, but not both.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceVpcArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.ScraperState.Builder)
    /**
     * @param destination Configuration block for the managed scraper to send metrics to. See `destination` Block for details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperDestinationArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param exporter Configuration block for additional exporters. See `exporter` Block for details.
     * @return builder
     */
    def exporter(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperExporterArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperExporterArgs.builder
      builder.exporter(args(argsBuilder).build)

    /**
     * @param roleConfiguration Configuration block to enable writing to an Amazon Managed Service for Prometheus workspace in a different account. See `roleConfiguration` Block for details.
     * @return builder
     */
    def roleConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperRoleConfigurationArgs.builder
      builder.roleConfiguration(args(argsBuilder).build)

    /**
     * @param source Configuration block to specify where the managed scraper will collect metrics from. See `source` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperSourceArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperSourceArgs.builder
      builder.source(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.ScraperState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.ScraperTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder)
    /**
     * @param limits Configuration block for the limits to apply to the specified label set. Detailed below.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetLimitsArgs.Builder]):
        com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.WorkspaceConfigurationState.Builder)
    /**
     * @param limitsPerLabelSets Configuration block for setting limits on metrics with specific label sets. Detailed below.
     * @return builder
     */
    def limitsPerLabelSets(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.Builder]*):
        com.pulumi.aws.amp.inputs.WorkspaceConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationLimitsPerLabelSetArgs.builder
      builder.limitsPerLabelSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.amp.inputs.WorkspaceConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.amp.inputs.WorkspaceState.Builder)
    /**
     * @param loggingConfiguration Logging configuration for the workspace. See `loggingConfiguration` Block below for details.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.amp.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.amp.inputs.WorkspaceLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)
