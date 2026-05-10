package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object powerbi:
  /** Manages a PowerBI Embedded. */
  def Embedded(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.powerbi.EmbeddedArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.powerbi.EmbeddedArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.powerbi.Embedded(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
