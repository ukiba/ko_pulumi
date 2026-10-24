package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object sqs:
  /**
   * Amazon SQS (Simple Queue Service) is a fully managed message queuing service that enables decoupling and scaling of microservices, distributed systems, and serverless applications. This resource allows you to create, configure, and manage an SQS queue, which acts as a reliable message buffer between producers and consumers. With support for standard and FIFO queues, SQS ensures secure, scalable, and asynchronous message processing. Use this resource to define queue attributes, configure access policies, and integrate seamlessly with AWS services like Lambda, SNS, and EC2.
   * 
   * &gt; AWS will hang indefinitely, leading to a `timeout while waiting` error, when creating or updating an `aws.sqs.Queue` with an associated `aws.sqs.QueuePolicy` if `Version = &#34;2012-10-17&#34;` is not explicitly set in the policy.
   */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.QueueArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sqs.QueueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sqs.Queue(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows you to set a policy of an SQS Queue while referencing the ARN of the queue within the policy.
   * 
   * &gt; AWS will hang indefinitely when creating or updating an `aws.sqs.Queue` with an associated policy if `Version = &#34;2012-10-17&#34;` is not explicitly set in the policy. See below for an example of how to avoid this issue.
   */
  def QueuePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.QueuePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sqs.QueuePolicyArgs.builder
    com.pulumi.aws.sqs.QueuePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SQS Queue Redrive Allow Policy resource. */
  def RedriveAllowPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.RedriveAllowPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sqs.RedriveAllowPolicyArgs.builder
    com.pulumi.aws.sqs.RedriveAllowPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows you to set a redrive policy of an SQS Queue
   * while referencing ARN of the dead letter queue inside the redrive policy.
   * 
   * This is useful when you want to set a dedicated
   * dead letter queue for a standard or FIFO queue, but need
   * the dead letter queue to exist before setting the redrive policy.
   */
  def RedrivePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sqs.RedrivePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sqs.RedrivePolicyArgs.builder
    com.pulumi.aws.sqs.RedrivePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SqsFunctions:
    /**
     * Use this data source to get the ARN and URL of queue in AWS Simple Queue Service (SQS).
     * By using this data source, you can reference SQS queues without having to hardcode
     * the ARNs as input.
     * 
     * &gt; **NOTE:** To use this data source, you must have the `sqs:GetQueueAttributes` and `sqs:GetQueueURL` permissions.
     */
    inline def getQueue(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueueArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sqs.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueueArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the ARN and URL of queue in AWS Simple Queue Service (SQS).
     * By using this data source, you can reference SQS queues without having to hardcode
     * the ARNs as input.
     * 
     * &gt; **NOTE:** To use this data source, you must have the `sqs:GetQueueAttributes` and `sqs:GetQueueURL` permissions.
     */
    inline def getQueuePlain(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueuePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sqs.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS SQS (Simple Queue) Queues. */
    inline def getQueues(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueuesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sqs.outputs.GetQueuesResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueuesArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueues(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS SQS (Simple Queue) Queues. */
    inline def getQueuesPlain(args: Endofunction[com.pulumi.aws.sqs.inputs.GetQueuesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sqs.outputs.GetQueuesResult] =
      val argsBuilder = com.pulumi.aws.sqs.inputs.GetQueuesPlainArgs.builder
      com.pulumi.aws.sqs.SqsFunctions.getQueuesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
