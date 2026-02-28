package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ivs:
  extension (builder: com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder)
    /**
     * @param destinationConfiguration Object containing destination configuration for where recorded video will be stored.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param thumbnailConfiguration Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
     * @return builder
     */
    def thumbnailConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.builder
      builder.thumbnailConfiguration(args(argsBuilder).build)

  /** Resource for managing an AWS IVS (Interactive Video) Channel. */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ivs.ChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivs.ChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ivs.Channel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS IVS (Interactive Video) Playback Key Pair. */
  def PlaybackKeyPair(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ivs.PlaybackKeyPairArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivs.PlaybackKeyPairArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ivs.PlaybackKeyPair(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type IvsFunctions = com.pulumi.aws.ivs.IvsFunctions
  object IvsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ivs.IvsFunctions.*
  extension (self: IvsFunctions.type)
    /** Data source for managing an AWS IVS (Interactive Video) Stream Key. */
    def getStreamKey(args: Endofunction[com.pulumi.aws.ivs.inputs.GetStreamKeyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ivs.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.aws.ivs.inputs.GetStreamKeyArgs.builder
      com.pulumi.aws.ivs.IvsFunctions.getStreamKey(args(argsBuilder).build)

    /** Data source for managing an AWS IVS (Interactive Video) Stream Key. */
    def getStreamKeyPlain(args: Endofunction[com.pulumi.aws.ivs.inputs.GetStreamKeyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ivs.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.aws.ivs.inputs.GetStreamKeyPlainArgs.builder
      com.pulumi.aws.ivs.IvsFunctions.getStreamKeyPlain(args(argsBuilder).build)

  /** Resource for managing an AWS IVS (Interactive Video) Recording Configuration. */
  def RecordingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivs.RecordingConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ivs.RecordingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder)
    /**
     * @param s3 S3 destination configuration where recorded videos will be stored.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationS3Args.Builder]):
        com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ivs.inputs.RecordingConfigurationState.Builder)
    /**
     * @param destinationConfiguration Object containing destination configuration for where recorded video will be stored.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.inputs.RecordingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param thumbnailConfiguration Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
     * @return builder
     */
    def thumbnailConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.inputs.RecordingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.builder
      builder.thumbnailConfiguration(args(argsBuilder).build)
