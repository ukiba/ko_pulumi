package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object kinesis:
  /**
   * Manages account-level settings for Amazon Kinesis Data Streams.
   * 
   * &gt; Deletion of this resource will not modify any settings, only remove the resource from state.
   */
  def AccountSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.AccountSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kinesis.AccountSettingsArgs.builder
    com.pulumi.aws.kinesis.AccountSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Kinesis Analytics Application resource. Kinesis Analytics is a managed service that
   * allows processing and analyzing streaming data using standard SQL.
   * 
   * For more details, see the [Amazon Kinesis Analytics Documentation](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/what-is.html).
   * 
   * &gt; **WARNING:** _This resource is deprecated and will be removed in a future version._ [Effective January 27, 2026](https://aws.amazon.com/blogs/big-data/migrate-from-amazon-kinesis-data-analytics-for-sql-to-amazon-managed-service-for-apache-flink-and-amazon-managed-service-for-apache-flink-studio/), AWS will [no longer support](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/discontinuation.html) Amazon Kinesis Data Analytics for SQL. Use the `aws.kinesisanalyticsv2.Application` resource instead to manage Amazon Kinesis Data Analytics for Apache Flink applications. AWS provides guidance for migrating from [Amazon Kinesis Data Analytics for SQL Applications to Amazon Managed Service for Apache Flink Studio](https://aws.amazon.com/blogs/big-data/migrate-from-amazon-kinesis-data-analytics-for-sql-applications-to-amazon-managed-service-for-apache-flink-studio/) including [examples](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/migrating-to-kda-studio-overview.html).
   * 
   * &gt; **Note:** To manage Amazon Kinesis Data Analytics for Apache Flink applications, use the `aws.kinesisanalyticsv2.Application` resource.
   */
  def AnalyticsApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.AnalyticsApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.AnalyticsApplicationArgs.builder
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
    com.pulumi.aws.kinesis.AnalyticsApplication(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Kinesis Firehose Delivery Stream resource. Amazon Kinesis Firehose is a fully managed, elastic service to easily deliver real-time data streams to destinations such as Amazon S3 , Amazon Redshift and Snowflake.
   * 
   * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
   */
  def FirehoseDeliveryStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.builder
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
    com.pulumi.aws.kinesis.FirehoseDeliveryStream(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object KinesisFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
     */
    inline def getFirehoseDeliveryStream(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getFirehoseDeliveryStream(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
     */
    inline def getFirehoseDeliveryStreamPlain(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamPlainArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getFirehoseDeliveryStreamPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
     */
    inline def getStream(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kinesis.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStream(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
     */
    inline def getStreamPlain(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kinesis.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamPlainArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStreamPlain(args(argsBuilder).build)

    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/enhanced-consumers.html).
     */
    inline def getStreamConsumer(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kinesis.outputs.GetStreamConsumerResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStreamConsumer(args(argsBuilder).build)

    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/enhanced-consumers.html).
     */
    inline def getStreamConsumerPlain(args: Endofunction[com.pulumi.aws.kinesis.inputs.GetStreamConsumerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kinesis.outputs.GetStreamConsumerResult] =
      val argsBuilder = com.pulumi.aws.kinesis.inputs.GetStreamConsumerPlainArgs.builder
      com.pulumi.aws.kinesis.KinesisFunctions.getStreamConsumerPlain(args(argsBuilder).build)

  /**
   * Provides a resource to manage an Amazon Kinesis Streams resource policy.
   * Use a resource policy to manage cross-account access to your data streams or consumers.
   */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.ResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kinesis.ResourcePolicyArgs.builder
    com.pulumi.aws.kinesis.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Kinesis Stream resource. Amazon Kinesis is a managed service that
   * scales elastically for real-time processing of streaming big data.
   * 
   * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
   */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.StreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.StreamArgs.builder
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
    com.pulumi.aws.kinesis.Stream(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage a Kinesis Stream Consumer.
   * 
   * &gt; **Note:** You can register up to 20 consumers per stream. A given consumer can only be registered with one stream at a time.
   * 
   * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/enhanced-consumers.html).
   */
  def StreamConsumer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.StreamConsumerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.StreamConsumerArgs.builder
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
    com.pulumi.aws.kinesis.StreamConsumer(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Kinesis Video Stream resource. Amazon Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for analytics, machine learning (ML), playback, and other processing.
   * 
   * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
   */
  def VideoStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesis.VideoStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesis.VideoStreamArgs.builder
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
    com.pulumi.aws.kinesis.VideoStream(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
