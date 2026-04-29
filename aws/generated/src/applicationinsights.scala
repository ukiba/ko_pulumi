package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object applicationinsights:
  /** Provides a ApplicationInsights Application resource. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.applicationinsights.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.applicationinsights.ApplicationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.applicationinsights.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
