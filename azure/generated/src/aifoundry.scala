package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object aifoundry:
  /**
   * Manages a Microsoft Foundry Hub (classic) resource.
   * 
   * &gt; **Note:** Hub\u2011based projects are considered legacy and are not compatible with the new Foundry experience. Microsoft recommends using the new Microsoft Foundry resource, which should be provisioned using
   * `azure.cognitive.Account`.
   */
  inline def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.aifoundry.HubArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.aifoundry.HubArgs.builder
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
    com.pulumi.azure.aifoundry.Hub(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Microsoft Foundry Hub (classic) Project resource.
   * 
   * &gt; **Note:** Hub\u2011based projects are considered legacy and are not compatible with the new Foundry experience. Microsoft recommends using the new Microsoft Foundry project resource, which should be provisioned using
   * `azure.cognitive.Account` and `azure.cognitive.AccountProject`.
   */
  inline def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.aifoundry.ProjectArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.aifoundry.ProjectArgs.builder
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
    com.pulumi.azure.aifoundry.Project(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
