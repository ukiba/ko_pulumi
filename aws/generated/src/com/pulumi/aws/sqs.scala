package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object sqs:
  /**
   * Amazon SQS (Simple Queue Service) is a fully managed message queuing service that enables decoupling and scaling of microservices, distributed systems, and serverless applications. This resource allows you to create, configure, and manage an SQS queue, which acts as a reliable message buffer between producers and consumers. With support for standard and FIFO queues, SQS ensures secure, scalable, and asynchronous message processing. Use this resource to define queue attributes, configure access policies, and integrate seamlessly with AWS services like Lambda, SNS, and EC2.
   *  
   *  !&gt; AWS will hang indefinitely, leading to a `timeout while waiting` error, when creating or updating an `aws.sqs.Queue` with an associated `aws.sqs.QueuePolicy` if `Version = &#34;2012-10-17&#34;` is not explicitly set in the policy.
   */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sqs.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sqs.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a SQS Queue Redrive Allow Policy resource. */
  def RedriveAllowPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.RedriveAllowPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sqs.RedriveAllowPolicyArgs.builder
    
    com.pulumi.aws.sqs.RedriveAllowPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SqsFunctions = com.pulumi.aws.sqs.SqsFunctions
  object SqsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.sqs.SqsFunctions.*
  extension (self: SqsFunctions.type)
    /**
     * Use this data source to get the ARN and URL of queue in AWS Simple Queue Service (SQS).
     *  By using this data source, you can reference SQS queues without having to hardcode
     *  the ARNs as input.
     *  
     *  &gt; **NOTE:** To use this data source, you must have the `sqs:GetQueueAttributes` and `sqs:GetQueueURL` permissions.
     */
    def getQueue(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueueArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sqs.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueueArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueue(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN and URL of queue in AWS Simple Queue Service (SQS).
     *  By using this data source, you can reference SQS queues without having to hardcode
     *  the ARNs as input.
     *  
     *  &gt; **NOTE:** To use this data source, you must have the `sqs:GetQueueAttributes` and `sqs:GetQueueURL` permissions.
     */
    def getQueuePlain(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueuePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sqs.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueuePlain(args(argsBuilder).build)

    /** Data source for managing an AWS SQS (Simple Queue) Queues. */
    def getQueues(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueuesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sqs.outputs.GetQueuesResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueuesArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueues(args(argsBuilder).build)

    /** Data source for managing an AWS SQS (Simple Queue) Queues. */
    def getQueuesPlain(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueuesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sqs.outputs.GetQueuesResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueuesPlainArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueuesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sqs.QueuePolicyArgs.Builder)
    def policy(args: Endofunction[com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sqs.QueuePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sqs.inputs.QueuePolicyState.Builder)
    def policy(args: Endofunction[com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sqs.inputs.QueuePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  /**
   * Allows you to set a redrive policy of an SQS Queue
   *  while referencing ARN of the dead letter queue inside the redrive policy.
   *  
   *  This is useful when you want to set a dedicated
   *  dead letter queue for a standard or FIFO queue, but need
   *  the dead letter queue to exist before setting the redrive policy.
   */
  def RedrivePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.RedrivePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sqs.RedrivePolicyArgs.builder
    
    com.pulumi.aws.sqs.RedrivePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows you to set a policy of an SQS Queue while referencing the ARN of the queue within the policy.
   *  
   *  !&gt; AWS will hang indefinitely when creating or updating an `aws.sqs.Queue` with an associated policy if `Version = &#34;2012-10-17&#34;` is not explicitly set in the policy. See below for an example of how to avoid this issue.
   */
  def QueuePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.QueuePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sqs.QueuePolicyArgs.builder
    
    com.pulumi.aws.sqs.QueuePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
