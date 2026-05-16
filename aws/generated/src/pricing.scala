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

  object PricingFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the pricing information of all products in AWS.
     *  This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    inline def getProduct(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProduct(args(argsBuilder).build)

    /**
     * Use this data source to get the pricing information of all products in AWS.
     *  This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    inline def getProductPlain(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductPlainArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProductPlain(args(argsBuilder).build)
