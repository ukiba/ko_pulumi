package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object scheduler:
  extension (builder: com.pulumi.aws.scheduler.ScheduleArgs.Builder)
    /**
     * @param flexibleTimeWindow Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
     * @return builder
     */
    def flexibleTimeWindow(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs.Builder]):
        com.pulumi.aws.scheduler.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs.builder
      builder.flexibleTimeWindow(args(argsBuilder).build)

    /**
     * @param target Configures the target of the schedule. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder]):
        com.pulumi.aws.scheduler.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /**
   * Provides an EventBridge Scheduler Schedule resource.
   *  
   *  You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.scheduler.ScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.scheduler.ScheduleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.scheduler.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an EventBridge Scheduler Schedule Group resource.
   *  
   *  You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def ScheduleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.scheduler.ScheduleGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.scheduler.ScheduleGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.scheduler.ScheduleGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder)
    /**
     * @param deadLetterConfig Information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be successfully delivered to a target to the queue. Detailed below.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param ecsParameters Templated target type for the Amazon ECS [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API operation. Detailed below.
     * @return builder
     */
    def ecsParameters(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.builder
      builder.ecsParameters(args(argsBuilder).build)

    /**
     * @param eventbridgeParameters Templated target type for the EventBridge [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html) API operation. Detailed below.
     * @return builder
     */
    def eventbridgeParameters(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetEventbridgeParametersArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetEventbridgeParametersArgs.builder
      builder.eventbridgeParameters(args(argsBuilder).build)

    /**
     * @param kinesisParameters Templated target type for the Amazon Kinesis [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API operation. Detailed below.
     * @return builder
     */
    def kinesisParameters(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetKinesisParametersArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetKinesisParametersArgs.builder
      builder.kinesisParameters(args(argsBuilder).build)

    /**
     * @param retryPolicy Information about the retry policy settings. Detailed below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetRetryPolicyArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param sagemakerPipelineParameters Templated target type for the Amazon SageMaker AI [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html) API operation. Detailed below.
     * @return builder
     */
    def sagemakerPipelineParameters(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetSagemakerPipelineParametersArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetSagemakerPipelineParametersArgs.builder
      builder.sagemakerPipelineParameters(args(argsBuilder).build)

    /**
     * @param sqsParameters The templated target type for the Amazon SQS [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html) API operation. Detailed below.
     * @return builder
     */
    def sqsParameters(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetSqsParametersArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetSqsParametersArgs.builder
      builder.sqsParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.scheduler.inputs.ScheduleState.Builder)
    /**
     * @param flexibleTimeWindow Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
     * @return builder
     */
    def flexibleTimeWindow(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs.builder
      builder.flexibleTimeWindow(args(argsBuilder).build)

    /**
     * @param target Configures the target of the schedule. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.scheduler.inputs.ScheduleTargetSagemakerPipelineParametersArgs.Builder)
    /**
     * @param pipelineParameters Set of up to 200 parameter names and values to use when executing the SageMaker AI Model Building Pipeline. Detailed below.
     * @return builder
     */
    def pipelineParameters(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetSagemakerPipelineParametersPipelineParameterArgs.Builder]*):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetSagemakerPipelineParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetSagemakerPipelineParametersPipelineParameterArgs.builder
      builder.pipelineParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.Builder)
    /**
     * @param capacityProviderStrategies Up to `6` capacity provider strategies to use for the task. Detailed below.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Configures the networking associated with the task. Detailed below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param placementConstraints A set of up to 10 placement constraints to use for the task. Detailed below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param placementStrategies A set of up to 5 placement strategies. Detailed below.
     * @return builder
     */
    def placementStrategies(args: Endofunction[com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.scheduler.inputs.ScheduleTargetEcsParametersPlacementStrategyArgs.builder
      builder.placementStrategies(args.map(_(argsBuilder).build)*)
