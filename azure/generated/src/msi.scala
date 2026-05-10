package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object msi:
  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   *  Manages a User Assigned Identity.
   */
  @deprecated() def UserAssignedIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.msi.UserAssignedIdentityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.msi.UserAssignedIdentityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.msi.UserAssignedIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
