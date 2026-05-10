package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object managementresource:
  /** Manages a Management Lock which is scoped to a Subscription, Resource Group or Resource. */
  @deprecated() def ManangementLock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.managementresource.ManangementLockArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.managementresource.ManangementLockArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.managementresource.ManangementLock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
