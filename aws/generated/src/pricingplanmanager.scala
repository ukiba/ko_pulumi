package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object pricingplanmanager:
  /**
   * Resource for managing an AWS Pricing Plan Manager Subscription. A subscription applies a flat-rate pricing plan, such as an [Amazon CloudFront flat-rate plan](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/flat-rate-plans.html), to a set of AWS resources: you pay a fixed recurring fee for the covered resources instead of usage-based pricing.
   * 
   * &gt; Destroying this resource cancels the subscription. For active paid subscriptions, AWS schedules the cancellation to take effect at the end of the current billing period, so the subscription remains visible (and billed) in AWS until that date. Subscriptions in `PENDING_APPROVAL` status (and free-tier subscriptions) are deleted immediately. If a scheduled change (such as a downgrade) is pending, it is reverted automatically before the cancellation is requested.
   * 
   * &gt; While a distribution is covered by a subscription, CloudFront blocks removing or replacing its web ACL and blocks deleting the distribution \u2014 including after cancellation, until the cancellation takes effect at the end of the billing cycle.
   * 
   * &gt; Resources must meet the plan family&#39;s eligibility requirements or `CreateSubscription` fails with a `ValidationException`. For the `CloudFront` plan family, distributions using legacy cache settings (`forwardedValues`) are rejected as not eligible \u2014 use [cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html) instead.
   */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pricingplanmanager.SubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pricingplanmanager.SubscriptionArgs.builder
    com.pulumi.aws.pricingplanmanager.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.pricingplanmanager.SubscriptionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.Builder]):
        com.pulumi.aws.pricingplanmanager.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pricingplanmanager.inputs.SubscriptionState.Builder)
    /**
     * @param scheduledChanges Pending change that takes effect at the end of the current billing period, if any. See `scheduledChange` below.
     * @return builder
     */
    def scheduledChanges(args: Endofunction[com.pulumi.aws.pricingplanmanager.inputs.SubscriptionScheduledChangeArgs.Builder]*):
        com.pulumi.aws.pricingplanmanager.inputs.SubscriptionState.Builder =
      def argsBuilder = com.pulumi.aws.pricingplanmanager.inputs.SubscriptionScheduledChangeArgs.builder
      builder.scheduledChanges(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.Builder]):
        com.pulumi.aws.pricingplanmanager.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.aws.pricingplanmanager.inputs.SubscriptionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
