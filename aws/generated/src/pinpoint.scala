package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object pinpoint:
  /**
   * Provides an End User Messaging ADM (Amazon Device Messaging) Channel resource.
   * 
   * &gt; **Note:** All arguments including the Client ID and Client Secret will be stored in the raw state as plain-text.
   */
  inline def AdmChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.AdmChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.AdmChannelArgs.builder
    com.pulumi.aws.pinpoint.AdmChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging APNs Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  inline def ApnsChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging APNs Sandbox Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  inline def ApnsSandboxChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsSandboxChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsSandboxChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsSandboxChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging APNs VoIP Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  inline def ApnsVoipChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsVoipChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsVoipChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsVoipChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging APNs VoIP Sandbox Channel resource.
   * 
   * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  inline def ApnsVoipSandboxChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs.builder
    com.pulumi.aws.pinpoint.ApnsVoipSandboxChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging App resource.
   * 
   * &gt; **NOTE:** The `campaignHook`, `limits`, and `quietTime` attributes are deprecated. AWS End User Messaging engagement features, including the Settings API that backs these attributes, are being discontinued on October 30, 2026. See the [AWS End User Messaging migration guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/migrate.html) for details.
   */
  inline def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.AppArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging Baidu Channel resource.
   * 
   * &gt; **Note:** All arguments including the API Key and Secret Key will be stored in the raw state as plain-text.
   */
  inline def BaiduChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.BaiduChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.BaiduChannelArgs.builder
    com.pulumi.aws.pinpoint.BaiduChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **NOTE:** This resource is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES using `aws.ses.DomainIdentity`, `aws.sesv2.EmailIdentity`, and related SES/SESv2 resources. See the [AWS End User Messaging migration guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/migrate.html) for details.
   * 
   * Provides an End User Messaging Email Channel resource.
   */
  inline def EmailChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EmailChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.EmailChannelArgs.builder
    com.pulumi.aws.pinpoint.EmailChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **NOTE:** This resource is deprecated. AWS End User Messaging email features are being discontinued on October 30, 2026. Migrate to Amazon SES using `aws.ses.Template` or `aws.sesv2.EmailIdentity` and related SESv2 resources. See the [AWS End User Messaging migration guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/migrate.html) for details.
   * 
   * Provides an End User Messaging Email Template resource
   */
  inline def EmailTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &gt; **NOTE:** This resource is deprecated. AWS End User Messaging event streams are being discontinued on October 30, 2026. After that date, this resource will no longer be available. For SMS/Voice event delivery, use `aws.pinpoint.Smsvoicev2ConfigurationSet` with an event destination.
   * 
   * Provides an End User Messaging Event Stream resource.
   */
  inline def EventStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EventStreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.EventStreamArgs.builder
    com.pulumi.aws.pinpoint.EventStream(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an End User Messaging GCM Channel resource.
   * 
   * &gt; **Note:** Credentials (Service Account JSON and API Key) will be stored in the raw state as plain-text.
   * ## Import
   * 
   * Using `pulumi import`, import End User Messaging GCM Channel using the `application-id`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:pinpoint/gcmChannel:GcmChannel gcm application-id
   * ```
   */
  inline def GcmChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.GcmChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.GcmChannelArgs.builder
    com.pulumi.aws.pinpoint.GcmChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Use the `aws.pinpoint.SmsChannel` resource to manage End User Messaging SMS Channels.
   * 
   * &gt; **NOTE:** AWS has feature frozen the SMS channel of End User Messaging.
   */
  inline def SmsChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.SmsChannelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.SmsChannelArgs.builder
    com.pulumi.aws.pinpoint.SmsChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS End User Messaging SMS Configuration Set. */
  inline def Smsvoicev2ConfigurationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS End User Messaging SMS Event Destination.
   * 
   * An event destination is a location where messaging events are published. Exactly one of `cloudwatchLogsDestination`, `kinesisFirehoseDestination`, or `snsDestination` must be configured per event destination. Changing the sink type (e.g., from `snsDestination` to `cloudwatchLogsDestination`) forces resource replacement \u2014 AWS&#39;s `UpdateEventDestination` rejects sink-type changes with `ConflictException`.
   */
  inline def Smsvoicev2EventDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2EventDestinationArgs.builder
    com.pulumi.aws.pinpoint.Smsvoicev2EventDestination(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS End User Messaging SMS Keyword.
   * 
   * &gt; **Note:** The mandatory keywords `HELP` and `STOP` exist on every origination identity and cannot be created or deleted independently of it. For these mandatory keywords only, this resource adopts and manages the `keywordMessage` in place, while `keywordAction` is managed by AWS and cannot be set. Destroying a resource that manages a mandatory keyword does not delete or reset it in AWS; the keyword remains on the origination identity with its last-applied message. Non-mandatory keywords are created and deleted normally.
   */
  inline def Smsvoicev2Keyword(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2KeywordArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2KeywordArgs.builder
    com.pulumi.aws.pinpoint.Smsvoicev2Keyword(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS End User Messaging SMS opt-out list. */
  inline def Smsvoicev2OptOutList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2OptOutListArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS End User Messaging SMS phone number. */
  inline def Smsvoicev2PhoneNumber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS End User Messaging SMS Pool. */
  inline def Smsvoicev2Pool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2PoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2PoolArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.pinpoint.Smsvoicev2Pool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS End User Messaging SMS Resource Policy. */
  inline def Smsvoicev2ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2ResourcePolicyArgs.builder
    com.pulumi.aws.pinpoint.Smsvoicev2ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an End User Messaging SMS Sender ID. */
  inline def Smsvoicev2SenderId(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2SenderIdArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2SenderIdArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.pinpoint.Smsvoicev2SenderId(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
