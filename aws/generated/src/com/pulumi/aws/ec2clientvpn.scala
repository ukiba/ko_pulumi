package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ec2clientvpn:
  /**
   * Provides network associations for AWS Client VPN endpoints. For more information on usage, please see the
   *  [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def NetworkAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs.builder
    
    com.pulumi.aws.ec2clientvpn.NetworkAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides additional routes for AWS Client VPN endpoints. For more information on usage, please see the
   *  [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.RouteArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2clientvpn.RouteArgs.builder
    
    com.pulumi.aws.ec2clientvpn.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS Client VPN endpoint for OpenVPN clients. For more information on usage, please see the
   *  [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2clientvpn.EndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2clientvpn.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides authorization rules for AWS Client VPN endpoints. For more information on usage, please see the
   *  [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def AuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.AuthorizationRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2clientvpn.AuthorizationRuleArgs.builder
    
    com.pulumi.aws.ec2clientvpn.AuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Ec2clientvpnFunctions = com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions
  object Ec2clientvpnFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions.*
  extension (self: Ec2clientvpnFunctions.type)
    /** Get information on an EC2 Client VPN endpoint. */
    def getEndpoint(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2clientvpn.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.builder
      com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions.getEndpoint(args(argsBuilder).build)

    /** Get information on an EC2 Client VPN endpoint. */
    def getEndpointPlain(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2clientvpn.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs.builder
      com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions.getEndpointPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder)
    /**
     * @param authenticationOptions Information about the authentication method to be used to authenticate clients.
     * @return builder
     */
    def authenticationOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.Builder]*):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.builder
      builder.authenticationOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client connections.
     * @return builder
     */
    def clientConnectOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.builder
      builder.clientConnectOptions(args(argsBuilder).build)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established.
     * @return builder
     */
    def clientLoginBannerOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.builder
      builder.clientLoginBannerOptions(args(argsBuilder).build)

    /**
     * @param clientRouteEnforcementOptions Options for enforce administrator defined routes on devices connected through the VPN.
     * @return builder
     */
    def clientRouteEnforcementOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.builder
      builder.clientRouteEnforcementOptions(args(argsBuilder).build)

    /**
     * @param connectionLogOptions Information about the client connection logging options.
     * @return builder
     */
    def connectionLogOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.builder
      builder.connectionLogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder)
    /**
     * @param authenticationOptions Information about the authentication method to be used to authenticate clients.
     * @return builder
     */
    def authenticationOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.Builder]*):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs.builder
      builder.authenticationOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param clientConnectOptions The options for managing connection authorization for new client connections.
     * @return builder
     */
    def clientConnectOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientConnectOptionsArgs.builder
      builder.clientConnectOptions(args(argsBuilder).build)

    /**
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established.
     * @return builder
     */
    def clientLoginBannerOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientLoginBannerOptionsArgs.builder
      builder.clientLoginBannerOptions(args(argsBuilder).build)

    /**
     * @param clientRouteEnforcementOptions Options for enforce administrator defined routes on devices connected through the VPN.
     * @return builder
     */
    def clientRouteEnforcementOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointClientRouteEnforcementOptionsArgs.builder
      builder.clientRouteEnforcementOptions(args(argsBuilder).build)

    /**
     * @param connectionLogOptions Information about the client connection logging options.
     * @return builder
     */
    def connectionLogOptions(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2clientvpn.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs.builder
      builder.connectionLogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointFilterArgs.Builder]*):
        com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
