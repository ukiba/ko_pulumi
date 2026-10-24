package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object maps:
  /** Manages an Azure Maps Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maps.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maps.AccountArgs.builder
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
    com.pulumi.azure.maps.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Azure Maps Creator.
   * 
   * &gt; **Note:** The `azure.maps.Creator` resource has been deprecated because the service is retiring from 2024-09-23 and will be removed in v5.0 of the AzureRM Provider.
   */
  def Creator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maps.CreatorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maps.CreatorArgs.builder
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
    com.pulumi.azure.maps.Creator(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MapsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Azure Maps Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.maps.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.maps.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.maps.inputs.GetAccountArgs.builder
      com.pulumi.azure.maps.MapsFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Maps Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.maps.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maps.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.maps.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.maps.MapsFunctions.getAccountPlain(args(argsBuilder).build)
