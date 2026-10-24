package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object vpn:
  object VpnFunctions:
    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an IP security (IPsec) VPN connection between a VPC and an on-premises network. */
    @deprecated("aws.vpn/getconnection.getConnection has been deprecated in favor of aws.ec2/getvpnconnection.getVpnConnection") inline def getConnection(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.vpn.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionArgs.builder
      com.pulumi.aws.vpn.VpnFunctions.getConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an IP security (IPsec) VPN connection between a VPC and an on-premises network. */
    @deprecated("aws.vpn/getconnection.getConnection has been deprecated in favor of aws.ec2/getvpnconnection.getVpnConnection") inline def getConnectionPlain(args: Endofunction[com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpn.outputs.GetConnectionResult] =
      val argsBuilder = com.pulumi.aws.vpn.inputs.GetConnectionPlainArgs.builder
      com.pulumi.aws.vpn.VpnFunctions.getConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
