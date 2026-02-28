package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object resourceexplorer:
  extension (builder: com.pulumi.aws.resourceexplorer.ViewArgs.Builder)
    /**
     * @param filters Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.ViewFiltersArgs.Builder]):
        com.pulumi.aws.resourceexplorer.ViewArgs.Builder =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.ViewFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param includedProperties Optional fields to be included in search results from this view. See Included Properties below for more details.
     * @return builder
     */
    def includedProperties(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.ViewIncludedPropertyArgs.Builder]*):
        com.pulumi.aws.resourceexplorer.ViewArgs.Builder =
      def argsBuilder = com.pulumi.aws.resourceexplorer.inputs.ViewIncludedPropertyArgs.builder
      builder.includedProperties(args.map(_(argsBuilder).build)*)

  type ResourceexplorerFunctions = com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions
  object ResourceexplorerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.*
  extension (self: ResourceexplorerFunctions.type)
    /** Data source for managing an AWS Resource Explorer Search. */
    def search(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.SearchArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.resourceexplorer.outputs.SearchResult] =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.SearchArgs.builder
      com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.search(args(argsBuilder).build)

    /** Data source for managing an AWS Resource Explorer Search. */
    def searchPlain(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.SearchPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourceexplorer.outputs.SearchResult] =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.SearchPlainArgs.builder
      com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.searchPlain(args(argsBuilder).build)

  /** Provides a resource to manage a Resource Explorer index in the current AWS Region. */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resourceexplorer.IndexArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resourceexplorer.IndexArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.resourceexplorer.Index(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.resourceexplorer.IndexArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.Builder]):
        com.pulumi.aws.resourceexplorer.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a resource to manage a Resource Explorer view. */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.resourceexplorer.ViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.resourceexplorer.ViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.resourceexplorer.View(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.resourceexplorer.inputs.IndexState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.Builder]):
        com.pulumi.aws.resourceexplorer.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.resourceexplorer.inputs.ViewState.Builder)
    /**
     * @param filters Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.ViewFiltersArgs.Builder]):
        com.pulumi.aws.resourceexplorer.inputs.ViewState.Builder =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.ViewFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param includedProperties Optional fields to be included in search results from this view. See Included Properties below for more details.
     * @return builder
     */
    def includedProperties(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.ViewIncludedPropertyArgs.Builder]*):
        com.pulumi.aws.resourceexplorer.inputs.ViewState.Builder =
      def argsBuilder = com.pulumi.aws.resourceexplorer.inputs.ViewIncludedPropertyArgs.builder
      builder.includedProperties(args.map(_(argsBuilder).build)*)
