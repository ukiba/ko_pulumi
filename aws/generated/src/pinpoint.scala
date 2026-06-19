package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object pinpoint:
  /**
   * Provides an End User Messaging ADM (Amazon Device Messaging) Channel resource.
   * 
   * &gt; **Note:** All arguments including the Client ID and Client Secret will be stored in the raw state as plain-text.
   */
  def AdmChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.AdmChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.AdmChannelArgs.builder
    com.pulumi.aws.pinpoint.AdmChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an End User Messaging APNs Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an End User Messaging APNs Sandbox Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsSandboxChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsSandboxChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsSandboxChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsSandboxChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an End User Messaging APNs VoIP Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsVoipChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsVoipChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsVoipChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsVoipChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an End User Messaging APNs VoIP Sandbox Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsVoipSandboxChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsVoipSandboxChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an End User Messaging App resource.
   * 
   * &gt; **NOTE:** The `campaignHook`, `limits`, and `quietTime` attributes are deprecated. AWS End User Messaging engagement features, including the Settings API that backs these attributes, are being discontinued on October 30, 2026. See the [AWS End User Messaging migration guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/migrate.html) for details.
   */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.AppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.AppArgs.builder
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
    com.pulumi.aws.pinpoint.App(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.pinpoint.AppArgs.Builder)
    /**
     * @param campaignHook Settings for invoking an AWS Lambda function that customizes a segment for a campaign. See below.
     * @return builder
     * @deprecated campaign_hook is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated() def campaignHook(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.builder
      builder.campaignHook(args(argsBuilder).build)

    /**
     * @param limits Default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own. See below.
     * @return builder
     * @deprecated limits is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated() def limits(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param quietTime Default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own. See below.
     * @return builder
     * @deprecated quiet_time is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated() def quietTime(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.builder
      builder.quietTime(args(argsBuilder).build)

  /**
   * Provides an End User Messaging Baidu Channel resource.
   * 
   * &gt; **Note:** All arguments including the Api Key and Secret Key will be stored in the raw state as plain-text.
   */
  def BaiduChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.BaiduChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.BaiduChannelArgs.builder
    com.pulumi.aws.pinpoint.BaiduChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * &gt; **NOTE:** This resource is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES using `aws.ses.DomainIdentity`, `aws.sesv2.EmailIdentity`, and related SES/SESv2 resources. See the [AWS End User Messaging migration guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/migrate.html) for details.
   * 
   * Provides an End User Messaging Email Channel resource.
   */
  def EmailChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EmailChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.EmailChannelArgs.builder
    com.pulumi.aws.pinpoint.EmailChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * &gt; **NOTE:** This resource is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES using `aws.ses.Template` or `aws.sesv2.EmailIdentity` and related SESv2 resources. See the [AWS End User Messaging migration guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/migrate.html) for details.
   * 
   * Provides an End User Messaging Email Template resource
   */
  def EmailTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.EmailTemplateArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.pinpoint.EmailTemplate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder)
    /**
     * @param emailTemplates Content and settings for a message template that can be used in messages that are sent through the email channel. See below.
     * @return builder
     * @deprecated email_template is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES.
     */
    @deprecated() def emailTemplates(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder]*):
        com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.builder
      builder.emailTemplates(args.map(_(argsBuilder).build)*)

  /**
   * &gt; **NOTE:** This resource is deprecated. AWS End User Messaging event streams are being discontinued on October 30, 2026. After that date, this resource will no longer be available. For SMS/Voice event delivery, use `aws.pinpoint.Smsvoicev2ConfigurationSet` with an event destination.
   * 
   * Provides an End User Messaging Event Stream resource.
   */
  def EventStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EventStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.EventStreamArgs.builder
    com.pulumi.aws.pinpoint.EventStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an End User Messaging GCM Channel resource.
   * 
   * &gt; **Note:** Credentials (Service Account JSON and API Key) will be stored in the raw state as plain-text.
   * ## Import
   * 
   * Using `pulumi import`, import End User Messaging GCM Channel using the `application-id`. For example:
   * 
   * ```sh
   * $ pulumi import aws:pinpoint/gcmChannel:GcmChannel gcm application-id
   * ```
   */
  def GcmChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.GcmChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.GcmChannelArgs.builder
    com.pulumi.aws.pinpoint.GcmChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Use the `aws.pinpoint.SmsChannel` resource to manage End User Messaging SMS Channels.
   * 
   * &gt; **NOTE:** AWS has feature frozen the SMS channel of End User Messaging.
   */
  def SmsChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.SmsChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.SmsChannelArgs.builder
    com.pulumi.aws.pinpoint.SmsChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an AWS End User Messaging SMS Configuration Set. */
  def Smsvoicev2ConfigurationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSetArgs.builder
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
    com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an AWS End User Messaging SMS Event Destination.
   * 
   * An event destination is a location where messaging events are published. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured per event destination. Changing the sink type (e.g., from `snsDestination` to `cloudwatchLogsDestination`) forces resource replacement \u2014 AWS&#39;s `UpdateEventDestination` rejects sink-type changes with `ConflictException`.
   */
  def Smsvoicev2EventDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.builder
    com.pulumi.aws.pinpoint.Smsvoicev2EventDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Manages an AWS End User Messaging SMS opt-out list. */
  def Smsvoicev2OptOutList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2OptOutListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2OptOutListArgs.builder
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
    com.pulumi.aws.pinpoint.Smsvoicev2OptOutList(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an AWS End User Messaging SMS phone number. */
  def Smsvoicev2PhoneNumber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumber(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.AppState.Builder)
    /**
     * @param campaignHook Settings for invoking an AWS Lambda function that customizes a segment for a campaign. See below.
     * @return builder
     * @deprecated campaign_hook is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated() def campaignHook(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.builder
      builder.campaignHook(args(argsBuilder).build)

    /**
     * @param limits Default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own. See below.
     * @return builder
     * @deprecated limits is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated() def limits(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param quietTime Default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own. See below.
     * @return builder
     * @deprecated quiet_time is deprecated. AWS End User Messaging engagement features are being discontinued on October 30, 2026. See the AWS End User Messaging migration guide for details.
     */
    @deprecated() def quietTime(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.Builder]):
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
    @deprecated() def emailTemplates(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder]*):
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
