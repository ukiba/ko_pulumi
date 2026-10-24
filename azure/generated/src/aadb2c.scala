package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object aadb2c:
  object Aadb2cFunctions:
    /** Use this data source to access information about an existing AAD B2C Directory. */
    inline def getDirectory(args: Endofunction[com.pulumi.azure.aadb2c.inputs.GetDirectoryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.aadb2c.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.azure.aadb2c.inputs.GetDirectoryArgs.builder
      com.pulumi.azure.aadb2c.Aadb2cFunctions.getDirectory(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing AAD B2C Directory. */
    inline def getDirectoryPlain(args: Endofunction[com.pulumi.azure.aadb2c.inputs.GetDirectoryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.aadb2c.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.azure.aadb2c.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.azure.aadb2c.Aadb2cFunctions.getDirectoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AAD B2C Directory. */
  def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.aadb2c.DirectoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.aadb2c.DirectoryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.aadb2c.Directory(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
