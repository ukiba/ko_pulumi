package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object customip:
  /** Manages a custom IPv4 prefix or custom IPv6 prefix. */
  def Prefix(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.customip.PrefixArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.customip.PrefixArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.customip.Prefix(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
