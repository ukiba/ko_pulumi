package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object graph:
  type GraphFunctions = com.pulumi.azure.graph.GraphFunctions
  object GraphFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.graph.GraphFunctions.*
  extension (self: GraphFunctions.type)
    /** Use this data source to access information about an existing Graph Services Account. */
    def getServicesAccount(args: Endofunction[com.pulumi.azure.graph.inputs.GetServicesAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.graph.outputs.GetServicesAccountResult] =
      val argsBuilder = com.pulumi.azure.graph.inputs.GetServicesAccountArgs.builder
      com.pulumi.azure.graph.GraphFunctions.getServicesAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Graph Services Account. */
    def getServicesAccountPlain(args: Endofunction[com.pulumi.azure.graph.inputs.GetServicesAccountPlainArgs.Builder] = scala.Predef.identity):
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
