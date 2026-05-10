package jp.ukiba.ko_pulumi
package aws


object pricing:
  extension (builder: com.pulumi.aws.pricing.inputs.GetProductArgs.Builder)
    /**
     * @param filters List of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductFilterArgs.Builder]*):
        com.pulumi.aws.pricing.inputs.GetProductArgs.Builder =
      def argsBuilder = com.pulumi.aws.pricing.inputs.GetProductFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  type PricingFunctions = com.pulumi.aws.pricing.PricingFunctions
  object PricingFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.pricing.PricingFunctions.*
  extension (self: PricingFunctions.type)
    /**
     * Use this data source to get the pricing information of all products in AWS.
     *  This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    def getProduct(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProduct(args(argsBuilder).build)

    /**
     * Use this data source to get the pricing information of all products in AWS.
     *  This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    def getProductPlain(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductPlainArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProductPlain(args(argsBuilder).build)
