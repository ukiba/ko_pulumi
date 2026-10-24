package jp.ukiba.ko_pulumi
package aws

object autoscalingplans_ext:
  extension (builder: com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder)
    /**
     * @param applicationSource CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * @return builder
     */
    inline def applicationSource(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder]):
        com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.builder
      builder.applicationSource(args(argsBuilder).build)

    /**
     * @param scalingInstructions Scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * @return builder
     */
    inline def scalingInstructions(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.ScalingPlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.builder
      builder.scalingInstructions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder)
    /**
     * @param tagFilters Set of tags.
     * @return builder
     */
    inline def tagFilters(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceTagFilterArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceTagFilterArgs.builder
      builder.tagFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder)
    /**
     * @param customizedLoadMetricSpecification Customized load metric to use for predictive scaling. You must specify either `customizedLoadMetricSpecification` or `predefinedLoadMetricSpecification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
     * @return builder
     */
    inline def customizedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs.builder
      builder.customizedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedLoadMetricSpecification Predefined load metric to use for predictive scaling. You must specify either `predefinedLoadMetricSpecification` or `customizedLoadMetricSpecification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
     * @return builder
     */
    inline def predefinedLoadMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs.builder
      builder.predefinedLoadMetricSpecification(args(argsBuilder).build)

    /**
     * @param targetTrackingConfigurations Structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
     * @return builder
     */
    inline def targetTrackingConfigurations(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.builder
      builder.targetTrackingConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder)
    /**
     * @param customizedScalingMetricSpecification Customized metric. You can specify either `customizedScalingMetricSpecification` or `predefinedScalingMetricSpecification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
     * @return builder
     */
    inline def customizedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationArgs.builder
      builder.customizedScalingMetricSpecification(args(argsBuilder).build)

    /**
     * @param predefinedScalingMetricSpecification Predefined metric. You can specify either `predefinedScalingMetricSpecification` or `customizedScalingMetricSpecification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
     * @return builder
     */
    inline def predefinedScalingMetricSpecification(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationArgs.builder
      builder.predefinedScalingMetricSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.autoscalingplans.inputs.ScalingPlanState.Builder)
    /**
     * @param applicationSource CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * @return builder
     */
    inline def applicationSource(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.Builder]):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanState.Builder =
      val argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceArgs.builder
      builder.applicationSource(args(argsBuilder).build)

    /**
     * @param scalingInstructions Scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * @return builder
     */
    inline def scalingInstructions(args: Endofunction[com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.Builder]*):
        com.pulumi.aws.autoscalingplans.inputs.ScalingPlanState.Builder =
      def argsBuilder = com.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionArgs.builder
      builder.scalingInstructions(args.map(_(argsBuilder).build)*)
