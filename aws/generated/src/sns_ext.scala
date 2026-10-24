package jp.ukiba.ko_pulumi
package aws

object sns_ext:
  extension (builder: com.pulumi.aws.sns.TopicPolicyArgs.Builder)
    /**
     * @param policy The fully-formed AWS policy as JSON.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sns.TopicPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.sns.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder)
    inline def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sns.inputs.TopicPolicyState.Builder)
    /**
     * @param policy The fully-formed AWS policy as JSON.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.sns.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.sns.inputs.TopicPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.sns.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)
