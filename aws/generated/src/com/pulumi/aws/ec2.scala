package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ec2:
  /** Provides a static route between a VPN connection and a customer gateway. */
  def VpnConnectionRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnConnectionRouteArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpnConnectionRouteArgs.builder
    
    com.pulumi.aws.ec2.VpnConnectionRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to create a VPC Internet Gateway. */
  def InternetGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.InternetGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.InternetGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.InternetGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.SecurityGroupArgs.Builder)
    /**
     * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.SecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.SecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to associate additional IPv6 CIDR blocks with a VPC.
   *  
   *  The `aws.ec2.VpcIpv6CidrBlockAssociation` resource allows IPv6 CIDR blocks to be added to the VPC.
   */
  def VpcIpv6CidrBlockAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs.builder
    
    com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.CapacityBlockReservationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.CapacityBlockReservationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.AmiArgs.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     *  attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     *  should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage a [default subnet](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html#default-vpc-basics) in the current region.
   *  
   *  **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   *  
   *  The `aws.ec2.DefaultSubnet` resource behaves differently from normal resources in that if a default subnet exists in the specified Availability Zone, this provider does not _create_ this resource, but instead &#34;adopts&#34; it into management.
   *  If no default subnet exists, this provider creates a new default subnet.
   *  By default, `pulumi destroy` does not delete the default subnet but does remove the resource from the state.
   *  Set the `forceDestroy` argument to `true` to delete the default subnet.
   */
  def DefaultSubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultSubnetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultSubnetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DefaultSubnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage EC2 Fleets. */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.FleetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.FleetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.Fleet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Traffic mirror target.\
   *  Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.TrafficMirrorTargetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.TrafficMirrorTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an EC2 Capacity Reservation. This allows you to reserve capacity for your Amazon EC2 instances in a specific Availability Zone for any duration. */
  def CapacityReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.CapacityReservationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CapacityReservationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.CapacityReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder)
    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters at the destination. If you specify this parameter, you can&#39;t specify `destinationIp`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    def filterAtDestination(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.builder
      builder.filterAtDestination(args(argsBuilder).build)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the source. If you specify this parameter, you can&#39;t specify `sourceIp` or `destinationPort`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    def filterAtSource(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.builder
      builder.filterAtSource(args(argsBuilder).build)

  /**
   * Provides a VPC Endpoint resource.
   *  
   *  &gt; **NOTE on VPC Endpoints and VPC Endpoint Associations:** The provider provides both standalone VPC Endpoint Associations for
   *  Route Tables - (an association between a VPC endpoint and a single `routeTableId`),
   *  Security Groups - (an association between a VPC endpoint and a single `securityGroupId`),
   *  and Subnets - (an association between a VPC endpoint and a single `subnetId`) and
   *  a VPC Endpoint resource with `routeTableIds` and `subnetIds` attributes.
   *  Do not use the same resource ID in both a VPC Endpoint resource and a VPC Endpoint Association resource.
   *  Doing so will cause a conflict of associations and will overwrite the association.
   */
  def VpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcEndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.FlowLogArgs.Builder)
    /**
     * @param destinationOptions Describes the destination options for a flow log. More details below.
     * @return builder
     */
    def destinationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.FlowLogArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.builder
      builder.destinationOptions(args(argsBuilder).build)

  /**
   * Provides a security group rule resource. Represents a single `ingress` or `egress` group rule, which can be added to external Security Groups.
   *  
   *  &gt; **NOTE:** Avoid using the `aws.ec2.SecurityGroupRule` resource, as it struggles with managing multiple CIDR blocks, and, due to the historical lack of unique IDs, tags and descriptions. To avoid these problems, use the current best practice of the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources with one CIDR block per rule.
   *  
   *  !&gt; **WARNING:** You should not use the `aws.ec2.SecurityGroupRule` resource in conjunction with `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources or with an `aws.ec2.SecurityGroup` resource that has in-line rules. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   *  
   *  &gt; **NOTE:** Setting `protocol = &#34;all&#34;` or `protocol = -1` with `fromPort` and `toPort` will result in the EC2 API creating a security group rule with all ports open. This API behavior cannot be controlled by this provider and may generate warnings in the future.
   *  
   *  &gt; **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
   */
  def SecurityGroupRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecurityGroupRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.SecurityGroupRuleArgs.builder
    
    com.pulumi.aws.ec2.SecurityGroupRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Carrier Gateway. See the AWS [documentation](https://docs.aws.amazon.com/vpc/latest/userguide/Carrier_Gateway.html) for more information. */
  def CarrierGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.CarrierGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CarrierGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.CarrierGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network.
   *  Any new Site-to-Site VPN connection that you create is an [AWS VPN connection](https://docs.aws.amazon.com/vpn/latest/s2svpn/vpn-categories.html).
   *  
   *  &gt; **Note:** The CIDR blocks in the arguments `tunnel1InsideCidr` and `tunnel2InsideCidr` must have a prefix of /30 and be a part of a specific range.
   *  [Read more about this in the AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpnTunnelOptionsSpecification.html).
   */
  def VpnConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpnConnectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpnConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Traffic mirror filter.\
   *  Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorFilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.TrafficMirrorFilterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.TrafficMirrorFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides EC2 allowed images settings for an AWS account. This feature allows you to control which AMIs can be used to launch EC2 instances in your account based on specified criteria.
   *  
   *  For more information about the image criteria that can be set, see the [AWS documentation on Allowed AMIs JSON configuration](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-allowed-amis.html#allowed-amis-json-configuration).
   *  
   *  &gt; **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.
   *  
   *  &gt; **NOTE:** There is only one allowed images settings configuration per AWS account and region. Creating this resource will configure the account-level settings.
   */
  def AllowedImagesSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.AllowedImagesSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.AllowedImagesSettingsArgs.builder
    
    com.pulumi.aws.ec2.AllowedImagesSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an IPAM resource. */
  def VpcIpam(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcIpam(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcIpamPoolArgs.Builder)
    /**
     * @param sourceResource Resource to use to use to configure a resource planning IPAM Pool. If configured, the `locale` of the parent pool must match the region that the vpc resides in.
     * @return builder
     */
    def sourceResource(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.Builder]):
        com.pulumi.aws.ec2.VpcIpamPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.builder
      builder.sourceResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.ManagedPrefixListArgs.Builder)
    /**
     * @param entries Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.Builder]*):
        com.pulumi.aws.ec2.ManagedPrefixListArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  /**
   * The &#34;AMI copy&#34; resource allows duplication of an Amazon Machine Image (AMI),
   *  including cross-region copies.
   *  
   *  If the source AMI has associated EBS snapshots, those will also be duplicated
   *  along with the AMI.
   *  
   *  This is useful for taking a single AMI provisioned in one region and making
   *  it available in another for a multi-region deployment.
   *  
   *  Copying an AMI can take several minutes. The creation of this resource will
   *  block until the new AMI is available for use on new instances.
   */
  def AmiCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiCopyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.AmiCopyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.AmiCopy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.AllowedImagesSettingsArgs.Builder)
    /**
     * @param imageCriterions List of image criteria. Maximum of 10 criterion blocks allowed. See `imageCriterion` below.
     * @return builder
     */
    def imageCriterions(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder]*):
        com.pulumi.aws.ec2.AllowedImagesSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.builder
      builder.imageCriterions(args.map(_(argsBuilder).build)*)

  /**
   * Provides an AWS EBS Volume Attachment as a top level resource, to attach and
   *  detach volumes from AWS Instances.
   *  
   *  &gt; **NOTE on EBS block devices:** If you use `ebsBlockDevice` on an `aws.ec2.Instance`, this provider will assume management over the full set of non-root EBS block devices for the instance, and treats additional block devices as drift. For this reason, `ebsBlockDevice` cannot be mixed with external `aws.ebs.Volume` + `aws.ec2.VolumeAttachment` resources for a given instance.
   */
  def VolumeAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VolumeAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VolumeAttachmentArgs.builder
    
    com.pulumi.aws.ec2.VolumeAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder)
    /**
     * @param launchSpecifications Used to define the launch configuration of the
     *  spot-fleet request. Can be specified multiple times to define different bids
     *  across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     *  
     *  **Note**: This takes in similar but not
     *  identical inputs as `aws.ec2.Instance`.  There are limitations on
     *  what you can specify. See the list of officially supported inputs in the
     *  [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     *  a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     * @return builder
     */
    def launchSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.builder
      builder.launchSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     * @return builder
     */
    def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param spotMaintenanceStrategies Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * @return builder
     */
    def spotMaintenanceStrategies(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder]):
        com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.builder
      builder.spotMaintenanceStrategies(args(argsBuilder).build)

  /** Provides a VPC DHCP Options Association resource. */
  def VpcDhcpOptionsAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs.builder
    
    com.pulumi.aws.ec2.VpcDhcpOptionsAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.SecondarySubnetArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.SecondarySubnetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Creates a scope for AWS IPAM. */
  def VpcIpamScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamScopeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcIpamScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder)
    /**
     * @param egress Configuration block for an egress rule. Detailed below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for an ingress rule. Detailed below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  /** Provides a VPC resource. */
  def Vpc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.Vpc(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.VpnConnectionArgs.Builder)
    /**
     * @param tunnel1LogOptions Options for logging VPN tunnel activity. See Log Options below for more details.
     * @return builder
     */
    def tunnel1LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.VpnConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.builder
      builder.tunnel1LogOptions(args(argsBuilder).build)

    /**
     * @param tunnel2LogOptions Options for logging VPN tunnel activity. See Log Options below for more details.
     * @return builder
     */
    def tunnel2LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.VpnConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.builder
      builder.tunnel2LogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.NatGatewayArgs.Builder)
    /**
     * @param availabilityZoneAddresses Repeatable configuration block for the Elastic IP addresses (EIPs) and availability zones for the regional NAT gateway. When not specified, the regional NAT gateway will automatically expand to new AZs and associate EIPs upon detection of an elastic network interface (auto mode). When specified, auto-expansion is disabled (manual mode). See `availabilityZoneAddress` below for details.
     * @return builder
     */
    def availabilityZoneAddresses(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.Builder]*):
        com.pulumi.aws.ec2.NatGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.builder
      builder.availabilityZoneAddresses(args.map(_(argsBuilder).build)*)

  /**
   * Provides an IP address pool resource for IPAM.
   *  
   *  &gt; **NOTE:** When provisioning resource planning IPAM pools, it can take upto 30 minutes for the CIDR to be managed by IPAM.
   */
  def VpcIpamPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamPoolArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcIpamPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Use the `awsPrefixListEntry` resource to manage a managed prefix list entry.
   *  
   *  &gt; **NOTE:** Pulumi currently provides two resources for managing Managed Prefix Lists and Managed Prefix List Entries. The standalone resource, Managed Prefix List Entry, is used to manage a single entry. The Managed Prefix List resource is used to manage multiple entries defined in-line. It is important to note that you cannot use a Managed Prefix List with in-line rules in conjunction with any Managed Prefix List Entry resources. This will result in a conflict of entries and will cause the entries to be overwritten.
   *  
   *  &gt; **NOTE:** To improve execution times on larger updates, it is recommended to use the inline `entry` block as part of the Managed Prefix List resource when creating a prefix list with more than 100 entries. You can find more information about the resource here.
   */
  def ManagedPrefixListEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.ManagedPrefixListEntryArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.ManagedPrefixListEntryArgs.builder
    
    com.pulumi.aws.ec2.ManagedPrefixListEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.InstanceArgs.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceMarketOptions Describes the market (purchasing) option for the instances. See Market Options below for details on attributes.
     * @return builder
     */
    def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryNetworkInterface The primary network interface. See Primary Network Interface below.
     * @return builder
     */
    def primaryNetworkInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.builder
      builder.primaryNetworkInterface(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  /**
   * Provides a security group resource.
   *  
   *  &gt; **NOTE:** Avoid using the `ingress` and `egress` arguments of the `aws.ec2.SecurityGroup` resource to configure in-line rules, as they struggle with managing multiple CIDR blocks, and, due to the historical lack of unique IDs, tags and descriptions. To avoid these problems, use the current best practice of the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources with one CIDR block per rule.
   *  
   *  !&gt; **WARNING:** You should not use the `aws.ec2.SecurityGroup` resource with _in-line rules_ (using the `ingress` and `egress` arguments of `aws.ec2.SecurityGroup`) in conjunction with the `aws.vpc.SecurityGroupEgressRule` and `aws.vpc.SecurityGroupIngressRule` resources or the `aws.ec2.SecurityGroupRule` resource. Doing so may cause rule conflicts, perpetual differences, and result in rules being overwritten.
   *  
   *  &gt; **NOTE:** Referencing Security Groups across VPC peering has certain restrictions. More information is available in the [VPC Peering User Guide](https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-security-groups.html).
   *  
   *  &gt; **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), security groups associated with Lambda Functions can take up to 45 minutes to successfully delete. To allow for successful deletion, the provider will wait for at least 45 minutes even if a shorter delete timeout is specified.
   *  
   *  &gt; **NOTE:** The `cidrBlocks` and `ipv6CidrBlocks` parameters are optional in the `ingress` and `egress` blocks. If nothing is specified, traffic will be blocked as described in _NOTE on Egress rules_ later.
   */
  def SecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecurityGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SecurityGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.SecurityGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder)
    /**
     * @param accepter An optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts the peering connection (a maximum of one).
     * @return builder
     */
    def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.Builder]):
        com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester A optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests the peering connection (a maximum of one).
     * @return builder
     */
    def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.Builder]):
        com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  /**
   * Provides a resource to create a new launch configuration, used for autoscaling groups.
   *  
   *  !&gt; **WARNING:** The use of launch configurations is discouraged in favor of launch templates. Read more in the [AWS EC2 Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html).
   *  
   *  &gt; **Note** When using `aws.ec2.LaunchConfiguration` with `aws.autoscaling.Group`, it is recommended to use the `namePrefix` (Optional) instead of the `name` (Optional) attribute.
   */
  def LaunchConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LaunchConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ec2.LaunchConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an individual EC2 resource tag. This resource should only be used in cases where EC2 resources are created outside the provider (e.g. AMIs), being shared via Resource Access Manager (RAM), or implicitly created by other means (e.g. Transit Gateway VPN Attachments).
   *  
   *  &gt; **NOTE:** This tagging resource should not be combined with the providers resource for managing the parent resource. For example, using `aws.ec2.Vpc` and `aws.ec2.Tag` to manage tags of the same VPC will cause a perpetual difference where the `aws.ec2.Vpc` resource will try to remove the tag being added by the `aws.ec2.Tag` resource.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.TagArgs.builder
    
    com.pulumi.aws.ec2.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.RouteTableArgs.Builder)
    /**
     * @param routes A list of route objects. Their keys are documented below.
     *  This means that omitting this argument is interpreted as ignoring any existing routes. To remove all managed routes an empty list should be specified. See the example above.
     *  
     *  &gt; **NOTE on Route Tables and Routes:** This provider currently provides both a standalone Route resource (`aws.ec2.Route`) and a Route Table resource with routes defined in-line (`aws.ec2.RouteTable`). At this time you cannot use a `aws.ec2.RouteTable` inline `route` blocks in conjunction with any `aws.ec2.Route` resources. Doing so will cause a conflict of rule settings and will overwrite rules.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.RouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder)
    /**
     * @param accepter A configuration block that describes [VPC Peering Connection]
     *  (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * @return builder
     */
    def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester A configuration block that describes [VPC Peering Connection]
     *  (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * @return builder
     */
    def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource for managing an AWS VPC NAT Gateway EIP Association.
   *  
   *  !&gt; **WARNING:** You should not use the `aws.ec2.NatGatewayEipAssociation` resource in conjunction with an `aws.ec2.NatGateway` resource that has `secondaryAllocationIds` configured. Doing so may cause perpetual differences, and result in associations being overwritten.
   */
  def NatGatewayEipAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.builder
    
    com.pulumi.aws.ec2.NatGatewayEipAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a customer gateway inside a VPC. These objects can be connected to VPN gateways via VPN connections, and allow you to establish tunnels between your network and the VPC. */
  def CustomerGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.CustomerGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CustomerGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.CustomerGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Ec2Functions = com.pulumi.aws.ec2.Ec2Functions
  object Ec2Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ec2.Ec2Functions.*
  extension (self: Ec2Functions.type)
    /**
     * Use this data source to get the ID of a registered AMI for use in other
     *  resources.
     */
    def getAmi(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetAmiResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmi(args(argsBuilder).build)

    /**
     * Use this data source to get the ID of a registered AMI for use in other
     *  resources.
     */
    def getAmiPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetAmiResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmiPlain(args(argsBuilder).build)

    /** Use this data source to get a list of AMI IDs matching the specified criteria. */
    def getAmiIds(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmiIds(args(argsBuilder).build)

    /** Use this data source to get a list of AMI IDs matching the specified criteria. */
    def getAmiIdsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getAmiIdsPlain(args(argsBuilder).build)

    /** Information about a single EC2 Capacity Block Offering. */
    def getCapacityBlockOffering(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCapacityBlockOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCapacityBlockOffering(args(argsBuilder).build)

    /** Information about a single EC2 Capacity Block Offering. */
    def getCapacityBlockOfferingPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCapacityBlockOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockOfferingPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCapacityBlockOfferingPlain(args(argsBuilder).build)

    /**
     * Provides details about a specific EC2 Customer-Owned IP Pool.
     *  
     *  This data source can prove useful when a module accepts a coip pool id as
     *  an input variable and needs to, for example, determine the CIDR block of that
     *  COIP Pool.
     */
    def getCoipPool(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCoipPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPool(args(argsBuilder).build)

    /**
     * Provides details about a specific EC2 Customer-Owned IP Pool.
     *  
     *  This data source can prove useful when a module accepts a coip pool id as
     *  an input variable and needs to, for example, determine the CIDR block of that
     *  COIP Pool.
     */
    def getCoipPoolPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCoipPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPoolPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Customer-Owned IP Pools, such as their identifiers. */
    def getCoipPools(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCoipPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPools(args(argsBuilder).build)

    /** Provides information for multiple EC2 Customer-Owned IP Pools, such as their identifiers. */
    def getCoipPoolsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCoipPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCoipPoolsPlain(args(argsBuilder).build)

    /** Get an existing AWS Customer Gateway. */
    def getCustomerGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetCustomerGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCustomerGateway(args(argsBuilder).build)

    /** Get an existing AWS Customer Gateway. */
    def getCustomerGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetCustomerGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getCustomerGatewayPlain(args(argsBuilder).build)

    /** Use this data source to get information about an EC2 Dedicated Host. */
    def getDedicatedHost(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getDedicatedHost(args(argsBuilder).build)

    /** Use this data source to get information about an EC2 Dedicated Host. */
    def getDedicatedHostPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetDedicatedHostResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getDedicatedHostPlain(args(argsBuilder).build)

    /** Provides a list of Elastic IPs in a region. */
    def getEips(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetEipsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getEips(args(argsBuilder).build)

    /** Provides a list of Elastic IPs in a region. */
    def getEipsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetEipsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getEipsPlain(args(argsBuilder).build)

    /** `aws.ec2.Eip` provides details about a specific Elastic IP. */
    def getElasticIp(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetElasticIpResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getElasticIp(args(argsBuilder).build)

    /** `aws.ec2.Eip` provides details about a specific Elastic IP. */
    def getElasticIpPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetElasticIpResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getElasticIpPlain(args(argsBuilder).build)

    /** Use this data source to get the ID of an Amazon EC2 Instance for use in other resources. */
    def getInstance(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstance(args(argsBuilder).build)

    /** Use this data source to get the ID of an Amazon EC2 Instance for use in other resources. */
    def getInstancePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstancePlain(args(argsBuilder).build)

    /** Get characteristics for a single EC2 Instance Type. */
    def getInstanceType(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypeResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceType(args(argsBuilder).build)

    /** Get characteristics for a single EC2 Instance Type. */
    def getInstanceTypePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypeResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypePlain(args(argsBuilder).build)

    /** Information about single EC2 Instance Type Offering. */
    def getInstanceTypeOffering(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOffering(args(argsBuilder).build)

    /** Information about single EC2 Instance Type Offering. */
    def getInstanceTypeOfferingPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOfferingPlain(args(argsBuilder).build)

    /** Information about EC2 Instance Type Offerings. */
    def getInstanceTypeOfferings(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOfferings(args(argsBuilder).build)

    /** Information about EC2 Instance Type Offerings. */
    def getInstanceTypeOfferingsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypeOfferingsPlain(args(argsBuilder).build)

    /** Information about EC2 Instance Types. */
    def getInstanceTypes(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypes(args(argsBuilder).build)

    /** Information about EC2 Instance Types. */
    def getInstanceTypesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstanceTypesPlain(args(argsBuilder).build)

    /**
     * Use this data source to get IDs or IPs of Amazon EC2 instances to be referenced elsewhere,
     *  e.g., to allow easier migration from another management solution
     *  or to make it easier for an operator to connect through bastion host(s).
     *  
     *  &gt; **Note:** It&#39;s strongly discouraged to use this data source for querying ephemeral
     *  instances (e.g., managed via autoscaling group), as the output may change at any time
     *  and you&#39;d need to re-run `apply` every time an instance comes up or dies.
     */
    def getInstances(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstances(args(argsBuilder).build)

    /**
     * Use this data source to get IDs or IPs of Amazon EC2 instances to be referenced elsewhere,
     *  e.g., to allow easier migration from another management solution
     *  or to make it easier for an operator to connect through bastion host(s).
     *  
     *  &gt; **Note:** It&#39;s strongly discouraged to use this data source for querying ephemeral
     *  instances (e.g., managed via autoscaling group), as the output may change at any time
     *  and you&#39;d need to re-run `apply` every time an instance comes up or dies.
     */
    def getInstancesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInstancesPlain(args(argsBuilder).build)

    /** `aws.ec2.InternetGateway` provides details about a specific Internet Gateway. */
    def getInternetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetInternetGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInternetGateway(args(argsBuilder).build)

    /** `aws.ec2.InternetGateway` provides details about a specific Internet Gateway. */
    def getInternetGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetInternetGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getInternetGatewayPlain(args(argsBuilder).build)

    /**
     * Previews a CIDR from an IPAM address pool. Only works for private IPv4.
     *  
     *  &gt; **NOTE:** This functionality is also encapsulated in a resource sharing the same name. The data source can be used when you need to use the cidr in a calculation of the same Root module, `count` for example. However, once a cidr range has been allocated that was previewed, the next refresh will find a **new** cidr and may force new resources downstream. Make sure to use `ignoreChanges` if this is undesirable.
     */
    def getIpamPreviewNextCidr(args: Endofunction[com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetIpamPreviewNextCidrResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getIpamPreviewNextCidr(args(argsBuilder).build)

    /**
     * Previews a CIDR from an IPAM address pool. Only works for private IPv4.
     *  
     *  &gt; **NOTE:** This functionality is also encapsulated in a resource sharing the same name. The data source can be used when you need to use the cidr in a calculation of the same Root module, `count` for example. However, once a cidr range has been allocated that was previewed, the next refresh will find a **new** cidr and may force new resources downstream. Make sure to use `ignoreChanges` if this is undesirable.
     */
    def getIpamPreviewNextCidrPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetIpamPreviewNextCidrResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getIpamPreviewNextCidrPlain(args(argsBuilder).build)

    /** Use this data source to get information about a specific EC2 Key Pair. */
    def getKeyPair(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetKeyPairResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getKeyPair(args(argsBuilder).build)

    /** Use this data source to get information about a specific EC2 Key Pair. */
    def getKeyPairPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetKeyPairResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getKeyPairPlain(args(argsBuilder).build)

    /** Provides information about a Launch Configuration. */
    def getLaunchConfiguration(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLaunchConfigurationResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchConfigurationArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchConfiguration(args(argsBuilder).build)

    /** Provides information about a Launch Configuration. */
    def getLaunchConfigurationPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLaunchConfigurationResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchConfigurationPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchConfigurationPlain(args(argsBuilder).build)

    /** Provides information about a Launch Template. */
    def getLaunchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLaunchTemplateResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchTemplate(args(argsBuilder).build)

    /** Provides information about a Launch Template. */
    def getLaunchTemplatePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLaunchTemplateResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplatePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLaunchTemplatePlain(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway. */
    def getLocalGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGateway(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway. */
    def getLocalGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayPlain(args(argsBuilder).build)

    /**
     * Provides details about an EC2 Local Gateway Route Table.
     *  
     *  This data source can prove useful when a module accepts a local gateway route table id as
     *  an input variable and needs to, for example, find the associated Outpost or Local Gateway.
     */
    def getLocalGatewayRouteTable(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTable(args(argsBuilder).build)

    /**
     * Provides details about an EC2 Local Gateway Route Table.
     *  
     *  This data source can prove useful when a module accepts a local gateway route table id as
     *  an input variable and needs to, for example, find the associated Outpost or Local Gateway.
     */
    def getLocalGatewayRouteTablePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTablePlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers. */
    def getLocalGatewayRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTables(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers. */
    def getLocalGatewayRouteTablesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayRouteTablesPlain(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    def getLocalGatewayVirtualInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterface(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    def getLocalGatewayVirtualInterfacePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfacePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfacePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfacePlain(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface Group. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    def getLocalGatewayVirtualInterfaceGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroup(args(argsBuilder).build)

    /** Provides details about an EC2 Local Gateway Virtual Interface Group. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    def getLocalGatewayVirtualInterfaceGroupPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroupPlain(args(argsBuilder).build)

    /** Provides details about multiple EC2 Local Gateway Virtual Interface Groups, such as identifiers. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    def getLocalGatewayVirtualInterfaceGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroups(args(argsBuilder).build)

    /** Provides details about multiple EC2 Local Gateway Virtual Interface Groups, such as identifiers. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
    def getLocalGatewayVirtualInterfaceGroupsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewayVirtualInterfaceGroupsPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateways, such as their identifiers. */
    def getLocalGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetLocalGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGateways(args(argsBuilder).build)

    /** Provides information for multiple EC2 Local Gateways, such as their identifiers. */
    def getLocalGatewaysPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetLocalGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getLocalGatewaysPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.ManagedPrefixList` provides details about a specific AWS prefix list or
     *  customer-managed prefix list in the current region.
     */
    def getManagedPrefixList(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetManagedPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixList(args(argsBuilder).build)

    /**
     * `aws.ec2.ManagedPrefixList` provides details about a specific AWS prefix list or
     *  customer-managed prefix list in the current region.
     */
    def getManagedPrefixListPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetManagedPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixListPlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of managed prefix list ids to be referenced elsewhere. */
    def getManagedPrefixLists(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetManagedPrefixListsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixLists(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of managed prefix list ids to be referenced elsewhere. */
    def getManagedPrefixListsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetManagedPrefixListsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getManagedPrefixListsPlain(args(argsBuilder).build)

    /** Provides details about a specific VPC NAT Gateway. */
    def getNatGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGateway(args(argsBuilder).build)

    /** Provides details about a specific VPC NAT Gateway. */
    def getNatGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNatGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGatewayPlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of NAT gateway ids to be referenced elsewhere. */
    def getNatGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNatGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGateways(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of NAT gateway ids to be referenced elsewhere. */
    def getNatGatewaysPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNatGatewaysResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNatGatewaysPlain(args(argsBuilder).build)

    /**
     * 
     */
    def getNetworkAcls(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkAclsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkAcls(args(argsBuilder).build)

    /**
     * 
     */
    def getNetworkAclsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkAclsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkAclsPlain(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsAnalysis` provides details about a specific Network Insights Analysis. */
    def getNetworkInsightsAnalysis(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInsightsAnalysisResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsAnalysis(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsAnalysis` provides details about a specific Network Insights Analysis. */
    def getNetworkInsightsAnalysisPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInsightsAnalysisResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsAnalysisPlain(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsPath` provides details about a specific Network Insights Path. */
    def getNetworkInsightsPath(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInsightsPathResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsPath(args(argsBuilder).build)

    /** `aws.ec2.NetworkInsightsPath` provides details about a specific Network Insights Path. */
    def getNetworkInsightsPathPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInsightsPathResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInsightsPathPlain(args(argsBuilder).build)

    /** Use this data source to get information about a Network Interface. */
    def getNetworkInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterface(args(argsBuilder).build)

    /** Use this data source to get information about a Network Interface. */
    def getNetworkInterfacePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInterfaceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterfacePlain(args(argsBuilder).build)

    /**
     * 
     */
    def getNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetNetworkInterfacesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterfaces(args(argsBuilder).build)

    /**
     * 
     */
    def getNetworkInterfacesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetNetworkInterfacesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getNetworkInterfacesPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.getPrefixList` provides details about a specific AWS prefix list (PL)
     *  in the current region.
     *  
     *  This can be used both to validate a prefix list given in a variable
     *  and to obtain the CIDR blocks (IP address ranges) for the associated
     *  AWS service. The latter may be useful e.g., for adding network ACL
     *  rules.
     *  
     *  The aws.ec2.ManagedPrefixList data source is normally more appropriate to use given it can return customer-managed prefix list info, as well as additional attributes.
     */
    def getPrefixList(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPrefixList(args(argsBuilder).build)

    /**
     * `aws.ec2.getPrefixList` provides details about a specific AWS prefix list (PL)
     *  in the current region.
     *  
     *  This can be used both to validate a prefix list given in a variable
     *  and to obtain the CIDR blocks (IP address ranges) for the associated
     *  AWS service. The latter may be useful e.g., for adding network ACL
     *  rules.
     *  
     *  The aws.ec2.ManagedPrefixList data source is normally more appropriate to use given it can return customer-managed prefix list info, as well as additional attributes.
     */
    def getPrefixListPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetPrefixListResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPrefixListPlain(args(argsBuilder).build)

    /** Provides details about a specific AWS EC2 Public IPv4 Pool. */
    def getPublicIpv4Pool(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4Pool(args(argsBuilder).build)

    /** Provides details about a specific AWS EC2 Public IPv4 Pool. */
    def getPublicIpv4PoolPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4PoolPlain(args(argsBuilder).build)

    /** Data source for getting information about AWS EC2 Public IPv4 Pools. */
    def getPublicIpv4Pools(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4Pools(args(argsBuilder).build)

    /** Data source for getting information about AWS EC2 Public IPv4 Pools. */
    def getPublicIpv4PoolsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetPublicIpv4PoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getPublicIpv4PoolsPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.Route` provides details about a specific Route.
     *  
     *  This resource can prove useful when finding the resource associated with a CIDR. For example, finding the peering connection associated with a CIDR value.
     */
    def getRoute(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRoute(args(argsBuilder).build)

    /**
     * `aws.ec2.Route` provides details about a specific Route.
     *  
     *  This resource can prove useful when finding the resource associated with a CIDR. For example, finding the peering connection associated with a CIDR value.
     */
    def getRoutePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRoutePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRoutePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRoutePlain(args(argsBuilder).build)

    /**
     * `aws.ec2.RouteTable` provides details about a specific Route Table.
     *  
     *  This resource can prove useful when a module accepts a Subnet ID as an input variable and needs to, for example, add a route in the Route Table.
     */
    def getRouteTable(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTableArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTableArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTable(args(argsBuilder).build)

    /**
     * `aws.ec2.RouteTable` provides details about a specific Route Table.
     *  
     *  This resource can prove useful when a module accepts a Subnet ID as an input variable and needs to, for example, add a route in the Route Table.
     */
    def getRouteTablePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetRouteTableResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTablePlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of route table ids to be referenced elsewhere. */
    def getRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTables(args(argsBuilder).build)

    /** This resource can be useful for getting back a list of route table ids to be referenced elsewhere. */
    def getRouteTablesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getRouteTablesPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.SecurityGroup` provides details about a specific Security Group.
     *  
     *  This resource can prove useful when a module accepts a Security Group id as
     *  an input variable and needs to, for example, determine the id of the
     *  VPC that the security group belongs to.
     */
    def getSecurityGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSecurityGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroup(args(argsBuilder).build)

    /**
     * `aws.ec2.SecurityGroup` provides details about a specific Security Group.
     *  
     *  This resource can prove useful when a module accepts a Security Group id as
     *  an input variable and needs to, for example, determine the id of the
     *  VPC that the security group belongs to.
     */
    def getSecurityGroupPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSecurityGroupResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroupPlain(args(argsBuilder).build)

    /** Use this data source to get IDs and VPC membership of Security Groups that are created outside this provider. */
    def getSecurityGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSecurityGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroups(args(argsBuilder).build)

    /** Use this data source to get IDs and VPC membership of Security Groups that are created outside this provider. */
    def getSecurityGroupsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSecurityGroupsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSecurityGroupsPlain(args(argsBuilder).build)

    /** Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region. */
    def getSerialConsoleAccess(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSerialConsoleAccessResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSerialConsoleAccess(args(argsBuilder).build)

    /** Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region. */
    def getSerialConsoleAccessPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSerialConsoleAccessResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSerialConsoleAccessPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSerialConsoleAccessPlain(args(argsBuilder).build)

    /**
     * &gt; There is only a single spot data feed subscription per account.
     *  
     *  Data source for accessing an AWS EC2 (Elastic Compute Cloud) spot data feed subscription.
     */
    def getSpotDatafeedSubscription(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSpotDatafeedSubscriptionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotDatafeedSubscription(args(argsBuilder).build)

    /**
     * &gt; There is only a single spot data feed subscription per account.
     *  
     *  Data source for accessing an AWS EC2 (Elastic Compute Cloud) spot data feed subscription.
     */
    def getSpotDatafeedSubscriptionPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSpotDatafeedSubscriptionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotDatafeedSubscriptionPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotDatafeedSubscriptionPlain(args(argsBuilder).build)

    /** Information about most recent Spot Price for a given EC2 instance. */
    def getSpotPrice(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSpotPriceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotPrice(args(argsBuilder).build)

    /** Information about most recent Spot Price for a given EC2 instance. */
    def getSpotPricePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPricePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSpotPriceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPricePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSpotPricePlain(args(argsBuilder).build)

    /**
     * `aws.ec2.Subnet` provides details about a specific VPC subnet.
     *  
     *  This resource can prove useful when a module accepts a subnet ID as an input variable and needs to, for example, determine the ID of the VPC that the subnet belongs to.
     */
    def getSubnet(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnet(args(argsBuilder).build)

    /**
     * `aws.ec2.Subnet` provides details about a specific VPC subnet.
     *  
     *  This resource can prove useful when a module accepts a subnet ID as an input variable and needs to, for example, determine the ID of the VPC that the subnet belongs to.
     */
    def getSubnetPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnetPlain(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of subnet IDs. */
    def getSubnets(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetSubnetsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnets(args(argsBuilder).build)

    /** This resource can be useful for getting back a set of subnet IDs. */
    def getSubnetsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetSubnetsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getSubnetsPlain(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers. */
    def getTransitGatewayRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetTransitGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getTransitGatewayRouteTables(args(argsBuilder).build)

    /** Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers. */
    def getTransitGatewayRouteTablesPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetTransitGatewayRouteTablesResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getTransitGatewayRouteTablesPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.Vpc` provides details about a specific VPC.
     *  
     *  This resource can prove useful when a module accepts a vpc id as
     *  an input variable and needs to, for example, determine the CIDR block of that
     *  VPC.
     */
    def getVpc(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpc(args(argsBuilder).build)

    /**
     * `aws.ec2.Vpc` provides details about a specific VPC.
     *  
     *  This resource can prove useful when a module accepts a vpc id as
     *  an input variable and needs to, for example, determine the CIDR block of that
     *  VPC.
     */
    def getVpcPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPlain(args(argsBuilder).build)

    /** Retrieve information about an EC2 DHCP Options configuration. */
    def getVpcDhcpOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcDhcpOptionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcDhcpOptions(args(argsBuilder).build)

    /** Retrieve information about an EC2 DHCP Options configuration. */
    def getVpcDhcpOptionsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcDhcpOptionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcDhcpOptionsPlain(args(argsBuilder).build)

    /**
     * The VPC Endpoint data source provides details about
     *  a specific VPC endpoint.
     */
    def getVpcEndpoint(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpoint(args(argsBuilder).build)

    /**
     * The VPC Endpoint data source provides details about
     *  a specific VPC endpoint.
     */
    def getVpcEndpointPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpointPlain(args(argsBuilder).build)

    /**
     * The VPC Endpoint Service data source details about a specific service that
     *  can be specified when creating a VPC endpoint within the region configured in the provider.
     */
    def getVpcEndpointService(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcEndpointServiceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpointService(args(argsBuilder).build)

    /**
     * The VPC Endpoint Service data source details about a specific service that
     *  can be specified when creating a VPC endpoint within the region configured in the provider.
     */
    def getVpcEndpointServicePlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcEndpointServiceResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServicePlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcEndpointServicePlain(args(argsBuilder).build)

    /** Data source for managing a VPC IPAM. */
    def getVpcIpam(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpam(args(argsBuilder).build)

    /** Data source for managing a VPC IPAM. */
    def getVpcIpamPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
     *  
     *  This resource can prove useful when an ipam pool was created in another root
     *  module and you need the pool&#39;s id as an input variable. For example, pools
     *  can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    def getVpcIpamPool(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPool(args(argsBuilder).build)

    /**
     * `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
     *  
     *  This resource can prove useful when an ipam pool was created in another root
     *  module and you need the pool&#39;s id as an input variable. For example, pools
     *  can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    def getVpcIpamPoolPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPoolCidrs` provides details about an IPAM pool.
     *  
     *  This resource can prove useful when an ipam pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
     */
    def getVpcIpamPoolCidrs(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolCidrsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolCidrs(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPoolCidrs` provides details about an IPAM pool.
     *  
     *  This resource can prove useful when an ipam pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
     */
    def getVpcIpamPoolCidrsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolCidrsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolCidrsPlain(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPools` provides details about IPAM pools.
     *  
     *  This resource can prove useful when IPAM pools are created in another root
     *  module and you need the pool ids as input variables. For example, pools
     *  can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    def getVpcIpamPools(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPools(args(argsBuilder).build)

    /**
     * `aws.ec2.getVpcIpamPools` provides details about IPAM pools.
     *  
     *  This resource can prove useful when IPAM pools are created in another root
     *  module and you need the pool ids as input variables. For example, pools
     *  can be shared via RAM and used to create vpcs with CIDRs from that pool.
     */
    def getVpcIpamPoolsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamPoolsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamPoolsPlain(args(argsBuilder).build)

    /** Data source for managing VPC IPAMs. */
    def getVpcIpams(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcIpamsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpams(args(argsBuilder).build)

    /** Data source for managing VPC IPAMs. */
    def getVpcIpamsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcIpamsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcIpamsPlain(args(argsBuilder).build)

    /**
     * The VPC Peering Connection data source provides details about
     *  a specific VPC peering connection.
     */
    def getVpcPeeringConnection(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnection(args(argsBuilder).build)

    /**
     * The VPC Peering Connection data source provides details about
     *  a specific VPC peering connection.
     */
    def getVpcPeeringConnectionPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnectionPlain(args(argsBuilder).build)

    /**
     * Use this data source to get IDs of Amazon VPC peering connections
     *  To get more details on each connection, use the data resource aws.ec2.VpcPeeringConnection
     *  
     *  Note: To use this data source in a count, the resources should exist before trying to access
     *  the data source.
     */
    def getVpcPeeringConnections(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnections(args(argsBuilder).build)

    /**
     * Use this data source to get IDs of Amazon VPC peering connections
     *  To get more details on each connection, use the data resource aws.ec2.VpcPeeringConnection
     *  
     *  Note: To use this data source in a count, the resources should exist before trying to access
     *  the data source.
     */
    def getVpcPeeringConnectionsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcPeeringConnectionsPlain(args(argsBuilder).build)

    /**
     * This resource can be useful for getting back a list of VPC Ids for a region.
     *  
     *  The following example retrieves a list of VPC Ids with a custom tag of `service` set to a value of &#34;production&#34;.
     */
    def getVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpcsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcs(args(argsBuilder).build)

    /**
     * This resource can be useful for getting back a list of VPC Ids for a region.
     *  
     *  The following example retrieves a list of VPC Ids with a custom tag of `service` set to a value of &#34;production&#34;.
     */
    def getVpcsPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpcsResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpcsPlain(args(argsBuilder).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network. */
    def getVpnConnection(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpnConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnConnection(args(argsBuilder).build)

    /** Fetches details of a Site-to-Site VPN connection. A Site-to-Site VPN connection is an Internet Protocol security (IPsec) VPN connection between a VPC and an on-premises network. */
    def getVpnConnectionPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpnConnectionResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnConnectionPlain(args(argsBuilder).build)

    /**
     * The VPN Gateway data source provides details about
     *  a specific VPN gateway.
     */
    def getVpnGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ec2.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnGateway(args(argsBuilder).build)

    /**
     * The VPN Gateway data source provides details about
     *  a specific VPN gateway.
     */
    def getVpnGatewayPlain(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ec2.outputs.GetVpnGatewayResult] =
      val argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayPlainArgs.builder
      com.pulumi.aws.ec2.Ec2Functions.getVpnGatewayPlain(args(argsBuilder).build)

  /** Provides a VPC DHCP Options resource. */
  def VpcDhcpOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcDhcpOptionsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcDhcpOptionsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcDhcpOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an EC2 Availability Zone Group, such as updating its opt-in status.
   *  
   *  &gt; **NOTE:** This is an advanced resource. The provider will automatically assume management of the EC2 Availability Zone Group without import and perform no actions on removal from configuration.
   */
  def AvailabilityZoneGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.AvailabilityZoneGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.AvailabilityZoneGroupArgs.builder
    
    com.pulumi.aws.ec2.AvailabilityZoneGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Requests automatic route propagation between a VPN gateway and a route table.
   *  
   *  &gt; **Note:** This resource should not be used with a route table that has
   *  the `propagatingVgws` argument set. If that argument is set, any route
   *  propagation not explicitly listed in its value will be removed.
   */
  def VpnGatewayRoutePropagation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs.builder
    
    com.pulumi.aws.ec2.VpnGatewayRoutePropagation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a proxy protocol policy, which allows an ELB to carry a client connection information to a backend. */
  def ProxyProtocolPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.ProxyProtocolPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.ProxyProtocolPolicyArgs.builder
    
    com.pulumi.aws.ec2.ProxyProtocolPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** There is only a single subscription allowed per account.
   *  
   *  To help you understand the charges for your Spot instances, Amazon EC2 provides a data feed that describes your Spot instance usage and pricing.
   *  This data feed is sent to an Amazon S3 bucket that you specify when you subscribe to the data feed.
   */
  def SpotDatafeedSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs.builder
    
    com.pulumi.aws.ec2.SpotDatafeedSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Local Gateway Route Table VPC Association. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html#vpc-associations). */
  def LocalGatewayRouteTableVpcAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS EC2 (Elastic Compute Cloud) VPC Block Public Access Exclusion. */
  def VpcBlockPublicAccessExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcBlockPublicAccessExclusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an network ACL resource. You might set up network ACLs with rules similar
   *  to your security groups in order to add an additional layer of security to your VPC.
   *  
   *  &gt; **NOTE on Network ACLs and Network ACL Rules:** This provider currently
   *  provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
   *  defined in-line. At this time you cannot use a Network ACL with in-line rules
   *  in conjunction with any Network ACL Rule resources. Doing so will cause
   *  a conflict of rule settings and will overwrite rules.
   *  
   *  &gt; **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association
   *  resource and a network ACL resource with a `subnetIds` attribute. Do not use the same subnet ID in both a network ACL
   *  resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def NetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkAclArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkAclArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.NetworkAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Enables the IPAM Service and promotes a delegated administrator. */
  def VpcIpamOrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs.builder
    
    com.pulumi.aws.ec2.VpcIpamOrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create a routing table entry (a route) in a VPC routing table.
   *  
   *  &gt; **NOTE on `gatewayId` attribute:** The AWS API is very forgiving with the resource ID passed in the `gatewayId` attribute. For example an `aws.ec2.Route` resource can be created with an `aws.ec2.NatGateway` or `aws.ec2.EgressOnlyInternetGateway` ID specified for the `gatewayId` attribute. Specifying anything other than an `aws.ec2.InternetGateway` or `aws.ec2.VpnGateway` ID will lead to this provider reporting a permanent diff between your configuration and recorded state, as the AWS API returns the more-specific attribute. If you are experiencing constant diffs with an `aws.ec2.Route` resource, the first thing to check is that the correct attribute is being specified.
   *  
   *  &gt; **NOTE on combining `vpcEndpointId` and `destinationPrefixListId` attributes:** To associate a Gateway VPC Endpoint (such as S3) with destination prefix list, use the `aws.ec2.VpcEndpointRouteTableAssociation` resource instead.
   */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.RouteArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.RouteArgs.builder
    
    com.pulumi.aws.ec2.Route(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to create a VPC Internet Gateway Attachment. */
  def InternetGatewayAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.InternetGatewayAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.InternetGatewayAttachmentArgs.builder
    
    com.pulumi.aws.ec2.InternetGatewayAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a managed prefix list resource.
   *  
   *  &gt; **NOTE on Managed Prefix Lists and Managed Prefix List Entries:** The provider
   *  currently provides both a standalone Managed Prefix List Entry resource (a single entry),
   *  and a Managed Prefix List resource with entries defined in-line. At this time you
   *  cannot use a Managed Prefix List with in-line rules in conjunction with any Managed
   *  Prefix List Entry resources. Doing so will cause a conflict of entries and will overwrite entries.
   *  
   *  &gt; **NOTE on `maxEntries`:** When you reference a Prefix List in a resource,
   *  the maximum number of entries for the prefix lists counts as the same number of rules
   *  or entries for the resource. For example, if you create a prefix list with a maximum
   *  of 20 entries and you reference that prefix list in a security group rule, this counts
   *  as 20 rules for the security group.
   */
  def ManagedPrefixList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.ManagedPrefixListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.ManagedPrefixListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.ManagedPrefixList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages regional EC2 instance metadata default settings.
   *  More information can be found in the [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html) user guide.
   */
  def InstanceMetadataDefaults(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.InstanceMetadataDefaultsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.InstanceMetadataDefaultsArgs.builder
    
    com.pulumi.aws.ec2.InstanceMetadataDefaults(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Traffic mirror filter rule.\
   *  Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorFilterRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.builder
    
    com.pulumi.aws.ec2.TrafficMirrorFilterRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to create a VPN Concentrator that aggregates multiple VPN connections to a transit gateway. */
  def VpnConcentrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnConcentratorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpnConcentratorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpnConcentrator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage the accepter&#39;s side of a VPC Peering Connection.
   *  
   *  When a cross-account (requester&#39;s AWS account differs from the accepter&#39;s AWS account) or an inter-region
   *  VPC Peering Connection is created, a VPC Peering Connection resource is automatically created in the
   *  accepter&#39;s account.
   *  The requester can use the `aws.ec2.VpcPeeringConnection` resource to manage its side of the connection
   *  and the accepter can use the `aws.ec2.VpcPeeringConnectionAccepter` resource to &#34;adopt&#34; its side of the
   *  connection into management.
   */
  def VpcPeeringConnectionAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcPeeringConnectionAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder)
    /**
     * @param accepter An optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     *  the peering connection (a maximum of one).
     * @return builder
     */
    def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester A optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     *  the peering connection (a maximum of one).
     * @return builder
     */
    def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  /** Assigns a static reverse DNS record to an Elastic IP addresses. See [Using reverse DNS for email applications](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html#Using_Elastic_Addressing_Reverse_DNS). */
  def EipDomainName(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.EipDomainNameArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.EipDomainNameArgs.builder
    
    com.pulumi.aws.ec2.EipDomainName(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EC2 Secondary Network resource for RDMA networking.
   *  
   *  Secondary networks are specialized network resources that enable high-performance RDMA (Remote Direct Memory Access) networking for compute-intensive workloads.
   *  They provide dedicated network infrastructure with low latency and high bandwidth capabilities.
   */
  def SecondaryNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecondaryNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SecondaryNetworkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.SecondaryNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.SecondaryNetworkArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.SecondaryNetworkArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides a resource to create an association between a route table and a subnet or a route table and an
   *  internet gateway or virtual private gateway.
   */
  def RouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.RouteTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.RouteTableAssociationArgs.builder
    
    com.pulumi.aws.ec2.RouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EC2 Capacity Block Reservation. This allows you to purchase capacity block for your Amazon EC2 instances in a specific Availability Zone for machine learning (ML) Workloads.
   *  
   *  &gt; **NOTE:** Once created, a reservation is valid for the `duration` of the provided `capacityBlockOfferingId` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [EC2 Capacity Block Reservation Documentation](https://aws.amazon.com/ec2/instance-types/p5/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-blocks-pricing-billing.html).
   *  
   *  &gt; **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
   */
  def CapacityBlockReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.CapacityBlockReservationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.CapacityBlockReservationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.CapacityBlockReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource for managing the main routing table of a VPC.
   *  
   *  &gt; **NOTE:** **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.DefaultRouteTable documentation for more details.
   *  For more information, see the Amazon VPC User Guide on [Route Tables][aws-route-tables]. For information about managing normal route tables in Pulumi, see [`aws.ec2.RouteTable`][tf-route-tables].
   */
  def MainRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.MainRouteTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.MainRouteTableAssociationArgs.builder
    
    com.pulumi.aws.ec2.MainRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a VPC&#39;s default network ACL. This resource can manage the default network ACL of the default or a non-default VPC.
   *  
   *  &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultNetworkAcl` behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to &#34;adopt&#34; it into management.
   *  
   *  Every VPC has a default network ACL that can be managed but not destroyed. When the provider first adopts the Default Network ACL, it **immediately removes all rules in the ACL**. It then proceeds to create any rules specified in the configuration. This step is required so that only the rules specified in the configuration are created.
   *  
   *  This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diffs being shown. For these reasons, this resource is incompatible with the `aws.ec2.NetworkAclRule` resource.
   *  
   *  For more information about Network ACLs, see the AWS Documentation on [Network ACLs][aws-network-acls].
   */
  def DefaultNetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultNetworkAclArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DefaultNetworkAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create a VPC NAT Gateway.
   *  
   *  !&gt; **WARNING:** You should not use the `aws.ec2.NatGateway` resource that has `secondaryAllocationIds` in conjunction with an `aws.ec2.NatGatewayEipAssociation` resource. Doing so may cause perpetual differences, and result in associations being overwritten.
   */
  def NatGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NatGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NatGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.NatGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an association between an Amazon IP Address Manager (IPAM) and a IPAM Resource Discovery. IPAM Resource Discoveries are resources meant for multi-organization customers. If you wish to use a single IPAM across multiple orgs, a resource discovery can be created and shared from a subordinate organization to the management organizations IPAM delegated admin account.
   *  
   *  Once an association is created between two organizations via IPAM &amp; a IPAM Resource Discovery, IPAM Pools can be shared via Resource Access Manager (RAM) to accounts in the subordinate organization; these RAM shares must be accepted by the end user account. Pools can then also discover and monitor IPAM resources in the subordinate organization.
   */
  def VpcIpamResourceDiscoveryAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamResourceDiscoveryAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamResourceDiscoveryAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcIpamResourceDiscoveryAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Network Insights Path resource. Part of the &#34;Reachability Analyzer&#34; service in the AWS VPC console. */
  def NetworkInsightsPath(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInsightsPathArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.NetworkInsightsPath(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS EC2 (Elastic Compute Cloud) Default Credit Specification. */
  def DefaultCreditSpecification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.builder
    
    com.pulumi.aws.ec2.DefaultCreditSpecification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to accept a pending VPC Endpoint Connection accept request to VPC Endpoint Service. */
  def VpcEndpointConnectionAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs.builder
    
    com.pulumi.aws.ec2.VpcEndpointConnectionAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Allocates (reserves) a CIDR from an IPAM address pool, preventing usage by IPAM. Only works for private IPv4. */
  def VpcIpamPoolCidrAllocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPoolCidrAllocationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamPoolCidrAllocationArgs.builder
    
    com.pulumi.aws.ec2.VpcIpamPoolCidrAllocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.Builder)
    /**
     * @param cidrAuthorizationContext A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidrAuthorizationContext for more information.
     * @return builder
     */
    def cidrAuthorizationContext(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.Builder]):
        com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.builder
      builder.cidrAuthorizationContext(args(argsBuilder).build)

  /**
   * Resource for managing an exclusive set of AWS VPC (Virtual Private Cloud) Security Group Rules.
   *  
   *  This resource manages the complete set of ingress and egress rules assigned to a security group. It provides exclusive control by removing any rules not explicitly defined in the configuration.
   *  
   *  !&gt; This resource takes exclusive ownership over ingress and egress rules assigned to a security group. This includes removal of rules which are not explicitly configured. To prevent persistent drift, ensure any `aws.vpc.SecurityGroupIngressRule` and `aws.vpc.SecurityGroupEgressRule` resources managed alongside this resource are included in the `ingressRuleIds` and `egressRuleIds` arguments.
   *  
   *  &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured security group rules. It **will not** revoke the configured rules from the security group.
   *  
   *  &gt; When this resource detects a configured rule ID which must be created, a warning diagnostic is emitted. This is due to a limitation in the [`AuthorizeSecurityGroupEgress`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AuthorizeSecurityGroupEgress.html) and [`AuthorizeSecurityGroupIngress`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AuthorizeSecurityGroupIngress.html) APIs, which require the full rule definition to be provided rather than a reference to an existing rule ID.
   */
  def VpcSecurityGroupRulesExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcSecurityGroupRulesExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcSecurityGroupRulesExclusiveArgs.builder
    
    com.pulumi.aws.ec2.VpcSecurityGroupRulesExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create an association between a VPC endpoint and a security group.
   *  
   *  &gt; **NOTE on VPC Endpoints and VPC Endpoint Security Group Associations:** The provider provides
   *  both a standalone VPC Endpoint Security Group Association (an association between a VPC endpoint
   *  and a single `securityGroupId`) and a VPC Endpoint resource with a `securityGroupIds`
   *  attribute. Do not use the same security group ID in both a VPC Endpoint resource and a VPC Endpoint Security
   *  Group Association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def SecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecurityGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.SecurityGroupAssociationArgs.builder
    
    com.pulumi.aws.ec2.SecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Creates an entry (a rule) in a network ACL with the specified rule number.
   *  
   *  &gt; **NOTE on Network ACLs and Network ACL Rules:** This provider currently
   *  provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
   *  defined in-line. At this time you cannot use a Network ACL with in-line rules
   *  in conjunction with any Network ACL Rule resources. Doing so will cause
   *  a conflict of rule settings and will overwrite rules.
   */
  def NetworkAclRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkAclRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkAclRuleArgs.builder
    
    com.pulumi.aws.ec2.NetworkAclRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcIpamArgs.Builder)
    /**
     * @param operatingRegions Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. You **must** set your provider block region as an operating_region.
     * @return builder
     */
    def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.VpcIpamArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

  /** Previews a CIDR from an IPAM address pool. Only works for private IPv4. */
  def VpcIpamPreviewNextCidr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPreviewNextCidrArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamPreviewNextCidrArgs.builder
    
    com.pulumi.aws.ec2.VpcIpamPreviewNextCidr(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkAclArgs.Builder)
    /**
     * @param egress Specifies an egress rule. Parameters defined below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Specifies an ingress rule. Parameters defined below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  /**
   * Provisions a CIDR from an IPAM address pool.
   *  
   *  &gt; **NOTE:** Provisioning Public IPv4 or Public IPv6 require [steps outside the scope of this resource](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#prepare-for-byoip). The resource accepts `message` and `signature` as part of the `cidrAuthorizationContext` attribute but those must be generated ahead of time. Public IPv6 CIDRs that are provisioned into a Pool with `publiclyAdvertisable = true` and all public IPv4 CIDRs also require creating a Route Origin Authorization (ROA) object in your Regional Internet Registry (RIR).
   *  
   *  &gt; **NOTE:** In order to deprovision CIDRs all Allocations must be released. Allocations created by a VPC take up to 30 minutes to be released. However, for IPAM to properly manage the removal of allocation records created by VPCs and other resources, you must [grant it permissions](https://docs.aws.amazon.com/vpc/latest/ipam/choose-single-user-or-orgs-ipam.html) in
   *  either a single account or organizationally. If you are unable to deprovision a cidr after waiting over 30 minutes, you may be missing the Service Linked Role.
   */
  def VpcIpamPoolCidr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.builder
    
    com.pulumi.aws.ec2.VpcIpamPoolCidr(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an VPC subnet resource.
   *  
   *  &gt; **NOTE:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), subnets associated with Lambda Functions can take up to 45 minutes to successfully delete. To allow for successful deletion, the provider will wait for at least 45 minutes even if a shorter delete timeout is specified.
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SubnetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SubnetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AWS EIP Association as a top level resource, to associate and disassociate Elastic IPs from AWS Instances and Network Interfaces.
   *  
   *  &gt; **NOTE:** Do not use this resource to associate an EIP to `aws.lb.LoadBalancer` or `aws.ec2.NatGateway` resources. Instead use the `allocationId` available in those resources to allow AWS to manage the association, otherwise you will see `AuthFailure` errors.
   *  
   *  &gt; **NOTE:** `aws.ec2.EipAssociation` is useful in scenarios where EIPs are either pre-existing or distributed to customers or users and therefore cannot be changed.
   */
  def EipAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.EipAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.EipAssociationArgs.builder
    
    com.pulumi.aws.ec2.EipAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EC2 placement group. Read more about placement groups
   *  in [AWS Docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html).
   */
  def PlacementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.PlacementGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.PlacementGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.PlacementGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.LaunchTemplateArgs.Builder)
    /**
     * @param blockDeviceMappings Specify volumes to attach to the instance besides the volumes specified by the AMI.
     *  See Block Devices below for details.
     * @return builder
     */
    def blockDeviceMappings(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param capacityReservationSpecification Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Customize the credit specification of the instance. See Credit
     *  Specification below for more details.
     * @return builder
     */
    def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param hibernationOptions The hibernation options for the instance. See Hibernation Options below for more details.
     * @return builder
     */
    def hibernationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.builder
      builder.hibernationOptions(args(argsBuilder).build)

    /**
     * @param iamInstanceProfile The IAM Instance Profile to launch the instance with. See Instance Profile
     *  below for more details.
     * @return builder
     */
    def iamInstanceProfile(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.builder
      builder.iamInstanceProfile(args(argsBuilder).build)

    /**
     * @param instanceMarketOptions The market (purchasing) option for the instance. See Market Options
     *  below for details.
     * @return builder
     */
    def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param instanceRequirements The attribute requirements for the type of instance. If present then `instanceType` cannot be present.
     * @return builder
     */
    def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param licenseSpecifications A list of license specifications to associate with. See License Specification below for more details.
     * @return builder
     */
    def licenseSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.builder
      builder.licenseSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceOptions The maintenance options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options for the instance. See Metadata Options below for more details.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param monitoring The monitoring option for the instance. See Monitoring below for more details.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network
     *  Interfaces below for more details.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    def networkPerformanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.builder
      builder.networkPerformanceOptions(args(argsBuilder).build)

    /**
     * @param placement The placement of the instance. See Placement below for more details.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions The options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param secondaryInterfaces Secondary interfaces to associate with instances launched from the template. See Secondary
     *  Interfaces below for more details.
     * @return builder
     */
    def secondaryInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.builder
      builder.secondaryInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param tagSpecifications The tags to apply to the resources during launch. See Tag Specifications below for more details. Default tags are currently not propagated to ASG created resources so you may wish to inject your default tags into this variable against the relevant child resource types created.
     * @return builder
     */
    def tagSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.builder
      builder.tagSpecifications(args.map(_(argsBuilder).build)*)

  /**
   * [IPv6 only] Creates an egress-only Internet gateway for your VPC.
   *  An egress-only Internet gateway is used to enable outbound communication
   *  over IPv6 from instances in your VPC to the Internet, and prevents hosts
   *  outside of your VPC from initiating an IPv6 connection with your instance.
   */
  def EgressOnlyInternetGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.EgressOnlyInternetGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.EgressOnlyInternetGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.EgressOnlyInternetGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an Infrastructure Performance subscription. */
  def VpcNetworkPerformanceMetricSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcNetworkPerformanceMetricSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcNetworkPerformanceMetricSubscriptionArgs.builder
    
    com.pulumi.aws.ec2.VpcNetworkPerformanceMetricSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Traffic mirror session.\
   *  Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
   */
  def TrafficMirrorSession(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.TrafficMirrorSessionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.TrafficMirrorSessionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.TrafficMirrorSession(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a VPC Endpoint connection notification resource.
   *  Connection notifications notify subscribers of VPC Endpoint events.
   */
  def VpcEndpointConnectionNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs.builder
    
    com.pulumi.aws.ec2.VpcEndpointConnectionNotification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcEncryptionControlArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.VpcEncryptionControlArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides an EC2 launch template resource. Can be used to create instances or auto scaling groups.
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import Launch Templates using the `id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:ec2/launchTemplate:LaunchTemplate web lt-12345678
   *  ```
   */
  def LaunchTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.LaunchTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.LaunchTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.LaunchTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EC2 Local Gateway Route. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#routing). */
  def LocalGatewayRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.LocalGatewayRouteArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.LocalGatewayRouteArgs.builder
    
    com.pulumi.aws.ec2.LocalGatewayRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The &#34;AMI from instance&#34; resource allows the creation of an Amazon Machine
   *  Image (AMI) modeled after an existing EBS-backed EC2 instance.
   *  
   *  The created AMI will refer to implicitly-created snapshots of the instance&#39;s
   *  EBS volumes and mimick its assigned block device configuration at the time
   *  the resource is created.
   *  
   *  This resource is best applied to an instance that is stopped when this instance
   *  is created, so that the contents of the created image are predictable. When
   *  applied to an instance that is running, *the instance will be stopped before taking
   *  the snapshots and then started back up again*, resulting in a period of
   *  downtime.
   *  
   *  Note that the source instance is inspected only at the initial creation of this
   *  resource. Ongoing updates to the referenced instance will not be propagated into
   *  the generated AMI. Users may taint or otherwise recreate the resource in order
   *  to produce a fresh snapshot.
   */
  def AmiFromInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.AmiFromInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.AmiFromInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Grant cross-account access to an Elastic network interface (ENI). */
  def NetworkInterfacePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.builder
    
    com.pulumi.aws.ec2.NetworkInterfacePermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a VPC/Subnet/ENI/Transit Gateway/Transit Gateway Attachment Flow Log to capture IP traffic for a specific network
   *  interface, subnet, or VPC. Logs are sent to a CloudWatch Log Group, a S3 Bucket, or Amazon Data Firehose
   */
  def FlowLog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.FlowLogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.FlowLogArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.FlowLog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder)
    /**
     * @param destinationPortRange Destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange Source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  /**
   * Provides an network ACL association resource which allows you to associate your network ACL with any subnet(s).
   *  
   *  &gt; **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association resource
   *  and a network ACL resource with a `subnetIds` attribute. Do not use the same subnet ID in both a network ACL
   *  resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def NetworkAclAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkAclAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkAclAssociationArgs.builder
    
    com.pulumi.aws.ec2.NetworkAclAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an EC2 instance resource. This allows instances to be created, updated, and deleted. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.InstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an EC2 Host resource. This allows Dedicated Hosts to be allocated, modified, and released. */
  def DedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DedicatedHostArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DedicatedHostArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DedicatedHost(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EC2 Spot Instance Request resource. This allows instances to be
   *  requested on the spot market.
   *  
   *  By default this provider creates Spot Instance Requests with a `persistent` type,
   *  which means that for the duration of their lifetime, AWS will launch an
   *  instance with the configured details if and when the spot market will accept
   *  the requested price.
   *  
   *  On destruction, this provider will make an attempt to terminate the associated Spot
   *  Instance if there is one present.
   *  
   *  Spot Instances requests with a `one-time` type will close the spot request
   *  when the instance is terminated either by the request being below the current spot
   *  price availability or by a user.
   *  
   *  &gt; **NOTE:** Because their behavior depends on the live status of the spot
   *  market, Spot Instance Requests have a unique lifecycle that makes them behave
   *  differently than other Terraform resources. Most importantly: there is **no
   *  guarantee** that a Spot Instance exists to fulfill the request at any given
   *  point in time. See the [AWS Spot Instance
   *  documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
   *  for more information.
   *  
   *  &gt; **NOTE [AWS strongly discourages](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use) the use of the legacy APIs called by this resource.
   *  We recommend using the EC2 Instance resource with `instanceMarketOptions` instead.
   */
  def SpotInstanceRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SpotInstanceRequestArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.SpotInstanceRequest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.AmiCopyArgs.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     *  attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiCopyArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     *  should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiCopyArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage whether serial console access is enabled for your AWS account in the current AWS region.
   *  
   *  &gt; **NOTE:** Removing this resource disables serial console access.
   */
  def SerialConsoleAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SerialConsoleAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.SerialConsoleAccessArgs.builder
    
    com.pulumi.aws.ec2.SerialConsoleAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic IP resource.
   *  
   *  &gt; **Note:** EIP may require IGW to exist prior to association. Use `dependsOn` to set an explicit dependency on the IGW.
   *  
   *  &gt; **Note:** Do not use `networkInterface` to associate the EIP to `aws.lb.LoadBalancer` or `aws.ec2.NatGateway` resources. Instead use the `allocationId` available in those resources to allow AWS to manage the association, otherwise you will see `AuthFailure` errors.
   */
  def Eip(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.EipArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.EipArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.Eip(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VPC Encryption Control. */
  @deprecated() def EncryptionControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.EncryptionControlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.EncryptionControlArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.EncryptionControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Virtual Private Gateway attachment resource, allowing for an existing
   *  hardware VPN gateway to be attached and/or detached from a VPC.
   *  
   *  &gt; **Note:** The `aws.ec2.VpnGateway`
   *  resource can also automatically attach the Virtual Private Gateway it creates
   *  to an existing VPC by setting the `vpcId` attribute accordingly.
   */
  def VpnGatewayAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnGatewayAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpnGatewayAttachmentArgs.builder
    
    com.pulumi.aws.ec2.VpnGatewayAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an [EC2 key pair](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) resource. A key pair is used to control login access to EC2 instances.
   *  
   *  Currently this resource requires an existing user-supplied key pair. This key pair&#39;s public key will be registered with AWS to allow logging-in to EC2 instances.
   *  
   *  When importing an existing key pair the public key material may be in any format supported by AWS. Supported formats (per the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws)) are:
   *  
   *  * OpenSSH public key format (the format in ~/.ssh/authorized_keys)
   *  * Base64 encoded DER format
   *  * SSH public key file format as specified in RFC4716
   */
  def KeyPair(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.KeyPairArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.KeyPairArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.KeyPair(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder)
    /**
     * @param operatingRegions Determines which regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     * @return builder
     */
    def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param organizationalUnitExclusions Add an Organizational Unit (OU) exclusion to IPAM. If IPAM is integrated with AWS Organizations and OU exclusion is added, IPAM will not manage the IP addresses in accounts in the OU exclusion. Refer to [IPAM Quotas](https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html) for the limit of exclusions that can be created.
     * @return builder
     */
    def organizationalUnitExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.Builder]*):
        com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.builder
      builder.organizationalUnitExclusions(args.map(_(argsBuilder).build)*)

  /** Provides a resource to create a VPC VPN Gateway. */
  def VpnGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpnGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpnGatewayArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpnGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VPC Endpoint Route Table Association */
  def VpcEndpointRouteTableAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointRouteTableAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointRouteTableAssociationArgs.builder
    
    com.pulumi.aws.ec2.VpcEndpointRouteTableAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Attach an Elastic network interface (ENI) resource with EC2 instance. */
  def NetworkInterfaceAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs.builder
    
    com.pulumi.aws.ec2.NetworkInterfaceAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder)
    /**
     * @param attachments Configuration block to define the attachment of the ENI. See Attachment below for more details!
     * @return builder
     */
    def attachments(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

  /** Provides an IPAM Resource Discovery resource. IPAM Resource Discoveries are resources meant for multi-organization customers. If you wish to use a single IPAM across multiple orgs, a resource discovery can be created and shared from a subordinate organization to the management organizations IPAM delegated admin account. For a full deployment example, see `aws.ec2.VpcIpamResourceDiscoveryAssociation` resource. */
  def VpcIpamResourceDiscovery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcIpamResourceDiscovery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.VpcEndpointArgs.Builder)
    /**
     * @param dnsOptions The DNS options for the endpoint. See dnsOptions below.
     * @return builder
     */
    def dnsOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.Builder]):
        com.pulumi.aws.ec2.VpcEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.builder
      builder.dnsOptions(args(argsBuilder).build)

    /**
     * @param subnetConfigurations Subnet configuration for the endpoint, used to select specific IPv4 and/or IPv6 addresses to the endpoint. See subnetConfiguration below.
     * @return builder
     */
    def subnetConfigurations(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.Builder]*):
        com.pulumi.aws.ec2.VpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.builder
      builder.subnetConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Provides a VPC Endpoint Service resource.
   *  Service consumers can create an _Interface_ VPC Endpoint to connect to the service.
   *  
   *  &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
   *  both a standalone VPC Endpoint Service Allowed Principal resource
   *  and a VPC Endpoint Service resource with an `allowedPrincipals` attribute. Do not use the same principal ARN in both
   *  a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
   *  and will overwrite the association.
   */
  def VpcEndpointService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcEndpointServiceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcEndpointService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a VPC Endpoint Policy resource. */
  def VpcEndpointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointPolicyArgs.builder
    
    com.pulumi.aws.ec2.VpcEndpointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     *  attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     *  should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  /** Manages a VPC Encryption Control. */
  def VpcEncryptionControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEncryptionControlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcEncryptionControlArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcEncryptionControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a regional public access block for AMIs. This prevents AMIs from being made publicly accessible.
   *  If you already have public AMIs, they will remain publicly available.
   *  
   *  &gt; **NOTE:** Deleting this resource does not change the block public access value, the resource in simply removed from state instead.
   */
  def ImageBlockPublicAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.ImageBlockPublicAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.ImageBlockPublicAccessArgs.builder
    
    com.pulumi.aws.ec2.ImageBlockPublicAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.FleetArgs.Builder)
    /**
     * @param fleetInstanceSets Information about the instances that were launched by the fleet. Available only when `type` is set to `instant`.
     * @return builder
     */
    def fleetInstanceSets(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.Builder]*):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.builder
      builder.fleetInstanceSets(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Nested argument containing EC2 Launch Template configurations. Defined below.
     * @return builder
     */
    def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandOptions Nested argument containing On-Demand configurations. Defined below.
     * @return builder
     */
    def onDemandOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder]):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.builder
      builder.onDemandOptions(args(argsBuilder).build)

    /**
     * @param spotOptions Nested argument containing Spot configurations. Defined below.
     * @return builder
     */
    def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

    /**
     * @param targetCapacitySpecification Nested argument containing target capacity configurations. Defined below.
     * @return builder
     */
    def targetCapacitySpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.Builder]):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.builder
      builder.targetCapacitySpecification(args(argsBuilder).build)

  /** Adds a launch permission to an Amazon Machine Image (AMI). */
  def AmiLaunchPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiLaunchPermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.AmiLaunchPermissionArgs.builder
    
    com.pulumi.aws.ec2.AmiLaunchPermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create a VPC routing table.
   *  
   *  &gt; **NOTE on `gatewayId` and `natGatewayId`:** The AWS API is very forgiving with these two
   *  attributes and the `aws.ec2.RouteTable` resource can be created with a NAT ID specified as a Gateway ID attribute.
   *  This _will_ lead to a permanent diff between your configuration and statefile, as the API returns the correct
   *  parameters in the returned route table. If you&#39;re experiencing constant diffs in your `aws.ec2.RouteTable` resources,
   *  the first thing to check is whether or not you&#39;re specifying a NAT ID instead of a Gateway ID, or vice-versa.
   *  
   *  &gt; **NOTE on `propagatingVgws` and the `aws.ec2.VpnGatewayRoutePropagation` resource:**
   *  If the `propagatingVgws` argument is present, it&#39;s not supported to _also_
   *  define route propagations using `aws.ec2.VpnGatewayRoutePropagation`, since
   *  this resource will delete any propagating gateways not explicitly listed in
   *  `propagatingVgws`. Omit this argument when defining route propagation using
   *  the separate resource.
   */
  def RouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.RouteTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.RouteTableArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.RouteTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS VPC Block Public Access Options. */
  def VpcBlockPublicAccessOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.builder
    
    com.pulumi.aws.ec2.VpcBlockPublicAccessOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Network Insights Analysis resource. Part of the &#34;Reachability Analyzer&#34; service in the AWS VPC console. */
  def NetworkInsightsAnalysis(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInsightsAnalysisArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInsightsAnalysisArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.NetworkInsightsAnalysis(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to allow a principal to discover a VPC endpoint service.
   *  
   *  &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
   *  both a standalone VPC Endpoint Service Allowed Principal resource
   *  and a VPC Endpoint Service resource with an `allowedPrincipals` attribute. Do not use the same principal ARN in both
   *  a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
   *  and will overwrite the association.
   */
  def VpcEndpointServiceAllowedPrinciple(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs.builder
    
    com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrinciple(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to associate additional IPv4 CIDR blocks with a VPC.
   *  
   *  When a VPC is created, a primary IPv4 CIDR block for the VPC must be specified.
   *  The `aws.ec2.VpcIpv4CidrBlockAssociation` resource allows further IPv4 CIDR blocks to be added to the VPC.
   */
  def VpcIpv4CidrBlockAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociationArgs.builder
    
    com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a VPC peering connection.
   *  
   *  &gt; **Note:** Modifying the VPC Peering Connection options requires peering to be active. An automatic activation
   *  can be done using the `autoAccept` attribute. Alternatively, the VPC Peering
   *  Connection has to be made active manually using other means. See notes below for
   *  more information.
   *  
   *  &gt; **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
   *  both a standalone VPC Peering Connection Options and a VPC Peering Connection
   *  resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
   *  connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
   *  Doing so will cause a conflict of options and will overwrite the options.
   *  Using a VPC Peering Connection Options resource decouples management of the connection options from
   *  management of the VPC Peering Connection and allows options to be set correctly in cross-account scenarios.
   *  
   *  &gt; **Note:** For cross-account (requester&#39;s AWS account differs from the accepter&#39;s AWS account) or inter-region
   *  VPC Peering Connections use the `aws.ec2.VpcPeeringConnection` resource to manage the requester&#39;s side of the
   *  connection and use the `aws.ec2.VpcPeeringConnectionAccepter` resource to manage the accepter&#39;s side of the connection.
   *  
   *  &gt; **Note:** Creating multiple `aws.ec2.VpcPeeringConnection` resources with the same `peerVpcId` and `vpcId` will not produce an error. Instead, AWS will return the connection `id` that already exists, resulting in multiple `aws.ec2.VpcPeeringConnection` resources with the same `id`.
   */
  def VpcPeeringConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.VpcPeeringConnectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.VpcPeeringConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a subnet CIDR reservation resource. */
  def SubnetCidrReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SubnetCidrReservationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.SubnetCidrReservationArgs.builder
    
    com.pulumi.aws.ec2.SubnetCidrReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create an association between a VPC endpoint and a subnet.
   *  
   *  &gt; **NOTE on VPC Endpoints and VPC Endpoint Subnet Associations:** This provider provides
   *  both a standalone VPC Endpoint Subnet Association (an association between a VPC endpoint
   *  and a single `subnetId`) and a VPC Endpoint resource with a `subnetIds`
   *  attribute. Do not use the same subnet ID in both a VPC Endpoint resource and a VPC Endpoint Subnet
   *  Association resource. Doing so will cause a conflict of associations and will overwrite the association.
   */
  def VpcEndpointSubnetAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.VpcEndpointSubnetAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.VpcEndpointSubnetAssociationArgs.builder
    
    com.pulumi.aws.ec2.VpcEndpointSubnetAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.DefaultRouteTableArgs.Builder)
    /**
     * @param routes Set of objects. Detailed below
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder)
    /**
     * @param ebsBlockDevices Additional EBS block devices to attach to the instance. See Block Devices below for details.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataOptions The metadata options for the instance.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Customize details about the root block device of the instance. See Block Devices below for details.
     * @return builder
     */
    def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.EncryptionControlArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.EncryptionControlArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides an EC2 Spot Fleet Request resource. This allows a fleet of Spot
   *  instances to be requested on the Spot market.
   *  
   *  &gt; **NOTE [AWS strongly discourages](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use) the use of the legacy APIs called by this resource.
   *  We recommend using the EC2 Fleet or Auto Scaling Group resources instead.
   */
  def SpotFleetRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SpotFleetRequestArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.SpotFleetRequest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides an Elastic network interface (ENI) resource. */
  def NetworkInterface(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.NetworkInterfaceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.NetworkInterface(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The AMI resource allows the creation and management of a completely-custom
   *  *Amazon Machine Image* (AMI).
   *  
   *  If you just want to duplicate an existing AMI, possibly copying it to another
   *  region, it&#39;s better to use `aws.ec2.AmiCopy` instead.
   *  
   *  If you just want to share an existing AMI with another AWS account,
   *  it&#39;s better to use `aws.ec2.AmiLaunchPermission` instead.
   */
  def Ami(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.AmiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.AmiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.Ami(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a default security group. This resource can manage the default security group of the default or a non-default VPC.
   *  
   *  &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultSecurityGroup` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to &#34;adopt&#34; it into management.
   *  
   *  When the provider first begins managing the default security group, it **immediately removes all ingress and egress rules in the Security Group**. It then creates any rules specified in the configuration. This way only the rules specified in the configuration are created.
   *  
   *  This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diff shown. For these reasons, this resource is incompatible with the `aws.ec2.SecurityGroupRule` resource.
   *  
   *  For more information about default security groups, see the AWS documentation on [Default Security Groups][aws-default-security-groups]. To manage normal security groups, see the `aws.ec2.SecurityGroup` resource.
   */
  def DefaultSecurityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultSecurityGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DefaultSecurityGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage a default route table of a VPC. This resource can manage the default route table of the default or a non-default VPC.
   *  
   *  &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultRouteTable` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to &#34;adopt&#34; it into management. **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.MainRouteTableAssociation documentation for more details.
   *  
   *  Every VPC has a default route table that can be managed but not destroyed. When the provider first adopts a default route table, it **immediately removes all defined routes**. It then proceeds to create any routes specified in the configuration. This step is required so that only the routes specified in the configuration exist in the default route table.
   *  
   *  For more information, see the Amazon VPC User Guide on [Route Tables](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html). For information about managing normal route tables in this provider, see `aws.ec2.RouteTable`.
   */
  def DefaultRouteTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultRouteTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultRouteTableArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DefaultRouteTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage the [default AWS DHCP Options Set](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html#AmazonDNS)
   *  in the current region.
   *  
   *  Each AWS region comes with a default set of DHCP options.
   *  **This is an advanced resource**, and has special caveats to be aware of when
   *  using it. Please read this document in its entirety before using this resource.
   *  
   *  The `aws.ec2.DefaultVpcDhcpOptions` behaves differently from normal resources, in that
   *  this provider does not _create_ this resource, but instead &#34;adopts&#34; it
   *  into management.
   */
  def DefaultVpcDhcpOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultVpcDhcpOptionsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultVpcDhcpOptionsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DefaultVpcDhcpOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This resource attaches a security group to an Elastic Network Interface (ENI).
   *  It can be used to attach a security group to any existing ENI, be it a
   *  secondary ENI or one attached as the primary interface on an instance.
   *  
   *  &gt; **NOTE on instances, interfaces, and security groups:** This provider currently
   *  provides the capability to assign security groups via the [`aws.ec2.Instance`][1]
   *  and the [`aws.ec2.NetworkInterface`][2] resources. Using this resource in
   *  conjunction with security groups provided in-line in those resources will cause
   *  conflicts, and will lead to spurious diffs and undefined behavior - please use
   *  one or the other.
   */
  def NetworkInterfaceSecurityGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs.builder
    
    com.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage VPC peering connection options.
   *  
   *  &gt; **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
   *  both a standalone VPC Peering Connection Options and a VPC Peering Connection
   *  resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
   *  connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
   *  Doing so will cause a conflict of options and will overwrite the options.
   *  Using a VPC Peering Connection Options resource decouples management of the connection options from
   *  management of the VPC Peering Connection and allows options to be set correctly in cross-region and
   *  cross-account scenarios.
   */
  def PeeringConnectionOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.builder
    
    com.pulumi.aws.ec2.PeeringConnectionOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Adds permission to create volumes off of a given EBS Snapshot. */
  def SnapshotCreateVolumePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs.builder
    
    com.pulumi.aws.ec2.SnapshotCreateVolumePermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage the [default AWS VPC](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html)
   *  in the current AWS Region.
   *  
   *  If you created your AWS account after 2013-12-04 you have a default VPC in each AWS Region.
   *  
   *  **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   *  
   *  The `aws.ec2.DefaultVpc` resource behaves differently from normal resources in that if a default VPC exists, this provider does not _create_ this resource, but instead &#34;adopts&#34; it into management.
   *  If no default VPC exists, the provider creates a new default VPC, which leads to the implicit creation of [other resources](https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html#default-vpc-components).
   *  By default, `pulumi destroy` does not delete the default VPC but does remove the resource from the state.
   *  Set the `forceDestroy` argument to `true` to delete the default VPC.
   */
  def DefaultVpc(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.DefaultVpcArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.DefaultVpcArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.DefaultVpc(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SecurityGroupState.Builder)
    /**
     * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  More complex filters can be expressed using one or more `filter` sub-blocks,
     *  which take the following arguments:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultRouteTableState.Builder)
    /**
     * @param routes Set of objects. Detailed below
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultRouteTableState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrState.Builder)
    /**
     * @param cidrAuthorizationContext A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidrAuthorizationContext for more information.
     * @return builder
     */
    def cidrAuthorizationContext(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.builder
      builder.cidrAuthorizationContext(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEncryptionControlState.Builder)
    /**
     * @param resourceExclusions State of exclusions from encryption enforcement.
     *  Will be `nil` if `mode` is `monitor`.
     *  See `resourceExclusions` below
     * @return builder
     */
    def resourceExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.builder
      builder.resourceExclusions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceArgs.Builder)
    /**
     * @param filters One or more filters to apply to the search.
     *  If multiple `filter` blocks are provided, they all must be true.
     *  For a full reference of filter names, see [describe-instances in the AWS CLI reference][1].
     *  See `filter` Block below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkAclState.Builder)
    /**
     * @param egress Specifies an egress rule. Parameters defined below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Specifies an ingress rule. Parameters defined below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.ManagedPrefixListState.Builder)
    /**
     * @param entries Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.ManagedPrefixListState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder)
    /**
     * @param connectionTrackingSpecification The Connection Tracking Configuration for the network interface. See [Amazon EC2 security group connection tracking](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts)
     * @return builder
     */
    def connectionTrackingSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceConnectionTrackingSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceConnectionTrackingSpecificationArgs.builder
      builder.connectionTrackingSpecification(args(argsBuilder).build)

    /**
     * @param enaSrdSpecification Configuration for Elastic Network Adapter (ENA) Express settings. Applies to network interfaces that use the [ena Express](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking-ena-express.html) feature. See details below.
     * @return builder
     */
    def enaSrdSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.builder
      builder.enaSrdSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInterfaceState.Builder)
    /**
     * @param attachments Configuration block to define the attachment of the ENI. See Attachment below for more details!
     * @return builder
     */
    def attachments(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInterfaceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSubnetsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSubnetsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.EncryptionControlState.Builder)
    /**
     * @param resourceExclusions State of exclusions from encryption enforcement.
     *  Will be `nil` if `mode` is `monitor`.
     *  See `resourceExclusions` below
     * @return builder
     */
    def resourceExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.builder
      builder.resourceExclusions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetPrefixListArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  prefix lists. The given filters must match exactly one prefix list
     *  whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetPrefixListArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryState.Builder)
    /**
     * @param operatingRegions Determines which regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     * @return builder
     */
    def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param organizationalUnitExclusions Add an Organizational Unit (OU) exclusion to IPAM. If IPAM is integrated with AWS Organizations and OU exclusion is added, IPAM will not manage the IP addresses in accounts in the OU exclusion. Refer to [IPAM Quotas](https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html) for the limit of exclusions that can be created.
     * @return builder
     */
    def organizationalUnitExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.builder
      builder.organizationalUnitExclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder)
    def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.Builder)
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.Builder)
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.EipDomainNameState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EipDomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder)
    def aclRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.builder
      builder.aclRules(args.map(_(argsBuilder).build)*)

    def acls(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

    def attachedTos(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAttachedToArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAttachedToArgs.builder
      builder.attachedTos(args.map(_(argsBuilder).build)*)

    def classicLoadBalancerListeners(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs.builder
      builder.classicLoadBalancerListeners(args.map(_(argsBuilder).build)*)

    def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    def customerGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationCustomerGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationCustomerGatewayArgs.builder
      builder.customerGateways(args.map(_(argsBuilder).build)*)

    def destinationVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationVpcArgs.builder
      builder.destinationVpcs(args.map(_(argsBuilder).build)*)

    def destinations(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    def elasticLoadBalancerListeners(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationElasticLoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationElasticLoadBalancerListenerArgs.builder
      builder.elasticLoadBalancerListeners(args.map(_(argsBuilder).build)*)

    def ingressRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationIngressRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationIngressRouteTableArgs.builder
      builder.ingressRouteTables(args.map(_(argsBuilder).build)*)

    def internetGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationInternetGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationInternetGatewayArgs.builder
      builder.internetGateways(args.map(_(argsBuilder).build)*)

    def loadBalancerTargetGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.builder
      builder.loadBalancerTargetGroup(args.map(_(argsBuilder).build)*)

    def loadBalancerTargetGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.builder
      builder.loadBalancerTargetGroups(args.map(_(argsBuilder).build)*)

    def natGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNatGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNatGatewayArgs.builder
      builder.natGateways(args.map(_(argsBuilder).build)*)

    def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

    def prefixLists(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPrefixListArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPrefixListArgs.builder
      builder.prefixLists(args.map(_(argsBuilder).build)*)

    def routeTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableRouteArgs.builder
      builder.routeTableRoutes(args.map(_(argsBuilder).build)*)

    def routeTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableArgs.builder
      builder.routeTables(args.map(_(argsBuilder).build)*)

    def securityGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.builder
      builder.securityGroup(args.map(_(argsBuilder).build)*)

    def securityGroupRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.builder
      builder.securityGroupRules(args.map(_(argsBuilder).build)*)

    def securityGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.builder
      builder.securityGroups(args.map(_(argsBuilder).build)*)

    def sourceVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSourceVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSourceVpcArgs.builder
      builder.sourceVpcs(args.map(_(argsBuilder).build)*)

    def subnetRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetRouteTableArgs.builder
      builder.subnetRouteTables(args.map(_(argsBuilder).build)*)

    def subnets(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    def transitGatewayAttachments(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayAttachmentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayAttachmentArgs.builder
      builder.transitGatewayAttachments(args.map(_(argsBuilder).build)*)

    def transitGatewayRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableRouteArgs.builder
      builder.transitGatewayRouteTableRoutes(args.map(_(argsBuilder).build)*)

    def transitGatewayRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableArgs.builder
      builder.transitGatewayRouteTables(args.map(_(argsBuilder).build)*)

    def transitGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayArgs.builder
      builder.transitGateways(args.map(_(argsBuilder).build)*)

    def vpcEndpoints(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcEndpointArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcEndpointArgs.builder
      builder.vpcEndpoints(args.map(_(argsBuilder).build)*)

    def vpcPeeringConnections(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcPeeringConnectionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcPeeringConnectionArgs.builder
      builder.vpcPeeringConnections(args.map(_(argsBuilder).build)*)

    def vpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

    def vpnConnections(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnConnectionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnConnectionArgs.builder
      builder.vpnConnections(args.map(_(argsBuilder).build)*)

    def vpnGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnGatewayArgs.builder
      builder.vpnGateways(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorCount(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * @return builder
     */
    def memoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps Block describing the minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is no minimum or maximum.
     * @return builder
     */
    def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    def vcpuCount(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder)
    /**
     * @param dnsEntries The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     * @return builder
     */
    def dnsEntries(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointDnsEntryArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsOptions The DNS options for the endpoint. See dnsOptions below.
     * @return builder
     */
    def dnsOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.builder
      builder.dnsOptions(args(argsBuilder).build)

    /**
     * @param subnetConfigurations Subnet configuration for the endpoint, used to select specific IPv4 and/or IPv6 addresses to the endpoint. See subnetConfiguration below.
     * @return builder
     */
    def subnetConfigurations(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.builder
      builder.subnetConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FlowLogState.Builder)
    /**
     * @param destinationOptions Describes the destination options for a flow log. More details below.
     * @return builder
     */
    def destinationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FlowLogState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.builder
      builder.destinationOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  More complex filters can be expressed using one or more `filter` sub-blocks,
     *  which take the following arguments:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SecondarySubnetState.Builder)
    /**
     * @param ipv4CidrBlockAssociations A list of IPv4 CIDR block associations for the secondary network.
     * @return builder
     */
    def ipv4CidrBlockAssociations(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondarySubnetIpv4CidrBlockAssociationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecondarySubnetState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecondarySubnetIpv4CidrBlockAssociationArgs.builder
      builder.ipv4CidrBlockAssociations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SecondarySubnetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder)
    /**
     * @param capacityRebalance Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * @return builder
     */
    def capacityRebalance(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceArgs.builder
      builder.capacityRebalance(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.Builder)
    def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.Builder)
    /**
     * @param capacityRebalance Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * @return builder
     */
    def capacityRebalance(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs.builder
      builder.capacityRebalance(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SecondaryNetworkState.Builder)
    /**
     * @param ipv4CidrBlockAssociations A list of IPv4 CIDR block associations for the secondary network.
     * @return builder
     */
    def ipv4CidrBlockAssociations(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondaryNetworkIpv4CidrBlockAssociationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecondaryNetworkState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecondaryNetworkIpv4CidrBlockAssociationArgs.builder
      builder.ipv4CidrBlockAssociations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SecondaryNetworkState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultNetworkAclState.Builder)
    /**
     * @param egress Configuration block for an egress rule. Detailed below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultNetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for an ingress rule. Detailed below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultNetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder)
    /**
     * @param creationDateCondition Condition based on AMI creation date. See `creationDateCondition` below.
     * @return builder
     */
    def creationDateCondition(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionCreationDateConditionArgs.Builder]):
        com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionCreationDateConditionArgs.builder
      builder.creationDateCondition(args(argsBuilder).build)

    /**
     * @param deprecationTimeCondition Condition based on AMI deprecation time. See `deprecationTimeCondition` below.
     * @return builder
     */
    def deprecationTimeCondition(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionDeprecationTimeConditionArgs.Builder]):
        com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionDeprecationTimeConditionArgs.builder
      builder.deprecationTimeCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetEipsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetEipsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.AmiState.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     *  attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     *  should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder)
    /**
     * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch. See CloudWatch Log Options below for more details.
     * @return builder
     */
    def cloudwatchLogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs.builder
      builder.cloudwatchLogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.AmiCopyState.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     *  attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiCopyState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     *  should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiCopyState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPriceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPriceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder)
    /**
     * @param capacityReservationOptions The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity. Supported only for fleets of type `instant`.
     * @return builder
     */
    def capacityReservationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsCapacityReservationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsCapacityReservationOptionsArgs.builder
      builder.capacityReservationOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcPeeringConnectionState.Builder)
    /**
     * @param accepter An optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     *  the peering connection (a maximum of one).
     * @return builder
     */
    def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester A optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     *  the peering connection (a maximum of one).
     * @return builder
     */
    def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder)
    def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.RouteTableState.Builder)
    /**
     * @param routes A list of route objects. Their keys are documented below.
     *  This means that omitting this argument is interpreted as ignoring any existing routes. To remove all managed routes an empty list should be specified. See the example above.
     *  
     *  &gt; **NOTE on Route Tables and Routes:** This provider currently provides both a standalone Route resource (`aws.ec2.Route`) and a Route Table resource with routes defined in-line (`aws.ec2.RouteTable`). At this time you cannot use a `aws.ec2.RouteTable` inline `route` blocks in conjunction with any `aws.ec2.Route` resources. Doing so will cause a conflict of rule settings and will overwrite rules.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.RouteTableState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamState.Builder)
    /**
     * @param operatingRegions Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. You **must** set your provider block region as an operating_region.
     * @return builder
     */
    def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcIpamState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstancesArgs.Builder)
    /**
     * @param filters One or more filters to apply to the search.
     *  If multiple `filter` blocks are provided, they all must be true.
     *  For a full reference of filter names, see [describe-instances in the AWS CLI reference][1].
     *  See `filter` Block below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstancesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState.Builder)
    /**
     * @param accepter A configuration block that describes [VPC Peering Connection]
     *  (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * @return builder
     */
    def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester A configuration block that describes [VPC Peering Connection]
     *  (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * @return builder
     */
    def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.Builder)
    /**
     * @param filters List of custom filters as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder)
    /**
     * @param destinationPortRange The destination port range. See below for details.
     * @return builder
     */
    def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange The source port range. See below for details.
     * @return builder
     */
    def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There
     *  are several valid keys, for a full reference, check out
     *  [describe-images in the AWS CLI reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder)
    /**
     * @param destinationPortRange The destination port range. See below for details.
     * @return builder
     */
    def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange The source port range. See below for details.
     * @return builder
     */
    def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultSecurityGroupState.Builder)
    /**
     * @param egress Configuration block. Detailed below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block. Detailed below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder)
    /**
     * @param spotOptions The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
     * @return builder
     */
    def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetKeyPairArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  Key Pairs. The given filters must match exactly one Key Pair
     *  whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetKeyPairArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum limits.
     * @return builder
     */
    def acceleratorCount(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib The minimum and maximum amount of memory per vCPU, in GiB. Default is no minimum or maximum limits.
     * @return builder
     */
    def memoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is No minimum or maximum.
     * @return builder
     */
    def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    def vcpuCount(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder)
    /**
     * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch. See CloudWatch Log Options below for more details.
     * @return builder
     */
    def cloudwatchLogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsCloudwatchLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsCloudwatchLogOptionsArgs.builder
      builder.cloudwatchLogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamPoolState.Builder)
    /**
     * @param sourceResource Resource to use to use to configure a resource planning IPAM Pool. If configured, the `locale` of the parent pool must match the region that the vpc resides in.
     * @return builder
     */
    def sourceResource(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcIpamPoolState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.builder
      builder.sourceResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder)
    /**
     * @param egressOnlyInternetGateway `state` and `stateMessage` describing encryption enforcement state for Egress-Only Internet Gateways.
     * @return builder
     */
    def egressOnlyInternetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.builder
      builder.egressOnlyInternetGateway(args(argsBuilder).build)

    /**
     * @param elasticFileSystem `state` and `stateMessage` describing encryption enforcement state for Elastic File System (EFS).
     * @return builder
     */
    def elasticFileSystem(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsElasticFileSystemArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsElasticFileSystemArgs.builder
      builder.elasticFileSystem(args(argsBuilder).build)

    /**
     * @param internetGateway `state` and `stateMessage` describing encryption enforcement state for Internet Gateways.
     * @return builder
     */
    def internetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsInternetGatewayArgs.builder
      builder.internetGateway(args(argsBuilder).build)

    /**
     * @param lambda `state` and `stateMessage` describing encryption enforcement state for Lambda Functions.
     * @return builder
     */
    def lambda(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsLambdaArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    /**
     * @param natGateway `state` and `stateMessage` describing encryption enforcement state for NAT Gateways.
     * @return builder
     */
    def natGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsNatGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsNatGatewayArgs.builder
      builder.natGateway(args(argsBuilder).build)

    /**
     * @param virtualPrivateGateway `state` and `stateMessage` describing encryption enforcement state for Virtual Private Gateways.
     * @return builder
     */
    def virtualPrivateGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.builder
      builder.virtualPrivateGateway(args(argsBuilder).build)

    /**
     * @param vpcLattice `state` and `stateMessage` describing encryption enforcement state for VPC Lattice.
     * @return builder
     */
    def vpcLattice(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcLatticeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcLatticeArgs.builder
      builder.vpcLattice(args(argsBuilder).build)

    /**
     * @param vpcPeering `state` and `stateMessage` describing encryption enforcement state for peered VPCs.
     * @return builder
     */
    def vpcPeering(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcPeeringArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcPeeringArgs.builder
      builder.vpcPeering(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Used to target a specific Capacity Reservation:
     * @return builder
     */
    def capacityReservationTarget(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  The arguments of this data source act as filters for querying the available IPAMs.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  Network Insights Analyzes. The given filters must match exactly one Network Insights Analysis
     *  whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder)
    /**
     * @param routes The static routes associated with the VPN connection. Detailed below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    /**
     * @param tunnel1LogOptions Options for logging VPN tunnel activity. See Log Options below for more details.
     * @return builder
     */
    def tunnel1LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.builder
      builder.tunnel1LogOptions(args(argsBuilder).build)

    /**
     * @param tunnel2LogOptions Options for logging VPN tunnel activity. See Log Options below for more details.
     * @return builder
     */
    def tunnel2LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.builder
      builder.tunnel2LogOptions(args(argsBuilder).build)

    /**
     * @param vgwTelemetries Telemetry for the VPN tunnels. Detailed below.
     * @return builder
     */
    def vgwTelemetries(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionVgwTelemetryArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionVgwTelemetryArgs.builder
      builder.vgwTelemetries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.Builder)
    /**
     * @param instanceRequirements Override the instance type in the Launch Template with instance types that satisfy the requirements.
     * @return builder
     */
    def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder)
    def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.CapacityBlockReservationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.CapacityBlockReservationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.Builder)
    def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  NAT Gateways in the current Region. The given filters must match exactly one
     *  NAT Gateway whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder)
    /**
     * @param launchTemplateSpecification Launch template specification. See Launch Template Specification below for more details.
     * @return builder
     */
    def launchTemplateSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder
      builder.launchTemplateSpecification(args(argsBuilder).build)

    /**
     * @param overrides One or more override configurations. See Overrides below for more details.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder)
    def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  More complex filters can be expressed using one or more `filter` sub-blocks,
     *  which take the following arguments:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetAmiArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are
     *  several valid keys, for a full reference, check out
     *  [describe-images in the AWS CLI reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetAmiArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     *  
     *  For more information, see the documentation on [Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html).
     * @return builder
     */
    def capacityReservationTarget(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorCount(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * @return builder
     */
    def memoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps Block describing the minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is no minimum or maximum.
     * @return builder
     */
    def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    def vcpuCount(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsPathState.Builder)
    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters at the destination. If you specify this parameter, you can&#39;t specify `destinationIp`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    def filterAtDestination(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.builder
      builder.filterAtDestination(args(argsBuilder).build)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the source. If you specify this parameter, you can&#39;t specify `sourceIp` or `destinationPort`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    def filterAtSource(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.builder
      builder.filterAtSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState.Builder)
    /**
     * @param accepter An optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts the peering connection (a maximum of one).
     * @return builder
     */
    def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester A optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests the peering connection (a maximum of one).
     * @return builder
     */
    def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder)
    /**
     * @param egressOnlyInternetGateway `state` and `stateMessage` describing encryption enforcement state for Egress-Only Internet Gateways.
     * @return builder
     */
    def egressOnlyInternetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.builder
      builder.egressOnlyInternetGateway(args(argsBuilder).build)

    /**
     * @param elasticFileSystem `state` and `stateMessage` describing encryption enforcement state for Elastic File System (EFS).
     * @return builder
     */
    def elasticFileSystem(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsElasticFileSystemArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsElasticFileSystemArgs.builder
      builder.elasticFileSystem(args(argsBuilder).build)

    /**
     * @param internetGateway `state` and `stateMessage` describing encryption enforcement state for Internet Gateways.
     * @return builder
     */
    def internetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsInternetGatewayArgs.builder
      builder.internetGateway(args(argsBuilder).build)

    /**
     * @param lambda `state` and `stateMessage` describing encryption enforcement state for Lambda Functions.
     * @return builder
     */
    def lambda(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsLambdaArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    /**
     * @param natGateway `state` and `stateMessage` describing encryption enforcement state for NAT Gateways.
     * @return builder
     */
    def natGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsNatGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsNatGatewayArgs.builder
      builder.natGateway(args(argsBuilder).build)

    /**
     * @param virtualPrivateGateway `state` and `stateMessage` describing encryption enforcement state for Virtual Private Gateways.
     * @return builder
     */
    def virtualPrivateGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.builder
      builder.virtualPrivateGateway(args(argsBuilder).build)

    /**
     * @param vpcLattice `state` and `stateMessage` describing encryption enforcement state for VPC Lattice.
     * @return builder
     */
    def vpcLattice(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcLatticeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcLatticeArgs.builder
      builder.vpcLattice(args(argsBuilder).build)

    /**
     * @param vpcPeering `state` and `stateMessage` describing encryption enforcement state for peered VPCs.
     * @return builder
     */
    def vpcPeering(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcPeeringArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcPeeringArgs.builder
      builder.vpcPeering(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  Network Insights Paths. The given filters must match exactly one Network Insights Path
     *  whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryNetworkInterfaces The primary network interface. See Primary Network Interface below.
     * @return builder
     */
    def primaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrimaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrimaryNetworkInterfaceArgs.builder
      builder.primaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder)
    /**
     * @param ebsBlockDevices Additional EBS block devices to attach to the instance. See Block Devices below for details.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataOptions The metadata options for the instance.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Customize details about the root block device of the instance. See Block Devices below for details.
     * @return builder
     */
    def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetState.Builder)
    /**
     * @param fleetInstanceSets Information about the instances that were launched by the fleet. Available only when `type` is set to `instant`.
     * @return builder
     */
    def fleetInstanceSets(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.builder
      builder.fleetInstanceSets(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Nested argument containing EC2 Launch Template configurations. Defined below.
     * @return builder
     */
    def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandOptions Nested argument containing On-Demand configurations. Defined below.
     * @return builder
     */
    def onDemandOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.builder
      builder.onDemandOptions(args(argsBuilder).build)

    /**
     * @param spotOptions Nested argument containing Spot configurations. Defined below.
     * @return builder
     */
    def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

    /**
     * @param targetCapacitySpecification Nested argument containing target capacity configurations. Defined below.
     * @return builder
     */
    def targetCapacitySpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.builder
      builder.targetCapacitySpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NatGatewayState.Builder)
    /**
     * @param availabilityZoneAddresses Repeatable configuration block for the Elastic IP addresses (EIPs) and availability zones for the regional NAT gateway. When not specified, the regional NAT gateway will automatically expand to new AZs and associate EIPs upon detection of an elastic network interface (auto mode). When specified, auto-expansion is disabled (manual mode). See `availabilityZoneAddress` below for details.
     * @return builder
     */
    def availabilityZoneAddresses(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NatGatewayState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.builder
      builder.availabilityZoneAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param regionalNatGatewayAddresses (regional NAT gateways only) Repeatable blocks for information about the IP addresses and network interface associated with the regional NAT gateway.
     * @return builder
     */
    def regionalNatGatewayAddresses(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayRegionalNatGatewayAddressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NatGatewayState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayRegionalNatGatewayAddressArgs.builder
      builder.regionalNatGatewayAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.Builder)
    /**
     * @param enaSrdUdpSpecification Configuration for ENA Express UDP optimization. See details below.
     * @return builder
     */
    def enaSrdUdpSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationEnaSrdUdpSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationEnaSrdUdpSpecificationArgs.builder
      builder.enaSrdUdpSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     *  
     *  For more information, see the documentation on [Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html).
     * @return builder
     */
    def capacityReservationTarget(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleState.Builder)
    /**
     * @param destinationPortRange Destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange Source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.AllowedImagesSettingsState.Builder)
    /**
     * @param imageCriterions List of image criteria. Maximum of 10 criterion blocks allowed. See `imageCriterion` below.
     * @return builder
     */
    def imageCriterions(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AllowedImagesSettingsState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.builder
      builder.imageCriterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder)
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    def rootBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs.builder
      builder.rootBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.Builder)
    /**
     * @param filters One or more [name-value pairs][dcg-filters] to filter by.
     *  
     *  [dcg-filters]: https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder)
    /**
     * @param blockDeviceMappings Specify volumes to attach to the instance besides the volumes specified by the AMI.
     *  See Block Devices below for details.
     * @return builder
     */
    def blockDeviceMappings(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param capacityReservationSpecification Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Customize the credit specification of the instance. See Credit
     *  Specification below for more details.
     * @return builder
     */
    def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param hibernationOptions The hibernation options for the instance. See Hibernation Options below for more details.
     * @return builder
     */
    def hibernationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.builder
      builder.hibernationOptions(args(argsBuilder).build)

    /**
     * @param iamInstanceProfile The IAM Instance Profile to launch the instance with. See Instance Profile
     *  below for more details.
     * @return builder
     */
    def iamInstanceProfile(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.builder
      builder.iamInstanceProfile(args(argsBuilder).build)

    /**
     * @param instanceMarketOptions The market (purchasing) option for the instance. See Market Options
     *  below for details.
     * @return builder
     */
    def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param instanceRequirements The attribute requirements for the type of instance. If present then `instanceType` cannot be present.
     * @return builder
     */
    def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param licenseSpecifications A list of license specifications to associate with. See License Specification below for more details.
     * @return builder
     */
    def licenseSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.builder
      builder.licenseSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceOptions The maintenance options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options for the instance. See Metadata Options below for more details.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param monitoring The monitoring option for the instance. See Monitoring below for more details.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network
     *  Interfaces below for more details.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    def networkPerformanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.builder
      builder.networkPerformanceOptions(args(argsBuilder).build)

    /**
     * @param placement The placement of the instance. See Placement below for more details.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions The options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param secondaryInterfaces Secondary interfaces to associate with instances launched from the template. See Secondary
     *  Interfaces below for more details.
     * @return builder
     */
    def secondaryInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.builder
      builder.secondaryInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param tagSpecifications The tags to apply to the resources during launch. See Tag Specifications below for more details. Default tags are currently not propagated to ASG created resources so you may wish to inject your default tags into this variable against the relevant child resource types created.
     * @return builder
     */
    def tagSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.builder
      builder.tagSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder)
    def aclRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.builder
      builder.aclRules(args.map(_(argsBuilder).build)*)

    def additionalDetails(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.builder
      builder.additionalDetails(args.map(_(argsBuilder).build)*)

    def attachedTos(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs.builder
      builder.attachedTos(args.map(_(argsBuilder).build)*)

    def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    def destinationVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs.builder
      builder.destinationVpcs(args.map(_(argsBuilder).build)*)

    def inboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.builder
      builder.inboundHeaders(args.map(_(argsBuilder).build)*)

    def outboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.builder
      builder.outboundHeaders(args.map(_(argsBuilder).build)*)

    def routeTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs.builder
      builder.routeTableRoutes(args.map(_(argsBuilder).build)*)

    def securityGroupRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.builder
      builder.securityGroupRules(args.map(_(argsBuilder).build)*)

    def sourceVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs.builder
      builder.sourceVpcs(args.map(_(argsBuilder).build)*)

    def subnets(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    def transitGatewayRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs.builder
      builder.transitGatewayRouteTableRoutes(args.map(_(argsBuilder).build)*)

    def transitGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs.builder
      builder.transitGateways(args.map(_(argsBuilder).build)*)

    def vpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  The arguments of this data source act as filters for querying the available IPAM Pools in the current region.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.Builder)
    /**
     * @param instanceRequirements The instance requirements. See below.
     * @return builder
     */
    def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     *  
     *  The arguments of this data source act as filters for querying the available
     *  prefix lists. The given filters must match exactly one prefix list
     *  whose data will be exported as attributes.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder)
    def aclRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.builder
      builder.aclRules(args.map(_(argsBuilder).build)*)

    def additionalDetails(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.builder
      builder.additionalDetails(args.map(_(argsBuilder).build)*)

    def attachedTos(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAttachedToArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAttachedToArgs.builder
      builder.attachedTos(args.map(_(argsBuilder).build)*)

    def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    def destinationVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentDestinationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentDestinationVpcArgs.builder
      builder.destinationVpcs(args.map(_(argsBuilder).build)*)

    def inboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.builder
      builder.inboundHeaders(args.map(_(argsBuilder).build)*)

    def outboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.builder
      builder.outboundHeaders(args.map(_(argsBuilder).build)*)

    def routeTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentRouteTableRouteArgs.builder
      builder.routeTableRoutes(args.map(_(argsBuilder).build)*)

    def securityGroupRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.builder
      builder.securityGroupRules(args.map(_(argsBuilder).build)*)

    def sourceVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSourceVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSourceVpcArgs.builder
      builder.sourceVpcs(args.map(_(argsBuilder).build)*)

    def subnets(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSubnetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    def transitGatewayRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteArgs.builder
      builder.transitGatewayRouteTableRoutes(args.map(_(argsBuilder).build)*)

    def transitGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayArgs.builder
      builder.transitGateways(args.map(_(argsBuilder).build)*)

    def vpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSubnetArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSubnetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder)
    /**
     * @param launchSpecifications Used to define the launch configuration of the
     *  spot-fleet request. Can be specified multiple times to define different bids
     *  across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     *  
     *  **Note**: This takes in similar but not
     *  identical inputs as `aws.ec2.Instance`.  There are limitations on
     *  what you can specify. See the list of officially supported inputs in the
     *  [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     *  a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     * @return builder
     */
    def launchSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.builder
      builder.launchSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     * @return builder
     */
    def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param spotMaintenanceStrategies Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * @return builder
     */
    def spotMaintenanceStrategies(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.builder
      builder.spotMaintenanceStrategies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetRouteTableArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTableFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTableFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.AmiFromInstanceState.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     *  attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiFromInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     *  should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiFromInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEndpointServiceState.Builder)
    /**
     * @param privateDnsNameConfigurations List of objects containing information about the endpoint service private DNS name configuration.
     * @return builder
     */
    def privateDnsNameConfigurations(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcEndpointServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationArgs.builder
      builder.privateDnsNameConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder)
    /**
     * @param spotOptions Block to configure the options for Spot Instances. See Spot Options below for details on attributes.
     * @return builder
     */
    def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder)
    /**
     * @param launchTemplateSpecification Nested argument containing EC2 Launch Template to use. Defined below.
     * @return builder
     */
    def launchTemplateSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder
      builder.launchTemplateSpecification(args(argsBuilder).build)

    /**
     * @param overrides Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder)
    /**
     * @param ebs Configure EBS volume properties.
     * @return builder
     */
    def ebs(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingEbsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingEbsArgs.builder
      builder.ebs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     *  
     *  More complex filters can be expressed using one or more `filter` sub-blocks,
     *  which take the following arguments:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetElasticIpArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetElasticIpArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder)
    /**
     * @param alternatePathHints Potential intermediate components of a feasible path. Described below.
     * @return builder
     */
    def alternatePathHints(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisAlternatePathHintArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisAlternatePathHintArgs.builder
      builder.alternatePathHints(args.map(_(argsBuilder).build)*)

    /**
     * @param explanations Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
     * @return builder
     */
    def explanations(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.builder
      builder.explanations(args.map(_(argsBuilder).build)*)

    /**
     * @param forwardPathComponents The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * @return builder
     */
    def forwardPathComponents(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.builder
      builder.forwardPathComponents(args.map(_(argsBuilder).build)*)

    /**
     * @param returnPathComponents The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * @return builder
     */
    def returnPathComponents(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.builder
      builder.returnPathComponents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder)
    /**
     * @param maintenanceStrategies Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * @return builder
     */
    def maintenanceStrategies(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.builder
      builder.maintenanceStrategies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.InstanceState.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceMarketOptions Describes the market (purchasing) option for the instances. See Market Options below for details on attributes.
     * @return builder
     */
    def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryNetworkInterface The primary network interface. See Primary Network Interface below.
     * @return builder
     */
    def primaryNetworkInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.builder
      builder.primaryNetworkInterface(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  /**
   * Provides an EC2 Secondary Subnet resource.
   *  
   *  A secondary subnet is a subnet within a secondary network that provides high-performance networking capabilities for specialized workloads such as RDMA (Remote Direct Memory Access) applications.
   */
  def SecondarySubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ec2.SecondarySubnetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ec2.SecondarySubnetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ec2.SecondarySubnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder)
    /**
     * @param egress Configuration block. Detailed below.
     * @return builder
     */
    def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block. Detailed below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.EipDomainNameArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.EipDomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
