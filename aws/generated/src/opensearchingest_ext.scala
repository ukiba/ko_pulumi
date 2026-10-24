package jp.ukiba.ko_pulumi
package aws

object opensearchingest_ext:
  extension (builder: com.pulumi.aws.opensearchingest.PipelineArgs.Builder)
    /**
     * @param bufferOptions Key-value pairs to configure persistent buffering for the pipeline. See `bufferOptions` below.
     * @return builder
     */
    inline def bufferOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.builder
      builder.bufferOptions(args(argsBuilder).build)

    /**
     * @param encryptionAtRestOptions Key-value pairs to configure encryption for data that is written to a persistent buffer. See `encryptionAtRestOptions` below.
     * @return builder
     */
    inline def encryptionAtRestOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.builder
      builder.encryptionAtRestOptions(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Key-value pairs to configure log publishing. See `logPublishingOptions` below.
     * @return builder
     */
    inline def logPublishingOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.builder
      builder.logPublishingOptions(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOptions Container for the values required to configure VPC access for the pipeline. If you don&#39;t specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint. See `vpcOptions` below.
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearchingest.PipelineEndpointArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOptions VPC options for the pipeline endpoint. See `vpcOptions` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEndpointVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.PipelineEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEndpointVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearchingest.inputs.PipelineEndpointState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOptions VPC options for the pipeline endpoint. See `vpcOptions` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEndpointVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEndpointVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder)
    /**
     * @param cloudwatchLogDestination The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if IsLoggingEnabled is set to true. See `cloudwatchLogDestination` below.
     * @return builder
     */
    inline def cloudwatchLogDestination(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsCloudwatchLogDestinationArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsCloudwatchLogDestinationArgs.builder
      builder.cloudwatchLogDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder)
    /**
     * @param bufferOptions Key-value pairs to configure persistent buffering for the pipeline. See `bufferOptions` below.
     * @return builder
     */
    inline def bufferOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineBufferOptionsArgs.builder
      builder.bufferOptions(args(argsBuilder).build)

    /**
     * @param encryptionAtRestOptions Key-value pairs to configure encryption for data that is written to a persistent buffer. See `encryptionAtRestOptions` below.
     * @return builder
     */
    inline def encryptionAtRestOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineEncryptionAtRestOptionsArgs.builder
      builder.encryptionAtRestOptions(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Key-value pairs to configure log publishing. See `logPublishingOptions` below.
     * @return builder
     */
    inline def logPublishingOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineLogPublishingOptionsArgs.builder
      builder.logPublishingOptions(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOptions Container for the values required to configure VPC access for the pipeline. If you don&#39;t specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint. See `vpcOptions` below.
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearchingest.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.opensearchingest.inputs.PipelineVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)
