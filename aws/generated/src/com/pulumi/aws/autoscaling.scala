package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object autoscaling:
  extension (builder: com.pulumi.aws.autoscaling.GroupArgs.Builder)
    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability Zones. See Availability Zone Distribution below for more details.
     * @return builder
     */
    def availabilityZoneDistribution(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupAvailabilityZoneDistributionArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupAvailabilityZoneDistributionArgs.builder
      builder.availabilityZoneDistribution(args(argsBuilder).build)

    /**
     * @param capacityReservationSpecification The capacity reservation specification for the Auto Scaling group allows you to prioritize launching into On-Demand Capacity Reservations. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param initialLifecycleHooks One or more
     *  [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
     *  to attach to the Auto Scaling Group **before** instances are launched. The
     *  syntax is exactly the same as the separate
     *  `aws.autoscaling.LifecycleHook`
     *  resource, without the `autoscalingGroupName` attribute. Please note that this will only work when creating
     *  a new Auto Scaling Group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
     * @return builder
     */
    def initialLifecycleHooks(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInitialLifecycleHookArgs.Builder]*):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInitialLifecycleHookArgs.builder
      builder.initialLifecycleHooks(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceMaintenancePolicy If this block is configured, add a instance maintenance policy to the specified Auto Scaling group. Defined below.
     * @return builder
     */
    def instanceMaintenancePolicy(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInstanceMaintenancePolicyArgs.builder
      builder.instanceMaintenancePolicy(args(argsBuilder).build)

    /**
     * @param instanceRefresh If this block is configured, start an
     *  [Instance Refresh](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html)
     *  when this Auto Scaling Group is updated. Defined below.
     * @return builder
     */
    def instanceRefresh(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshArgs.builder
      builder.instanceRefresh(args(argsBuilder).build)

    /**
     * @param launchTemplate Nested argument with Launch template specification to use to launch instances. See Launch Template below for more details.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param mixedInstancesPolicy Configuration block containing settings to define launch targets for Auto Scaling groups. See Mixed Instances Policy below for more details.
     * @return builder
     */
    def mixedInstancesPolicy(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.builder
      builder.mixedInstancesPolicy(args(argsBuilder).build)

    /**
     * @param tags Configuration block(s) containing resource tags. See Tag below for more details.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupTagArgs.Builder]*):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficSources Attaches one or more traffic sources to the specified Auto Scaling group.
     * @return builder
     */
    def trafficSources(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupTrafficSourceArgs.Builder]*):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupTrafficSourceArgs.builder
      builder.trafficSources(args.map(_(argsBuilder).build)*)

    /**
     * @param warmPool If this block is configured, add a [Warm Pool](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     *  to the specified Auto Scaling group. Defined below
     * @return builder
     */
    def warmPool(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupWarmPoolArgs.Builder]):
        com.pulumi.aws.autoscaling.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupWarmPoolArgs.builder
      builder.warmPool(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs.Builder)
    /**
     * @param trafficSource The unique identifiers of a traffic sources.
     * @return builder
     */
    def trafficSource(args: Endofunction[com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentTrafficSourceArgs.Builder]):
        com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentTrafficSourceArgs.builder
      builder.trafficSource(args(argsBuilder).build)

  /**
   * Provides an Auto Scaling Group resource.
   *  
   *  &gt; **Note:** You must specify either `launchConfiguration`, `launchTemplate`, or `mixedInstancesPolicy`.
   *  
   *  &gt; **NOTE on Auto Scaling Groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling Group resource with `loadBalancers`, `targetGroupArns` and `trafficSource` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscaling.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.autoscaling.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an individual Autoscaling Group (ASG) tag. This resource should only be used in cases where ASGs are created outside the provider (e.g., ASGs implicitly created by EKS Node Groups).
   *  
   *  &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.autoscaling.Group` and `aws.autoscaling.Tag` to manage tags of the same ASG will cause a perpetual difference where the `aws.autoscaling.Group` resource will try to remove the tag being added by the `aws.autoscaling.Tag` resource.
   *  
   *  &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.autoscaling.TagArgs.builder
    
    com.pulumi.aws.autoscaling.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AutoScaling Schedule resource. */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.ScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.autoscaling.ScheduleArgs.builder
    
    com.pulumi.aws.autoscaling.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AutoScaling Group with Notification support, via SNS Topics. Each of
   *  the `notifications` map to a [Notification Configuration](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeNotificationConfigurations.html) inside Amazon Web
   *  Services, and are applied to each AutoScaling Group you supply.
   */
  def Notification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.NotificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.autoscaling.NotificationArgs.builder
    
    com.pulumi.aws.autoscaling.Notification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.autoscaling.TagArgs.Builder)
    /**
     * @param tag Tag to create. The `tag` block is documented below.
     * @return builder
     */
    def tag(args: Endofunction[com.pulumi.aws.autoscaling.inputs.TagTagArgs.Builder]):
        com.pulumi.aws.autoscaling.TagArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.TagTagArgs.builder
      builder.tag(args(argsBuilder).build)

  type AutoscalingFunctions = com.pulumi.aws.autoscaling.AutoscalingFunctions
  object AutoscalingFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.autoscaling.AutoscalingFunctions.*
  extension (self: AutoscalingFunctions.type)
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     *  ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
     */
    def getAmiIds(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.autoscaling.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getAmiIds(args(argsBuilder).build)

    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     *  ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
     */
    def getAmiIdsPlain(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetAmiIdsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.autoscaling.outputs.GetAmiIdsResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetAmiIdsPlainArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getAmiIdsPlain(args(argsBuilder).build)

    /** Use this data source to get information on an existing autoscaling group. */
    def getGroup(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.autoscaling.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetGroupArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to get information on an existing autoscaling group. */
    def getGroupPlain(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.autoscaling.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GetGroupPlainArgs.builder
      com.pulumi.aws.autoscaling.AutoscalingFunctions.getGroupPlain(args(argsBuilder).build)

  /**
   * Attaches a load balancer to an Auto Scaling group.
   *  
   *  &gt; **NOTE on Auto Scaling Groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling Group resource with `loadBalancers`, `targetGroupArns` and `trafficSource` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
   */
  def Attachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.AttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.autoscaling.AttachmentArgs.builder
    
    com.pulumi.aws.autoscaling.Attachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a traffic source to an Auto Scaling group.
   *  
   *  &gt; **NOTE on Auto Scaling Groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling Group resource with `loadBalancers`, `targetGroupArns` and `trafficSource` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
   */
  def TrafficSourceAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs.builder
    
    com.pulumi.aws.autoscaling.TrafficSourceAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.autoscaling.PolicyArgs.Builder)
    /**
     * @param predictiveScalingConfiguration Predictive scaling policy configuration to use with Amazon EC2 Auto Scaling.
     * @return builder
     */
    def predictiveScalingConfiguration(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs.Builder]):
        com.pulumi.aws.autoscaling.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs.builder
      builder.predictiveScalingConfiguration(args(argsBuilder).build)

    /**
     * @param stepAdjustments Set of adjustments that manage
     *  group scaling. These have the following structure:
     *  
     *  <pre>
     *  {@code
     *  package generated_program;
     *  
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.aws.autoscaling.Policy;
     *  import com.pulumi.aws.autoscaling.PolicyArgs;
     *  import com.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs;
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
     *          var example = new Policy("example", PolicyArgs.builder()
     *              .stepAdjustments(            
     *                  PolicyStepAdjustmentArgs.builder()
     *                      .scalingAdjustment(-1)
     *                      .metricIntervalLowerBound("1")
     *                      .metricIntervalUpperBound("2")
     *                      .build(),
     *                  PolicyStepAdjustmentArgs.builder()
     *                      .scalingAdjustment(1)
     *                      .metricIntervalLowerBound("2")
     *                      .metricIntervalUpperBound("3")
     *                      .build())
     *              .build());
     *  
     *      }
     *  }
     *  }
     *  </pre>
     *  
     *  The following fields are available in step adjustments:
     * @return builder
     */
    def stepAdjustments(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs.Builder]*):
        com.pulumi.aws.autoscaling.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs.builder
      builder.stepAdjustments(args.map(_(argsBuilder).build)*)

    /**
     * @param targetTrackingConfiguration Target tracking policy. These have the following structure:
     *  
     *  <pre>
     *  {@code
     *  package generated_program;
     *  
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.aws.autoscaling.Policy;
     *  import com.pulumi.aws.autoscaling.PolicyArgs;
     *  import com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs;
     *  import com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs;
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
     *          var example = new Policy("example", PolicyArgs.builder()
     *              .targetTrackingConfiguration(PolicyTargetTrackingConfigurationArgs.builder()
     *                  .predefinedMetricSpecification(PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs.builder()
     *                      .predefinedMetricType("ASGAverageCPUUtilization")
     *                      .build())
     *                  .targetValue(40.0)
     *                  .build())
     *              .build());
     *  
     *      }
     *  }
     *  }
     *  </pre>
     *  
     *  The following fields are available in target tracking configuration:
     * @return builder
     */
    def targetTrackingConfiguration(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.Builder]):
        com.pulumi.aws.autoscaling.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.builder
      builder.targetTrackingConfiguration(args(argsBuilder).build)

  /**
   * Provides an AutoScaling Scaling Policy resource.
   *  
   *  &gt; **NOTE:** You may want to omit `desiredCapacity` attribute from attached `aws.autoscaling.Group`
   *  when using autoscaling policies. It&#39;s good practice to pick either
   *  [manual](https://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-manual-scaling.html)
   *  or [dynamic](https://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html)
   *  (policy-based) scaling.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscaling.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.autoscaling.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentState.Builder)
    /**
     * @param trafficSource The unique identifiers of a traffic sources.
     * @return builder
     */
    def trafficSource(args: Endofunction[com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentTrafficSourceArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentTrafficSourceArgs.builder
      builder.trafficSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder)
    /**
     * @param customizedCapacityMetricSpecification Customized capacity metric specification. The field is only valid when you use `customizedLoadMetricSpecification`
     * @return builder
     */
    def customizedCapacityMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.builder
      builder.customizedCapacityMetricSpecification(args(argsBuilder).build)

    /**
     * @param customizedLoadMetricSpecification Customized load metric specification.
     * @return builder
     */
    def customizedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.builder
      builder.customizedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param customizedScalingMetricSpecification Customized scaling metric specification.
     * @return builder
     */
    def customizedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.builder
      builder.customizedScalingMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedLoadMetricSpecification Predefined load metric specification.
     * @return builder
     */
    def predefinedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationArgs.builder
      builder.predefinedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedMetricPairSpecification Metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * @return builder
     */
    def predefinedMetricPairSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs.builder
      builder.predefinedMetricPairSpecification(args(argsBuilder).build)

    /**
     * @param predefinedScalingMetricSpecification Predefined scaling metric specification.
     * @return builder
     */
    def predefinedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationArgs.builder
      builder.predefinedScalingMetricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesArgs.Builder)
    /**
     * @param alarmSpecification Alarm Specification for Instance Refresh.
     * @return builder
     */
    def alarmSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesAlarmSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesAlarmSpecificationArgs.builder
      builder.alarmSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs.Builder)
    /**
     * @param metricDimensions Dimensions of the metric.
     * @return builder
     */
    def metricDimensions(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionArgs.builder
      builder.metricDimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics Metrics to include, as a metric data query.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideArgs.Builder)
    /**
     * @param instanceRequirements Override the instance type in the Launch Template with instance types that satisfy the requirements.
     * @return builder
     */
    def instanceRequirements(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.builder
      builder.instanceRequirements(args(argsBuilder).build)

    /**
     * @param launchTemplateSpecification Override the instance launch template specification in the Launch Template.
     * @return builder
     */
    def launchTemplateSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecificationArgs.builder
      builder.launchTemplateSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupWarmPoolArgs.Builder)
    /**
     * @param instanceReusePolicy Whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
     * @return builder
     */
    def instanceReusePolicy(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupWarmPoolInstanceReusePolicyArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupWarmPoolArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupWarmPoolInstanceReusePolicyArgs.builder
      builder.instanceReusePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupState.Builder)
    /**
     * @param availabilityZoneDistribution The instance capacity distribution across Availability Zones. See Availability Zone Distribution below for more details.
     * @return builder
     */
    def availabilityZoneDistribution(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupAvailabilityZoneDistributionArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupAvailabilityZoneDistributionArgs.builder
      builder.availabilityZoneDistribution(args(argsBuilder).build)

    /**
     * @param capacityReservationSpecification The capacity reservation specification for the Auto Scaling group allows you to prioritize launching into On-Demand Capacity Reservations. See Capacity Reservation Specification below for more details.
     * @return builder
     */
    def capacityReservationSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationArgs.builder
      builder.capacityReservationSpecification(args(argsBuilder).build)

    /**
     * @param initialLifecycleHooks One or more
     *  [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
     *  to attach to the Auto Scaling Group **before** instances are launched. The
     *  syntax is exactly the same as the separate
     *  `aws.autoscaling.LifecycleHook`
     *  resource, without the `autoscalingGroupName` attribute. Please note that this will only work when creating
     *  a new Auto Scaling Group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
     * @return builder
     */
    def initialLifecycleHooks(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInitialLifecycleHookArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInitialLifecycleHookArgs.builder
      builder.initialLifecycleHooks(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceMaintenancePolicy If this block is configured, add a instance maintenance policy to the specified Auto Scaling group. Defined below.
     * @return builder
     */
    def instanceMaintenancePolicy(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInstanceMaintenancePolicyArgs.builder
      builder.instanceMaintenancePolicy(args(argsBuilder).build)

    /**
     * @param instanceRefresh If this block is configured, start an
     *  [Instance Refresh](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html)
     *  when this Auto Scaling Group is updated. Defined below.
     * @return builder
     */
    def instanceRefresh(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshArgs.builder
      builder.instanceRefresh(args(argsBuilder).build)

    /**
     * @param launchTemplate Nested argument with Launch template specification to use to launch instances. See Launch Template below for more details.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param mixedInstancesPolicy Configuration block containing settings to define launch targets for Auto Scaling groups. See Mixed Instances Policy below for more details.
     * @return builder
     */
    def mixedInstancesPolicy(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.builder
      builder.mixedInstancesPolicy(args(argsBuilder).build)

    /**
     * @param tags Configuration block(s) containing resource tags. See Tag below for more details.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupTagArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficSources Attaches one or more traffic sources to the specified Auto Scaling group.
     * @return builder
     */
    def trafficSources(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupTrafficSourceArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupTrafficSourceArgs.builder
      builder.trafficSources(args.map(_(argsBuilder).build)*)

    /**
     * @param warmPool If this block is configured, add a [Warm Pool](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     *  to the specified Auto Scaling group. Defined below
     * @return builder
     */
    def warmPool(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupWarmPoolArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupWarmPoolArgs.builder
      builder.warmPool(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationArgs.Builder)
    /**
     * @param capacityReservationTarget Describes a target Capacity Reservation or Capacity Reservation resource group.
     * @return builder
     */
    def capacityReservationTarget(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationCapacityReservationTargetArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupCapacityReservationSpecificationCapacityReservationTargetArgs.builder
      builder.capacityReservationTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateArgs.Builder)
    /**
     * @param launchTemplateSpecification Override the instance launch template specification in the Launch Template.
     * @return builder
     */
    def launchTemplateSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs.builder
      builder.launchTemplateSpecification(args(argsBuilder).build)

    /**
     * @param overrides List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder)
    /**
     * @param metricStat Structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metricStat`, but not both.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries List of up to 10 structures that defines custom load metric in predictive scaling policy
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.TagState.Builder)
    /**
     * @param tag Tag to create. The `tag` block is documented below.
     * @return builder
     */
    def tag(args: Endofunction[com.pulumi.aws.autoscaling.inputs.TagTagArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.TagState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.TagTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries List of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder)
    /**
     * @param metricDataQueries List of up to 10 structures that defines custom scaling metric in predictive scaling policy
     * @return builder
     */
    def metricDataQueries(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryArgs.builder
      builder.metricDataQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs.Builder)
    /**
     * @param filters Filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GetAmiIdsFilterArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.GetAmiIdsArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.GetAmiIdsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder)
    /**
     * @param metricStat Structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metricStat`, but not both.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs.Builder)
    /**
     * @param metricSpecification This structure includes the metrics and target utilization to use for predictive scaling.
     * @return builder
     */
    def metricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationArgs.builder
      builder.metricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyState.Builder)
    /**
     * @param predictiveScalingConfiguration Predictive scaling policy configuration to use with Amazon EC2 Auto Scaling.
     * @return builder
     */
    def predictiveScalingConfiguration(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs.builder
      builder.predictiveScalingConfiguration(args(argsBuilder).build)

    /**
     * @param stepAdjustments Set of adjustments that manage
     *  group scaling. These have the following structure:
     *  
     *  <pre>
     *  {@code
     *  package generated_program;
     *  
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.aws.autoscaling.Policy;
     *  import com.pulumi.aws.autoscaling.PolicyArgs;
     *  import com.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs;
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
     *          var example = new Policy("example", PolicyArgs.builder()
     *              .stepAdjustments(            
     *                  PolicyStepAdjustmentArgs.builder()
     *                      .scalingAdjustment(-1)
     *                      .metricIntervalLowerBound("1")
     *                      .metricIntervalUpperBound("2")
     *                      .build(),
     *                  PolicyStepAdjustmentArgs.builder()
     *                      .scalingAdjustment(1)
     *                      .metricIntervalLowerBound("2")
     *                      .metricIntervalUpperBound("3")
     *                      .build())
     *              .build());
     *  
     *      }
     *  }
     *  }
     *  </pre>
     *  
     *  The following fields are available in step adjustments:
     * @return builder
     */
    def stepAdjustments(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs.builder
      builder.stepAdjustments(args.map(_(argsBuilder).build)*)

    /**
     * @param targetTrackingConfiguration Target tracking policy. These have the following structure:
     *  
     *  <pre>
     *  {@code
     *  package generated_program;
     *  
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.aws.autoscaling.Policy;
     *  import com.pulumi.aws.autoscaling.PolicyArgs;
     *  import com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs;
     *  import com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs;
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
     *          var example = new Policy("example", PolicyArgs.builder()
     *              .targetTrackingConfiguration(PolicyTargetTrackingConfigurationArgs.builder()
     *                  .predefinedMetricSpecification(PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs.builder()
     *                      .predefinedMetricType("ASGAverageCPUUtilization")
     *                      .build())
     *                  .targetValue(40.0)
     *                  .build())
     *              .build());
     *  
     *      }
     *  }
     *  }
     *  </pre>
     *  
     *  The following fields are available in target tracking configuration:
     * @return builder
     */
    def targetTrackingConfiguration(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.builder
      builder.targetTrackingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricArgs.Builder)
    /**
     * @param metricStat Structure that defines CloudWatch metric to be used in target tracking scaling policy. You must specify either `expression` or `metricStat`, but not both.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder)
    /**
     * @param acceleratorCount Block describing the minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips). Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorCount(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsAcceleratorCountArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsAcceleratorCountArgs.builder
      builder.acceleratorCount(args(argsBuilder).build)

    /**
     * @param acceleratorTotalMemoryMib Block describing the minimum and maximum total memory of the accelerators. Default is no minimum or maximum.
     * @return builder
     */
    def acceleratorTotalMemoryMib(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsAcceleratorTotalMemoryMibArgs.builder
      builder.acceleratorTotalMemoryMib(args(argsBuilder).build)

    /**
     * @param baselineEbsBandwidthMbps Block describing the minimum and maximum baseline EBS bandwidth, in Mbps. Default is no minimum or maximum.
     * @return builder
     */
    def baselineEbsBandwidthMbps(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs.builder
      builder.baselineEbsBandwidthMbps(args(argsBuilder).build)

    /**
     * @param memoryGibPerVcpu Block describing the minimum and maximum amount of memory (GiB) per vCPU. Default is no minimum or maximum.
     * @return builder
     */
    def memoryGibPerVcpu(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs.builder
      builder.memoryGibPerVcpu(args(argsBuilder).build)

    /**
     * @param memoryMib Block describing the minimum and maximum amount of memory (MiB). Default is no maximum.
     * @return builder
     */
    def memoryMib(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryMibArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryMibArgs.builder
      builder.memoryMib(args(argsBuilder).build)

    /**
     * @param networkBandwidthGbps Block describing the minimum and maximum amount of network bandwidth, in gigabits per second (Gbps). Default is no minimum or maximum.
     * @return builder
     */
    def networkBandwidthGbps(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsNetworkBandwidthGbpsArgs.builder
      builder.networkBandwidthGbps(args(argsBuilder).build)

    /**
     * @param networkInterfaceCount Block describing the minimum and maximum number of network interfaces. Default is no minimum or maximum.
     * @return builder
     */
    def networkInterfaceCount(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsNetworkInterfaceCountArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsNetworkInterfaceCountArgs.builder
      builder.networkInterfaceCount(args(argsBuilder).build)

    /**
     * @param totalLocalStorageGb Block describing the minimum and maximum total local storage (GB). Default is no minimum or maximum.
     * @return builder
     */
    def totalLocalStorageGb(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsTotalLocalStorageGbArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsTotalLocalStorageGbArgs.builder
      builder.totalLocalStorageGb(args(argsBuilder).build)

    /**
     * @param vcpuCount Block describing the minimum and maximum number of vCPUs. Default is no maximum.
     * @return builder
     */
    def vcpuCount(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsVcpuCountArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsVcpuCountArgs.builder
      builder.vcpuCount(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder)
    /**
     * @param metricStat Structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metricStat`, but not both.
     * @return builder
     */
    def metricStat(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatArgs.builder
      builder.metricStat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder)
    /**
     * @param metric Structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
     * @return builder
     */
    def metric(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetricArgs.builder
      builder.metric(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.Builder)
    /**
     * @param instancesDistribution Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
     * @return builder
     */
    def instancesDistribution(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyInstancesDistributionArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyInstancesDistributionArgs.builder
      builder.instancesDistribution(args(argsBuilder).build)

    /**
     * @param launchTemplate Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshArgs.Builder)
    /**
     * @param preferences Override default parameters for Instance Refresh.
     * @return builder
     */
    def preferences(args: Endofunction[com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesArgs.builder
      builder.preferences(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder)
    /**
     * @param dimensions Dimensions of the metric.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.Builder]*):
        com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.Builder)
    /**
     * @param customizedMetricSpecification Customized metric. Conflicts with `predefinedMetricSpecification`.
     * @return builder
     */
    def customizedMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs.builder
      builder.customizedMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedMetricSpecification Predefined metric. Conflicts with `customizedMetricSpecification`.
     * @return builder
     */
    def predefinedMetricSpecification(args: Endofunction[com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs.builder
      builder.predefinedMetricSpecification(args(argsBuilder).build)

  /**
   * Provides an AutoScaling Lifecycle Hook resource.
   *  
   *  &gt; **NOTE:** This provider has two types of ways you can add lifecycle hooks - via
   *  the `initialLifecycleHook` attribute from the
   *  `aws.autoscaling.Group`
   *  resource, or via this one. Hooks added via this resource will not be added
   *  until the autoscaling group has been created, and depending on your
   *  capacity
   *  settings, after the initial instances have been launched, creating unintended
   *  behavior. If you need hooks to run on all instances, add them with
   *  `initialLifecycleHook` in
   *  `aws.autoscaling.Group`,
   *  but take care to not duplicate those hooks with this resource.
   */
  def LifecycleHook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscaling.LifecycleHookArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscaling.LifecycleHookArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.autoscaling.LifecycleHook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
