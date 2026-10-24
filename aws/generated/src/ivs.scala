package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ivs:
  /** Resource for managing an AWS IVS (Interactive Video) Channel. */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ivs.ChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivs.ChannelArgs.builder
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
    com.pulumi.aws.ivs.Channel(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object IvsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS IVS (Interactive Video) Stream Key. */
    inline def getStreamKey(args: Endofunction[com.pulumi.aws.ivs.inputs.GetStreamKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ivs.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.aws.ivs.inputs.GetStreamKeyArgs.builder
      com.pulumi.aws.ivs.IvsFunctions.getStreamKey(args(argsBuilder).build)

    /** Data source for managing an AWS IVS (Interactive Video) Stream Key. */
    inline def getStreamKeyPlain(args: Endofunction[com.pulumi.aws.ivs.inputs.GetStreamKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ivs.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.aws.ivs.inputs.GetStreamKeyPlainArgs.builder
      com.pulumi.aws.ivs.IvsFunctions.getStreamKeyPlain(args(argsBuilder).build)

  /** Resource for managing an AWS IVS (Interactive Video) Playback Key Pair. */
  def PlaybackKeyPair(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ivs.PlaybackKeyPairArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivs.PlaybackKeyPairArgs.builder
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
    com.pulumi.aws.ivs.PlaybackKeyPair(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS IVS (Interactive Video) Recording Configuration. */
  def RecordingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ivs.RecordingConfigurationArgs.builder
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
    com.pulumi.aws.ivs.RecordingConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
