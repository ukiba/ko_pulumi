package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ecs:
  extension (builder: com.pulumi.aws.ecs.ServiceArgs.Builder)
    /**
     * @param alarms Information about the CloudWatch alarms. See below.
     * @return builder
     */
    def alarms(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.builder
      builder.alarms(args(argsBuilder).build)

    /**
     * @param capacityProviderStrategies Capacity provider strategies to use for the service. Can be one or more. Updating this argument requires `forceNewDeployment = true`. See below. Conflicts with `launchType`.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param deploymentCircuitBreaker Configuration block for deployment circuit breaker. See below.
     * @return builder
     */
    def deploymentCircuitBreaker(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.builder
      builder.deploymentCircuitBreaker(args(argsBuilder).build)

    /**
     * @param deploymentConfiguration Configuration block for deployment settings. See below.
     * @return builder
     */
    def deploymentConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.builder
      builder.deploymentConfiguration(args(argsBuilder).build)

    /**
     * @param deploymentController Configuration block for deployment controller configuration. See below.
     * @return builder
     */
    def deploymentController(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.builder
      builder.deploymentController(args(argsBuilder).build)

    /**
     * @param loadBalancers Configuration block for load balancers. See below.
     * @return builder
     */
    def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param orderedPlacementStrategies Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     * @return builder
     */
    def orderedPlacementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.builder
      builder.orderedPlacementStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param placementConstraints Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceConnectConfiguration ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     * @return builder
     */
    def serviceConnectConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.builder
      builder.serviceConnectConfiguration(args(argsBuilder).build)

    /**
     * @param serviceRegistries Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     * @return builder
     */
    def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

    /**
     * @param volumeConfiguration Configuration for a volume specified in the task definition as a volume that is configured at launch time. Currently, the only supported volume type is an Amazon EBS volume. See below.
     * @return builder
     */
    def volumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.builder
      builder.volumeConfiguration(args(argsBuilder).build)

    /**
     * @param vpcLatticeConfigurations The VPC Lattice configuration for your service that allows Lattice to connect, secure, and monitor your service across multiple accounts and VPCs. See below.
     * @return builder
     */
    def vpcLatticeConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.builder
      builder.vpcLatticeConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Manages the capacity providers of an ECS Cluster.
   *  
   *  More information about capacity providers can be found in the [ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
   */
  def ClusterCapacityProviders(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.builder
    
    com.pulumi.aws.ecs.ClusterCapacityProviders(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an ECS cluster capacity provider. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
   *  
   *  &gt; **NOTE:** Associating an ECS Capacity Provider to an Auto Scaling Group will automatically add the `AmazonECSManaged` tag to the Auto Scaling Group. This tag should be included in the `aws.autoscaling.Group` resource configuration to prevent the provider from removing it in subsequent executions as well as ensuring the `AmazonECSManaged` tag is propagated to all EC2 Instances in the Auto Scaling Group if `minSize` is above 0 on creation. Any EC2 Instances in the Auto Scaling Group without this tag must be manually be updated, otherwise they may cause unexpected scaling behavior and metrics.
   *  
   *  &gt; **NOTE:** You must specify exactly one of `autoScalingGroupProvider` or `managedInstancesProvider`. When using `managedInstancesProvider`, the `cluster` parameter is required. When using `autoScalingGroupProvider`, the `cluster` parameter must not be set.
   */
  def CapacityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.CapacityProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.CapacityProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecs.CapacityProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an individual ECS resource tag. This resource should only be used in cases where ECS resources are created outside the provider (e.g., ECS Clusters implicitly created by Batch Compute Environments).
   *  
   *  &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.ecs.Cluster` and `aws.ecs.Tag` to manage tags of the same ECS Cluster will cause a perpetual difference where the `aws.ecs.Cluster` resource will try to remove the tag being added by the `aws.ecs.Tag` resource.
   *  
   *  &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ecs.TagArgs.builder
    
    com.pulumi.aws.ecs.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an ECS Express service. The Express service provides a simplified way to deploy containerized applications with automatic provisioning and management of AWS infrastructure including Application Load Balancers (ALBs), target groups, security groups, and auto-scaling policies. This service offers built-in load balancing, auto-scaling, and networking capabilities with zero-downtime deployments.
   *  
   *  Express services automatically handle infrastructure provisioning and updates through rolling deployments, ensuring high availability during service modifications. When you update an Express service, a new service revision is created and deployed with zero downtime.
   */
  def ExpressGatewayService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.ExpressGatewayServiceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecs.ExpressGatewayService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an ECS cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecs.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecs.ClusterArgs.Builder)
    /**
     * @param configuration Execute command configuration for the cluster. See `configuration` Block for details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param serviceConnectDefaults Default Service Connect namespace. See `serviceConnectDefaults` Block for details.
     * @return builder
     */
    def serviceConnectDefaults(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.Builder]):
        com.pulumi.aws.ecs.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.builder
      builder.serviceConnectDefaults(args(argsBuilder).build)

    /**
     * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. See `setting` Block for details.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterSettingArgs.Builder]*):
        com.pulumi.aws.ecs.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder)
    def networkConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.builder
      builder.networkConfigurations(args.map(_(argsBuilder).build)*)

    def primaryContainer(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder]):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    def scalingTargets(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.Builder]*):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.builder
      builder.scalingTargets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.Builder]):
        com.pulumi.aws.ecs.ExpressGatewayServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * &gt; **Note:** To prevent a race condition during service deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicy`; otherwise, the policy may be destroyed too soon and the ECS service will then get stuck in the `DRAINING` state.
   *  
   *  Provides an ECS service - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
   *  
   *  See [ECS Services section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html).
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecs.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an ECS default account setting for a specific ECS Resource name within a specific region. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html).
   *  
   *  &gt; **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.
   *  
   *  &gt; **NOTE:** Your AWS account may not support disabling `containerInstanceLongArnFormat`, `serviceLongArnFormat`, and `taskLongArnFormat`. If your account does not support disabling these, &#34;destroying&#34; this resource will not disable the setting nor cause a provider error. However, the AWS Provider will log an AWS error: `InvalidParameterException: You can no longer disable Long Arn settings`.
   */
  def AccountSettingDefault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.AccountSettingDefaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.AccountSettingDefaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ecs.AccountSettingDefault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ecs.TaskSetArgs.Builder)
    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancers Details on load balancers that are used with a task set. Detailed below.
     * @return builder
     */
    def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param scale A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * @return builder
     */
    def scale(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.Builder]):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.builder
      builder.scale(args(argsBuilder).build)

    /**
     * @param serviceRegistries The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
     * @return builder
     */
    def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.TaskSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.CapacityProviderArgs.Builder)
    /**
     * @param autoScalingGroupProvider Configuration block for the provider for the ECS auto scaling group. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    def autoScalingGroupProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder]):
        com.pulumi.aws.ecs.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.builder
      builder.autoScalingGroupProvider(args(argsBuilder).build)

    /**
     * @param managedInstancesProvider Configuration block for the managed instances provider. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    def managedInstancesProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder]):
        com.pulumi.aws.ecs.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.builder
      builder.managedInstancesProvider(args(argsBuilder).build)

  /**
   * Provides an ECS task set - effectively a task that is expected to run until an error occurs or a user terminates it (typically a webserver or a database).
   *  
   *  See [ECS Task Set section in AWS developer guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-external.html).
   */
  def TaskSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.TaskSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.TaskSetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ecs.TaskSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a revision of an ECS task definition to be used in `aws.ecs.Service`. */
  def TaskDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ecs.TaskDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ecs.TaskDefinitionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    conf.logicalName2ecsTaskDefinitionFamily(name) match
      case Some(family) => argsBuilder = argsBuilder.family(family)
      case None         =>
    
    com.pulumi.aws.ecs.TaskDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EcsFunctions = com.pulumi.aws.ecs.EcsFunctions
  object EcsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ecs.EcsFunctions.*
  extension (self: EcsFunctions.type)
    /**
     * The ECS Cluster data source allows access to details of a specific
     *  cluster within an AWS ECS service.
     */
    def getCluster(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClusterArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getCluster(args(argsBuilder).build)

    /**
     * The ECS Cluster data source allows access to details of a specific
     *  cluster within an AWS ECS service.
     */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getClusterPlain(args(argsBuilder).build)

    /** Data source for managing an AWS ECS (Elastic Container) Clusters. */
    def getClusters(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClustersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClustersArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getClusters(args(argsBuilder).build)

    /** Data source for managing an AWS ECS (Elastic Container) Clusters. */
    def getClustersPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetClustersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetClustersPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getClustersPlain(args(argsBuilder).build)

    /**
     * The ECS container definition data source allows access to details of
     *  a specific container within an AWS ECS service.
     */
    def getContainerDefinition(args: Endofunction[com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetContainerDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getContainerDefinition(args(argsBuilder).build)

    /**
     * The ECS container definition data source allows access to details of
     *  a specific container within an AWS ECS service.
     */
    def getContainerDefinitionPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetContainerDefinitionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetContainerDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetContainerDefinitionPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getContainerDefinitionPlain(args(argsBuilder).build)

    /**
     * The ECS Service data source allows access to details of a specific
     *  Service within a AWS ECS Cluster.
     */
    def getService(args: Endofunction[com.pulumi.aws.ecs.inputs.GetServiceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetServiceArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getService(args(argsBuilder).build)

    /**
     * The ECS Service data source allows access to details of a specific
     *  Service within a AWS ECS Cluster.
     */
    def getServicePlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetServicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getServicePlain(args(argsBuilder).build)

    /**
     * The ECS task definition data source allows access to details of
     *  a specific AWS ECS task definition.
     */
    def getTaskDefinition(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetTaskDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskDefinition(args(argsBuilder).build)

    /**
     * The ECS task definition data source allows access to details of
     *  a specific AWS ECS task definition.
     */
    def getTaskDefinitionPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskDefinitionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetTaskDefinitionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskDefinitionPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskDefinitionPlain(args(argsBuilder).build)

    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     *  
     *  &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     */
    def getTaskExecution(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ecs.outputs.GetTaskExecutionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskExecution(args(argsBuilder).build)

    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     *  
     *  &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     */
    def getTaskExecutionPlain(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ecs.outputs.GetTaskExecutionResult] =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs.builder
      com.pulumi.aws.ecs.EcsFunctions.getTaskExecutionPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.Builder)
    /**
     * @param defaultCapacityProviderStrategies Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * @return builder
     */
    def defaultCapacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.ClusterCapacityProvidersArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.builder
      builder.defaultCapacityProviderStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.TaskDefinitionArgs.Builder)
    /**
     * @param ephemeralStorage The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * @return builder
     */
    def ephemeralStorage(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param placementConstraints Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param proxyConfiguration Configuration block for the App Mesh proxy. Detailed below.
     * @return builder
     */
    def proxyConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.builder
      builder.proxyConfiguration(args(argsBuilder).build)

    /**
     * @param runtimePlatform Configuration block for runtimePlatform that containers in your task may use.
     * @return builder
     */
    def runtimePlatform(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.Builder]):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.builder
      builder.runtimePlatform(args(argsBuilder).build)

    /**
     * @param volumes Repeatable configuration block for volumes that containers in your task may use. Detailed below.
     *  
     *  &gt; **NOTE:** Proper escaping is required for JSON field values containing quotes (`&#34;`) such as `environment` values. If directly setting the JSON, they should be escaped as `\&#34;` in the JSON,  e.g., `&#34;value&#34;: &#34;I \&#34;love\&#34; escaped quotes&#34;`. If using a variable value, they should be escaped as `\\\&#34;` in the variable, e.g., `value = &#34;I \\\&#34;love\\\&#34; escaped quotes&#34;` in the variable and `&#34;value&#34;: &#34;${var.myvariable}&#34;` in the JSON.
     *  
     *  &gt; **Note:** Fault injection only works with tasks using the `awsvpc` or `host` network modes. Fault injection isn&#39;t available on Windows.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder]*):
        com.pulumi.aws.ecs.TaskDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder)
    /**
     * @param ingressPaths List of ingress paths with access type and endpoint information.
     * @return builder
     */
    def ingressPaths(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceIngressPathArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceIngressPathArgs.builder
      builder.ingressPaths(args.map(_(argsBuilder).build)*)

    def networkConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceNetworkConfigurationArgs.builder
      builder.networkConfigurations(args.map(_(argsBuilder).build)*)

    def primaryContainer(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.builder
      builder.primaryContainer(args(argsBuilder).build)

    def scalingTargets(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceScalingTargetArgs.builder
      builder.scalingTargets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServiceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder)
    /**
     * @param clientAlias List of client aliases for this Service Connect service. You use these to assign names that can be used by client applications. For each service block where enabled is true, exactly one `clientAlias` with one `port` should be specified. See below.
     * @return builder
     */
    def clientAlias(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.builder
      builder.clientAlias(args.map(_(argsBuilder).build)*)

    /**
     * @param timeout Configuration timeouts for Service Connect
     * @return builder
     */
    def timeout(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTimeoutArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTimeoutArgs.builder
      builder.timeout(args(argsBuilder).build)

    /**
     * @param tls Configuration for enabling Transport Layer Security (TLS)
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersState.Builder)
    /**
     * @param defaultCapacityProviderStrategies Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * @return builder
     */
    def defaultCapacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs.builder
      builder.defaultCapacityProviderStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterState.Builder)
    /**
     * @param configuration Execute command configuration for the cluster. See `configuration` Block for details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param serviceConnectDefaults Default Service Connect namespace. See `serviceConnectDefaults` Block for details.
     * @return builder
     */
    def serviceConnectDefaults(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterServiceConnectDefaultsArgs.builder
      builder.serviceConnectDefaults(args(argsBuilder).build)

    /**
     * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. See `setting` Block for details.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterSettingArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ClusterSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.Builder)
    /**
     * @param authorizationConfig Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * @return builder
     */
    def authorizationConfig(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs.builder
      builder.authorizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.Builder)
    /**
     * @param testTrafficRules Configuration block for test traffic routing rules. See below.
     * @return builder
     */
    def testTrafficRules(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.builder
      builder.testTrafficRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder)
    def awsLogsConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerAwsLogsConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerAwsLogsConfigurationArgs.builder
      builder.awsLogsConfigurations(args.map(_(argsBuilder).build)*)

    def environments(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerEnvironmentArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    def repositoryCredentials(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerRepositoryCredentialsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerRepositoryCredentialsArgs.builder
      builder.repositoryCredentials(args(argsBuilder).build)

    def secrets(args: Endofunction[com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerSecretArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ExpressGatewayServicePrimaryContainerSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder)
    /**
     * @param logConfiguration Log configuration for the container. See below.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param services List of Service Connect service objects. See below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder)
    /**
     * @param instanceRequirements The instance requirements. You can specify the instance types and instance requirements such as vCPU count, memory, network performance, and accelerator specifications. Amazon ECS automatically selects the instances that match the specified criteria. Detailed below.
     * @return builder
     */
    def instanceRequirements(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param networkConfiguration The network configuration for Amazon ECS Managed Instances. This specifies the subnets and security groups that instances use for network connectivity. Detailed below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param storageConfiguration The storage configuration for Amazon ECS Managed Instances. This defines the root volume size and type for the instances. Detailed below.
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateStorageConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.Builder)
    /**
     * @param header Configuration block for header-based routing rules. See below.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.builder
      builder.header(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder)
    /**
     * @param dockerVolumeConfiguration Configuration block to configure a docker volume. Detailed below.
     * @return builder
     */
    def dockerVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs.builder
      builder.dockerVolumeConfiguration(args(argsBuilder).build)

    /**
     * @param efsVolumeConfiguration Configuration block for an EFS volume. Detailed below.
     * @return builder
     */
    def efsVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.builder
      builder.efsVolumeConfiguration(args(argsBuilder).build)

    /**
     * @param fsxWindowsFileServerVolumeConfiguration Configuration block for an FSX Windows File Server volume. Detailed below.
     * @return builder
     */
    def fsxWindowsFileServerVolumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.builder
      builder.fsxWindowsFileServerVolumeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.Builder)
    /**
     * @param tagSpecifications The tags to apply to the volume. See below.
     * @return builder
     */
    def tagSpecifications(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeTagSpecificationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeTagSpecificationArgs.builder
      builder.tagSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.Builder)
    /**
     * @param issuerCertAuthority Details of the certificate authority which will issue the certificate.
     * @return builder
     */
    def issuerCertAuthority(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthorityArgs.builder
      builder.issuerCertAuthority(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderState.Builder)
    /**
     * @param autoScalingGroupProvider Configuration block for the provider for the ECS auto scaling group. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    def autoScalingGroupProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.builder
      builder.autoScalingGroupProvider(args(argsBuilder).build)

    /**
     * @param managedInstancesProvider Configuration block for the managed instances provider. Detailed below. Exactly one of `autoScalingGroupProvider` or `managedInstancesProvider` must be specified.
     * @return builder
     */
    def managedInstancesProvider(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.builder
      builder.managedInstancesProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.Builder)
    /**
     * @param logConfiguration Log configuration for the results of the execute command actions. Required when `logging` is `OVERRIDE`. See `logConfiguration` Block for details.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder)
    /**
     * @param managedEbsVolume Configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. See below.
     * @return builder
     */
    def managedEbsVolume(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationManagedEbsVolumeArgs.builder
      builder.managedEbsVolume(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount The minimum and maximum number of accelerators for the instance types. This is used when you need instances with specific numbers of GPUs or other accelerators.
     * @return builder
     */
    def acceleratorCount(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib The minimum and maximum total accelerator memory in mebibytes (MiB). This is important for GPU workloads that require specific amounts of video memory.
     * @return builder
     */
    def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps The minimum and maximum baseline Amazon EBS bandwidth in megabits per second (Mbps). This is important for workloads with high storage I/O requirements.
     * @return builder
     */
    def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu The minimum and maximum amount of memory per vCPU in gibibytes (GiB). This helps ensure that instance types have the appropriate memory-to-CPU ratio for your workloads.
     * @return builder
     */
    def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib The minimum and maximum amount of memory in mebibytes (MiB) for the instance types. Amazon ECS selects instance types that have memory within this range.
     * @return builder
     */
    def memoryMib(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps The minimum and maximum network bandwidth in gigabits per second (Gbps). This is crucial for network-intensive workloads that require high throughput.
     * @return builder
     */
    def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount The minimum and maximum number of network interfaces for the instance types. This is useful for workloads that require multiple network interfaces.
     * @return builder
     */
    def networkInterfaceCount(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb The minimum and maximum total local storage in gigabytes (GB) for instance types with local storage.
     * @return builder
     */
    def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount The minimum and maximum number of vCPUs for the instance types. Amazon ECS selects instance types that have vCPU counts within this range.
     * @return builder
     */
    def vcpuCount(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.Builder)
    /**
     * @param value Configuration block for header value matching criteria. See below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderValueArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationServiceClientAliasTestTrafficRuleHeaderValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder)
    /**
     * @param canaryConfiguration Configuration block for canary deployment strategy. Required when `strategy` is set to `CANARY`. See below.
     * @return builder
     */
    def canaryConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationCanaryConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationCanaryConfigurationArgs.builder
      builder.canaryConfiguration(args(argsBuilder).build)

    /**
     * @param lifecycleHooks Configuration block for lifecycle hooks that are invoked during deployments. See below.
     * @return builder
     */
    def lifecycleHooks(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLifecycleHookArgs.builder
      builder.lifecycleHooks(args.map(_(argsBuilder).build)*)

    /**
     * @param linearConfiguration Configuration block for linear deployment strategy. Required when `strategy` is set to `LINEAR`. See below.
     * @return builder
     */
    def linearConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLinearConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationLinearConfigurationArgs.builder
      builder.linearConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceState.Builder)
    /**
     * @param alarms Information about the CloudWatch alarms. See below.
     * @return builder
     */
    def alarms(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceAlarmsArgs.builder
      builder.alarms(args(argsBuilder).build)

    /**
     * @param capacityProviderStrategies Capacity provider strategies to use for the service. Can be one or more. Updating this argument requires `forceNewDeployment = true`. See below. Conflicts with `launchType`.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param deploymentCircuitBreaker Configuration block for deployment circuit breaker. See below.
     * @return builder
     */
    def deploymentCircuitBreaker(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs.builder
      builder.deploymentCircuitBreaker(args(argsBuilder).build)

    /**
     * @param deploymentConfiguration Configuration block for deployment settings. See below.
     * @return builder
     */
    def deploymentConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentConfigurationArgs.builder
      builder.deploymentConfiguration(args(argsBuilder).build)

    /**
     * @param deploymentController Configuration block for deployment controller configuration. See below.
     * @return builder
     */
    def deploymentController(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs.builder
      builder.deploymentController(args(argsBuilder).build)

    /**
     * @param loadBalancers Configuration block for load balancers. See below.
     * @return builder
     */
    def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param orderedPlacementStrategies Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. The maximum number of `orderedPlacementStrategy` blocks is `5`. See below.
     * @return builder
     */
    def orderedPlacementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs.builder
      builder.orderedPlacementStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param placementConstraints Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `forceNewDeployment` is enabled. Maximum number of `placementConstraints` is `10`. See below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceConnectConfiguration ECS Service Connect configuration for this service to discover and connect to services, and be discovered by, and connected from, other services within a namespace. See below.
     * @return builder
     */
    def serviceConnectConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationArgs.builder
      builder.serviceConnectConfiguration(args(argsBuilder).build)

    /**
     * @param serviceRegistries Service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. See below.
     * @return builder
     */
    def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

    /**
     * @param volumeConfiguration Configuration for a volume specified in the task definition as a volume that is configured at launch time. Currently, the only supported volume type is an Amazon EBS volume. See below.
     * @return builder
     */
    def volumeConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVolumeConfigurationArgs.builder
      builder.volumeConfiguration(args(argsBuilder).build)

    /**
     * @param vpcLatticeConfigurations The VPC Lattice configuration for your service that allows Lattice to connect, secure, and monitor your service across multiple accounts and VPCs. See below.
     * @return builder
     */
    def vpcLatticeConfigurations(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceVpcLatticeConfigurationArgs.builder
      builder.vpcLatticeConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.Builder)
    /**
     * @param secretOptions Secrets to pass to the log configuration. See below.
     * @return builder
     */
    def secretOptions(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs.builder
      builder.secretOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.Builder)
    /**
     * @param authorizationConfig Configuration block for authorization for the Amazon EFS file system. Detailed below.
     * @return builder
     */
    def authorizationConfig(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs.builder
      builder.authorizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder)
    /**
     * @param infrastructureOptimization Defines how Amazon ECS Managed Instances optimizes the infrastructure in your capacity provider. Configure it to turn on or off the infrastructure optimization in your capacity provider, and to control the idle EC2 instances optimization delay.
     * @return builder
     */
    def infrastructureOptimization(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInfrastructureOptimizationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInfrastructureOptimizationArgs.builder
      builder.infrastructureOptimization(args(argsBuilder).build)

    /**
     * @param instanceLaunchTemplate The launch template configuration that specifies how Amazon ECS should launch Amazon EC2 instances. This includes the instance profile, network configuration, storage settings, and instance requirements for attribute-based instance type selection. For more information, see [Store instance launch parameters in Amazon EC2 launch templates](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html) in the Amazon EC2 User Guide. Detailed below.
     * @return builder
     */
    def instanceLaunchTemplate(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderManagedInstancesProviderInstanceLaunchTemplateArgs.builder
      builder.instanceLaunchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskSetState.Builder)
    /**
     * @param capacityProviderStrategies The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancers Details on load balancers that are used with a task set. Detailed below.
     * @return builder
     */
    def loadBalancers(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetLoadBalancerArgs.builder
      builder.loadBalancers(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param scale A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * @return builder
     */
    def scale(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetScaleArgs.builder
      builder.scale(args(argsBuilder).build)

    /**
     * @param serviceRegistries The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
     * @return builder
     */
    def serviceRegistries(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskSetState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesArgs.builder
      builder.serviceRegistries(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder)
    /**
     * @param executeCommandConfiguration Details of the execute command configuration. See `executeCommandConfiguration` Block for details.
     * @return builder
     */
    def executeCommandConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationArgs.builder
      builder.executeCommandConfiguration(args(argsBuilder).build)

    /**
     * @param managedStorageConfiguration Details of the managed storage configuration. See `managedStorageConfiguration` Block for details.
     * @return builder
     */
    def managedStorageConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ClusterConfigurationManagedStorageConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ClusterConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ClusterConfigurationManagedStorageConfigurationArgs.builder
      builder.managedStorageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder)
    /**
     * @param ephemeralStorage The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * @return builder
     */
    def ephemeralStorage(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param placementConstraints Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param proxyConfiguration Configuration block for the App Mesh proxy. Detailed below.
     * @return builder
     */
    def proxyConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs.builder
      builder.proxyConfiguration(args(argsBuilder).build)

    /**
     * @param runtimePlatform Configuration block for runtimePlatform that containers in your task may use.
     * @return builder
     */
    def runtimePlatform(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.Builder]):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs.builder
      builder.runtimePlatform(args(argsBuilder).build)

    /**
     * @param volumes Repeatable configuration block for volumes that containers in your task may use. Detailed below.
     *  
     *  &gt; **NOTE:** Proper escaping is required for JSON field values containing quotes (`&#34;`) such as `environment` values. If directly setting the JSON, they should be escaped as `\&#34;` in the JSON,  e.g., `&#34;value&#34;: &#34;I \&#34;love\&#34; escaped quotes&#34;`. If using a variable value, they should be escaped as `\\\&#34;` in the variable, e.g., `value = &#34;I \\\&#34;love\\\&#34; escaped quotes&#34;` in the variable and `&#34;value&#34;: &#34;${var.myvariable}&#34;` in the JSON.
     *  
     *  &gt; **Note:** Fault injection only works with tasks using the `awsvpc` or `host` network modes. Fault injection isn&#39;t available on Windows.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.TaskDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder)
    /**
     * @param advancedConfiguration Configuration block for Blue/Green deployment settings. Required when using `BLUE_GREEN` deployment strategy. See below.
     * @return builder
     */
    def advancedConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.ServiceLoadBalancerAdvancedConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.ServiceLoadBalancerAdvancedConfigurationArgs.builder
      builder.advancedConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder)
    /**
     * @param capacityProviderStrategies Set of capacity provider strategies to use for the cluster. See below.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param overrides A list of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.Builder]):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param placementStrategies The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
     * @return builder
     */
    def placementStrategies(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionPlacementStrategyArgs.builder
      builder.placementStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder)
    /**
     * @param managedScaling Configuration block defining the parameters of the auto scaling. Detailed below.
     * @return builder
     */
    def managedScaling(args: Endofunction[com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingArgs.Builder]):
        com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingArgs.builder
      builder.managedScaling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.Builder)
    /**
     * @param containerOverrides One or more container overrides that are sent to a task. See below.
     * @return builder
     */
    def containerOverrides(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.builder
      builder.containerOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder)
    /**
     * @param environments The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. See below.
     * @return builder
     */
    def environments(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideEnvironmentArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRequirements The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU. See below.
     * @return builder
     */
    def resourceRequirements(args: Endofunction[com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideResourceRequirementArgs.Builder]*):
        com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.ecs.inputs.GetTaskExecutionOverridesContainerOverrideResourceRequirementArgs.builder
      builder.resourceRequirements(args.map(_(argsBuilder).build)*)
