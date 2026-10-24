package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object lighthouse:
  /** Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Assignment to a subscription, or to a resource group. */
  def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.lighthouse.AssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lighthouse.AssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lighthouse.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Definition. */
  def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.lighthouse.DefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lighthouse.DefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lighthouse.Definition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
