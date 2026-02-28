package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ivschat:
  /** Resource for managing an AWS IVS (Interactive Video) Chat Room. */
  def Room(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ivschat.RoomArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivschat.RoomArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ivschat.Room(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ivschat.LoggingConfigurationArgs.Builder)
    /**
     * @param destinationConfiguration Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.ivschat.LoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ivschat.RoomArgs.Builder)
    /**
     * @param messageReviewHandler Configuration information for optional
     *  review of messages.
     * @return builder
     */
    def messageReviewHandler(args: Endofunction[com.pulumi.aws.ivschat.inputs.RoomMessageReviewHandlerArgs.Builder]):
        com.pulumi.aws.ivschat.RoomArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.RoomMessageReviewHandlerArgs.builder
      builder.messageReviewHandler(args(argsBuilder).build)

  /** Resource for managing an AWS IVS (Interactive Video) Chat Logging Configuration. */
  def LoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ivschat.LoggingConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivschat.LoggingConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ivschat.LoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.Builder)
    /**
     * @param cloudwatchLogs An Amazon CloudWatch Logs destination configuration where chat activity will be logged.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat activity will be logged.
     * @return builder
     */
    def firehose(args: Endofunction[com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationFirehoseArgs.Builder]):
        com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationS3Args.Builder]):
        com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ivschat.inputs.LoggingConfigurationState.Builder)
    /**
     * @param destinationConfiguration Object containing destination configuration for where chat activity will be logged. This object must contain exactly one of the following children arguments:
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.ivschat.inputs.LoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.LoggingConfigurationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ivschat.inputs.RoomState.Builder)
    /**
     * @param messageReviewHandler Configuration information for optional
     *  review of messages.
     * @return builder
     */
    def messageReviewHandler(args: Endofunction[com.pulumi.aws.ivschat.inputs.RoomMessageReviewHandlerArgs.Builder]):
        com.pulumi.aws.ivschat.inputs.RoomState.Builder =
      val argsBuilder = com.pulumi.aws.ivschat.inputs.RoomMessageReviewHandlerArgs.builder
      builder.messageReviewHandler(args(argsBuilder).build)
