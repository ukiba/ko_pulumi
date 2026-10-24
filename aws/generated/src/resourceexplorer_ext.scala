package jp.ukiba.ko_pulumi
package aws

object resourceexplorer_ext:
  extension (builder: com.pulumi.aws.resourceexplorer.IndexArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.Builder]):
        com.pulumi.aws.resourceexplorer.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.resourceexplorer.inputs.IndexTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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
