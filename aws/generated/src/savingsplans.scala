package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object savingsplans:
  /**
   * Provides an AWS Savings Plan resource.
   * 
   * &gt; Savings Plans represent a financial commitment. Once a Savings Plan becomes active, it **cannot be cancelled or deleted**. Only Savings Plans in the `queued` state (scheduled for future purchase) can be deleted. Use this resource with caution.
   * 
   * &gt; Importing an active Savings Plan will add it to your Terraform state, but destroying it will only remove it from state - the actual Savings Plan will continue until its term ends.
   */
  inline def SavingsPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.savingsplans.SavingsPlanArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.savingsplans.SavingsPlan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SavingsplansFunctions:
    /** Data source for getting AWS Savings Plans Offerings. */
    inline def getOfferings(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.savingsplans.outputs.GetOfferingsResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getOfferings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for getting AWS Savings Plans Offerings. */
    inline def getOfferingsPlain(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.savingsplans.outputs.GetOfferingsResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsPlainArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getOfferingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on an existing AWS Savings Plan. */
    inline def getSavingsPlan(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetSavingsPlanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.savingsplans.outputs.GetSavingsPlanResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetSavingsPlanArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getSavingsPlan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on an existing AWS Savings Plan. */
    inline def getSavingsPlanPlain(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetSavingsPlanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.savingsplans.outputs.GetSavingsPlanResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetSavingsPlanPlainArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getSavingsPlanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
