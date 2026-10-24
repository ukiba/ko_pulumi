package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object chimesdkmediapipelines:
  /**
   * Resource for managing an AWS Chime SDK Media Pipelines Media Insights Pipeline Configuration.
   * Consult the [Call analytics developer guide](https://docs.aws.amazon.com/chime-sdk/latest/dg/call-analytics.html) for more detailed information about usage.
   */
  def MediaInsightsPipelineConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfigurationArgs.builder
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
    com.pulumi.aws.chimesdkmediapipelines.MediaInsightsPipelineConfiguration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
