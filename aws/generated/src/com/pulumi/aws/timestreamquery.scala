package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object timestreamquery:
  extension (builder: com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder)
    /**
     * @param errorReportConfiguration Configuration block for error reporting configuration. See below.
     * @return builder
     */
    def errorReportConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationArgs.builder
      builder.errorReportConfiguration(args(argsBuilder).build)

    /**
     * @param lastRunSummaries Runtime summary for the last scheduled query run.
     * @return builder
     */
    def lastRunSummaries(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.Builder]*):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.builder
      builder.lastRunSummaries(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfiguration Configuration block for notification configuration for a scheduled query. A notification is sent by Timestream when a scheduled query is created, its state is updated, or when it is deleted. See below.
     * @return builder
     */
    def notificationConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationArgs.builder
      builder.notificationConfiguration(args(argsBuilder).build)

    /**
     * @param recentlyFailedRuns Runtime summary for the last five failed scheduled query runs.
     * @return builder
     */
    def recentlyFailedRuns(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.Builder]*):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.builder
      builder.recentlyFailedRuns(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduleConfiguration Configuration block for schedule configuration for the query. See below.
     * @return builder
     */
    def scheduleConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryScheduleConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryScheduleConfigurationArgs.builder
      builder.scheduleConfiguration(args(argsBuilder).build)

    /**
     * @param targetConfiguration Configuration block for writing the result of a query. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targetConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationArgs.builder
      builder.targetConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTimeoutsArgs.Builder]):
        com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Timestream Query Scheduled Query. */
  def ScheduledQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreamquery.ScheduledQueryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.timestreamquery.ScheduledQuery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunErrorReportLocationArgs.Builder)
    /**
     * @param s3ReportLocations S3 location where error reports are written.
     * @return builder
     */
    def s3ReportLocations(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunErrorReportLocationS3ReportLocationArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunErrorReportLocationArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunErrorReportLocationS3ReportLocationArgs.builder
      builder.s3ReportLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.Builder)
    /**
     * @param errorReportLocations S3 location for error report.
     * @return builder
     */
    def errorReportLocations(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunErrorReportLocationArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunErrorReportLocationArgs.builder
      builder.errorReportLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param executionStats Statistics for a single scheduled query run.
     * @return builder
     */
    def executionStats(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunExecutionStatArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunExecutionStatArgs.builder
      builder.executionStats(args.map(_(argsBuilder).build)*)

    /**
     * @param queryInsightsResponses Various insights and metrics related to the run summary of the scheduled query.
     * @return builder
     */
    def queryInsightsResponses(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseArgs.builder
      builder.queryInsightsResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMultiMeasureMappingsArgs.Builder)
    /**
     * @param multiMeasureAttributeMappings Attribute mappings to be used for mapping query results to ingest data for multi-measure attributes. See above.
     * @return builder
     */
    def multiMeasureAttributeMappings(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMultiMeasureMappingsMultiMeasureAttributeMappingArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMultiMeasureMappingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMultiMeasureMappingsMultiMeasureAttributeMappingArgs.builder
      builder.multiMeasureAttributeMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseArgs.Builder)
    /**
     * @param querySpatialCoverages Insights into the spatial coverage of the query, including the table with sub-optimal (max) spatial pruning. This information can help you identify areas for improvement in your partitioning strategy to enhance spatial pruning.
     * @return builder
     */
    def querySpatialCoverages(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQuerySpatialCoverageArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQuerySpatialCoverageArgs.builder
      builder.querySpatialCoverages(args.map(_(argsBuilder).build)*)

    /**
     * @param queryTemporalRanges Insights into the temporal range of the query, including the table with the largest (max) time range. Following are some of the potential options for optimizing time-based pruning: add missing time-predicates, remove functions around the time predicates, add time predicates to all the sub-queries.
     * @return builder
     */
    def queryTemporalRanges(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQueryTemporalRangeArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQueryTemporalRangeArgs.builder
      builder.queryTemporalRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationArgs.Builder)
    /**
     * @param snsConfiguration Configuration block for details about the Amazon Simple Notification Service (SNS) configuration. See below.
     * @return builder
     */
    def snsConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationSnsConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationSnsConfigurationArgs.builder
      builder.snsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseArgs.Builder)
    /**
     * @param querySpatialCoverages Insights into the spatial coverage of the query, including the table with sub-optimal (max) spatial pruning. This information can help you identify areas for improvement in your partitioning strategy to enhance spatial pruning.
     * @return builder
     */
    def querySpatialCoverages(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQuerySpatialCoverageArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQuerySpatialCoverageArgs.builder
      builder.querySpatialCoverages(args.map(_(argsBuilder).build)*)

    /**
     * @param queryTemporalRanges Insights into the temporal range of the query, including the table with the largest (max) time range. Following are some of the potential options for optimizing time-based pruning: add missing time-predicates, remove functions around the time predicates, add time predicates to all the sub-queries.
     * @return builder
     */
    def queryTemporalRanges(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQueryTemporalRangeArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQueryTemporalRangeArgs.builder
      builder.queryTemporalRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMixedMeasureMappingArgs.Builder)
    /**
     * @param multiMeasureAttributeMappings Configuration block for attribute mappings for `MULTI` value measures. Required when `measureValueType` is `MULTI`. See below.
     * @return builder
     */
    def multiMeasureAttributeMappings(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMixedMeasureMappingMultiMeasureAttributeMappingArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMixedMeasureMappingArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMixedMeasureMappingMultiMeasureAttributeMappingArgs.builder
      builder.multiMeasureAttributeMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.Builder)
    /**
     * @param errorReportLocations S3 location for error report.
     * @return builder
     */
    def errorReportLocations(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryErrorReportLocationArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryErrorReportLocationArgs.builder
      builder.errorReportLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param executionStats Statistics for a single scheduled query run.
     * @return builder
     */
    def executionStats(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryExecutionStatArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryExecutionStatArgs.builder
      builder.executionStats(args.map(_(argsBuilder).build)*)

    /**
     * @param queryInsightsResponses Various insights and metrics related to the run summary of the scheduled query.
     * @return builder
     */
    def queryInsightsResponses(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseArgs.builder
      builder.queryInsightsResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQueryTemporalRangeArgs.Builder)
    /**
     * @param maxes Insights into the most sub-optimal performing table on the temporal axis:
     * @return builder
     */
    def maxes(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQueryTemporalRangeMaxisArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQueryTemporalRangeArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQueryTemporalRangeMaxisArgs.builder
      builder.maxes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder)
    /**
     * @param errorReportConfiguration Configuration block for error reporting configuration. See below.
     * @return builder
     */
    def errorReportConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationArgs.builder
      builder.errorReportConfiguration(args(argsBuilder).build)

    /**
     * @param lastRunSummaries Runtime summary for the last scheduled query run.
     * @return builder
     */
    def lastRunSummaries(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryArgs.builder
      builder.lastRunSummaries(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfiguration Configuration block for notification configuration for a scheduled query. A notification is sent by Timestream when a scheduled query is created, its state is updated, or when it is deleted. See below.
     * @return builder
     */
    def notificationConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryNotificationConfigurationArgs.builder
      builder.notificationConfiguration(args(argsBuilder).build)

    /**
     * @param recentlyFailedRuns Runtime summary for the last five failed scheduled query runs.
     * @return builder
     */
    def recentlyFailedRuns(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunArgs.builder
      builder.recentlyFailedRuns(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduleConfiguration Configuration block for schedule configuration for the query. See below.
     * @return builder
     */
    def scheduleConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryScheduleConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryScheduleConfigurationArgs.builder
      builder.scheduleConfiguration(args(argsBuilder).build)

    /**
     * @param targetConfiguration Configuration block for writing the result of a query. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targetConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationArgs.builder
      builder.targetConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTimeoutsArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryState.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQuerySpatialCoverageArgs.Builder)
    /**
     * @param maxes Insights into the most sub-optimal performing table on the temporal axis:
     * @return builder
     */
    def maxes(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQuerySpatialCoverageMaxisArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQuerySpatialCoverageArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryRecentlyFailedRunQueryInsightsResponseQuerySpatialCoverageMaxisArgs.builder
      builder.maxes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryErrorReportLocationArgs.Builder)
    /**
     * @param s3ReportLocations S3 location where error reports are written.
     * @return builder
     */
    def s3ReportLocations(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryErrorReportLocationS3ReportLocationArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryErrorReportLocationArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryErrorReportLocationS3ReportLocationArgs.builder
      builder.s3ReportLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQueryTemporalRangeArgs.Builder)
    /**
     * @param maxes Insights into the most sub-optimal performing table on the temporal axis:
     * @return builder
     */
    def maxes(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQueryTemporalRangeMaxisArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQueryTemporalRangeArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQueryTemporalRangeMaxisArgs.builder
      builder.maxes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationArgs.Builder)
    /**
     * @param s3Configuration Configuration block for the S3 configuration for the error reports. See below.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryErrorReportConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationArgs.Builder)
    /**
     * @param timestreamConfiguration Configuration block for information needed to write data into the Timestream database and table. See below.
     * @return builder
     */
    def timestreamConfiguration(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationArgs.builder
      builder.timestreamConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQuerySpatialCoverageArgs.Builder)
    /**
     * @param maxes Insights into the most sub-optimal performing table on the temporal axis:
     * @return builder
     */
    def maxes(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQuerySpatialCoverageMaxisArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQuerySpatialCoverageArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryLastRunSummaryQueryInsightsResponseQuerySpatialCoverageMaxisArgs.builder
      builder.maxes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationArgs.Builder)
    /**
     * @param dimensionMappings Configuration block for mapping of column(s) from the query result to the dimension in the destination table. See below.
     * @return builder
     */
    def dimensionMappings(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationDimensionMappingArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationDimensionMappingArgs.builder
      builder.dimensionMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param mixedMeasureMappings Configuration block for how to map measures to multi-measure records. See below.
     * @return builder
     */
    def mixedMeasureMappings(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMixedMeasureMappingArgs.Builder]*):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMixedMeasureMappingArgs.builder
      builder.mixedMeasureMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param multiMeasureMappings Configuration block for multi-measure mappings. Only one of `mixedMeasureMappings` or `multiMeasureMappings` can be provided. `multiMeasureMappings` can be used to ingest data as multi measures in the derived table. See below.
     * @return builder
     */
    def multiMeasureMappings(args: Endofunction[com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMultiMeasureMappingsArgs.Builder]):
        com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreamquery.inputs.ScheduledQueryTargetConfigurationTimestreamConfigurationMultiMeasureMappingsArgs.builder
      builder.multiMeasureMappings(args(argsBuilder).build)
