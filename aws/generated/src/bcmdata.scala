package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object bcmdata:
  /** Resource for managing an AWS BCM Data Exports Export. */
  def Export(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bcmdata.ExportArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bcmdata.ExportArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bcmdata.Export(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
