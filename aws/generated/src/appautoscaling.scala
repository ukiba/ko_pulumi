package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appautoscaling:
  /** Provides an Application AutoScaling Policy resource. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appautoscaling.PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appautoscaling.PolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.appautoscaling.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appautoscaling.PolicyArgs.Builder)
    /**
     * @param predictiveScalingPolicyConfiguration Predictive scaling policy configuration, requires `policyType = &#34;PredictiveScaling&#34;`. See supported fields below.
     * @return builder
     */
    def predictiveScalingPolicyConfiguration(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.Builder]):
        com.pulumi.aws.appautoscaling.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.builder
      builder.predictiveScalingPolicyConfiguration(args(argsBuilder).build)

    /**
     * @param stepScalingPolicyConfiguration Step scaling policy configuration, requires `policyType = &#34;StepScaling&#34;` (default). See supported fields below.
     * @return builder
     */
    def stepScalingPolicyConfiguration(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.Builder]):
        com.pulumi.aws.appautoscaling.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.builder
      builder.stepScalingPolicyConfiguration(args(argsBuilder).build)

    /**
     * @param targetTrackingScalingPolicyConfiguration Target tracking policy configuration, requires `policyType = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * @return builder
     */
    def targetTrackingScalingPolicyConfiguration(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder]):
        com.pulumi.aws.appautoscaling.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.builder
      builder.targetTrackingScalingPolicyConfiguration(args(argsBuilder).build)

  /** Provides an Application AutoScaling ScheduledAction resource. */
  def ScheduledAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appautoscaling.ScheduledActionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appautoscaling.ScheduledActionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.appautoscaling.ScheduledAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appautoscaling.ScheduledActionArgs.Builder)
    /**
     * @param scalableTargetAction New minimum and maximum capacity. You can set both values or just one. See below
     * @return builder
     */
    def scalableTargetAction(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs.Builder]):
        com.pulumi.aws.appautoscaling.ScheduledActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs.builder
      builder.scalableTargetAction(args(argsBuilder).build)

  /**
   * Provides an Application AutoScaling ScalableTarget resource. To manage policies which get attached to the target, see the `aws.appautoscaling.Policy` resource.
   * 
   * &gt; **NOTE:** Scalable targets created before 2023-03-20 may not have an assigned `arn`. These resource cannot use `tags` or participate in `defaultTags`. To prevent `pulumi preview` showing differences that can never be reconciled, use the `lifecycle.ignore_changes` meta-argument. See the example below.
   * 
   * &gt; **NOTE:** The [Application Auto Scaling service automatically attempts to manage IAM Service-Linked Roles](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) when registering certain service namespaces for the first time. To manually manage this role, see the `aws.iam.ServiceLinkedRole` resource.
   */
  def Target(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appautoscaling.TargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appautoscaling.TargetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.appautoscaling.Target(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appautoscaling.TargetArgs.Builder)
    /**
     * @param suspendedState Whether the scaling activities for a scalable target are in a suspended state.
     * @return builder
     */
    def suspendedState(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.Builder]):
        com.pulumi.aws.appautoscaling.TargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.builder
      builder.suspendedState(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.Builder)
    /**
     * @param metricSpecifications Metrics and target utilization to use for predictive scaling. See `predictive_scaling_policy_configuration.metric_specification` Block for details.
     * @return builder
     */
    def metricSpecifications(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.builder
      builder.metricSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder)
    /**
     * @param customizedCapacityMetricSpecification Customized capacity metric specification. See `predictive_scaling_policy_configuration.metric_specification.customized_capacity_metric_specification` Block for details.
     * @return builder
     */
    def customizedCapacityMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.builder
      builder.customizedCapacityMetricSpecification(args(argsBuilder).build)

    /**
     * @param customizedLoadMetricSpecification Customized load metric specification. See `predictive_scaling_policy_configuration.metric_specification.customized_load_metric_specification` Block for details.
     * @return builder
     */
    def customizedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.builder
      builder.customizedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param customizedScalingMetricSpecification Customized scaling metric specification. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification` Block for details.
     * @return builder
     */
    def customizedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.builder
      builder.customizedScalingMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedLoadMetricSpecification Predefined load metric specification. See `predictive_scaling_policy_configuration.metric_specification.predefined_load_metric_specification` Block for details.
     * @return builder
     */
    def predefinedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs.builder
      builder.predefinedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedMetricPairSpecification Predefined metric pair specification that determines the appropriate scaling metric and load metric to use. See `predictive_scaling_policy_configuration.metric_specification.predefined_metric_pair_specification` Block for details.
     * @return builder
     */
    def predefinedMetricPairSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs.builder
      builder.predefinedMetricPairSpecification(args(argsBuilder).build)

    /**
     * @param predefinedScalingMetricSpecification Predefined scaling metric specification. See `predictive_scaling_policy_configuration.metric_specification.predefined_scaling_metric_specification` Block for details.
     * @return builder
     */
    def predefinedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs.builder
      builder.predefinedScalingMetricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries One or more metric data queries to provide data points for a metric specification. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification.metric_data_query` Block for details.
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder)
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification.metric_data_query.metric_stat.metric.dimension` Block for details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries One or more metric data queries to provide data points for a metric specification. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification.metric_data_query` Block for details.
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder)
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification.metric_data_query.metric_stat.metric.dimension` Block for details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries One or more metric data queries to provide data points for a metric specification. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification.metric_data_query` Block for details.
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder)
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See `predictive_scaling_policy_configuration.metric_specification.customized_scaling_metric_specification.metric_data_query.metric_stat.metric.dimension` Block for details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyState.Builder)
    /**
     * @param predictiveScalingPolicyConfiguration Predictive scaling policy configuration, requires `policyType = &#34;PredictiveScaling&#34;`. See supported fields below.
     * @return builder
     */
    def predictiveScalingPolicyConfiguration(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.builder
      builder.predictiveScalingPolicyConfiguration(args(argsBuilder).build)

    /**
     * @param stepScalingPolicyConfiguration Step scaling policy configuration, requires `policyType = &#34;StepScaling&#34;` (default). See supported fields below.
     * @return builder
     */
    def stepScalingPolicyConfiguration(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.builder
      builder.stepScalingPolicyConfiguration(args(argsBuilder).build)

    /**
     * @param targetTrackingScalingPolicyConfiguration Target tracking policy configuration, requires `policyType = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * @return builder
     */
    def targetTrackingScalingPolicyConfiguration(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.builder
      builder.targetTrackingScalingPolicyConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.Builder)
    /**
     * @param stepAdjustments Set of adjustments that manage scaling. See `step_scaling_policy_configuration.step_adjustment` Block for details.
     * @return builder
     */
    def stepAdjustments(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentArgs.builder
      builder.stepAdjustments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder)
    /**
     * @param customizedMetricSpecification Custom CloudWatch metric. See the [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html) documentation. See `target_tracking_scaling_policy_configuration.customized_metric_specification` Block for details.
     * @return builder
     */
    def customizedMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.builder
      builder.customizedMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedMetricSpecification Predefined metric. See `target_tracking_scaling_policy_configuration.predefined_metric_specification` Block for details.
     * @return builder
     */
    def predefinedMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.builder
      builder.predefinedMetricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See `target_tracking_scaling_policy_configuration.customized_metric_specification.metrics.metric_stat.metric.dimensions` Block for details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics Metrics to include, as a metric data query. See `target_tracking_scaling_policy_configuration.customized_metric_specification.metrics` Block for details.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.Builder)
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder)
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See `target_tracking_scaling_policy_configuration.customized_metric_specification.metrics.metric_stat.metric.dimensions` Block for details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.ScheduledActionState.Builder)
    /**
     * @param scalableTargetAction New minimum and maximum capacity. You can set both values or just one. See below
     * @return builder
     */
    def scalableTargetAction(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.ScheduledActionState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs.builder
      builder.scalableTargetAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.TargetState.Builder)
    /**
     * @param suspendedState Whether the scaling activities for a scalable target are in a suspended state.
     * @return builder
     */
    def suspendedState(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.builder
      builder.suspendedState(args(argsBuilder).build)
