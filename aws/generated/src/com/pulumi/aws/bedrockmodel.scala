package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object bedrockmodel:
  /**
   * Manages Bedrock model invocation logging configuration.
   *  
   *  &gt; Model invocation logging is configured per AWS region. To avoid overwriting settings, this resource should not be defined in multiple configurations.
   */
  def InvocationLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.builder
    
    com.pulumi.aws.bedrockmodel.InvocationLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder)
    /**
     * @param loggingConfig The logging configuration values to set. See `loggingConfig` Block for details.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationState.Builder)
    /**
     * @param loggingConfig The logging configuration values to set. See `loggingConfig` Block for details.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder)
    /**
     * @param largeDataDeliveryS3Config S3 configuration for delivering a large amount of data. See `largeDataDeliveryS3Config` Block for details.
     * @return builder
     */
    def largeDataDeliveryS3Config(args: Endofunction[com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs.Builder]):
        com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockmodel.inputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfigLargeDataDeliveryS3ConfigArgs.builder
      builder.largeDataDeliveryS3Config(args(argsBuilder).build)
