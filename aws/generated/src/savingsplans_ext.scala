package jp.ukiba.ko_pulumi
package aws

object savingsplans_ext:
  extension (builder: com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.Builder]):
        com.pulumi.aws.savingsplans.SavingsPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.Builder)
    /**
     * @param filters List of filters. See Filter.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsFilterArgs.Builder]*):
        com.pulumi.aws.savingsplans.inputs.GetOfferingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.savingsplans.inputs.GetOfferingsPlainArgs.Builder)
    /**
     * @param filters List of filters. See Filter.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.savingsplans.inputs.GetOfferingsFilter.Builder]*):
        com.pulumi.aws.savingsplans.inputs.GetOfferingsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.savingsplans.inputs.GetOfferingsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.Builder]):
        com.pulumi.aws.savingsplans.inputs.SavingsPlanState.Builder =
      val argsBuilder = com.pulumi.aws.savingsplans.inputs.SavingsPlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
