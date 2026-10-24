package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object resourceexplorer:
  /** Provides a resource to manage a Resource Explorer index in the current AWS Region. */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resourceexplorer.IndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resourceexplorer.IndexArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.resourceexplorer.Index(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ResourceexplorerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Resource Explorer Search. */
    inline def search(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.SearchArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resourceexplorer.outputs.SearchResult] =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.SearchArgs.builder
      com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.search(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Resource Explorer Search. */
    inline def searchPlain(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.SearchPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourceexplorer.outputs.SearchResult] =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.SearchPlainArgs.builder
      com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.searchPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a resource to manage a Resource Explorer view. */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resourceexplorer.ViewArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resourceexplorer.ViewArgs.builder
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
    com.pulumi.aws.resourceexplorer.View(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
