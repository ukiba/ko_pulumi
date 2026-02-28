package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object lambda:
  /**
   * Manages an AWS Lambda Code Signing Config. Use this resource to define allowed signing profiles and code-signing validation policies for Lambda functions to ensure code integrity and authenticity.
   *  
   *  For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html).
   */
  def CodeSigningConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.CodeSigningConfigArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lambda.CodeSigningConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Lambda Function invocation. Use this resource to invoke a Lambda function with the [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
   *  
   *  &gt; **Note:** By default this resource _only_ invokes the function when the arguments call for a create or replace. After an initial invocation on _apply_, if the arguments do not change, a subsequent _apply_ does not invoke the function again. To dynamically invoke the function, see the `triggers` example below. To always invoke a function on each _apply_, see the `aws.lambda.Invocation` data source. To invoke the Lambda function when the Pulumi resource is updated and deleted, see the CRUD Lifecycle Management example below.
   *  
   *  &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking a Lambda function with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
   */
  def Invocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.InvocationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.InvocationArgs.builder
    
    com.pulumi.aws.lambda.Invocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type LambdaFunctions = com.pulumi.aws.lambda.LambdaFunctions
  object LambdaFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.lambda.LambdaFunctions.*
  extension (self: LambdaFunctions.type)
    /** Provides details about an AWS Lambda Alias. Use this data source to retrieve information about an existing Lambda function alias for traffic management, deployment strategies, or API integrations. */
    def getAlias(args: Endofunction[com.pulumi.aws.lambda.inputs.GetAliasArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetAliasArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getAlias(args(argsBuilder).build)

    /** Provides details about an AWS Lambda Alias. Use this data source to retrieve information about an existing Lambda function alias for traffic management, deployment strategies, or API integrations. */
    def getAliasPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetAliasPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetAliasPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getAliasPlain(args(argsBuilder).build)

    /**
     * Provides details about an AWS Lambda Code Signing Config. Use this data source to retrieve information about an existing code signing configuration for Lambda functions to ensure code integrity and authenticity.
     *  
     *  For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html).
     */
    def getCodeSigningConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetCodeSigningConfigResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getCodeSigningConfig(args(argsBuilder).build)

    /**
     * Provides details about an AWS Lambda Code Signing Config. Use this data source to retrieve information about an existing code signing configuration for Lambda functions to ensure code integrity and authenticity.
     *  
     *  For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html).
     */
    def getCodeSigningConfigPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetCodeSigningConfigPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetCodeSigningConfigResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetCodeSigningConfigPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getCodeSigningConfigPlain(args(argsBuilder).build)

    /**
     * Provides details about an AWS Lambda Function. Use this data source to obtain information about an existing Lambda function for use in other resources or as a reference for function configurations.
     *  
     *  &gt; **Note:** This data source returns information about the latest version or alias specified by the `qualifier`. If no `qualifier` is provided, it returns information about the most recent published version, or `$LATEST` if no published version exists.
     */
    def getFunction(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunction(args(argsBuilder).build)

    /**
     * Provides details about an AWS Lambda Function. Use this data source to obtain information about an existing Lambda function for use in other resources or as a reference for function configurations.
     *  
     *  &gt; **Note:** This data source returns information about the latest version or alias specified by the `qualifier`. If no `qualifier` is provided, it returns information about the most recent published version, or `$LATEST` if no published version exists.
     */
    def getFunctionPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionPlain(args(argsBuilder).build)

    /** Provides details about an AWS Lambda Function URL. Use this data source to retrieve information about an existing function URL configuration. */
    def getFunctionUrl(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetFunctionUrlResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionUrl(args(argsBuilder).build)

    /** Provides details about an AWS Lambda Function URL. Use this data source to retrieve information about an existing function URL configuration. */
    def getFunctionUrlPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionUrlPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetFunctionUrlResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionUrlPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionUrlPlain(args(argsBuilder).build)

    /** Provides a list of AWS Lambda Functions in the current region. Use this data source to discover existing Lambda functions for inventory, monitoring, or bulk operations. */
    def getFunctions(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetFunctionsResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionsArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctions(args(argsBuilder).build)

    /** Provides a list of AWS Lambda Functions in the current region. Use this data source to discover existing Lambda functions for inventory, monitoring, or bulk operations. */
    def getFunctionsPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetFunctionsResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionsPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionsPlain(args(argsBuilder).build)

    /**
     * Invokes an AWS Lambda Function and returns its results. Use this data source to execute Lambda functions during Pulumi operations and use their results in other resources or outputs.
     *  
     *  The Lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
     *  
     *  &gt; **Note:** The `aws.lambda.Invocation` data source invokes the function during the first `apply` and every subsequent `plan` when the function is known.
     *  
     *  &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking a Lambda function with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
     */
    def getInvocation(args: Endofunction[com.pulumi.aws.lambda.inputs.GetInvocationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetInvocationResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetInvocationArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getInvocation(args(argsBuilder).build)

    /**
     * Invokes an AWS Lambda Function and returns its results. Use this data source to execute Lambda functions during Pulumi operations and use their results in other resources or outputs.
     *  
     *  The Lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
     *  
     *  &gt; **Note:** The `aws.lambda.Invocation` data source invokes the function during the first `apply` and every subsequent `plan` when the function is known.
     *  
     *  &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking a Lambda function with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
     */
    def getInvocationPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetInvocationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetInvocationResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetInvocationPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getInvocationPlain(args(argsBuilder).build)

    /** Provides details about an AWS Lambda Layer Version. Use this data source to retrieve information about a specific layer version or find the latest version compatible with your runtime and architecture requirements. */
    def getLayerVersion(args: Endofunction[com.pulumi.aws.lambda.inputs.GetLayerVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetLayerVersionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetLayerVersionArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getLayerVersion(args(argsBuilder).build)

    /** Provides details about an AWS Lambda Layer Version. Use this data source to retrieve information about a specific layer version or find the latest version compatible with your runtime and architecture requirements. */
    def getLayerVersionPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetLayerVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetLayerVersionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetLayerVersionPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getLayerVersionPlain(args(argsBuilder).build)

  /**
   * Manages an AWS Lambda Alias. Use this resource to create an alias that points to a specific Lambda function version for traffic management and deployment strategies.
   *  
   *  For information about Lambda and how to use it, see [What is AWS Lambda?](http://docs.aws.amazon.com/lambda/latest/dg/welcome.html). For information about function aliases, see [CreateAlias](http://docs.aws.amazon.com/lambda/latest/dg/API_CreateAlias.html) and [AliasRoutingConfiguration](https://docs.aws.amazon.com/lambda/latest/dg/API_AliasRoutingConfiguration.html) in the API docs.
   */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.AliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.AliasArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lambda.Alias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Lambda Layer Version. Use this resource to share code and dependencies across multiple Lambda functions.
   *  
   *  For information about Lambda Layers and how to use them, see [AWS Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html).
   *  
   *  &gt; **Note:** Setting `skipDestroy` to `true` means that the AWS Provider will not destroy any layer version, even when running `pulumi destroy`. Layer versions are thus intentional dangling resources that are not managed by Pulumi and may incur extra expense in your AWS account.
   */
  def LayerVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.LayerVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.LayerVersionArgs.builder
    
    com.pulumi.aws.lambda.LayerVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lambda.FunctionUrlArgs.Builder)
    /**
     * @param cors Cross-origin resource sharing (CORS) settings for the function URL. See below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.Builder]):
        com.pulumi.aws.lambda.FunctionUrlArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.builder
      builder.cors(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder)
    /**
     * @param allowedPublishers Configuration block of allowed publishers as signing profiles for this code signing configuration. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def allowedPublishers(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.Builder]):
        com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.builder
      builder.allowedPublishers(args(argsBuilder).build)

    /**
     * @param policies Configuration block of code signing policies that define the actions to take if the validation checks fail. See below.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.Builder]):
        com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.builder
      builder.policies(args(argsBuilder).build)

  /**
   * Manages an AWS Lambda Layer Version Permission. Use this resource to share Lambda Layers with other AWS accounts, organizations, or make them publicly accessible.
   *  
   *  For information about Lambda Layer Permissions and how to use them, see [Using Resource-based Policies for AWS Lambda](https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html#permissions-resource-xaccountlayer).
   *  
   *  &gt; **Note:** Setting `skipDestroy` to `true` means that the AWS Provider will not destroy any layer version permission, even when running `pulumi destroy`. Layer version permissions are thus intentional dangling resources that are not managed by Pulumi and may incur extra expense in your AWS account.
   */
  def LayerVersionPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.LayerVersionPermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.LayerVersionPermissionArgs.builder
    
    com.pulumi.aws.lambda.LayerVersionPermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.Builder)
    /**
     * @param destinationConfig Configuration block with destination configuration. See below.
     * @return builder
     */
    def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

  /**
   * Manages an AWS Lambda Provisioned Concurrency Configuration. Use this resource to configure provisioned concurrency for Lambda functions.
   *  
   *  &gt; **Note:** Setting `skipDestroy` to `true` means that the AWS Provider will not destroy a provisioned concurrency configuration, even when running `pulumi destroy`. The configuration is thus an intentional dangling resource that is not managed by Pulumi and may incur extra expense in your AWS account.
   */
  def ProvisionedConcurrencyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs.builder
    
    com.pulumi.aws.lambda.ProvisionedConcurrencyConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Lambda Runtime Management Config. Use this resource to control how Lambda updates the runtime for your function.
   *  
   *  Refer to the [AWS Lambda documentation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) for supported runtimes.
   *  
   *  &gt; **Note:** Deletion of this resource returns the runtime update mode to `Auto` (the default behavior). To leave the configured runtime management options in-place, use a `removed` block with the destroy lifecycle set to `false`.
   */
  def RuntimeManagementConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.RuntimeManagementConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.RuntimeManagementConfigArgs.builder
    
    com.pulumi.aws.lambda.RuntimeManagementConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lambda.FunctionArgs.Builder)
    /**
     * @param deadLetterConfig Configuration block for dead letter queue. See below.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param environment Configuration block for environment variables. See below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param ephemeralStorage Amount of ephemeral storage (`/tmp`) to allocate for the Lambda Function. See below.
     * @return builder
     */
    def ephemeralStorage(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param fileSystemConfig Configuration block for EFS file system. See below.
     * @return builder
     */
    def fileSystemConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

    /**
     * @param imageConfig Container image configuration values. See below.
     * @return builder
     */
    def imageConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param loggingConfig Configuration block for advanced logging settings. See below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param snapStart Configuration block for snap start settings. See below.
     * @return builder
     */
    def snapStart(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.builder
      builder.snapStart(args(argsBuilder).build)

    /**
     * @param tracingConfig Configuration block for X-Ray tracing. See below.
     * @return builder
     */
    def tracingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.builder
      builder.tracingConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for VPC. See below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.Builder]):
        com.pulumi.aws.lambda.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  /** Manages an AWS Lambda permission. Use this resource to grant external sources (e.g., EventBridge Rules, SNS, or S3) permission to invoke Lambda functions. */
  def Permission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.PermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.PermissionArgs.builder
    
    com.pulumi.aws.lambda.Permission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Lambda Event Source Mapping. Use this resource to connect Lambda functions to event sources like Kinesis, DynamoDB, SQS, Amazon MQ, and Managed Streaming for Apache Kafka (MSK).
   *  
   *  For information about Lambda and how to use it, see [What is AWS Lambda?](http://docs.aws.amazon.com/lambda/latest/dg/welcome.html). For information about event source mappings, see [CreateEventSourceMapping](http://docs.aws.amazon.com/lambda/latest/dg/API_CreateEventSourceMapping.html) in the API docs.
   */
  def EventSourceMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.EventSourceMappingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.EventSourceMappingArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lambda.EventSourceMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lambda.AliasArgs.Builder)
    /**
     * @param routingConfig Lambda alias&#39; route configuration settings. See below.
     * @return builder
     */
    def routingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.Builder]):
        com.pulumi.aws.lambda.AliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  /**
   * Manages an AWS Lambda Function Event Invoke Config. Use this resource to configure error handling and destinations for asynchronous Lambda function invocations.
   *  
   *  More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).
   */
  def FunctionEventInvokeConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.builder
    
    com.pulumi.aws.lambda.FunctionEventInvokeConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Lambda function URL. Creates a dedicated HTTP(S) endpoint for a Lambda function to enable direct invocation via HTTP requests. */
  def FunctionUrl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionUrlArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionUrlArgs.builder
    
    com.pulumi.aws.lambda.FunctionUrl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS Lambda Function. Use this resource to create serverless functions that run code in response to events without provisioning or managing servers.
   *  
   *  For information about Lambda and how to use it, see [What is AWS Lambda?](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html). For a detailed example of setting up Lambda and API Gateway, see Serverless Applications with AWS Lambda and API Gateway.
   *  
   *  &gt; **Note:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), EC2 subnets and security groups associated with Lambda Functions can take up to 45 minutes to successfully delete. Pulumi AWS Provider version 2.31.0 and later automatically handles this increased timeout, however prior versions require setting the customizable deletion timeouts of those Pulumi resources to 45 minutes (`delete = &#34;45m&#34;`). AWS and HashiCorp are working together to reduce the amount of time required for resource deletion and updates can be tracked in this GitHub issue.
   *  
   *  &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking an `aws.lambda.Function` with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
   *  
   *  &gt; **Tip:** To give an external source (like an EventBridge Rule, SNS, or S3) permission to access the Lambda function, use the `aws.lambda.Permission` resource. See [Lambda Permission Model](https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html) for more details. On the other hand, the `role` argument of this resource is the function&#39;s execution role for identity and access to AWS services and resources.
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.FunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lambda.Function(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionUrlState.Builder)
    /**
     * @param cors Cross-origin resource sharing (CORS) settings for the function URL. See below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionUrlState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs.builder
      builder.cors(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder)
    /**
     * @param schemaRegistryConfig Block for a Kafka schema registry setting. See below.
     * @return builder
     */
    def schemaRegistryConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.builder
      builder.schemaRegistryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.AliasState.Builder)
    /**
     * @param routingConfig Lambda alias&#39; route configuration settings. See below.
     * @return builder
     */
    def routingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.AliasState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.AliasRoutingConfigArgs.builder
      builder.routingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder)
    /**
     * @param accessConfigs Configuration block for authentication Lambda uses to access the schema registry.
     * @return builder
     */
    def accessConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaValidationConfigs Repeatable block that defines schema validation settings. These specify the message attributes that Lambda should validate and filter using the schema registry.
     * @return builder
     */
    def schemaValidationConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.builder
      builder.schemaValidationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder)
    /**
     * @param amazonManagedKafkaEventSourceConfig Additional configuration block for Amazon Managed Kafka sources. Incompatible with `selfManagedEventSource` and `selfManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    def amazonManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.builder
      builder.amazonManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param destinationConfig Amazon SQS queue, Amazon SNS topic or Amazon S3 bucket (only available for Kafka sources) destination for failed records. Only available for stream sources (DynamoDB and Kinesis) and Kafka sources (Amazon MSK and Self-managed Apache Kafka). See below.
     * @return builder
     */
    def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

    /**
     * @param documentDbEventSourceConfig Configuration settings for a DocumentDB event source. See below.
     * @return builder
     */
    def documentDbEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.builder
      builder.documentDbEventSourceConfig(args(argsBuilder).build)

    /**
     * @param filterCriteria Criteria to use for [event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) Kinesis stream, DynamoDB stream, SQS queue event sources. See below.
     * @return builder
     */
    def filterCriteria(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.builder
      builder.filterCriteria(args(argsBuilder).build)

    /**
     * @param metricsConfig CloudWatch metrics configuration of the event source. Only available for stream sources (DynamoDB and Kinesis) and SQS queues. See below.
     * @return builder
     */
    def metricsConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.builder
      builder.metricsConfig(args(argsBuilder).build)

    /**
     * @param provisionedPollerConfig Event poller configuration for the event source. Only valid for Amazon MSK or self-managed Apache Kafka sources. See below.
     * @return builder
     */
    def provisionedPollerConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.builder
      builder.provisionedPollerConfig(args(argsBuilder).build)

    /**
     * @param scalingConfig Scaling configuration of the event source. Only available for SQS queues. See below.
     * @return builder
     */
    def scalingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param selfManagedEventSource For Self Managed Kafka sources, the location of the self managed cluster. If set, configuration must also include `sourceAccessConfiguration`. See below.
     * @return builder
     */
    def selfManagedEventSource(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.builder
      builder.selfManagedEventSource(args(argsBuilder).build)

    /**
     * @param selfManagedKafkaEventSourceConfig Additional configuration block for Self Managed Kafka sources. Incompatible with `eventSourceArn` and `amazonManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    def selfManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.builder
      builder.selfManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param sourceAccessConfigurations For Self Managed Kafka sources, the access configuration for the source. If set, configuration must also include `selfManagedEventSource`. See below.
     * @return builder
     */
    def sourceAccessConfigurations(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingState.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.builder
      builder.sourceAccessConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigState.Builder)
    /**
     * @param destinationConfig Configuration block with destination configuration. See below.
     * @return builder
     */
    def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder)
    /**
     * @param accessConfigs Configuration block for authentication Lambda uses to access the schema registry.
     * @return builder
     */
    def accessConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaValidationConfigs Repeatable block that defines schema validation settings. These specify the message attributes that Lambda should validate and filter using the schema registry.
     * @return builder
     */
    def schemaValidationConfigs(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigSchemaRegistryConfigSchemaValidationConfigArgs.builder
      builder.schemaValidationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder)
    /**
     * @param filters Set of up to 5 filter. If an event satisfies at least one, Lambda sends the event to the function or adds it to the next batch. See below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaFilterArgs.Builder]*):
        com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder)
    /**
     * @param onFailure Configuration block with destination configuration for failed asynchronous invocations. See below.
     * @return builder
     */
    def onFailure(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnFailureArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnFailureArgs.builder
      builder.onFailure(args(argsBuilder).build)

    /**
     * @param onSuccess Configuration block with destination configuration for successful asynchronous invocations. See below.
     * @return builder
     */
    def onSuccess(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs.builder
      builder.onSuccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.FunctionState.Builder)
    /**
     * @param deadLetterConfig Configuration block for dead letter queue. See below.
     * @return builder
     */
    def deadLetterConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs.builder
      builder.deadLetterConfig(args(argsBuilder).build)

    /**
     * @param environment Configuration block for environment variables. See below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param ephemeralStorage Amount of ephemeral storage (`/tmp`) to allocate for the Lambda Function. See below.
     * @return builder
     */
    def ephemeralStorage(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionEphemeralStorageArgs.builder
      builder.ephemeralStorage(args(argsBuilder).build)

    /**
     * @param fileSystemConfig Configuration block for EFS file system. See below.
     * @return builder
     */
    def fileSystemConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs.builder
      builder.fileSystemConfig(args(argsBuilder).build)

    /**
     * @param imageConfig Container image configuration values. See below.
     * @return builder
     */
    def imageConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionImageConfigArgs.builder
      builder.imageConfig(args(argsBuilder).build)

    /**
     * @param loggingConfig Configuration block for advanced logging settings. See below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param snapStart Configuration block for snap start settings. See below.
     * @return builder
     */
    def snapStart(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionSnapStartArgs.builder
      builder.snapStart(args(argsBuilder).build)

    /**
     * @param tracingConfig Configuration block for X-Ray tracing. See below.
     * @return builder
     */
    def tracingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs.builder
      builder.tracingConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for VPC. See below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder)
    /**
     * @param onFailure Destination configuration for failed invocations. See below.
     * @return builder
     */
    def onFailure(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigOnFailureArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigOnFailureArgs.builder
      builder.onFailure(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder)
    /**
     * @param schemaRegistryConfig Block for a Kafka schema registry setting. See below.
     * @return builder
     */
    def schemaRegistryConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.Builder]):
        com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigSchemaRegistryConfigArgs.builder
      builder.schemaRegistryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.inputs.CodeSigningConfigState.Builder)
    /**
     * @param allowedPublishers Configuration block of allowed publishers as signing profiles for this code signing configuration. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def allowedPublishers(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CodeSigningConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs.builder
      builder.allowedPublishers(args(argsBuilder).build)

    /**
     * @param policies Configuration block of code signing policies that define the actions to take if the validation checks fail. See below.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.Builder]):
        com.pulumi.aws.lambda.inputs.CodeSigningConfigState.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs.builder
      builder.policies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambda.EventSourceMappingArgs.Builder)
    /**
     * @param amazonManagedKafkaEventSourceConfig Additional configuration block for Amazon Managed Kafka sources. Incompatible with `selfManagedEventSource` and `selfManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    def amazonManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingAmazonManagedKafkaEventSourceConfigArgs.builder
      builder.amazonManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param destinationConfig Amazon SQS queue, Amazon SNS topic or Amazon S3 bucket (only available for Kafka sources) destination for failed records. Only available for stream sources (DynamoDB and Kinesis) and Kafka sources (Amazon MSK and Self-managed Apache Kafka). See below.
     * @return builder
     */
    def destinationConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigArgs.builder
      builder.destinationConfig(args(argsBuilder).build)

    /**
     * @param documentDbEventSourceConfig Configuration settings for a DocumentDB event source. See below.
     * @return builder
     */
    def documentDbEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingDocumentDbEventSourceConfigArgs.builder
      builder.documentDbEventSourceConfig(args(argsBuilder).build)

    /**
     * @param filterCriteria Criteria to use for [event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) Kinesis stream, DynamoDB stream, SQS queue event sources. See below.
     * @return builder
     */
    def filterCriteria(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaArgs.builder
      builder.filterCriteria(args(argsBuilder).build)

    /**
     * @param metricsConfig CloudWatch metrics configuration of the event source. Only available for stream sources (DynamoDB and Kinesis) and SQS queues. See below.
     * @return builder
     */
    def metricsConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingMetricsConfigArgs.builder
      builder.metricsConfig(args(argsBuilder).build)

    /**
     * @param provisionedPollerConfig Event poller configuration for the event source. Only valid for Amazon MSK or self-managed Apache Kafka sources. See below.
     * @return builder
     */
    def provisionedPollerConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingProvisionedPollerConfigArgs.builder
      builder.provisionedPollerConfig(args(argsBuilder).build)

    /**
     * @param scalingConfig Scaling configuration of the event source. Only available for SQS queues. See below.
     * @return builder
     */
    def scalingConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param selfManagedEventSource For Self Managed Kafka sources, the location of the self managed cluster. If set, configuration must also include `sourceAccessConfiguration`. See below.
     * @return builder
     */
    def selfManagedEventSource(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs.builder
      builder.selfManagedEventSource(args(argsBuilder).build)

    /**
     * @param selfManagedKafkaEventSourceConfig Additional configuration block for Self Managed Kafka sources. Incompatible with `eventSourceArn` and `amazonManagedKafkaEventSourceConfig`. See below.
     * @return builder
     */
    def selfManagedKafkaEventSourceConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.Builder]):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSelfManagedKafkaEventSourceConfigArgs.builder
      builder.selfManagedKafkaEventSourceConfig(args(argsBuilder).build)

    /**
     * @param sourceAccessConfigurations For Self Managed Kafka sources, the access configuration for the source. If set, configuration must also include `selfManagedEventSource`. See below.
     * @return builder
     */
    def sourceAccessConfigurations(args: Endofunction[com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.Builder]*):
        com.pulumi.aws.lambda.EventSourceMappingArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs.builder
      builder.sourceAccessConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Manages an AWS Lambda Function Recursion Config. Use this resource to control how Lambda handles recursive function invocations to prevent infinite loops.
   *  
   *  &gt; **Note:** Destruction of this resource will return the `recursiveLoop` configuration back to the default value of `Terminate`.
   */
  def FunctionRecursionConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionRecursionConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionRecursionConfigArgs.builder
    
    com.pulumi.aws.lambda.FunctionRecursionConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
