package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object iotcentral:
  /** Manages an IoT Central Application */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iotcentral.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.iotcentral.ApplicationArgs.builder
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
    com.pulumi.azure.iotcentral.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an IoT Central Application Network Rule Set. */
  def ApplicationNetworkRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.iotcentral.ApplicationNetworkRuleSetArgs.builder
    com.pulumi.azure.iotcentral.ApplicationNetworkRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an IoT Central Organization */
  def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.iotcentral.OrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.iotcentral.OrganizationArgs.builder
    com.pulumi.azure.iotcentral.Organization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
