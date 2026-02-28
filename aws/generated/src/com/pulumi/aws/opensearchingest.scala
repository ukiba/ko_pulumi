package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object opensearchingest:
  /** Resource for managing an AWS OpenSearch Ingestion Pipeline. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearchingest.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearchingest.PipelineArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.opensearchingest.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearchingest.PipelineArgs.Builder)
    /**
     * @param bufferOptions Key-value pairs to configure persistent buffering for the pipeline. See `bufferOptions` below.
     * @return builder
     */
    def bufferOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.builder
      builder.bufferOptions(args(argsBuilder).build)

    /**
     * @param encryptionAtRestOptions Key-value pairs to configure encryption for data that is written to a persistent buffer. See `encryptionAtRestOptions` below.
     * @return builder
     */
    def encryptionAtRestOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.builder
      builder.encryptionAtRestOptions(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Key-value pairs to configure log publishing. See `logPublishingOptions` below.
     * @return builder
     */
    def logPublishingOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.builder
      builder.logPublishingOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOptions Container for the values required to configure VPC access for the pipeline. If you don&#39;t specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint. See `vpcOptions` below.
     * @return builder
     */
    def vpcOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder)
    /**
     * @param bufferOptions Key-value pairs to configure persistent buffering for the pipeline. See `bufferOptions` below.
     * @return builder
     */
    def bufferOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.builder
      builder.bufferOptions(args(argsBuilder).build)

    /**
     * @param encryptionAtRestOptions Key-value pairs to configure encryption for data that is written to a persistent buffer. See `encryptionAtRestOptions` below.
     * @return builder
     */
    def encryptionAtRestOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.builder
      builder.encryptionAtRestOptions(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Key-value pairs to configure log publishing. See `logPublishingOptions` below.
     * @return builder
     */
    def logPublishingOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.builder
      builder.logPublishingOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOptions Container for the values required to configure VPC access for the pipeline. If you don&#39;t specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint. See `vpcOptions` below.
     * @return builder
     */
    def vpcOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder)
    /**
     * @param cloudwatchLogDestination The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if IsLoggingEnabled is set to true. See `cloudwatchLogDestination` below.
     * @return builder
     */
    def cloudwatchLogDestination(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsCloudwatchLogDestinationArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsCloudwatchLogDestinationArgs.builder
      builder.cloudwatchLogDestination(args(argsBuilder).build)
