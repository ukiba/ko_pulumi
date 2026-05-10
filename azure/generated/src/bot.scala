package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object bot:
  /**
   * Manages a MS Teams integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single MS Teams Channel associated with it.
   */
  def ChannelTeams(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelTeamsArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelTeamsArgs.builder
    com.pulumi.azure.bot.ChannelTeams(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.bot.ChannelFacebookArgs.Builder)
    /**
     * @param pages One or more `page` blocks as defined below.
     * @return builder
     */
    def pages(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.Builder]*):
        com.pulumi.azure.bot.ChannelFacebookArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.builder
      builder.pages(args.map(_(argsBuilder).build)*)

  /**
   * Manages an Azure Bot Service.
   * 
   *  ## Import
   * 
   *  Azure Bot Services can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:bot/serviceAzureBot:ServiceAzureBot example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.BotService/botServices/botService1
   *  ```
   */
  def ServiceAzureBot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ServiceAzureBotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.bot.ServiceAzureBotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.bot.ServiceAzureBot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Bot Web App. */
  def WebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.WebAppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.bot.WebAppArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.bot.WebApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.bot.ChannelDirectLineArgs.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.Builder]*):
        com.pulumi.azure.bot.ChannelDirectLineArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)

  /** Manages a Web Chat integration for a Bot Channel */
  def ChannelWebChat(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelWebChatArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelWebChatArgs.builder
    com.pulumi.azure.bot.ChannelWebChat(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.bot.ChannelWebChatArgs.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.Builder]*):
        com.pulumi.azure.bot.ChannelWebChatArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Bot Channels Registration.
   * 
   *  &gt; **Note:** Bot Channels Registration has been [deprecated by Azure](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-resources-faq-azure?view=azure-bot-service-4.0#why-are-web-app-bot-and-bot-channel-registration-being-deprecated). New implementations should use the `azure.bot.ServiceAzureBot` resource.
   */
  def ChannelsRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelsRegistrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.bot.ChannelsRegistrationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.bot.ChannelsRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Directline integration for a Bot Channel */
  def ChannelDirectLine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelDirectLineArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelDirectLineArgs.builder
    com.pulumi.azure.bot.ChannelDirectLine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Healthbot Service. */
  def Healthbot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.HealthbotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.bot.HealthbotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.bot.Healthbot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Email integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single Email Channel associated with it.
   */
  def ChannelEmail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelEmailArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelEmailArgs.builder
    com.pulumi.azure.bot.ChannelEmail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Bot Connection. */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.bot.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.bot.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Line integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single Line Channel associated with it.
   */
  def ChannelLine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelLineArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelLineArgs.builder
    com.pulumi.azure.bot.ChannelLine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Slack integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single Slack Channel associated with it.
   */
  def ChannelSlack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelSlackArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelSlackArgs.builder
    com.pulumi.azure.bot.ChannelSlack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Direct Line Speech integration for a Bot Channel */
  def ChannelDirectLineSpeech(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelDirectLineSpeechArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelDirectLineSpeechArgs.builder
    com.pulumi.azure.bot.ChannelDirectLineSpeech(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.bot.ChannelLineArgs.Builder)
    /**
     * @param lineChannels One or more `lineChannel` blocks as defined below.
     * @return builder
     */
    def lineChannels(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.Builder]*):
        com.pulumi.azure.bot.ChannelLineArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.builder
      builder.lineChannels(args.map(_(argsBuilder).build)*)

  /**
   * Manages a SMS integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single SMS Channel associated with it.
   */
  def ChannelSms(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelSmsArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelSmsArgs.builder
    com.pulumi.azure.bot.ChannelSms(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Alexa integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single Alexa Channel associated with it.
   */
  def ChannelAlexa(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelAlexaArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelAlexaArgs.builder
    com.pulumi.azure.bot.ChannelAlexa(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Facebook integration for a Bot Channel
   * 
   *  &gt; **Note:** A bot can only have a single Facebook Channel associated with it.
   */
  def ChannelFacebook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.bot.ChannelFacebookArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.bot.ChannelFacebookArgs.builder
    com.pulumi.azure.bot.ChannelFacebook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelFacebookState.Builder)
    /**
     * @param pages One or more `page` blocks as defined below.
     * @return builder
     */
    def pages(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelFacebookState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.builder
      builder.pages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelLineState.Builder)
    /**
     * @param lineChannels One or more `lineChannel` blocks as defined below.
     * @return builder
     */
    def lineChannels(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelLineState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.builder
      builder.lineChannels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelDirectLineState.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelDirectLineState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelWebChatState.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelWebChatState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)
