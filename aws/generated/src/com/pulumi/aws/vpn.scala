package jp.ukiba.ko_pulumi
package aws


object vpn:
  type VpnFunctions = com.pulumi.aws.vpn.VpnFunctions
  object VpnFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.vpn.VpnFunctions.*
  extension (self: VpnFunctions.type)
    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network. */
    @deprecated def getConnection(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpn.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionArgs.builder
      com.pulumi.aws.vpn.VpnFunctions.getConnection(args(argsBuilder).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network. */
    @deprecated def getConnectionPlain(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpn.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.vpn.VpnFunctions.getConnectionPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionFilterArgs.Builder]*):
        com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
