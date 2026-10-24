package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object vpc:
  /**
   * Resource for enabling private DNS on an AWS VPC Endpoint.
   * 
   * &gt; When using this resource, the `privateDnsEnabled` argument should be omitted on the parent `aws.ec2.VpcEndpoint` resource.
   * Setting the value both places can lead to unintended behavior and persistent differences.
   */
  def EndpointPrivateDns(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.EndpointPrivateDnsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpc.EndpointPrivateDnsArgs.builder
    com.pulumi.aws.vpc.EndpointPrivateDns(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS VPC Endpoint Service Private DNS Verification.
   * This resource begins the verification process by calling the [`StartVpcEndpointServicePrivateDnsVerification`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_StartVpcEndpointServicePrivateDnsVerification.html) API.
   * The service provider should add a record to the DNS server _before_ creating this resource.
   * 
   * For additional details, refer to the AWS documentation on [managing VPC endpoint service DNS names](https://docs.aws.amazon.com/vpc/latest/privatelink/manage-dns-names.html).
   * 
   * &gt; Destruction of this resource will not stop the verification process, only remove the resource from state.
   */
  def EndpointServicePrivateDnsVerification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpc.EndpointServicePrivateDnsVerificationArgs.builder
    com.pulumi.aws.vpc.EndpointServicePrivateDnsVerification(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource for managing a VPC Route Server. */
  def RouteServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.RouteServerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpc.RouteServer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource for managing a VPC Route Server Endpoint. */
  def RouteServerEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.RouteServerEndpointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpc.RouteServerEndpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource for managing a VPC Route Server Peer. */
  def RouteServerPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerPeerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.RouteServerPeerArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpc.RouteServerPeer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource for managing propagation between VPC route server and a route table. */
  def RouteServerPropagation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerPropagationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpc.RouteServerPropagationArgs.builder
    com.pulumi.aws.vpc.RouteServerPropagation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource for managing association between VPC route server and a VPC. */
  def RouteServerVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpc.RouteServerVpcAssociationArgs.builder
    com.pulumi.aws.vpc.RouteServerVpcAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an outbound (egress) rule for a security group.
   * 
   * When specifying an outbound rule for your security group in a VPC, the configuration must include a destination for the traffic.
   * 
   * &gt; **NOTE:** Using `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources is the current best practice. Avoid using the `aws.ec2.SecurityGroupRule` resource and the `ingress` and `egress` arguments of the `aws.ec2.SecurityGroup` resource for configuring in-line rules, as they struggle with managing multiple CIDR blocks, and tags and descriptions due to the historical lack of unique IDs.
   * 
   * &gt; **WARNING:** You should not use the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources in conjunction with the `aws.ec2.SecurityGroup` resource with _in-line rules_ (using the `ingress` and `egress` arguments of `aws.ec2.SecurityGroup`) or the `aws.ec2.SecurityGroupRule` resource. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   */
  def SecurityGroupEgressRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.SecurityGroupEgressRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.SecurityGroupEgressRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpc.SecurityGroupEgressRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an inbound (ingress) rule for a security group.
   * 
   * When specifying an inbound rule for your security group in a VPC, the configuration must include a source for the traffic.
   * 
   * &gt; **NOTE:** Using `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources is the current best practice. Avoid using the `aws.ec2.SecurityGroupRule` resource and the `ingress` and `egress` arguments of the `aws.ec2.SecurityGroup` resource for configuring in-line rules, as they struggle with managing multiple CIDR blocks, and tags and descriptions due to the historical lack of unique IDs.
   * 
   * &gt; **WARNING:** You should not use the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources in conjunction with the `aws.ec2.SecurityGroup` resource with _in-line rules_ (using the `ingress` and `egress` arguments of `aws.ec2.SecurityGroup`) or the `aws.ec2.SecurityGroupRule` resource. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   */
  def SecurityGroupIngressRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.SecurityGroupIngressRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.vpc.SecurityGroupIngressRuleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.vpc.SecurityGroupIngressRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing Security Group VPC Associations. */
  def SecurityGroupVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.vpc.SecurityGroupVpcAssociationArgs.builder
    com.pulumi.aws.vpc.SecurityGroupVpcAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object VpcFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS EC2 VPC Endpoint Associations. */
    inline def getEndpointAssociations(args: Endofunction[com.pulumi.aws.vpc.inputs.GetEndpointAssociationsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.vpc.outputs.GetEndpointAssociationsResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetEndpointAssociationsArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getEndpointAssociations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS EC2 VPC Endpoint Associations. */
    inline def getEndpointAssociationsPlain(args: Endofunction[com.pulumi.aws.vpc.inputs.GetEndpointAssociationsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpc.outputs.GetEndpointAssociationsResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetEndpointAssociationsPlainArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getEndpointAssociationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * `aws.vpc.getSecurityGroupRule` provides details about a specific security group rule.
     * 
     * The arguments of this data source act as filters for querying the available security group rules. The given filters must match exactly one security group rule whose data will be exported as attributes.
     */
    inline def getSecurityGroupRule(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.vpc.outputs.GetSecurityGroupRuleResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRuleArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * `aws.vpc.getSecurityGroupRule` provides details about a specific security group rule.
     * 
     * The arguments of this data source act as filters for querying the available security group rules. The given filters must match exactly one security group rule whose data will be exported as attributes.
     */
    inline def getSecurityGroupRulePlain(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpc.outputs.GetSecurityGroupRuleResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulePlainArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** This resource can be useful for getting back a set of security group rule IDs. */
    inline def getSecurityGroupRules(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.vpc.outputs.GetSecurityGroupRulesResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** This resource can be useful for getting back a set of security group rule IDs. */
    inline def getSecurityGroupRulesPlain(args: Endofunction[com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.vpc.outputs.GetSecurityGroupRulesResult] =
      val argsBuilder = com.pulumi.aws.vpc.inputs.GetSecurityGroupRulesPlainArgs.builder
      com.pulumi.aws.vpc.VpcFunctions.getSecurityGroupRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
