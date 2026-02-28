package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mediapackage:
  /** Provides an AWS Elemental MediaPackage Channel. */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mediapackage.ChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mediapackage.ChannelArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mediapackage.Channel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
