package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object aadb2c:
  /** Manages an AAD B2C Directory. */
  def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.aadb2c.DirectoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.aadb2c.DirectoryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.aadb2c.Directory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Aadb2cFunctions = com.pulumi.azure.aadb2c.Aadb2cFunctions
  object Aadb2cFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.aadb2c.Aadb2cFunctions.*
  extension (self: Aadb2cFunctions.type)
    /** Use this data source to access information about an existing AAD B2C Directory. */
    def getDirectory(args: Endofunction[com.pulumi.azure.aadb2c.inputs.GetDirectoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.aadb2c.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.azure.aadb2c.inputs.GetDirectoryArgs.builder
      com.pulumi.azure.aadb2c.Aadb2cFunctions.getDirectory(args(argsBuilder).build)

    /** Use this data source to access information about an existing AAD B2C Directory. */
    def getDirectoryPlain(args: Endofunction[com.pulumi.azure.aadb2c.inputs.GetDirectoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.aadb2c.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.azure.aadb2c.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.azure.aadb2c.Aadb2cFunctions.getDirectoryPlain(args(argsBuilder).build)
