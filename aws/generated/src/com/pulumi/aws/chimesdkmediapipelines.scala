package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object chimesdkmediapipelines:
  extension (builder: com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder)
    /**
     * @param elements Collection of processors and sinks to transform media and deliver data.
     * @return builder
     */
    def elements(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder]*):
        com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

    /**
     * @param realTimeAlertConfiguration Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
     * @return builder
     */
    def realTimeAlertConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.builder
      builder.realTimeAlertConfiguration(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Chime SDK Media Pipelines Media Insights Pipeline Configuration.
   *  Consult the [Call analytics developer guide](https://docs.aws.amazon.com/chime-sdk/latest/dg/call-analytics.html) for more detailed information about usage.
   */
  def MediaInsightsPipelineConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder)
    /**
     * @param amazonTranscribeCallAnalyticsProcessorConfiguration Configuration for Amazon Transcribe Call Analytics processor.
     * @return builder
     */
    def amazonTranscribeCallAnalyticsProcessorConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.builder
      builder.amazonTranscribeCallAnalyticsProcessorConfiguration(args(argsBuilder).build)

    /**
     * @param amazonTranscribeProcessorConfiguration Configuration for Amazon Transcribe processor.
     * @return builder
     */
    def amazonTranscribeProcessorConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfigurationArgs.builder
      builder.amazonTranscribeProcessorConfiguration(args(argsBuilder).build)

    /**
     * @param kinesisDataStreamSinkConfiguration Configuration for Kinesis Data Stream sink.
     * @return builder
     */
    def kinesisDataStreamSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs.builder
      builder.kinesisDataStreamSinkConfiguration(args(argsBuilder).build)

    /**
     * @param lambdaFunctionSinkConfiguration Configuration for Lambda Function sink.
     * @return builder
     */
    def lambdaFunctionSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementLambdaFunctionSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementLambdaFunctionSinkConfigurationArgs.builder
      builder.lambdaFunctionSinkConfiguration(args(argsBuilder).build)

    /**
     * @param s3RecordingSinkConfiguration Configuration for S3 recording sink.
     * @return builder
     */
    def s3RecordingSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementS3RecordingSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementS3RecordingSinkConfigurationArgs.builder
      builder.s3RecordingSinkConfiguration(args(argsBuilder).build)

    /**
     * @param snsTopicSinkConfiguration Configuration for SNS Topic sink.
     * @return builder
     */
    def snsTopicSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs.builder
      builder.snsTopicSinkConfiguration(args(argsBuilder).build)

    /**
     * @param sqsQueueSinkConfiguration Configuration for SQS Queue sink.
     * @return builder
     */
    def sqsQueueSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSqsQueueSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSqsQueueSinkConfigurationArgs.builder
      builder.sqsQueueSinkConfiguration(args(argsBuilder).build)

    /**
     * @param voiceAnalyticsProcessorConfiguration Configuration for Voice analytics processor.
     * @return builder
     */
    def voiceAnalyticsProcessorConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementVoiceAnalyticsProcessorConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementVoiceAnalyticsProcessorConfigurationArgs.builder
      builder.voiceAnalyticsProcessorConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.Builder)
    /**
     * @param postCallAnalyticsSettings Settings for post call analytics.
     * @return builder
     */
    def postCallAnalyticsSettings(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettingsArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettingsArgs.builder
      builder.postCallAnalyticsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder)
    /**
     * @param issueDetectionConfiguration Configuration for an issue detection rule.
     * @return builder
     */
    def issueDetectionConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleIssueDetectionConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleIssueDetectionConfigurationArgs.builder
      builder.issueDetectionConfiguration(args(argsBuilder).build)

    /**
     * @param keywordMatchConfiguration Configuration for a keyword match rule.
     * @return builder
     */
    def keywordMatchConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfigurationArgs.builder
      builder.keywordMatchConfiguration(args(argsBuilder).build)

    /**
     * @param sentimentConfiguration Configuration for a sentiment rule.
     * @return builder
     */
    def sentimentConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationArgs.builder
      builder.sentimentConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder)
    /**
     * @param rules Collection of real time alert rules
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationState.Builder)
    /**
     * @param elements Collection of processors and sinks to transform media and deliver data.
     * @return builder
     */
    def elements(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder]*):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

    /**
     * @param realTimeAlertConfiguration Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
     * @return builder
     */
    def realTimeAlertConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.builder
      builder.realTimeAlertConfiguration(args(argsBuilder).build)
