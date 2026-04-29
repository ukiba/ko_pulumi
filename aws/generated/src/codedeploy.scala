package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codedeploy:
  /**
   * Provides a CodeDeploy Deployment Group for a CodeDeploy Application
   *  
   *  &gt; **NOTE on blue/green deployments:** When using `greenFleetProvisioningOption` with the `COPY_AUTO_SCALING_GROUP` action, CodeDeploy will create a new ASG with a different name. This ASG is _not_ managed by this provider and will conflict with existing configuration and state. You may want to use a different approach to managing deployments that involve multiple ASG, such as `DISCOVER_EXISTING` with separate blue and green ASG.
   */
  def DeploymentGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codedeploy.DeploymentGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codedeploy.DeploymentGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CodeDeploy application to be used as a basis for deployments */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codedeploy.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codedeploy.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codedeploy.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CodeDeploy deployment config for an application */
  def DeploymentConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codedeploy.DeploymentConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codedeploy.DeploymentConfigArgs.builder
    
    com.pulumi.aws.codedeploy.DeploymentConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codedeploy.DeploymentConfigArgs.Builder)
    /**
     * @param minimumHealthyHosts A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
     * @return builder
     */
    def minimumHealthyHosts(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigMinimumHealthyHostsArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigMinimumHealthyHostsArgs.builder
      builder.minimumHealthyHosts(args(argsBuilder).build)

    /**
     * @param trafficRoutingConfig A trafficRoutingConfig block. Traffic Routing Config is documented below.
     * @return builder
     */
    def trafficRoutingConfig(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.builder
      builder.trafficRoutingConfig(args(argsBuilder).build)

    /**
     * @param zonalConfig A zonalConfig block. Zonal Config is documented below.
     * @return builder
     */
    def zonalConfig(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigArgs.builder
      builder.zonalConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder)
    /**
     * @param alarmConfiguration Configuration block of alarms associated with the deployment group (documented below).
     * @return builder
     */
    def alarmConfiguration(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationArgs.builder
      builder.alarmConfiguration(args(argsBuilder).build)

    /**
     * @param autoRollbackConfiguration Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * @return builder
     */
    def autoRollbackConfiguration(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationArgs.builder
      builder.autoRollbackConfiguration(args(argsBuilder).build)

    /**
     * @param blueGreenDeploymentConfig Configuration block of the blue/green deployment options for a deployment group (documented below).
     * @return builder
     */
    def blueGreenDeploymentConfig(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.builder
      builder.blueGreenDeploymentConfig(args(argsBuilder).build)

    /**
     * @param deploymentStyle Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * @return builder
     */
    def deploymentStyle(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleArgs.builder
      builder.deploymentStyle(args(argsBuilder).build)

    /**
     * @param ec2TagFilters Tag filters associated with the deployment group. See the AWS docs for details.
     * @return builder
     */
    def ec2TagFilters(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterArgs.Builder]*):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterArgs.builder
      builder.ec2TagFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2TagSets Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * @return builder
     */
    def ec2TagSets(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs.Builder]*):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs.builder
      builder.ec2TagSets(args.map(_(argsBuilder).build)*)

    /**
     * @param ecsService Configuration block(s) of the ECS services for a deployment group (documented below).
     * @return builder
     */
    def ecsService(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceArgs.builder
      builder.ecsService(args(argsBuilder).build)

    /**
     * @param loadBalancerInfo Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * @return builder
     */
    def loadBalancerInfo(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.Builder]):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.builder
      builder.loadBalancerInfo(args(argsBuilder).build)

    /**
     * @param onPremisesInstanceTagFilters On premise tag filters associated with the group. See the AWS docs for details.
     * @return builder
     */
    def onPremisesInstanceTagFilters(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterArgs.Builder]*):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterArgs.builder
      builder.onPremisesInstanceTagFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerConfigurations Configuration block(s) of the triggers for the deployment group (documented below).
     * @return builder
     */
    def triggerConfigurations(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationArgs.Builder]*):
        com.pulumi.aws.codedeploy.DeploymentGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationArgs.builder
      builder.triggerConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs.Builder)
    /**
     * @param prodTrafficRoute Configuration block for the production traffic route (documented below).
     * @return builder
     */
    def prodTrafficRoute(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs.builder
      builder.prodTrafficRoute(args(argsBuilder).build)

    /**
     * @param targetGroups Configuration blocks for a target group within a target group pair (documented below).
     * @return builder
     */
    def targetGroups(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs.builder
      builder.targetGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param testTrafficRoute Configuration block for the test traffic route (documented below).
     * @return builder
     */
    def testTrafficRoute(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs.builder
      builder.testTrafficRoute(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs.Builder)
    /**
     * @param ec2TagFilters Tag filters associated with the deployment group. See the AWS docs for details.
     * @return builder
     */
    def ec2TagFilters(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetEc2TagFilterArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetEc2TagFilterArgs.builder
      builder.ec2TagFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.Builder)
    /**
     * @param deploymentReadyOption Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
     * @return builder
     */
    def deploymentReadyOption(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionArgs.builder
      builder.deploymentReadyOption(args(argsBuilder).build)

    /**
     * @param greenFleetProvisioningOption Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
     * @return builder
     */
    def greenFleetProvisioningOption(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs.builder
      builder.greenFleetProvisioningOption(args(argsBuilder).build)

    /**
     * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
     *  
     *  _Only one `blueGreenDeploymentConfig` is allowed_.
     * @return builder
     */
    def terminateBlueInstancesOnDeploymentSuccess(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessArgs.builder
      builder.terminateBlueInstancesOnDeploymentSuccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentConfigState.Builder)
    /**
     * @param minimumHealthyHosts A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
     * @return builder
     */
    def minimumHealthyHosts(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigMinimumHealthyHostsArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentConfigState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigMinimumHealthyHostsArgs.builder
      builder.minimumHealthyHosts(args(argsBuilder).build)

    /**
     * @param trafficRoutingConfig A trafficRoutingConfig block. Traffic Routing Config is documented below.
     * @return builder
     */
    def trafficRoutingConfig(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentConfigState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.builder
      builder.trafficRoutingConfig(args(argsBuilder).build)

    /**
     * @param zonalConfig A zonalConfig block. Zonal Config is documented below.
     * @return builder
     */
    def zonalConfig(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentConfigState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigArgs.builder
      builder.zonalConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.Builder)
    /**
     * @param timeBasedCanary The time based canary configuration information. If `type` is `TimeBasedLinear`, use `timeBasedLinear` instead.
     * @return builder
     */
    def timeBasedCanary(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs.builder
      builder.timeBasedCanary(args(argsBuilder).build)

    /**
     * @param timeBasedLinear The time based linear configuration information. If `type` is `TimeBasedCanary`, use `timeBasedCanary` instead.
     * @return builder
     */
    def timeBasedLinear(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs.builder
      builder.timeBasedLinear(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.Builder)
    /**
     * @param elbInfos The Classic Elastic Load Balancer to use in a deployment. Conflicts with `targetGroupInfo` and `targetGroupPairInfo`.
     * @return builder
     */
    def elbInfos(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoElbInfoArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoElbInfoArgs.builder
      builder.elbInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupInfos The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elbInfo` and `targetGroupPairInfo`.
     * @return builder
     */
    def targetGroupInfos(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupInfoArgs.builder
      builder.targetGroupInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param targetGroupPairInfo The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elbInfo` and `targetGroupInfo`.
     * @return builder
     */
    def targetGroupPairInfo(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs.builder
      builder.targetGroupPairInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder)
    /**
     * @param alarmConfiguration Configuration block of alarms associated with the deployment group (documented below).
     * @return builder
     */
    def alarmConfiguration(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationArgs.builder
      builder.alarmConfiguration(args(argsBuilder).build)

    /**
     * @param autoRollbackConfiguration Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * @return builder
     */
    def autoRollbackConfiguration(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationArgs.builder
      builder.autoRollbackConfiguration(args(argsBuilder).build)

    /**
     * @param blueGreenDeploymentConfig Configuration block of the blue/green deployment options for a deployment group (documented below).
     * @return builder
     */
    def blueGreenDeploymentConfig(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs.builder
      builder.blueGreenDeploymentConfig(args(argsBuilder).build)

    /**
     * @param deploymentStyle Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * @return builder
     */
    def deploymentStyle(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleArgs.builder
      builder.deploymentStyle(args(argsBuilder).build)

    /**
     * @param ec2TagFilters Tag filters associated with the deployment group. See the AWS docs for details.
     * @return builder
     */
    def ec2TagFilters(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterArgs.builder
      builder.ec2TagFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2TagSets Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * @return builder
     */
    def ec2TagSets(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs.builder
      builder.ec2TagSets(args.map(_(argsBuilder).build)*)

    /**
     * @param ecsService Configuration block(s) of the ECS services for a deployment group (documented below).
     * @return builder
     */
    def ecsService(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceArgs.builder
      builder.ecsService(args(argsBuilder).build)

    /**
     * @param loadBalancerInfo Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * @return builder
     */
    def loadBalancerInfo(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs.builder
      builder.loadBalancerInfo(args(argsBuilder).build)

    /**
     * @param onPremisesInstanceTagFilters On premise tag filters associated with the group. See the AWS docs for details.
     * @return builder
     */
    def onPremisesInstanceTagFilters(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterArgs.builder
      builder.onPremisesInstanceTagFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerConfigurations Configuration block(s) of the triggers for the deployment group (documented below).
     * @return builder
     */
    def triggerConfigurations(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationArgs.Builder]*):
        com.pulumi.aws.codedeploy.inputs.DeploymentGroupState.Builder =
      def argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationArgs.builder
      builder.triggerConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigArgs.Builder)
    /**
     * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain available per Availability Zone during a deployment. If you don&#39;t specify a value under `minimumHealthyHostsPerZone`, then CodeDeploy uses a default value of 0 percent. This block is more documented below.
     * @return builder
     */
    def minimumHealthyHostsPerZone(args: Endofunction[com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigMinimumHealthyHostsPerZoneArgs.Builder]):
        com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codedeploy.inputs.DeploymentConfigZonalConfigMinimumHealthyHostsPerZoneArgs.builder
      builder.minimumHealthyHostsPerZone(args(argsBuilder).build)
