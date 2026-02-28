package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object medialive:
  extension (builder: com.pulumi.aws.medialive.MultiplexProgramArgs.Builder)
    /**
     * @param multiplexProgramSettings MultiplexProgram settings. See Multiplex Program Settings for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def multiplexProgramSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.Builder]):
        com.pulumi.aws.medialive.MultiplexProgramArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.builder
      builder.multiplexProgramSettings(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramTimeoutsArgs.Builder]):
        com.pulumi.aws.medialive.MultiplexProgramArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS MediaLive InputSecurityGroup. */
  def InputSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.medialive.InputSecurityGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.medialive.InputSecurityGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.medialive.InputSecurityGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type MedialiveFunctions = com.pulumi.aws.medialive.MedialiveFunctions
  object MedialiveFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.medialive.MedialiveFunctions.*
  extension (self: MedialiveFunctions.type)
    /** Data source for managing an AWS Elemental MediaLive Input. */
    def getInput(args: Endofunction[com.pulumi.aws.medialive.inputs.GetInputArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.medialive.outputs.GetInputResult] =
      val argsBuilder = com.pulumi.aws.medialive.inputs.GetInputArgs.builder
      com.pulumi.aws.medialive.MedialiveFunctions.getInput(args(argsBuilder).build)

    /** Data source for managing an AWS Elemental MediaLive Input. */
    def getInputPlain(args: Endofunction[com.pulumi.aws.medialive.inputs.GetInputPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.medialive.outputs.GetInputResult] =
      val argsBuilder = com.pulumi.aws.medialive.inputs.GetInputPlainArgs.builder
      com.pulumi.aws.medialive.MedialiveFunctions.getInputPlain(args(argsBuilder).build)

  /** Resource for managing an AWS MediaLive MultiplexProgram. */
  def MultiplexProgram(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.medialive.MultiplexProgramArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.medialive.MultiplexProgramArgs.builder
    
    com.pulumi.aws.medialive.MultiplexProgram(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS MediaLive Channel. */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.medialive.ChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.medialive.ChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.medialive.Channel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS MediaLive Multiplex. */
  def Multiplex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.medialive.MultiplexArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.medialive.MultiplexArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.medialive.Multiplex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.medialive.MultiplexArgs.Builder)
    /**
     * @param multiplexSettings Multiplex settings. See Multiplex Settings for more details.
     * @return builder
     */
    def multiplexSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexMultiplexSettingsArgs.Builder]):
        com.pulumi.aws.medialive.MultiplexArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexMultiplexSettingsArgs.builder
      builder.multiplexSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.ChannelArgs.Builder)
    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     * @return builder
     */
    def cdiInputSpecification(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelCdiInputSpecificationArgs.Builder]):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelCdiInputSpecificationArgs.builder
      builder.cdiInputSpecification(args(argsBuilder).build)

    /**
     * @param destinations Destinations for channel. See Destinations for more details.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.Builder]*):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param encoderSettings Encoder settings. See Encoder Settings for more details.
     * @return builder
     */
    def encoderSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder]):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.builder
      builder.encoderSettings(args(argsBuilder).build)

    /**
     * @param inputAttachments Input attachments for the channel. See Input Attachments for more details.
     * @return builder
     */
    def inputAttachments(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.Builder]*):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.builder
      builder.inputAttachments(args.map(_(argsBuilder).build)*)

    /**
     * @param inputSpecification Specification of network and file inputs for the channel.
     * @return builder
     */
    def inputSpecification(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputSpecificationArgs.Builder]):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputSpecificationArgs.builder
      builder.inputSpecification(args(argsBuilder).build)

    /**
     * @param maintenance Maintenance settings for this channel. See Maintenance for more details.
     * @return builder
     */
    def maintenance(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelMaintenanceArgs.Builder]):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelMaintenanceArgs.builder
      builder.maintenance(args(argsBuilder).build)

    /**
     * @param vpc Settings for the VPC outputs. See VPC for more details.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelVpcArgs.Builder]):
        com.pulumi.aws.medialive.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  /** Resource for managing an AWS MediaLive Input. */
  def Input(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.medialive.InputArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.medialive.InputArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.medialive.Input(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.medialive.InputSecurityGroupArgs.Builder)
    /**
     * @param whitelistRules Whitelist rules. See Whitelist Rules for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def whitelistRules(args: Endofunction[com.pulumi.aws.medialive.inputs.InputSecurityGroupWhitelistRuleArgs.Builder]*):
        com.pulumi.aws.medialive.InputSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputSecurityGroupWhitelistRuleArgs.builder
      builder.whitelistRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.InputArgs.Builder)
    /**
     * @param destinations Destination settings for PUSH type inputs. See Destinations for more details.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.medialive.inputs.InputDestinationArgs.Builder]*):
        com.pulumi.aws.medialive.InputArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param inputDevices Settings for the devices. See Input Devices for more details.
     * @return builder
     */
    def inputDevices(args: Endofunction[com.pulumi.aws.medialive.inputs.InputInputDeviceArgs.Builder]*):
        com.pulumi.aws.medialive.InputArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputInputDeviceArgs.builder
      builder.inputDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param mediaConnectFlows A list of the MediaConnect Flows. See Media Connect Flows for more details.
     * @return builder
     */
    def mediaConnectFlows(args: Endofunction[com.pulumi.aws.medialive.inputs.InputMediaConnectFlowArgs.Builder]*):
        com.pulumi.aws.medialive.InputArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputMediaConnectFlowArgs.builder
      builder.mediaConnectFlows(args.map(_(argsBuilder).build)*)

    /**
     * @param sources The source URLs for a PULL-type input. See Sources for more details.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.medialive.inputs.InputSourceArgs.Builder]*):
        com.pulumi.aws.medialive.InputArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param vpc Settings for a private VPC Input. See VPC for more details.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.medialive.inputs.InputVpcArgs.Builder]):
        com.pulumi.aws.medialive.InputArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.InputVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionArgs.Builder)
    /**
     * @param destinationSettings Additional settings for captions destination that depend on the destination type. See Destination Settings for more details.
     * @return builder
     */
    def destinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.builder
      builder.destinationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsDvbSubDestinationSettingsArgs.Builder)
    /**
     * @param font External font file used for caption burn-in. File extension must be \u2018ttf\u2019 or \u2018tte\u2019. Although the user can select output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts. All burn-in and DVB-Sub font settings must match. See Font for more details.
     * @return builder
     */
    def font(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsDvbSubDestinationSettingsFontArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsDvbSubDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsDvbSubDestinationSettingsFontArgs.builder
      builder.font(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder)
    def hlsAkamaiSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsAkamaiSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsAkamaiSettingsArgs.builder
      builder.hlsAkamaiSettings(args(argsBuilder).build)

    def hlsBasicPutSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsBasicPutSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsBasicPutSettingsArgs.builder
      builder.hlsBasicPutSettings(args(argsBuilder).build)

    def hlsMediaStoreSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsMediaStoreSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsMediaStoreSettingsArgs.builder
      builder.hlsMediaStoreSettings(args(argsBuilder).build)

    def hlsS3Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsS3SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsS3SettingsArgs.builder
      builder.hlsS3Settings(args(argsBuilder).build)

    def hlsWebdavSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs.builder
      builder.hlsWebdavSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsBurnInDestinationSettingsArgs.Builder)
    /**
     * @param font External font file used for caption burn-in. File extension must be \u2018ttf\u2019 or \u2018tte\u2019. Although the user can select output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts. All burn-in and DVB-Sub font settings must match. See Font for more details.
     * @return builder
     */
    def font(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsBurnInDestinationSettingsFontArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsBurnInDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsBurnInDestinationSettingsFontArgs.builder
      builder.font(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsArgs.Builder)
    /**
     * @param statmuxSettings Statmux settings. See Statmux Settings for more details.
     * @return builder
     */
    def statmuxSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsStatmuxSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsStatmuxSettingsArgs.builder
      builder.statmuxSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs.Builder)
    /**
     * @param failoverConditionSettings Failover condition type-specific settings. See Failover Condition Settings for more details.
     * @return builder
     */
    def failoverConditionSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs.builder
      builder.failoverConditionSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.MultiplexState.Builder)
    /**
     * @param multiplexSettings Multiplex settings. See Multiplex Settings for more details.
     * @return builder
     */
    def multiplexSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexMultiplexSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.MultiplexState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexMultiplexSettingsArgs.builder
      builder.multiplexSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.InputSecurityGroupState.Builder)
    /**
     * @param whitelistRules Whitelist rules. See Whitelist Rules for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def whitelistRules(args: Endofunction[com.pulumi.aws.medialive.inputs.InputSecurityGroupWhitelistRuleArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.InputSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputSecurityGroupWhitelistRuleArgs.builder
      builder.whitelistRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettingsArgs.Builder)
    /**
     * @param archiveS3Settings Archive S3 Settings. See Archive S3 Settings for more details.
     * @return builder
     */
    def archiveS3Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettingsArchiveS3SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettingsArchiveS3SettingsArgs.builder
      builder.archiveS3Settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMultiplexOutputSettingsArgs.Builder)
    /**
     * @param destination Destination is a multiplex. See Destination for more details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMultiplexOutputSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMultiplexOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMultiplexOutputSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs.Builder)
    def temporalFilterSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsTemporalFilterSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsTemporalFilterSettingsArgs.builder
      builder.temporalFilterSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsArgs.Builder)
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    def frameCaptureCdnSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettingsArgs.builder
      builder.frameCaptureCdnSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.Builder)
    /**
     * @param automaticInputFailoverSettings User-specified settings for defining what the conditions are for declaring the input unhealthy and failing over to a different input. See Automatic Input Failover Settings for more details.
     * @return builder
     */
    def automaticInputFailoverSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsArgs.builder
      builder.automaticInputFailoverSettings(args(argsBuilder).build)

    /**
     * @param inputSettings Settings of an input. See Input Settings for more details.
     * @return builder
     */
    def inputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.builder
      builder.inputSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationArgs.Builder)
    /**
     * @param motionGraphicsSettings Motion Graphics Settings. See Motion Graphics Settings for more details.
     * @return builder
     */
    def motionGraphicsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs.builder
      builder.motionGraphicsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.InputState.Builder)
    /**
     * @param destinations Destination settings for PUSH type inputs. See Destinations for more details.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.medialive.inputs.InputDestinationArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.InputState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param inputDevices Settings for the devices. See Input Devices for more details.
     * @return builder
     */
    def inputDevices(args: Endofunction[com.pulumi.aws.medialive.inputs.InputInputDeviceArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.InputState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputInputDeviceArgs.builder
      builder.inputDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param mediaConnectFlows A list of the MediaConnect Flows. See Media Connect Flows for more details.
     * @return builder
     */
    def mediaConnectFlows(args: Endofunction[com.pulumi.aws.medialive.inputs.InputMediaConnectFlowArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.InputState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputMediaConnectFlowArgs.builder
      builder.mediaConnectFlows(args.map(_(argsBuilder).build)*)

    /**
     * @param sources The source URLs for a PULL-type input. See Sources for more details.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.aws.medialive.inputs.InputSourceArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.InputState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.InputSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

    /**
     * @param vpc Settings for a private VPC Input. See VPC for more details.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.medialive.inputs.InputVpcArgs.Builder]):
        com.pulumi.aws.medialive.inputs.InputState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.InputVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder)
    /**
     * @param aribDestinationSettings ARIB Destination Settings.
     * @return builder
     */
    def aribDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsAribDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsAribDestinationSettingsArgs.builder
      builder.aribDestinationSettings(args(argsBuilder).build)

    /**
     * @param burnInDestinationSettings Burn In Destination Settings. See Burn In Destination Settings for more details.
     * @return builder
     */
    def burnInDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsBurnInDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsBurnInDestinationSettingsArgs.builder
      builder.burnInDestinationSettings(args(argsBuilder).build)

    /**
     * @param dvbSubDestinationSettings DVB Sub Destination Settings. See DVB Sub Destination Settings for more details.
     * @return builder
     */
    def dvbSubDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsDvbSubDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsDvbSubDestinationSettingsArgs.builder
      builder.dvbSubDestinationSettings(args(argsBuilder).build)

    /**
     * @param ebuTtDDestinationSettings EBU TT D Destination Settings. See EBU TT D Destination Settings for more details.
     * @return builder
     */
    def ebuTtDDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEbuTtDDestinationSettingsArgs.builder
      builder.ebuTtDDestinationSettings(args(argsBuilder).build)

    /**
     * @param embeddedDestinationSettings Embedded Destination Settings.
     * @return builder
     */
    def embeddedDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEmbeddedDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEmbeddedDestinationSettingsArgs.builder
      builder.embeddedDestinationSettings(args(argsBuilder).build)

    /**
     * @param embeddedPlusScte20DestinationSettings Embedded Plus SCTE20 Destination Settings.
     * @return builder
     */
    def embeddedPlusScte20DestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEmbeddedPlusScte20DestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsEmbeddedPlusScte20DestinationSettingsArgs.builder
      builder.embeddedPlusScte20DestinationSettings(args(argsBuilder).build)

    /**
     * @param rtmpCaptionInfoDestinationSettings RTMP Caption Info Destination Settings.
     * @return builder
     */
    def rtmpCaptionInfoDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsRtmpCaptionInfoDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsRtmpCaptionInfoDestinationSettingsArgs.builder
      builder.rtmpCaptionInfoDestinationSettings(args(argsBuilder).build)

    /**
     * @param scte20PlusEmbeddedDestinationSettings SCTE20 Plus Embedded Destination Settings.
     * @return builder
     */
    def scte20PlusEmbeddedDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsScte20PlusEmbeddedDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsScte20PlusEmbeddedDestinationSettingsArgs.builder
      builder.scte20PlusEmbeddedDestinationSettings(args(argsBuilder).build)

    /**
     * @param scte27DestinationSettings SCTE27 Destination Settings.
     * @return builder
     */
    def scte27DestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsScte27DestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsScte27DestinationSettingsArgs.builder
      builder.scte27DestinationSettings(args(argsBuilder).build)

    /**
     * @param smpteTtDestinationSettings SMPTE TT Destination Settings.
     * @return builder
     */
    def smpteTtDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsSmpteTtDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsSmpteTtDestinationSettingsArgs.builder
      builder.smpteTtDestinationSettings(args(argsBuilder).build)

    /**
     * @param teletextDestinationSettings Teletext Destination Settings.
     * @return builder
     */
    def teletextDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsTeletextDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsTeletextDestinationSettingsArgs.builder
      builder.teletextDestinationSettings(args(argsBuilder).build)

    /**
     * @param ttmlDestinationSettings TTML Destination Settings. See TTML Destination Settings for more details.
     * @return builder
     */
    def ttmlDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsTtmlDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsTtmlDestinationSettingsArgs.builder
      builder.ttmlDestinationSettings(args(argsBuilder).build)

    /**
     * @param webvttDestinationSettings WebVTT Destination Settings. See WebVTT Destination Settings for more details.
     * @return builder
     */
    def webvttDestinationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsWebvttDestinationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsWebvttDestinationSettingsArgs.builder
      builder.webvttDestinationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder)
    /**
     * @param archiveOutputSettings Archive output settings. See Archive Output Settings for more details.
     * @return builder
     */
    def archiveOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsArgs.builder
      builder.archiveOutputSettings(args(argsBuilder).build)

    def frameCaptureOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsFrameCaptureOutputSettingsArgs.builder
      builder.frameCaptureOutputSettings(args(argsBuilder).build)

    def hlsOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsArgs.builder
      builder.hlsOutputSettings(args(argsBuilder).build)

    /**
     * @param mediaPackageOutputSettings Media package output settings. This can be set as an empty block.
     * @return builder
     */
    def mediaPackageOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMediaPackageOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMediaPackageOutputSettingsArgs.builder
      builder.mediaPackageOutputSettings(args(argsBuilder).build)

    def msSmoothOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMsSmoothOutputSettingsArgs.builder
      builder.msSmoothOutputSettings(args(argsBuilder).build)

    /**
     * @param multiplexOutputSettings Multiplex output settings. See Multiplex Output Settings for more details.
     * @return builder
     */
    def multiplexOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMultiplexOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsMultiplexOutputSettingsArgs.builder
      builder.multiplexOutputSettings(args(argsBuilder).build)

    /**
     * @param rtmpOutputSettings RTMP output settings. See RTMP Output Settings for more details.
     * @return builder
     */
    def rtmpOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsArgs.builder
      builder.rtmpOutputSettings(args(argsBuilder).build)

    /**
     * @param udpOutputSettings UDP output settings. See UDP Output Settings for more details.
     * @return builder
     */
    def udpOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsArgs.builder
      builder.udpOutputSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs.Builder)
    /**
     * @param m2tsSettings M2TS Settings. See [M2TS Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * @return builder
     */
    def m2tsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.builder
      builder.m2tsSettings(args(argsBuilder).build)

    /**
     * @param rawSettings Raw Settings. This can be set as an empty block.
     * @return builder
     */
    def rawSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs.builder
      builder.rawSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationInputLossBehaviorArgs.Builder)
    def inputLossImageSlate(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationInputLossBehaviorInputLossImageSlateArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationInputLossBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationInputLossBehaviorInputLossImageSlateArgs.builder
      builder.inputLossImageSlate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettingsArgs.Builder)
    def m3u8Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettingsM3u8SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettingsM3u8SettingsArgs.builder
      builder.m3u8Settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettingsArgs.Builder)
    def frameCaptureS3Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettingsFrameCaptureS3SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsFrameCaptureCdnSettingsFrameCaptureS3SettingsArgs.builder
      builder.frameCaptureS3Settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsArgs.Builder)
    /**
     * @param destination The RTMP endpoint excluding the stream name. See Destination for more details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder)
    /**
     * @param colorSpacePassthroughSettings Sets the colorspace metadata to be passed through.
     * @return builder
     */
    def colorSpacePassthroughSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsColorSpacePassthroughSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsColorSpacePassthroughSettingsArgs.builder
      builder.colorSpacePassthroughSettings(args(argsBuilder).build)

    /**
     * @param dolbyVision81Settings Set the colorspace to Dolby Vision81.
     * @return builder
     */
    def dolbyVision81Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsDolbyVision81SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsDolbyVision81SettingsArgs.builder
      builder.dolbyVision81Settings(args(argsBuilder).build)

    /**
     * @param hdr10Settings Set the colorspace to be HDR10. See H265 HDR10 Settings for more details.
     * @return builder
     */
    def hdr10Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsHdr10SettingsArgs.builder
      builder.hdr10Settings(args(argsBuilder).build)

    /**
     * @param rec601Settings Set the colorspace to Rec. 601.
     * @return builder
     */
    def rec601Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsRec601SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsRec601SettingsArgs.builder
      builder.rec601Settings(args(argsBuilder).build)

    /**
     * @param rec709Settings Set the colorspace to Rec. 709.
     * @return builder
     */
    def rec709Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsRec709SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsRec709SettingsArgs.builder
      builder.rec709Settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsArgs.Builder)
    /**
     * @param outputRectangle Optionally defines a region where TTML style captions will be displayed. See Caption Rectangle for more details.
     * @return builder
     */
    def outputRectangle(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsOutputRectangleArgs.builder
      builder.outputRectangle(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsArgs.Builder)
    def hlsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.builder
      builder.hlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelState.Builder)
    /**
     * @param cdiInputSpecification Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     * @return builder
     */
    def cdiInputSpecification(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelCdiInputSpecificationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelCdiInputSpecificationArgs.builder
      builder.cdiInputSpecification(args(argsBuilder).build)

    /**
     * @param destinations Destinations for channel. See Destinations for more details.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param encoderSettings Encoder settings. See Encoder Settings for more details.
     * @return builder
     */
    def encoderSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.builder
      builder.encoderSettings(args(argsBuilder).build)

    /**
     * @param inputAttachments Input attachments for the channel. See Input Attachments for more details.
     * @return builder
     */
    def inputAttachments(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs.builder
      builder.inputAttachments(args.map(_(argsBuilder).build)*)

    /**
     * @param inputSpecification Specification of network and file inputs for the channel.
     * @return builder
     */
    def inputSpecification(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputSpecificationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputSpecificationArgs.builder
      builder.inputSpecification(args(argsBuilder).build)

    /**
     * @param maintenance Maintenance settings for this channel. See Maintenance for more details.
     * @return builder
     */
    def maintenance(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelMaintenanceArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelMaintenanceArgs.builder
      builder.maintenance(args(argsBuilder).build)

    /**
     * @param vpc Settings for the VPC outputs. See VPC for more details.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelVpcArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputArgs.Builder)
    /**
     * @param outputSettings Settings for output. See Output Settings for more details.
     * @return builder
     */
    def outputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.builder
      builder.outputSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.Builder)
    def audioOnlyHlsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs.builder
      builder.audioOnlyHlsSettings(args(argsBuilder).build)

    def fmp4HlsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettingsArgs.builder
      builder.fmp4HlsSettings(args(argsBuilder).build)

    def frameCaptureHlsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettingsArgs.builder
      builder.frameCaptureHlsSettings(args(argsBuilder).build)

    def standardHlsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettingsArgs.builder
      builder.standardHlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsArgs.Builder)
    def temporalFilterSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettingsArgs.builder
      builder.temporalFilterSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs.Builder)
    def selectorSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.builder
      builder.selectorSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsArgs.Builder)
    /**
     * @param m2tsSettings M2TS Settings. See [M2TS Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * @return builder
     */
    def m2tsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsArgs.builder
      builder.m2tsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionArgs.Builder)
    /**
     * @param codecSettings The video codec settings. See Video Codec Settings for more details.
     * @return builder
     */
    def codecSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsArgs.builder
      builder.codecSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMappingArgs.Builder)
    def inputChannelLevels(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMappingInputChannelLevelArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMappingArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMappingInputChannelLevelArgs.builder
      builder.inputChannelLevels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsStaticKeySettingArgs.Builder)
    def keyProviderServer(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsStaticKeySettingKeyProviderServerArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsStaticKeySettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsStaticKeySettingKeyProviderServerArgs.builder
      builder.keyProviderServer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs.Builder)
    def nielsenWatermarksSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs.builder
      builder.nielsenWatermarksSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder)
    /**
     * @param audioDescriptions Audio descriptions for the channel. See Audio Descriptions for more details.
     * @return builder
     */
    def audioDescriptions(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.builder
      builder.audioDescriptions(args.map(_(argsBuilder).build)*)

    /**
     * @param availBlanking Settings for ad avail blanking. See Avail Blanking for more details.
     * @return builder
     */
    def availBlanking(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingArgs.builder
      builder.availBlanking(args(argsBuilder).build)

    /**
     * @param captionDescriptions Caption Descriptions. See Caption Descriptions for more details.
     * @return builder
     */
    def captionDescriptions(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionArgs.builder
      builder.captionDescriptions(args.map(_(argsBuilder).build)*)

    /**
     * @param globalConfiguration Configuration settings that apply to the event as a whole. See Global Configuration for more details.
     * @return builder
     */
    def globalConfiguration(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationArgs.builder
      builder.globalConfiguration(args(argsBuilder).build)

    /**
     * @param motionGraphicsConfiguration Settings for motion graphics. See Motion Graphics Configuration for more details.
     * @return builder
     */
    def motionGraphicsConfiguration(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationArgs.builder
      builder.motionGraphicsConfiguration(args(argsBuilder).build)

    /**
     * @param nielsenConfiguration Nielsen configuration settings. See Nielsen Configuration for more details.
     * @return builder
     */
    def nielsenConfiguration(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsNielsenConfigurationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsNielsenConfigurationArgs.builder
      builder.nielsenConfiguration(args(argsBuilder).build)

    /**
     * @param outputGroups Output groups for the channel. See Output Groups for more details.
     * @return builder
     */
    def outputGroups(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupArgs.builder
      builder.outputGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param timecodeConfig Contains settings used to acquire and adjust timecode information from inputs. See Timecode Config for more details.
     * @return builder
     */
    def timecodeConfig(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsTimecodeConfigArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsTimecodeConfigArgs.builder
      builder.timecodeConfig(args(argsBuilder).build)

    /**
     * @param videoDescriptions Video Descriptions. See Video Descriptions for more details.
     * @return builder
     */
    def videoDescriptions(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionArgs.builder
      builder.videoDescriptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs.Builder)
    def staticKeySettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsStaticKeySettingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsStaticKeySettingArgs.builder
      builder.staticKeySettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder)
    /**
     * @param ancillarySourceSettings Ancillary Source Settings. See Ancillary Source Settings for more details.
     * @return builder
     */
    def ancillarySourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettingsArgs.builder
      builder.ancillarySourceSettings(args(argsBuilder).build)

    /**
     * @param aribSourceSettings ARIB Source Settings.
     * @return builder
     */
    def aribSourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAribSourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAribSourceSettingsArgs.builder
      builder.aribSourceSettings(args(argsBuilder).build)

    /**
     * @param dvbSubSourceSettings DVB Sub Source Settings. See DVB Sub Source Settings for more details.
     * @return builder
     */
    def dvbSubSourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbSubSourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbSubSourceSettingsArgs.builder
      builder.dvbSubSourceSettings(args(argsBuilder).build)

    /**
     * @param embeddedSourceSettings Embedded Source Settings. See Embedded Source Settings for more details.
     * @return builder
     */
    def embeddedSourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettingsArgs.builder
      builder.embeddedSourceSettings(args(argsBuilder).build)

    /**
     * @param scte20SourceSettings SCTE20 Source Settings. See SCTE 20 Source Settings for more details.
     * @return builder
     */
    def scte20SourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs.builder
      builder.scte20SourceSettings(args(argsBuilder).build)

    /**
     * @param scte27SourceSettings SCTE27 Source Settings. See SCTE 27 Source Settings for more details.
     * @return builder
     */
    def scte27SourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettingsArgs.builder
      builder.scte27SourceSettings(args(argsBuilder).build)

    /**
     * @param teletextSourceSettings Teletext Source Settings. See Teletext Source Settings for more details.
     * @return builder
     */
    def teletextSourceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettingsArgs.builder
      builder.teletextSourceSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder)
    /**
     * @param aacSettings Aac Settings. See AAC Settings for more details.
     * @return builder
     */
    def aacSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAacSettingsArgs.builder
      builder.aacSettings(args(argsBuilder).build)

    /**
     * @param ac3Settings Ac3 Settings. See AC3 Settings for more details.
     * @return builder
     */
    def ac3Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsAc3SettingsArgs.builder
      builder.ac3Settings(args(argsBuilder).build)

    /**
     * @param eac3AtmosSettings Eac3 Atmos Settings. See EAC3 Atmos Settings
     * @return builder
     */
    def eac3AtmosSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3AtmosSettingsArgs.builder
      builder.eac3AtmosSettings(args(argsBuilder).build)

    /**
     * @param eac3Settings Eac3 Settings. See EAC3 Settings
     * @return builder
     */
    def eac3Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsEac3SettingsArgs.builder
      builder.eac3Settings(args(argsBuilder).build)

    def mp2Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsArgs.builder
      builder.mp2Settings(args(argsBuilder).build)

    def passThroughSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettingsArgs.builder
      builder.passThroughSettings(args(argsBuilder).build)

    def wavSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsWavSettingsArgs.builder
      builder.wavSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs.Builder)
    def channelMappings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMappingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsChannelMappingArgs.builder
      builder.channelMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsArgs.Builder)
    /**
     * @param containerSettings UDP container settings. See Container Settings for more details.
     * @return builder
     */
    def containerSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsArgs.builder
      builder.containerSettings(args(argsBuilder).build)

    /**
     * @param destination Destination address and port number for RTP or UDP packets. See Destination for more details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    def fecOutputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsFecOutputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsFecOutputSettingsArgs.builder
      builder.fecOutputSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs.Builder)
    def selectorSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.builder
      builder.selectorSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs.Builder)
    /**
     * @param htmlMotionGraphicsSettings Html Motion Graphics Settings.
     * @return builder
     */
    def htmlMotionGraphicsSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsHtmlMotionGraphicsSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsMotionGraphicsConfigurationMotionGraphicsSettingsHtmlMotionGraphicsSettingsArgs.builder
      builder.htmlMotionGraphicsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.MultiplexProgramState.Builder)
    /**
     * @param multiplexProgramSettings MultiplexProgram settings. See Multiplex Program Settings for more details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def multiplexProgramSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.MultiplexProgramState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.builder
      builder.multiplexProgramSettings(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramTimeoutsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.MultiplexProgramState.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.Builder)
    /**
     * @param serviceDescriptor Service Descriptor. See Service Descriptor for more details.
     * @return builder
     */
    def serviceDescriptor(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsServiceDescriptorArgs.Builder]):
        com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsServiceDescriptorArgs.builder
      builder.serviceDescriptor(args(argsBuilder).build)

    /**
     * @param videoSettings Video settings. See Video Settings for more details.
     * @return builder
     */
    def videoSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.MultiplexProgramMultiplexProgramSettingsVideoSettingsArgs.builder
      builder.videoSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.Builder)
    /**
     * @param audioNormalizationSettings Advanced audio normalization settings. See Audio Normalization Settings for more details.
     * @return builder
     */
    def audioNormalizationSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioNormalizationSettingsArgs.builder
      builder.audioNormalizationSettings(args(argsBuilder).build)

    /**
     * @param audioWatermarkSettings Settings to configure one or more solutions that insert audio watermarks in the audio encode. See Audio Watermark Settings for more details.
     * @return builder
     */
    def audioWatermarkSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsArgs.builder
      builder.audioWatermarkSettings(args(argsBuilder).build)

    /**
     * @param codecSettings Audio codec settings. See Audio Codec Settings for more details.
     * @return builder
     */
    def codecSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionCodecSettingsArgs.builder
      builder.codecSettings(args(argsBuilder).build)

    def remixSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionRemixSettingsArgs.builder
      builder.remixSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsArgs.Builder)
    /**
     * @param failoverConditions A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other input. See Failover Condition Block for more details.
     * @return builder
     */
    def failoverConditions(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs.builder
      builder.failoverConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMediaPackageGroupSettingsArgs.Builder)
    /**
     * @param destination A director and base filename where archive files should be written. See Destination for more details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMediaPackageGroupSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMediaPackageGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMediaPackageGroupSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs.Builder)
    /**
     * @param audioSilenceSettings MediaLive will perform a failover if the specified audio selector is silent for the specified period. See Audio Silence Failover Settings for more details.
     * @return builder
     */
    def audioSilenceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsAudioSilenceSettingsArgs.builder
      builder.audioSilenceSettings(args(argsBuilder).build)

    /**
     * @param inputLossSettings MediaLive will perform a failover if content is not detected in this input for the specified period. See Input Loss Failover Settings for more details.
     * @return builder
     */
    def inputLossSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsInputLossSettingsArgs.builder
      builder.inputLossSettings(args(argsBuilder).build)

    /**
     * @param videoBlackSettings MediaLive will perform a failover if content is considered black for the specified period. See Video Black Failover Settings for more details.
     * @return builder
     */
    def videoBlackSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettingsVideoBlackSettingsArgs.builder
      builder.videoBlackSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsArgs.Builder)
    /**
     * @param colorSpaceSettings Define the color metadata for the output. H265 Color Space Settings for more details.
     * @return builder
     */
    def colorSpaceSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsColorSpaceSettingsArgs.builder
      builder.colorSpaceSettings(args(argsBuilder).build)

    /**
     * @param filterSettings Filters to apply to an encode. See H265 Filter Settings for more details.
     * @return builder
     */
    def filterSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs.builder
      builder.filterSettings(args(argsBuilder).build)

    /**
     * @param timecodeBurninSettings Apply a burned in timecode. See H265 Timecode Burnin Settings for more details.
     * @return builder
     */
    def timecodeBurninSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsTimecodeBurninSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsTimecodeBurninSettingsArgs.builder
      builder.timecodeBurninSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsArgs.Builder)
    /**
     * @param frameCaptureSettings Frame capture settings. See Frame Capture Settings for more details.
     * @return builder
     */
    def frameCaptureSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettingsArgs.builder
      builder.frameCaptureSettings(args(argsBuilder).build)

    /**
     * @param h264Settings H264 settings. See H264 Settings for more details.
     * @return builder
     */
    def h264Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsArgs.builder
      builder.h264Settings(args(argsBuilder).build)

    def h265Settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsArgs.builder
      builder.h265Settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs.Builder)
    def audioOnlyImage(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsAudioOnlyImageArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsAudioOnlyImageArgs.builder
      builder.audioOnlyImage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArgs.Builder)
    /**
     * @param archiveCdnSettings Parameters that control the interactions with the CDN. See Archive CDN Settings for more details.
     * @return builder
     */
    def archiveCdnSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettingsArgs.builder
      builder.archiveCdnSettings(args(argsBuilder).build)

    /**
     * @param destination A director and base filename where archive files should be written. See Destination for more details.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsArgs.Builder)
    /**
     * @param containerSettings Settings specific to the container type of the file. See Container Settings for more details.
     * @return builder
     */
    def containerSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs.builder
      builder.containerSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.Builder)
    def dvbNitSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbNitSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbNitSettingsArgs.builder
      builder.dvbNitSettings(args(argsBuilder).build)

    def dvbSdtSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettingsArgs.builder
      builder.dvbSdtSettings(args(argsBuilder).build)

    def dvbTdtSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs.builder
      builder.dvbTdtSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsArgs.Builder)
    def dvbNitSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsDvbNitSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsDvbNitSettingsArgs.builder
      builder.dvbNitSettings(args(argsBuilder).build)

    def dvbSdtSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsDvbSdtSettingsArgs.builder
      builder.dvbSdtSettings(args(argsBuilder).build)

    def dvbTdtSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsUdpOutputSettingsContainerSettingsM2tsSettingsDvbTdtSettingsArgs.builder
      builder.dvbTdtSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.Builder)
    /**
     * @param audioHlsRenditionSelection Audio HLS Rendition Selection. See Audio HLS Rendition Selection for more details.
     * @return builder
     */
    def audioHlsRenditionSelection(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelectionArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelectionArgs.builder
      builder.audioHlsRenditionSelection(args(argsBuilder).build)

    /**
     * @param audioLanguageSelection Audio Language Selection. See Audio Language Selection for more details.
     * @return builder
     */
    def audioLanguageSelection(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelectionArgs.builder
      builder.audioLanguageSelection(args(argsBuilder).build)

    /**
     * @param audioPidSelection Audio Pid Selection. See Audio PID Selection for more details.
     * @return builder
     */
    def audioPidSelection(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelectionArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelectionArgs.builder
      builder.audioPidSelection(args(argsBuilder).build)

    /**
     * @param audioTrackSelection Audio Track Selection. See Audio Track Selection for more details.
     * @return builder
     */
    def audioTrackSelection(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs.builder
      builder.audioTrackSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsNetworkInputSettingsArgs.Builder)
    /**
     * @param hlsInputSettings Specifies HLS input settings when the uri is for a HLS manifest. See HLS Input Settings for more details.
     * @return builder
     */
    def hlsInputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsNetworkInputSettingsHlsInputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsNetworkInputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsNetworkInputSettingsHlsInputSettingsArgs.builder
      builder.hlsInputSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsArgs.Builder)
    /**
     * @param filterSettings Filters to apply to an encode. See H264 Filter Settings for more details.
     * @return builder
     */
    def filterSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsArgs.builder
      builder.filterSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupArgs.Builder)
    /**
     * @param outputGroupSettings Settings associated with the output group. See Output Group Settings for more details.
     * @return builder
     */
    def outputGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.builder
      builder.outputGroupSettings(args(argsBuilder).build)

    /**
     * @param outputs List of outputs. See Outputs for more details.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs.Builder)
    /**
     * @param nielsenCbetSettings Used to insert watermarks of type Nielsen CBET. See Nielsen CBET Settings for more details.
     * @return builder
     */
    def nielsenCbetSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenCbetSettingsArgs.builder
      builder.nielsenCbetSettings(args(argsBuilder).build)

    /**
     * @param nielsenNaesIiNwSettings Used to insert watermarks of type Nielsen NAES, II (N2) and Nielsen NAES VI (NW). See Nielsen NAES II NW Settings for more details.
     * @return builder
     */
    def nielsenNaesIiNwSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs.builder
      builder.nielsenNaesIiNwSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder)
    /**
     * @param archiveGroupSettings Archive group settings. See Archive Group Settings for more details.
     * @return builder
     */
    def archiveGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArgs.builder
      builder.archiveGroupSettings(args.map(_(argsBuilder).build)*)

    def frameCaptureGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsFrameCaptureGroupSettingsArgs.builder
      builder.frameCaptureGroupSettings(args(argsBuilder).build)

    def hlsGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.builder
      builder.hlsGroupSettings(args(argsBuilder).build)

    /**
     * @param mediaPackageGroupSettings Media package group settings. See Media Package Group Settings for more details.
     * @return builder
     */
    def mediaPackageGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMediaPackageGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMediaPackageGroupSettingsArgs.builder
      builder.mediaPackageGroupSettings(args(argsBuilder).build)

    def msSmoothGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs.builder
      builder.msSmoothGroupSettings(args(argsBuilder).build)

    def multiplexGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMultiplexGroupSettingsArgs.builder
      builder.multiplexGroupSettings(args(argsBuilder).build)

    /**
     * @param rtmpGroupSettings RTMP group settings. See RTMP Group Settings for more details.
     * @return builder
     */
    def rtmpGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsRtmpGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsRtmpGroupSettingsArgs.builder
      builder.rtmpGroupSettings(args(argsBuilder).build)

    def udpGroupSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsUdpGroupSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsUdpGroupSettingsArgs.builder
      builder.udpGroupSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs.Builder)
    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.Builder)
    /**
     * @param mediaPackageSettings Destination settings for a MediaPackage output; one destination for both encoders. See Media Package Settings for more details.
     * @return builder
     */
    def mediaPackageSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelDestinationMediaPackageSettingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelDestinationMediaPackageSettingArgs.builder
      builder.mediaPackageSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param multiplexSettings Destination settings for a Multiplex output; one destination for both encoders. See Multiplex Settings for more details.
     * @return builder
     */
    def multiplexSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelDestinationMultiplexSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelDestinationMultiplexSettingsArgs.builder
      builder.multiplexSettings(args(argsBuilder).build)

    /**
     * @param settings Destination settings for a standard output; one destination for each redundant encoder. See Settings for more details.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelDestinationSettingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelDestinationSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingArgs.Builder)
    /**
     * @param availBlankingImage Blanking image to be used. See Avail Blanking Image for more details.
     * @return builder
     */
    def availBlankingImage(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingAvailBlankingImageArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingAvailBlankingImageArgs.builder
      builder.availBlankingImage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationArgs.Builder)
    /**
     * @param inputLossBehavior Settings for system actions when input is lost. See Input Loss Behavior for more details.
     * @return builder
     */
    def inputLossBehavior(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationInputLossBehaviorArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsGlobalConfigurationInputLossBehaviorArgs.builder
      builder.inputLossBehavior(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs.Builder)
    /**
     * @param dolbyEDecode Configure decoding options for Dolby E streams - these should be Dolby E frames carried in PCM streams tagged with SMPTE-337. See Dolby E Decode for more details.
     * @return builder
     */
    def dolbyEDecode(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionDolbyEDecodeArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionDolbyEDecodeArgs.builder
      builder.dolbyEDecode(args(argsBuilder).build)

    /**
     * @param tracks Selects one or more unique audio tracks from within a source. See Audio Tracks for more details.
     * @return builder
     */
    def tracks(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs.builder
      builder.tracks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.Builder)
    /**
     * @param audioSelectors Used to select the audio stream to decode for inputs that have multiple. See Audio Selectors for more details.
     * @return builder
     */
    def audioSelectors(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorArgs.builder
      builder.audioSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param captionSelectors Used to select the caption input to use for inputs that have multiple available. See Caption Selectors for more details.
     * @return builder
     */
    def captionSelectors(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsCaptionSelectorArgs.builder
      builder.captionSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInputSettings Input settings. See Network Input Settings for more details.
     * @return builder
     */
    def networkInputSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsNetworkInputSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsNetworkInputSettingsArgs.builder
      builder.networkInputSettings(args(argsBuilder).build)

    def videoSelector(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsVideoSelectorArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsVideoSelectorArgs.builder
      builder.videoSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.Builder)
    def captionLanguageMappings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs.builder
      builder.captionLanguageMappings(args.map(_(argsBuilder).build)*)

    def destination(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    def hlsCdnSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.Builder]*):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs.builder
      builder.hlsCdnSettings(args.map(_(argsBuilder).build)*)

    def keyProviderSettings(args: Endofunction[com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs.Builder]):
        com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs.builder
      builder.keyProviderSettings(args(argsBuilder).build)
