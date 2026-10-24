package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object lambda:
  /**
   * Manages an AWS Lambda Alias. Use this resource to create an alias that points to a specific Lambda function version for traffic management and deployment strategies.
   * 
   * For information about Lambda and how to use it, see [What is AWS Lambda?](http://docs.aws.amazon.com/lambda/latest/dg/welcome.html). For information about function aliases, see [CreateAlias](http://docs.aws.amazon.com/lambda/latest/dg/API_CreateAlias.html) and [AliasRoutingConfiguration](https://docs.aws.amazon.com/lambda/latest/dg/API_AliasRoutingConfiguration.html) in the API docs.
   */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.AliasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.AliasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lambda.Alias(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Lambda Capacity Provider. */
  def CapacityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.CapacityProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.CapacityProviderArgs.builder
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
    com.pulumi.aws.lambda.CapacityProvider(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Code Signing Config. Use this resource to define allowed signing profiles and code-signing validation policies for Lambda functions to ensure code integrity and authenticity.
   * 
   * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html).
   */
  def CodeSigningConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.CodeSigningConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.CodeSigningConfigArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.lambda.CodeSigningConfig(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Lambda Network Connector. A network connector provisions elastic network interfaces (ENIs) in the subnets you specify, routing outbound traffic from [Lambda MicroVMs](https://docs.aws.amazon.com/lambda/latest/dg/microvms-networking.html) through your VPC \u2014 for example to reach private resources, or to give MicroVM traffic a stable source IP by exiting through your NAT gateway. */
  def CoreNetworkConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.CoreNetworkConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.CoreNetworkConnectorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lambda.CoreNetworkConnector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Event Source Mapping. Use this resource to connect Lambda functions to event sources like Kinesis, DynamoDB, SQS, Amazon MQ, and Managed Streaming for Apache Kafka (MSK).
   * 
   * For information about Lambda and how to use it, see [What is AWS Lambda?](http://docs.aws.amazon.com/lambda/latest/dg/welcome.html). For information about event source mappings, see [CreateEventSourceMapping](http://docs.aws.amazon.com/lambda/latest/dg/API_CreateEventSourceMapping.html) in the API docs.
   */
  def EventSourceMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.EventSourceMappingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.EventSourceMappingArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.lambda.EventSourceMapping(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Function. Use this resource to create serverless functions that run code in response to events without provisioning or managing servers.
   * 
   * For information about Lambda and how to use it, see [What is AWS Lambda?](https://docs.aws.amazon.com/lambda/latest/dg/welcome.html). For a detailed example of setting up Lambda and API Gateway, see Serverless Applications with AWS Lambda and API Gateway.
   * 
   * &gt; **Note:** Due to [AWS Lambda improved VPC networking changes that began deploying in September 2019](https://aws.amazon.com/blogs/compute/announcing-improved-vpc-networking-for-aws-lambda-functions/), EC2 subnets and security groups associated with Lambda Functions can take up to 45 minutes to successfully delete. Pulumi AWS Provider version 2.31.0 and later automatically handles this increased timeout, however prior versions require setting the customizable deletion timeouts of those Pulumi resources to 45 minutes (`delete = &#34;45m&#34;`). AWS and HashiCorp are working together to reduce the amount of time required for resource deletion and updates can be tracked in this GitHub issue.
   * 
   * &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking an `aws.lambda.Function` with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
   * 
   * &gt; **Tip:** To give an external source (like an EventBridge Rule, SNS, or S3) permission to access the Lambda function, use the `aws.lambda.Permission` resource. See [Lambda Permission Model](https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html) for more details. On the other hand, the `role` argument of this resource is the function&#39;s execution role for identity and access to AWS services and resources.
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.FunctionArgs.builder
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
    com.pulumi.aws.lambda.Function(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Function Event Invoke Config. Use this resource to configure error handling and destinations for asynchronous Lambda function invocations.
   * 
   * More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).
   */
  def FunctionEventInvokeConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionEventInvokeConfigArgs.builder
    com.pulumi.aws.lambda.FunctionEventInvokeConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Function Recursion Config. Use this resource to control how Lambda handles recursive function invocations to prevent infinite loops.
   * 
   * &gt; **Note:** Destruction of this resource will return the `recursiveLoop` configuration back to the default value of `Terminate`.
   */
  def FunctionRecursionConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionRecursionConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionRecursionConfigArgs.builder
    com.pulumi.aws.lambda.FunctionRecursionConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the scaling configuration for an AWS Lambda function. The scaling configuration defines the minimum and maximum number of execution environments that can be provisioned for the function, allowing you to control scaling behavior and resource allocation.
   * 
   * &gt; **NOTE:** This resource only works with Lambda functions that have a capacity provider configuration.
   * 
   * &gt; **NOTE:** Per common practice, this resource waits for the scaling configuration to converge before apply completes. It determines the min and max execution environments have settled using Requested and Applied scaling configs returned by Lambda. The [API documentation](https://docs.aws.amazon.com/lambda/latest/api/API_GetFunctionScalingConfig.html) is ambiguous about how these behave. From observation, Requested is only returned prior to settlement whereas Applied may be partially returned until settlement when it is fully returned. Should the observed behavior change, this resource will need to be updated to match.
   */
  def FunctionScalingConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionScalingConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionScalingConfigArgs.builder
    com.pulumi.aws.lambda.FunctionScalingConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lambda function URL. Creates a dedicated HTTP(S) endpoint for a Lambda function to enable direct invocation via HTTP requests.
   * 
   * &gt; **NOTE:** When [`authorizationType` is `&#34;NONE&#34;`](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html#urls-auth-none) the `lambda:InvokeFunctionUrl` permission allowing a public endpoint and `lambda:InvokeFunction` permission with the `InvokedViaFunctionUrl` flag set to `true` are automatically added to the Lambda function on creation. These policies are NOT removed from AWS when the resource is destroyed.
   */
  def FunctionUrl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.FunctionUrlArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.FunctionUrlArgs.builder
    com.pulumi.aws.lambda.FunctionUrl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Function invocation. Use this resource to invoke a Lambda function with the [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
   * 
   * &gt; **Note:** By default this resource _only_ invokes the function when the arguments call for a create or replace. After an initial invocation on _apply_, if the arguments do not change, a subsequent _apply_ does not invoke the function again. To dynamically invoke the function, see the `triggers` example below. To always invoke a function on each _apply_, see the `aws.lambda.Invocation` data source. To invoke the Lambda function when the Pulumi resource is updated and deleted, see the CRUD Lifecycle Management example below.
   * 
   * &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking a Lambda function with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
   */
  def Invocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.InvocationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.InvocationArgs.builder
    com.pulumi.aws.lambda.Invocation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LambdaFunctions:
    /** Provides details about an AWS Lambda Alias. Use this data source to retrieve information about an existing Lambda function alias for traffic management, deployment strategies, or API integrations. */
    inline def getAlias(args: Endofunction[com.pulumi.aws.lambda.inputs.GetAliasArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetAliasArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getAlias(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Lambda Alias. Use this data source to retrieve information about an existing Lambda function alias for traffic management, deployment strategies, or API integrations. */
    inline def getAliasPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetAliasPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetAliasPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getAliasPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides details about an AWS Lambda Code Signing Config. Use this data source to retrieve information about an existing code signing configuration for Lambda functions to ensure code integrity and authenticity.
     * 
     * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html).
     */
    inline def getCodeSigningConfig(args: Endofunction[com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetCodeSigningConfigResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetCodeSigningConfigArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getCodeSigningConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides details about an AWS Lambda Code Signing Config. Use this data source to retrieve information about an existing code signing configuration for Lambda functions to ensure code integrity and authenticity.
     * 
     * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html).
     */
    inline def getCodeSigningConfigPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetCodeSigningConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetCodeSigningConfigResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetCodeSigningConfigPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getCodeSigningConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides details about an AWS Lambda Function. Use this data source to obtain information about an existing Lambda function for use in other resources or as a reference for function configurations.
     * 
     * &gt; **Note:** This data source returns information about the latest version or alias specified by the `qualifier`. If no `qualifier` is provided, it returns information about the most recent published version, or `\$LATEST` if no published version exists.
     */
    inline def getFunction(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunction(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides details about an AWS Lambda Function. Use this data source to obtain information about an existing Lambda function for use in other resources or as a reference for function configurations.
     * 
     * &gt; **Note:** This data source returns information about the latest version or alias specified by the `qualifier`. If no `qualifier` is provided, it returns information about the most recent published version, or `\$LATEST` if no published version exists.
     */
    inline def getFunctionPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an AWS Lambda Function URL. Use this data source to retrieve information about an existing function URL configuration. */
    inline def getFunctionUrl(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetFunctionUrlResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionUrlArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionUrl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Lambda Function URL. Use this data source to retrieve information about an existing function URL configuration. */
    inline def getFunctionUrlPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionUrlPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetFunctionUrlResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionUrlPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionUrlPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides a list of AWS Lambda Functions in the current region. Use this data source to discover existing Lambda functions for inventory, monitoring, or bulk operations. */
    inline def getFunctions(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetFunctionsResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionsArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides a list of AWS Lambda Functions in the current region. Use this data source to discover existing Lambda functions for inventory, monitoring, or bulk operations. */
    inline def getFunctionsPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetFunctionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetFunctionsResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetFunctionsPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getFunctionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Invokes an AWS Lambda Function and returns its results. Use this data source to execute Lambda functions during Pulumi operations and use their results in other resources or outputs.
     * 
     * The Lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
     * 
     * &gt; **Note:** The `aws.lambda.Invocation` data source invokes the function during the first `apply` and every subsequent `plan` when the function is known.
     * 
     * &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking a Lambda function with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
     */
    inline def getInvocation(args: Endofunction[com.pulumi.aws.lambda.inputs.GetInvocationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetInvocationResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetInvocationArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getInvocation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Invokes an AWS Lambda Function and returns its results. Use this data source to execute Lambda functions during Pulumi operations and use their results in other resources or outputs.
     * 
     * The Lambda function is invoked with [RequestResponse](https://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html#API_Invoke_RequestSyntax) invocation type.
     * 
     * &gt; **Note:** The `aws.lambda.Invocation` data source invokes the function during the first `apply` and every subsequent `plan` when the function is known.
     * 
     * &gt; **Note:** If you get a `KMSAccessDeniedException: Lambda was unable to decrypt the environment variables because KMS access was denied` error when invoking a Lambda function with environment variables, the IAM role associated with the function may have been deleted and recreated after the function was created. You can fix the problem two ways: 1) updating the function&#39;s role to another role and then updating it back again to the recreated role. (When you create a function, Lambda grants permissions on the KMS key to the function&#39;s IAM role. If the IAM role is recreated, the grant is no longer valid. Changing the function&#39;s role or recreating the function causes Lambda to update the grant.)
     */
    inline def getInvocationPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetInvocationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetInvocationResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetInvocationPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getInvocationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an AWS Lambda Layer Version. Use this data source to retrieve information about a specific layer version or find the latest version compatible with your runtime and architecture requirements. */
    inline def getLayerVersion(args: Endofunction[com.pulumi.aws.lambda.inputs.GetLayerVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.lambda.outputs.GetLayerVersionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetLayerVersionArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getLayerVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Lambda Layer Version. Use this data source to retrieve information about a specific layer version or find the latest version compatible with your runtime and architecture requirements. */
    inline def getLayerVersionPlain(args: Endofunction[com.pulumi.aws.lambda.inputs.GetLayerVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.lambda.outputs.GetLayerVersionResult] =
      val argsBuilder = com.pulumi.aws.lambda.inputs.GetLayerVersionPlainArgs.builder
      com.pulumi.aws.lambda.LambdaFunctions.getLayerVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an AWS Lambda Layer Version. Use this resource to share code and dependencies across multiple Lambda functions.
   * 
   * For information about Lambda Layers and how to use them, see [AWS Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html).
   * 
   * &gt; **Note:** Setting `skipDestroy` to `true` means that the AWS Provider will not destroy any layer version, even when running `pulumi destroy`. Layer versions are thus intentional dangling resources that are not managed by Pulumi and may incur extra expense in your AWS account.
   */
  def LayerVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.LayerVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.LayerVersionArgs.builder
    com.pulumi.aws.lambda.LayerVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Layer Version Permission. Use this resource to share Lambda Layers with other AWS accounts, organizations, or make them publicly accessible.
   * 
   * For information about Lambda Layer Permissions and how to use them, see [Using Resource-based Policies for AWS Lambda](https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html#permissions-resource-xaccountlayer).
   * 
   * &gt; **Note:** Setting `skipDestroy` to `true` means that the AWS Provider will not destroy any layer version permission, even when running `pulumi destroy`. Layer version permissions are thus intentional dangling resources that are not managed by Pulumi and may incur extra expense in your AWS account.
   */
  def LayerVersionPermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.LayerVersionPermissionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.LayerVersionPermissionArgs.builder
    com.pulumi.aws.lambda.LayerVersionPermission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Lambda MicroVMs Image. Use this resource to define the base image, application code, and runtime configuration from which MicroVMs are launched. */
  @deprecated("aws.lambda/microvmsimage.MicrovmsImage has been deprecated in favor of aws.lambdamicrovms/image.Image") def MicrovmsImage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.MicrovmsImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambda.MicrovmsImageArgs.builder
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
    com.pulumi.aws.lambda.MicrovmsImage(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Lambda permission. Use this resource to grant external sources (e.g., EventBridge Rules, SNS, or S3) permission to invoke Lambda functions. */
  def Permission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.PermissionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.PermissionArgs.builder
    com.pulumi.aws.lambda.Permission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Provisioned Concurrency Configuration. Use this resource to configure provisioned concurrency for Lambda functions.
   * 
   * &gt; **Note:** Setting `skipDestroy` to `true` means that the AWS Provider will not destroy a provisioned concurrency configuration, even when running `pulumi destroy`. The configuration is thus an intentional dangling resource that is not managed by Pulumi and may incur extra expense in your AWS account.
   */
  def ProvisionedConcurrencyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.ProvisionedConcurrencyConfigArgs.builder
    com.pulumi.aws.lambda.ProvisionedConcurrencyConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the complete IAM resource-based policy document for an AWS Lambda function, function version, or alias.
   * 
   * &gt; **Note:** `PutResourcePolicy` (used by this resource) replaces the *entire* resource-based policy on the Lambda resource, including any statements added with `aws.lambda.Permission`. Do not use `aws.lambda.ResourcePolicy` and `aws.lambda.Permission` on the same Lambda function, version, or alias \u2014 every apply of one will overwrite statements managed by the other.
   */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.ResourcePolicyArgs.builder
    com.pulumi.aws.lambda.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Lambda Runtime Management Config. Use this resource to control how Lambda updates the runtime for your function.
   * 
   * Refer to the [AWS Lambda documentation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) for supported runtimes.
   * 
   * &gt; **Note:** Deletion of this resource returns the runtime update mode to `Auto` (the default behavior). To leave the configured runtime management options in-place, use a `removed` block with the destroy lifecycle set to `false`.
   */
  def RuntimeManagementConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lambda.RuntimeManagementConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambda.RuntimeManagementConfigArgs.builder
    com.pulumi.aws.lambda.RuntimeManagementConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
