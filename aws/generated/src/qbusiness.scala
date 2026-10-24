package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object qbusiness:
  /** Provides a Q Business Application resource. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.qbusiness.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.qbusiness.ApplicationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.qbusiness.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
