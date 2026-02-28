package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object pinpoint:
  /**
   * Provides a Pinpoint Baidu Channel resource.
   *  
   *  &gt; **Note:** All arguments including the Api Key and Secret Key will be stored in the raw state as plain-text.
   */
  def BaiduChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.BaiduChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.BaiduChannelArgs.builder
    
    com.pulumi.aws.pinpoint.BaiduChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Pinpoint APNs Channel resource.
   *  
   *  &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsChannelArgs.builder
    
    com.pulumi.aws.pinpoint.ApnsChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Pinpoint APNs VoIP Channel resource.
   *  
   *  &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsVoipChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsVoipChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsVoipChannelArgs.builder
    
    com.pulumi.aws.pinpoint.ApnsVoipChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Pinpoint APNs Sandbox Channel resource.
   *  
   *  &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsSandboxChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsSandboxChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsSandboxChannelArgs.builder
    
    com.pulumi.aws.pinpoint.ApnsSandboxChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS End User Messaging SMS Configuration Set. */
  def Smsvoicev2ConfigurationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.pinpoint.Smsvoicev2ConfigurationSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Pinpoint GCM Channel resource.
   *  
   *  &gt; **Note:** Credentials (Service Account JSON and API Key) will be stored in the raw state as plain-text.
   *  ## Import
   *  
   *  Using `pulumi import`, import Pinpoint GCM Channel using the `application-id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:pinpoint/gcmChannel:GcmChannel gcm application-id
   *  ```
   */
  def GcmChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.GcmChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.GcmChannelArgs.builder
    
    com.pulumi.aws.pinpoint.GcmChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS End User Messaging SMS opt-out list. */
  def Smsvoicev2OptOutList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2OptOutListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2OptOutListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.pinpoint.Smsvoicev2OptOutList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Pinpoint Event Stream resource. */
  def EventStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EventStreamArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.EventStreamArgs.builder
    
    com.pulumi.aws.pinpoint.EventStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Pinpoint ADM (Amazon Device Messaging) Channel resource.
   *  
   *  &gt; **Note:** All arguments including the Client ID and Client Secret will be stored in the raw state as plain-text.
   */
  def AdmChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.AdmChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.AdmChannelArgs.builder
    
    com.pulumi.aws.pinpoint.AdmChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.pinpoint.AppArgs.Builder)
    /**
     * @param campaignHook Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     * @return builder
     */
    def campaignHook(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.builder
      builder.campaignHook(args(argsBuilder).build)

    /**
     * @param limits The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param quietTime The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     * @return builder
     */
    def quietTime(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.Builder]):
        com.pulumi.aws.pinpoint.AppArgs.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.builder
      builder.quietTime(args(argsBuilder).build)

  /** Manages an AWS End User Messaging SMS phone number. */
  def Smsvoicev2PhoneNumber(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumberArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.pinpoint.Smsvoicev2PhoneNumber(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Use the `aws.pinpoint.SmsChannel` resource to manage Pinpoint SMS Channels. */
  def SmsChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.SmsChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.SmsChannelArgs.builder
    
    com.pulumi.aws.pinpoint.SmsChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Pinpoint App resource. */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.AppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.AppArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.pinpoint.App(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Pinpoint Email Template resource */
  def EmailTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pinpoint.EmailTemplateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.pinpoint.EmailTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Pinpoint APNs VoIP Sandbox Channel resource.
   *  
   *  &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
   */
  def ApnsVoipSandboxChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs.builder
    
    com.pulumi.aws.pinpoint.ApnsVoipSandboxChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder)
    def headers(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateHeaderArgs.Builder]*):
        com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pinpoint.inputs.EmailTemplateState.Builder)
    /**
     * @param emailTemplates Specifies the content and settings for a message template that can be used in messages that are sent through the email channel. See Email Template
     * @return builder
     */
    def emailTemplates(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder]*):
        com.pulumi.aws.pinpoint.inputs.EmailTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.builder
      builder.emailTemplates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.Smsvoicev2PhoneNumberTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pinpoint.inputs.AppState.Builder)
    /**
     * @param campaignHook Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     * @return builder
     */
    def campaignHook(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs.builder
      builder.campaignHook(args(argsBuilder).build)

    /**
     * @param limits The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param quietTime The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     * @return builder
     */
    def quietTime(args: Endofunction[com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.Builder]):
        com.pulumi.aws.pinpoint.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs.builder
      builder.quietTime(args(argsBuilder).build)

  /** Provides a Pinpoint Email Channel resource. */
  def EmailChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pinpoint.EmailChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.pinpoint.EmailChannelArgs.builder
    
    com.pulumi.aws.pinpoint.EmailChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder)
    /**
     * @param emailTemplates Specifies the content and settings for a message template that can be used in messages that are sent through the email channel. See Email Template
     * @return builder
     */
    def emailTemplates(args: Endofunction[com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.Builder]*):
        com.pulumi.aws.pinpoint.EmailTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.pinpoint.inputs.EmailTemplateEmailTemplateArgs.builder
      builder.emailTemplates(args.map(_(argsBuilder).build)*)
