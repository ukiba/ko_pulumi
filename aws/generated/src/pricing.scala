package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object pricing:
  object PricingFunctions:
    /**
     * Use this data source to get the pricing information of all products in AWS.
     * This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    inline def getProduct(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProduct(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the pricing information of all products in AWS.
     * This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    inline def getProductPlain(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductPlainArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProductPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
