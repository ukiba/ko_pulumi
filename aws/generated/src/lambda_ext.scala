package jp.ukiba.ko_pulumi
package aws

object lambda_ext:
  extension (builder: com.pulumi.aws.lambda.AliasArgs.Builder)
    /**
     * @param routingConfig Lambda alias&#39; route configuration settings. See below.
     * @return builder
     */
    inline def routingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.Builder]):
        com.pulumi.aws.lambda.AliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.CapacityProviderArgs.Builder)
    /**
     * @param capacityProviderScalingConfigs Configuration block for scaling policy settings. See Capacity Provider Scaling Config below.
     * @return builder
     */
    inline def capacityProviderScalingConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigArgs.Builder]*):
        com.pulumi.aws.lambda.CapacityProviderArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigArgs.builder
      builder.capacityProviderScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceRequirements Configuration block for instance requirements settings. See Instance Requirements below.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderInstanceRequirementArgs.Builder]*):
        com.pulumi.aws.lambda.CapacityProviderArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderInstanceRequirementArgs.builder
      builder.instanceRequirements(args.map(_(argsBuilder).build)*)

    /**
     * @param permissionsConfig Configuration block for permissions settings. See Permissions Config below.
     * @return builder
     */
    inline def permissionsConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderPermissionsConfigArgs.Builder]):
        com.pulumi.aws.lambda.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderPermissionsConfigArgs.builder
      builder.permissionsConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for VPC settings. See VPC Config below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderVpcConfigArgs.Builder]):
        com.pulumi.aws.lambda.CapacityProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder)
    /**
     * @param allowedPublishers Configuration block of allowed publishers as signing profiles for this code signing configuration. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def allowedPublishers(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.Builder]):
        com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.builder
      builder.allowedPublishers(args(argsBuilder).build)

    /**
     * @param policies Configuration block of code signing policies that define the actions to take if the validation checks fail. See below.
     * @return builder
     */
    inline def policies(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.Builder]):
        com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.builder
      builder.policies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.CoreNetworkConnectorArgs.Builder)
    /**
     * @param configuration Network configuration of the connector. See `configuration` Block below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationArgs.Builder]):
        com.pulumi.aws.lambda.CoreNetworkConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.CoreNetworkConnectorTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.CoreNetworkConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CoreNetworkConnectorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.EventSourceMappingArgs.Builder)
    /**
     * @param amazonManagedKafkaEventSourceConfig Additional configuration block for Amazon Managed Kafka sources. Incompatible with `selfManagedEventSource` and `selfManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    inline def amazonManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.builder
      builder.amazonManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param destinationConfig Amazon SQS queue, Amazon SNS topic or Amazon S3 bucket (only available for Kafka sources) destination for failed records. Only available for stream sources (DynamoDB and Kinesis) and Kafka sources (Amazon MSK and Self-managed Apache Kafka). See below.
     * @return builder
     */
    inline def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

    /**
     * @param documentDbEventSourceConfig Configuration settings for a DocumentDB event source. See below.
     * @return builder
     */
    inline def documentDbEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.builder
      builder.documentDbEventSourceConfig(args(argsBuilder).build)

    /**
     * @param filterCriteria Criteria to use for [event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) Kinesis stream, DynamoDB stream, SQS queue event sources. See below.
     * @return builder
     */
    inline def filterCriteria(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.builder
      builder.filterCriteria(args(argsBuilder).build)

    /**
     * @param metricsConfig CloudWatch metrics configuration of the event source. Only available for stream sources (DynamoDB and Kinesis) and SQS queues. See below.
     * @return builder
     */
    inline def metricsConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.builder
      builder.metricsConfig(args(argsBuilder).build)

    /**
     * @param provisionedPollerConfig Event poller configuration for the event source. Only valid for Amazon MSK or self-managed Apache Kafka sources. See below.
     * @return builder
     */
    inline def provisionedPollerConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.builder
      builder.provisionedPollerConfig(args(argsBuilder).build)

    /**
     * @param scalingConfig Scaling configuration of the event source. Only available for SQS queues. See below.
     * @return builder
     */
    inline def scalingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param selfManagedEventSource For Self Managed Kafka sources, the location of the self managed cluster. If set, configuration must also include `sourceAccessConfiguration`. See below.
     * @return builder
     */
    inline def selfManagedEventSource(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.builder
      builder.selfManagedEventSource(args(argsBuilder).build)

    /**
     * @param selfManagedKafkaEventSourceConfig Additional configuration block for Self Managed Kafka sources. Incompatible with `eventSourceArn` and `amazonManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    inline def selfManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.builder
      builder.selfManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param sourceAccessConfigurations For Self Managed Kafka sources, the access configuration for the source. If set, configuration must also include `selfManagedEventSource`. See below.
     * @return builder
     */
    inline def sourceAccessConfigurations(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.Builder]*):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.builder
      builder.sourceAccessConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.FunctionArgs.Builder)
    /**
     * @param capacityProviderConfig Configuration block for Lambda Capacity Provider. See below.
     * @return builder
     */
    inline def capacityProviderConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigArgs.builder
      builder.capacityProviderConfig(args(argsBuilder).build)

    /**
     * @param deadLetterConfig Configuration block for dead letter queue. See below.
     * @return builder
     */
    inline def deadLetterConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param durableConfig Configuration block for durable function settings. See below. `durableConfig` may only be available in [limited regions](https://builder.aws.com/build/capabilities), including `us-east-2`.
     * @return builder
     */
    inline def durableConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionDurableConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionDurableConfigArgs.builder
      builder.durableConfig(args(argsBuilder).build)

    /**
     * @param environment Configuration block for environment variables. See below.
     * @return builder
     */
    inline def environment(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param ephemeralStorage Amount of ephemeral storage (`/tmp`) to allocate for the Lambda Function. See below.
     * @return builder
     */
    inline def ephemeralStorage(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param fileSystemConfig Configuration block for EFS or S3 Files file system. See below.
     * @return builder
     */
    inline def fileSystemConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

    /**
     * @param imageConfig Container image configuration values. See below.
     * @return builder
     */
    inline def imageConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param loggingConfig Configuration block for advanced logging settings. See below.
     * @return builder
     */
    inline def loggingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param snapStart Configuration block for snap start settings. See below.
     * @return builder
     */
    inline def snapStart(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.builder
      builder.snapStart(args(argsBuilder).build)

    /**
     * @param tenancyConfig Configuration block for Tenancy. See below.
     * @return builder
     */
    inline def tenancyConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionTenancyConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionTenancyConfigArgs.builder
      builder.tenancyConfig(args(argsBuilder).build)

    /**
     * @param tracingConfig Configuration block for X-Ray tracing. See below.
     * @return builder
     */
    inline def tracingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.builder
      builder.tracingConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for VPC. See below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.Builder)
    /**
     * @param destinationConfig Configuration block with destination configuration. See below.
     * @return builder
     */
    inline def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.FunctionScalingConfigArgs.Builder)
    /**
     * @param functionScalingConfig Scaling configuration block. See `functionScalingConfig` Block below.
     * @return builder
     */
    inline def functionScalingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionScalingConfigFunctionScalingConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionScalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionScalingConfigFunctionScalingConfigArgs.builder
      builder.functionScalingConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionScalingConfigTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.FunctionScalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionScalingConfigTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.FunctionUrlArgs.Builder)
    /**
     * @param cors Cross-origin resource sharing (CORS) settings for the function URL. See below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.Builder]):
        com.pulumi.aws.lambda.FunctionUrlArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.builder
      builder.cors(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.MicrovmsImageArgs.Builder)
    /**
     * @param codeArtifact Code artifact containing the application code and metadata for the image. See below.
     * @return builder
     */
    inline def codeArtifact(args: Endofunction[com.pulumi.aws.lambda.inputs.MicrovmsImageCodeArtifactArgs.Builder]):
        com.pulumi.aws.lambda.MicrovmsImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.MicrovmsImageCodeArtifactArgs.builder
      builder.codeArtifact(args(argsBuilder).build)

    /**
     * @param cpuConfigurations CPU configuration for the MicroVM. See `cpuConfiguration` Block below.
     * @return builder
     */
    inline def cpuConfigurations(args: Endofunction[com.pulumi.aws.lambda.inputs.MicrovmsImageCpuConfigurationArgs.Builder]*):
        com.pulumi.aws.lambda.MicrovmsImageArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.MicrovmsImageCpuConfigurationArgs.builder
      builder.cpuConfigurations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.MicrovmsImageTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.MicrovmsImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.MicrovmsImageTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.AliasState.Builder)
    /**
     * @param routingConfig Lambda alias&#39; route configuration settings. See below.
     * @return builder
     */
    inline def routingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.AliasState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigArgs.Builder)
    /**
     * @param scalingPolicies List of scaling policies. Only required if `scalingMode` is set to `&#34;Manual&#34;`. See Scaling Policies below.
     * @return builder
     */
    inline def scalingPolicies(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigScalingPolicyArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigScalingPolicyArgs.builder
      builder.scalingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.CapacityProviderState.Builder)
    /**
     * @param capacityProviderScalingConfigs Configuration block for scaling policy settings. See Capacity Provider Scaling Config below.
     * @return builder
     */
    inline def capacityProviderScalingConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.CapacityProviderState.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderCapacityProviderScalingConfigArgs.builder
      builder.capacityProviderScalingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceRequirements Configuration block for instance requirements settings. See Instance Requirements below.
     * @return builder
     */
    inline def instanceRequirements(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderInstanceRequirementArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.CapacityProviderState.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderInstanceRequirementArgs.builder
      builder.instanceRequirements(args.map(_(argsBuilder).build)*)

    /**
     * @param permissionsConfig Configuration block for permissions settings. See Permissions Config below.
     * @return builder
     */
    inline def permissionsConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderPermissionsConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderPermissionsConfigArgs.builder
      builder.permissionsConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for VPC settings. See VPC Config below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.CapacityProviderVpcConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CapacityProviderState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CapacityProviderVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.CodeSigningConfigState.Builder)
    /**
     * @param allowedPublishers Configuration block of allowed publishers as signing profiles for this code signing configuration. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def allowedPublishers(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CodeSigningConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.builder
      builder.allowedPublishers(args(argsBuilder).build)

    /**
     * @param policies Configuration block of code signing policies that define the actions to take if the validation checks fail. See below.
     * @return builder
     */
    inline def policies(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CodeSigningConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.builder
      builder.policies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationArgs.Builder)
    /**
     * @param vpcEgressConfiguration Configuration for routing egress traffic through a VPC. See `vpcEgressConfiguration` Block below.
     * @return builder
     */
    inline def vpcEgressConfiguration(args: Endofunction[com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationVpcEgressConfigurationArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationVpcEgressConfigurationArgs.builder
      builder.vpcEgressConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.CoreNetworkConnectorState.Builder)
    /**
     * @param configuration Network configuration of the connector. See `configuration` Block below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CoreNetworkConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CoreNetworkConnectorConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.CoreNetworkConnectorTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CoreNetworkConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CoreNetworkConnectorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder)
    /**
     * @param schemaRegistryConfig Block for a Kafka schema registry setting. See below.
     * @return builder
     */
    inline def schemaRegistryConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.builder
      builder.schemaRegistryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder)
    /**
     * @param accessConfigs Configuration block for authentication Lambda uses to access the schema registry. See below.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaValidationConfigs Repeatable block that defines schema validation settings. These specify the message attributes that Lambda should validate and filter using the schema registry. See below.
     * @return builder
     */
    inline def schemaValidationConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.builder
      builder.schemaValidationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder)
    /**
     * @param onFailure Destination configuration for failed invocations. See below.
     * @return builder
     */
    inline def onFailure(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigOnFailureArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigOnFailureArgs.builder
      builder.onFailure(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder)
    /**
     * @param filters Set of up to 5 filter. If an event satisfies at least one, Lambda sends the event to the function or adds it to the next batch. See below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaFilterArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder)
    /**
     * @param schemaRegistryConfig Block for a Kafka schema registry setting. See below.
     * @return builder
     */
    inline def schemaRegistryConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.builder
      builder.schemaRegistryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder)
    /**
     * @param accessConfigs Configuration block for authentication Lambda uses to access the schema registry. See below.
     * @return builder
     */
    inline def accessConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaValidationConfigs Repeatable block that defines schema validation settings. These specify the message attributes that Lambda should validate and filter using the schema registry. See below.
     * @return builder
     */
    inline def schemaValidationConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.builder
      builder.schemaValidationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder)
    /**
     * @param amazonManagedKafkaEventSourceConfig Additional configuration block for Amazon Managed Kafka sources. Incompatible with `selfManagedEventSource` and `selfManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    inline def amazonManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.builder
      builder.amazonManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param destinationConfig Amazon SQS queue, Amazon SNS topic or Amazon S3 bucket (only available for Kafka sources) destination for failed records. Only available for stream sources (DynamoDB and Kinesis) and Kafka sources (Amazon MSK and Self-managed Apache Kafka). See below.
     * @return builder
     */
    inline def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

    /**
     * @param documentDbEventSourceConfig Configuration settings for a DocumentDB event source. See below.
     * @return builder
     */
    inline def documentDbEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.builder
      builder.documentDbEventSourceConfig(args(argsBuilder).build)

    /**
     * @param filterCriteria Criteria to use for [event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) Kinesis stream, DynamoDB stream, SQS queue event sources. See below.
     * @return builder
     */
    inline def filterCriteria(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.builder
      builder.filterCriteria(args(argsBuilder).build)

    /**
     * @param metricsConfig CloudWatch metrics configuration of the event source. Only available for stream sources (DynamoDB and Kinesis) and SQS queues. See below.
     * @return builder
     */
    inline def metricsConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.builder
      builder.metricsConfig(args(argsBuilder).build)

    /**
     * @param provisionedPollerConfig Event poller configuration for the event source. Only valid for Amazon MSK or self-managed Apache Kafka sources. See below.
     * @return builder
     */
    inline def provisionedPollerConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.builder
      builder.provisionedPollerConfig(args(argsBuilder).build)

    /**
     * @param scalingConfig Scaling configuration of the event source. Only available for SQS queues. See below.
     * @return builder
     */
    inline def scalingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param selfManagedEventSource For Self Managed Kafka sources, the location of the self managed cluster. If set, configuration must also include `sourceAccessConfiguration`. See below.
     * @return builder
     */
    inline def selfManagedEventSource(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.builder
      builder.selfManagedEventSource(args(argsBuilder).build)

    /**
     * @param selfManagedKafkaEventSourceConfig Additional configuration block for Self Managed Kafka sources. Incompatible with `eventSourceArn` and `amazonManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    inline def selfManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.builder
      builder.selfManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param sourceAccessConfigurations For Self Managed Kafka sources, the access configuration for the source. If set, configuration must also include `selfManagedEventSource`. See below.
     * @return builder
     */
    inline def sourceAccessConfigurations(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.builder
      builder.sourceAccessConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigArgs.Builder)
    /**
     * @param lambdaManagedInstancesCapacityProviderConfig Configuration block for Lambda Managed Instances Capacity Provider. See below.
     * @return builder
     */
    inline def lambdaManagedInstancesCapacityProviderConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigLambdaManagedInstancesCapacityProviderConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigLambdaManagedInstancesCapacityProviderConfigArgs.builder
      builder.lambdaManagedInstancesCapacityProviderConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder)
    /**
     * @param onFailure Configuration block with destination configuration for failed asynchronous invocations. See below.
     * @return builder
     */
    inline def onFailure(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnFailureArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnFailureArgs.builder
      builder.onFailure(args(argsBuilder).build)

    /**
     * @param onSuccess Configuration block with destination configuration for successful asynchronous invocations. See below.
     * @return builder
     */
    inline def onSuccess(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs.builder
      builder.onSuccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigState.Builder)
    /**
     * @param destinationConfig Configuration block with destination configuration. See below.
     * @return builder
     */
    inline def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionScalingConfigState.Builder)
    /**
     * @param functionScalingConfig Scaling configuration block. See `functionScalingConfig` Block below.
     * @return builder
     */
    inline def functionScalingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionScalingConfigFunctionScalingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionScalingConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionScalingConfigFunctionScalingConfigArgs.builder
      builder.functionScalingConfig(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionScalingConfigTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionScalingConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionScalingConfigTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionState.Builder)
    /**
     * @param capacityProviderConfig Configuration block for Lambda Capacity Provider. See below.
     * @return builder
     */
    inline def capacityProviderConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionCapacityProviderConfigArgs.builder
      builder.capacityProviderConfig(args(argsBuilder).build)

    /**
     * @param deadLetterConfig Configuration block for dead letter queue. See below.
     * @return builder
     */
    inline def deadLetterConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param durableConfig Configuration block for durable function settings. See below. `durableConfig` may only be available in [limited regions](https://builder.aws.com/build/capabilities), including `us-east-2`.
     * @return builder
     */
    inline def durableConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionDurableConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionDurableConfigArgs.builder
      builder.durableConfig(args(argsBuilder).build)

    /**
     * @param environment Configuration block for environment variables. See below.
     * @return builder
     */
    inline def environment(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param ephemeralStorage Amount of ephemeral storage (`/tmp`) to allocate for the Lambda Function. See below.
     * @return builder
     */
    inline def ephemeralStorage(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param fileSystemConfig Configuration block for EFS or S3 Files file system. See below.
     * @return builder
     */
    inline def fileSystemConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

    /**
     * @param imageConfig Container image configuration values. See below.
     * @return builder
     */
    inline def imageConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param loggingConfig Configuration block for advanced logging settings. See below.
     * @return builder
     */
    inline def loggingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param snapStart Configuration block for snap start settings. See below.
     * @return builder
     */
    inline def snapStart(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.builder
      builder.snapStart(args(argsBuilder).build)

    /**
     * @param tenancyConfig Configuration block for Tenancy. See below.
     * @return builder
     */
    inline def tenancyConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionTenancyConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionTenancyConfigArgs.builder
      builder.tenancyConfig(args(argsBuilder).build)

    /**
     * @param tracingConfig Configuration block for X-Ray tracing. See below.
     * @return builder
     */
    inline def tracingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.builder
      builder.tracingConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for VPC. See below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionUrlState.Builder)
    /**
     * @param cors Cross-origin resource sharing (CORS) settings for the function URL. See below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionUrlState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.builder
      builder.cors(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.MicrovmsImageState.Builder)
    /**
     * @param codeArtifact Code artifact containing the application code and metadata for the image. See below.
     * @return builder
     */
    inline def codeArtifact(args: Endofunction[com.pulumi.aws.lambda.inputs.MicrovmsImageCodeArtifactArgs.Builder]):
        com.pulumi.aws.lambda.inputs.MicrovmsImageState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.MicrovmsImageCodeArtifactArgs.builder
      builder.codeArtifact(args(argsBuilder).build)

    /**
     * @param cpuConfigurations CPU configuration for the MicroVM. See `cpuConfiguration` Block below.
     * @return builder
     */
    inline def cpuConfigurations(args: Endofunction[com.pulumi.aws.lambda.inputs.MicrovmsImageCpuConfigurationArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.MicrovmsImageState.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.MicrovmsImageCpuConfigurationArgs.builder
      builder.cpuConfigurations(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.lambda.inputs.MicrovmsImageTimeoutsArgs.Builder]):
        com.pulumi.aws.lambda.inputs.MicrovmsImageState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.MicrovmsImageTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
