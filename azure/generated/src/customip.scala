package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object customip:
  /** Manages a custom IPv4 prefix or custom IPv6 prefix. */
  inline def Prefix(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.customip.PrefixArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.customip.PrefixArgs.builder
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
    com.pulumi.azure.customip.Prefix(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
