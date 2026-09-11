package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object bedrockmodel:
  /**
   * Manages an Amazon Bedrock model invocation job. A model invocation job runs a foundation model, or a model accessed through an inference profile, against multiple prompts read from Amazon S3, and writes the results back to Amazon S3.
   * 
   * &gt; Amazon Bedrock does not support permanently deleting a model invocation job. Destroying this resource stops the job (if it hasn&#39;t already reached a terminal state) using the [StopModelInvocationJob](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_StopModelInvocationJob.html) API, then removes it from Terraform state. Set `skipDestroy` to leave the job in its current state instead.
   * 
   * &gt; This resource does not support `tags`. Amazon Bedrock does not allow retrieving tags for a batch inference job that has already finished running, which would cause errors when importing or listing existing jobs.
   */
  def InvocationJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrockmodel.InvocationJobArgs.builder
    com.pulumi.aws.bedrockmodel.InvocationJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder)
    /**
     * @param inputDataConfig Location of the input data for the batch inference job. See `inputDataConfig` Block below.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Location where the results of the batch inference job are stored. See `outputDataConfig` Block below.
     * @return builder
     */
    def outputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC configuration for the data used by the batch inference job. See `vpcConfig` Block below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  /**
   * Manages Bedrock model invocation logging configuration.
   * 
   * &gt; Model invocation logging is configured per AWS region. To avoid overwriting settings, this resource should not be defined in multiple configurations.
   */
  def InvocationLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.builder
    com.pulumi.aws.bedrockmodel.InvocationLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder)
    /**
     * @param loggingConfig The logging configuration values to set. See `loggingConfig` Block for details.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder)
    /**
     * @param s3InputDataConfig Location of the S3 input data. See `s3InputDataConfig` Block below.
     * @return builder
     */
    def s3InputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigS3InputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigS3InputDataConfigArgs.builder
      builder.s3InputDataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder)
    /**
     * @param s3OutputDataConfig Location of the S3 output data. See `s3OutputDataConfig` Block below.
     * @return builder
     */
    def s3OutputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigS3OutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigS3OutputDataConfigArgs.builder
      builder.s3OutputDataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder)
    /**
     * @param inputDataConfig Location of the input data for the batch inference job. See `inputDataConfig` Block below.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Location where the results of the batch inference job are stored. See `outputDataConfig` Block below.
     * @return builder
     */
    def outputDataConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig VPC configuration for the data used by the batch inference job. See `vpcConfig` Block below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationJobState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationJobVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder)
    /**
     * @param cloudwatchConfig CloudWatch logging configuration. See `cloudwatchConfig` Block for details.
     * @return builder
     */
    def cloudwatchConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.builder
      builder.cloudwatchConfig(args(argsBuilder).build)

    /**
     * @param s3Config S3 configuration for storing log data. See `s3Config` Block for details.
     * @return builder
     */
    def s3Config(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigS3ConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder)
    /**
     * @param largeDataDeliveryS3Config S3 configuration for delivering a large amount of data. See `largeDataDeliveryS3Config` Block for details.
     * @return builder
     */
    def largeDataDeliveryS3Config(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs.builder
      builder.largeDataDeliveryS3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationState.Builder)
    /**
     * @param loggingConfig The logging configuration values to set. See `loggingConfig` Block for details.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)
