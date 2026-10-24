package jp.ukiba.ko_pulumi
package aws

object ec2clientvpn_ext:
  extension (builder: com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder)
    /**
     * @param authenticationOptions Information about the authentication method to be used to authenticate clients. See `authenticationOptions` Block Reference below for details.
     * @return builder
     */
    inline def authenticationOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.Builder]*):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.builder
      builder.authenticationOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client connections. See `clientConnectOptions` Block Reference below for details.
     * @return builder
     */
    inline def clientConnectOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.builder
      builder.clientConnectOptions(args(argsBuilder).build)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established. See `clientLoginBannerOptions` Block Reference below for details.
     * @return builder
     */
    inline def clientLoginBannerOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.builder
      builder.clientLoginBannerOptions(args(argsBuilder).build)

    /**
     * @param clientRouteEnforcementOptions Options for enforce administrator defined routes on devices connected through the VPN. See `clientRouteEnforcementOptions` Block Reference below for details.
     * @return builder
     */
    inline def clientRouteEnforcementOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.builder
      builder.clientRouteEnforcementOptions(args(argsBuilder).build)

    /**
     * @param connectionLogOptions Information about the client connection logging options. See `connectionLogOptions` Block Reference below for details.
     * @return builder
     */
    inline def connectionLogOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.builder
      builder.connectionLogOptions(args(argsBuilder).build)

    /**
     * @param transitGatewayConfiguration Configuration block for associating the Client VPN endpoint with a Transit Gateway. Conflicts with `vpcId` and `securityGroupIds`. See `transitGatewayConfiguration` Block Reference below for details.
     * @return builder
     */
    inline def transitGatewayConfiguration(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointTransitGatewayConfigurationArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointTransitGatewayConfigurationArgs.builder
      builder.transitGatewayConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder)
    /**
     * @param authenticationOptions Information about the authentication method to be used to authenticate clients. See `authenticationOptions` Block Reference below for details.
     * @return builder
     */
    inline def authenticationOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.Builder]*):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.builder
      builder.authenticationOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client connections. See `clientConnectOptions` Block Reference below for details.
     * @return builder
     */
    inline def clientConnectOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.builder
      builder.clientConnectOptions(args(argsBuilder).build)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established. See `clientLoginBannerOptions` Block Reference below for details.
     * @return builder
     */
    inline def clientLoginBannerOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.builder
      builder.clientLoginBannerOptions(args(argsBuilder).build)

    /**
     * @param clientRouteEnforcementOptions Options for enforce administrator defined routes on devices connected through the VPN. See `clientRouteEnforcementOptions` Block Reference below for details.
     * @return builder
     */
    inline def clientRouteEnforcementOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.builder
      builder.clientRouteEnforcementOptions(args(argsBuilder).build)

    /**
     * @param connectionLogOptions Information about the client connection logging options. See `connectionLogOptions` Block Reference below for details.
     * @return builder
     */
    inline def connectionLogOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.builder
      builder.connectionLogOptions(args(argsBuilder).build)

    /**
     * @param transitGatewayConfiguration Configuration block for associating the Client VPN endpoint with a Transit Gateway. Conflicts with `vpcId` and `securityGroupIds`. See `transitGatewayConfiguration` Block Reference below for details.
     * @return builder
     */
    inline def transitGatewayConfiguration(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointTransitGatewayConfigurationArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointTransitGatewayConfigurationArgs.builder
      builder.transitGatewayConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointFilterArgs.Builder]*):
        com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointFilter.Builder]*):
        com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)
