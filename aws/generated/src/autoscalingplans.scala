package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object autoscalingplans:
  /**
   * Manages an AWS Auto Scaling scaling plan.
   *  More information can be found in the [AWS Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html).
   *  
   *  &gt; **NOTE:** The AWS Auto Scaling service uses an AWS IAM service-linked role to manage predictive scaling of Amazon EC2 Auto Scaling groups. The service attempts to automatically create this role the first time a scaling plan with predictive scaling enabled is created.
   *  An `aws.iam.ServiceLinkedRole` resource can be used to manually manage this role.
   *  See the [AWS documentation](https://docs.aws.amazon.com/autoscaling/plans/userguide/aws-auto-scaling-service-linked-roles.html#create-service-linked-role-manual) for more details.
   */
  def ScalingPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.autoscalingplans.ScalingPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.autoscalingplans.ScalingPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder)
    /**
     * @param applicationSource CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * @return builder
     */
    def applicationSource(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder]):
        com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.builder
      builder.applicationSource(args(argsBuilder).build)

    /**
     * @param scalingInstructions Scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * @return builder
     */
    def scalingInstructions(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.builder
      builder.scalingInstructions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder)
    /**
     * @param customizedScalingMetricSpecification Customized metric. You can specify either `customizedScalingMetricSpecification` or `predefinedScalingMetricSpecification`.
     *  More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
     * @return builder
     */
    def customizedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationArgs.builder
      builder.customizedScalingMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedScalingMetricSpecification Predefined metric. You can specify either `predefinedScalingMetricSpecification` or `customizedScalingMetricSpecification`.
     *  More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
     * @return builder
     */
    def predefinedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs.builder
      builder.predefinedScalingMetricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanState.Builder)
    /**
     * @param applicationSource CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * @return builder
     */
    def applicationSource(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanState.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.builder
      builder.applicationSource(args(argsBuilder).build)

    /**
     * @param scalingInstructions Scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * @return builder
     */
    def scalingInstructions(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanState.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.builder
      builder.scalingInstructions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder)
    /**
     * @param tagFilters Set of tags.
     * @return builder
     */
    def tagFilters(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceTagFilterArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceTagFilterArgs.builder
      builder.tagFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder)
    /**
     * @param customizedLoadMetricSpecification Customized load metric to use for predictive scaling. You must specify either `customizedLoadMetricSpecification` or `predefinedLoadMetricSpecification` when configuring predictive scaling.
     *  More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
     * @return builder
     */
    def customizedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs.builder
      builder.customizedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedLoadMetricSpecification Predefined load metric to use for predictive scaling. You must specify either `predefinedLoadMetricSpecification` or `customizedLoadMetricSpecification` when configuring predictive scaling.
     *  More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
     * @return builder
     */
    def predefinedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs.builder
      builder.predefinedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param targetTrackingConfigurations Structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
     *  More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
     * @return builder
     */
    def targetTrackingConfigurations(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.builder
      builder.targetTrackingConfigurations(args.map(_(argsBuilder).build)*)
