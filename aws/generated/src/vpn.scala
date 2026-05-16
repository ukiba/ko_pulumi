package jp.ukiba.ko_pulumi
package aws


object vpn:
  object VpnFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network. */
    @deprecated inline def getConnection(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.vpn.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionArgs.builder
      com.pulumi.aws.vpn.VpnFunctions.getConnection(args(argsBuilder).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network. */
    @deprecated inline def getConnectionPlain(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.Builder] = scala.Predef.identity):
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
