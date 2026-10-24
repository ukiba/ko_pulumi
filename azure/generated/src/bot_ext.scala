package jp.ukiba.ko_pulumi
package azure

object bot_ext:
  extension (builder: com.pulumi.azure.bot.ChannelDirectLineArgs.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    inline def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.Builder]*):
        com.pulumi.azure.bot.ChannelDirectLineArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.ChannelFacebookArgs.Builder)
    /**
     * @param pages One or more `page` blocks as defined below.
     * @return builder
     */
    inline def pages(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.Builder]*):
        com.pulumi.azure.bot.ChannelFacebookArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.builder
      builder.pages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.ChannelLineArgs.Builder)
    /**
     * @param lineChannels One or more `lineChannel` blocks as defined below.
     * @return builder
     */
    inline def lineChannels(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.Builder]*):
        com.pulumi.azure.bot.ChannelLineArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.builder
      builder.lineChannels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.ChannelWebChatArgs.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    inline def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.Builder]*):
        com.pulumi.azure.bot.ChannelWebChatArgs.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelDirectLineState.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    inline def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelDirectLineState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelDirectLineSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelFacebookState.Builder)
    /**
     * @param pages One or more `page` blocks as defined below.
     * @return builder
     */
    inline def pages(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelFacebookState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs.builder
      builder.pages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelLineState.Builder)
    /**
     * @param lineChannels One or more `lineChannel` blocks as defined below.
     * @return builder
     */
    inline def lineChannels(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelLineState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelLineLineChannelArgs.builder
      builder.lineChannels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.bot.inputs.ChannelWebChatState.Builder)
    /**
     * @param sites A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * @return builder
     */
    inline def sites(args: Endofunction[com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.Builder]*):
        com.pulumi.azure.bot.inputs.ChannelWebChatState.Builder =
      def argsBuilder = com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs.builder
      builder.sites(args.map(_(argsBuilder).build)*)
