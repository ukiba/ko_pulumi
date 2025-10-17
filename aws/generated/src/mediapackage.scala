package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mediapackage:
  /** Provides an AWS Elemental MediaPackage Channel. */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mediapackage.ChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mediapackage.ChannelArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.mediapackage.Channel(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.Builder)
    /**
     * @param ingestEndpoints A list of the ingest endpoints
     * @return builder
     */
    def ingestEndpoints(args: Endofunction[com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs.Builder]*):
        com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.Builder =
      def argsBuilder = com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs.builder
      builder.ingestEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mediapackage.inputs.ChannelState.Builder)
    /**
     * @param hlsIngests A single item list of HLS ingest information
     * @return builder
     */
    def hlsIngests(args: Endofunction[com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.Builder]*):
        com.pulumi.aws.mediapackage.inputs.ChannelState.Builder =
      def argsBuilder = com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.builder
      builder.hlsIngests(args.map(_(argsBuilder).build)*)
