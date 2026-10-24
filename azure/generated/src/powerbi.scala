package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object powerbi:
  /** Manages a PowerBI Embedded. */
  inline def Embedded(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.powerbi.EmbeddedArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.powerbi.EmbeddedArgs.builder
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
    com.pulumi.azure.powerbi.Embedded(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
