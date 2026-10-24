package jp.ukiba.ko_pulumi
package aws

object pricing_ext:
  extension (builder: com.pulumi.aws.pricing.inputs.GetProductArgs.Builder)
    /**
     * @param filters List of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductFilterArgs.Builder]*):
        com.pulumi.aws.pricing.inputs.GetProductArgs.Builder =
      def argsBuilder = com.pulumi.aws.pricing.inputs.GetProductFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pricing.inputs.GetProductPlainArgs.Builder)
    /**
     * @param filters List of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductFilter.Builder]*):
        com.pulumi.aws.pricing.inputs.GetProductPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.pricing.inputs.GetProductFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)
