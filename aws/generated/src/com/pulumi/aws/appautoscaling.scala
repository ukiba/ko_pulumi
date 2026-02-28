package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object appautoscaling:
  extension (builder: com.pulumi.aws.appautoscaling.TargetArgs.Builder)
    /**
     * @param suspendedState Specifies whether the scaling activities for a scalable target are in a suspended state.
     * @return builder
     */
    def suspendedState(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.Builder]):
        com.pulumi.aws.appautoscaling.TargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.builder
      builder.suspendedState(args(argsBuilder).build)

  /** Provides an Application AutoScaling ScheduledAction resource. */
  def ScheduledAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appautoscaling.ScheduledActionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appautoscaling.ScheduledActionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.appautoscaling.ScheduledAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
   *  &gt; **NOTE:** Scalable targets created before 2023-03-20 may not have an assigned `arn`. These resource cannot use `tags` or participate in `defaultTags`. To prevent `pulumi preview` showing differences that can never be reconciled, use the `lifecycle.ignore_changes` meta-argument. See the example below.
   *  
   *  &gt; **NOTE:** The [Application Auto Scaling service automatically attempts to manage IAM Service-Linked Roles](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) when registering certain service namespaces for the first time. To manually manage this role, see the `aws.iam.ServiceLinkedRole` resource.
   */
  def Target(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appautoscaling.TargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appautoscaling.TargetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appautoscaling.Target(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /** Provides an Application AutoScaling Policy resource. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appautoscaling.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appautoscaling.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.appautoscaling.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.Builder)
    /**
     * @param stepAdjustments Set of adjustments that manage scaling. These have the following structure:
     *  
     *  <pre>
     *  {@code
     *  package generated_program;
     *  
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.aws.appautoscaling.Policy;
     *  import com.pulumi.aws.appautoscaling.PolicyArgs;
     *  import com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     *  
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     *  
     *      public static void stack(Context ctx) {
     *          var ecsPolicy = new Policy("ecsPolicy", PolicyArgs.builder()
     *              .stepScalingPolicyConfiguration(PolicyStepScalingPolicyConfigurationArgs.builder()
     *                  .stepAdjustments(                
     *                      PolicyStepScalingPolicyConfigurationStepAdjustmentArgs.builder()
     *                          .metricIntervalLowerBound("1")
     *                          .metricIntervalUpperBound("2")
     *                          .scalingAdjustment(-1)
     *                          .build(),
     *                      PolicyStepScalingPolicyConfigurationStepAdjustmentArgs.builder()
     *                          .metricIntervalLowerBound("2")
     *                          .metricIntervalUpperBound("3")
     *                          .scalingAdjustment(1)
     *                          .build())
     *                  .build())
     *              .build());
     *  
     *      }
     *  }
     *  }
     *  </pre>
     * @return builder
     */
    def stepAdjustments(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentArgs.builder
      builder.stepAdjustments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See supported fields below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries One or more metric data queries to provide data points for a metric specification. See supported fields below.
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder)
    /**
     * @param metricStat Information about the metric data to return. See supported fields below.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.Builder)
    /**
     * @param metricSpecifications Metrics and target utilization to use for predictive scaling. See supported fields below.
     * @return builder
     */
    def metricSpecifications(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.builder
      builder.metricSpecifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder)
    /**
     * @param metricStat Information about the metric data to return. See supported fields below.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See supported fields below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries One or more metric data queries to provide data points for a metric specification. See supported fields below.
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries One or more metric data queries to provide data points for a metric specification. See supported fields below.
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder)
    /**
     * @param customizedCapacityMetricSpecification Customized capacity metric specification. See supported fields below.
     * @return builder
     */
    def customizedCapacityMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.builder
      builder.customizedCapacityMetricSpecification(args(argsBuilder).build)

    /**
     * @param customizedLoadMetricSpecification Customized load metric specification. See supported fields below.
     * @return builder
     */
    def customizedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.builder
      builder.customizedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param customizedScalingMetricSpecification Customized scaling metric specification. See supported fields below.
     * @return builder
     */
    def customizedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.builder
      builder.customizedScalingMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedLoadMetricSpecification Predefined load metric specification. See supported fields below.
     * @return builder
     */
    def predefinedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs.builder
      builder.predefinedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedMetricPairSpecification Predefined metric pair specification that determines the appropriate scaling metric and load metric to use. See supported fields below.
     * @return builder
     */
    def predefinedMetricPairSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs.builder
      builder.predefinedMetricPairSpecification(args(argsBuilder).build)

    /**
     * @param predefinedScalingMetricSpecification Predefined scaling metric specification. See supported fields below.
     * @return builder
     */
    def predefinedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs.builder
      builder.predefinedScalingMetricSpecification(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.appautoscaling.inputs.TargetState.Builder)
    /**
     * @param suspendedState Specifies whether the scaling activities for a scalable target are in a suspended state.
     * @return builder
     */
    def suspendedState(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.TargetState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.TargetSuspendedStateArgs.builder
      builder.suspendedState(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics Metrics to include, as a metric data query.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder)
    /**
     * @param customizedMetricSpecification Custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
     * @return builder
     */
    def customizedMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs.builder
      builder.customizedMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedMetricSpecification Predefined metric. See supported fields below.
     * @return builder
     */
    def predefinedMetricSpecification(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs.builder
      builder.predefinedMetricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.Builder)
    /**
     * @param metricStat Structure that defines CloudWatch metric to be used in target tracking scaling policy. You must specify either `expression` or `metricStat`, but not both.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.ScheduledActionState.Builder)
    /**
     * @param scalableTargetAction New minimum and maximum capacity. You can set both values or just one. See below
     * @return builder
     */
    def scalableTargetAction(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.ScheduledActionState.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs.builder
      builder.scalableTargetAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder)
    /**
     * @param metricStat Information about the metric data to return. See supported fields below.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric. See supported fields below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.appautoscaling.inputs.PolicyPredictiveScalingPolicyConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)
