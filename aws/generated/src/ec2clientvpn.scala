package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ec2clientvpn:
  /**
   * Provides authorization rules for AWS Client VPN endpoints. For more information on usage, please see the
   * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def AuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.AuthorizationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2clientvpn.AuthorizationRuleArgs.builder
    com.pulumi.aws.ec2clientvpn.AuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object Ec2clientvpnFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information on an EC2 Client VPN endpoint. */
    inline def getEndpoint(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2clientvpn.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointArgs.builder
      com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions.getEndpoint(args(argsBuilder).build)

    /** Get information on an EC2 Client VPN endpoint. */
    inline def getEndpointPlain(args: Endofunction[com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2clientvpn.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2clientvpn.inputs.GetEndpointPlainArgs.builder
      com.pulumi.aws.ec2clientvpn.Ec2clientvpnFunctions.getEndpointPlain(args(argsBuilder).build)

  /**
   * Provides an AWS Client VPN endpoint for OpenVPN clients. For more information on usage, please see the
   * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.EndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2clientvpn.EndpointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2clientvpn.Endpoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides network associations for AWS Client VPN endpoints. For more information on usage, please see the
   * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def NetworkAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs.builder
    com.pulumi.aws.ec2clientvpn.NetworkAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides additional routes for AWS Client VPN endpoints. For more information on usage, please see the
   * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2clientvpn.RouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2clientvpn.RouteArgs.builder
    com.pulumi.aws.ec2clientvpn.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
