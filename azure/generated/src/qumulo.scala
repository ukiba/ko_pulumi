package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object qumulo:
  /** Manages an Azure Native Qumulo Scalable File System. */
  def FileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.qumulo.FileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.qumulo.FileSystemArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.qumulo.FileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
