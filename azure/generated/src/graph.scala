package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object graph:
  object GraphFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Graph Services Account. */
    inline def getServicesAccount(args: Endofunction[com.pulumi.azure.graph.inputs.GetServicesAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.graph.outputs.GetServicesAccountResult] =
      val argsBuilder = com.pulumi.azure.graph.inputs.GetServicesAccountArgs.builder
      com.pulumi.azure.graph.GraphFunctions.getServicesAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Graph Services Account. */
    inline def getServicesAccountPlain(args: Endofunction[com.pulumi.azure.graph.inputs.GetServicesAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.graph.outputs.GetServicesAccountResult] =
      val argsBuilder = com.pulumi.azure.graph.inputs.GetServicesAccountPlainArgs.builder
      com.pulumi.azure.graph.GraphFunctions.getServicesAccountPlain(args(argsBuilder).build)

  /** Manages a Microsoft Graph Services Account. */
  def ServicesAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.graph.ServicesAccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.graph.ServicesAccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.graph.ServicesAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
