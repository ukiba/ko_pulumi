package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object pricing:
  object PricingFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the pricing information of all products in AWS.
     * This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    inline def getProduct(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProduct(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the pricing information of all products in AWS.
     * This data source is only available in a us-east-1 or ap-south-1 provider.
     */
    inline def getProductPlain(args: Endofunction[com.pulumi.aws.pricing.inputs.GetProductPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.pricing.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.pricing.inputs.GetProductPlainArgs.builder
      com.pulumi.aws.pricing.PricingFunctions.getProductPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
