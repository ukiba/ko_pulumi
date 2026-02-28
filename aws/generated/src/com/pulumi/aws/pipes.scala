package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object pipes:
  extension (builder: com.pulumi.aws.pipes.PipeArgs.Builder)
    /**
     * @param enrichmentParameters Parameters to configure enrichment for your pipe. Detailed below.
     * @return builder
     */
    def enrichmentParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersArgs.Builder]):
        com.pulumi.aws.pipes.PipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersArgs.builder
      builder.enrichmentParameters(args(argsBuilder).build)

    /**
     * @param logConfiguration Logging configuration settings for the pipe. Detailed below.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.Builder]):
        com.pulumi.aws.pipes.PipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param sourceParameters Parameters to configure a source for the pipe. Detailed below.
     * @return builder
     */
    def sourceParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder]):
        com.pulumi.aws.pipes.PipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.builder
      builder.sourceParameters(args(argsBuilder).build)

    /**
     * @param targetParameters Parameters to configure a target for your pipe. Detailed below.
     * @return builder
     */
    def targetParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder]):
        com.pulumi.aws.pipes.PipeArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.builder
      builder.targetParameters(args(argsBuilder).build)

  /**
   * Resource for managing an AWS EventBridge Pipes Pipe.
   *  
   *  You can find out more about EventBridge Pipes in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html).
   *  
   *  EventBridge Pipes are very configurable, and may require IAM permissions to work correctly. More information on the configuration options and IAM permissions can be found in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html).
   *  
   *  &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
   */
  def Pipe(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.pipes.PipeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.pipes.PipeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.pipes.Pipe(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersManagedStreamingKafkaParametersArgs.Builder)
    /**
     * @param credentials The credentials needed to access the resource. Detailed below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersManagedStreamingKafkaParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersManagedStreamingKafkaParametersCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeState.Builder)
    /**
     * @param enrichmentParameters Parameters to configure enrichment for your pipe. Detailed below.
     * @return builder
     */
    def enrichmentParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeState.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersArgs.builder
      builder.enrichmentParameters(args(argsBuilder).build)

    /**
     * @param logConfiguration Logging configuration settings for the pipe. Detailed below.
     * @return builder
     */
    def logConfiguration(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeState.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.builder
      builder.logConfiguration(args(argsBuilder).build)

    /**
     * @param sourceParameters Parameters to configure a source for the pipe. Detailed below.
     * @return builder
     */
    def sourceParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeState.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.builder
      builder.sourceParameters(args(argsBuilder).build)

    /**
     * @param targetParameters Parameters to configure a target for your pipe. Detailed below.
     * @return builder
     */
    def targetParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeState.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.builder
      builder.targetParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder)
    /**
     * @param capacityProviderStrategies List of capacity provider strategies to use for the task. If a capacityProviderStrategy is specified, the launchType parameter must be omitted. If no capacityProviderStrategy or launchType is specified, the defaultCapacityProviderStrategy for the cluster is used. Detailed below.
     * @return builder
     */
    def capacityProviderStrategies(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs.builder
      builder.capacityProviderStrategies(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Use this structure if the Amazon ECS task uses the awsvpc network mode. This structure specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. This structure is required if LaunchType is FARGATE because the awsvpc mode is required for Fargate tasks. If you specify NetworkConfiguration when the target ECS task does not use the awsvpc network mode, the task fails. Detailed below.
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param overrides The overrides that are associated with a task. Detailed below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param placementConstraints An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). Detailed below.
     * @return builder
     */
    def placementConstraints(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersPlacementConstraintArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersPlacementConstraintArgs.builder
      builder.placementConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param placementStrategies The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task. Detailed below.
     * @return builder
     */
    def placementStrategies(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersPlacementStrategyArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersPlacementStrategyArgs.builder
      builder.placementStrategies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder)
    /**
     * @param batchJobParameters The parameters for using an AWS Batch job as a target. Detailed below.
     * @return builder
     */
    def batchJobParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.builder
      builder.batchJobParameters(args(argsBuilder).build)

    /**
     * @param cloudwatchLogsParameters The parameters for using an CloudWatch Logs log stream as a target. Detailed below.
     * @return builder
     */
    def cloudwatchLogsParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersCloudwatchLogsParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersCloudwatchLogsParametersArgs.builder
      builder.cloudwatchLogsParameters(args(argsBuilder).build)

    /**
     * @param ecsTaskParameters The parameters for using an Amazon ECS task as a target. Detailed below.
     * @return builder
     */
    def ecsTaskParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersArgs.builder
      builder.ecsTaskParameters(args(argsBuilder).build)

    /**
     * @param eventbridgeEventBusParameters The parameters for using an EventBridge event bus as a target. Detailed below.
     * @return builder
     */
    def eventbridgeEventBusParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEventbridgeEventBusParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEventbridgeEventBusParametersArgs.builder
      builder.eventbridgeEventBusParameters(args(argsBuilder).build)

    /**
     * @param httpParameters These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations. Detailed below.
     * @return builder
     */
    def httpParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersHttpParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersHttpParametersArgs.builder
      builder.httpParameters(args(argsBuilder).build)

    /**
     * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source. Detailed below.
     * @return builder
     */
    def kinesisStreamParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersKinesisStreamParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersKinesisStreamParametersArgs.builder
      builder.kinesisStreamParameters(args(argsBuilder).build)

    /**
     * @param lambdaFunctionParameters The parameters for using a Lambda function as a target. Detailed below.
     * @return builder
     */
    def lambdaFunctionParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersLambdaFunctionParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersLambdaFunctionParametersArgs.builder
      builder.lambdaFunctionParameters(args(argsBuilder).build)

    /**
     * @param redshiftDataParameters These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement. Detailed below.
     * @return builder
     */
    def redshiftDataParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersRedshiftDataParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersRedshiftDataParametersArgs.builder
      builder.redshiftDataParameters(args(argsBuilder).build)

    /**
     * @param sagemakerPipelineParameters The parameters for using a SageMaker AI pipeline as a target. Detailed below.
     * @return builder
     */
    def sagemakerPipelineParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersSagemakerPipelineParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersSagemakerPipelineParametersArgs.builder
      builder.sagemakerPipelineParameters(args(argsBuilder).build)

    /**
     * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target. Detailed below.
     * @return builder
     */
    def sqsQueueParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersSqsQueueParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersSqsQueueParametersArgs.builder
      builder.sqsQueueParameters(args(argsBuilder).build)

    /**
     * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state machine as a target. Detailed below.
     * @return builder
     */
    def stepFunctionStateMachineParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersStepFunctionStateMachineParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersStepFunctionStateMachineParametersArgs.builder
      builder.stepFunctionStateMachineParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.Builder)
    /**
     * @param cloudwatchLogsLogDestination Amazon CloudWatch Logs logging configuration settings for the pipe. Detailed below.
     * @return builder
     */
    def cloudwatchLogsLogDestination(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeLogConfigurationCloudwatchLogsLogDestinationArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeLogConfigurationCloudwatchLogsLogDestinationArgs.builder
      builder.cloudwatchLogsLogDestination(args(argsBuilder).build)

    /**
     * @param firehoseLogDestination Amazon Kinesis Data Firehose logging configuration settings for the pipe. Detailed below.
     * @return builder
     */
    def firehoseLogDestination(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeLogConfigurationFirehoseLogDestinationArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeLogConfigurationFirehoseLogDestinationArgs.builder
      builder.firehoseLogDestination(args(argsBuilder).build)

    /**
     * @param s3LogDestination Amazon S3 logging configuration settings for the pipe. Detailed below.
     * @return builder
     */
    def s3LogDestination(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeLogConfigurationS3LogDestinationArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeLogConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeLogConfigurationS3LogDestinationArgs.builder
      builder.s3LogDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersArgs.Builder)
    /**
     * @param credentials The credentials needed to access the resource. Detailed below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

    /**
     * @param vpc This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is to be used. Detailed below.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersVpcArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersNetworkConfigurationArgs.Builder)
    /**
     * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security groups for the task, and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the awsvpc network mode. Detailed below.
     * @return builder
     */
    def awsVpcConfiguration(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfigurationArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfigurationArgs.builder
      builder.awsVpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersActivemqBrokerParametersArgs.Builder)
    /**
     * @param credentials The credentials needed to access the resource. Detailed below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersActivemqBrokerParametersCredentialsArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersActivemqBrokerParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersActivemqBrokerParametersCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersArgs.Builder)
    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway REST endpoint or EventBridge ApiDestination. If you specify an API Gateway REST API or EventBridge ApiDestination as a target, you can use this parameter to specify headers, path parameters, and query string keys/values as part of your target invoking request. If you&#39;re using ApiDestinations, the corresponding Connection can also have these values configured. In case of any conflicting keys, values from the Connection take precedence. Detailed below.
     * @return builder
     */
    def httpParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersHttpParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeEnrichmentParametersHttpParametersArgs.builder
      builder.httpParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersSagemakerPipelineParametersArgs.Builder)
    /**
     * @param pipelineParameters List of Parameter names and values for SageMaker AI Model Building Pipeline execution. Detailed below.
     * @return builder
     */
    def pipelineParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersSagemakerPipelineParametersPipelineParameterArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersSagemakerPipelineParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersSagemakerPipelineParametersPipelineParameterArgs.builder
      builder.pipelineParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder)
    /**
     * @param activemqBrokerParameters The parameters for using an Active MQ broker as a source. Detailed below.
     * @return builder
     */
    def activemqBrokerParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersActivemqBrokerParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersActivemqBrokerParametersArgs.builder
      builder.activemqBrokerParameters(args(argsBuilder).build)

    /**
     * @param dynamodbStreamParameters The parameters for using a DynamoDB stream as a source.  Detailed below.
     * @return builder
     */
    def dynamodbStreamParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersDynamodbStreamParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersDynamodbStreamParametersArgs.builder
      builder.dynamodbStreamParameters(args(argsBuilder).build)

    /**
     * @param filterCriteria The collection of event patterns used to [filter events](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-filtering.html). Detailed below.
     * @return builder
     */
    def filterCriteria(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersFilterCriteriaArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersFilterCriteriaArgs.builder
      builder.filterCriteria(args(argsBuilder).build)

    /**
     * @param kinesisStreamParameters The parameters for using a Kinesis stream as a source. Detailed below.
     * @return builder
     */
    def kinesisStreamParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersKinesisStreamParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersKinesisStreamParametersArgs.builder
      builder.kinesisStreamParameters(args(argsBuilder).build)

    /**
     * @param managedStreamingKafkaParameters The parameters for using an MSK stream as a source. Detailed below.
     * @return builder
     */
    def managedStreamingKafkaParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersManagedStreamingKafkaParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersManagedStreamingKafkaParametersArgs.builder
      builder.managedStreamingKafkaParameters(args(argsBuilder).build)

    /**
     * @param rabbitmqBrokerParameters The parameters for using a Rabbit MQ broker as a source. Detailed below.
     * @return builder
     */
    def rabbitmqBrokerParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersArgs.builder
      builder.rabbitmqBrokerParameters(args(argsBuilder).build)

    /**
     * @param selfManagedKafkaParameters The parameters for using a self-managed Apache Kafka stream as a source. Detailed below.
     * @return builder
     */
    def selfManagedKafkaParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersSelfManagedKafkaParametersArgs.builder
      builder.selfManagedKafkaParameters(args(argsBuilder).build)

    /**
     * @param sqsQueueParameters The parameters for using a Amazon SQS stream as a source. Detailed below.
     * @return builder
     */
    def sqsQueueParameters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersSqsQueueParametersArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersSqsQueueParametersArgs.builder
      builder.sqsQueueParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesArgs.Builder)
    /**
     * @param environments The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name. Detailed below.
     * @return builder
     */
    def environments(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesEnvironmentArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRequirements The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU. Detailed below.
     * @return builder
     */
    def resourceRequirements(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesResourceRequirementArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesResourceRequirementArgs.builder
      builder.resourceRequirements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersDynamodbStreamParametersArgs.Builder)
    /**
     * @param deadLetterConfig Define the target queue to send dead-letter queue events to. Detailed below.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersDynamodbStreamParametersDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersDynamodbStreamParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersDynamodbStreamParametersDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesArgs.Builder)
    /**
     * @param containerOverrides One or more container overrides that are sent to a task. Detailed below.
     * @return builder
     */
    def containerOverrides(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs.builder
      builder.containerOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralStorage The ephemeral storage setting override for the task.  Detailed below.
     * @return builder
     */
    def ephemeralStorage(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param inferenceAcceleratorOverrides List of Elastic Inference accelerator overrides for the task. Detailed below.
     * @return builder
     */
    def inferenceAcceleratorOverrides(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs.builder
      builder.inferenceAcceleratorOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs.Builder)
    /**
     * @param environmentFiles A list of files containing the environment variables to pass to a container, instead of the value from the container definition. Detailed below.
     * @return builder
     */
    def environmentFiles(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideEnvironmentFileArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideEnvironmentFileArgs.builder
      builder.environmentFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param environments The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name. Detailed below.
     * @return builder
     */
    def environments(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideEnvironmentArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRequirements The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU. Detailed below.
     * @return builder
     */
    def resourceRequirements(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideResourceRequirementArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideResourceRequirementArgs.builder
      builder.resourceRequirements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersFilterCriteriaArgs.Builder)
    /**
     * @param filters An array of up to 5 event patterns. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersFilterCriteriaFilterArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersFilterCriteriaFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersArgs.Builder)
    /**
     * @param credentials The credentials needed to access the resource. Detailed below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeSourceParametersKinesisStreamParametersArgs.Builder)
    /**
     * @param deadLetterConfig Define the target queue to send dead-letter queue events to. Detailed below.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeSourceParametersKinesisStreamParametersDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeSourceParametersKinesisStreamParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeSourceParametersKinesisStreamParametersDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.Builder)
    /**
     * @param arrayProperties The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job. Detailed below.
     * @return builder
     */
    def arrayProperties(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArrayPropertiesArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArrayPropertiesArgs.builder
      builder.arrayProperties(args(argsBuilder).build)

    /**
     * @param containerOverrides The overrides that are sent to a container. Detailed below.
     * @return builder
     */
    def containerOverrides(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersContainerOverridesArgs.builder
      builder.containerOverrides(args(argsBuilder).build)

    /**
     * @param dependsOns A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a SEQUENTIAL type dependency without specifying a job ID for array jobs so that each child array job completes sequentially, starting at index 0. You can also specify an N_TO_N type dependency with a job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of each dependency to complete before it can begin. Detailed below.
     * @return builder
     */
    def dependsOns(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersDependsOnArgs.Builder]*):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.Builder =
      def argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersDependsOnArgs.builder
      builder.dependsOns(args.map(_(argsBuilder).build)*)

    /**
     * @param retryStrategy The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry strategy defined in the job definition. Detailed below.
     * @return builder
     */
    def retryStrategy(args: Endofunction[com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersRetryStrategyArgs.Builder]):
        com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.pipes.inputs.PipeTargetParametersBatchJobParametersRetryStrategyArgs.builder
      builder.retryStrategy(args(argsBuilder).build)
