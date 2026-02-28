package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object kinesis:
  type KinesisFunctions = com.pulumi.aws.kinesis.KinesisFunctions
  object KinesisFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.kinesis.KinesisFunctions.*
  extension (self: KinesisFunctions.type)
    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     *  
     *  For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
     */
    def getFirehoseDeliveryStream(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getFirehoseDeliveryStream(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     *  
     *  For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
     */
    def getFirehoseDeliveryStreamPlain(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamPlainArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getFirehoseDeliveryStreamPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     *  resources.
     *  
     *  For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
     */
    def getStream(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kinesis.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStream(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     *  resources.
     *  
     *  For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
     */
    def getStreamPlain(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kinesis.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamPlainArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStreamPlain(args(argsBuilder).build)

    /**
     * Provides details about a Kinesis Stream Consumer.
     *  
     *  For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
     */
    def getStreamConsumer(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kinesis.outputs.GetStreamConsumerResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStreamConsumer(args(argsBuilder).build)

    /**
     * Provides details about a Kinesis Stream Consumer.
     *  
     *  For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
     */
    def getStreamConsumerPlain(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamConsumerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kinesis.outputs.GetStreamConsumerResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamConsumerPlainArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStreamConsumerPlain(args(argsBuilder).build)

  /**
   * Provides a resource to manage an Amazon Kinesis Streams resource policy.
   *  Use a resource policy to manage cross-account access to your data streams or consumers.
   */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesis.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.kinesis.ResourcePolicyArgs.builder
    
    com.pulumi.aws.kinesis.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Kinesis Stream resource. Amazon Kinesis is a managed service that
   *  scales elastically for real-time processing of streaming big data.
   *  
   *  For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
   */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesis.StreamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.StreamArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kinesis.Stream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Kinesis Analytics Application resource. Kinesis Analytics is a managed service that
   *  allows processing and analyzing streaming data using standard SQL.
   *  
   *  For more details, see the [Amazon Kinesis Analytics Documentation](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/what-is.html).
   *  
   *  !&gt; **WARNING:** _This resource is deprecated and will be removed in a future version._ [Effective January 27, 2026](https://aws.amazon.com/blogs/big-data/migrate-from-amazon-kinesis-data-analytics-for-sql-to-amazon-managed-service-for-apache-flink-and-amazon-managed-service-for-apache-flink-studio/), AWS will [no longer support](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/discontinuation.html) Amazon Kinesis Data Analytics for SQL. Use the `aws.kinesisanalyticsv2.Application` resource instead to manage Amazon Kinesis Data Analytics for Apache Flink applications. AWS provides guidance for migrating from [Amazon Kinesis Data Analytics for SQL Applications to Amazon Managed Service for Apache Flink Studio](https://aws.amazon.com/blogs/big-data/migrate-from-amazon-kinesis-data-analytics-for-sql-applications-to-amazon-managed-service-for-apache-flink-studio/) including [examples](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/migrating-to-kda-studio-overview.html).
   *  
   *  &gt; **Note:** To manage Amazon Kinesis Data Analytics for Apache Flink applications, use the `aws.kinesisanalyticsv2.Application` resource.
   */
  def AnalyticsApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.AnalyticsApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kinesis.AnalyticsApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kinesis.StreamArgs.Builder)
    /**
     * @param streamModeDetails Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * @return builder
     */
    def streamModeDetails(args: Endofunction[com.pulumi.aws.kinesis.inputs.StreamStreamModeDetailsArgs.Builder]):
        com.pulumi.aws.kinesis.StreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.StreamStreamModeDetailsArgs.builder
      builder.streamModeDetails(args(argsBuilder).build)

  /**
   * Provides a resource to manage a Kinesis Stream Consumer.
   *  
   *  &gt; **Note:** You can register up to 20 consumers per stream. A given consumer can only be registered with one stream at a time.
   *  
   *  For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
   */
  def StreamConsumer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesis.StreamConsumerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.StreamConsumerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kinesis.StreamConsumer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch log stream options to monitor application errors.
     *  See CloudWatch Logging Options below for more details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param inputs Input configuration of the application. See Inputs below for more details.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder]):
        com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.builder
      builder.inputs(args(argsBuilder).build)

    /**
     * @param outputs Output destination configuration of the application. See Outputs below for more details.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder]*):
        com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

    /**
     * @param referenceDataSources An S3 Reference Data Source for the application.
     *  See Reference Data Sources below for more details.
     * @return builder
     */
    def referenceDataSources(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.Builder]):
        com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.builder
      builder.referenceDataSources(args(argsBuilder).build)

  /**
   * Provides a Kinesis Video Stream resource. Amazon Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for analytics, machine learning (ML), playback, and other processing.
   *  
   *  For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
   */
  def VideoStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesis.VideoStreamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.VideoStreamArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kinesis.VideoStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder)
    /**
     * @param elasticsearchConfiguration Configuration options when `destination` is `elasticsearch`. See `elasticsearchConfiguration` block below for details.
     * @return builder
     */
    def elasticsearchConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.builder
      builder.elasticsearchConfiguration(args(argsBuilder).build)

    /**
     * @param extendedS3Configuration Enhanced configuration options for the s3 destination. See `extendedS3Configuration` block below for details.
     * @return builder
     */
    def extendedS3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder
      builder.extendedS3Configuration(args(argsBuilder).build)

    /**
     * @param httpEndpointConfiguration Configuration options when `destination` is `httpEndpoint`. Requires the user to also specify an `s3Configuration` block.  See `httpEndpointConfiguration` block below for details.
     * @return builder
     */
    def httpEndpointConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.builder
      builder.httpEndpointConfiguration(args(argsBuilder).build)

    /**
     * @param icebergConfiguration Configuration options when `destination` is `iceberg`. See `icebergConfiguration` block below for details.
     * @return builder
     */
    def icebergConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

    /**
     * @param kinesisSourceConfiguration The stream and role Amazon Resource Names (ARNs) for a Kinesis data stream used as the source for a delivery stream. See `kinesisSourceConfiguration` block below for details.
     * @return builder
     */
    def kinesisSourceConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamKinesisSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamKinesisSourceConfigurationArgs.builder
      builder.kinesisSourceConfiguration(args(argsBuilder).build)

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the source for a delivery stream. See `mskSourceConfiguration` block below for details.
     * @return builder
     */
    def mskSourceConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationArgs.builder
      builder.mskSourceConfiguration(args(argsBuilder).build)

    /**
     * @param opensearchConfiguration Configuration options when `destination` is `opensearch`. See `opensearchConfiguration` block below for details.
     * @return builder
     */
    def opensearchConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.builder
      builder.opensearchConfiguration(args(argsBuilder).build)

    /**
     * @param opensearchserverlessConfiguration Configuration options when `destination` is `opensearchserverless`. See `opensearchserverlessConfiguration` block below for details.
     * @return builder
     */
    def opensearchserverlessConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.builder
      builder.opensearchserverlessConfiguration(args(argsBuilder).build)

    /**
     * @param redshiftConfiguration Configuration options when `destination` is `redshift`. Requires the user to also specify an `s3Configuration` block. See `redshiftConfiguration` block below for details.
     * @return builder
     */
    def redshiftConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.builder
      builder.redshiftConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryption Encrypt at rest options. See `serverSideEncryption` block below for details.
     * @return builder
     */
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

    /**
     * @param snowflakeConfiguration Configuration options when `destination` is `snowflake`. See `snowflakeConfiguration` block below for details.
     * @return builder
     */
    def snowflakeConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.builder
      builder.snowflakeConfiguration(args(argsBuilder).build)

    /**
     * @param splunkConfiguration Configuration options when `destination` is `splunk`. See `splunkConfiguration` block below for details.
     *  
     *  **NOTE:** Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * @return builder
     */
    def splunkConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.builder
      builder.splunkConfiguration(args(argsBuilder).build)

  /**
   * Provides a Kinesis Firehose Delivery Stream resource. Amazon Kinesis Firehose is a fully managed, elastic service to easily deliver real-time data streams to destinations such as Amazon S3 , Amazon Redshift and Snowflake.
   *  
   *  For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
   */
  def FirehoseDeliveryStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kinesis.FirehoseDeliveryStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs.Builder)
    /**
     * @param deserializer Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. See `deserializer` block below for details.
     * @return builder
     */
    def deserializer(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs.builder
      builder.deserializer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationArgs.Builder)
    /**
     * @param lambda The Lambda function configuration. See Lambda below for more details.
     * @return builder
     */
    def lambda(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationLambdaArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param vpcConfig The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. See `vpcConfig` block below for details.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param destinationTableConfigurations Destination table configurations which Firehose uses to deliver data to Apache Iceberg Tables. Firehose will write data with insert if table specific configuration is not provided. See `destinationTableConfiguration` block below for details.
     * @return builder
     */
    def destinationTableConfigurations(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationDestinationTableConfigurationArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationDestinationTableConfigurationArgs.builder
      builder.destinationTableConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.Builder)
    /**
     * @param csv Mapping information when the record format uses delimiters.
     *  See CSV Mapping Parameters below for more details.
     * @return builder
     */
    def csv(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvArgs.builder
      builder.csv(args(argsBuilder).build)

    /**
     * @param json Mapping information when JSON is the record format on the streaming source.
     *  See JSON Mapping Parameters below for more details.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonArgs.builder
      builder.json(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder)
    /**
     * @param elasticsearchConfiguration Configuration options when `destination` is `elasticsearch`. See `elasticsearchConfiguration` block below for details.
     * @return builder
     */
    def elasticsearchConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationArgs.builder
      builder.elasticsearchConfiguration(args(argsBuilder).build)

    /**
     * @param extendedS3Configuration Enhanced configuration options for the s3 destination. See `extendedS3Configuration` block below for details.
     * @return builder
     */
    def extendedS3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder
      builder.extendedS3Configuration(args(argsBuilder).build)

    /**
     * @param httpEndpointConfiguration Configuration options when `destination` is `httpEndpoint`. Requires the user to also specify an `s3Configuration` block.  See `httpEndpointConfiguration` block below for details.
     * @return builder
     */
    def httpEndpointConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.builder
      builder.httpEndpointConfiguration(args(argsBuilder).build)

    /**
     * @param icebergConfiguration Configuration options when `destination` is `iceberg`. See `icebergConfiguration` block below for details.
     * @return builder
     */
    def icebergConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationArgs.builder
      builder.icebergConfiguration(args(argsBuilder).build)

    /**
     * @param kinesisSourceConfiguration The stream and role Amazon Resource Names (ARNs) for a Kinesis data stream used as the source for a delivery stream. See `kinesisSourceConfiguration` block below for details.
     * @return builder
     */
    def kinesisSourceConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamKinesisSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamKinesisSourceConfigurationArgs.builder
      builder.kinesisSourceConfiguration(args(argsBuilder).build)

    /**
     * @param mskSourceConfiguration The configuration for the Amazon MSK cluster to be used as the source for a delivery stream. See `mskSourceConfiguration` block below for details.
     * @return builder
     */
    def mskSourceConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationArgs.builder
      builder.mskSourceConfiguration(args(argsBuilder).build)

    /**
     * @param opensearchConfiguration Configuration options when `destination` is `opensearch`. See `opensearchConfiguration` block below for details.
     * @return builder
     */
    def opensearchConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.builder
      builder.opensearchConfiguration(args(argsBuilder).build)

    /**
     * @param opensearchserverlessConfiguration Configuration options when `destination` is `opensearchserverless`. See `opensearchserverlessConfiguration` block below for details.
     * @return builder
     */
    def opensearchserverlessConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.builder
      builder.opensearchserverlessConfiguration(args(argsBuilder).build)

    /**
     * @param redshiftConfiguration Configuration options when `destination` is `redshift`. Requires the user to also specify an `s3Configuration` block. See `redshiftConfiguration` block below for details.
     * @return builder
     */
    def redshiftConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.builder
      builder.redshiftConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryption Encrypt at rest options. See `serverSideEncryption` block below for details.
     * @return builder
     */
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

    /**
     * @param snowflakeConfiguration Configuration options when `destination` is `snowflake`. See `snowflakeConfiguration` block below for details.
     * @return builder
     */
    def snowflakeConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.builder
      builder.snowflakeConfiguration(args(argsBuilder).build)

    /**
     * @param splunkConfiguration Configuration options when `destination` is `splunk`. See `splunkConfiguration` block below for details.
     *  
     *  **NOTE:** Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * @return builder
     */
    def splunkConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.builder
      builder.splunkConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param documentIdOptions The method for setting up document ID. See [`documentIdOptions` block] below for details.
     * @return builder
     */
    def documentIdOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationDocumentIdOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationDocumentIdOptionsArgs.builder
      builder.documentIdOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration. See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param vpcConfig The VPC configuration for the delivery stream to connect to OpenSearch associated with the VPC. See `vpcConfig` block below for details.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The processing configuration. See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param secretsManagerConfiguration The Secrets Manager configuration. See `secretsManagerConfiguration` block below for details. This value is required if `user` and `privateKey` are not provided.
     * @return builder
     */
    def secretsManagerConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationSecretsManagerConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationSecretsManagerConfigurationArgs.builder
      builder.secretsManagerConfiguration(args(argsBuilder).build)

    /**
     * @param snowflakeRoleConfiguration The configuration for Snowflake role.
     * @return builder
     */
    def snowflakeRoleConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationSnowflakeRoleConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationSnowflakeRoleConfigurationArgs.builder
      builder.snowflakeRoleConfiguration(args(argsBuilder).build)

    /**
     * @param snowflakeVpcConfiguration The VPC configuration for Snowflake.
     * @return builder
     */
    def snowflakeVpcConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationSnowflakeVpcConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationSnowflakeVpcConfigurationArgs.builder
      builder.snowflakeVpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatArgs.Builder)
    /**
     * @param mappingParameters The Mapping Information for the record format.
     *  See Mapping Parameters below for more details.
     * @return builder
     */
    def mappingParameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.builder
      builder.mappingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs.Builder)
    /**
     * @param mappingParameters The Mapping Information for the record format.
     *  See Mapping Parameters below for more details.
     * @return builder
     */
    def mappingParameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs.builder
      builder.mappingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder)
    /**
     * @param kinesisFirehose The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesisStream`.
     *  See Kinesis Firehose below for more details.
     * @return builder
     */
    def kinesisFirehose(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisFirehoseArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisFirehoseArgs.builder
      builder.kinesisFirehose(args(argsBuilder).build)

    /**
     * @param kinesisStream The Kinesis Stream configuration for the streaming source. Conflicts with `kinesisFirehose`.
     *  See Kinesis Stream below for more details.
     * @return builder
     */
    def kinesisStream(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisStreamArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisStreamArgs.builder
      builder.kinesisStream(args(argsBuilder).build)

    /**
     * @param parallelism The number of Parallel in-application streams to create.
     *  See Parallelism below for more details.
     * @return builder
     */
    def parallelism(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsParallelismArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsParallelismArgs.builder
      builder.parallelism(args(argsBuilder).build)

    /**
     * @param processingConfiguration The Processing Configuration to transform records as they are received from the stream.
     *  See Processing Configuration below for more details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param schema The Schema format of the data in the streaming source. See Source Schema below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    /**
     * @param startingPositionConfigurations The point at which the application starts processing records from the streaming source.
     *  See Starting Position Configuration below for more details.
     * @return builder
     */
    def startingPositionConfigurations(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsStartingPositionConfigurationArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsStartingPositionConfigurationArgs.builder
      builder.startingPositionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs.Builder)
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.Builder)
    /**
     * @param s3 The S3 configuration for the reference data source. See S3 Reference below for more details.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesS3Args.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesS3Args.builder
      builder.s3(args(argsBuilder).build)

    /**
     * @param schema The Schema format of the data in the streaming source. See Source Schema below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs.Builder)
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs.Builder)
    /**
     * @param recordColumns The Record Column mapping for the streaming source data element.
     *  See Record Columns below for more details.
     * @return builder
     */
    def recordColumns(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordColumnArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordColumnArgs.builder
      builder.recordColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param recordFormat The Record Format and mapping information to schematize a record.
     *  See Record Format below for more details.
     * @return builder
     */
    def recordFormat(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatArgs.builder
      builder.recordFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param vpcConfig The VPC configuration for the delivery stream to connect to OpenSearch Serverless associated with the VPC. See `vpcConfig` block below for details.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    def secretsManagerConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationSecretsManagerConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationSecretsManagerConfigurationArgs.builder
      builder.secretsManagerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder)
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param dataFormatConversionConfiguration Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. See `dataFormatConversionConfiguration` block below for details.
     * @return builder
     */
    def dataFormatConversionConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs.builder
      builder.dataFormatConversionConfiguration(args(argsBuilder).build)

    /**
     * @param dynamicPartitioningConfiguration The configuration for dynamic partitioning. Required when using [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). See `dynamicPartitioningConfiguration` block below for details.
     * @return builder
     */
    def dynamicPartitioningConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs.builder
      builder.dynamicPartitioningConfiguration(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3BackupConfiguration The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
     * @return builder
     */
    def s3BackupConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs.builder
      builder.s3BackupConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs.Builder)
    /**
     * @param inputFormatConfiguration Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. See `inputFormatConfiguration` block below for details.
     * @return builder
     */
    def inputFormatConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs.builder
      builder.inputFormatConfiguration(args(argsBuilder).build)

    /**
     * @param outputFormatConfiguration Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. See `outputFormatConfiguration` block below for details.
     * @return builder
     */
    def outputFormatConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationArgs.builder
      builder.outputFormatConfiguration(args(argsBuilder).build)

    /**
     * @param schemaConfiguration Specifies the AWS Glue Data Catalog table that contains the column information. See `schemaConfiguration` block below for details.
     * @return builder
     */
    def schemaConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationArgs.builder
      builder.schemaConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaArgs.Builder)
    /**
     * @param recordColumns The Record Column mapping for the streaming source data element.
     *  See Record Columns below for more details.
     * @return builder
     */
    def recordColumns(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs.builder
      builder.recordColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param recordFormat The Record Format and mapping information to schematize a record.
     *  See Record Format below for more details.
     * @return builder
     */
    def recordFormat(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatArgs.builder
      builder.recordFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationArgs.Builder)
    /**
     * @param authenticationConfiguration The authentication configuration of the Amazon MSK cluster. See `authenticationConfiguration` block below for details.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamMskSourceConfigurationAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs.Builder)
    /**
     * @param commonAttributes Describes the metadata sent to the HTTP endpoint destination. See `commonAttributes` block below for details.
     * @return builder
     */
    def commonAttributes(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs.builder
      builder.commonAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.StreamState.Builder)
    /**
     * @param streamModeDetails Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * @return builder
     */
    def streamModeDetails(args: Endofunction[com.pulumi.aws.kinesis.inputs.StreamStreamModeDetailsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.StreamStreamModeDetailsArgs.builder
      builder.streamModeDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param s3BackupConfiguration The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
     *  `secretsManagerConfiguration` - (Optional) The Secrets Manager configuration. See `secretsManagerConfiguration` block below for details. This value is required if `username` and `password` are not provided.
     * @return builder
     */
    def s3BackupConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs.builder
      builder.s3BackupConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See s3Configuration below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    def secretsManagerConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationSecretsManagerConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationSecretsManagerConfigurationArgs.builder
      builder.secretsManagerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamIcebergConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs.Builder)
    /**
     * @param csv Mapping information when the record format uses delimiters.
     *  See CSV Mapping Parameters below for more details.
     * @return builder
     */
    def csv(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs.builder
      builder.csv(args(argsBuilder).build)

    /**
     * @param json Mapping information when JSON is the record format on the streaming source.
     *  See JSON Mapping Parameters below for more details.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonArgs.builder
      builder.json(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder)
    /**
     * @param kinesisFirehose The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesisStream`.
     *  See Kinesis Firehose below for more details.
     * @return builder
     */
    def kinesisFirehose(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisFirehoseArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisFirehoseArgs.builder
      builder.kinesisFirehose(args(argsBuilder).build)

    /**
     * @param kinesisStream The Kinesis Stream configuration for the destination stream. Conflicts with `kinesisFirehose`.
     *  See Kinesis Stream below for more details.
     * @return builder
     */
    def kinesisStream(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisStreamArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisStreamArgs.builder
      builder.kinesisStream(args(argsBuilder).build)

    /**
     * @param lambda The Lambda function destination. See Lambda below for more details.
     * @return builder
     */
    def lambda(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputLambdaArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    /**
     * @param schema The Schema format of the data written to the destination. See Destination Schema below for more details.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputSchemaArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param processingConfiguration The data processing configuration.  See `processingConfiguration` block below for details.
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    /**
     * @param requestConfiguration The request configuration.  See `requestConfiguration` block below for details.
     * @return builder
     */
    def requestConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationArgs.builder
      builder.requestConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration The S3 Configuration. See `s3Configuration` block below for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param secretsManagerConfiguration The Secret Manager Configuration. See `secretsManagerConfiguration` block below for details.
     * @return builder
     */
    def secretsManagerConfiguration(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationSecretsManagerConfigurationArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationSecretsManagerConfigurationArgs.builder
      builder.secretsManagerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationArgs.Builder)
    /**
     * @param serializer Specifies which serializer to use. You can choose either the ORC SerDe or the Parquet SerDe. See `serializer` block below for details.
     * @return builder
     */
    def serializer(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs.builder
      builder.serializer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchserverlessConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch Logging Options for the delivery stream. See `cloudwatchLoggingOptions` block below for details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSnowflakeConfigurationS3ConfigurationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs.Builder)
    /**
     * @param orcSerDe Specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). See `orcSerDe` block below for details.
     * @return builder
     */
    def orcSerDe(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeArgs.builder
      builder.orcSerDe(args(argsBuilder).build)

    /**
     * @param parquetSerDe Specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/docs/). More details below.
     * @return builder
     */
    def parquetSerDe(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDeArgs.builder
      builder.parquetSerDe(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs.Builder)
    /**
     * @param processors Specifies the data processors as multiple blocks. See `processors` block below for details.
     * @return builder
     */
    def processors(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs.builder
      builder.processors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs.Builder)
    /**
     * @param hiveJsonSerDe Specifies the native Hive / HCatalog JsonSerDe. More details below. See `hiveJsonSerDe` block below for details.
     * @return builder
     */
    def hiveJsonSerDe(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeArgs.builder
      builder.hiveJsonSerDe(args(argsBuilder).build)

    /**
     * @param openXJsonSerDe Specifies the OpenX SerDe. See `openXJsonSerDe` block below for details.
     * @return builder
     */
    def openXJsonSerDe(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs.builder
      builder.openXJsonSerDe(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.AnalyticsApplicationState.Builder)
    /**
     * @param cloudwatchLoggingOptions The CloudWatch log stream options to monitor application errors.
     *  See CloudWatch Logging Options below for more details.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

    /**
     * @param inputs Input configuration of the application. See Inputs below for more details.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs.builder
      builder.inputs(args(argsBuilder).build)

    /**
     * @param outputs Output destination configuration of the application. See Outputs below for more details.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationState.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

    /**
     * @param referenceDataSources An S3 Reference Data Source for the application.
     *  See Reference Data Sources below for more details.
     * @return builder
     */
    def referenceDataSources(args: Endofunction[com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.Builder]):
        com.pulumi.aws.kinesis.inputs.AnalyticsApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesArgs.builder
      builder.referenceDataSources(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.Builder)
    /**
     * @param parameters Specifies the processor parameters as multiple blocks. See `parameters` block below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs.Builder]*):
        com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)
