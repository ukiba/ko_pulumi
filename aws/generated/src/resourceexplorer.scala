package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object resourceexplorer:
  /** Provides a resource to manage a Resource Explorer index in the current AWS Region. */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resourceexplorer.IndexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.resourceexplorer.IndexArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.Builder]):
        com.pulumi.aws.resourceexplorer.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  object ResourceexplorerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Resource Explorer Search. */
    inline def search(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.SearchArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.resourceexplorer.outputs.SearchResult] =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.SearchArgs.builder
      com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.search(args(argsBuilder).build)

    /** Data source for managing an AWS Resource Explorer Search. */
    inline def searchPlain(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.SearchPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.resourceexplorer.outputs.SearchResult] =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.SearchPlainArgs.builder
      com.pulumi.aws.resourceexplorer.ResourceexplorerFunctions.searchPlain(args(argsBuilder).build)

  /** Provides a resource to manage a Resource Explorer view. */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.resourceexplorer.ViewArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
