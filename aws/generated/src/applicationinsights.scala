package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object applicationinsights:
  /** Provides a ApplicationInsights Application resource. */
  inline def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.applicationinsights.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.applicationinsights.ApplicationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.applicationinsights.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
