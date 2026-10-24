package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object elastictranscoder:
  /**
   * Provides an Elastic Transcoder pipeline resource.
   * 
   * &gt; **Warning:** This resource is deprecated. Use [AWS Elemental MediaConvert](https://aws.amazon.com/blogs/media/migrating-workflows-from-amazon-elastic-transcoder-to-aws-elemental-mediaconvert/) instead. AWS will [discontinue support for Amazon Elastic Transcoder](https://aws.amazon.com/blogs/media/support-for-amazon-elastic-transcoder-ending-soon/), effective November 13, 2025.
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elastictranscoder.PipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elastictranscoder.PipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.elastictranscoder.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an Elastic Transcoder preset resource.
   * 
   * &gt; **Warning:** This resource is deprecated. Use [AWS Elemental MediaConvert](https://aws.amazon.com/blogs/media/migrating-workflows-from-amazon-elastic-transcoder-to-aws-elemental-mediaconvert/) instead. AWS will [discontinue support for Amazon Elastic Transcoder](https://aws.amazon.com/blogs/media/support-for-amazon-elastic-transcoder-ending-soon/), effective November 13, 2025.
   */
  def Preset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elastictranscoder.PresetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elastictranscoder.PresetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.elastictranscoder.Preset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
