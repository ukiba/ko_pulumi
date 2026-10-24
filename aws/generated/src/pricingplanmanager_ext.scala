package jp.ukiba.ko_pulumi
package aws

object pricingplanmanager_ext:
  extension (builder: com.pulumi.aws.pricingplanmanager.SubscriptionArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.Builder]):
        com.pulumi.aws.pricingplanmanager.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pricingplanmanager.inputs.SubscriptionState.Builder)
    /**
     * @param scheduledChanges Pending change that takes effect at the end of the current billing period, if any. See `scheduledChange` below.
     * @return builder
     */
    inline def scheduledChanges(args: Endofunction[com.pulumi.aws.pricingplanmanager.inputs.SubscriptionScheduledChangeArgs.Builder]*):
        com.pulumi.aws.pricingplanmanager.inputs.SubscriptionState.Builder =
      def argsBuilder = com.pulumi.aws.pricingplanmanager.inputs.SubscriptionScheduledChangeArgs.builder
      builder.scheduledChanges(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.Builder]):
        com.pulumi.aws.pricingplanmanager.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
