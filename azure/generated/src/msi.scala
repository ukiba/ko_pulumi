package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object msi:
  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   * Manages a User Assigned Identity.
   */
  @deprecated("azure.msi.UserAssignedIdentity has been deprecated in favor of azure.authorization.UserAssignedIdentity") inline def UserAssignedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.msi.UserAssignedIdentityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.msi.UserAssignedIdentityArgs.builder
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
    com.pulumi.azure.msi.UserAssignedIdentity(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
