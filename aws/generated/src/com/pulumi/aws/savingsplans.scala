package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object savingsplans:
  type SavingsplansFunctions = com.pulumi.aws.savingsplans.SavingsplansFunctions
  object SavingsplansFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.savingsplans.SavingsplansFunctions.*
  extension (self: SavingsplansFunctions.type)
    /** Use this data source to get information on an existing AWS Savings Plan. */
    def getSavingsPlan(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetSavingsPlanArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.savingsplans.outputs.GetSavingsPlanResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetSavingsPlanArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getSavingsPlan(args(argsBuilder).build)

    /** Use this data source to get information on an existing AWS Savings Plan. */
    def getSavingsPlanPlain(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetSavingsPlanPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.savingsplans.outputs.GetSavingsPlanResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetSavingsPlanPlainArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getSavingsPlanPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.Builder]):
        com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides an AWS Savings Plan resource.
   *  
   *  &gt; **WARNING:** Savings Plans represent a financial commitment. Once a Savings Plan becomes active, it **cannot be cancelled or deleted**. Only Savings Plans in the `queued` state (scheduled for future purchase) can be deleted. Use this resource with caution.
   *  
   *  &gt; **Note:** Importing an active Savings Plan will add it to your Terraform state, but destroying it will only remove it from state - the actual Savings Plan will continue until its term ends.
   */
  def SavingsPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.savingsplans.SavingsPlanArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.savingsplans.SavingsPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.Builder]):
        com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
