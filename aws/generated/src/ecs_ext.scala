package jp.ukiba.ko_pulumi
package aws

object ecs_ext:
  extension (builder: com.pulumi.aws.ecs.CapacityProviderArgs.Builder)
    /**
     * @param autoScalingGroupProvider Configuration block for the provider for the ECS Auto Scaling group. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    inline def autoScalingGroupProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder]):
        com.pulumi.aws.ecs.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.builder
      builder.autoScalingGroupProvider(args(argsBuilder).build)

    /**
     * @param managedInstancesProvider Configuration block for the managed instances provider. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    inline def managedInstancesProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder]):
        com.pulumi.aws.ecs.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.builder
      builder.managedInstancesProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.ClusterArgs.Builder)
    /**
     * @param configuration Execute command configuration for the cluster. See `configuration` Block for details.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param serviceConnectDefaults Default Service Connect namespace. See `serviceConnectDefaults` Block for details.
     * @return builder
     */
    inline def serviceConnectDefaults(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.Builder]):
        com.pulumi.aws.ecs.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.builder
      builder.serviceConnectDefaults(args(argsBuilder).build)

    /**
     * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. See `setting` Block for details.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterSettingArgs.Builder]*):
        com.pulumi.aws.ecs.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.Builder)
    /**
     * @param defaultCapacityProviderStrategies Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * @return builder
     */
    inline def defaultCapacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.builder
      builder.defaultCapacityProviderStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.DaemonArgs.Builder)
    /**
     * @param deploymentConfiguration Configuration for daemon deployments. See Deployment Configuration below.
     * @return builder
     */
    inline def deploymentConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.DaemonArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationArgs.builder
      builder.deploymentConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTimeoutsArgs.Builder]):
        com.pulumi.aws.ecs.DaemonArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.DaemonTaskDefinitionArgs.Builder)
    /**
     * @param containerDefinitions One or more container definition blocks. Detailed below.
     * @return builder
     */
    inline def containerDefinitions(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder]*):
        com.pulumi.aws.ecs.DaemonTaskDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.builder
      builder.containerDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes Repeatable configuration block for volumes that containers in your task may use. Detailed below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeArgs.Builder]*):
        com.pulumi.aws.ecs.DaemonTaskDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder)
    /**
     * @param networkConfigurations Network configuration for the service. See `networkConfiguration` Block below.
     * @return builder
     */
    inline def networkConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.builder
      builder.networkConfigurations(args.map(_(argsBuilder).build)*)

    inline def primaryContainer(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder]):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    /**
     * @param scalingTargets Auto-scaling configuration for the service. See `scalingTarget` Block below.
     * @return builder
     */
    inline def scalingTargets(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.Builder]*):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.builder
      builder.scalingTargets(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.Builder]):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.ServiceArgs.Builder)
    /**
     * @param alarms Information about the CloudWatch alarms. See below.
     * @return builder
     */
    inline def alarms(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.builder
      builder.alarms(args(argsBuilder).build)

    /**
     * @param capacityProviderStrategies Capacity provider strategies to use for the service. Can be one or more. Updating this argument requires `forceNewDeployment = true`. See below. Conflicts with `launchType`.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param deploymentCircuitBreaker Configuration block for deployment circuit breaker. See below.
     * @return builder
     */
    inline def deploymentCircuitBreaker(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.builder
      builder.deploymentCircuitBreaker(args(argsBuilder).build)

    /**
     * @param deploymentConfiguration Configuration block for deployment settings. See below.
     * @return builder
     */
    inline def deploymentConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.builder
      builder.deploymentConfiguration(args(argsBuilder).build)

    /**
     * @param deploymentController Configuration block for deployment controller configuration. See below.
     * @return builder
     */
    inline def deploymentController(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.builder
      builder.deploymentController(args(argsBuilder).build)

    /**
     * @param loadBalancers Configuration block for load balancers. See below.
     * @return builder
     */
    inline def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param orderedPlacementStrategies Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     * @return builder
     */
    inline def orderedPlacementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.builder
      builder.orderedPlacementStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param placementConstraints Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceConnectConfiguration ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     * @return builder
     */
    inline def serviceConnectConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.builder
      builder.serviceConnectConfiguration(args(argsBuilder).build)

    /**
     * @param serviceRegistries Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     * @return builder
     */
    inline def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

    /**
     * @param volumeConfiguration Configuration for a volume specified in the task definition as a volume that is configured at launch time. Currently, the only supported volume type is an Amazon EBS volume. See below.
     * @return builder
     */
    inline def volumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.builder
      builder.volumeConfiguration(args(argsBuilder).build)

    /**
     * @param vpcLatticeConfigurations VPC Lattice configuration for your service that allows Lattice to connect, secure, and monitor your service across multiple accounts and VPCs. See below.
     * @return builder
     */
    inline def vpcLatticeConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.builder
      builder.vpcLatticeConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.TaskDefinitionArgs.Builder)
    /**
     * @param ephemeralStorage Amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * @return builder
     */
    inline def ephemeralStorage(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param placementConstraints Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param proxyConfiguration Configuration block for the App Mesh proxy. Detailed below.
     * @return builder
     */
    inline def proxyConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.builder
      builder.proxyConfiguration(args(argsBuilder).build)

    /**
     * @param runtimePlatform Configuration block for runtimePlatform that containers in your task may use.
     * @return builder
     */
    inline def runtimePlatform(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.Builder]):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.builder
      builder.runtimePlatform(args(argsBuilder).build)

    /**
     * @param volumes Repeatable configuration block for volumes that containers in your task may use. Detailed below.
     * 
     * &gt; **NOTE:** Proper escaping is required for JSON field values containing quotes (`&#34;`) such as `environment` values. If directly setting the JSON, they should be escaped as `\&#34;` in the JSON,  e.g., `&#34;value&#34;: &#34;I \&#34;love\&#34; escaped quotes&#34;`. If using a variable value, they should be escaped as `\\\&#34;` in the variable, e.g., `value = &#34;I \\\&#34;love\\\&#34; escaped quotes&#34;` in the variable and `&#34;value&#34;: &#34;\${var.myvariable}&#34;` in the JSON.
     * 
     * &gt; **Note:** Fault injection only works with tasks using the `awsvpc` or `host` network modes. Fault injection isn&#39;t available on Windows.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder]*):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.TaskSetArgs.Builder)
    /**
     * @param capacityProviderStrategies Capacity provider strategy to use for the service. Can be one or more. Defined below.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancers Details on load balancers that are used with a task set. Detailed below.
     * @return builder
     */
    inline def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. Required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and not supported for other network modes. Detailed below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param scale Floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * @return builder
     */
    inline def scale(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.Builder]):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.builder
      builder.scale(args(argsBuilder).build)

    /**
     * @param serviceRegistries Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
     * @return builder
     */
    inline def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder)
    /**
     * @param managedScaling Configuration block defining the parameters of the auto scaling. Detailed below.
     * @return builder
     */
    inline def managedScaling(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingArgs.builder
      builder.managedScaling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder)
    /**
     * @param autoRepairConfiguration Configuration block for the auto repair configuration. Detailed below.
     * @return builder
     */
    inline def autoRepairConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderAutoRepairConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderAutoRepairConfigurationArgs.builder
      builder.autoRepairConfiguration(args(argsBuilder).build)

    /**
     * @param infrastructureOptimization Configuration block for how Amazon ECS Managed Instances optimizes the infrastructure in your capacity provider, including whether to turn optimization on or off and how long to delay optimizing idle EC2 instances. Detailed below.
     * @return builder
     */
    inline def infrastructureOptimization(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInfrastructureOptimizationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInfrastructureOptimizationArgs.builder
      builder.infrastructureOptimization(args(argsBuilder).build)

    /**
     * @param instanceLaunchTemplate Launch template configuration that specifies how Amazon ECS should launch Amazon EC2 instances. This includes the instance profile, network configuration, storage settings, and instance requirements for attribute-based instance type selection. For more information, see [Store instance launch parameters in Amazon EC2 launch templates](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html) in the Amazon EC2 User Guide. Detailed below.
     * @return builder
     */
    inline def instanceLaunchTemplate(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.builder
      builder.instanceLaunchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder)
    /**
     * @param capacityReservations Capacity Reservation configuration used to launch instances. Required when `capacityOptionType` is `RESERVED`. Detailed below.
     * @return builder
     */
    inline def capacityReservations(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateCapacityReservationsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateCapacityReservationsArgs.builder
      builder.capacityReservations(args(argsBuilder).build)

    /**
     * @param instanceRequirements Instance requirements. You can specify the instance types and instance requirements such as vCPU count, memory, network performance, and accelerator specifications. Amazon ECS automatically selects the instances that match the specified criteria. Detailed below.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param localStorageConfiguration Configuration block for the local storage settings applied to Amazon ECS Managed Instances. Detailed below.
     * @return builder
     */
    inline def localStorageConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateLocalStorageConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateLocalStorageConfigurationArgs.builder
      builder.localStorageConfiguration(args(argsBuilder).build)

    /**
     * @param networkConfiguration Network configuration for Amazon ECS Managed Instances. This specifies the subnets and security groups that instances use for network connectivity. Detailed below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param storageConfiguration Storage configuration for Amazon ECS Managed Instances. This defines the root volume size and type for the instances. Detailed below.
     * @return builder
     */
    inline def storageConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateStorageConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Minimum and maximum number of accelerators for the instance types. This is used when you need instances with specific numbers of GPUs or other accelerators. Detailed below.
     * @return builder
     */
    inline def acceleratorCount(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Minimum and maximum total accelerator memory in mebibytes (MiB). This is important for GPU workloads that require specific amounts of video memory. Detailed below.
     * @return builder
     */
    inline def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Minimum and maximum baseline Amazon EBS bandwidth in megabits per second (Mbps). This is important for workloads with high storage I/O requirements. Detailed below.
     * @return builder
     */
    inline def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Minimum and maximum amount of memory per vCPU in gibibytes (GiB). This helps ensure that instance types have the appropriate memory-to-CPU ratio for your workloads. Detailed below.
     * @return builder
     */
    inline def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib Minimum and maximum amount of memory in mebibytes (MiB) for the instance types. Amazon ECS selects instance types that have memory within this range. Detailed below.
     * @return builder
     */
    inline def memoryMib(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps Minimum and maximum network bandwidth in gigabits per second (Gbps). This is crucial for network-intensive workloads that require high throughput. Detailed below.
     * @return builder
     */
    inline def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Minimum and maximum number of network interfaces for the instance types. This is useful for workloads that require multiple network interfaces. Detailed below.
     * @return builder
     */
    inline def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Minimum and maximum total local storage in gigabytes (GB) for instance types with local storage. Detailed below.
     * @return builder
     */
    inline def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Minimum and maximum number of vCPUs for the instance types. Amazon ECS selects instance types that have vCPU counts within this range. Detailed below.
     * @return builder
     */
    inline def vcpuCount(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderState.Builder)
    /**
     * @param autoScalingGroupProvider Configuration block for the provider for the ECS Auto Scaling group. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    inline def autoScalingGroupProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.builder
      builder.autoScalingGroupProvider(args(argsBuilder).build)

    /**
     * @param managedInstancesProvider Configuration block for the managed instances provider. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    inline def managedInstancesProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.builder
      builder.managedInstancesProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersState.Builder)
    /**
     * @param defaultCapacityProviderStrategies Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * @return builder
     */
    inline def defaultCapacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.builder
      builder.defaultCapacityProviderStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder)
    /**
     * @param executeCommandConfiguration Details of the execute command configuration. See `executeCommandConfiguration` Block for details.
     * @return builder
     */
    inline def executeCommandConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.builder
      builder.executeCommandConfiguration(args(argsBuilder).build)

    /**
     * @param managedStorageConfiguration Details of the managed storage configuration. See `managedStorageConfiguration` Block for details.
     * @return builder
     */
    inline def managedStorageConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationManagedStorageConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationManagedStorageConfigurationArgs.builder
      builder.managedStorageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.Builder)
    /**
     * @param logConfiguration Log configuration for the results of the execute command actions. Required when `logging` is `OVERRIDE`. See `logConfiguration` Block for details.
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterState.Builder)
    /**
     * @param configuration Execute command configuration for the cluster. See `configuration` Block for details.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param serviceConnectDefaults Default Service Connect namespace. See `serviceConnectDefaults` Block for details.
     * @return builder
     */
    inline def serviceConnectDefaults(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.builder
      builder.serviceConnectDefaults(args(argsBuilder).build)

    /**
     * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. See `setting` Block for details.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterSettingArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationArgs.Builder)
    /**
     * @param alarms Alarm configuration for deployment monitoring. See Alarms below.
     * @return builder
     */
    inline def alarms(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationAlarmsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationAlarmsArgs.builder
      builder.alarms(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonState.Builder)
    /**
     * @param deploymentConfiguration Configuration for daemon deployments. See Deployment Configuration below.
     * @return builder
     */
    inline def deploymentConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonDeploymentConfigurationArgs.builder
      builder.deploymentConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTimeoutsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder)
    /**
     * @param dependsOns Dependencies defined for container startup and shutdown. Detailed below.
     * @return builder
     */
    inline def dependsOns(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionDependsOnArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionDependsOnArgs.builder
      builder.dependsOns(args.map(_(argsBuilder).build)*)

    /**
     * @param environmentFiles List of files containing the environment variables to pass to a container. Detailed below.
     * @return builder
     */
    inline def environmentFiles(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionEnvironmentFileArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionEnvironmentFileArgs.builder
      builder.environmentFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param environments Environment variables to pass to a container. Detailed below.
     * @return builder
     */
    inline def environments(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionEnvironmentArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param firelensConfiguration FireLens configuration for the container. Detailed below.
     * @return builder
     */
    inline def firelensConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionFirelensConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionFirelensConfigurationArgs.builder
      builder.firelensConfiguration(args(argsBuilder).build)

    /**
     * @param healthCheck Container health check command and associated configuration parameters for the container. Detailed below.
     * @return builder
     */
    inline def healthCheck(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionHealthCheckArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container. Detailed below.
     * @return builder
     */
    inline def linuxParameters(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersArgs.builder
      builder.linuxParameters(args(argsBuilder).build)

    /**
     * @param logConfiguration Log configuration specification for the container. Detailed below.
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLogConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param mountPoints Mount points for data volumes in your container. Detailed below.
     * @return builder
     */
    inline def mountPoints(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionMountPointArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionMountPointArgs.builder
      builder.mountPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param repositoryCredentials Private repository authentication credentials to use. Detailed below.
     * @return builder
     */
    inline def repositoryCredentials(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionRepositoryCredentialsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionRepositoryCredentialsArgs.builder
      builder.repositoryCredentials(args(argsBuilder).build)

    /**
     * @param restartPolicy Restart policy for a container. Detailed below.
     * @return builder
     */
    inline def restartPolicy(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionRestartPolicyArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionRestartPolicyArgs.builder
      builder.restartPolicy(args(argsBuilder).build)

    /**
     * @param secrets Secrets to pass to the container. Detailed below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionSecretArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param systemControls List of namespaced kernel parameters to set in the container. Detailed below.
     * @return builder
     */
    inline def systemControls(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionSystemControlArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionSystemControlArgs.builder
      builder.systemControls(args.map(_(argsBuilder).build)*)

    /**
     * @param ulimits List of ulimits to set in the container. Detailed below.
     * @return builder
     */
    inline def ulimits(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionUlimitArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionUlimitArgs.builder
      builder.ulimits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersArgs.Builder)
    /**
     * @param capabilities Linux capabilities for the container. Detailed below.
     * @return builder
     */
    inline def capabilities(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersCapabilitiesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersCapabilitiesArgs.builder
      builder.capabilities(args(argsBuilder).build)

    /**
     * @param devices Any host devices to expose to the container. Detailed below.
     * @return builder
     */
    inline def devices(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersDeviceArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersDeviceArgs.builder
      builder.devices(args.map(_(argsBuilder).build)*)

    /**
     * @param tmpfs Container path, mount options, and size of the tmpfs mount. Detailed below.
     * @return builder
     */
    inline def tmpfs(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersTmpfArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLinuxParametersTmpfArgs.builder
      builder.tmpfs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLogConfigurationArgs.Builder)
    /**
     * @param secretOptions Secrets to pass to the log configuration. Detailed below.
     * @return builder
     */
    inline def secretOptions(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLogConfigurationSecretOptionArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLogConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionLogConfigurationSecretOptionArgs.builder
      builder.secretOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionState.Builder)
    /**
     * @param containerDefinitions One or more container definition blocks. Detailed below.
     * @return builder
     */
    inline def containerDefinitions(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionContainerDefinitionArgs.builder
      builder.containerDefinitions(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes Repeatable configuration block for volumes that containers in your task may use. Detailed below.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeArgs.Builder)
    /**
     * @param hosts Configuration for a host volume. Detailed below.
     * @return builder
     */
    inline def hosts(args: Endofunction[com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeHostArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.DaemonTaskDefinitionVolumeHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder)
    /**
     * @param awsLogsConfigurations CloudWatch Logs configuration for the container. See `awsLogsConfiguration` Block below.
     * @return builder
     */
    inline def awsLogsConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerAwsLogsConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerAwsLogsConfigurationArgs.builder
      builder.awsLogsConfigurations(args.map(_(argsBuilder).build)*)

    inline def environments(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerEnvironmentArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    inline def repositoryCredentials(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerRepositoryCredentialsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerRepositoryCredentialsArgs.builder
      builder.repositoryCredentials(args(argsBuilder).build)

    inline def secrets(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerSecretArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder)
    /**
     * @param ingressPaths List of ingress paths for the service. See `ingressPaths` Block below.
     * @return builder
     */
    inline def ingressPaths(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceIngressPathArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceIngressPathArgs.builder
      builder.ingressPaths(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfigurations Network configuration for the service. See `networkConfiguration` Block below.
     * @return builder
     */
    inline def networkConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.builder
      builder.networkConfigurations(args.map(_(argsBuilder).build)*)

    inline def primaryContainer(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    /**
     * @param scalingTargets Auto-scaling configuration for the service. See `scalingTarget` Block below.
     * @return builder
     */
    inline def scalingTargets(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.builder
      builder.scalingTargets(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder)
    /**
     * @param capacityProviderStrategies Set of capacity provider strategies to use for the cluster. See below.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param overrides List of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param placementConstraints Array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param placementStrategies Placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
     * @return builder
     */
    inline def placementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementStrategyArgs.builder
      builder.placementStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionOverrides.Builder)
    /**
     * @param containerOverrides One or more container overrides that are sent to a task. See below.
     * @return builder
     */
    inline def containerOverrides(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverride.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverrides.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverride.builder
      builder.containerOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.Builder)
    /**
     * @param containerOverrides One or more container overrides that are sent to a task. See below.
     * @return builder
     */
    inline def containerOverrides(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.builder
      builder.containerOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverride.Builder)
    /**
     * @param environments Environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. See below.
     * @return builder
     */
    inline def environments(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideEnvironment.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverride.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideEnvironment.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRequirements Type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU. See below.
     * @return builder
     */
    inline def resourceRequirements(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideResourceRequirement.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverride.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideResourceRequirement.builder
      builder.resourceRequirements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder)
    /**
     * @param environments Environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. See below.
     * @return builder
     */
    inline def environments(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideEnvironmentArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRequirements Type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU. See below.
     * @return builder
     */
    inline def resourceRequirements(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideResourceRequirementArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideResourceRequirementArgs.builder
      builder.resourceRequirements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder)
    /**
     * @param capacityProviderStrategies Set of capacity provider strategies to use for the cluster. See below.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionCapacityProviderStrategy.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionCapacityProviderStrategy.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfiguration.Builder]):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfiguration.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param overrides List of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverrides.Builder]):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverrides.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param placementConstraints Array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementConstraint.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementConstraint.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param placementStrategies Placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
     * @return builder
     */
    inline def placementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementStrategy.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementStrategy.builder
      builder.placementStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder)
    /**
     * @param canaryConfiguration Configuration block for canary deployment strategy. Required when `strategy` is set to `CANARY`. See below.
     * @return builder
     */
    inline def canaryConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationCanaryConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationCanaryConfigurationArgs.builder
      builder.canaryConfiguration(args(argsBuilder).build)

    /**
     * @param lifecycleHooks Configuration block for lifecycle hooks that are invoked during deployments. See below.
     * @return builder
     */
    inline def lifecycleHooks(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookArgs.builder
      builder.lifecycleHooks(args.map(_(argsBuilder).build)*)

    /**
     * @param linearConfiguration Configuration block for linear deployment strategy. Required when `strategy` is set to `LINEAR`. See below.
     * @return builder
     */
    inline def linearConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLinearConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLinearConfigurationArgs.builder
      builder.linearConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookArgs.Builder)
    /**
     * @param timeoutConfiguration Configuration block defining the timeout behavior for a `PAUSE` hook. Only valid when `targetType` is `PAUSE`. See below.
     * @return builder
     */
    inline def timeoutConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookTimeoutConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookTimeoutConfigurationArgs.builder
      builder.timeoutConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder)
    /**
     * @param advancedConfiguration Configuration block for Blue/Green deployment settings. Required when using `BLUE_GREEN` deployment strategy. See below.
     * @return builder
     */
    inline def advancedConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceLoadBalancerAdvancedConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceLoadBalancerAdvancedConfigurationArgs.builder
      builder.advancedConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder)
    /**
     * @param accessLogConfiguration Configuration for Service Connect access logs. See below.
     * @return builder
     */
    inline def accessLogConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationAccessLogConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationAccessLogConfigurationArgs.builder
      builder.accessLogConfiguration(args(argsBuilder).build)

    /**
     * @param logConfiguration Log configuration for the container. See below.
     * @return builder
     */
    inline def logConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param services List of Service Connect service objects. See below.
     * @return builder
     */
    inline def services(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.Builder)
    /**
     * @param secretOptions Secrets to pass to the log configuration. See below.
     * @return builder
     */
    inline def secretOptions(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs.builder
      builder.secretOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder)
    /**
     * @param clientAlias List of client aliases for this Service Connect service. You use these to assign names that can be used by client applications. For each service block where enabled is true, exactly one `clientAlias` with one `port` should be specified. See below.
     * @return builder
     */
    inline def clientAlias(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.builder
      builder.clientAlias(args.map(_(argsBuilder).build)*)

    /**
     * @param timeout Configuration timeouts for Service Connect
     * @return builder
     */
    inline def timeout(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTimeoutArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param tls Configuration for enabling TLS
     * @return builder
     */
    inline def tls(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.Builder)
    /**
     * @param testTrafficRules Configuration block for test traffic routing rules. See below.
     * @return builder
     */
    inline def testTrafficRules(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.builder
      builder.testTrafficRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.Builder)
    /**
     * @param header Configuration block for header-based routing rules. See below.
     * @return builder
     */
    inline def header(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.builder
      builder.header(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.Builder)
    /**
     * @param value Configuration block for header value matching criteria. See below.
     * @return builder
     */
    inline def value(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderValueArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.Builder)
    /**
     * @param issuerCertAuthority Details of the certificate authority which will issue the certificate.
     * @return builder
     */
    inline def issuerCertAuthority(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs.builder
      builder.issuerCertAuthority(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceState.Builder)
    /**
     * @param alarms Information about the CloudWatch alarms. See below.
     * @return builder
     */
    inline def alarms(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.builder
      builder.alarms(args(argsBuilder).build)

    /**
     * @param capacityProviderStrategies Capacity provider strategies to use for the service. Can be one or more. Updating this argument requires `forceNewDeployment = true`. See below. Conflicts with `launchType`.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param deploymentCircuitBreaker Configuration block for deployment circuit breaker. See below.
     * @return builder
     */
    inline def deploymentCircuitBreaker(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.builder
      builder.deploymentCircuitBreaker(args(argsBuilder).build)

    /**
     * @param deploymentConfiguration Configuration block for deployment settings. See below.
     * @return builder
     */
    inline def deploymentConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.builder
      builder.deploymentConfiguration(args(argsBuilder).build)

    /**
     * @param deploymentController Configuration block for deployment controller configuration. See below.
     * @return builder
     */
    inline def deploymentController(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.builder
      builder.deploymentController(args(argsBuilder).build)

    /**
     * @param loadBalancers Configuration block for load balancers. See below.
     * @return builder
     */
    inline def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param orderedPlacementStrategies Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     * @return builder
     */
    inline def orderedPlacementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.builder
      builder.orderedPlacementStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param placementConstraints Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceConnectConfiguration ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     * @return builder
     */
    inline def serviceConnectConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.builder
      builder.serviceConnectConfiguration(args(argsBuilder).build)

    /**
     * @param serviceRegistries Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     * @return builder
     */
    inline def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

    /**
     * @param volumeConfiguration Configuration for a volume specified in the task definition as a volume that is configured at launch time. Currently, the only supported volume type is an Amazon EBS volume. See below.
     * @return builder
     */
    inline def volumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.builder
      builder.volumeConfiguration(args(argsBuilder).build)

    /**
     * @param vpcLatticeConfigurations VPC Lattice configuration for your service that allows Lattice to connect, secure, and monitor your service across multiple accounts and VPCs. See below.
     * @return builder
     */
    inline def vpcLatticeConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.builder
      builder.vpcLatticeConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder)
    /**
     * @param managedEbsVolume Configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. See below.
     * @return builder
     */
    inline def managedEbsVolume(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.builder
      builder.managedEbsVolume(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.Builder)
    /**
     * @param tagSpecifications Tags to apply to the volume. See below.
     * @return builder
     */
    inline def tagSpecifications(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeTagSpecificationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeTagSpecificationArgs.builder
      builder.tagSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder)
    /**
     * @param ephemeralStorage Amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * @return builder
     */
    inline def ephemeralStorage(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param placementConstraints Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     * @return builder
     */
    inline def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param proxyConfiguration Configuration block for the App Mesh proxy. Detailed below.
     * @return builder
     */
    inline def proxyConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.builder
      builder.proxyConfiguration(args(argsBuilder).build)

    /**
     * @param runtimePlatform Configuration block for runtimePlatform that containers in your task may use.
     * @return builder
     */
    inline def runtimePlatform(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.builder
      builder.runtimePlatform(args(argsBuilder).build)

    /**
     * @param volumes Repeatable configuration block for volumes that containers in your task may use. Detailed below.
     * 
     * &gt; **NOTE:** Proper escaping is required for JSON field values containing quotes (`&#34;`) such as `environment` values. If directly setting the JSON, they should be escaped as `\&#34;` in the JSON,  e.g., `&#34;value&#34;: &#34;I \&#34;love\&#34; escaped quotes&#34;`. If using a variable value, they should be escaped as `\\\&#34;` in the variable, e.g., `value = &#34;I \\\&#34;love\\\&#34; escaped quotes&#34;` in the variable and `&#34;value&#34;: &#34;\${var.myvariable}&#34;` in the JSON.
     * 
     * &gt; **Note:** Fault injection only works with tasks using the `awsvpc` or `host` network modes. Fault injection isn&#39;t available on Windows.
     * @return builder
     */
    inline def volumes(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder)
    /**
     * @param dockerVolumeConfiguration Configuration block to configure a docker volume. Detailed below.
     * @return builder
     */
    inline def dockerVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs.builder
      builder.dockerVolumeConfiguration(args(argsBuilder).build)

    /**
     * @param efsVolumeConfiguration Configuration block for an EFS volume. Detailed below.
     * @return builder
     */
    inline def efsVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.builder
      builder.efsVolumeConfiguration(args(argsBuilder).build)

    /**
     * @param fsxWindowsFileServerVolumeConfiguration Configuration block for an FSx Windows File Server volume. Detailed below.
     * @return builder
     */
    inline def fsxWindowsFileServerVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.builder
      builder.fsxWindowsFileServerVolumeConfiguration(args(argsBuilder).build)

    /**
     * @param s3filesVolumeConfiguration Configuration block for an S3 Files volume. Detailed below.
     * @return builder
     */
    inline def s3filesVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeS3filesVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeS3filesVolumeConfigurationArgs.builder
      builder.s3filesVolumeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.Builder)
    /**
     * @param authorizationConfig Configuration block for authorization for the Amazon EFS file system. Detailed below.
     * @return builder
     */
    inline def authorizationConfig(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs.builder
      builder.authorizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.Builder)
    /**
     * @param authorizationConfig Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * @return builder
     */
    inline def authorizationConfig(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs.builder
      builder.authorizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskSetState.Builder)
    /**
     * @param capacityProviderStrategies Capacity provider strategy to use for the service. Can be one or more. Defined below.
     * @return builder
     */
    inline def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancers Details on load balancers that are used with a task set. Detailed below.
     * @return builder
     */
    inline def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. Required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and not supported for other network modes. Detailed below.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param scale Floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * @return builder
     */
    inline def scale(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.builder
      builder.scale(args(argsBuilder).build)

    /**
     * @param serviceRegistries Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
     * @return builder
     */
    inline def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)
