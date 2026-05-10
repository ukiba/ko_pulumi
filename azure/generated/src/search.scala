package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object search:
  extension (builder: com.pulumi.azure.search.ServiceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.search.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.search.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.search.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.search.ServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type SearchFunctions = com.pulumi.azure.search.SearchFunctions
  object SearchFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.search.SearchFunctions.*
  extension (self: SearchFunctions.type)
    /** Manages a Search Service. */
    def getService(args: Endofunction[com.pulumi.azure.search.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.search.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.search.inputs.GetServiceArgs.builder
      com.pulumi.azure.search.SearchFunctions.getService(args(argsBuilder).build)

    /** Manages a Search Service. */
    def getServicePlain(args: Endofunction[com.pulumi.azure.search.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.search.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.search.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.search.SearchFunctions.getServicePlain(args(argsBuilder).build)

  /** Manages the Shared Private Link Service for an Azure Search Service. */
  def SharedPrivateLinkService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.search.SharedPrivateLinkServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.search.SharedPrivateLinkServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.search.SharedPrivateLinkService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Search Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.search.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.search.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.search.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.search.inputs.ServiceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.search.inputs.ServiceIdentityArgs.Builder]):
        com.pulumi.azure.search.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.search.inputs.ServiceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param queryKeys A `queryKeys` block as defined below.
     * @return builder
     */
    def queryKeys(args: Endofunction[com.pulumi.azure.search.inputs.ServiceQueryKeyArgs.Builder]*):
        com.pulumi.azure.search.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.azure.search.inputs.ServiceQueryKeyArgs.builder
      builder.queryKeys(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.search.inputs.ServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
