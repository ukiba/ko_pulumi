package jp.ukiba.ko_pulumi
package aws

object ec2_ext:
  extension (builder: com.pulumi.aws.ec2.AllowedImagesSettingsArgs.Builder)
    /**
     * @param imageCriterions List of image criteria. Maximum of 10 criterion blocks allowed. See `imageCriterion` below.
     * @return builder
     */
    inline def imageCriterions(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder]*):
        com.pulumi.aws.ec2.AllowedImagesSettingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.builder
      builder.imageCriterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.AmiArgs.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.AmiCopyArgs.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiCopyArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiCopyArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.AmiFromInstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.CapacityBlockReservationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.CapacityBlockReservationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.DefaultCreditSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder)
    /**
     * @param egress Configuration block for an egress rule. Detailed below.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for an ingress rule. Detailed below.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultNetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.DefaultRouteTableArgs.Builder)
    /**
     * @param routes Set of objects. Detailed below
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder)
    /**
     * @param egress Configuration block. Detailed below.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block. Detailed below.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.DefaultSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.EipDomainNameArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.EipDomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.EncryptionControlArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.EncryptionControlArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.FleetArgs.Builder)
    /**
     * @param fleetInstanceSets Information about the instances that were launched by the fleet. Available only when `type` is set to `instant`.
     * @return builder
     */
    inline def fleetInstanceSets(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.Builder]*):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.builder
      builder.fleetInstanceSets(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Nested argument containing EC2 Launch Template configurations. Defined below.
     * @return builder
     */
    inline def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandOptions Nested argument containing On-Demand configurations. Defined below.
     * @return builder
     */
    inline def onDemandOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder]):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.builder
      builder.onDemandOptions(args(argsBuilder).build)

    /**
     * @param spotOptions Nested argument containing Spot configurations. Defined below.
     * @return builder
     */
    inline def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

    /**
     * @param targetCapacitySpecification Nested argument containing target capacity configurations. Defined below.
     * @return builder
     */
    inline def targetCapacitySpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.Builder]):
        com.pulumi.aws.ec2.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.builder
      builder.targetCapacitySpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.FlowLogArgs.Builder)
    /**
     * @param destinationOptions Destination options for a flow log. More details below.
     * @return builder
     */
    inline def destinationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.FlowLogArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.builder
      builder.destinationOptions(args(argsBuilder).build)

    /**
     * @param tagFieldSpecifications Tag configuration for the Flow Logs Amazon EC2 Tags feature fields (e.g., `\$\${instance-tag}`) used in `logFormat`. More details below.
     * @return builder
     */
    inline def tagFieldSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.FlowLogTagFieldSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.FlowLogArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FlowLogTagFieldSpecificationArgs.builder
      builder.tagFieldSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.InstanceArgs.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    inline def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    inline def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    inline def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    inline def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceMarketOptions Describes the market (purchasing) option for the instances. See Market Options below for details on attributes.
     * @return builder
     */
    inline def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    inline def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    inline def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated("network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.") inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryNetworkInterface The primary network interface. See Primary Network Interface below.
     * @return builder
     */
    inline def primaryNetworkInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.builder
      builder.primaryNetworkInterface(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    inline def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    inline def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    inline def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder)
    /**
     * @param ebsBlockDevices Additional EBS block devices to attach to the instance. See Block Devices below for details.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataOptions The metadata options for the instance.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Customize details about the root block device of the instance. See Block Devices below for details.
     * @return builder
     */
    inline def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.LaunchConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.LaunchTemplateArgs.Builder)
    /**
     * @param blockDeviceMappings Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * See Block Devices below for details.
     * @return builder
     */
    inline def blockDeviceMappings(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param capacityReservationSpecification Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    inline def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    inline def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     * @return builder
     */
    inline def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    inline def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param hibernationOptions The hibernation options for the instance. See Hibernation Options below for more details.
     * @return builder
     */
    inline def hibernationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.builder
      builder.hibernationOptions(args(argsBuilder).build)

    /**
     * @param iamInstanceProfile The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     * @return builder
     */
    inline def iamInstanceProfile(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.builder
      builder.iamInstanceProfile(args(argsBuilder).build)

    /**
     * @param instanceMarketOptions The market (purchasing) option for the instance. See Market Options
     * below for details.
     * @return builder
     */
    inline def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param instanceRequirements The attribute requirements for the type of instance. If present then `instanceType` cannot be present.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param licenseSpecifications A list of license specifications to associate with. See License Specification below for more details.
     * @return builder
     */
    inline def licenseSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.builder
      builder.licenseSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceOptions The maintenance options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    inline def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options for the instance. See Metadata Options below for more details.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param monitoring The monitoring option for the instance. See Monitoring below for more details.
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    inline def networkPerformanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.builder
      builder.networkPerformanceOptions(args(argsBuilder).build)

    /**
     * @param placement The placement of the instance. See Placement below for more details.
     * @return builder
     */
    inline def placement(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions The options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    inline def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param secondaryInterfaces Secondary interfaces to associate with instances launched from the template. See Secondary
     * Interfaces below for more details.
     * @return builder
     */
    inline def secondaryInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.builder
      builder.secondaryInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param tagSpecifications The tags to apply to the resources during launch. See Tag Specifications below for more details. Default tags are currently not propagated to ASG created resources so you may wish to inject your default tags into this variable against the relevant child resource types created.
     * @return builder
     */
    inline def tagSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.LaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.builder
      builder.tagSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.LocalGatewayRouteTableArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.LocalGatewayRouteTableTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.LocalGatewayRouteTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LocalGatewayRouteTableTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.ManagedPrefixListArgs.Builder)
    /**
     * @param entries Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.Builder]*):
        com.pulumi.aws.ec2.ManagedPrefixListArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.NatGatewayArgs.Builder)
    /**
     * @param availabilityZoneAddresses Repeatable configuration block for the Elastic IP addresses (EIPs) and availability zones for the regional NAT gateway. When not specified, the regional NAT gateway will automatically expand to new AZs and associate EIPs upon detection of an elastic network interface (auto mode). When specified, auto-expansion is disabled (manual mode). See `availabilityZoneAddress` below for details.
     * @return builder
     */
    inline def availabilityZoneAddresses(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.Builder]*):
        com.pulumi.aws.ec2.NatGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.builder
      builder.availabilityZoneAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.NatGatewayEipAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkAclArgs.Builder)
    /**
     * @param egress Specifies an egress rule. Parameters defined below.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Specifies an ingress rule. Parameters defined below.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.NetworkInsightsAccessScopeArgs.Builder)
    /**
     * @param excludePaths Set of access scope path statements to exclude.
     * See `excludePaths` below for details.
     * @return builder
     */
    inline def excludePaths(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkInsightsAccessScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.builder
      builder.excludePaths(args.map(_(argsBuilder).build)*)

    /**
     * @param matchPaths Set of access scope path statements to match.
     * At least one must be specified.
     * See `matchPaths` below for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def matchPaths(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkInsightsAccessScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.builder
      builder.matchPaths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder)
    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters at the destination. If you specify this parameter, you can&#39;t specify `destinationIp`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    inline def filterAtDestination(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.builder
      builder.filterAtDestination(args(argsBuilder).build)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the source. If you specify this parameter, you can&#39;t specify `sourceIp` or `destinationPort`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    inline def filterAtSource(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInsightsPathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.builder
      builder.filterAtSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder)
    /**
     * @param attachments Configuration block to define the attachment of the ENI. See Attachment below for more details!
     * @return builder
     */
    inline def attachments(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.Builder]*):
        com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionTrackingSpecification Configures the [connection tracking timeouts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts) for the network interface. See Connection Tracking Specification below for more details.
     * @return builder
     */
    inline def connectionTrackingSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceConnectionTrackingSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceConnectionTrackingSpecificationArgs.builder
      builder.connectionTrackingSpecification(args(argsBuilder).build)

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface. The ENI must be attached to an instance to configure ENA Express. See ENA SRD Specification below for more details.
     * @return builder
     */
    inline def enaSrdSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationArgs.builder
      builder.enaSrdSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.NetworkInterfacePermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder)
    /**
     * @param accepter Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that accepts the peering connection (a maximum of one). See `accepter` Block below.
     * @return builder
     */
    inline def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.Builder]):
        com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that requests the peering connection (a maximum of one). See `requester` Block below.
     * @return builder
     */
    inline def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.Builder]):
        com.pulumi.aws.ec2.PeeringConnectionOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.RouteTableArgs.Builder)
    /**
     * @param routes A list of route objects. Their keys are documented below.
     * This means that omitting this argument is interpreted as ignoring any existing routes. To remove all managed routes an empty list should be specified. See the example above.
     * 
     * &gt; **NOTE on Route Tables and Routes:** This provider currently provides both a standalone Route resource (`aws.ec2.Route`) and a Route Table resource with routes defined in-line (`aws.ec2.RouteTable`). At this time you cannot use a `aws.ec2.RouteTable` inline `route` blocks in conjunction with any `aws.ec2.Route` resources. Doing so will cause a conflict of rule settings and will overwrite rules.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.RouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.SecondaryNetworkArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.SecondaryNetworkArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.SecondarySubnetArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.SecondarySubnetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.SecurityGroupArgs.Builder)
    /**
     * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.SecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.SecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder)
    /**
     * @param launchSpecifications Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     * 
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     * @return builder
     */
    inline def launchSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.builder
      builder.launchSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     * @return builder
     */
    inline def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param spotMaintenanceStrategies Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * @return builder
     */
    inline def spotMaintenanceStrategies(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder]):
        com.pulumi.aws.ec2.SpotFleetRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.builder
      builder.spotMaintenanceStrategies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    inline def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    inline def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    inline def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    inline def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    inline def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    inline def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated("network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.") inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    inline def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    inline def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    inline def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.SpotInstanceRequestArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder)
    /**
     * @param destinationPortRange Destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    inline def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange Source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    inline def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.TrafficMirrorFilterRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.VpcBlockPublicAccessExclusionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.VpcBlockPublicAccessOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcEncryptionControlArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.VpcEncryptionControlArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcEndpointArgs.Builder)
    /**
     * @param dnsOptions DNS options for the endpoint. See `dnsOptions` below.
     * @return builder
     */
    inline def dnsOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.Builder]):
        com.pulumi.aws.ec2.VpcEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.builder
      builder.dnsOptions(args(argsBuilder).build)

    /**
     * @param subnetConfigurations Subnet configuration for the endpoint, used to select specific IPv4 and/or IPv6 addresses to the endpoint. See subnetConfiguration below.
     * @return builder
     */
    inline def subnetConfigurations(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.Builder]*):
        com.pulumi.aws.ec2.VpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.builder
      builder.subnetConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.VpcIpamArgs.Builder)
    /**
     * @param operatingRegions Locales that can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. You **must** set your provider block region as an operating_region.
     * @return builder
     */
    inline def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.VpcIpamArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.VpcIpamPoolArgs.Builder)
    /**
     * @param sourceResource Resource to use to use to configure a resource planning IPAM Pool. If configured, the `locale` of the parent pool must match the region that the VPC resides in.
     * @return builder
     */
    inline def sourceResource(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.Builder]):
        com.pulumi.aws.ec2.VpcIpamPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.builder
      builder.sourceResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.Builder)
    /**
     * @param cidrAuthorizationContext Signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidrAuthorizationContext for more information.
     * @return builder
     */
    inline def cidrAuthorizationContext(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.Builder]):
        com.pulumi.aws.ec2.VpcIpamPoolCidrArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.builder
      builder.cidrAuthorizationContext(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder)
    /**
     * @param operatingRegions Regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     * @return builder
     */
    inline def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param organizationalUnitExclusions Add an Organizational Unit (OU) exclusion to IPAM. If IPAM is integrated with AWS Organizations and OU exclusion is added, IPAM will not manage the IP addresses in accounts in the OU exclusion. Refer to [IPAM Quotas](https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html) for the limit of exclusions that can be created.
     * @return builder
     */
    inline def organizationalUnitExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.Builder]*):
        com.pulumi.aws.ec2.VpcIpamResourceDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.builder
      builder.organizationalUnitExclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder)
    /**
     * @param accepter Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that accepts the peering connection (a maximum of one). See `accepter` Block below.
     * @return builder
     */
    inline def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that requests the peering connection (a maximum of one). See `requester` Block below.
     * @return builder
     */
    inline def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder)
    /**
     * @param accepter Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that accepts the peering connection (a maximum of one). See `accepter` Block below.
     * @return builder
     */
    inline def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that requests the peering connection (a maximum of one). See `requester` Block below.
     * @return builder
     */
    inline def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.Builder]):
        com.pulumi.aws.ec2.VpcPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.VpnConnectionArgs.Builder)
    /**
     * @param tunnel1LogOptions Options for logging VPN tunnel activity. See `tunnel1LogOptions` below for more details.
     * @return builder
     */
    inline def tunnel1LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.VpnConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.builder
      builder.tunnel1LogOptions(args(argsBuilder).build)

    /**
     * @param tunnel2LogOptions Options for logging VPN tunnel activity. See `tunnel2LogOptions` below for more details.
     * @return builder
     */
    inline def tunnel2LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.VpnConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.builder
      builder.tunnel2LogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder)
    /**
     * @param creationDateCondition Condition based on AMI creation date. See `creationDateCondition` below.
     * @return builder
     */
    inline def creationDateCondition(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionCreationDateConditionArgs.Builder]):
        com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionCreationDateConditionArgs.builder
      builder.creationDateCondition(args(argsBuilder).build)

    /**
     * @param deprecationTimeCondition Condition based on AMI deprecation time. See `deprecationTimeCondition` below.
     * @return builder
     */
    inline def deprecationTimeCondition(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionDeprecationTimeConditionArgs.Builder]):
        com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionDeprecationTimeConditionArgs.builder
      builder.deprecationTimeCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.AllowedImagesSettingsState.Builder)
    /**
     * @param imageCriterions List of image criteria. Maximum of 10 criterion blocks allowed. See `imageCriterion` below.
     * @return builder
     */
    inline def imageCriterions(args: Endofunction[com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AllowedImagesSettingsState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AllowedImagesSettingsImageCriterionArgs.builder
      builder.imageCriterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.AmiCopyState.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiCopyState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiCopyState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.AmiFromInstanceState.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiFromInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiFromInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.AmiState.Builder)
    /**
     * @param ebsBlockDevices Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.AmiState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.CapacityBlockReservationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.CapacityBlockReservationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.CapacityBlockReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.DefaultCreditSpecificationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultNetworkAclState.Builder)
    /**
     * @param egress Configuration block for an egress rule. Detailed below.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultNetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for an ingress rule. Detailed below.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultNetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultNetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultRouteTableState.Builder)
    /**
     * @param routes Set of objects. Detailed below
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultRouteTableState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultRouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.DefaultSecurityGroupState.Builder)
    /**
     * @param egress Configuration block. Detailed below.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block. Detailed below.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.DefaultSecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.EipDomainNameState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EipDomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder)
    /**
     * @param egressOnlyInternetGateway Encryption enforcement state for Egress-Only Internet Gateways. See `resource_exclusions.egress_only_internet_gateway` below.
     * @return builder
     */
    inline def egressOnlyInternetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.builder
      builder.egressOnlyInternetGateway(args(argsBuilder).build)

    /**
     * @param elasticFileSystem Encryption enforcement state for Elastic File System (EFS). See `resource_exclusions.elastic_file_system` below.
     * @return builder
     */
    inline def elasticFileSystem(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsElasticFileSystemArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsElasticFileSystemArgs.builder
      builder.elasticFileSystem(args(argsBuilder).build)

    /**
     * @param internetGateway Encryption enforcement state for Internet Gateways. See `resource_exclusions.internet_gateway` below.
     * @return builder
     */
    inline def internetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsInternetGatewayArgs.builder
      builder.internetGateway(args(argsBuilder).build)

    /**
     * @param lambda Encryption enforcement state for Lambda Functions. See `resource_exclusions.lambda` below.
     * @return builder
     */
    inline def lambda(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsLambdaArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    /**
     * @param natGateway Encryption enforcement state for NAT Gateways. See `resource_exclusions.nat_gateway` below.
     * @return builder
     */
    inline def natGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsNatGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsNatGatewayArgs.builder
      builder.natGateway(args(argsBuilder).build)

    /**
     * @param virtualPrivateGateway Encryption enforcement state for Virtual Private Gateways. See `resource_exclusions.virtual_private_gateway` below.
     * @return builder
     */
    inline def virtualPrivateGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.builder
      builder.virtualPrivateGateway(args(argsBuilder).build)

    /**
     * @param vpcLattice Encryption enforcement state for VPC Lattice. See `resource_exclusions.vpc_lattice` below.
     * @return builder
     */
    inline def vpcLattice(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcLatticeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcLatticeArgs.builder
      builder.vpcLattice(args(argsBuilder).build)

    /**
     * @param vpcPeering Encryption enforcement state for peered VPCs. See `resource_exclusions.vpc_peering` below.
     * @return builder
     */
    inline def vpcPeering(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcPeeringArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsVpcPeeringArgs.builder
      builder.vpcPeering(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.EncryptionControlState.Builder)
    /**
     * @param resourceExclusions State of exclusions from encryption enforcement. Will be `nil` if `mode` is `monitor`. See `resourceExclusions` below.
     * @return builder
     */
    inline def resourceExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlResourceExclusionsArgs.builder
      builder.resourceExclusions(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.EncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.EncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder)
    /**
     * @param launchTemplateSpecification Nested argument containing EC2 Launch Template to use. Defined below.
     * @return builder
     */
    inline def launchTemplateSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder
      builder.launchTemplateSpecification(args(argsBuilder).build)

    /**
     * @param overrides Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.Builder)
    /**
     * @param instanceRequirements Override the instance type in the Launch Template with instance types that satisfy the requirements.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum limits.
     * @return builder
     */
    inline def acceleratorCount(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    inline def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    inline def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    inline def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib The minimum and maximum amount of memory per vCPU, in GiB. Default is no minimum or maximum limits.
     * @return builder
     */
    inline def memoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is No minimum or maximum.
     * @return builder
     */
    inline def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    inline def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    inline def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    inline def vcpuCount(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder)
    /**
     * @param capacityReservationOptions The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity. Supported only for fleets of type `instant`.
     * @return builder
     */
    inline def capacityReservationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsCapacityReservationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsCapacityReservationOptionsArgs.builder
      builder.capacityReservationOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder)
    /**
     * @param maintenanceStrategies Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * @return builder
     */
    inline def maintenanceStrategies(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.builder
      builder.maintenanceStrategies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.Builder)
    /**
     * @param capacityRebalance Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * @return builder
     */
    inline def capacityRebalance(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs.builder
      builder.capacityRebalance(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FleetState.Builder)
    /**
     * @param fleetInstanceSets Information about the instances that were launched by the fleet. Available only when `type` is set to `instant`.
     * @return builder
     */
    inline def fleetInstanceSets(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetFleetInstanceSetArgs.builder
      builder.fleetInstanceSets(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Nested argument containing EC2 Launch Template configurations. Defined below.
     * @return builder
     */
    inline def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param onDemandOptions Nested argument containing On-Demand configurations. Defined below.
     * @return builder
     */
    inline def onDemandOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsArgs.builder
      builder.onDemandOptions(args(argsBuilder).build)

    /**
     * @param spotOptions Nested argument containing Spot configurations. Defined below.
     * @return builder
     */
    inline def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

    /**
     * @param targetCapacitySpecification Nested argument containing target capacity configurations. Defined below.
     * @return builder
     */
    inline def targetCapacitySpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs.builder
      builder.targetCapacitySpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.FlowLogState.Builder)
    /**
     * @param destinationOptions Destination options for a flow log. More details below.
     * @return builder
     */
    inline def destinationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.FlowLogState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs.builder
      builder.destinationOptions(args(argsBuilder).build)

    /**
     * @param tagFieldSpecifications Tag configuration for the Flow Logs Amazon EC2 Tags feature fields (e.g., `\$\${instance-tag}`) used in `logFormat`. More details below.
     * @return builder
     */
    inline def tagFieldSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.FlowLogTagFieldSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.FlowLogState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.FlowLogTagFieldSpecificationArgs.builder
      builder.tagFieldSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetAmiArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-images in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-images.html). See `filter` below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetAmiArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. For a full reference, check out [describe-images in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-images.html). See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetAmiIdsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetAmiIdsPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. For a full reference, check out [describe-images in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-images.html). See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiIdsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetAmiIdsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiIdsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetAmiPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-images in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-images.html). See `filter` below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetAmiFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetAmiPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetAmiFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCapacityBlockReservationFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.Builder)
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCoipPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCoipPoolPlainArgs.Builder)
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCoipPoolPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCoipPoolsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCoipPoolsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCoipPoolsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCoipPoolsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCoipPoolsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.Builder)
    /**
     * @param filters One or more [name-value pairs](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html) to filter by.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCustomerGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetCustomerGatewayPlainArgs.Builder)
    /**
     * @param filters One or more [name-value pairs](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html) to filter by.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetCustomerGatewayPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetCustomerGatewayFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetDedicatedHostArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetDedicatedHostPlainArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetDedicatedHostFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetDedicatedHostPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetDedicatedHostFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetEipsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetEipsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetEipsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetEipsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetEipsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetEipsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetElasticIpArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetElasticIpArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetElasticIpPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetElasticIpFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetElasticIpPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetElasticIpFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetHostsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeHosts.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetHostsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetHostsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetHostsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetHostsPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeHosts.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetHostsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetHostsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetHostsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceArgs.Builder)
    /**
     * @param filters One or more filters to apply to the search.
     * If multiple `filter` blocks are provided, they all must be true.
     * For a full reference of filter names, see [describe-instances in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html).
     * See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstancePlainArgs.Builder)
    /**
     * @param filters One or more filters to apply to the search.
     * If multiple `filter` blocks are provided, they all must be true.
     * For a full reference of filter names, see [describe-instances in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html).
     * See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstancePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypeOfferingsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstanceTypesPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstanceTypesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstanceTypesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstanceTypesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstancesArgs.Builder)
    /**
     * @param filters One or more filters to apply to the search.
     * If multiple `filter` blocks are provided, they all must be true.
     * For a full reference of filter names, see [describe-instances in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html).
     * See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstancesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInstancesPlainArgs.Builder)
    /**
     * @param filters One or more filters to apply to the search.
     * If multiple `filter` blocks are provided, they all must be true.
     * For a full reference of filter names, see [describe-instances in the AWS CLI reference](http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html).
     * See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInstancesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInstancesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInstancesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInternetGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetInternetGatewayPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetInternetGatewayFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetInternetGatewayPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetInternetGatewayFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetKeyPairArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetKeyPairArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetKeyPairPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetKeyPairFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetKeyPairPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetKeyPairFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLaunchTemplatePlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLaunchTemplatePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.Builder)
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablePlainArgs.Builder)
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTableFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfacePlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfacePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewaysArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetLocalGatewaysPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetLocalGatewaysPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * 
     * The arguments of this data source act as filters for querying the available
     * prefix lists. The given filters must match exactly one prefix list
     * whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetManagedPrefixListArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetManagedPrefixListPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * 
     * The arguments of this data source act as filters for querying the available
     * prefix lists. The given filters must match exactly one prefix list
     * whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetManagedPrefixListPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetManagedPrefixListsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetManagedPrefixListsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetManagedPrefixListsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetManagedPrefixListsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetManagedPrefixListsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * The arguments of this data source act as filters for querying the available
     * NAT Gateways in the current Region. The given filters must match exactly one
     * NAT Gateway whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNatGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNatGatewayPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * 
     * The arguments of this data source act as filters for querying the available
     * NAT Gateways in the current Region. The given filters must match exactly one
     * NAT Gateway whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewayFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNatGatewayPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewayFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNatGatewaysArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNatGatewaysPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNatGatewaysFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNatGatewaysPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNatGatewaysFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkAclsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkAclsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkAclsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkAclsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkAclsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * 
     * The arguments of this data source act as filters for querying the available
     * Network Insights Analyzes. The given filters must match exactly one Network Insights Analysis
     * whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * 
     * The arguments of this data source act as filters for querying the available
     * Network Insights Analyzes. The given filters must match exactly one Network Insights Analysis
     * whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsAnalysisFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * 
     * The arguments of this data source act as filters for querying the available
     * Network Insights Paths. The given filters must match exactly one Network Insights Path
     * whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * 
     * The arguments of this data source act as filters for querying the available
     * Network Insights Paths. The given filters must match exactly one Network Insights Path
     * whose data will be exported as attributes.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInsightsPathFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInterfacePlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInterfacePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfaceFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInterfacesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetNetworkInterfacesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetNetworkInterfacesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetPrefixListArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetPrefixListArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetPrefixListPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPrefixListFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetPrefixListPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetPrefixListFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetPublicIpv4PoolsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetRouteTableArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTableFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetRouteTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTableFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetRouteTablePlainArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTableFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetRouteTablePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTableFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetRouteTablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetRouteTablesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetRouteTablesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetRouteTablesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetRouteTablesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSecurityGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSecurityGroupPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSecurityGroupPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-security-groups.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSecurityGroupsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSecurityGroupsPlainArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-security-groups.html).
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSecurityGroupsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeServiceLinkVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacePlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeServiceLinkVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfaceFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeServiceLinkVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesPlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeServiceLinkVirtualInterfaces.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetServiceLinkVirtualInterfacesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPriceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSpotPriceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPriceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSpotPricePlainArgs.Builder)
    /**
     * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html) for supported filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSpotPriceFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSpotPricePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSpotPriceFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSubnetArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSubnetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSubnetPlainArgs.Builder)
    /**
     * @param filters Configuration block. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSubnetPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSubnetsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSubnetsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetSubnetsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetSubnetsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetSubnetsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetSubnetsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetTransitGatewayRouteTablesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcArgs.Builder)
    /**
     * @param filters Custom filter block as described below. See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.Builder)
    /**
     * @param filters List of custom filters as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsPlainArgs.Builder)
    /**
     * @param filters List of custom filters as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcEndpointPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcEndpointPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcEndpointServicePlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcEndpointServicePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolCidrsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamPoolsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcIpamsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcIpamsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcIpamsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcIpamsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below. See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcsArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpcsPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpcsFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpcsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpcsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpnConnectionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpnConnectionPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnConnectionFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpnConnectionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnConnectionFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayFilterArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpnGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.GetVpnGatewayPlainArgs.Builder)
    /**
     * @param filters Custom filter block as described below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ec2.inputs.GetVpnGatewayFilter.Builder]*):
        com.pulumi.aws.ec2.inputs.GetVpnGatewayPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.GetVpnGatewayFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     * For more information, see the documentation on [Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html).
     * @return builder
     */
    inline def capacityReservationTarget(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder)
    /**
     * @param spotOptions Block to configure the options for Spot Instances. See Spot Options below for details on attributes.
     * @return builder
     */
    inline def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.InstanceState.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    inline def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    inline def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    inline def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    inline def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceMarketOptions Describes the market (purchasing) option for the instances. See Market Options below for details on attributes.
     * @return builder
     */
    inline def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    inline def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    inline def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated("network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.") inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryNetworkInterface The primary network interface. See Primary Network Interface below.
     * @return builder
     */
    inline def primaryNetworkInterface(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrimaryNetworkInterfaceArgs.builder
      builder.primaryNetworkInterface(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    inline def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstancePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    inline def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.InstanceRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    inline def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.InstanceSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder)
    /**
     * @param ebsBlockDevices Additional EBS block devices to attach to the instance. See Block Devices below for details.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralBlockDevices Customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataOptions The metadata options for the instance.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Customize details about the root block device of the instance. See Block Devices below for details.
     * @return builder
     */
    inline def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder)
    /**
     * @param ebs Configure EBS volume properties.
     * @return builder
     */
    inline def ebs(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingEbsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingEbsArgs.builder
      builder.ebs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Used to target a specific Capacity Reservation:
     * @return builder
     */
    inline def capacityReservationTarget(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder)
    /**
     * @param spotOptions The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
     * @return builder
     */
    inline def spotOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsSpotOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsSpotOptionsArgs.builder
      builder.spotOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * @return builder
     */
    inline def acceleratorCount(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    inline def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    inline def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    inline def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * @return builder
     */
    inline def memoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps Block describing the minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is no minimum or maximum.
     * @return builder
     */
    inline def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    inline def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    inline def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    inline def vcpuCount(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder)
    /**
     * @param connectionTrackingSpecification The Connection Tracking Configuration for the network interface. See [Amazon EC2 security group connection tracking](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts)
     * @return builder
     */
    inline def connectionTrackingSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceConnectionTrackingSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceConnectionTrackingSpecificationArgs.builder
      builder.connectionTrackingSpecification(args(argsBuilder).build)

    /**
     * @param enaSrdSpecification Configuration for Elastic Network Adapter (ENA) Express settings. Applies to network interfaces that use the [ena Express](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking-ena-express.html) feature. See details below.
     * @return builder
     */
    inline def enaSrdSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.builder
      builder.enaSrdSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.Builder)
    /**
     * @param enaSrdUdpSpecification Configuration for ENA Express UDP optimization. See details below.
     * @return builder
     */
    inline def enaSrdUdpSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationEnaSrdUdpSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceEnaSrdSpecificationEnaSrdUdpSpecificationArgs.builder
      builder.enaSrdUdpSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder)
    /**
     * @param blockDeviceMappings Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * See Block Devices below for details.
     * @return builder
     */
    inline def blockDeviceMappings(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingArgs.builder
      builder.blockDeviceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param capacityReservationSpecification Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    inline def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    inline def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     * @return builder
     */
    inline def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    inline def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param hibernationOptions The hibernation options for the instance. See Hibernation Options below for more details.
     * @return builder
     */
    inline def hibernationOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateHibernationOptionsArgs.builder
      builder.hibernationOptions(args(argsBuilder).build)

    /**
     * @param iamInstanceProfile The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     * @return builder
     */
    inline def iamInstanceProfile(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateIamInstanceProfileArgs.builder
      builder.iamInstanceProfile(args(argsBuilder).build)

    /**
     * @param instanceMarketOptions The market (purchasing) option for the instance. See Market Options
     * below for details.
     * @return builder
     */
    inline def instanceMarketOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsArgs.builder
      builder.instanceMarketOptions(args(argsBuilder).build)

    /**
     * @param instanceRequirements The attribute requirements for the type of instance. If present then `instanceType` cannot be present.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param licenseSpecifications A list of license specifications to associate with. See License Specification below for more details.
     * @return builder
     */
    inline def licenseSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateLicenseSpecificationArgs.builder
      builder.licenseSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceOptions The maintenance options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    inline def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options for the instance. See Metadata Options below for more details.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param monitoring The monitoring option for the instance. See Monitoring below for more details.
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    inline def networkPerformanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateNetworkPerformanceOptionsArgs.builder
      builder.networkPerformanceOptions(args(argsBuilder).build)

    /**
     * @param placement The placement of the instance. See Placement below for more details.
     * @return builder
     */
    inline def placement(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param privateDnsNameOptions The options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    inline def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplatePrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param secondaryInterfaces Secondary interfaces to associate with instances launched from the template. See Secondary
     * Interfaces below for more details.
     * @return builder
     */
    inline def secondaryInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateSecondaryInterfaceArgs.builder
      builder.secondaryInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param tagSpecifications The tags to apply to the resources during launch. See Tag Specifications below for more details. Default tags are currently not propagated to ASG created resources so you may wish to inject your default tags into this variable against the relevant child resource types created.
     * @return builder
     */
    inline def tagSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.LaunchTemplateState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.LaunchTemplateTagSpecificationArgs.builder
      builder.tagSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.LocalGatewayRouteTableState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.LocalGatewayRouteTableTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.LocalGatewayRouteTableState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.LocalGatewayRouteTableTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.ManagedPrefixListState.Builder)
    /**
     * @param entries Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     * @return builder
     */
    inline def entries(args: Endofunction[com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.ManagedPrefixListState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.ManagedPrefixListEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayEipAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NatGatewayState.Builder)
    /**
     * @param availabilityZoneAddresses Repeatable configuration block for the Elastic IP addresses (EIPs) and availability zones for the regional NAT gateway. When not specified, the regional NAT gateway will automatically expand to new AZs and associate EIPs upon detection of an elastic network interface (auto mode). When specified, auto-expansion is disabled (manual mode). See `availabilityZoneAddress` below for details.
     * @return builder
     */
    inline def availabilityZoneAddresses(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NatGatewayState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayAvailabilityZoneAddressArgs.builder
      builder.availabilityZoneAddresses(args.map(_(argsBuilder).build)*)

    /**
     * @param regionalNatGatewayAddresses (regional NAT gateways only) Repeatable blocks for information about the IP addresses and network interface associated with the regional NAT gateway.
     * @return builder
     */
    inline def regionalNatGatewayAddresses(args: Endofunction[com.pulumi.aws.ec2.inputs.NatGatewayRegionalNatGatewayAddressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NatGatewayState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NatGatewayRegionalNatGatewayAddressArgs.builder
      builder.regionalNatGatewayAddresses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkAclState.Builder)
    /**
     * @param egress Specifies an egress rule. Parameters defined below.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Specifies an ingress rule. Parameters defined below.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkAclState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.Builder)
    /**
     * @param destination Path statement for the destination.
     * See `source` and `destination` below for details.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Path statement for the source.
     * See `source` and `destination` below for details.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param throughResources Path statement for through resources.
     * See `throughResources` below for details.
     * @return builder
     */
    inline def throughResources(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathThroughResourceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathThroughResourceArgs.builder
      builder.throughResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationArgs.Builder)
    /**
     * @param packetHeaderStatement Packet header statement.
     * See `packetHeaderStatement` below for details.
     * @return builder
     */
    inline def packetHeaderStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationPacketHeaderStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationPacketHeaderStatementArgs.builder
      builder.packetHeaderStatement(args(argsBuilder).build)

    inline def resourceStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationResourceStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathDestinationResourceStatementArgs.builder
      builder.resourceStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceArgs.Builder)
    /**
     * @param packetHeaderStatement Packet header statement.
     * See `packetHeaderStatement` below for details.
     * @return builder
     */
    inline def packetHeaderStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourcePacketHeaderStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourcePacketHeaderStatementArgs.builder
      builder.packetHeaderStatement(args(argsBuilder).build)

    /**
     * @param resourceStatement Resource statement.
     * Exactly one of `resources` or `resourceTypes` must be specified.
     * See `resourceStatement` below for details.
     * @return builder
     */
    inline def resourceStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceResourceStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathSourceResourceStatementArgs.builder
      builder.resourceStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathThroughResourceArgs.Builder)
    /**
     * @param resourceStatement Resource statement.
     * Exactly one of `resources` or `resourceTypes` must be specified.
     * See `resourceStatement` below for details.
     * @return builder
     */
    inline def resourceStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathThroughResourceResourceStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathThroughResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathThroughResourceResourceStatementArgs.builder
      builder.resourceStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.Builder)
    /**
     * @param destination Path statement for the destination.
     * See `source` and `destination` below for details.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source Path statement for the source.
     * See `source` and `destination` below for details.
     * @return builder
     */
    inline def source(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationArgs.Builder)
    /**
     * @param packetHeaderStatement Packet header statement.
     * See `packetHeaderStatement` below for details.
     * @return builder
     */
    inline def packetHeaderStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationPacketHeaderStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationPacketHeaderStatementArgs.builder
      builder.packetHeaderStatement(args(argsBuilder).build)

    inline def resourceStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationResourceStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathDestinationResourceStatementArgs.builder
      builder.resourceStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceArgs.Builder)
    /**
     * @param packetHeaderStatement Packet header statement.
     * See `packetHeaderStatement` below for details.
     * @return builder
     */
    inline def packetHeaderStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourcePacketHeaderStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourcePacketHeaderStatementArgs.builder
      builder.packetHeaderStatement(args(argsBuilder).build)

    /**
     * @param resourceStatement Resource statement.
     * Exactly one of `resources` or `resourceTypes` must be specified.
     * See `resourceStatement` below for details.
     * @return builder
     */
    inline def resourceStatement(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceResourceStatementArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathSourceResourceStatementArgs.builder
      builder.resourceStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeState.Builder)
    /**
     * @param excludePaths Set of access scope path statements to exclude.
     * See `excludePaths` below for details.
     * @return builder
     */
    inline def excludePaths(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeExcludePathArgs.builder
      builder.excludePaths(args.map(_(argsBuilder).build)*)

    /**
     * @param matchPaths Set of access scope path statements to match.
     * At least one must be specified.
     * See `matchPaths` below for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def matchPaths(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAccessScopeMatchPathArgs.builder
      builder.matchPaths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.Builder)
    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder)
    inline def aclRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclRuleArgs.builder
      builder.aclRules(args.map(_(argsBuilder).build)*)

    inline def acls(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAclArgs.builder
      builder.acls(args.map(_(argsBuilder).build)*)

    inline def attachedTos(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAttachedToArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationAttachedToArgs.builder
      builder.attachedTos(args.map(_(argsBuilder).build)*)

    inline def classicLoadBalancerListeners(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationClassicLoadBalancerListenerArgs.builder
      builder.classicLoadBalancerListeners(args.map(_(argsBuilder).build)*)

    inline def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    inline def customerGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationCustomerGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationCustomerGatewayArgs.builder
      builder.customerGateways(args.map(_(argsBuilder).build)*)

    inline def destinationVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationVpcArgs.builder
      builder.destinationVpcs(args.map(_(argsBuilder).build)*)

    inline def destinations(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    inline def elasticLoadBalancerListeners(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationElasticLoadBalancerListenerArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationElasticLoadBalancerListenerArgs.builder
      builder.elasticLoadBalancerListeners(args.map(_(argsBuilder).build)*)

    inline def ingressRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationIngressRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationIngressRouteTableArgs.builder
      builder.ingressRouteTables(args.map(_(argsBuilder).build)*)

    inline def internetGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationInternetGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationInternetGatewayArgs.builder
      builder.internetGateways(args.map(_(argsBuilder).build)*)

    inline def loadBalancerTargetGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.builder
      builder.loadBalancerTargetGroup(args.map(_(argsBuilder).build)*)

    inline def loadBalancerTargetGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationLoadBalancerTargetGroupArgs.builder
      builder.loadBalancerTargetGroups(args.map(_(argsBuilder).build)*)

    inline def natGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNatGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNatGatewayArgs.builder
      builder.natGateways(args.map(_(argsBuilder).build)*)

    inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

    inline def prefixLists(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPrefixListArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationPrefixListArgs.builder
      builder.prefixLists(args.map(_(argsBuilder).build)*)

    inline def routeTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableRouteArgs.builder
      builder.routeTableRoutes(args.map(_(argsBuilder).build)*)

    inline def routeTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationRouteTableArgs.builder
      builder.routeTables(args.map(_(argsBuilder).build)*)

    inline def securityGroup(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.builder
      builder.securityGroup(args.map(_(argsBuilder).build)*)

    inline def securityGroupRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.builder
      builder.securityGroupRules(args.map(_(argsBuilder).build)*)

    inline def securityGroups(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupArgs.builder
      builder.securityGroups(args.map(_(argsBuilder).build)*)

    inline def sourceVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSourceVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSourceVpcArgs.builder
      builder.sourceVpcs(args.map(_(argsBuilder).build)*)

    inline def subnetRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetRouteTableArgs.builder
      builder.subnetRouteTables(args.map(_(argsBuilder).build)*)

    inline def subnets(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    inline def transitGatewayAttachments(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayAttachmentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayAttachmentArgs.builder
      builder.transitGatewayAttachments(args.map(_(argsBuilder).build)*)

    inline def transitGatewayRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableRouteArgs.builder
      builder.transitGatewayRouteTableRoutes(args.map(_(argsBuilder).build)*)

    inline def transitGatewayRouteTables(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayRouteTableArgs.builder
      builder.transitGatewayRouteTables(args.map(_(argsBuilder).build)*)

    inline def transitGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationTransitGatewayArgs.builder
      builder.transitGateways(args.map(_(argsBuilder).build)*)

    inline def vpcEndpoints(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcEndpointArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcEndpointArgs.builder
      builder.vpcEndpoints(args.map(_(argsBuilder).build)*)

    inline def vpcPeeringConnections(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcPeeringConnectionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcPeeringConnectionArgs.builder
      builder.vpcPeeringConnections(args.map(_(argsBuilder).build)*)

    inline def vpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

    inline def vpnConnections(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnConnectionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnConnectionArgs.builder
      builder.vpnConnections(args.map(_(argsBuilder).build)*)

    inline def vpnGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationVpnGatewayArgs.builder
      builder.vpnGateways(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.Builder)
    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationSecurityGroupRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.Builder)
    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.Builder)
    inline def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder)
    inline def aclRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAclRuleArgs.builder
      builder.aclRules(args.map(_(argsBuilder).build)*)

    inline def additionalDetails(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs.builder
      builder.additionalDetails(args.map(_(argsBuilder).build)*)

    inline def attachedTos(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAttachedToArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAttachedToArgs.builder
      builder.attachedTos(args.map(_(argsBuilder).build)*)

    inline def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    inline def destinationVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentDestinationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentDestinationVpcArgs.builder
      builder.destinationVpcs(args.map(_(argsBuilder).build)*)

    inline def inboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.builder
      builder.inboundHeaders(args.map(_(argsBuilder).build)*)

    inline def outboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.builder
      builder.outboundHeaders(args.map(_(argsBuilder).build)*)

    inline def routeTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentRouteTableRouteArgs.builder
      builder.routeTableRoutes(args.map(_(argsBuilder).build)*)

    inline def securityGroupRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.builder
      builder.securityGroupRules(args.map(_(argsBuilder).build)*)

    inline def sourceVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSourceVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSourceVpcArgs.builder
      builder.sourceVpcs(args.map(_(argsBuilder).build)*)

    inline def subnets(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSubnetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    inline def transitGatewayRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteArgs.builder
      builder.transitGatewayRouteTableRoutes(args.map(_(argsBuilder).build)*)

    inline def transitGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentTransitGatewayArgs.builder
      builder.transitGateways(args.map(_(argsBuilder).build)*)

    inline def vpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder)
    inline def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    inline def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentInboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder)
    inline def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    inline def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentOutboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.Builder)
    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.Builder)
    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.Builder)
    inline def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder)
    inline def aclRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs.builder
      builder.aclRules(args.map(_(argsBuilder).build)*)

    inline def additionalDetails(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs.builder
      builder.additionalDetails(args.map(_(argsBuilder).build)*)

    inline def attachedTos(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs.builder
      builder.attachedTos(args.map(_(argsBuilder).build)*)

    inline def components(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs.builder
      builder.components(args.map(_(argsBuilder).build)*)

    inline def destinationVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs.builder
      builder.destinationVpcs(args.map(_(argsBuilder).build)*)

    inline def inboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.builder
      builder.inboundHeaders(args.map(_(argsBuilder).build)*)

    inline def outboundHeaders(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.builder
      builder.outboundHeaders(args.map(_(argsBuilder).build)*)

    inline def routeTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs.builder
      builder.routeTableRoutes(args.map(_(argsBuilder).build)*)

    inline def securityGroupRules(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.builder
      builder.securityGroupRules(args.map(_(argsBuilder).build)*)

    inline def sourceVpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs.builder
      builder.sourceVpcs(args.map(_(argsBuilder).build)*)

    inline def subnets(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs.builder
      builder.subnets(args.map(_(argsBuilder).build)*)

    inline def transitGatewayRouteTableRoutes(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs.builder
      builder.transitGatewayRouteTableRoutes(args.map(_(argsBuilder).build)*)

    inline def transitGateways(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs.builder
      builder.transitGateways(args.map(_(argsBuilder).build)*)

    inline def vpcs(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs.builder
      builder.vpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder)
    inline def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    inline def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder)
    inline def destinationPortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderDestinationPortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderDestinationPortRangeArgs.builder
      builder.destinationPortRanges(args.map(_(argsBuilder).build)*)

    inline def sourcePortRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderSourcePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderSourcePortRangeArgs.builder
      builder.sourcePortRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.Builder)
    inline def portRanges(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRulePortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder)
    /**
     * @param alternatePathHints Potential intermediate components of a feasible path. Described below.
     * @return builder
     */
    inline def alternatePathHints(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisAlternatePathHintArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisAlternatePathHintArgs.builder
      builder.alternatePathHints(args.map(_(argsBuilder).build)*)

    /**
     * @param explanations Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
     * @return builder
     */
    inline def explanations(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisExplanationArgs.builder
      builder.explanations(args.map(_(argsBuilder).build)*)

    /**
     * @param forwardPathComponents The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * @return builder
     */
    inline def forwardPathComponents(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentArgs.builder
      builder.forwardPathComponents(args.map(_(argsBuilder).build)*)

    /**
     * @param returnPathComponents The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * @return builder
     */
    inline def returnPathComponents(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisReturnPathComponentArgs.builder
      builder.returnPathComponents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder)
    /**
     * @param destinationPortRange The destination port range. See below for details.
     * @return builder
     */
    inline def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange The source port range. See below for details.
     * @return builder
     */
    inline def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder)
    /**
     * @param destinationPortRange The destination port range. See below for details.
     * @return builder
     */
    inline def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange The source port range. See below for details.
     * @return builder
     */
    inline def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInsightsPathState.Builder)
    /**
     * @param filterAtDestination Scopes the analysis to network paths that match specific filters at the destination. If you specify this parameter, you can&#39;t specify `destinationIp`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    inline def filterAtDestination(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtDestinationArgs.builder
      builder.filterAtDestination(args(argsBuilder).build)

    /**
     * @param filterAtSource Scopes the analysis to network paths that match specific filters at the source. If you specify this parameter, you can&#39;t specify `sourceIp` or `destinationPort`. See below for details. Note that Terraform performs drift detection on this argument only when the value is provided.
     * @return builder
     */
    inline def filterAtSource(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInsightsPathState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInsightsPathFilterAtSourceArgs.builder
      builder.filterAtSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationArgs.Builder)
    /**
     * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic. See ENA SRD UDP Specification below for more details.
     * @return builder
     */
    inline def enaSrdUdpSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationEnaSrdUdpSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationEnaSrdUdpSpecificationArgs.builder
      builder.enaSrdUdpSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfacePermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.NetworkInterfaceState.Builder)
    /**
     * @param attachments Configuration block to define the attachment of the ENI. See Attachment below for more details!
     * @return builder
     */
    inline def attachments(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.NetworkInterfaceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs.builder
      builder.attachments(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionTrackingSpecification Configures the [connection tracking timeouts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-connection-tracking.html#connection-tracking-timeouts) for the network interface. See Connection Tracking Specification below for more details.
     * @return builder
     */
    inline def connectionTrackingSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceConnectionTrackingSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInterfaceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceConnectionTrackingSpecificationArgs.builder
      builder.connectionTrackingSpecification(args(argsBuilder).build)

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface. The ENI must be attached to an instance to configure ENA Express. See ENA SRD Specification below for more details.
     * @return builder
     */
    inline def enaSrdSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.NetworkInterfaceState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.NetworkInterfaceEnaSrdSpecificationArgs.builder
      builder.enaSrdSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState.Builder)
    /**
     * @param accepter Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that accepts the peering connection (a maximum of one). See `accepter` Block below.
     * @return builder
     */
    inline def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that requests the peering connection (a maximum of one). See `requester` Block below.
     * @return builder
     */
    inline def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.RouteTableState.Builder)
    /**
     * @param routes A list of route objects. Their keys are documented below.
     * This means that omitting this argument is interpreted as ignoring any existing routes. To remove all managed routes an empty list should be specified. See the example above.
     * 
     * &gt; **NOTE on Route Tables and Routes:** This provider currently provides both a standalone Route resource (`aws.ec2.Route`) and a Route Table resource with routes defined in-line (`aws.ec2.RouteTable`). At this time you cannot use a `aws.ec2.RouteTable` inline `route` blocks in conjunction with any `aws.ec2.Route` resources. Doing so will cause a conflict of rule settings and will overwrite rules.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.RouteTableState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.RouteTableRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SecondaryNetworkState.Builder)
    /**
     * @param ipv4CidrBlockAssociations A list of IPv4 CIDR block associations for the secondary network.
     * @return builder
     */
    inline def ipv4CidrBlockAssociations(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondaryNetworkIpv4CidrBlockAssociationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecondaryNetworkState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecondaryNetworkIpv4CidrBlockAssociationArgs.builder
      builder.ipv4CidrBlockAssociations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SecondaryNetworkState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondaryNetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SecondarySubnetState.Builder)
    /**
     * @param ipv4CidrBlockAssociations A list of IPv4 CIDR block associations for the secondary network.
     * @return builder
     */
    inline def ipv4CidrBlockAssociations(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondarySubnetIpv4CidrBlockAssociationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecondarySubnetState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecondarySubnetIpv4CidrBlockAssociationArgs.builder
      builder.ipv4CidrBlockAssociations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SecondarySubnetState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SecondarySubnetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SecurityGroupState.Builder)
    /**
     * @param egress Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    inline def egress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs.builder
      builder.egress(args.map(_(argsBuilder).build)*)

    /**
     * @param ingress Configuration block for ingress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below. This argument is processed in attribute-as-blocks mode.
     * @return builder
     */
    inline def ingress(args: Endofunction[com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SecurityGroupState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs.builder
      builder.ingress(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder)
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    inline def rootBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs.builder
      builder.rootBlockDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder)
    /**
     * @param launchTemplateSpecification Launch template specification. See Launch Template Specification below for more details.
     * @return builder
     */
    inline def launchTemplateSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder
      builder.launchTemplateSpecification(args(argsBuilder).build)

    /**
     * @param overrides One or more override configurations. See Overrides below for more details.
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.Builder)
    /**
     * @param instanceRequirements The instance requirements. See below.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * @return builder
     */
    inline def acceleratorCount(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    inline def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    inline def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    inline def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * @return builder
     */
    inline def memoryMib(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps Block describing the minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is no minimum or maximum.
     * @return builder
     */
    inline def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    inline def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    inline def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    inline def vcpuCount(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder)
    /**
     * @param capacityRebalance Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * @return builder
     */
    inline def capacityRebalance(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceArgs.builder
      builder.capacityRebalance(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder)
    /**
     * @param launchSpecifications Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     * 
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     * @return builder
     */
    inline def launchSpecifications(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs.builder
      builder.launchSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplateConfigs Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     * @return builder
     */
    inline def launchTemplateConfigs(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs.builder
      builder.launchTemplateConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param spotMaintenanceStrategies Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * @return builder
     */
    inline def spotMaintenanceStrategies(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotFleetRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotFleetRequestSpotMaintenanceStrategiesArgs.builder
      builder.spotMaintenanceStrategies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     * For more information, see the documentation on [Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html).
     * @return builder
     */
    inline def capacityReservationTarget(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder)
    /**
     * @param capacityReservationSpecification Describes an instance&#39;s Capacity Reservation targeting option. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    inline def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param cpuOptions The CPU options for the instance. See CPU Options below for more details.
     * @return builder
     */
    inline def cpuOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCpuOptionsArgs.builder
      builder.cpuOptions(args(argsBuilder).build)

    /**
     * @param creditSpecification Configuration block for customizing the credit specification of the instance. See Credit Specification below for more details. This provider will only perform drift detection of its value when present in a configuration. Removing this configuration on existing instances will only stop managing it. It will not change the configuration back to the default for the instance type.
     * @return builder
     */
    inline def creditSpecification(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestCreditSpecificationArgs.builder
      builder.creditSpecification(args(argsBuilder).build)

    /**
     * @param ebsBlockDevices One or more configuration blocks with additional EBS block devices to attach to the instance. Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ebsBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEbsBlockDeviceArgs.builder
      builder.ebsBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param enclaveOptions Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     * @return builder
     */
    inline def enclaveOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEnclaveOptionsArgs.builder
      builder.enclaveOptions(args(argsBuilder).build)

    /**
     * @param ephemeralBlockDevices One or more configuration blocks to customize Ephemeral (also known as &#34;Instance Store&#34;) volumes on the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a set of objects.
     * @return builder
     */
    inline def ephemeralBlockDevices(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestEphemeralBlockDeviceArgs.builder
      builder.ephemeralBlockDevices(args.map(_(argsBuilder).build)*)

    /**
     * @param launchTemplate Specifies a Launch Template to configure the instance. Parameters configured on this resource will override the corresponding parameters in the Launch Template. See Launch Template Specification below for more details.
     * @return builder
     */
    inline def launchTemplate(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param maintenanceOptions Maintenance and recovery options for the instance. See Maintenance Options below for more details.
     * @return builder
     */
    inline def maintenanceOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMaintenanceOptionsArgs.builder
      builder.maintenanceOptions(args(argsBuilder).build)

    /**
     * @param metadataOptions Customize the metadata options of the instance. See Metadata Options below for more details.
     * @return builder
     */
    inline def metadataOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaces Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
     * @return builder
     * @deprecated network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.
     */
    @deprecated("network_interface is deprecated. To specify the primary network interface, use primaryNetworkInterface instead. To attach additional network interfaces, use the aws.ec2.NetworkInterfaceAttachment resource.") inline def networkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryNetworkInterfaces The primary network interface. See Primary Network Interface below.
     * @return builder
     */
    inline def primaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrimaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrimaryNetworkInterfaceArgs.builder
      builder.primaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param privateDnsNameOptions Options for the instance hostname. The default values are inherited from the subnet. See Private DNS Name Options below for more details.
     * @return builder
     */
    inline def privateDnsNameOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestPrivateDnsNameOptionsArgs.builder
      builder.privateDnsNameOptions(args(argsBuilder).build)

    /**
     * @param rootBlockDevice Configuration block to customize details about the root block device of the instance. See Block Devices below for details. When accessing this as an attribute reference, it is a list containing one object.
     * @return builder
     */
    inline def rootBlockDevice(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestRootBlockDeviceArgs.builder
      builder.rootBlockDevice(args(argsBuilder).build)

    /**
     * @param secondaryNetworkInterfaces One or more secondary network interfaces to attach to the instance at launch time. See Secondary Network Interface below for more details.
     * @return builder
     */
    inline def secondaryNetworkInterfaces(args: Endofunction[com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.SpotInstanceRequestState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.SpotInstanceRequestSecondaryNetworkInterfaceArgs.builder
      builder.secondaryNetworkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleState.Builder)
    /**
     * @param destinationPortRange Destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    inline def destinationPortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleDestinationPortRangeArgs.builder
      builder.destinationPortRange(args(argsBuilder).build)

    /**
     * @param sourcePortRange Source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
     * @return builder
     */
    inline def sourcePortRange(args: Endofunction[com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.TrafficMirrorFilterRuleSourcePortRangeArgs.builder
      builder.sourcePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessExclusionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcBlockPublicAccessOptionsTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder)
    /**
     * @param egressOnlyInternetGateway Encryption enforcement state for Egress-Only Internet Gateways. See `resource_exclusions.egress_only_internet_gateway` below.
     * @return builder
     */
    inline def egressOnlyInternetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsEgressOnlyInternetGatewayArgs.builder
      builder.egressOnlyInternetGateway(args(argsBuilder).build)

    /**
     * @param elasticFileSystem Encryption enforcement state for Elastic File System (EFS). See `resource_exclusions.elastic_file_system` below.
     * @return builder
     */
    inline def elasticFileSystem(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsElasticFileSystemArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsElasticFileSystemArgs.builder
      builder.elasticFileSystem(args(argsBuilder).build)

    /**
     * @param internetGateway Encryption enforcement state for Internet Gateways. See `resource_exclusions.internet_gateway` below.
     * @return builder
     */
    inline def internetGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsInternetGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsInternetGatewayArgs.builder
      builder.internetGateway(args(argsBuilder).build)

    /**
     * @param lambda Encryption enforcement state for Lambda Functions. See `resource_exclusions.lambda` below.
     * @return builder
     */
    inline def lambda(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsLambdaArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    /**
     * @param natGateway Encryption enforcement state for NAT Gateways. See `resource_exclusions.nat_gateway` below.
     * @return builder
     */
    inline def natGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsNatGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsNatGatewayArgs.builder
      builder.natGateway(args(argsBuilder).build)

    /**
     * @param virtualPrivateGateway Encryption enforcement state for Virtual Private Gateways. See `resource_exclusions.virtual_private_gateway` below.
     * @return builder
     */
    inline def virtualPrivateGateway(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVirtualPrivateGatewayArgs.builder
      builder.virtualPrivateGateway(args(argsBuilder).build)

    /**
     * @param vpcLattice Encryption enforcement state for VPC Lattice. See `resource_exclusions.vpc_lattice` below.
     * @return builder
     */
    inline def vpcLattice(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcLatticeArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcLatticeArgs.builder
      builder.vpcLattice(args(argsBuilder).build)

    /**
     * @param vpcPeering Encryption enforcement state for peered VPCs. See `resource_exclusions.vpc_peering` below.
     * @return builder
     */
    inline def vpcPeering(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcPeeringArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsVpcPeeringArgs.builder
      builder.vpcPeering(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEncryptionControlState.Builder)
    /**
     * @param resourceExclusions State of exclusions from encryption enforcement. Will be `nil` if `mode` is `monitor`. See `resourceExclusions` below.
     * @return builder
     */
    inline def resourceExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlResourceExclusionsArgs.builder
      builder.resourceExclusions(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEncryptionControlState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEncryptionControlTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEndpointServiceState.Builder)
    /**
     * @param privateDnsNameConfigurations List of objects containing information about the endpoint service private DNS name configuration.
     * @return builder
     */
    inline def privateDnsNameConfigurations(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcEndpointServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationArgs.builder
      builder.privateDnsNameConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder)
    /**
     * @param dnsEntries DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. See `dnsEntry` below.
     * @return builder
     */
    inline def dnsEntries(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointDnsEntryArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointDnsEntryArgs.builder
      builder.dnsEntries(args.map(_(argsBuilder).build)*)

    /**
     * @param dnsOptions DNS options for the endpoint. See `dnsOptions` below.
     * @return builder
     */
    inline def dnsOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs.builder
      builder.dnsOptions(args(argsBuilder).build)

    /**
     * @param subnetConfigurations Subnet configuration for the endpoint, used to select specific IPv4 and/or IPv6 addresses to the endpoint. See subnetConfiguration below.
     * @return builder
     */
    inline def subnetConfigurations(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcEndpointSubnetConfigurationArgs.builder
      builder.subnetConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrState.Builder)
    /**
     * @param cidrAuthorizationContext Signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidrAuthorizationContext for more information.
     * @return builder
     */
    inline def cidrAuthorizationContext(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs.builder
      builder.cidrAuthorizationContext(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamPoolState.Builder)
    /**
     * @param sourceResource Resource to use to use to configure a resource planning IPAM Pool. If configured, the `locale` of the parent pool must match the region that the VPC resides in.
     * @return builder
     */
    inline def sourceResource(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcIpamPoolState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamPoolSourceResourceArgs.builder
      builder.sourceResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryState.Builder)
    /**
     * @param operatingRegions Regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     * @return builder
     */
    inline def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param organizationalUnitExclusions Add an Organizational Unit (OU) exclusion to IPAM. If IPAM is integrated with AWS Organizations and OU exclusion is added, IPAM will not manage the IP addresses in accounts in the OU exclusion. Refer to [IPAM Quotas](https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html) for the limit of exclusions that can be created.
     * @return builder
     */
    inline def organizationalUnitExclusions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamResourceDiscoveryOrganizationalUnitExclusionArgs.builder
      builder.organizationalUnitExclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcIpamState.Builder)
    /**
     * @param operatingRegions Locales that can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the regionName parameter. You **must** set your provider block region as an operating_region.
     * @return builder
     */
    inline def operatingRegions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpcIpamState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs.builder
      builder.operatingRegions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState.Builder)
    /**
     * @param accepter Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that accepts the peering connection (a maximum of one). See `accepter` Block below.
     * @return builder
     */
    inline def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that requests the peering connection (a maximum of one). See `requester` Block below.
     * @return builder
     */
    inline def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpcPeeringConnectionState.Builder)
    /**
     * @param accepter Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that accepts the peering connection (a maximum of one). See `accepter` Block below.
     * @return builder
     */
    inline def accepter(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs.builder
      builder.accepter(args(argsBuilder).build)

    /**
     * @param requester Configuration block for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to set for the VPC that requests the peering connection (a maximum of one). See `requester` Block below.
     * @return builder
     */
    inline def requester(args: Endofunction[com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpcPeeringConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs.builder
      builder.requester(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder)
    /**
     * @param routes Static routes associated with the VPN connection. Detailed below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionRouteArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    /**
     * @param tunnel1LogOptions Options for logging VPN tunnel activity. See `tunnel1LogOptions` below for more details.
     * @return builder
     */
    inline def tunnel1LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.builder
      builder.tunnel1LogOptions(args(argsBuilder).build)

    /**
     * @param tunnel2LogOptions Options for logging VPN tunnel activity. See `tunnel2LogOptions` below for more details.
     * @return builder
     */
    inline def tunnel2LogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.builder
      builder.tunnel2LogOptions(args(argsBuilder).build)

    /**
     * @param vgwTelemetries Telemetry for the VPN tunnels. Detailed below.
     * @return builder
     */
    inline def vgwTelemetries(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionVgwTelemetryArgs.Builder]*):
        com.pulumi.aws.ec2.inputs.VpnConnectionState.Builder =
      def argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionVgwTelemetryArgs.builder
      builder.vgwTelemetries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder)
    /**
     * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch. See CloudWatch Log Options below for more details.
     * @return builder
     */
    inline def cloudwatchLogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs.builder
      builder.cloudwatchLogOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder)
    /**
     * @param cloudwatchLogOptions Options for sending VPN tunnel logs to CloudWatch. See CloudWatch Log Options below for more details.
     * @return builder
     */
    inline def cloudwatchLogOptions(args: Endofunction[com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsCloudwatchLogOptionsArgs.Builder]):
        com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ec2.inputs.VpnConnectionTunnel2LogOptionsCloudwatchLogOptionsArgs.builder
      builder.cloudwatchLogOptions(args(argsBuilder).build)
