package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object connections:
  /** Manages an API Connection. */
  def ApiConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.connections.ApiConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.connections.ApiConnectionArgs.builder
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
    com.pulumi.azure.connections.ApiConnection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ConnectionsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing API Connection. */
    inline def getApiConnection(args: Endofunction[com.pulumi.azure.connections.inputs.GetApiConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.connections.outputs.GetApiConnectionResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetApiConnectionArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getApiConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing API Connection. */
    inline def getApiConnectionPlain(args: Endofunction[com.pulumi.azure.connections.inputs.GetApiConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.connections.outputs.GetApiConnectionResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetApiConnectionPlainArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getApiConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Uses this data source to access information about an existing Managed API. */
    inline def getManagedApi(args: Endofunction[com.pulumi.azure.connections.inputs.GetManagedApiArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.connections.outputs.GetManagedApiResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetManagedApiArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getManagedApi(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Uses this data source to access information about an existing Managed API. */
    inline def getManagedApiPlain(args: Endofunction[com.pulumi.azure.connections.inputs.GetManagedApiPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.connections.outputs.GetManagedApiResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetManagedApiPlainArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getManagedApiPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
