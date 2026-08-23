package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object arcregionswitch:
  object ArcregionswitchFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an Amazon ARC Region Switch plan. */
    inline def getPlan(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.arcregionswitch.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetPlanArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getPlan(args(argsBuilder).build)

    /** Data source for managing an Amazon ARC Region Switch plan. */
    inline def getPlanPlain(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.arcregionswitch.outputs.GetPlanResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetPlanPlainArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getPlanPlain(args(argsBuilder).build)

    /** Data source for managing Amazon ARC Region Switch Route53 Health Checks. */
    inline def getRoute53HealthChecks(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.arcregionswitch.outputs.GetRoute53HealthChecksResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getRoute53HealthChecks(args(argsBuilder).build)

    /** Data source for managing Amazon ARC Region Switch Route53 Health Checks. */
    inline def getRoute53HealthChecksPlain(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.arcregionswitch.outputs.GetRoute53HealthChecksResult] =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.GetRoute53HealthChecksPlainArgs.builder
      com.pulumi.aws.arcregionswitch.ArcregionswitchFunctions.getRoute53HealthChecksPlain(args(argsBuilder).build)

  /** Resource for managing an Amazon ARC Region Switch plan. */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.arcregionswitch.PlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.arcregionswitch.PlanArgs.builder
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
    com.pulumi.aws.arcregionswitch.Plan(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.arcregionswitch.PlanArgs.Builder)
    /**
     * @param associatedAlarms CloudWatch alarms associated with the plan. See `associatedAlarms` Block for details.
     * @return builder
     */
    def associatedAlarms(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.builder
      builder.associatedAlarms(args.map(_(argsBuilder).build)*)

    /**
     * @param reportConfigurations Configuration for automated execution reports. See `reportConfiguration` Block for details.
     * @return builder
     */
    def reportConfigurations(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationArgs.builder
      builder.reportConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.Builder]):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param triggers Triggers that can initiate the plan execution. See `triggers` Block for details.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

    /**
     * @param workflows Workflows that define the steps to execute. See `workflow` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.PlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationArgs.Builder)
    /**
     * @param reportOutputs Output destination for the report. See `reportOutput` Block for details.
     * @return builder
     */
    def reportOutputs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationReportOutputArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationReportOutputArgs.builder
      builder.reportOutputs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationReportOutputArgs.Builder)
    /**
     * @param s3Configurations S3 output configuration. See `s3Configuration` Block for details.
     * @return builder
     */
    def s3Configurations(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationReportOutputS3ConfigurationArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationReportOutputArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationReportOutputS3ConfigurationArgs.builder
      builder.s3Configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder)
    /**
     * @param associatedAlarms CloudWatch alarms associated with the plan. See `associatedAlarms` Block for details.
     * @return builder
     */
    def associatedAlarms(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanAssociatedAlarmArgs.builder
      builder.associatedAlarms(args.map(_(argsBuilder).build)*)

    /**
     * @param reportConfigurations Configuration for automated execution reports. See `reportConfiguration` Block for details.
     * @return builder
     */
    def reportConfigurations(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanReportConfigurationArgs.builder
      builder.reportConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param triggers Triggers that can initiate the plan execution. See `triggers` Block for details.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

    /**
     * @param workflows Workflows that define the steps to execute. See `workflow` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def workflows(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanState.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.builder
      builder.workflows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder)
    /**
     * @param conditions Conditions that must be met. See `conditions` Block for details.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanTriggerConditionArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanTriggerArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanTriggerConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder)
    /**
     * @param steps Steps in the workflow. See `step` Block for details.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.Builder)
    /**
     * @param regionAndRoutingControls Regions and their routing controls. See `regionAndRoutingControls` Block for details.
     * @return builder
     */
    def regionAndRoutingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.builder
      builder.regionAndRoutingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder)
    /**
     * @param routingControls Routing controls. See `routingControl` Block for details.
     * @return builder
     */
    def routingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.builder
      builder.routingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder)
    /**
     * @param arcRoutingControlConfigs Configuration for ARC routing control. See `arcRoutingControlConfig` Block for details.
     * @return builder
     */
    def arcRoutingControlConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArcRoutingControlConfigArgs.builder
      builder.arcRoutingControlConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param auroraProvisionedScalingConfigs Configuration for Aurora provisioned scaling. See `auroraProvisionedScalingConfig` Block for details.
     * @return builder
     */
    def auroraProvisionedScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepAuroraProvisionedScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepAuroraProvisionedScalingConfigArgs.builder
      builder.auroraProvisionedScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param auroraServerlessScalingConfigs Configuration for Aurora Serverless scaling. See `auroraServerlessScalingConfig` Block for details.
     * @return builder
     */
    def auroraServerlessScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepAuroraServerlessScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepAuroraServerlessScalingConfigArgs.builder
      builder.auroraServerlessScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customActionLambdaConfigs Configuration for Lambda function execution. See `customActionLambdaConfig` Block for details.
     * @return builder
     */
    def customActionLambdaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.builder
      builder.customActionLambdaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param documentDbConfigs Configuration for DocumentDB global cluster operations. See `documentDbConfig` Block for details.
     * @return builder
     */
    def documentDbConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.builder
      builder.documentDbConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2AsgCapacityIncreaseConfigs Configuration for EC2 Auto Scaling group capacity increase. See `ec2AsgCapacityIncreaseConfig` Block for details.
     * @return builder
     */
    def ec2AsgCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.builder
      builder.ec2AsgCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ecsCapacityIncreaseConfigs Configuration for ECS service capacity increase. See `ecsCapacityIncreaseConfig` Block for details.
     * @return builder
     */
    def ecsCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.builder
      builder.ecsCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param eksResourceScalingConfigs Configuration for EKS resource scaling. See `eksResourceScalingConfig` Block for details.
     * @return builder
     */
    def eksResourceScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.builder
      builder.eksResourceScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param executionApprovalConfigs Configuration for manual approval steps. See `executionApprovalConfig` Block for details.
     * @return builder
     */
    def executionApprovalConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepExecutionApprovalConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepExecutionApprovalConfigArgs.builder
      builder.executionApprovalConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAuroraConfigs Configuration for Aurora Global Database operations. See `globalAuroraConfig` Block for details.
     * @return builder
     */
    def globalAuroraConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.builder
      builder.globalAuroraConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaEventSourceMappingConfigs Configuration for Lambda event source mapping operations. See `lambdaEventSourceMappingConfig` Block for details.
     * @return builder
     */
    def lambdaEventSourceMappingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigArgs.builder
      builder.lambdaEventSourceMappingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param neptuneGlobalDatabaseConfigs Configuration for Neptune global database operations. See `neptuneGlobalDatabaseConfig` Block for details.
     * @return builder
     */
    def neptuneGlobalDatabaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepNeptuneGlobalDatabaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepNeptuneGlobalDatabaseConfigArgs.builder
      builder.neptuneGlobalDatabaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param parallelConfigs Configuration for parallel execution of multiple steps. See `parallelConfig` Block for details.
     * @return builder
     */
    def parallelConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.builder
      builder.parallelConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rdsCreateCrossRegionReadReplicaConfigs Configuration for creating cross-region RDS read replicas. See `rdsCreateCrossRegionReadReplicaConfig` Block for details.
     * @return builder
     */
    def rdsCreateCrossRegionReadReplicaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRdsCreateCrossRegionReadReplicaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRdsCreateCrossRegionReadReplicaConfigArgs.builder
      builder.rdsCreateCrossRegionReadReplicaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rdsPromoteReadReplicaConfigs Configuration for promoting RDS read replicas. See `rdsPromoteReadReplicaConfig` Block for details.
     * @return builder
     */
    def rdsPromoteReadReplicaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRdsPromoteReadReplicaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRdsPromoteReadReplicaConfigArgs.builder
      builder.rdsPromoteReadReplicaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param regionSwitchPlanConfigs Configuration for executing a nested region switch plan. See `regionSwitchPlanConfig` Block for details.
     * @return builder
     */
    def regionSwitchPlanConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRegionSwitchPlanConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRegionSwitchPlanConfigArgs.builder
      builder.regionSwitchPlanConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param route53HealthCheckConfigs Configuration for Route53 health check operations. See `route53HealthCheckConfig` Block for details.
     * @return builder
     */
    def route53HealthCheckConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.builder
      builder.route53HealthCheckConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder)
    /**
     * @param lambdas Lambda function configuration. See `lambda` Block for details.
     * @return builder
     */
    def lambdas(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigLambdaArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigLambdaArgs.builder
      builder.lambdas(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.custom_action_lambda_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepCustomActionLambdaConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.document_db_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepDocumentDbConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder)
    /**
     * @param asgs Auto Scaling group configuration. See `asg` Block for details.
     * @return builder
     */
    def asgs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigAsgArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigAsgArgs.builder
      builder.asgs(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See `workflow.step.ec2_asg_capacity_increase_config.ungraceful` Block for details.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEc2AsgCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder)
    /**
     * @param services ECS service configuration. See `service` Block for details.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigServiceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See `workflow.step.ecs_capacity_increase_config.ungraceful` Block for details.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEcsCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder)
    /**
     * @param eksClusters EKS clusters. See `eksClusters` Block for details.
     * @return builder
     */
    def eksClusters(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigEksClusterArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigEksClusterArgs.builder
      builder.eksClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param kubernetesResourceTypes Kubernetes resource type. See `kubernetesResourceType` Block for details.
     * @return builder
     */
    def kubernetesResourceTypes(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigKubernetesResourceTypeArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigKubernetesResourceTypeArgs.builder
      builder.kubernetesResourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingResources Scaling resources. See `scalingResources` Block for details.
     * @return builder
     */
    def scalingResources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.builder
      builder.scalingResources(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.eks_resource_scaling_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.Builder)
    /**
     * @param resources Resources to scale. See `resources` Block for details.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepEksResourceScalingConfigScalingResourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.global_aurora_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepGlobalAuroraConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigArgs.Builder)
    /**
     * @param regionEventSourceMappings Event source mappings per region. See `regionEventSourceMapping` Block for details.
     * @return builder
     */
    def regionEventSourceMappings(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigRegionEventSourceMappingArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigRegionEventSourceMappingArgs.builder
      builder.regionEventSourceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.lambda_event_source_mapping_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepLambdaEventSourceMappingConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepNeptuneGlobalDatabaseConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.neptune_global_database_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepNeptuneGlobalDatabaseConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepNeptuneGlobalDatabaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepNeptuneGlobalDatabaseConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.Builder)
    /**
     * @param steps Steps to execute in parallel. See `step` Block for details. The parallel step schema matches `step` Block but does not support `parallelConfig` to prevent infinite nesting.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.Builder)
    /**
     * @param regionAndRoutingControls Regions and their routing controls. See `regionAndRoutingControls` Block for details.
     * @return builder
     */
    def regionAndRoutingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.builder
      builder.regionAndRoutingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder)
    /**
     * @param routingControls Routing controls. See `routingControl` Block for details.
     * @return builder
     */
    def routingControls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigRegionAndRoutingControlRoutingControlArgs.builder
      builder.routingControls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder)
    /**
     * @param arcRoutingControlConfigs Configuration for ARC routing control. See `arcRoutingControlConfig` Block for details.
     * @return builder
     */
    def arcRoutingControlConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArcRoutingControlConfigArgs.builder
      builder.arcRoutingControlConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param auroraProvisionedScalingConfigs Configuration for Aurora provisioned scaling. See `auroraProvisionedScalingConfig` Block for details.
     * @return builder
     */
    def auroraProvisionedScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepAuroraProvisionedScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepAuroraProvisionedScalingConfigArgs.builder
      builder.auroraProvisionedScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param auroraServerlessScalingConfigs Configuration for Aurora Serverless scaling. See `auroraServerlessScalingConfig` Block for details.
     * @return builder
     */
    def auroraServerlessScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepAuroraServerlessScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepAuroraServerlessScalingConfigArgs.builder
      builder.auroraServerlessScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param customActionLambdaConfigs Configuration for Lambda function execution. See `customActionLambdaConfig` Block for details.
     * @return builder
     */
    def customActionLambdaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.builder
      builder.customActionLambdaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param documentDbConfigs Configuration for DocumentDB global cluster operations. See `documentDbConfig` Block for details.
     * @return builder
     */
    def documentDbConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.builder
      builder.documentDbConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2AsgCapacityIncreaseConfigs Configuration for EC2 Auto Scaling group capacity increase. See `ec2AsgCapacityIncreaseConfig` Block for details.
     * @return builder
     */
    def ec2AsgCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.builder
      builder.ec2AsgCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ecsCapacityIncreaseConfigs Configuration for ECS service capacity increase. See `ecsCapacityIncreaseConfig` Block for details.
     * @return builder
     */
    def ecsCapacityIncreaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.builder
      builder.ecsCapacityIncreaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param eksResourceScalingConfigs Configuration for EKS resource scaling. See `eksResourceScalingConfig` Block for details.
     * @return builder
     */
    def eksResourceScalingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.builder
      builder.eksResourceScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param executionApprovalConfigs Configuration for manual approval steps. See `executionApprovalConfig` Block for details.
     * @return builder
     */
    def executionApprovalConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepExecutionApprovalConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepExecutionApprovalConfigArgs.builder
      builder.executionApprovalConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAuroraConfigs Configuration for Aurora Global Database operations. See `globalAuroraConfig` Block for details.
     * @return builder
     */
    def globalAuroraConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.builder
      builder.globalAuroraConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaEventSourceMappingConfigs Configuration for Lambda event source mapping operations. See `lambdaEventSourceMappingConfig` Block for details.
     * @return builder
     */
    def lambdaEventSourceMappingConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigArgs.builder
      builder.lambdaEventSourceMappingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param neptuneGlobalDatabaseConfigs Configuration for Neptune global database operations. See `neptuneGlobalDatabaseConfig` Block for details.
     * @return builder
     */
    def neptuneGlobalDatabaseConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepNeptuneGlobalDatabaseConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepNeptuneGlobalDatabaseConfigArgs.builder
      builder.neptuneGlobalDatabaseConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rdsCreateCrossRegionReadReplicaConfigs Configuration for creating cross-region RDS read replicas. See `rdsCreateCrossRegionReadReplicaConfig` Block for details.
     * @return builder
     */
    def rdsCreateCrossRegionReadReplicaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRdsCreateCrossRegionReadReplicaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRdsCreateCrossRegionReadReplicaConfigArgs.builder
      builder.rdsCreateCrossRegionReadReplicaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rdsPromoteReadReplicaConfigs Configuration for promoting RDS read replicas. See `rdsPromoteReadReplicaConfig` Block for details.
     * @return builder
     */
    def rdsPromoteReadReplicaConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRdsPromoteReadReplicaConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRdsPromoteReadReplicaConfigArgs.builder
      builder.rdsPromoteReadReplicaConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param regionSwitchPlanConfigs Configuration for executing a nested region switch plan. See `regionSwitchPlanConfig` Block for details.
     * @return builder
     */
    def regionSwitchPlanConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRegionSwitchPlanConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRegionSwitchPlanConfigArgs.builder
      builder.regionSwitchPlanConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param route53HealthCheckConfigs Configuration for Route53 health check operations. See `route53HealthCheckConfig` Block for details.
     * @return builder
     */
    def route53HealthCheckConfigs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.builder
      builder.route53HealthCheckConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder)
    /**
     * @param lambdas Lambda function configuration. See `lambda` Block for details.
     * @return builder
     */
    def lambdas(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigLambdaArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigLambdaArgs.builder
      builder.lambdas(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.custom_action_lambda_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepCustomActionLambdaConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.document_db_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepDocumentDbConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder)
    /**
     * @param asgs Auto Scaling group configuration. See `asg` Block for details.
     * @return builder
     */
    def asgs(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigAsgArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigAsgArgs.builder
      builder.asgs(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See `workflow.step.ec2_asg_capacity_increase_config.ungraceful` Block for details.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEc2AsgCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder)
    /**
     * @param services ECS service configuration. See `service` Block for details.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigServiceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

    /**
     * @param ungraceful Ungraceful behavior configuration. See `workflow.step.ecs_capacity_increase_config.ungraceful` Block for details.
     * @return builder
     */
    def ungraceful(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigUngracefulArgs.Builder]):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEcsCapacityIncreaseConfigUngracefulArgs.builder
      builder.ungraceful(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder)
    /**
     * @param eksClusters EKS clusters. See `eksClusters` Block for details.
     * @return builder
     */
    def eksClusters(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigEksClusterArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigEksClusterArgs.builder
      builder.eksClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param kubernetesResourceTypes Kubernetes resource type. See `kubernetesResourceType` Block for details.
     * @return builder
     */
    def kubernetesResourceTypes(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigKubernetesResourceTypeArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigKubernetesResourceTypeArgs.builder
      builder.kubernetesResourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingResources Scaling resources. See `scalingResources` Block for details.
     * @return builder
     */
    def scalingResources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.builder
      builder.scalingResources(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.eks_resource_scaling_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.Builder)
    /**
     * @param resources Resources to scale. See `resources` Block for details.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceResourceArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepEksResourceScalingConfigScalingResourceResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.global_aurora_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepGlobalAuroraConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigArgs.Builder)
    /**
     * @param regionEventSourceMappings Event source mappings per region. See `regionEventSourceMapping` Block for details.
     * @return builder
     */
    def regionEventSourceMappings(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigRegionEventSourceMappingArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigRegionEventSourceMappingArgs.builder
      builder.regionEventSourceMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.lambda_event_source_mapping_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepLambdaEventSourceMappingConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepNeptuneGlobalDatabaseConfigArgs.Builder)
    /**
     * @param ungracefuls Ungraceful behavior configuration. See `workflow.step.neptune_global_database_config.ungraceful` Block for details.
     * @return builder
     */
    def ungracefuls(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepNeptuneGlobalDatabaseConfigUngracefulArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepNeptuneGlobalDatabaseConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepNeptuneGlobalDatabaseConfigUngracefulArgs.builder
      builder.ungracefuls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.Builder)
    /**
     * @param recordSets Configuration block for record sets. See `recordSet` Block for details.
     * @return builder
     */
    def recordSets(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigRecordSetArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepParallelConfigStepRoute53HealthCheckConfigRecordSetArgs.builder
      builder.recordSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.Builder)
    /**
     * @param recordSets Configuration block for record sets. See `recordSet` Block for details.
     * @return builder
     */
    def recordSets(args: Endofunction[com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigRecordSetArgs.Builder]*):
        com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.arcregionswitch.inputs.PlanWorkflowStepRoute53HealthCheckConfigRecordSetArgs.builder
      builder.recordSets(args.map(_(argsBuilder).build)*)
