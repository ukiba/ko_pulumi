package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object bedrockmodel:
  /**
   * Manages an Amazon Bedrock model invocation job. A model invocation job runs a foundation model, or a model accessed through an inference profile, against multiple prompts read from Amazon S3, and writes the results back to Amazon S3.
   * 
   * &gt; **Note:** Amazon Bedrock does not support permanently deleting a model invocation job. Destroying this resource stops the job (if it hasn&#39;t already reached a terminal state) using the [StopModelInvocationJob](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_StopModelInvocationJob.html) API, then removes it from Terraform state. Set `skipDestroy` to leave the job in its current state instead.
   * 
   * &gt; **Note:** This resource does not support `tags`. Amazon Bedrock does not allow retrieving tags for a batch inference job that has already finished running, which would cause errors when importing or listing existing jobs.
   */
  inline def InvocationJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrockmodel.InvocationJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrockmodel.InvocationJobArgs.builder
    com.pulumi.aws.bedrockmodel.InvocationJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages Bedrock model invocation logging configuration.
   * 
   * &gt; **Note:** Model invocation logging is configured per AWS region. To avoid overwriting settings, this resource should not be defined in multiple configurations.
   */
  inline def InvocationLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrockmodel.InvocationLoggingConfigurationArgs.builder
    com.pulumi.aws.bedrockmodel.InvocationLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
