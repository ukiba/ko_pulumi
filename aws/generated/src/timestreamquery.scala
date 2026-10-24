package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object timestreamquery:
  /** Resource for managing an AWS Timestream Query Scheduled Query. */
  inline def ScheduledQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.timestreamquery.ScheduledQueryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.timestreamquery.ScheduledQueryArgs.builder
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
    com.pulumi.aws.timestreamquery.ScheduledQuery(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
