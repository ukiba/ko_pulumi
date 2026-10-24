package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object directoryservice:
  /** Provides a conditional forwarder for managed Microsoft AD in AWS Directory Service. */
  def ConditionalForwarder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.ConditionalForwarderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.ConditionalForwarderArgs.builder
    com.pulumi.aws.directoryservice.ConditionalForwarder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Simple or Managed Microsoft directory in AWS Directory Service. */
  def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.DirectoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directoryservice.DirectoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.directoryservice.Directory(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DirectoryserviceFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get attributes of AWS Directory Service directory (SimpleAD, Managed AD, AD Connector). It&#39;s especially useful to refer AWS Managed AD or on-premise AD in AD Connector configuration. */
    inline def getDirectory(args: Endofunction[com.pulumi.aws.directoryservice.inputs.GetDirectoryArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.directoryservice.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.GetDirectoryArgs.builder
      com.pulumi.aws.directoryservice.DirectoryserviceFunctions.getDirectory(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get attributes of AWS Directory Service directory (SimpleAD, Managed AD, AD Connector). It&#39;s especially useful to refer AWS Managed AD or on-premise AD in AD Connector configuration. */
    inline def getDirectoryPlain(args: Endofunction[com.pulumi.aws.directoryservice.inputs.GetDirectoryPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directoryservice.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.aws.directoryservice.DirectoryserviceFunctions.getDirectoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an IP route for an AWS Directory Service directory. IP routes are used to route traffic from an AWS Managed Microsoft AD or AD Connector directory to an IPv4 or IPv6 CIDR block, such as an on-premises network reachable over a VPN or AWS Direct Connect connection, or a peered VPC.
   * 
   * &gt; To manage the complete set of IP routes for a directory, and remove any not configured in Terraform, use `aws.directoryservice.IpRoutesExclusive` instead. Using both resources for the same directory causes persistent drift unless every `aws.directoryservice.IpRoute` has an equivalent `ipRoute` block.
   * 
   * &gt; Adding an IPv6 route (`cidrIpv6`) requires the directory&#39;s network type to be dual-stack (IPv4 and IPv6). Enabling IPv6 support on a directory is a one-way operation performed outside of Terraform; see [Updating directory network type](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/ms_ad_update-directory-type.html).
   */
  def IpRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.IpRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.IpRouteArgs.builder
    com.pulumi.aws.directoryservice.IpRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an exclusive set of IP routes for an AWS Directory Service directory. IP routes are used to route traffic from an AWS Managed Microsoft AD or AD Connector directory to an IPv4 or IPv6 CIDR block, such as an on-premises network reachable over a VPN or AWS Direct Connect connection, or a peered VPC.
   * 
   * &gt; This resource takes exclusive ownership over the IP routes of a directory. This includes removal of IP routes which are not explicitly configured. To prevent persistent drift, ensure any `aws.directoryservice.IpRoute` resources managed alongside this resource have an equivalent `ipRoute` block.
   * 
   * &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured IP routes. It __will not__ remove the configured IP routes from the directory.
   * 
   * &gt; Adding an IPv6 route (`cidrIpv6`) requires the directory&#39;s network type to be dual-stack (IPv4 and IPv6). Enabling IPv6 support on a directory is a one-way operation performed outside of Terraform; see [Updating directory network type](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/ms_ad_update-directory-type.html).
   */
  def IpRoutesExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.IpRoutesExclusiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.IpRoutesExclusiveArgs.builder
    com.pulumi.aws.directoryservice.IpRoutesExclusive(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Log subscription for AWS Directory Service that pushes logs to CloudWatch. */
  def LogSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.LogSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.LogSubscriptionArgs.builder
    com.pulumi.aws.directoryservice.LogSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a directory&#39;s multi-factor authentication (MFA) using a Remote Authentication Dial In User Service (RADIUS) server. */
  def RadiusSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.RadiusSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.RadiusSettingsArgs.builder
    com.pulumi.aws.directoryservice.RadiusSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a replicated Region and directory for Multi-Region replication.
   * Multi-Region replication is only supported for the Enterprise Edition of AWS Managed Microsoft AD.
   */
  def ServiceRegion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.ServiceRegionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directoryservice.ServiceRegionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.directoryservice.ServiceRegion(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a directory in your account (directory owner) shared with another account (directory consumer). */
  def SharedDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.SharedDirectoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.SharedDirectoryArgs.builder
    com.pulumi.aws.directoryservice.SharedDirectory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepts a shared directory in a consumer account.
   * 
   * &gt; **NOTE:** Destroying this resource removes the shared directory from the consumer account only.
   */
  def SharedDirectoryAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.SharedDirectoryAccepterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.SharedDirectoryAccepterArgs.builder
    com.pulumi.aws.directoryservice.SharedDirectoryAccepter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a trust relationship between two Active Directory Directories.
   * 
   * The directories may either be both AWS Managed Microsoft AD domains or an AWS Managed Microsoft AD domain and a self-managed Active Directory Domain.
   * 
   * The Trust relationship must be configured on both sides of the relationship.
   * If a Trust has only been created on one side, it will be in the state `VerifyFailed`.
   * Once the second Trust is created, the first will update to the correct state.
   */
  def Trust(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.TrustArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.directoryservice.TrustArgs.builder
    com.pulumi.aws.directoryservice.Trust(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
