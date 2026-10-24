package jp.ukiba.ko_pulumi
package aws

object inspector_ext:
  extension (builder: com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder)
    /**
     * @param eventSubscriptions A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     * @return builder
     */
    inline def eventSubscriptions(args: Endofunction[com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.Builder]*):
        com.pulumi.aws.inspector.AssessmentTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.builder
      builder.eventSubscriptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inspector.inputs.AssessmentTemplateState.Builder)
    /**
     * @param eventSubscriptions A block that enables sending notifications about a specified assessment template event to a designated SNS topic. See Event Subscriptions for details.
     * @return builder
     */
    inline def eventSubscriptions(args: Endofunction[com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.Builder]*):
        com.pulumi.aws.inspector.inputs.AssessmentTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.inspector.inputs.AssessmentTemplateEventSubscriptionArgs.builder
      builder.eventSubscriptions(args.map(_(argsBuilder).build)*)
