package jp.ukiba.ko_pulumi
package aws

object mediapackage_ext:
  extension (builder: com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.Builder)
    /**
     * @param ingestEndpoints List of the ingest endpoints
     * @return builder
     */
    inline def ingestEndpoints(args: Endofunction[com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs.Builder]*):
        com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.Builder =
      def argsBuilder = com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestIngestEndpointArgs.builder
      builder.ingestEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.mediapackage.inputs.ChannelState.Builder)
    /**
     * @param hlsIngests Single item list of HLS ingest information
     * @return builder
     */
    inline def hlsIngests(args: Endofunction[com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.Builder]*):
        com.pulumi.aws.mediapackage.inputs.ChannelState.Builder =
      def argsBuilder = com.pulumi.aws.mediapackage.inputs.ChannelHlsIngestArgs.builder
      builder.hlsIngests(args.map(_(argsBuilder).build)*)
