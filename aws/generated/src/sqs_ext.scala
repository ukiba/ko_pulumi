package jp.ukiba.ko_pulumi
package aws

object sqs_ext:
  extension (builder: com.pulumi.aws.sqs.QueuePolicyArgs.Builder)
    /**
     * @param policy JSON policy for the SQS queue. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide. Ensure that `Version = &#34;2012-10-17&#34;` is set in the policy or AWS may hang in creating the queue.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sqs.QueuePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sqs.inputs.QueuePolicyState.Builder)
    /**
     * @param policy JSON policy for the SQS queue. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide. Ensure that `Version = &#34;2012-10-17&#34;` is set in the policy or AWS may hang in creating the queue.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sqs.inputs.QueuePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.sqs.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)
