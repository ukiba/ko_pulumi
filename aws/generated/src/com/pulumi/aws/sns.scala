package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object sns:
  /**
   * Provides a resource for subscribing to SNS topics. Requires that an SNS topic exist for the subscription to attach to. This resource allows you to automatically place messages sent to SNS topics in SQS queues, send them as HTTP(S) POST requests to a given endpoint, send SMS messages, or notify devices / applications. The most likely use case for provider users will probably be SQS queues.
   *  
   *  &gt; **NOTE:** If the SNS topic and SQS queue are in different AWS regions, the `aws.sns.TopicSubscription` must use an AWS provider that is in the same region as the SNS topic. If the `aws.sns.TopicSubscription` uses a provider with a different region than the SNS topic, this provider will fail to create the subscription.
   *  
   *  &gt; **NOTE:** Setup of cross-account subscriptions from SNS topics to SQS queues requires the provider to have access to BOTH accounts.
   *  
   *  &gt; **NOTE:** If an SNS topic and SQS queue are in different AWS accounts but the same region, the `aws.sns.TopicSubscription` must use the AWS provider for the account with the SQS queue. If `aws.sns.TopicSubscription` uses a Provider with a different account than the SQS queue, this provider creates the subscription but does not keep state and tries to re-create the subscription at every `apply`.
   *  
   *  &gt; **NOTE:** If an SNS topic and SQS queue are in different AWS accounts and different AWS regions, the subscription needs to be initiated from the account with the SQS queue but in the region of the SNS topic.
   *  
   *  &gt; **NOTE:** You cannot unsubscribe to a subscription that is pending confirmation. If you use `email`, `email-json`, or `http`/`https` (without auto-confirmation enabled), until the subscription is confirmed (e.g., outside of this provider), AWS does not allow this provider to delete / unsubscribe the subscription. If you `destroy` an unconfirmed subscription, this provider will remove the subscription from its state but the subscription will still exist in AWS. However, if you delete an SNS topic, SNS [deletes all the subscriptions](https://docs.aws.amazon.com/sns/latest/dg/sns-delete-subscription-topic.html) associated with the topic. Also, you can import a subscription after confirmation and then have the capability to delete it.
   */
  def TopicSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sns.TopicSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sns.TopicSubscriptionArgs.builder
    
    com.pulumi.aws.sns.TopicSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SnsFunctions = com.pulumi.aws.sns.SnsFunctions
  object SnsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.sns.SnsFunctions.*
  extension (self: SnsFunctions.type)
    /**
     * Use this data source to get the ARN of a topic in AWS Simple Notification
     *  Service (SNS). By using this data source, you can reference SNS topics
     *  without having to hard code the ARNs as input.
     */
    def getTopic(args: Endofunction[com.pulumi.aws.sns.inputs.GetTopicArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sns.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.aws.sns.inputs.GetTopicArgs.builder
      com.pulumi.aws.sns.SnsFunctions.getTopic(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a topic in AWS Simple Notification
     *  Service (SNS). By using this data source, you can reference SNS topics
     *  without having to hard code the ARNs as input.
     */
    def getTopicPlain(args: Endofunction[com.pulumi.aws.sns.inputs.GetTopicPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sns.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.aws.sns.inputs.GetTopicPlainArgs.builder
      com.pulumi.aws.sns.SnsFunctions.getTopicPlain(args(argsBuilder).build)

  /** Provides a way to set SNS SMS preferences. */
  def SmsPreferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sns.SmsPreferencesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sns.SmsPreferencesArgs.builder
    
    com.pulumi.aws.sns.SmsPreferences(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SNS platform application resource */
  def PlatformApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sns.PlatformApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sns.PlatformApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.sns.PlatformApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SNS topic resource */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sns.TopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sns.TopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sns.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SNS data protection topic policy resource */
  def DataProtectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sns.DataProtectionPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sns.DataProtectionPolicyArgs.builder
    
    com.pulumi.aws.sns.DataProtectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an SNS topic policy resource
   *  
   *  &gt; **NOTE:** If a Principal is specified as just an AWS account ID rather than an ARN, AWS silently converts it to the ARN for the root user, causing future deployments to differ. To avoid this problem, just specify the full ARN, e.g. `arn:aws:iam::123456789012:root`
   */
  def TopicPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sns.TopicPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sns.TopicPolicyArgs.builder
    
    com.pulumi.aws.sns.TopicPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sns.TopicPolicyArgs.Builder)
    /**
     * @param policy The fully-formed AWS policy as JSON.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sns.TopicPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sns.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sns.inputs.TopicPolicyState.Builder)
    /**
     * @param policy The fully-formed AWS policy as JSON.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sns.inputs.TopicPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.sns.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)
