package jp.ukiba.ko_pulumi
package aws

object ses_ext:
  extension (builder: com.pulumi.aws.ses.ConfigurationSetArgs.Builder)
    /**
     * @param deliveryOptions Whether messages that use the configuration set are required to use TLS. See below.
     * @return builder
     */
    inline def deliveryOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.ses.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions Domain that is used to redirect email recipients to an Amazon SES-operated domain. See below. **NOTE:** This functionality is best effort.
     * @return builder
     */
    inline def trackingOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.ses.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ses.EventDestinationArgs.Builder)
    /**
     * @param cloudwatchDestinations CloudWatch destination for the events
     * @return builder
     */
    inline def cloudwatchDestinations(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.Builder]*):
        com.pulumi.aws.ses.EventDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.builder
      builder.cloudwatchDestinations(args.map(_(argsBuilder).build)*)

    /**
     * @param kinesisDestination Send the events to a kinesis firehose destination
     * @return builder
     */
    inline def kinesisDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.Builder]):
        com.pulumi.aws.ses.EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.builder
      builder.kinesisDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Send the events to an SNS Topic destination
     * 
     * &gt; **NOTE:** You can specify `&#34;cloudwatchDestination&#34;` or `&#34;kinesisDestination&#34;` but not both
     * @return builder
     */
    inline def snsDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.ses.EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ses.ReceiptRuleArgs.Builder)
    /**
     * @param addHeaderActions Configuration block for adding a header to received emails. Detailed below.
     * @return builder
     */
    inline def addHeaderActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.builder
      builder.addHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param bounceActions Configuration block for rejecting received emails. Detailed below.
     * @return builder
     */
    inline def bounceActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.builder
      builder.bounceActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaActions Configuration block for calling an AWS Lambda function. Detailed below.
     * @return builder
     */
    inline def lambdaActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.builder
      builder.lambdaActions(args.map(_(argsBuilder).build)*)

    /**
     * @param s3Actions Configuration block for storing received emails in an S3 bucket. Detailed below.
     * @return builder
     */
    inline def s3Actions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.builder
      builder.s3Actions(args.map(_(argsBuilder).build)*)

    /**
     * @param snsActions Configuration block for publishing to an SNS topic. Detailed below.
     * @return builder
     */
    inline def snsActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.builder
      builder.snsActions(args.map(_(argsBuilder).build)*)

    /**
     * @param stopActions Configuration block for terminating the evaluation of the receipt rule set. Detailed below.
     * @return builder
     */
    inline def stopActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.builder
      builder.stopActions(args.map(_(argsBuilder).build)*)

    /**
     * @param workmailActions Configuration block for calling Amazon WorkMail. Detailed below.
     * @return builder
     */
    inline def workmailActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.builder
      builder.workmailActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ses.inputs.ConfigurationSetState.Builder)
    /**
     * @param deliveryOptions Whether messages that use the configuration set are required to use TLS. See below.
     * @return builder
     */
    inline def deliveryOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.ses.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions Domain that is used to redirect email recipients to an Amazon SES-operated domain. See below. **NOTE:** This functionality is best effort.
     * @return builder
     */
    inline def trackingOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.ses.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ses.inputs.EventDestinationState.Builder)
    /**
     * @param cloudwatchDestinations CloudWatch destination for the events
     * @return builder
     */
    inline def cloudwatchDestinations(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.Builder]*):
        com.pulumi.aws.ses.inputs.EventDestinationState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.builder
      builder.cloudwatchDestinations(args.map(_(argsBuilder).build)*)

    /**
     * @param kinesisDestination Send the events to a kinesis firehose destination
     * @return builder
     */
    inline def kinesisDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.Builder]):
        com.pulumi.aws.ses.inputs.EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.builder
      builder.kinesisDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Send the events to an SNS Topic destination
     * 
     * &gt; **NOTE:** You can specify `&#34;cloudwatchDestination&#34;` or `&#34;kinesisDestination&#34;` but not both
     * @return builder
     */
    inline def snsDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.ses.inputs.EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder)
    /**
     * @param addHeaderActions Configuration block for adding a header to received emails. Detailed below.
     * @return builder
     */
    inline def addHeaderActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.builder
      builder.addHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param bounceActions Configuration block for rejecting received emails. Detailed below.
     * @return builder
     */
    inline def bounceActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.builder
      builder.bounceActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaActions Configuration block for calling an AWS Lambda function. Detailed below.
     * @return builder
     */
    inline def lambdaActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.builder
      builder.lambdaActions(args.map(_(argsBuilder).build)*)

    /**
     * @param s3Actions Configuration block for storing received emails in an S3 bucket. Detailed below.
     * @return builder
     */
    inline def s3Actions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.builder
      builder.s3Actions(args.map(_(argsBuilder).build)*)

    /**
     * @param snsActions Configuration block for publishing to an SNS topic. Detailed below.
     * @return builder
     */
    inline def snsActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.builder
      builder.snsActions(args.map(_(argsBuilder).build)*)

    /**
     * @param stopActions Configuration block for terminating the evaluation of the receipt rule set. Detailed below.
     * @return builder
     */
    inline def stopActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.builder
      builder.stopActions(args.map(_(argsBuilder).build)*)

    /**
     * @param workmailActions Configuration block for calling Amazon WorkMail. Detailed below.
     * @return builder
     */
    inline def workmailActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.builder
      builder.workmailActions(args.map(_(argsBuilder).build)*)
