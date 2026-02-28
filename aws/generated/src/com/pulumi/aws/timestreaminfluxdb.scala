package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object timestreaminfluxdb:
  /** Resource for managing an Amazon Timestream for InfluxDB database instance. */
  def DbInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.timestreaminfluxdb.DbInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an Amazon Timestream for InfluxDB read-replica cluster.
   *  
   *  &gt; **NOTE:** This resource requires a subscription to [Timestream for InfluxDB Read Replicas (Add-On) on the AWS Marketplace](https://aws.amazon.com/marketplace/pp/prodview-lftzfxtb5xlv4?applicationId=AWS-Marketplace-Console&amp;ref_=beagle&amp;sr=0-2).
   */
  def DbCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.timestreaminfluxdb.DbCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.Builder)
    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified S3 bucket. This argument is updatable.
     * @return builder
     */
    def logDeliveryConfiguration(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceTimeoutsArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.DbInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceState.Builder)
    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified S3 bucket. This argument is updatable.
     * @return builder
     */
    def logDeliveryConfiguration(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceTimeoutsArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationArgs.Builder)
    /**
     * @param s3Configuration Configuration for S3 bucket log delivery.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbInstanceLogDeliveryConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationArgs.Builder)
    /**
     * @param s3Configuration Configuration for S3 bucket log delivery.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterState.Builder)
    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified S3 bucket. This argument is updatable.
     * @return builder
     */
    def logDeliveryConfiguration(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterState.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterState.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.Builder)
    /**
     * @param logDeliveryConfiguration Configuration for sending InfluxDB engine logs to a specified S3 bucket. This argument is updatable.
     * @return builder
     */
    def logDeliveryConfiguration(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.timestreaminfluxdb.DbClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.timestreaminfluxdb.inputs.DbClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
