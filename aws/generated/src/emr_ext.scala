package jp.ukiba.ko_pulumi
package aws

object emr_ext:
  extension (builder: com.pulumi.aws.emr.BlockPublicAccessConfigurationArgs.Builder)
    /**
     * @param permittedPublicSecurityGroupRuleRanges Configuration block for defining permitted public security group rule port ranges. Can be defined multiple times per resource. Only valid if `blockPublicSecurityGroupRules` is set to `true`.
     * @return builder
     */
    inline def permittedPublicSecurityGroupRuleRanges(args: Endofunction[com.pulumi.aws.emr.inputs.BlockPublicAccessConfigurationPermittedPublicSecurityGroupRuleRangeArgs.Builder]*):
        com.pulumi.aws.emr.BlockPublicAccessConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.BlockPublicAccessConfigurationPermittedPublicSecurityGroupRuleRangeArgs.builder
      builder.permittedPublicSecurityGroupRuleRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.ClusterArgs.Builder)
    /**
     * @param autoTerminationPolicy An auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. See Auto Termination Policy Below.
     * @return builder
     */
    inline def autoTerminationPolicy(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterAutoTerminationPolicyArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterAutoTerminationPolicyArgs.builder
      builder.autoTerminationPolicy(args(argsBuilder).build)

    /**
     * @param bootstrapActions Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. See below.
     * @return builder
     */
    inline def bootstrapActions(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterBootstrapActionArgs.Builder]*):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterBootstrapActionArgs.builder
      builder.bootstrapActions(args.map(_(argsBuilder).build)*)

    /**
     * @param coreInstanceFleet Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `coreInstanceGroup` configuration blocks are set. Detailed below.
     * @return builder
     */
    inline def coreInstanceFleet(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.builder
      builder.coreInstanceFleet(args(argsBuilder).build)

    /**
     * @param coreInstanceGroup Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
     * @return builder
     */
    inline def coreInstanceGroup(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupArgs.builder
      builder.coreInstanceGroup(args(argsBuilder).build)

    /**
     * @param ec2Attributes Attributes for the EC2 instances running the job flow. See below.
     * @return builder
     */
    inline def ec2Attributes(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterEc2AttributesArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterEc2AttributesArgs.builder
      builder.ec2Attributes(args(argsBuilder).build)

    /**
     * @param kerberosAttributes Kerberos configuration for the cluster. See below.
     * @return builder
     */
    inline def kerberosAttributes(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterKerberosAttributesArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterKerberosAttributesArgs.builder
      builder.kerberosAttributes(args(argsBuilder).build)

    /**
     * @param masterInstanceFleet Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `masterInstanceGroup` configuration blocks are set. Detailed below.
     * @return builder
     */
    inline def masterInstanceFleet(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.builder
      builder.masterInstanceFleet(args(argsBuilder).build)

    /**
     * @param masterInstanceGroup Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
     * @return builder
     */
    inline def masterInstanceGroup(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs.Builder]):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs.builder
      builder.masterInstanceGroup(args(argsBuilder).build)

    /**
     * @param placementGroupConfigs The specified placement group configuration for an Amazon EMR cluster.
     * @return builder
     */
    inline def placementGroupConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterPlacementGroupConfigArgs.Builder]*):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterPlacementGroupConfigArgs.builder
      builder.placementGroupConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param steps List of steps to run when creating the cluster. See below. It is highly recommended to utilize the lifecycle resource options block with `ignoreChanges` if other steps are being managed outside of this provider.
     * @return builder
     */
    inline def steps(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterStepArgs.Builder]*):
        com.pulumi.aws.emr.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.InstanceFleetArgs.Builder)
    /**
     * @param instanceTypeConfigs Configuration block for instance fleet
     * @return builder
     */
    inline def instanceTypeConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.Builder]*):
        com.pulumi.aws.emr.InstanceFleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.builder
      builder.instanceTypeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param launchSpecifications Configuration block for launch specification
     * @return builder
     */
    inline def launchSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.Builder]):
        com.pulumi.aws.emr.InstanceFleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.builder
      builder.launchSpecifications(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.InstanceGroupArgs.Builder)
    /**
     * @param ebsConfigs One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceGroupEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.InstanceGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceGroupEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.ManagedScalingPolicyArgs.Builder)
    /**
     * @param computeLimits Configuration block with compute limit settings. Described below.
     * @return builder
     */
    inline def computeLimits(args: Endofunction[com.pulumi.aws.emr.inputs.ManagedScalingPolicyComputeLimitArgs.Builder]*):
        com.pulumi.aws.emr.ManagedScalingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ManagedScalingPolicyComputeLimitArgs.builder
      builder.computeLimits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.BlockPublicAccessConfigurationState.Builder)
    /**
     * @param permittedPublicSecurityGroupRuleRanges Configuration block for defining permitted public security group rule port ranges. Can be defined multiple times per resource. Only valid if `blockPublicSecurityGroupRules` is set to `true`.
     * @return builder
     */
    inline def permittedPublicSecurityGroupRuleRanges(args: Endofunction[com.pulumi.aws.emr.inputs.BlockPublicAccessConfigurationPermittedPublicSecurityGroupRuleRangeArgs.Builder]*):
        com.pulumi.aws.emr.inputs.BlockPublicAccessConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.BlockPublicAccessConfigurationPermittedPublicSecurityGroupRuleRangeArgs.builder
      builder.permittedPublicSecurityGroupRuleRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.Builder)
    /**
     * @param instanceTypeConfigs Configuration block for instance fleet.
     * @return builder
     */
    inline def instanceTypeConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs.builder
      builder.instanceTypeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param launchSpecifications Configuration block for launch specification.
     * @return builder
     */
    inline def launchSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs.builder
      builder.launchSpecifications(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs.Builder)
    /**
     * @param configurations Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs.Builder)
    /**
     * @param onDemandSpecifications Configuration block for on demand instances launch specifications.
     * @return builder
     */
    inline def onDemandSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs.builder
      builder.onDemandSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param spotSpecifications Configuration block for spot instances launch specifications.
     * @return builder
     */
    inline def spotSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs.builder
      builder.spotSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupArgs.Builder)
    /**
     * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.Builder)
    /**
     * @param instanceTypeConfigs Configuration block for instance fleet.
     * @return builder
     */
    inline def instanceTypeConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigArgs.builder
      builder.instanceTypeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param launchSpecifications Configuration block for launch specification.
     * @return builder
     */
    inline def launchSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsArgs.builder
      builder.launchSpecifications(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigArgs.Builder)
    /**
     * @param configurations Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsArgs.Builder)
    /**
     * @param onDemandSpecifications Configuration block for on demand instances launch specifications.
     * @return builder
     */
    inline def onDemandSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs.builder
      builder.onDemandSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param spotSpecifications Configuration block for spot instances launch specifications.
     * @return builder
     */
    inline def spotSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs.builder
      builder.spotSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs.Builder)
    /**
     * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterState.Builder)
    /**
     * @param autoTerminationPolicy An auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. See Auto Termination Policy Below.
     * @return builder
     */
    inline def autoTerminationPolicy(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterAutoTerminationPolicyArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterAutoTerminationPolicyArgs.builder
      builder.autoTerminationPolicy(args(argsBuilder).build)

    /**
     * @param bootstrapActions Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. See below.
     * @return builder
     */
    inline def bootstrapActions(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterBootstrapActionArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterBootstrapActionArgs.builder
      builder.bootstrapActions(args.map(_(argsBuilder).build)*)

    /**
     * @param coreInstanceFleet Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `coreInstanceGroup` configuration blocks are set. Detailed below.
     * @return builder
     */
    inline def coreInstanceFleet(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetArgs.builder
      builder.coreInstanceFleet(args(argsBuilder).build)

    /**
     * @param coreInstanceGroup Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
     * @return builder
     */
    inline def coreInstanceGroup(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupArgs.builder
      builder.coreInstanceGroup(args(argsBuilder).build)

    /**
     * @param ec2Attributes Attributes for the EC2 instances running the job flow. See below.
     * @return builder
     */
    inline def ec2Attributes(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterEc2AttributesArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterEc2AttributesArgs.builder
      builder.ec2Attributes(args(argsBuilder).build)

    /**
     * @param kerberosAttributes Kerberos configuration for the cluster. See below.
     * @return builder
     */
    inline def kerberosAttributes(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterKerberosAttributesArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterKerberosAttributesArgs.builder
      builder.kerberosAttributes(args(argsBuilder).build)

    /**
     * @param masterInstanceFleet Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `masterInstanceGroup` configuration blocks are set. Detailed below.
     * @return builder
     */
    inline def masterInstanceFleet(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetArgs.builder
      builder.masterInstanceFleet(args(argsBuilder).build)

    /**
     * @param masterInstanceGroup Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
     * @return builder
     */
    inline def masterInstanceGroup(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs.builder
      builder.masterInstanceGroup(args(argsBuilder).build)

    /**
     * @param placementGroupConfigs The specified placement group configuration for an Amazon EMR cluster.
     * @return builder
     */
    inline def placementGroupConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterPlacementGroupConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterPlacementGroupConfigArgs.builder
      builder.placementGroupConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param steps List of steps to run when creating the cluster. See below. It is highly recommended to utilize the lifecycle resource options block with `ignoreChanges` if other steps are being managed outside of this provider.
     * @return builder
     */
    inline def steps(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterStepArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ClusterStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ClusterStepArgs.Builder)
    /**
     * @param hadoopJarStep JAR file used for the step. See below.
     * @return builder
     */
    inline def hadoopJarStep(args: Endofunction[com.pulumi.aws.emr.inputs.ClusterStepHadoopJarStepArgs.Builder]):
        com.pulumi.aws.emr.inputs.ClusterStepArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.ClusterStepHadoopJarStepArgs.builder
      builder.hadoopJarStep(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs.Builder)
    /**
     * @param filters Filters the results of the request. Prefix specifies the prefix of release labels to return. Application specifies the application (with/without version) of release labels to return. See Filters.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs.Builder]):
        com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.inputs.GetReleaseLabelsPlainArgs.Builder)
    /**
     * @param filters Filters the results of the request. Prefix specifies the prefix of release labels to return. Application specifies the application (with/without version) of release labels to return. See Filters.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.emr.inputs.GetReleaseLabelsFilters.Builder]):
        com.pulumi.aws.emr.inputs.GetReleaseLabelsPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.GetReleaseLabelsFilters.builder
      builder.filters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.Builder)
    /**
     * @param configurations A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * @return builder
     */
    inline def configurations(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigConfigurationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

    /**
     * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.Builder)
    /**
     * @param onDemandSpecifications Configuration block for on demand instances launch specifications
     * @return builder
     */
    inline def onDemandSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs.builder
      builder.onDemandSpecifications(args.map(_(argsBuilder).build)*)

    /**
     * @param spotSpecifications Configuration block for spot instances launch specifications
     * @return builder
     */
    inline def spotSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsSpotSpecificationArgs.Builder]*):
        com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsSpotSpecificationArgs.builder
      builder.spotSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.InstanceFleetState.Builder)
    /**
     * @param instanceTypeConfigs Configuration block for instance fleet
     * @return builder
     */
    inline def instanceTypeConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.InstanceFleetState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigArgs.builder
      builder.instanceTypeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param launchSpecifications Configuration block for launch specification
     * @return builder
     */
    inline def launchSpecifications(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.Builder]):
        com.pulumi.aws.emr.inputs.InstanceFleetState.Builder =
      val argsBuilder = com.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsArgs.builder
      builder.launchSpecifications(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.emr.inputs.InstanceGroupState.Builder)
    /**
     * @param ebsConfigs One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ebsConfigs(args: Endofunction[com.pulumi.aws.emr.inputs.InstanceGroupEbsConfigArgs.Builder]*):
        com.pulumi.aws.emr.inputs.InstanceGroupState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.InstanceGroupEbsConfigArgs.builder
      builder.ebsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.emr.inputs.ManagedScalingPolicyState.Builder)
    /**
     * @param computeLimits Configuration block with compute limit settings. Described below.
     * @return builder
     */
    inline def computeLimits(args: Endofunction[com.pulumi.aws.emr.inputs.ManagedScalingPolicyComputeLimitArgs.Builder]*):
        com.pulumi.aws.emr.inputs.ManagedScalingPolicyState.Builder =
      def argsBuilder = com.pulumi.aws.emr.inputs.ManagedScalingPolicyComputeLimitArgs.builder
      builder.computeLimits(args.map(_(argsBuilder).build)*)
