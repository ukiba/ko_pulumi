package jp.ukiba.ko_pulumi
package azure

object privatedns_ext:
  extension (builder: com.pulumi.azure.privatedns.LinkServiceArgs.Builder)
    /**
     * @param natIpConfigurations One or more (up to 8) `natIpConfiguration` block as defined below.
     * @return builder
     */
    inline def natIpConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatedns.LinkServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.builder
      builder.natIpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.MxRecordArgs.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.MxRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.ResolverForwardingRuleArgs.Builder)
    /**
     * @param targetDnsServers Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
     * @return builder
     */
    inline def targetDnsServers(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.Builder]*):
        com.pulumi.azure.privatedns.ResolverForwardingRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.builder
      builder.targetDnsServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.Builder)
    /**
     * @param ipConfigurations One `ipConfigurations` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.Builder]):
        com.pulumi.azure.privatedns.ResolverInboundEndpointArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.builder
      builder.ipConfigurations(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.privatedns.SRVRecordArgs.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.SRVRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.TxtRecordArgs.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.TxtRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.ZoneArgs.Builder)
    /**
     * @param soaRecord An `soaRecord` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def soaRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.privatedns.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.privatedns.inputs.LinkServiceState.Builder)
    /**
     * @param natIpConfigurations One or more (up to 8) `natIpConfiguration` block as defined below.
     * @return builder
     */
    inline def natIpConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.LinkServiceState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.LinkServiceNatIpConfigurationArgs.builder
      builder.natIpConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.inputs.MxRecordState.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.MxRecordState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleState.Builder)
    /**
     * @param targetDnsServers Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
     * @return builder
     */
    inline def targetDnsServers(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverForwardingRuleTargetDnsServerArgs.builder
      builder.targetDnsServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointState.Builder)
    /**
     * @param ipConfigurations One `ipConfigurations` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ipConfigurations(args: Endofunction[com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.Builder]):
        com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointState.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ResolverInboundEndpointIpConfigurationsArgs.builder
      builder.ipConfigurations(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.privatedns.inputs.SRVRecordState.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.SRVRecordState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.SRVRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.inputs.TxtRecordState.Builder)
    /**
     * @param records One or more `record` blocks as defined below.
     * @return builder
     */
    inline def records(args: Endofunction[com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.privatedns.inputs.TxtRecordState.Builder =
      def argsBuilder = com.pulumi.azure.privatedns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.privatedns.inputs.ZoneState.Builder)
    /**
     * @param soaRecord An `soaRecord` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def soaRecord(args: Endofunction[com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.privatedns.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.azure.privatedns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)
