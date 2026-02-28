package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

object billing:
  type BillingFunctions = com.pulumi.aws.billing.BillingFunctions
  object BillingFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.billing.BillingFunctions.*
  extension (self: BillingFunctions.type)
    /** Provides details about an AWS Billing Views. */
    def getViews(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViews(args(argsBuilder).build)

    /** Provides details about an AWS Billing Views. */
    def getViewsPlain(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsPlainArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViewsPlain(args(argsBuilder).build)
