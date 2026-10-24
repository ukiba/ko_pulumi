package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object graph:
  object GraphFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Graph Services Account. */
    inline def getServicesAccount(args: Endofunction[com.pulumi.azure.graph.inputs.GetServicesAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.graph.outputs.GetServicesAccountResult] =
      val argsBuilder = com.pulumi.azure.graph.inputs.GetServicesAccountArgs.builder
      com.pulumi.azure.graph.GraphFunctions.getServicesAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Graph Services Account. */
    inline def getServicesAccountPlain(args: Endofunction[com.pulumi.azure.graph.inputs.GetServicesAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.graph.outputs.GetServicesAccountResult] =
      val argsBuilder = com.pulumi.azure.graph.inputs.GetServicesAccountPlainArgs.builder
      com.pulumi.azure.graph.GraphFunctions.getServicesAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Microsoft Graph Services Account. */
  def ServicesAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.graph.ServicesAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.graph.ServicesAccountArgs.builder
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
    com.pulumi.azure.graph.ServicesAccount(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
