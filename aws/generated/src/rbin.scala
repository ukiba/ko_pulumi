package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object rbin:
  /** Resource for managing an AWS RBin Rule. */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.rbin.RuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rbin.RuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.rbin.Rule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
