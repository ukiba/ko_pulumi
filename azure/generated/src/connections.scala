package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object connections:
  object ConnectionsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing API Connection. */
    inline def getApiConnection(args: Endofunction[com.pulumi.azure.connections.inputs.GetApiConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.connections.outputs.GetApiConnectionResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetApiConnectionArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getApiConnection(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Connection. */
    inline def getApiConnectionPlain(args: Endofunction[com.pulumi.azure.connections.inputs.GetApiConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.connections.outputs.GetApiConnectionResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetApiConnectionPlainArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getApiConnectionPlain(args(argsBuilder).build)

    /** Uses this data source to access information about an existing Managed API. */
    inline def getManagedApi(args: Endofunction[com.pulumi.azure.connections.inputs.GetManagedApiArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.connections.outputs.GetManagedApiResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetManagedApiArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getManagedApi(args(argsBuilder).build)

    /** Uses this data source to access information about an existing Managed API. */
    inline def getManagedApiPlain(args: Endofunction[com.pulumi.azure.connections.inputs.GetManagedApiPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.connections.outputs.GetManagedApiResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetManagedApiPlainArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getManagedApiPlain(args(argsBuilder).build)

  /** Manages an API Connection. */
  def ApiConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.connections.ApiConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.connections.ApiConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.connections.ApiConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
