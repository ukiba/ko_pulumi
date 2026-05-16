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

  object Aadb2cFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing AAD B2C Directory. */
    inline def getDirectory(args: Endofunction[com.pulumi.azure.aadb2c.inputs.GetDirectoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.aadb2c.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.azure.aadb2c.inputs.GetDirectoryArgs.builder
      com.pulumi.azure.aadb2c.Aadb2cFunctions.getDirectory(args(argsBuilder).build)

    /** Use this data source to access information about an existing AAD B2C Directory. */
    inline def getDirectoryPlain(args: Endofunction[com.pulumi.azure.aadb2c.inputs.GetDirectoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.aadb2c.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.azure.aadb2c.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.azure.aadb2c.Aadb2cFunctions.getDirectoryPlain(args(argsBuilder).build)
