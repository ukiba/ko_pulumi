package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ec2:
  /**
   * Provides EC2 allowed images settings for an AWS account. This feature allows you to control which AMIs can be used to launch EC2 instances in your account based on specified criteria.
   * 
   * For more information about the image criteria that can be set, see the [AWS documentation on Allowed AMIs JSON configuration](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-allowed-amis.html#allowed-amis-json-configuration).
   * 
   * &gt; **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.
   * 
   * &gt; **NOTE:** There is only one allowed images settings configuration per AWS account and region. Creating this resource will configure the account-level settings.
   */
  def AllowedImagesSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.AllowedImagesSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.AllowedImagesSettingsArgs.builder
    com.pulumi.aws.ec2.AllowedImagesSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The AMI resource allows the creation and management of a completely-custom
   * AMI.
   * 
   * If you just want to duplicate an existing AMI, possibly copying it to another
   * region, it&#39;s better to use `aws.ec2.AmiCopy` instead.
   * 
   * If you just want to share an existing AMI with another AWS account,
   * it&#39;s better to use `aws.ec2.AmiLaunchPermission` instead.
   */
  def Ami(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.AmiArgs.builder
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
    com.pulumi.aws.ec2.Ami(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The &#34;AMI copy&#34; resource allows duplication of an AMI,
   * including cross-region copies.
   * 
   * If the source AMI has associated EBS snapshots, those will also be duplicated
   * along with the AMI.
   * 
   * This is useful for taking a single AMI provisioned in one region and making
   * it available in another for a multi-region deployment.
   * 
   * Copying an AMI can take several minutes. The creation of this resource will
   * block until the new AMI is available for use on new instances.
   */
  def AmiCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiCopyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.AmiCopyArgs.builder
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
    com.pulumi.aws.ec2.AmiCopy(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The &#34;AMI from instance&#34; resource allows the creation of an Amazon Machine
   * Image (AMI) modeled after an existing EBS-backed EC2 instance.
   * 
   * The created AMI will refer to implicitly-created snapshots of the instance&#39;s
   * EBS volumes and mimic its assigned block device configuration at the time
   * the resource is created.
   * 
   * This resource is best applied to an instance that is stopped when this instance
   * is created, so that the contents of the created image are predictable. When
   * applied to an instance that is running, *the instance will be stopped before taking
   * the snapshots and then started back up again*, resulting in a period of
   * downtime.
   * 
   * Note that the source instance is inspected only at the initial creation of this
   * resource. Ongoing updates to the referenced instance will not be propagated into
   * the generated AMI. Users may taint or otherwise recreate the resource in order
   * to produce a fresh snapshot.
   */
  def AmiFromInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.AmiFromInstanceArgs.builder
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
    com.pulumi.aws.ec2.AmiFromInstance(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Adds a launch permission to an AMI. */
  def AmiLaunchPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiLaunchPermissionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.AmiLaunchPermissionArgs.builder
    com.pulumi.aws.ec2.AmiLaunchPermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an EC2 Availability Zone Group, such as updating its opt-in status.
   * 
   * &gt; **NOTE:** This is an advanced resource. The provider will automatically assume management of the EC2 Availability Zone Group without import and perform no actions on removal from configuration.
   */
  def AvailabilityZoneGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.AvailabilityZoneGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.AvailabilityZoneGroupArgs.builder
    com.pulumi.aws.ec2.AvailabilityZoneGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 Capacity Block Reservation. This allows you to purchase capacity block for your Amazon EC2 instances in a specific Availability Zone for machine learning (ML) Workloads.
   * 
   * &gt; **NOTE:** Once created, a reservation is valid for the `duration` of the provided `capacityBlockOfferingId` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [EC2 Capacity Block Reservation Documentation](https://aws.amazon.com/ec2/instance-types/p5/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-blocks-pricing-billing.html).
   * 
   * &gt; **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
   */
  def CapacityBlockReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.CapacityBlockReservationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CapacityBlockReservationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.CapacityBlockReservation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an EC2 Capacity Reservation. This allows you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration. */
  def CapacityReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.CapacityReservationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CapacityReservationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.CapacityReservation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EC2 Carrier Gateway. See the AWS [documentation](https://docs.aws.amazon.com/vpc/latest/userguide/Carrier_Gateway.html) for more information. */
  def CarrierGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.CarrierGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CarrierGatewayArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.CarrierGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a customer gateway inside a VPC. These objects can be connected to VPN gateways via VPN connections, and allow you to establish tunnels between your network and the VPC. */
  def CustomerGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.CustomerGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CustomerGatewayArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.CustomerGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an EC2 Host resource. This allows Dedicated Hosts to be allocated, modified, and released. */
  def DedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DedicatedHostArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DedicatedHostArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DedicatedHost(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS EC2 Default Credit Specification. */
  def DefaultCreditSpecification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.builder
    com.pulumi.aws.ec2.DefaultCreditSpecification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage a VPC&#39;s default network ACL. This resource can manage the default network ACL of the default or a non-default VPC.
   * 
   * &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultNetworkAcl` behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to &#34;adopt&#34; it into management.
   * 
   * Every VPC has a default network ACL that can be managed but not destroyed. When the provider first adopts the Default Network ACL, it **immediately removes all rules in the ACL**. It then proceeds to create any rules specified in the configuration. This step is required so that only the rules specified in the configuration are created.
   * 
   * This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diffs being shown. For these reasons, this resource is incompatible with the `aws.ec2.NetworkAclRule` resource.
   * 
   * For more information about Network ACLs, see the AWS Documentation on [Network ACLs](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html).
   */
  def DefaultNetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultNetworkAclArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DefaultNetworkAcl(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage a default route table of a VPC. This resource can manage the default route table of the default or a non-default VPC.
   * 
   * &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultRouteTable` resource behaves differently from normal resources. Terraform does not _create_ this resource but instead attempts to &#34;adopt&#34; it into management. **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.MainRouteTableAssociation documentation for more details.
   * 
   * Every VPC has a default route table that can be managed but not destroyed. When the provider first adopts a default route table, it **immediately removes all defined routes**. It then proceeds to create any routes specified in the configuration. This step is required so that only the routes specified in the configuration exist in the default route table.
   * 
   * For more information, see the Amazon VPC User Guide on [Route Tables](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html). For information about managing normal route tables in this provider, see `aws.ec2.RouteTable`.
   */
  def DefaultRouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultRouteTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultRouteTableArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DefaultRouteTable(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage a default security group. This resource can manage the default security group of the default or a non-default VPC.
   * 
   * &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultSecurityGroup` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to &#34;adopt&#34; it into management.
   * 
   * When the provider first begins managing the default security group, it **immediately removes all ingress and egress rules in the Security Group**. It then creates any rules specified in the configuration. This way only the rules specified in the configuration are created.
   * 
   * This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diff shown. For these reasons, this resource is incompatible with the `aws.ec2.SecurityGroupRule` resource.
   * 
   * For more information about default security groups, see the AWS documentation on [Default Security Groups](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html#default-security-group). To manage normal security groups, see the `aws.ec2.SecurityGroup` resource.
   */
  def DefaultSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultSecurityGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DefaultSecurityGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage a [default subnet](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html#default-vpc-basics) in the current region.
   * 
   * **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   * 
   * The `aws.ec2.DefaultSubnet` resource behaves differently from normal resources in that if a default subnet exists in the specified Availability Zone, this provider does not _create_ this resource, but instead &#34;adopts&#34; it into management.
   * If no default subnet exists, this provider creates a new default subnet.
   * By default, `pulumi destroy` does not delete the default subnet but does remove the resource from the state.
   * Set the `forceDestroy` argument to `true` to delete the default subnet.
   */
  def DefaultSubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultSubnetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultSubnetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DefaultSubnet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage the [default AWS VPC](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html)
   * in the current AWS Region.
   * 
   * If you created your AWS account after 2013-12-04 you have a default VPC in each AWS Region.
   * 
   * **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   * 
   * The `aws.ec2.DefaultVpc` resource behaves differently from normal resources in that if a default VPC exists, this provider does not _create_ this resource, but instead &#34;adopts&#34; it into management.
   * If no default VPC exists, the provider creates a new default VPC, which leads to the implicit creation of [other resources](https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html#default-vpc-components).
   * By default, `pulumi destroy` does not delete the default VPC but does remove the resource from the state.
   * Set the `forceDestroy` argument to `true` to delete the default VPC.
   */
  def DefaultVpc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultVpcArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultVpcArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DefaultVpc(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage the [default AWS DHCP Options Set](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html#AmazonDNS)
   * in the current region.
   * 
   * Each AWS region comes with a default set of DHCP options.
   * **This is an advanced resource**, and has special caveats to be aware of when
   * using it. Please read this document in its entirety before using this resource.
   * 
   * The `aws.ec2.DefaultVpcDhcpOptions` behaves differently from normal resources, in that
   * this provider does not _create_ this resource, but instead &#34;adopts&#34; it
   * into management.
   */
  def DefaultVpcDhcpOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultVpcDhcpOptionsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultVpcDhcpOptionsArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.DefaultVpcDhcpOptions(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object Ec2Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the ID of a registered AMI for use in other
     * resources.
     */
    inline def getAmi(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetAmiResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmi(args(argsBuilder).build)

    /**
     * Use this data source to get the ID of a registered AMI for use in other
     * resources.
     */
    inline def getAmiPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetAmiResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmiPlain(args(argsBuilder).build)

    /** Use this data source to get a list of AMI IDs matching the specified criteria. */
    inline def getAmiIds(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmiIds(args(argsBuilder).build)

    /** Use this data source to get a list of AMI IDs matching the specified criteria. */
    inline def getAmiIdsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmiIdsPlain(args(argsBuilder).build)

    /** Information about a single EC2 Capacity Block Offering. */
    inline def getCapacityBlockOffering(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCapacityBlockOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCapacityBlockOffering(args(argsBuilder).build)

    /** Information about a single EC2 Capacity Block Offering. */
    inline def getCapacityBlockOfferingPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCapacityBlockOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCapacityBlockOfferingPlain(args(argsBuilder).build)

    /**
     * Information about an existing EC2 Capacity Block reservation.
     * 
     * This data source returns only Capacity Reservations whose `reservationType` is `capacity-block`. Use the `aws.ec2.CapacityReservation` data source to look up On-Demand Capacity Reservations (ODCR).
     * 
     * At least one of `id` or `filter` must be specified. Filter combinations that match multiple Capacity Block reservations will return an error.
     */
    inline def getCapacityBlockReservation(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCapacityBlockReservationResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCapacityBlockReservation(args(argsBuilder).build)

    /**
     * Information about an existing EC2 Capacity Block reservation.
     * 
     * This data source returns only Capacity Reservations whose `reservationType` is `capacity-block`. Use the `aws.ec2.CapacityReservation` data source to look up On-Demand Capacity Reservations (ODCR).
     * 
     * At least one of `id` or `filter` must be specified. Filter combinations that match multiple Capacity Block reservations will return an error.
     */
    inline def getCapacityBlockReservationPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCapacityBlockReservationResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCapacityBlockReservationPlain(args(argsBuilder).build)

    /**
     * Provides details about a specific EC2 Customer-Owned IP Pool.
     * 
     * This data source can prove useful when a module accepts a CoIP pool ID as
     * an input variable and needs to, for example, determine the CIDR block of that
     * CoIP Pool.
     */
    inline def getCoipPool(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCoipPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPool(args(argsBuilder).build)

    /**
     * Provides details about a specific EC2 Customer-Owned IP Pool.
     * 
     * This data source can prove useful when a module accepts a CoIP pool ID as
     * an input variable and needs to, for example, determine the CIDR block of that
     * CoIP Pool.
     */
    inline def getCoipPoolPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCoipPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPoolPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Customer-Owned IP Pools, such as their identifiers. */
    inline def getCoipPools(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCoipPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPools(args(argsBuilder).build)

    /** Provides information for multiple EC2 Customer-Owned IP Pools, such as their identifiers. */
    inline def getCoipPoolsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCoipPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPoolsPlain(args(argsBuilder).build)

    /** Get an existing AWS Customer Gateway. */
    inline def getCustomerGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCustomerGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCustomerGateway(args(argsBuilder).build)

    /** Get an existing AWS Customer Gateway. */
    inline def getCustomerGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCustomerGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCustomerGatewayPlain(args(argsBuilder).build)

    /** Use this data source to get information about an EC2 Dedicated Host. */
    inline def getDedicatedHost(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getDedicatedHost(args(argsBuilder).build)

    /** Use this data source to get information about an EC2 Dedicated Host. */
    inline def getDedicatedHostPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getDedicatedHostPlain(args(argsBuilder).build)

    /** Provides a list of Elastic IPs in a region. */
    inline def getEips(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetEipsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getEips(args(argsBuilder).build)

    /** Provides a list of Elastic IPs in a region. */
    inline def getEipsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetEipsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getEipsPlain(args(argsBuilder).build)

    /** `aws.ec2.Eip` provides details about a specific Elastic IP. */
    inline def getElasticIp(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetElasticIpResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getElasticIp(args(argsBuilder).build)

    /** `aws.ec2.Eip` provides details about a specific Elastic IP. */
    inline def getElasticIpPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetElasticIpResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getElasticIpPlain(args(argsBuilder).build)

    /** Provides a list of EC2 Dedicated Host IDs matching the provided filters. More information about Dedicated Hosts can be found in the [EC2 User Guide](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html). */
    inline def getHosts(args: Endofunction[com.pulumi.aws.ec2.inputs.GetHostsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetHostsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetHostsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getHosts(args(argsBuilder).build)

    /** Provides a list of EC2 Dedicated Host IDs matching the provided filters. More information about Dedicated Hosts can be found in the [EC2 User Guide](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html). */
    inline def getHostsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetHostsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetHostsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetHostsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getHostsPlain(args(argsBuilder).build)

    /** Use this data source to get the ID of an Amazon EC2 Instance for use in other resources. */
    inline def getInstance(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstance(args(argsBuilder).build)

    /** Use this data source to get the ID of an Amazon EC2 Instance for use in other resources. */
    inline def getInstancePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstancePlain(args(argsBuilder).build)

    /** Get characteristics for a single EC2 Instance Type. */
    inline def getInstanceType(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypeResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceType(args(argsBuilder).build)

    /** Get characteristics for a single EC2 Instance Type. */
    inline def getInstanceTypePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypeResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypePlain(args(argsBuilder).build)

    /** Information about single EC2 Instance Type Offering. */
    inline def getInstanceTypeOffering(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOffering(args(argsBuilder).build)

    /** Information about single EC2 Instance Type Offering. */
    inline def getInstanceTypeOfferingPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOfferingPlain(args(argsBuilder).build)

    /** Information about EC2 Instance Type Offerings. */
    inline def getInstanceTypeOfferings(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOfferings(args(argsBuilder).build)

    /** Information about EC2 Instance Type Offerings. */
    inline def getInstanceTypeOfferingsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOfferingsPlain(args(argsBuilder).build)

    /** Information about EC2 Instance Types. */
    inline def getInstanceTypes(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypes(args(argsBuilder).build)

    /** Information about EC2 Instance Types. */
    inline def getInstanceTypesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypesPlain(args(argsBuilder).build)

    /**
     * Use this data source to get IDs or IPs of Amazon EC2 instances to be referenced elsewhere,
     * e.g., to allow easier migration from another management solution
     * or to make it easier for an operator to connect through bastion host(s).
     * 
     * &gt; **Note:** It&#39;s strongly discouraged to use this data source for querying ephemeral
     * instances (e.g., managed via Auto Scaling group), as the output may change at any time
     * and you&#39;d need to re-run `apply` every time an instance comes up or dies.
     */
    inline def getInstances(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstances(args(argsBuilder).build)

    /**
     * Use this data source to get IDs or IPs of Amazon EC2 instances to be referenced elsewhere,
     * e.g., to allow easier migration from another management solution
     * or to make it easier for an operator to connect through bastion host(s).
     * 
     * &gt; **Note:** It&#39;s strongly discouraged to use this data source for querying ephemeral
     * instances (e.g., managed via Auto Scaling group), as the output may change at any time
     * and you&#39;d need to re-run `apply` every time an instance comes up or dies.
     */
    inline def getInstancesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstancesPlain(args(argsBuilder).build)

    /** `aws.ec2.InternetGateway` provides details about a specific Internet Gateway. */
    inline def getInternetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInternetGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInternetGateway(args(argsBuilder).build)

    /** `aws.ec2.InternetGateway` provides details about a specific Internet Gateway. */
    inline def getInternetGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInternetGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInternetGatewayPlain(args(argsBuilder).build)

    /**
     * Previews a CIDR from an IPAM address pool. Only works for private IPv4.
     * 
     * &gt; **NOTE:** This functionality is also encapsulated in a resource sharing the same name. The data source can be used when you need to use the CIDR in a calculation of the same Root module, `count` for example. However, once a CIDR range has been allocated that was previewed, the next refresh will find a **new** CIDR and may force new resources downstream. Make sure to use Pulumi&#39;s `ignoreChanges` resource option if this is undesirable.
     */
    inline def getIpamPreviewNextCidr(args: Endofunction[com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetIpamPreviewNextCidrResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getIpamPreviewNextCidr(args(argsBuilder).build)

    /**
     * Previews a CIDR from an IPAM address pool. Only works for private IPv4.
     * 
     * &gt; **NOTE:** This functionality is also encapsulated in a resource sharing the same name. The data source can be used when you need to use the CIDR in a calculation of the same Root module, `count` for example. However, once a CIDR range has been allocated that was previewed, the next refresh will find a **new** CIDR and may force new resources downstream. Make sure to use Pulumi&#39;s `ignoreChanges` resource option if this is undesirable.
     */
    inline def getIpamPreviewNextCidrPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetIpamPreviewNextCidrResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getIpamPreviewNextCidrPlain(args(argsBuilder).build)

    /** Use this data source to get information about a specific EC2 Key Pair. */
    inline def getKeyPair(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetKeyPairResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getKeyPair(args(argsBuilder).build)

    /** Use this data source to get information about a specific EC2 Key Pair. */
    inline def getKeyPairPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetKeyPairResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getKeyPairPlain(args(argsBuilder).build)

    /** Provides information about a Launch Configuration. */
    inline def getLaunchConfiguration(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLaunchConfigurationResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchConfigurationArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchConfiguration(args(argsBuilder).build)

    /** Provides information about a Launch Configuration. */
    inline def getLaunchConfigurationPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLaunchConfigurationResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchConfigurationPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchConfigurationPlain(args(argsBuilder).build)

    /** Provides information about a Launch Template. */
    inline def getLaunchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLaunchTemplateResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchTemplate(args(argsBuilder).build)

    /** Provides information about a Launch Template. */
    inline def getLaunchTemplatePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLaunchTemplateResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplatePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchTemplatePlain(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway. */
    inline def getLocalGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGateway(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway. */
    inline def getLocalGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayPlain(args(argsBuilder).build)

    /**
     * Provides details about an EC2 Local Gateway Route Table.
     * 
     * This data source can prove useful when a module accepts a local gateway route table ID as
     * an input variable and needs to, for example, find the associated Outpost or Local Gateway.
     */
    inline def getLocalGatewayRouteTable(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTable(args(argsBuilder).build)

    /**
     * Provides details about an EC2 Local Gateway Route Table.
     * 
     * This data source can prove useful when a module accepts a local gateway route table ID as
     * an input variable and needs to, for example, find the associated Outpost or Local Gateway.
     */
    inline def getLocalGatewayRouteTablePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTablePlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers. */
    inline def getLocalGatewayRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTables(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers. */
    inline def getLocalGatewayRouteTablesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTablesPlain(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    inline def getLocalGatewayVirtualInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterface(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    inline def getLocalGatewayVirtualInterfacePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfacePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfacePlain(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface Group. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    inline def getLocalGatewayVirtualInterfaceGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroup(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface Group. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    inline def getLocalGatewayVirtualInterfaceGroupPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroupPlain(args(argsBuilder).build)

    /** Provides details about multiple EC2 Local Gateway Virtual Interface Groups, such as identifiers. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    inline def getLocalGatewayVirtualInterfaceGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroups(args(argsBuilder).build)

    /** Provides details about multiple EC2 Local Gateway Virtual Interface Groups, such as identifiers. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    inline def getLocalGatewayVirtualInterfaceGroupsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroupsPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateways, such as their identifiers. */
    inline def getLocalGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGateways(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateways, such as their identifiers. */
    inline def getLocalGatewaysPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewaysPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.ManagedPrefixList` provides details about a specific AWS prefix list or
     * customer-managed prefix list in the current region.
     */
    inline def getManagedPrefixList(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetManagedPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixList(args(argsBuilder).build)

    /**
     * `aws.ec2.ManagedPrefixList` provides details about a specific AWS prefix list or
     * customer-managed prefix list in the current region.
     */
    inline def getManagedPrefixListPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetManagedPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixListPlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of managed prefix list IDs to be referenced elsewhere. */
    inline def getManagedPrefixLists(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetManagedPrefixListsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixLists(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of managed prefix list IDs to be referenced elsewhere. */
    inline def getManagedPrefixListsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetManagedPrefixListsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixListsPlain(args(argsBuilder).build)

    /** Provides details about a specific VPC NAT Gateway. */
    inline def getNatGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGateway(args(argsBuilder).build)

    /** Provides details about a specific VPC NAT Gateway. */
    inline def getNatGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGatewayPlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of NAT gateway IDs to be referenced elsewhere. */
    inline def getNatGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNatGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGateways(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of NAT gateway IDs to be referenced elsewhere. */
    inline def getNatGatewaysPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNatGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGatewaysPlain(args(argsBuilder).build)

    inline def getNetworkAcls(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkAclsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkAcls(args(argsBuilder).build)

    inline def getNetworkAclsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkAclsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkAclsPlain(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsAnalysis` provides details about a specific Network Insights Analysis. */
    inline def getNetworkInsightsAnalysis(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInsightsAnalysisResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsAnalysis(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsAnalysis` provides details about a specific Network Insights Analysis. */
    inline def getNetworkInsightsAnalysisPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInsightsAnalysisResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsAnalysisPlain(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsPath` provides details about a specific Network Insights Path. */
    inline def getNetworkInsightsPath(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInsightsPathResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsPath(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsPath` provides details about a specific Network Insights Path. */
    inline def getNetworkInsightsPathPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInsightsPathResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsPathPlain(args(argsBuilder).build)

    /** Use this data source to get information about a Network Interface. */
    inline def getNetworkInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterface(args(argsBuilder).build)

    /** Use this data source to get information about a Network Interface. */
    inline def getNetworkInterfacePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterfacePlain(args(argsBuilder).build)

    inline def getNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInterfacesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterfaces(args(argsBuilder).build)

    inline def getNetworkInterfacesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInterfacesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterfacesPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.getPrefixList` provides details about a specific AWS prefix list (PL)
     * in the current region.
     * 
     * This can be used both to validate a prefix list given in a variable
     * and to obtain the CIDR blocks (IP address ranges) for the associated
     * AWS service. The latter may be useful e.g., for adding network ACL
     * rules.
     * 
     * The aws.ec2.ManagedPrefixList data source is normally more appropriate to use given it can return customer-managed prefix list info, as well as additional attributes.
     */
    inline def getPrefixList(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPrefixList(args(argsBuilder).build)

    /**
     * `aws.ec2.getPrefixList` provides details about a specific AWS prefix list (PL)
     * in the current region.
     * 
     * This can be used both to validate a prefix list given in a variable
     * and to obtain the CIDR blocks (IP address ranges) for the associated
     * AWS service. The latter may be useful e.g., for adding network ACL
     * rules.
     * 
     * The aws.ec2.ManagedPrefixList data source is normally more appropriate to use given it can return customer-managed prefix list info, as well as additional attributes.
     */
    inline def getPrefixListPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPrefixListPlain(args(argsBuilder).build)

    /** Provides details about a specific AWS EC2 Public IPv4 Pool. */
    inline def getPublicIpv4Pool(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4Pool(args(argsBuilder).build)

    /** Provides details about a specific AWS EC2 Public IPv4 Pool. */
    inline def getPublicIpv4PoolPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4PoolPlain(args(argsBuilder).build)

    /** Data source for getting information about AWS EC2 Public IPv4 Pools. */
    inline def getPublicIpv4Pools(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4Pools(args(argsBuilder).build)

    /** Data source for getting information about AWS EC2 Public IPv4 Pools. */
    inline def getPublicIpv4PoolsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4PoolsPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.Route` provides details about a specific Route.
     * 
     * This resource can prove useful when finding the resource associated with a CIDR. For example, finding the peering connection associated with a CIDR value.
     */
    inline def getRoute(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRoute(args(argsBuilder).build)

    /**
     * `aws.ec2.Route` provides details about a specific Route.
     * 
     * This resource can prove useful when finding the resource associated with a CIDR. For example, finding the peering connection associated with a CIDR value.
     */
    inline def getRoutePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRoutePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRoutePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRoutePlain(args(argsBuilder).build)

    /**
     * `aws.ec2.RouteTable` provides details about a specific Route Table.
     * 
     * This resource can prove useful when a module accepts a Subnet ID as an input variable and needs to, for example, add a route in the Route Table.
     */
    inline def getRouteTable(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTableArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTable(args(argsBuilder).build)

    /**
     * `aws.ec2.RouteTable` provides details about a specific Route Table.
     * 
     * This resource can prove useful when a module accepts a Subnet ID as an input variable and needs to, for example, add a route in the Route Table.
     */
    inline def getRouteTablePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTablePlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of route table IDs to be referenced elsewhere. */
    inline def getRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTables(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of route table IDs to be referenced elsewhere. */
    inline def getRouteTablesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTablesPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.SecurityGroup` provides details about a specific Security Group.
     * 
     * This resource can prove useful when a module accepts a Security Group ID as
     * an input variable and needs to, for example, determine the ID of the
     * VPC that the security group belongs to.
     */
    inline def getSecurityGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSecurityGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroup(args(argsBuilder).build)

    /**
     * `aws.ec2.SecurityGroup` provides details about a specific Security Group.
     * 
     * This resource can prove useful when a module accepts a Security Group ID as
     * an input variable and needs to, for example, determine the ID of the
     * VPC that the security group belongs to.
     */
    inline def getSecurityGroupPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSecurityGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroupPlain(args(argsBuilder).build)

    /** Use this data source to get IDs and VPC membership of Security Groups that are created outside this provider. */
    inline def getSecurityGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSecurityGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroups(args(argsBuilder).build)

    /** Use this data source to get IDs and VPC membership of Security Groups that are created outside this provider. */
    inline def getSecurityGroupsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSecurityGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroupsPlain(args(argsBuilder).build)

    /** Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region. */
    inline def getSerialConsoleAccess(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSerialConsoleAccessResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSerialConsoleAccess(args(argsBuilder).build)

    /** Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region. */
    inline def getSerialConsoleAccessPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSerialConsoleAccessResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSerialConsoleAccessPlain(args(argsBuilder).build)

    /** Provides details about an EC2 Service Link Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/how-outposts-works.html#how-service-link). */
    inline def getServiceLinkVirtualInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetServiceLinkVirtualInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getServiceLinkVirtualInterface(args(argsBuilder).build)

    /** Provides details about an EC2 Service Link Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/how-outposts-works.html#how-service-link). */
    inline def getServiceLinkVirtualInterfacePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetServiceLinkVirtualInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getServiceLinkVirtualInterfacePlain(args(argsBuilder).build)

    /** Provides a list of EC2 Service Link Virtual Interface IDs matching the provided filters. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/how-outposts-works.html#how-service-link). */
    inline def getServiceLinkVirtualInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetServiceLinkVirtualInterfacesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getServiceLinkVirtualInterfaces(args(argsBuilder).build)

    /** Provides a list of EC2 Service Link Virtual Interface IDs matching the provided filters. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/how-outposts-works.html#how-service-link). */
    inline def getServiceLinkVirtualInterfacesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetServiceLinkVirtualInterfacesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getServiceLinkVirtualInterfacesPlain(args(argsBuilder).build)

    /**
     * &gt; There is only a single spot data feed subscription per account.
     * 
     * Data source for accessing an AWS EC2 spot data feed subscription.
     */
    inline def getSpotDatafeedSubscription(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSpotDatafeedSubscriptionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotDatafeedSubscription(args(argsBuilder).build)

    /**
     * &gt; There is only a single spot data feed subscription per account.
     * 
     * Data source for accessing an AWS EC2 spot data feed subscription.
     */
    inline def getSpotDatafeedSubscriptionPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSpotDatafeedSubscriptionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotDatafeedSubscriptionPlain(args(argsBuilder).build)

    /** Information about most recent Spot Price for a given EC2 instance. */
    inline def getSpotPrice(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSpotPriceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotPrice(args(argsBuilder).build)

    /** Information about most recent Spot Price for a given EC2 instance. */
    inline def getSpotPricePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPricePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSpotPriceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPricePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotPricePlain(args(argsBuilder).build)

    /**
     * `aws.ec2.Subnet` provides details about a specific VPC subnet.
     * 
     * This resource can prove useful when a module accepts a subnet ID as an input variable and needs to, for example, determine the ID of the VPC that the subnet belongs to.
     */
    inline def getSubnet(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnet(args(argsBuilder).build)

    /**
     * `aws.ec2.Subnet` provides details about a specific VPC subnet.
     * 
     * This resource can prove useful when a module accepts a subnet ID as an input variable and needs to, for example, determine the ID of the VPC that the subnet belongs to.
     */
    inline def getSubnetPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnetPlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of subnet IDs. */
    inline def getSubnets(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSubnetsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnets(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of subnet IDs. */
    inline def getSubnetsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSubnetsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnetsPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers. */
    inline def getTransitGatewayRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetTransitGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getTransitGatewayRouteTables(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers. */
    inline def getTransitGatewayRouteTablesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetTransitGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getTransitGatewayRouteTablesPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.Vpc` provides details about a specific VPC.
     * 
     * This resource can prove useful when a module accepts a VPC ID as
     * an input variable and needs to, for example, determine the CIDR block of that
     * VPC.
     */
    inline def getVpc(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpc(args(argsBuilder).build)

    /**
     * `aws.ec2.Vpc` provides details about a specific VPC.
     * 
     * This resource can prove useful when a module accepts a VPC ID as
     * an input variable and needs to, for example, determine the CIDR block of that
     * VPC.
     */
    inline def getVpcPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPlain(args(argsBuilder).build)

    /** Retrieve information about an EC2 DHCP Options configuration. */
    inline def getVpcDhcpOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcDhcpOptionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcDhcpOptions(args(argsBuilder).build)

    /** Retrieve information about an EC2 DHCP Options configuration. */
    inline def getVpcDhcpOptionsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcDhcpOptionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcDhcpOptionsPlain(args(argsBuilder).build)

    /**
     * The VPC Endpoint data source provides details about
     * a specific VPC endpoint.
     */
    inline def getVpcEndpoint(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpoint(args(argsBuilder).build)

    /**
     * The VPC Endpoint data source provides details about
     * a specific VPC endpoint.
     */
    inline def getVpcEndpointPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpointPlain(args(argsBuilder).build)

    /**
     * The VPC Endpoint Service data source details about a specific service that
     * can be specified when creating a VPC endpoint within the region configured in the provider.
     */
    inline def getVpcEndpointService(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcEndpointServiceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpointService(args(argsBuilder).build)

    /**
     * The VPC Endpoint Service data source details about a specific service that
     * can be specified when creating a VPC endpoint within the region configured in the provider.
     */
    inline def getVpcEndpointServicePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcEndpointServiceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServicePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpointServicePlain(args(argsBuilder).build)

    /** Data source for managing a VPC IPAM. */
    inline def getVpcIpam(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpam(args(argsBuilder).build)

    /** Data source for managing a VPC IPAM. */
    inline def getVpcIpamPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
     * 
     * This resource can prove useful when an IPAM pool was created in another root
     * module and you need the pool&#39;s ID as an input variable. For example, pools
     * can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    inline def getVpcIpamPool(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPool(args(argsBuilder).build)

    /**
     * `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
     * 
     * This resource can prove useful when an IPAM pool was created in another root
     * module and you need the pool&#39;s ID as an input variable. For example, pools
     * can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    inline def getVpcIpamPoolPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPoolCidrs` provides details about an IPAM pool.
     * 
     * This resource can prove useful when an IPAM pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
     */
    inline def getVpcIpamPoolCidrs(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolCidrsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolCidrs(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPoolCidrs` provides details about an IPAM pool.
     * 
     * This resource can prove useful when an IPAM pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
     */
    inline def getVpcIpamPoolCidrsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolCidrsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolCidrsPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPools` provides details about IPAM pools.
     * 
     * This resource can prove useful when IPAM pools are created in another root
     * module and you need the pool IDs as input variables. For example, pools
     * can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    inline def getVpcIpamPools(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPools(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPools` provides details about IPAM pools.
     * 
     * This resource can prove useful when IPAM pools are created in another root
     * module and you need the pool IDs as input variables. For example, pools
     * can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    inline def getVpcIpamPoolsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolsPlain(args(argsBuilder).build)

    /** Data source for managing VPC IPAMs. */
    inline def getVpcIpams(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpams(args(argsBuilder).build)

    /** Data source for managing VPC IPAMs. */
    inline def getVpcIpamsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamsPlain(args(argsBuilder).build)

    /**
     * The VPC Peering Connection data source provides details about
     * a specific VPC peering connection.
     * 
     * The arguments of this data source act as filters for querying the available VPC peering connections. The given filters must match exactly one VPC peering connection whose data will be exported as attributes.
     */
    inline def getVpcPeeringConnection(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnection(args(argsBuilder).build)

    /**
     * The VPC Peering Connection data source provides details about
     * a specific VPC peering connection.
     * 
     * The arguments of this data source act as filters for querying the available VPC peering connections. The given filters must match exactly one VPC peering connection whose data will be exported as attributes.
     */
    inline def getVpcPeeringConnectionPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnectionPlain(args(argsBuilder).build)

    /**
     * Use this data source to get IDs of Amazon VPC peering connections
     * To get more details on each connection, use the data resource aws.ec2.VpcPeeringConnection
     * 
     * Note: To use this data source in a count, the resources should exist before trying to access
     * the data source.
     */
    inline def getVpcPeeringConnections(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnections(args(argsBuilder).build)

    /**
     * Use this data source to get IDs of Amazon VPC peering connections
     * To get more details on each connection, use the data resource aws.ec2.VpcPeeringConnection
     * 
     * Note: To use this data source in a count, the resources should exist before trying to access
     * the data source.
     */
    inline def getVpcPeeringConnectionsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnectionsPlain(args(argsBuilder).build)

    /**
     * This resource can be useful for getting back a list of VPC IDs for a region.
     * 
     * The following example retrieves a list of VPC IDs with a custom tag of `service` set to a value of &#34;production&#34;.
     */
    inline def getVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcs(args(argsBuilder).build)

    /**
     * This resource can be useful for getting back a list of VPC IDs for a region.
     * 
     * The following example retrieves a list of VPC IDs with a custom tag of `service` set to a value of &#34;production&#34;.
     */
    inline def getVpcsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcsPlain(args(argsBuilder).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an IP security (IPsec) VPN connection between a VPC and an on-premises network. */
    inline def getVpnConnection(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpnConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnConnection(args(argsBuilder).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an IP security (IPsec) VPN connection between a VPC and an on-premises network. */
    inline def getVpnConnectionPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpnConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnConnectionPlain(args(argsBuilder).build)

    /**
     * The VPN Gateway data source provides details about
     * a specific VPN gateway.
     * 
     * The arguments of this data source act as filters for querying the available VPN gateways. The given filters must match exactly one VPN gateway whose data will be exported as attributes.
     */
    inline def getVpnGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnGateway(args(argsBuilder).build)

    /**
     * The VPN Gateway data source provides details about
     * a specific VPN gateway.
     * 
     * The arguments of this data source act as filters for querying the available VPN gateways. The given filters must match exactly one VPN gateway whose data will be exported as attributes.
     */
    inline def getVpnGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnGatewayPlain(args(argsBuilder).build)

  /**
   * [IPv6 only] Creates an egress-only Internet gateway for your VPC.
   * An egress-only Internet gateway is used to enable outbound communication
   * over IPv6 from instances in your VPC to the Internet, and prevents hosts
   * outside of your VPC from initiating an IPv6 connection with your instance.
   */
  def EgressOnlyInternetGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.EgressOnlyInternetGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.EgressOnlyInternetGatewayArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.EgressOnlyInternetGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an Elastic IP resource.
   * 
   * &gt; **Note:** EIP may require IGW to exist prior to association. Use `dependsOn` to set an explicit dependency on the IGW.
   * 
   * &gt; **Note:** Do not use `networkInterface` to associate the EIP to `aws.lb.LoadBalancer` or `aws.ec2.NatGateway` resources. Instead use the `allocationId` available in those resources to allow AWS to manage the association, otherwise you will see `AuthFailure` errors.
   */
  def Eip(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.EipArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.EipArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.Eip(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an AWS EIP Association as a top level resource, to associate and disassociate Elastic IPs from AWS Instances and Network Interfaces.
   * 
   * &gt; **NOTE:** Do not use this resource to associate an EIP to `aws.lb.LoadBalancer` or `aws.ec2.NatGateway` resources. Instead use the `allocationId` available in those resources to allow AWS to manage the association, otherwise you will see `AuthFailure` errors.
   * 
   * &gt; **NOTE:** `aws.ec2.EipAssociation` is useful in scenarios where EIPs are either pre-existing or distributed to customers or users and therefore cannot be changed.
   */
  def EipAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.EipAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.EipAssociationArgs.builder
    com.pulumi.aws.ec2.EipAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Assigns a static reverse DNS record to an Elastic IP addresses. See [Using reverse DNS for email applications](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html#Using_Elastic_Addressing_Reverse_DNS). */
  def EipDomainName(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.EipDomainNameArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.EipDomainNameArgs.builder
    com.pulumi.aws.ec2.EipDomainName(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a VPC Encryption Control. */
  @deprecated("aws.ec2/encryptioncontrol.EncryptionControl has been deprecated in favor of aws.ec2/vpcencryptioncontrol.VpcEncryptionControl") def EncryptionControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.EncryptionControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.EncryptionControlArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.EncryptionControl(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to manage EC2 Fleets. */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.FleetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.FleetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.Fleet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a VPC/Subnet/ENI/Transit Gateway/Transit Gateway Attachment Flow Log to capture IP traffic for a specific network
   * interface, subnet, or VPC. Logs are sent to a CloudWatch Log Group, a S3 Bucket, or Amazon Data Firehose
   */
  def FlowLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.FlowLogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.FlowLogArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.FlowLog(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a regional public access block for AMIs. This prevents AMIs from being made publicly accessible.
   * If you already have public AMIs, they will remain publicly available.
   * 
   * &gt; **NOTE:** Deleting this resource does not change the block public access value, the resource in simply removed from state instead.
   */
  def ImageBlockPublicAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.ImageBlockPublicAccessArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.ImageBlockPublicAccessArgs.builder
    com.pulumi.aws.ec2.ImageBlockPublicAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an EC2 instance resource. This allows instances to be created, updated, and deleted. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.InstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.InstanceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.Instance(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages regional EC2 instance metadata default settings.
   * More information can be found in the [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html) user guide.
   */
  def InstanceMetadataDefaults(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.InstanceMetadataDefaultsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.InstanceMetadataDefaultsArgs.builder
    com.pulumi.aws.ec2.InstanceMetadataDefaults(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to create a VPC Internet Gateway. */
  def InternetGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.InternetGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.InternetGatewayArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.InternetGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to create a VPC Internet Gateway Attachment. */
  def InternetGatewayAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.InternetGatewayAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.InternetGatewayAttachmentArgs.builder
    com.pulumi.aws.ec2.InternetGatewayAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an [EC2 key pair](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) resource. A key pair is used to control login access to EC2 instances.
   * 
   * Currently this resource requires an existing user-supplied key pair. This key pair&#39;s public key will be registered with AWS to allow logging-in to EC2 instances.
   * 
   * When importing an existing key pair the public key material may be in any format supported by AWS. Supported formats (per the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws)) are:
   * 
   * * OpenSSH public key format (the format in ~/.ssh/authorized_keys)
   * * Base64 encoded DER format
   * * SSH public key file format as specified in RFC4716
   */
  def KeyPair(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.KeyPairArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.KeyPairArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.KeyPair(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create a new launch configuration, used for Auto Scaling groups.
   * 
   * &gt; **WARNING:** The use of launch configurations is discouraged in favor of launch templates. Read more in the [AWS EC2 Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html).
   * 
   * &gt; **Note** When using `aws.ec2.LaunchConfiguration` with `aws.autoscaling.Group`, it is recommended to use the `namePrefix` (Optional) instead of the `name` (Optional) attribute. This will allow Pulumi lifecycles to detect changes to the launch configuration and update the Auto Scaling group correctly.
   */
  def LaunchConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LaunchConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ec2.LaunchConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 launch template resource. Can be used to create instances or Auto Scaling groups.
   * 
   * #### Optional
   * 
   * * `accountId` (String) AWS Account where this resource is managed.
   * * `region` (String) Region where this resource is managed.
   * 
   * Using `pulumi import`, import Launch Templates using the `id`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:ec2/launchTemplate:LaunchTemplate web lt-12345678
   * ```
   */
  def LaunchTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.LaunchTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LaunchTemplateArgs.builder
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
    com.pulumi.aws.ec2.LaunchTemplate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EC2 Local Gateway Route. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
  def LocalGatewayRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.LocalGatewayRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.LocalGatewayRouteArgs.builder
    com.pulumi.aws.ec2.LocalGatewayRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EC2 Local Gateway Route Table. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html#route-tables). */
  def LocalGatewayRouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.LocalGatewayRouteTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LocalGatewayRouteTableArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.LocalGatewayRouteTable(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EC2 Local Gateway Route Table Virtual Interface Group Association. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html). */
  def LocalGatewayRouteTableVirtualInterfaceGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.LocalGatewayRouteTableVirtualInterfaceGroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LocalGatewayRouteTableVirtualInterfaceGroupAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.LocalGatewayRouteTableVirtualInterfaceGroupAssociation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EC2 Local Gateway Route Table VPC Association. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html#vpc-associations). */
  def LocalGatewayRouteTableVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource for managing the main routing table of a VPC.
   * 
   * &gt; **NOTE:** **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.DefaultRouteTable documentation for more details.
   * For more information, see the Amazon VPC User Guide on [Route Tables](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html#Route_Replacing_Main_Table). For information about managing normal route tables in Pulumi, see `aws.ec2.RouteTable`.
   */
  def MainRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.MainRouteTableAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.MainRouteTableAssociationArgs.builder
    com.pulumi.aws.ec2.MainRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a managed prefix list resource.
   * 
   * &gt; **NOTE on Managed Prefix Lists and Managed Prefix List Entries:** The provider
   * currently provides both a standalone Managed Prefix List Entry resource (a single entry),
   * and a Managed Prefix List resource with entries defined in-line. At this time you
   * cannot use a Managed Prefix List with in-line rules in conjunction with any Managed
   * Prefix List Entry resources. Doing so will cause a conflict of entries and will overwrite entries.
   * 
   * &gt; **NOTE on `maxEntries`:** When you reference a Prefix List in a resource,
   * the maximum number of entries for the prefix lists counts as the same number of rules
   * or entries for the resource. For example, if you create a prefix list with a maximum
   * of 20 entries and you reference that prefix list in a security group rule, this counts
   * as 20 rules for the security group.
   */
  def ManagedPrefixList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.ManagedPrefixListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.ManagedPrefixListArgs.builder
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
    com.pulumi.aws.ec2.ManagedPrefixList(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Use the `aws.ec2.ManagedPrefixListEntry` resource to manage a managed prefix list entry.
   * 
   * &gt; **NOTE:** Pulumi currently provides two resources for managing Managed Prefix Lists and Managed Prefix List Entries. The standalone resource, Managed Prefix List Entry, is used to manage a single entry. The Managed Prefix List resource is used to manage multiple entries defined in-line. It is important to note that you cannot use a Managed Prefix List with in-line rules in conjunction with any Managed Prefix List Entry resources. This will result in a conflict of entries and will cause the entries to be overwritten.
   * 
   * &gt; **NOTE:** To improve execution times on larger updates, it is recommended to use the inline `entry` block as part of the Managed Prefix List resource when creating a prefix list with more than 100 entries. You can find more information about the resource here.
   */
  def ManagedPrefixListEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.ManagedPrefixListEntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.ManagedPrefixListEntryArgs.builder
    com.pulumi.aws.ec2.ManagedPrefixListEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create a VPC NAT Gateway.
   * 
   * &gt; **WARNING:** You should not use the `aws.ec2.NatGateway` resource that has `secondaryAllocationIds` in conjunction with an `aws.ec2.NatGatewayEipAssociation` resource. Doing so may cause perpetual differences, and result in associations being overwritten.
   */
  def NatGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NatGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NatGatewayArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.NatGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS VPC NAT Gateway EIP Association.
   * 
   * &gt; **WARNING:** You should not use the `aws.ec2.NatGatewayEipAssociation` resource in conjunction with an `aws.ec2.NatGateway` resource that has `secondaryAllocationIds` configured. Doing so may cause perpetual differences, and result in associations being overwritten.
   */
  def NatGatewayEipAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.builder
    com.pulumi.aws.ec2.NatGatewayEipAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an network ACL resource. You might set up network ACLs with rules similar
   * to your security groups in order to add an additional layer of security to your VPC.
   * 
   * &gt; **NOTE on Network ACLs and Network ACL Rules:** This provider currently
   * provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
   * defined in-line. At this time you cannot use a Network ACL with in-line rules
   * in conjunction with any Network ACL Rule resources. Doing so will cause
   * a conflict of rule settings and will overwrite rules.
   * 
   * &gt; **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association
   * resource and a network ACL resource with a `subnetIds` attribute. Do not use the same subnet ID in both a network ACL
   * resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def NetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkAclArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.NetworkAcl(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an network ACL association resource which allows you to associate your network ACL with any subnet(s).
   * 
   * &gt; **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association resource
   * and a network ACL resource with a `subnetIds` attribute. Do not use the same subnet ID in both a network ACL
   * resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def NetworkAclAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkAclAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkAclAssociationArgs.builder
    com.pulumi.aws.ec2.NetworkAclAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Creates an entry (a rule) in a network ACL with the specified rule number.
   * 
   * &gt; **NOTE on Network ACLs and Network ACL Rules:** This provider currently
   * provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
   * defined in-line. At this time you cannot use a Network ACL with in-line rules
   * in conjunction with any Network ACL Rule resources. Doing so will cause
   * a conflict of rule settings and will overwrite rules.
   */
  def NetworkAclRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkAclRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkAclRuleArgs.builder
    com.pulumi.aws.ec2.NetworkAclRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Network Insights Access Scope resource.
   * Part of the &#34;Network Access Analyzer&#34; service in the AWS VPC console.
   */
  def NetworkInsightsAccessScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInsightsAccessScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInsightsAccessScopeArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.NetworkInsightsAccessScope(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Network Insights Analysis resource. Part of the &#34;Reachability Analyzer&#34; service in the AWS VPC console. */
  def NetworkInsightsAnalysis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInsightsAnalysisArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInsightsAnalysisArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.NetworkInsightsAnalysis(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a Network Insights Path resource. Part of the &#34;Reachability Analyzer&#34; service in the AWS VPC console. */
  def NetworkInsightsPath(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInsightsPathArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.NetworkInsightsPath(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an Elastic network interface (ENI) resource. */
  def NetworkInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInterfaceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.NetworkInterface(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Attach an Elastic network interface (ENI) resource with EC2 instance. */
  def NetworkInterfaceAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs.builder
    com.pulumi.aws.ec2.NetworkInterfaceAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Grant cross-account access to an Elastic network interface (ENI). */
  def NetworkInterfacePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.builder
    com.pulumi.aws.ec2.NetworkInterfacePermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * This resource attaches a security group to an Elastic Network Interface (ENI).
   * It can be used to attach a security group to any existing ENI, be it a
   * secondary ENI or one attached as the primary interface on an instance.
   * 
   * &gt; **NOTE on instances, interfaces, and security groups:** This provider currently
   * provides the capability to assign security groups via the `aws.ec2.Instance`
   * and the `aws.ec2.NetworkInterface` resources. Using this resource in
   * conjunction with security groups provided in-line in those resources will cause
   * conflicts, and will lead to spurious diffs and undefined behavior - please use
   * one or the other.
   */
  def NetworkInterfaceSecurityGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs.builder
    com.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage VPC peering connection options.
   * 
   * &gt; **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
   * both a standalone VPC Peering Connection Options and a VPC Peering Connection
   * resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
   * connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
   * Doing so will cause a conflict of options and will overwrite the options.
   * Using a VPC Peering Connection Options resource decouples management of the connection options from
   * management of the VPC Peering Connection and allows options to be set correctly in cross-region and
   * cross-account scenarios.
   */
  def PeeringConnectionOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.builder
    com.pulumi.aws.ec2.PeeringConnectionOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 placement group. Read more about placement groups
   * in [AWS Docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html).
   */
  def PlacementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.PlacementGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.PlacementGroupArgs.builder
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
    com.pulumi.aws.ec2.PlacementGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a proxy protocol policy, which allows an ELB to carry a client connection information to a backend. */
  def ProxyProtocolPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.ProxyProtocolPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.ProxyProtocolPolicyArgs.builder
    com.pulumi.aws.ec2.ProxyProtocolPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create a routing table entry (a route) in a VPC routing table.
   * 
   * &gt; **NOTE on `gatewayId` attribute:** The AWS API is very forgiving with the resource ID passed in the `gatewayId` attribute. For example an `aws.ec2.Route` resource can be created with an `aws.ec2.NatGateway` or `aws.ec2.EgressOnlyInternetGateway` ID specified for the `gatewayId` attribute. Specifying anything other than an `aws.ec2.InternetGateway` or `aws.ec2.VpnGateway` ID will lead to this provider reporting a permanent diff between your configuration and recorded state, as the AWS API returns the more-specific attribute. If you are experiencing constant diffs with an `aws.ec2.Route` resource, the first thing to check is that the correct attribute is being specified.
   * 
   * &gt; **NOTE on combining `vpcEndpointId` and `destinationPrefixListId` attributes:** To associate a Gateway VPC Endpoint (such as S3) with destination prefix list, use the `aws.ec2.VpcEndpointRouteTableAssociation` resource instead.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.RouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.RouteArgs.builder
    com.pulumi.aws.ec2.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create a VPC routing table.
   * 
   * &gt; **NOTE on `gatewayId` and `natGatewayId`:** The AWS API is very forgiving with these two
   * attributes and the `aws.ec2.RouteTable` resource can be created with a NAT ID specified as a Gateway ID attribute.
   * This _will_ lead to a permanent diff between your configuration and statefile, as the API returns the correct
   * parameters in the returned route table. If you&#39;re experiencing constant diffs in your `aws.ec2.RouteTable` resources,
   * the first thing to check is whether or not you&#39;re specifying a NAT ID instead of a Gateway ID, or vice-versa.
   * 
   * &gt; **NOTE on `propagatingVgws` and the `aws.ec2.VpnGatewayRoutePropagation` resource:**
   * If the `propagatingVgws` argument is present, it&#39;s not supported to _also_
   * define route propagations using `aws.ec2.VpnGatewayRoutePropagation`, since
   * this resource will delete any propagating gateways not explicitly listed in
   * `propagatingVgws`. Omit this argument when defining route propagation using
   * the separate resource.
   */
  def RouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.RouteTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.RouteTableArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.RouteTable(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create an association between a route table and a subnet or a route table and an
   * internet gateway or virtual private gateway.
   */
  def RouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.RouteTableAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.RouteTableAssociationArgs.builder
    com.pulumi.aws.ec2.RouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 Secondary Network resource for RDMA networking.
   * 
   * Secondary networks are specialized network resources that enable high-performance RDMA (Remote Direct Memory Access) networking for compute-intensive workloads.
   * They provide dedicated network infrastructure with low latency and high bandwidth capabilities.
   */
  def SecondaryNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecondaryNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SecondaryNetworkArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.SecondaryNetwork(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 Secondary Subnet resource.
   * 
   * A secondary subnet is a subnet within a secondary network that provides high-performance networking capabilities for specialized workloads such as RDMA (Remote Direct Memory Access) applications.
   */
  def SecondarySubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecondarySubnetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SecondarySubnetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.SecondarySubnet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a security group resource.
   * 
   * &gt; **NOTE:** Avoid using the `ingress` and `egress` arguments of the `aws.ec2.SecurityGroup` resource to configure in-line rules, as they struggle with managing multiple CIDR blocks, and, due to the historical lack of unique IDs, tags and descriptions. To avoid these problems, use the current best practice of the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources with one CIDR block per rule.
   * 
   * &gt; **WARNING:** You should not use the `aws.ec2.SecurityGroup` resource with _in-line rules_ (using the `ingress` and `egress` arguments of `aws.ec2.SecurityGroup`) in conjunction with the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources or the `aws.ec2.SecurityGroupRule` resource. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   * 
   * &gt; **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
   * 
   * &gt; **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), security groups associated with Lambda Functions can take up to 45 minutes to successfully delete. To allow for successful deletion, the provider will wait for at least 45 minutes even if a shorter delete timeout is specified.
   * 
   * &gt; **NOTE:** The `cidrBlocks` and `ipv6CidrBlocks` parameters are optional in the `ingress` and `egress` blocks. If nothing is specified, traffic will be blocked as described in _NOTE on Egress rules_ later.
   */
  def SecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecurityGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SecurityGroupArgs.builder
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
    com.pulumi.aws.ec2.SecurityGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create an association between a VPC endpoint and a security group.
   * 
   * &gt; **NOTE on VPC Endpoints and VPC Endpoint Security Group Associations:** The provider provides
   * both a standalone VPC Endpoint Security Group Association (an association between a VPC endpoint
   * and a single `securityGroupId`) and a VPC Endpoint resource with a `securityGroupIds`
   * attribute. Do not use the same security group ID in both a VPC Endpoint resource and a VPC Endpoint Security
   * Group Association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def SecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecurityGroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.SecurityGroupAssociationArgs.builder
    com.pulumi.aws.ec2.SecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a security group rule resource. Represents a single `ingress` or `egress` group rule, which can be added to external Security Groups.
   * 
   * &gt; **NOTE:** Avoid using the `aws.ec2.SecurityGroupRule` resource, as it struggles with managing multiple CIDR blocks, and, due to the historical lack of unique IDs, tags and descriptions. To avoid these problems, use the current best practice of the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources with one CIDR block per rule.
   * 
   * &gt; **WARNING:** You should not use the `aws.ec2.SecurityGroupRule` resource in conjunction with `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources or with an `aws.ec2.SecurityGroup` resource that has in-line rules. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   * 
   * &gt; **NOTE:** Setting `protocol = &#34;all&#34;` or `protocol = -1` with `fromPort` and `toPort` will result in the EC2 API creating a security group rule with all ports open. This API behavior cannot be controlled by this provider and may generate warnings in the future.
   * 
   * &gt; **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
   */
  def SecurityGroupRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecurityGroupRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.SecurityGroupRuleArgs.builder
    com.pulumi.aws.ec2.SecurityGroupRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage whether serial console access is enabled for your AWS account in the current AWS region.
   * 
   * &gt; **NOTE:** Removing this resource disables serial console access.
   */
  def SerialConsoleAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SerialConsoleAccessArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.SerialConsoleAccessArgs.builder
    com.pulumi.aws.ec2.SerialConsoleAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Adds permission to create volumes off of a given EBS Snapshot. */
  def SnapshotCreateVolumePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs.builder
    com.pulumi.aws.ec2.SnapshotCreateVolumePermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * &gt; **Note:** There is only a single subscription allowed per account.
   * 
   * To help you understand the charges for your Spot instances, Amazon EC2 provides a data feed that describes your Spot instance usage and pricing.
   * This data feed is sent to an Amazon S3 bucket that you specify when you subscribe to the data feed.
   */
  def SpotDatafeedSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs.builder
    com.pulumi.aws.ec2.SpotDatafeedSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 Spot Fleet Request resource. This allows a fleet of Spot
   * instances to be requested on the Spot market.
   * 
   * &gt; **NOTE [AWS strongly discourages](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use) the use of the legacy APIs called by this resource.
   * We recommend using the EC2 Fleet or Auto Scaling group resources instead.
   */
  def SpotFleetRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SpotFleetRequestArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.SpotFleetRequest(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an EC2 Spot Instance Request resource. This allows instances to be
   * requested on the spot market.
   * 
   * By default this provider creates Spot Instance Requests with a `persistent` type,
   * which means that for the duration of their lifetime, AWS will launch an
   * instance with the configured details if and when the spot market will accept
   * the requested price.
   * 
   * On destruction, this provider will make an attempt to terminate the associated Spot
   * Instance if there is one present.
   * 
   * Spot Instances requests with a `one-time` type will close the spot request
   * when the instance is terminated either by the request being below the current spot
   * price availability or by a user.
   * 
   * &gt; **NOTE:** Because their behavior depends on the live status of the spot
   * market, Spot Instance Requests have a unique lifecycle that makes them behave
   * differently than other Terraform resources. Most importantly: there is **no
   * guarantee** that a Spot Instance exists to fulfill the request at any given
   * point in time. See the [AWS Spot Instance
   * documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
   * for more information.
   * 
   * &gt; **NOTE [AWS strongly discourages](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use) the use of the legacy APIs called by this resource.
   * We recommend using the EC2 Instance resource with `instanceMarketOptions` instead.
   */
  def SpotInstanceRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SpotInstanceRequestArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.SpotInstanceRequest(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an VPC subnet resource.
   * 
   * &gt; **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), subnets associated with Lambda Functions can take up to 45 minutes to successfully delete. To allow for successful deletion, the provider will wait for at least 45 minutes even if a shorter delete timeout is specified.
   * 
   * &gt; **NOTE:** When AWS GuardDuty is enabled in your account, it automatically creates VPC endpoints in your VPCs to monitor network traffic. During subnet deletion, the provider automatically detects and dissociates the subnet from these GuardDuty-managed VPC endpoints if they are blocking the deletion, preserving GuardDuty protection for other subnets in the VPC. This cleanup only targets resources tagged with `GuardDutyManaged=true` and happens automatically during destroy operations with no manual intervention required. For optimal functionality, the IAM role used by Terraform should have the optional permissions listed below. If these permissions are not available, the provider will continue with the deletion attempt and surface warnings only if the deletion ultimately fails.
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SubnetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SubnetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.Subnet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a subnet CIDR reservation resource. */
  def SubnetCidrReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.SubnetCidrReservationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.SubnetCidrReservationArgs.builder
    com.pulumi.aws.ec2.SubnetCidrReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an individual EC2 resource tag. This resource should only be used in cases where EC2 resources are created outside the provider (e.g. AMIs), being shared via Resource Access Manager (RAM), or implicitly created by other means (e.g. Transit Gateway VPN Attachments).
   * 
   * &gt; **NOTE:** This tagging resource should not be combined with the providers resource for managing the parent resource. For example, using `aws.ec2.Vpc` and `aws.ec2.Tag` to manage tags of the same VPC will cause a perpetual difference where the `aws.ec2.Vpc` resource will try to remove the tag being added by the `aws.ec2.Tag` resource.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.TagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.TagArgs.builder
    com.pulumi.aws.ec2.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an Traffic mirror filter.\
   * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorFilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.TrafficMirrorFilterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.TrafficMirrorFilter(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an Traffic mirror filter rule.\
   * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorFilterRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.builder
    com.pulumi.aws.ec2.TrafficMirrorFilterRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an Traffic mirror session.\
   * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorSession(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorSessionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.TrafficMirrorSessionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.TrafficMirrorSession(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Traffic mirror target.\
   * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.TrafficMirrorTargetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.TrafficMirrorTarget(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an AWS EBS Volume Attachment as a top level resource, to attach and
   * detach volumes from AWS Instances.
   * 
   * &gt; **NOTE on EBS block devices:** If you use `ebsBlockDevice` on an `aws.ec2.Instance`, this provider will assume management over the full set of non-root EBS block devices for the instance, and treats additional block devices as drift. For this reason, `ebsBlockDevice` cannot be mixed with external `aws.ebs.Volume` + `aws.ec2.VolumeAttachment` resources for a given instance.
   */
  def VolumeAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VolumeAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VolumeAttachmentArgs.builder
    com.pulumi.aws.ec2.VolumeAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a VPC resource.
   * 
   * &gt; **NOTE:** When AWS GuardDuty is enabled in your account, it automatically creates VPC endpoints and security groups in your VPCs to monitor network traffic. During VPC deletion, the provider automatically detects and removes these GuardDuty-managed VPC endpoints and security groups if they are blocking the deletion. This cleanup only targets resources tagged with `GuardDutyManaged=true` and happens automatically during destroy operations with no manual intervention required. For optimal functionality, the IAM role used by Terraform should have the optional permissions listed below. If these permissions are not available, the provider will continue with the deletion attempt and surface warnings only if the deletion ultimately fails.
   */
  def Vpc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.Vpc(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS EC2 VPC Block Public Access Exclusion. */
  def VpcBlockPublicAccessExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcBlockPublicAccessExclusion(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS VPC Block Public Access Options. */
  def VpcBlockPublicAccessOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.builder
    com.pulumi.aws.ec2.VpcBlockPublicAccessOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a VPC DHCP Options resource.
   * 
   * You can find more technical documentation about DHCP Options Set in the official [AWS User Guide](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html).
   */
  def VpcDhcpOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcDhcpOptionsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcDhcpOptionsArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcDhcpOptions(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a VPC DHCP Options Association resource. */
  def VpcDhcpOptionsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs.builder
    com.pulumi.aws.ec2.VpcDhcpOptionsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a VPC Encryption Control. */
  def VpcEncryptionControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEncryptionControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcEncryptionControlArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcEncryptionControl(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a VPC Endpoint resource.
   * 
   * &gt; **NOTE on VPC Endpoints and VPC Endpoint Associations:** The provider provides both standalone VPC Endpoint Associations for
   * Route Tables - (an association between a VPC endpoint and a single `routeTableId`),
   * Security Groups - (an association between a VPC endpoint and a single `securityGroupId`),
   * and Subnets - (an association between a VPC endpoint and a single `subnetId`) and
   * a VPC Endpoint resource with `routeTableIds` and `subnetIds` attributes.
   * Do not use the same resource ID in both a VPC Endpoint resource and a VPC Endpoint Association resource.
   * Doing so will cause a conflict of associations and will overwrite the association.
   */
  def VpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcEndpointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcEndpoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to accept a pending VPC Endpoint Connection accept request to VPC Endpoint Service. */
  def VpcEndpointConnectionAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs.builder
    com.pulumi.aws.ec2.VpcEndpointConnectionAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a VPC Endpoint connection notification resource.
   * Connection notifications notify subscribers of VPC Endpoint events.
   */
  def VpcEndpointConnectionNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs.builder
    com.pulumi.aws.ec2.VpcEndpointConnectionNotification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a VPC Endpoint Policy resource. */
  def VpcEndpointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointPolicyArgs.builder
    com.pulumi.aws.ec2.VpcEndpointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a VPC Endpoint Route Table Association */
  def VpcEndpointRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointRouteTableAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointRouteTableAssociationArgs.builder
    com.pulumi.aws.ec2.VpcEndpointRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a VPC Endpoint Service resource.
   * Service consumers can create an _Interface_ VPC Endpoint to connect to the service.
   * 
   * &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
   * both a standalone VPC Endpoint Service Allowed Principal resource
   * and a VPC Endpoint Service resource with an `allowedPrincipals` attribute. Do not use the same principal ARN in both
   * a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
   * and will overwrite the association.
   */
  def VpcEndpointService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcEndpointServiceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcEndpointService(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to allow a principal to discover a VPC endpoint service.
   * 
   * &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
   * both a standalone VPC Endpoint Service Allowed Principal resource
   * and a VPC Endpoint Service resource with an `allowedPrincipals` attribute. Do not use the same principal ARN in both
   * a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
   * and will overwrite the association.
   */
  def VpcEndpointServiceAllowedPrinciple(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs.builder
    com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrinciple(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to create an association between a VPC endpoint and a subnet.
   * 
   * &gt; **NOTE on VPC Endpoints and VPC Endpoint Subnet Associations:** This provider provides
   * both a standalone VPC Endpoint Subnet Association (an association between a VPC endpoint
   * and a single `subnetId`) and a VPC Endpoint resource with a `subnetIds`
   * attribute. Do not use the same subnet ID in both a VPC Endpoint resource and a VPC Endpoint Subnet
   * Association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def VpcEndpointSubnetAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointSubnetAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointSubnetAssociationArgs.builder
    com.pulumi.aws.ec2.VpcEndpointSubnetAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an IPAM resource. */
  def VpcIpam(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcIpam(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Enables the IPAM Service and promotes a delegated administrator. */
  def VpcIpamOrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs.builder
    com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an IP address pool resource for IPAM.
   * 
   * &gt; **NOTE:** When provisioning resource planning IPAM pools, it can take upto 30 minutes for the CIDR to be managed by IPAM.
   */
  def VpcIpamPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamPoolArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcIpamPool(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provisions a CIDR from an IPAM address pool.
   * 
   * &gt; **NOTE:** Provisioning Public IPv4 or Public IPv6 require [steps outside the scope of this resource](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#prepare-for-byoip). The resource accepts `message` and `signature` as part of the `cidrAuthorizationContext` attribute but those must be generated ahead of time. Public IPv6 CIDRs that are provisioned into a Pool with `publiclyAdvertisable = true` and all public IPv4 CIDRs also require creating a Route Origin Authorization (ROA) object in your Regional Internet Registry (RIR).
   * 
   * &gt; **NOTE:** In order to deprovision CIDRs all Allocations must be released. Allocations created by a VPC take up to 30 minutes to be released. However, for IPAM to properly manage the removal of allocation records created by VPCs and other resources, you must [grant it permissions](https://docs.aws.amazon.com/vpc/latest/ipam/choose-single-user-or-orgs-ipam.html) in
   * either a single account or organizationally. If you are unable to deprovision a CIDR after waiting over 30 minutes, you may be missing the Service Linked Role.
   */
  def VpcIpamPoolCidr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.builder
    com.pulumi.aws.ec2.VpcIpamPoolCidr(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Allocates (reserves) a CIDR from an IPAM address pool, preventing usage by IPAM. Only works for private IPv4. */
  def VpcIpamPoolCidrAllocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPoolCidrAllocationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamPoolCidrAllocationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcIpamPoolCidrAllocation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Previews a CIDR from an IPAM address pool. Only works for private IPv4. */
  def VpcIpamPreviewNextCidr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPreviewNextCidrArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamPreviewNextCidrArgs.builder
    com.pulumi.aws.ec2.VpcIpamPreviewNextCidr(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an IPAM Resource Discovery resource. IPAM Resource Discoveries are resources meant for multi-organization customers. If you wish to use a single IPAM across multiple orgs, a resource discovery can be created and shared from a subordinate organization to the management organizations IPAM delegated admin account. For a full deployment example, see `aws.ec2.VpcIpamResourceDiscoveryAssociation` resource. */
  def VpcIpamResourceDiscovery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcIpamResourceDiscovery(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an association between an Amazon IP Address Manager (IPAM) and a IPAM Resource Discovery. IPAM Resource Discoveries are resources meant for multi-organization customers. If you wish to use a single IPAM across multiple orgs, a resource discovery can be created and shared from a subordinate organization to the management organizations IPAM delegated admin account.
   * 
   * Once an association is created between two organizations via IPAM &amp; a IPAM Resource Discovery, IPAM Pools can be shared via Resource Access Manager (RAM) to accounts in the subordinate organization; these RAM shares must be accepted by the end user account. Pools can then also discover and monitor IPAM resources in the subordinate organization.
   */
  def VpcIpamResourceDiscoveryAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamResourceDiscoveryAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamResourceDiscoveryAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcIpamResourceDiscoveryAssociation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates a scope for AWS IPAM. */
  def VpcIpamScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamScopeArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcIpamScope(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to associate additional IPv4 CIDR blocks with a VPC.
   * 
   * When a VPC is created, a primary IPv4 CIDR block for the VPC must be specified.
   * The `aws.ec2.VpcIpv4CidrBlockAssociation` resource allows further IPv4 CIDR blocks to be added to the VPC.
   */
  def VpcIpv4CidrBlockAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociationArgs.builder
    com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to associate additional IPv6 CIDR blocks with a VPC.
   * 
   * The `aws.ec2.VpcIpv6CidrBlockAssociation` resource allows IPv6 CIDR blocks to be added to the VPC.
   */
  def VpcIpv6CidrBlockAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs.builder
    com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to manage an Infrastructure Performance subscription. */
  def VpcNetworkPerformanceMetricSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcNetworkPerformanceMetricSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcNetworkPerformanceMetricSubscriptionArgs.builder
    com.pulumi.aws.ec2.VpcNetworkPerformanceMetricSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage a VPC peering connection.
   * 
   * &gt; **Note:** Modifying the VPC Peering Connection options requires peering to be active. An automatic activation
   * can be done using the `autoAccept` attribute. Alternatively, the VPC Peering
   * Connection has to be made active manually using other means. See notes below for
   * more information.
   * 
   * &gt; **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
   * both a standalone VPC Peering Connection Options and a VPC Peering Connection
   * resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
   * connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
   * Doing so will cause a conflict of options and will overwrite the options.
   * Using a VPC Peering Connection Options resource decouples management of the connection options from
   * management of the VPC Peering Connection and allows options to be set correctly in cross-account scenarios.
   * 
   * &gt; **Note:** For cross-account (requester&#39;s AWS account differs from the accepter&#39;s AWS account) or inter-region
   * VPC Peering Connections use the `aws.ec2.VpcPeeringConnection` resource to manage the requester&#39;s side of the
   * connection and use the `aws.ec2.VpcPeeringConnectionAccepter` resource to manage the accepter&#39;s side of the connection.
   * 
   * &gt; **Note:** Creating multiple `aws.ec2.VpcPeeringConnection` resources with the same `peerVpcId` and `vpcId` will not produce an error. Instead, AWS will return the connection `id` that already exists, resulting in multiple `aws.ec2.VpcPeeringConnection` resources with the same `id`.
   */
  def VpcPeeringConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcPeeringConnectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcPeeringConnection(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage the accepter&#39;s side of a VPC Peering Connection.
   * 
   * When a cross-account (requester&#39;s AWS account differs from the accepter&#39;s AWS account) or an inter-region
   * VPC Peering Connection is created, a VPC Peering Connection resource is automatically created in the
   * accepter&#39;s account.
   * The requester can use the `aws.ec2.VpcPeeringConnection` resource to manage its side of the connection
   * and the accepter can use the `aws.ec2.VpcPeeringConnectionAccepter` resource to &#34;adopt&#34; its side of the
   * connection into management.
   * 
   * &gt; **Note:** AWS allows a cross-account VPC Peering Connection to be deleted from either the requester&#39;s or accepter&#39;s side. However, this provider only allows the VPC Peering Connection to be deleted from the requester&#39;s side by removing the corresponding `aws.ec2.VpcPeeringConnection` resource from your configuration. Removing a `aws.ec2.VpcPeeringConnectionAccepter` resource from your configuration will remove it from your statefile and management, **but will not destroy the VPC Peering Connection.**
   */
  def VpcPeeringConnectionAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpcPeeringConnectionAccepter(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an exclusive set of AWS VPC Security Group Rules.
   * 
   * This resource manages the complete set of ingress and egress rules assigned to a security group. It provides exclusive control by removing any rules not explicitly defined in the configuration.
   * 
   * &gt; This resource takes exclusive ownership over ingress and egress rules assigned to a security group. This includes removal of rules which are not explicitly configured. To prevent persistent drift, ensure any `aws.vpc.SecurityGroupIngressRule` and `aws.vpc.SecurityGroupEgressRule` resources managed alongside this resource are included in the `ingressRuleIds` and `egressRuleIds` arguments.
   * 
   * &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured security group rules. It **will not** revoke the configured rules from the security group.
   * 
   * &gt; When this resource detects a configured rule ID which must be created, a warning diagnostic is emitted. This is due to a limitation in the [`AuthorizeSecurityGroupEgress`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AuthorizeSecurityGroupEgress.html) and [`AuthorizeSecurityGroupIngress`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AuthorizeSecurityGroupIngress.html) APIs, which require the full rule definition to be provided rather than a reference to an existing rule ID.
   */
  def VpcSecurityGroupRulesExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcSecurityGroupRulesExclusiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpcSecurityGroupRulesExclusiveArgs.builder
    com.pulumi.aws.ec2.VpcSecurityGroupRulesExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to create a VPN Concentrator that aggregates multiple VPN connections to a transit gateway. */
  def VpnConcentrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnConcentratorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpnConcentratorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpnConcentrator(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Site-to-Site VPN connection. A Site-to-Site VPN connection is an IP security (IPsec) VPN connection between a VPC and an on-premises network.
   * Any new Site-to-Site VPN connection that you create is an [AWS VPN connection](https://docs.aws.amazon.com/vpn/latest/s2svpn/vpn-categories.html).
   * 
   * &gt; **Note:** The CIDR blocks in the arguments `tunnel1InsideCidr` and `tunnel2InsideCidr` must have a prefix of /30 and be a part of a specific range.
   * [Read more about this in the AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpnTunnelOptionsSpecification.html).
   */
  def VpnConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpnConnectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpnConnection(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a static route between a VPN connection and a customer gateway. */
  def VpnConnectionRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnConnectionRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpnConnectionRouteArgs.builder
    com.pulumi.aws.ec2.VpnConnectionRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to create a VPC VPN Gateway. */
  def VpnGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpnGatewayArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ec2.VpnGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a Virtual Private Gateway attachment resource, allowing for an existing
   * hardware VPN gateway to be attached and/or detached from a VPC.
   * 
   * &gt; **Note:** The `aws.ec2.VpnGateway`
   * resource can also automatically attach the Virtual Private Gateway it creates
   * to an existing VPC by setting the `vpcId` attribute accordingly.
   */
  def VpnGatewayAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnGatewayAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpnGatewayAttachmentArgs.builder
    com.pulumi.aws.ec2.VpnGatewayAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Requests automatic route propagation between a VPN gateway and a route table.
   * 
   * &gt; **Note:** This resource should not be used with a route table that has
   * the `propagatingVgws` argument set. If that argument is set, any route
   * propagation not explicitly listed in its value will be removed.
   */
  def VpnGatewayRoutePropagation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs.builder
    com.pulumi.aws.ec2.VpnGatewayRoutePropagation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
