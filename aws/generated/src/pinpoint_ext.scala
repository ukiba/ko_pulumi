package jp.ukiba.ko_pulumi
package aws

object pinpoint_ext:
  extension (builder: com.pulumi.aws.pinpoint.AppArgs.Builder)
    /**
     * @param campaignHook Settings for invoking an AWS Lambda function that customizes a segment for a campaign. See below.
     * @return builder
     * @deprecated campaign_hook is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated("campaign_hook is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.") def campaignHook(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.builder
      builder.campaignHook(args(argsBuilder).build)

    /**
     * @param limits Default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own. See below.
     * @return builder
     * @deprecated limits is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated("limits is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.") def limits(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param quietTime Default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own. See below.
     * @return builder
     * @deprecated quiet_time is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated("quiet_time is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.") def quietTime(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.builder
      builder.quietTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder)
    /**
     * @param emailTemplates Content and settings for a message template that can be used in messages that are sent through the email channel. See below.
     * @return builder
     * @deprecated email_template is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES.
     */
    @deprecated("email_template is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES.") def emailTemplates(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder]*):
        com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.builder
      builder.emailTemplates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.Builder)
    /**
     * @param cloudwatchLogsDestination Send events to Amazon CloudWatch Logs. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured. See `cloudwatchLogsDestination` Block for details.
     * @return builder
     */
    def cloudwatchLogsDestination(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationCloudwatchLogsDestinationArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationCloudwatchLogsDestinationArgs.builder
      builder.cloudwatchLogsDestination(args(argsBuilder).build)

    /**
     * @param kinesisFirehoseDestination Send events to Amazon Data Firehose. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured. See `kinesisFirehoseDestination` Block for details.
     * @return builder
     */
    def kinesisFirehoseDestination(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationKinesisFirehoseDestinationArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationKinesisFirehoseDestinationArgs.builder
      builder.kinesisFirehoseDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Send events to Amazon SNS. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured. See `snsDestination` Block for details.
     * @return builder
     */
    def snsDestination(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.Smsvoicev2PoolArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PoolTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2PoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PoolTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.Smsvoicev2SenderIdArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2SenderIdTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2SenderIdArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2SenderIdTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.AppState.Builder)
    /**
     * @param campaignHook Settings for invoking an AWS Lambda function that customizes a segment for a campaign. See below.
     * @return builder
     * @deprecated campaign_hook is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated("campaign_hook is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.") def campaignHook(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.builder
      builder.campaignHook(args(argsBuilder).build)

    /**
     * @param limits Default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own. See below.
     * @return builder
     * @deprecated limits is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated("limits is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.") def limits(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param quietTime Default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own. See below.
     * @return builder
     * @deprecated quiet_time is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated("quiet_time is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.") def quietTime(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.builder
      builder.quietTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder)
    /**
     * @param headers List of [MessageHeaders](https://docs.aws.amazon.com/pinpoint/latest/apireference/templates-template-name-email.html#templates-template-name-email-model-messageheader) for the email. You can have up to 15 Headers. See below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateHeaderArgs.Builder]*):
        com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pinpoint.inputs.EmailTemplateState.Builder)
    /**
     * @param emailTemplates Content and settings for a message template that can be used in messages that are sent through the email channel. See below.
     * @return builder
     * @deprecated email_template is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES.
     */
    @deprecated("email_template is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES.") def emailTemplates(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder]*):
        com.pulumi.aws.pinpoint.inputs.EmailTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.builder
      builder.emailTemplates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationState.Builder)
    /**
     * @param cloudwatchLogsDestination Send events to Amazon CloudWatch Logs. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured. See `cloudwatchLogsDestination` Block for details.
     * @return builder
     */
    def cloudwatchLogsDestination(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationCloudwatchLogsDestinationArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationCloudwatchLogsDestinationArgs.builder
      builder.cloudwatchLogsDestination(args(argsBuilder).build)

    /**
     * @param kinesisFirehoseDestination Send events to Amazon Data Firehose. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured. See `kinesisFirehoseDestination` Block for details.
     * @return builder
     */
    def kinesisFirehoseDestination(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationKinesisFirehoseDestinationArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationKinesisFirehoseDestinationArgs.builder
      builder.kinesisFirehoseDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Send events to Amazon SNS. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured. See `snsDestination` Block for details.
     * @return builder
     */
    def snsDestination(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2EventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.Smsvoicev2PoolState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PoolTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2PoolState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PoolTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.Smsvoicev2SenderIdState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2SenderIdTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2SenderIdState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2SenderIdTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
