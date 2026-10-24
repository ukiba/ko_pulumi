package jp.ukiba.ko_pulumi
package aws

object chimesdkmediapipelines_ext:
  extension (builder: com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder)
    /**
     * @param elements Collection of processors and sinks to transform media and deliver data.
     * @return builder
     */
    inline def elements(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder]*):
        com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

    /**
     * @param realTimeAlertConfiguration Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
     * @return builder
     */
    inline def realTimeAlertConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.builder
      builder.realTimeAlertConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.Builder)
    /**
     * @param postCallAnalyticsSettings Settings for post call analytics.
     * @return builder
     */
    inline def postCallAnalyticsSettings(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettingsArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettingsArgs.builder
      builder.postCallAnalyticsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder)
    /**
     * @param amazonTranscribeCallAnalyticsProcessorConfiguration Configuration for Amazon Transcribe Call Analytics processor.
     * @return builder
     */
    inline def amazonTranscribeCallAnalyticsProcessorConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationArgs.builder
      builder.amazonTranscribeCallAnalyticsProcessorConfiguration(args(argsBuilder).build)

    /**
     * @param amazonTranscribeProcessorConfiguration Configuration for Amazon Transcribe processor.
     * @return builder
     */
    inline def amazonTranscribeProcessorConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfigurationArgs.builder
      builder.amazonTranscribeProcessorConfiguration(args(argsBuilder).build)

    /**
     * @param kinesisDataStreamSinkConfiguration Configuration for Kinesis Data Stream sink.
     * @return builder
     */
    inline def kinesisDataStreamSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementKinesisDataStreamSinkConfigurationArgs.builder
      builder.kinesisDataStreamSinkConfiguration(args(argsBuilder).build)

    /**
     * @param lambdaFunctionSinkConfiguration Configuration for Lambda Function sink.
     * @return builder
     */
    inline def lambdaFunctionSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementLambdaFunctionSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementLambdaFunctionSinkConfigurationArgs.builder
      builder.lambdaFunctionSinkConfiguration(args(argsBuilder).build)

    /**
     * @param s3RecordingSinkConfiguration Configuration for S3 recording sink.
     * @return builder
     */
    inline def s3RecordingSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementS3RecordingSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementS3RecordingSinkConfigurationArgs.builder
      builder.s3RecordingSinkConfiguration(args(argsBuilder).build)

    /**
     * @param snsTopicSinkConfiguration Configuration for SNS Topic sink.
     * @return builder
     */
    inline def snsTopicSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSnsTopicSinkConfigurationArgs.builder
      builder.snsTopicSinkConfiguration(args(argsBuilder).build)

    /**
     * @param sqsQueueSinkConfiguration Configuration for SQS Queue sink.
     * @return builder
     */
    inline def sqsQueueSinkConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSqsQueueSinkConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementSqsQueueSinkConfigurationArgs.builder
      builder.sqsQueueSinkConfiguration(args(argsBuilder).build)

    /**
     * @param voiceAnalyticsProcessorConfiguration Configuration for Voice analytics processor.
     * @return builder
     */
    inline def voiceAnalyticsProcessorConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementVoiceAnalyticsProcessorConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementVoiceAnalyticsProcessorConfigurationArgs.builder
      builder.voiceAnalyticsProcessorConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder)
    /**
     * @param rules Collection of real time alert rules
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder)
    /**
     * @param issueDetectionConfiguration Configuration for an issue detection rule.
     * @return builder
     */
    inline def issueDetectionConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleIssueDetectionConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleIssueDetectionConfigurationArgs.builder
      builder.issueDetectionConfiguration(args(argsBuilder).build)

    /**
     * @param keywordMatchConfiguration Configuration for a keyword match rule.
     * @return builder
     */
    inline def keywordMatchConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleKeywordMatchConfigurationArgs.builder
      builder.keywordMatchConfiguration(args(argsBuilder).build)

    /**
     * @param sentimentConfiguration Configuration for a sentiment rule.
     * @return builder
     */
    inline def sentimentConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationRuleSentimentConfigurationArgs.builder
      builder.sentimentConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationState.Builder)
    /**
     * @param elements Collection of processors and sinks to transform media and deliver data.
     * @return builder
     */
    inline def elements(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.Builder]*):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

    /**
     * @param realTimeAlertConfiguration Configuration for real-time alert rules to send EventBridge notifications when certain conditions are met.
     * @return builder
     */
    inline def realTimeAlertConfiguration(args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.Builder]):
        com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.chimesdkmediapipelines.inputs.MediaInsightsPipelineConfigurationRealTimeAlertConfigurationArgs.builder
      builder.realTimeAlertConfiguration(args(argsBuilder).build)
