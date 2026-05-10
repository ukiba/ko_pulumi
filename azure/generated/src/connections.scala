package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object connections:
  type ConnectionsFunctions = com.pulumi.azure.connections.ConnectionsFunctions
  object ConnectionsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.connections.ConnectionsFunctions.*
  extension (self: ConnectionsFunctions.type)
    /** Use this data source to access information about an existing API Connection. */
    def getApiConnection(args: Endofunction[com.pulumi.azure.connections.inputs.GetApiConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.connections.outputs.GetApiConnectionResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetApiConnectionArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getApiConnection(args(argsBuilder).build)

    /** Use this data source to access information about an existing API Connection. */
    def getApiConnectionPlain(args: Endofunction[com.pulumi.azure.connections.inputs.GetApiConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.connections.outputs.GetApiConnectionResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetApiConnectionPlainArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getApiConnectionPlain(args(argsBuilder).build)

    /** Uses this data source to access information about an existing Managed API. */
    def getManagedApi(args: Endofunction[com.pulumi.azure.connections.inputs.GetManagedApiArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.connections.outputs.GetManagedApiResult] =
      val argsBuilder = com.pulumi.azure.connections.inputs.GetManagedApiArgs.builder
      com.pulumi.azure.connections.ConnectionsFunctions.getManagedApi(args(argsBuilder).build)

    /** Uses this data source to access information about an existing Managed API. */
    def getManagedApiPlain(args: Endofunction[com.pulumi.azure.connections.inputs.GetManagedApiPlainArgs.Builder] = scala.Predef.identity):
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
