package jp.ukiba.ko_pulumi
package aws

object bedrockmodel_ext:
  extension (builder: com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder)
    /**
     * @param inputDataConfig Location of the input data for the batch inference job. See `inputDataConfig` Block below.
     * @return builder
     */
    inline def inputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Location where the results of the batch inference job are stored. See `outputDataConfig` Block below.
     * @return builder
     */
    inline def outputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC configuration for the data used by the batch inference job. See `vpcConfig` Block below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder)
    /**
     * @param loggingConfig Logging configuration values to set. See `loggingConfig` Block for details.
     * @return builder
     */
    inline def loggingConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder)
    /**
     * @param s3InputDataConfig Location of the S3 input data. See `s3InputDataConfig` Block below.
     * @return builder
     */
    inline def s3InputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigS3InputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigS3InputDataConfigArgs.builder
      builder.s3InputDataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder)
    /**
     * @param s3OutputDataConfig Location of the S3 output data. See `s3OutputDataConfig` Block below.
     * @return builder
     */
    inline def s3OutputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigS3OutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigS3OutputDataConfigArgs.builder
      builder.s3OutputDataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder)
    /**
     * @param inputDataConfig Location of the input data for the batch inference job. See `inputDataConfig` Block below.
     * @return builder
     */
    inline def inputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Location where the results of the batch inference job are stored. See `outputDataConfig` Block below.
     * @return builder
     */
    inline def outputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC configuration for the data used by the batch inference job. See `vpcConfig` Block below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder)
    /**
     * @param cloudwatchConfig CloudWatch logging configuration. See `cloudwatchConfig` Block for details.
     * @return builder
     */
    inline def cloudwatchConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.builder
      builder.cloudwatchConfig(args(argsBuilder).build)

    /**
     * @param s3Config S3 configuration for storing log data. See `s3Config` Block for details.
     * @return builder
     */
    inline def s3Config(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigS3ConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder)
    /**
     * @param largeDataDeliveryS3Config S3 configuration for delivering a large amount of data. See `largeDataDeliveryS3Config` Block for details.
     * @return builder
     */
    inline def largeDataDeliveryS3Config(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs.builder
      builder.largeDataDeliveryS3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationState.Builder)
    /**
     * @param loggingConfig Logging configuration values to set. See `loggingConfig` Block for details.
     * @return builder
     */
    inline def loggingConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)
