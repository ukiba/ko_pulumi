package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object savingsplans:
  object SavingsplansFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for getting AWS Savings Plans Offerings. */
    inline def getOfferings(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.savingsplans.outputs.GetOfferingsResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getOfferings(args(argsBuilder).build)

    /** Data source for getting AWS Savings Plans Offerings. */
    inline def getOfferingsPlain(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.savingsplans.outputs.GetOfferingsResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsPlainArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getOfferingsPlain(args(argsBuilder).build)

    /** Use this data source to get information on an existing AWS Savings Plan. */
    inline def getSavingsPlan(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetSavingsPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.savingsplans.outputs.GetSavingsPlanResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetSavingsPlanArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getSavingsPlan(args(argsBuilder).build)

    /** Use this data source to get information on an existing AWS Savings Plan. */
    inline def getSavingsPlanPlain(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetSavingsPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.savingsplans.outputs.GetSavingsPlanResult] =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.GetSavingsPlanPlainArgs.builder
      com.pulumi.aws.savingsplans.SavingsplansFunctions.getSavingsPlanPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.Builder]):
        com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Provides an AWS Savings Plan resource.
   * 
   *  &gt; **WARNING:** Savings Plans represent a financial commitment. Once a Savings Plan becomes active, it **cannot be cancelled or deleted**. Only Savings Plans in the `queued` state (scheduled for future purchase) can be deleted. Use this resource with caution.
   * 
   *  &gt; **Note:** Importing an active Savings Plan will add it to your Terraform state, but destroying it will only remove it from state - the actual Savings Plan will continue until its term ends.
   */
  def SavingsPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.savingsplans.SavingsPlanArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.savingsplans.SavingsPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.Builder)
    /**
     * @param filters List of filters. See Filter.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsFilterArgs.Builder]*):
        com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.Builder]):
        com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
