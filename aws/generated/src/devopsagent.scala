package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object devopsagent:
  /** Manages an AWS DevOps Agent Space. */
  def AgentSpace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.devopsagent.AgentSpaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.devopsagent.AgentSpaceArgs.builder
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
    com.pulumi.aws.devopsagent.AgentSpace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
