package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object arcregionswitch:
  type ArcregionswitchFunctions = com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions
  object ArcregionswitchFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.*
  extension (self: ArcregionswitchFunctions.type)
    /** Data source for managing an Amazon ARC Region Switch plan. */
    def getPlan(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetPlanArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.arcregionswitch.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetPlanArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getPlan(args(argsBuilder).build)

    /** Data source for managing an Amazon ARC Region Switch plan. */
    def getPlanPlain(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetPlanPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.arcregionswitch.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getPlanPlain(args(argsBuilder).build)

    /** Data source for managing Amazon ARC Region Switch Route53 Health Checks. */
    def getRoute53HealthChecks(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.arcregionswitch.outputs.GetRoute53HealthChecksResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getRoute53HealthChecks(args(argsBuilder).build)

    /** Data source for managing Amazon ARC Region Switch Route53 Health Checks. */
    def getRoute53HealthChecksPlain(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.arcregionswitch.outputs.GetRoute53HealthChecksResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksPlainArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getRoute53HealthChecksPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.PlanArgs.Builder)
    /**
     * @param associatedAlarms Set of CloudWatch alarms associated with the plan. See Associated Alarms below.
     * @return builder
     */
    def associatedAlarms(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.builder
      builder.associatedAlarms(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.Builder]):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param triggers Set of triggers that can initiate the plan execution. See Triggers below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

    /**
     * @param workflows List of workflows that define the steps to execute. See Workflow below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  /** Resource for managing an Amazon ARC Region Switch plan. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.arcregionswitch.PlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.arcregionswitch.PlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.arcregionswitch.Plan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.Builder)
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder)
    /**
     * @param services ECS service configuration. See ECS Service below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigServiceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See Ungraceful Capacity below.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder)
    /**
     * @param conditions List of conditions that must be met. See Conditions below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTriggerConditionArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTriggerConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder)
    /**
     * @param steps List of steps in the workflow. See Step below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See Ungraceful Aurora below.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder)
    /**
     * @param eksClusters List of EKS clusters. See EKS Clusters below.
     * @return builder
     */
    def eksClusters(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigEksClusterArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigEksClusterArgs.builder
      builder.eksClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param kubernetesResourceTypes Kubernetes resource type. See Kubernetes Resource Type below.
     * @return builder
     */
    def kubernetesResourceTypes(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigKubernetesResourceTypeArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigKubernetesResourceTypeArgs.builder
      builder.kubernetesResourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingResources List of scaling resources. See Scaling Resources below.
     * @return builder
     */
    def scalingResources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.builder
      builder.scalingResources(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See Ungraceful Capacity below.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder)
    /**
     * @param eksClusters List of EKS clusters. See EKS Clusters below.
     * @return builder
     */
    def eksClusters(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigEksClusterArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigEksClusterArgs.builder
      builder.eksClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param kubernetesResourceTypes Kubernetes resource type. See Kubernetes Resource Type below.
     * @return builder
     */
    def kubernetesResourceTypes(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigKubernetesResourceTypeArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigKubernetesResourceTypeArgs.builder
      builder.kubernetesResourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingResources List of scaling resources. See Scaling Resources below.
     * @return builder
     */
    def scalingResources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.builder
      builder.scalingResources(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See Ungraceful Capacity below.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.Builder)
    /**
     * @param resources Set of resources to scale. See Resources below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.Builder)
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder)
    /**
     * @param associatedAlarms Set of CloudWatch alarms associated with the plan. See Associated Alarms below.
     * @return builder
     */
    def associatedAlarms(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.builder
      builder.associatedAlarms(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param triggers Set of triggers that can initiate the plan execution. See Triggers below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

    /**
     * @param workflows List of workflows that define the steps to execute. See Workflow below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.Builder)
    /**
     * @param regionAndRoutingControls List of regions and their routing controls. See Region and Routing Controls below.
     * @return builder
     */
    def regionAndRoutingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.builder
      builder.regionAndRoutingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See Ungraceful Aurora below.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder)
    /**
     * @param asgs Auto Scaling group configuration. See ASG below.
     * @return builder
     */
    def asgs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigAsgArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigAsgArgs.builder
      builder.asgs(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See Ungraceful below.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder)
    /**
     * @param services ECS service configuration. See ECS Service below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigServiceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See Ungraceful Capacity below.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.Builder)
    /**
     * @param steps List of steps to execute in parallel. Uses the same schema as Step but without `parallelConfig` to prevent infinite nesting.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder)
    /**
     * @param routingControls List of routing controls. See Routing Control below.
     * @return builder
     */
    def routingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.builder
      builder.routingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.Builder)
    /**
     * @param regionAndRoutingControls List of regions and their routing controls. See Region and Routing Controls below.
     * @return builder
     */
    def regionAndRoutingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.builder
      builder.regionAndRoutingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder)
    /**
     * @param arcRoutingControlConfigs Configuration for ARC routing control. See ARC Routing Control Config below.
     * @return builder
     */
    def arcRoutingControlConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.builder
      builder.arcRoutingControlConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customActionLambdaConfigs Configuration for Lambda function execution. See Custom Action Lambda Config below.
     * @return builder
     */
    def customActionLambdaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.builder
      builder.customActionLambdaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param documentDbConfigs Configuration for DocumentDB global cluster operations. See DocumentDB Config below.
     * @return builder
     */
    def documentDbConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.builder
      builder.documentDbConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2AsgCapacityIncreaseConfigs Configuration for EC2 Auto Scaling group capacity increase. See EC2 ASG Capacity Increase Config below.
     * @return builder
     */
    def ec2AsgCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.builder
      builder.ec2AsgCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ecsCapacityIncreaseConfigs Configuration for ECS service capacity increase. See ECS Capacity Increase Config below.
     * @return builder
     */
    def ecsCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.builder
      builder.ecsCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param eksResourceScalingConfigs Configuration for EKS resource scaling. See EKS Resource Scaling Config below.
     * @return builder
     */
    def eksResourceScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.builder
      builder.eksResourceScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param executionApprovalConfigs Configuration for manual approval steps. See Execution Approval Config below.
     * @return builder
     */
    def executionApprovalConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepExecutionApprovalConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepExecutionApprovalConfigArgs.builder
      builder.executionApprovalConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAuroraConfigs Configuration for Aurora Global Database operations. See Global Aurora Config below.
     * @return builder
     */
    def globalAuroraConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.builder
      builder.globalAuroraConfigs(args.map(_(argsBuilder).build)*)

    def regionSwitchPlanConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRegionSwitchPlanConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRegionSwitchPlanConfigArgs.builder
      builder.regionSwitchPlanConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param route53HealthCheckConfigs Configuration for Route53 health check operations. See Route53 Health Check Config below.
     * @return builder
     */
    def route53HealthCheckConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.builder
      builder.route53HealthCheckConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder)
    /**
     * @param asgs Auto Scaling group configuration. See ASG below.
     * @return builder
     */
    def asgs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigAsgArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigAsgArgs.builder
      builder.asgs(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See Ungraceful below.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder)
    /**
     * @param lambdas Lambda function configuration. See Lambda below.
     * @return builder
     */
    def lambdas(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigLambdaArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigLambdaArgs.builder
      builder.lambdas(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See Ungraceful below.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder)
    /**
     * @param lambdas Lambda function configuration. See Lambda below.
     * @return builder
     */
    def lambdas(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigLambdaArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigLambdaArgs.builder
      builder.lambdas(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See Ungraceful below.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.Builder)
    /**
     * @param resources Set of resources to scale. See Resources below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder)
    /**
     * @param arcRoutingControlConfigs Configuration for ARC routing control. See ARC Routing Control Config below.
     * @return builder
     */
    def arcRoutingControlConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.builder
      builder.arcRoutingControlConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customActionLambdaConfigs Configuration for Lambda function execution. See Custom Action Lambda Config below.
     * @return builder
     */
    def customActionLambdaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.builder
      builder.customActionLambdaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param documentDbConfigs Configuration for DocumentDB global cluster operations. See DocumentDB Config below.
     * @return builder
     */
    def documentDbConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.builder
      builder.documentDbConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2AsgCapacityIncreaseConfigs Configuration for EC2 Auto Scaling group capacity increase. See EC2 ASG Capacity Increase Config below.
     * @return builder
     */
    def ec2AsgCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.builder
      builder.ec2AsgCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ecsCapacityIncreaseConfigs Configuration for ECS service capacity increase. See ECS Capacity Increase Config below.
     * @return builder
     */
    def ecsCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.builder
      builder.ecsCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param eksResourceScalingConfigs Configuration for EKS resource scaling. See EKS Resource Scaling Config below.
     * @return builder
     */
    def eksResourceScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.builder
      builder.eksResourceScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param executionApprovalConfigs Configuration for manual approval steps. See Execution Approval Config below.
     * @return builder
     */
    def executionApprovalConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepExecutionApprovalConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepExecutionApprovalConfigArgs.builder
      builder.executionApprovalConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAuroraConfigs Configuration for Aurora Global Database operations. See Global Aurora Config below.
     * @return builder
     */
    def globalAuroraConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.builder
      builder.globalAuroraConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param parallelConfigs Configuration for parallel execution of multiple steps. See Parallel Config below.
     * @return builder
     */
    def parallelConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.builder
      builder.parallelConfigs(args.map(_(argsBuilder).build)*)

    def regionSwitchPlanConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRegionSwitchPlanConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRegionSwitchPlanConfigArgs.builder
      builder.regionSwitchPlanConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param route53HealthCheckConfigs Configuration for Route53 health check operations. See Route53 Health Check Config below.
     * @return builder
     */
    def route53HealthCheckConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.builder
      builder.route53HealthCheckConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder)
    /**
     * @param routingControls List of routing controls. See Routing Control below.
     * @return builder
     */
    def routingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.builder
      builder.routingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.Builder)
    /**
     * @param recordSets Configuration block for record sets. See Record Set below.
     * @return builder
     */
    def recordSets(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigRecordSetArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigRecordSetArgs.builder
      builder.recordSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.Builder)
    /**
     * @param recordSets Configuration block for record sets. See Record Set below.
     * @return builder
     */
    def recordSets(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigRecordSetArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigRecordSetArgs.builder
      builder.recordSets(args.map(_(argsBuilder).build)*)
