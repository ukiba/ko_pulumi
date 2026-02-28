package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object bedrock:
  /**
   * Manages an AWS Bedrock AgentCore Memory Strategy. Memory strategies define how the agent processes and organizes information within a memory, such as semantic understanding, summarization, or custom processing logic.
   *  
   *  **Important Limitations:**
   *  
   *  - Each memory can have a maximum of 6 strategies total
   *  - Only one strategy of each built-in type (`SEMANTIC`, `SUMMARIZATION`, `USER_PREFERENCE`) can exist per memory
   *  - Multiple `CUSTOM` strategies are allowed (subject to the total limit of 6)
   */
  def AgentcoreMemoryStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.bedrock.AgentcoreMemoryStrategy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def AgentcoreApiKeyCredentialProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreApiKeyCredentialProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreApiKeyCredentialProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.bedrock.AgentcoreApiKeyCredentialProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder)
    /**
     * @param dataSourceConfiguration Details about how the data source is stored. See `dataSourceConfiguration` block for details.
     * @return builder
     */
    def dataSourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.builder
      builder.dataSourceConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryptionConfiguration Details about the configuration of the server-side encryption. See `serverSideEncryptionConfiguration` block for details.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vectorIngestionConfiguration Details about the configuration of the server-side encryption. See `vectorIngestionConfiguration` block for details.
     * @return builder
     */
    def vectorIngestionConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.builder
      builder.vectorIngestionConfiguration(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Memory. Memory provides persistent storage for AI agent interactions, allowing agents to retain context across conversations and sessions. */
  def AgentcoreMemory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreMemoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentcoreMemory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Data Source. */
  def AgentDataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentDataSourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.bedrock.AgentDataSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent. */
  def AgentAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentAgentArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Bedrock AgentCore Agent Runtime. Agent Runtime provides a containerized execution environment for AI agents. */
  def AgentcoreAgentRuntime(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentcoreAgentRuntime(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Bedrock AgentCore Code Interpreter. Code Interpreter provides a secure environment for AI agents to execute Python code, enabling data analysis, calculations, and file processing capabilities. */
  def AgentcoreCodeInterpreter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentcoreCodeInterpreter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.CustomModelArgs.Builder)
    /**
     * @param outputDataConfig S3 location for the output data.
     * @return builder
     */
    def outputDataConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelOutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrock.CustomModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.CustomModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param trainingDataConfig Information about the training dataset.
     * @return builder
     */
    def trainingDataConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelTrainingDataConfigArgs.Builder]):
        com.pulumi.aws.bedrock.CustomModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelTrainingDataConfigArgs.builder
      builder.trainingDataConfig(args(argsBuilder).build)

    /**
     * @param validationDataConfig Information about the validation dataset.
     * @return builder
     */
    def validationDataConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.Builder]):
        com.pulumi.aws.bedrock.CustomModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.builder
      builder.validationDataConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrock.CustomModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  /** Manages [Provisioned Throughput](https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html) for an Amazon Bedrock model. */
  def ProvisionedModelThroughput(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.ProvisionedModelThroughput(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentArgs.Builder)
    /**
     * @param guardrailConfigurations Details about the guardrail associated with the agent. See `guardrailConfiguration` Block for details.
     * @return builder
     */
    def guardrailConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentGuardrailConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentAgentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentGuardrailConfigurationArgs.builder
      builder.guardrailConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryConfigurations Configurations for the agent&#39;s ability to retain the conversational context.
     * @return builder
     */
    def memoryConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentAgentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationArgs.builder
      builder.memoryConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param promptOverrideConfigurations Configurations to override prompt templates in different parts of an agent sequence. For more information, see [Advanced prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html). See `promptOverrideConfiguration` Block for details.
     * @return builder
     */
    def promptOverrideConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentAgentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.builder
      builder.promptOverrideConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder)
    /**
     * @param authorizerConfiguration Configuration for request authorization. Required when `authorizerType` is set to `CUSTOM_JWT`. See `authorizerConfiguration` below.
     * @return builder
     */
    def authorizerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

    /**
     * @param protocolConfiguration Protocol-specific configuration for the gateway. See `protocolConfiguration` below.
     * @return builder
     */
    def protocolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.builder
      builder.protocolConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent Alias. */
  def AgentAgentAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentAliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentAgentAliasArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentAgentAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder)
    def agentDescriptor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.builder
      builder.agentDescriptor(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Knowledge Base. */
  def AgentKnowledgeBase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentKnowledgeBase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent Action Group. */
  def AgentAgentActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.builder
    
    com.pulumi.aws.bedrock.AgentAgentActionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentPromptArgs.Builder)
    /**
     * @param variants A list of objects, each containing details about a variant of the prompt. See Variant for more information.
     * @return builder
     */
    def variants(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentPromptArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.builder
      builder.variants(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS Bedrock Guardrail Version. */
  def GuardrailVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.bedrock.GuardrailVersionArgs.builder
    
    com.pulumi.aws.bedrock.GuardrailVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Bedrock Inference Profile. */
  def InferenceProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.InferenceProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.InferenceProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.InferenceProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder)
    /**
     * @param kmsConfiguration KMS configuration for the token vault. See `kmsConfiguration` below.
     * @return builder
     */
    def kmsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.builder
      builder.kmsConfiguration(args(argsBuilder).build)

  /** Resource for managing an Amazon Bedrock Guardrail. */
  def Guardrail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.GuardrailArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.GuardrailArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.Guardrail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder)
    /**
     * @param credentialProviderConfiguration Configuration for authenticating requests to the target. Required when using `lambda`, `openApiSchema` and `smithyModel` in `mcp` block. If using `mcpServer` in `mcp` block with no authorization, it should not be specified. See `credentialProviderConfiguration` below.
     * @return builder
     */
    def credentialProviderConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.builder
      builder.credentialProviderConfiguration(args(argsBuilder).build)

    /**
     * @param targetConfiguration Configuration for the target endpoint. See `targetConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targetConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.builder
      builder.targetConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.Builder)
    /**
     * @param oauth2ProviderConfig OAuth2 provider configuration. Must contain exactly one provider type. See `oauth2ProviderConfig` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def oauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.builder
      builder.oauth2ProviderConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.Builder)
    /**
     * @param configuration Custom configuration block. Required when `type` is `CUSTOM`, must be omitted for other types. See `configuration` below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Gateway. With Gateway, developers can convert APIs, Lambda functions, and existing services into Model Context Protocol (MCP)-compatible tools. */
  def AgentcoreGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentcoreGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.InferenceProfileArgs.Builder)
    /**
     * @param modelSource The source of the model this inference profile will track metrics and cost for. See `modelSource`.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def modelSource(args: Endofunction[com.pulumi.aws.bedrock.inputs.InferenceProfileModelSourceArgs.Builder]):
        com.pulumi.aws.bedrock.InferenceProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.InferenceProfileModelSourceArgs.builder
      builder.modelSource(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.InferenceProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.InferenceProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.InferenceProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder)
    /**
     * @param networkConfiguration Network configuration for the browser. See `networkConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param recording Recording configuration for browser sessions. See `recording` below.
     * @return builder
     */
    def recording(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.builder
      builder.recording(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.GuardrailArgs.Builder)
    /**
     * @param contentPolicyConfig Content policy config for a guardrail. See Content Policy Config for more information.
     * @return builder
     */
    def contentPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.builder
      builder.contentPolicyConfig(args(argsBuilder).build)

    /**
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. See Contextual Grounding Policy Config for more information.
     * @return builder
     */
    def contextualGroundingPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.builder
      builder.contextualGroundingPolicyConfig(args(argsBuilder).build)

    def crossRegionConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailCrossRegionConfigArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailCrossRegionConfigArgs.builder
      builder.crossRegionConfig(args(argsBuilder).build)

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. See Sensitive Information Policy Config for more information.
     * @return builder
     */
    def sensitiveInformationPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.builder
      builder.sensitiveInformationPolicyConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail. See Topic Policy Config for more information.
     * @return builder
     */
    def topicPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.builder
      builder.topicPolicyConfig(args(argsBuilder).build)

    /**
     * @param wordPolicyConfig Word policy config for a guardrail. See Word Policy Config for more information.
     * @return builder
     */
    def wordPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.builder
      builder.wordPolicyConfig(args(argsBuilder).build)

  /**
   * Manages the AWS KMS customer master key (CMK) for a token vault.
   *  
   *  &gt; Deletion of this resource will not modify the CMK, only remove the resource from state.
   */
  def AgentcoreTokenVaultCmk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.builder
    
    com.pulumi.aws.bedrock.AgentcoreTokenVaultCmk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Bedrock AgentCore Agent Runtime Endpoint. Agent Runtime Endpoints provide a network-accessible interface for interacting with agent runtimes, enabling external systems to communicate with and invoke agent capabilities. */
  def AgentcoreAgentRuntimeEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Bedrock Agents Flow. */
  def AgentFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentFlowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentFlowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Bedrock AgentCore Gateway Target. Gateway targets define the endpoints and configurations that a gateway can invoke, such as Lambda functions or APIs, allowing agents to interact with external services through the Model Context Protocol (MCP). */
  def AgentcoreGatewayTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.bedrock.AgentcoreGatewayTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentFlowArgs.Builder)
    /**
     * @param definition A definition of the nodes and connections between nodes in the flow. See Definition for more information.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.Builder]):
        com.pulumi.aws.bedrock.AgentFlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentFlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder)
    /**
     * @param agentRuntimeArtifact Container artifact configuration. See `agentRuntimeArtifact` below.
     * @return builder
     */
    def agentRuntimeArtifact(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.builder
      builder.agentRuntimeArtifact(args(argsBuilder).build)

    /**
     * @param authorizerConfiguration Authorization configuration for authenticating incoming requests. See `authorizerConfiguration` below.
     * @return builder
     */
    def authorizerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

    /**
     * @param lifecycleConfigurations Runtime session and resource lifecycle configuration for the agent runtime. See `lifecycleConfiguration` below.
     * @return builder
     */
    def lifecycleConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeLifecycleConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeLifecycleConfigurationArgs.builder
      builder.lifecycleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the agent runtime. See `networkConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param protocolConfiguration Protocol configuration for the agent runtime. See `protocolConfiguration` below.
     * @return builder
     */
    def protocolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeProtocolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeProtocolConfigurationArgs.builder
      builder.protocolConfiguration(args(argsBuilder).build)

    /**
     * @param requestHeaderConfiguration Configuration for HTTP request headers that will be passed through to the runtime. See `requestHeaderConfiguration` below.
     * @return builder
     */
    def requestHeaderConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeRequestHeaderConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeRequestHeaderConfigurationArgs.builder
      builder.requestHeaderConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.Builder)
    /**
     * @param knowledgeBaseConfiguration Details about the embeddings configuration of the knowledge base. See `knowledgeBaseConfiguration` block for details.
     * @return builder
     */
    def knowledgeBaseConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.builder
      builder.knowledgeBaseConfiguration(args(argsBuilder).build)

    /**
     * @param storageConfiguration Details about the storage configuration of the knowledge base. See `storageConfiguration` block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type BedrockFunctions = com.pulumi.aws.bedrock.BedrockFunctions
  object BedrockFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.bedrock.BedrockFunctions.*
  extension (self: BedrockFunctions.type)
    /** Data source for managing an AWS Amazon BedrockAgent Agent Versions. */
    def getAgentAgentVersions(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetAgentAgentVersionsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getAgentAgentVersions(args(argsBuilder).build)

    /** Data source for managing an AWS Amazon BedrockAgent Agent Versions. */
    def getAgentAgentVersionsPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetAgentAgentVersionsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getAgentAgentVersionsPlain(args(argsBuilder).build)

    /** Returns properties of a specific Amazon Bedrock custom model. */
    def getCustomModel(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetCustomModelResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModel(args(argsBuilder).build)

    /** Returns properties of a specific Amazon Bedrock custom model. */
    def getCustomModelPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetCustomModelResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModelPlain(args(argsBuilder).build)

    /** Returns a list of Amazon Bedrock custom models. */
    def getCustomModels(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetCustomModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelsArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModels(args(argsBuilder).build)

    /** Returns a list of Amazon Bedrock custom models. */
    def getCustomModelsPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetCustomModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelsPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModelsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Bedrock Inference Profile. */
    def getInferenceProfile(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfileArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetInferenceProfileResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfileArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfile(args(argsBuilder).build)

    /** Data source for managing an AWS Bedrock Inference Profile. */
    def getInferenceProfilePlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetInferenceProfileResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilePlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfilePlain(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Inference Profiles. */
    def getInferenceProfiles(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetInferenceProfilesResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilesArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfiles(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Inference Profiles. */
    def getInferenceProfilesPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetInferenceProfilesResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilesPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfilesPlain(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Workload Identity. Workload Identity provides OAuth2-based authentication and authorization for AI agents to access external resources securely. */
  def AgentcoreWorkloadIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreWorkloadIdentityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreWorkloadIdentityArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.bedrock.AgentcoreWorkloadIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent Knowledge Base Association. */
  def AgentAgentKnowledgeBaseAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.builder
    
    com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Bedrock AgentCore Browser. Browser provides AI agents with web browsing capabilities, allowing them to navigate websites, extract information, and interact with web content in a controlled environment. */
  def AgentcoreBrowser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreBrowserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentcoreBrowser(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentAliasArgs.Builder)
    /**
     * @param routingConfigurations Details about the routing configuration of the alias. See `routingConfiguration` Block for details.
     * @return builder
     */
    def routingConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentAliasRoutingConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentAgentAliasArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentAliasRoutingConfigurationArgs.builder
      builder.routingConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentAliasTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentAliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentAliasTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder)
    /**
     * @param actionGroupExecutor ARN of the Lambda function containing the business logic that is carried out upon invoking the action or custom control method for handling the information elicited from the user. See `actionGroupExecutor` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def actionGroupExecutor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupActionGroupExecutorArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupActionGroupExecutorArgs.builder
      builder.actionGroupExecutor(args(argsBuilder).build)

    /**
     * @param apiSchema Either details about the S3 object containing the OpenAPI schema for the action group or the JSON or YAML-formatted payload defining the schema. For more information, see [Action group OpenAPI schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html). See `apiSchema` Block for details.
     * @return builder
     */
    def apiSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.builder
      builder.apiSchema(args(argsBuilder).build)

    /**
     * @param functionSchema Describes the function schema for the action group.
     *  Each function represents an action in an action group.
     *  See `functionSchema` Block for details.
     * @return builder
     */
    def functionSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.builder
      builder.functionSchema(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * 
   */
  def AgentcoreOauth2CredentialProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Bedrock Agents Agent Collaborator. */
  def AgentAgentCollaborator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.builder
    
    com.pulumi.aws.bedrock.AgentAgentCollaborator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.Builder)
    /**
     * @param parameters Parameters that the agent elicits from the user to fulfill the function. See `parameters` Block for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionParameterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.Builder)
    /**
     * @param items Nested items definition for arrays of arrays.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsItemsArgs.builder
      builder.items(args(argsBuilder).build)

    /**
     * @param properties Set of property definitions for arrays of objects. See `property` below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationArgs.Builder)
    /**
     * @param text Contains inference configurations for the prompt variant. See Text Inference Configuration for more information.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder)
    /**
     * @param mcp Model Context Protocol (MCP) configuration. See `mcp` below.
     * @return builder
     */
    def mcp(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageArgs.Builder)
    /**
     * @param content Contains the content for the message you pass to, or receive from a model. See [Message Content] for more information.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderState.Builder)
    /**
     * @param clientSecretArns ARN of the AWS Secrets Manager secret containing the client secret.
     * @return builder
     */
    def clientSecretArns(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderClientSecretArnArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderClientSecretArnArgs.builder
      builder.clientSecretArns(args.map(_(argsBuilder).build)*)

    /**
     * @param oauth2ProviderConfig OAuth2 provider configuration. Must contain exactly one provider type. See `oauth2ProviderConfig` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def oauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.builder
      builder.oauth2ProviderConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterState.Builder)
    /**
     * @param networkConfiguration Network configuration for the code interpreter. See `networkConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationArgs.Builder)
    /**
     * @param customJwtAuthorizer JWT-based authorization configuration block. See `customJwtAuthorizer` below.
     * @return builder
     */
    def customJwtAuthorizer(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerArgs.builder
      builder.customJwtAuthorizer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.Builder)
    /**
     * @param customJwtAuthorizer JWT-based authorization configuration block. See `customJwtAuthorizer` below.
     * @return builder
     */
    def customJwtAuthorizer(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerArgs.builder
      builder.customJwtAuthorizer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.Builder)
    /**
     * @param urlConfiguration The URL configuration of your web data source. See `urlConfiguration` block for details.
     * @return builder
     */
    def urlConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.builder
      builder.urlConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.Builder)
    /**
     * @param tierConfigs Configuration block for the topic policy tier. See Tier Config for more information.
     * @return builder
     */
    def tierConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigTierConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigTierConfigArgs.builder
      builder.tierConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param topicsConfigs List of topic configs in topic policy. See Topics Config for more information.
     * @return builder
     */
    def topicsConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigTopicsConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigTopicsConfigArgs.builder
      builder.topicsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationArgs.Builder)
    /**
     * @param toolChoice Defines which tools the model should request when invoked. See Tool Choice for more information.
     * @return builder
     */
    def toolChoice(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceArgs.builder
      builder.toolChoice(args(argsBuilder).build)

    /**
     * @param tools A list of tools to pass to a model. See Tool for more information.
     * @return builder
     */
    def tools(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolArgs.builder
      builder.tools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.Builder)
    /**
     * @param parsingPrompt Instructions for interpreting the contents of the document. See `parsingPrompt` block for details.
     * @return builder
     */
    def parsingPrompt(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationParsingPromptArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationParsingPromptArgs.builder
      builder.parsingPrompt(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.Builder)
    /**
     * @param managedWordListsConfigs A config for the list of managed words. See Managed Word Lists Config for more information.
     * @return builder
     */
    def managedWordListsConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigManagedWordListsConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigManagedWordListsConfigArgs.builder
      builder.managedWordListsConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param wordsConfigs List of custom word configs. See Words Config for more information.
     * @return builder
     */
    def wordsConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigWordsConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigWordsConfigArgs.builder
      builder.wordsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder)
    /**
     * @param agent Contains configurations for an agent node in your flow. Invokes an alias of an agent and returns the response. See Agent Node Configuration for more information.
     * @return builder
     */
    def agent(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationAgentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationAgentArgs.builder
      builder.agent(args(argsBuilder).build)

    /**
     * @param collector Contains configurations for a collector node in your flow. Collects an iteration of inputs and consolidates them into an array of outputs. This object has no fields.
     * @return builder
     */
    def collector(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationCollectorArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationCollectorArgs.builder
      builder.collector(args(argsBuilder).build)

    def condition(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param inlineCode Contains configurations for an inline code node in your flow. See Inline Code Node Configuration for more information.
     * @return builder
     */
    def inlineCode(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationInlineCodeArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationInlineCodeArgs.builder
      builder.inlineCode(args(argsBuilder).build)

    def input(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationInputArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param iterator Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively sends each item of the array as an output to the following node. The size of the array is also returned in the output. The output flow node at the end of the flow iteration will return a response for each member of the array. To return only one response, you can include a collector node downstream from the iterator node. This object has no fields.
     * @return builder
     */
    def iterator(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationIteratorArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationIteratorArgs.builder
      builder.iterator(args(argsBuilder).build)

    /**
     * @param knowledgeBase Contains configurations for a knowledge base node in your flow. Queries a knowledge base and returns the retrieved results or generated response. See Knowledge Base Node Configuration for more information.
     * @return builder
     */
    def knowledgeBase(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.builder
      builder.knowledgeBase(args(argsBuilder).build)

    /**
     * @param lambdaFunction Contains configurations for a Lambda function node in your flow. Invokes a Lambda function. See Lambda Function Node Configuration for more information.
     * @return builder
     */
    def lambdaFunction(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationLambdaFunctionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationLambdaFunctionArgs.builder
      builder.lambdaFunction(args(argsBuilder).build)

    /**
     * @param lex Contains configurations for a Lex node in your flow. Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the output. See Lex Node Configuration for more information.
     * @return builder
     */
    def lex(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationLexArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationLexArgs.builder
      builder.lex(args(argsBuilder).build)

    def output(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationOutputArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationOutputArgs.builder
      builder.output(args(argsBuilder).build)

    /**
     * @param prompt Contains configurations for a prompt node in your flow. Runs a prompt and generates the model response as the output. You can use a prompt from Prompt management or you can configure one in this node. See Prompt Node Configuration for more information.
     * @return builder
     */
    def prompt(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.builder
      builder.prompt(args(argsBuilder).build)

    /**
     * @param retrieval Contains configurations for a Retrieval node in your flow. Retrieves data from an Amazon S3 location and returns it as the output. See Retrieval Node Configuration for more information.
     * @return builder
     */
    def retrieval(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalArgs.builder
      builder.retrieval(args(argsBuilder).build)

    /**
     * @param storage Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location. See Storage Node Configuration for more information.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.Builder)
    /**
     * @param s3 Details about the S3 object containing the OpenAPI schema for the action group. See `s3` Block for details.
     *  Only one of `s3` or `payload` can be specified.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.Builder)
    /**
     * @param transformationLambdaConfiguration The configuration of the lambda function.
     * @return builder
     */
    def transformationLambdaConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionTransformationLambdaConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionTransformationLambdaConfigurationArgs.builder
      builder.transformationLambdaConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowState.Builder)
    /**
     * @param definition A definition of the nodes and connections between nodes in the flow. See Definition for more information.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.Builder)
    /**
     * @param items Items definition for array properties. See `items` above.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsArgs.builder
      builder.items(args(argsBuilder).build)

    /**
     * @param properties Set of nested property definitions for object properties.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.CustomModelState.Builder)
    /**
     * @param outputDataConfig S3 location for the output data.
     * @return builder
     */
    def outputDataConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelOutputDataConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param trainingDataConfig Information about the training dataset.
     * @return builder
     */
    def trainingDataConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelTrainingDataConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelTrainingDataConfigArgs.builder
      builder.trainingDataConfig(args(argsBuilder).build)

    /**
     * @param trainingMetrics Metrics associated with the customization job.
     * @return builder
     */
    def trainingMetrics(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelTrainingMetricArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelTrainingMetricArgs.builder
      builder.trainingMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param validationDataConfig Information about the validation dataset.
     * @return builder
     */
    def validationDataConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.builder
      builder.validationDataConfig(args(argsBuilder).build)

    /**
     * @param validationMetrics The loss metric for each validator that you provided.
     * @return builder
     */
    def validationMetrics(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelValidationMetricArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelValidationMetricArgs.builder
      builder.validationMetrics(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcConfig Configuration parameters for the private Virtual Private Cloud (VPC) that contains the resources you are using for this job.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.CustomModelState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationArgs.Builder)
    /**
     * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock embeddings model.  See `bedrockEmbeddingModelConfiguration` block for details.
     * @return builder
     */
    def bedrockEmbeddingModelConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationBedrockEmbeddingModelConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationBedrockEmbeddingModelConfigurationArgs.builder
      builder.bedrockEmbeddingModelConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder)
    /**
     * @param filters The configuration of specific filters applied to your data source content. Minimum of 1 filter and maximum of 25 filters.
     *  
     *  Each filter object should contain the following configuration:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder)
    /**
     * @param filters The configuration of specific filters applied to your data source content. Minimum of 1 filter and maximum of 25 filters.
     *  
     *  Each filter object should contain the following configuration:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder)
    /**
     * @param patternObjectFilters The configuration of filtering certain objects or content types of the data source. See `patternObjectFilter` block for details.
     * @return builder
     */
    def patternObjectFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.builder
      builder.patternObjectFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.Builder)
    /**
     * @param mcp Model Context Protocol (MCP) configuration block. See `mcp` below.
     * @return builder
     */
    def mcp(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseState.Builder)
    /**
     * @param knowledgeBaseConfiguration Details about the embeddings configuration of the knowledge base. See `knowledgeBaseConfiguration` block for details.
     * @return builder
     */
    def knowledgeBaseConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.builder
      builder.knowledgeBaseConfiguration(args(argsBuilder).build)

    /**
     * @param storageConfiguration Details about the storage configuration of the knowledge base. See `storageConfiguration` block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailVersionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailVersionState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.Builder)
    /**
     * @param functions Functions that each define an action in the action group. See `functions` Block for details.
     * @return builder
     */
    def functions(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.builder
      builder.functions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadata Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadata(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.Builder)
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder)
    /**
     * @param containerConfiguration Container configuration block. See `containerConfiguration` below.
     * @return builder
     */
    def containerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactContainerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder)
    /**
     * @param confluenceConfiguration Details about the configuration of the Confluence data source. See `confluenceDataSourceConfiguration` block for details.
     * @return builder
     */
    def confluenceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.builder
      builder.confluenceConfiguration(args(argsBuilder).build)

    /**
     * @param s3Configuration Details about the configuration of the S3 object containing the data source. See `s3DataSourceConfiguration` block for details.
     * @return builder
     */
    def s3Configuration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param salesforceConfiguration Details about the configuration of the Salesforce data source. See `salesforceDataSourceConfiguration` block for details.
     * @return builder
     */
    def salesforceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.builder
      builder.salesforceConfiguration(args(argsBuilder).build)

    /**
     * @param sharePointConfiguration Details about the configuration of the SharePoint data source. See `sharePointDataSourceConfiguration` block for details.
     * @return builder
     */
    def sharePointConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.builder
      builder.sharePointConfiguration(args(argsBuilder).build)

    /**
     * @param webConfiguration Details about the configuration of the web data source. See `webDataSourceConfiguration` block for details.
     * @return builder
     */
    def webConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.builder
      builder.webConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.Builder)
    /**
     * @param s3Location S3 location where browser session recordings are stored. See `s3Location` below.
     * @return builder
     */
    def s3Location(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingS3LocationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingS3LocationArgs.builder
      builder.s3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyState.Builder)
    /**
     * @param configuration Custom configuration block. Required when `type` is `CUSTOM`, must be omitted for other types. See `configuration` below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.Builder)
    /**
     * @param vpcConfig VPC configuration when `networkMode` is `VPC`. See `vpcConfig` below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.Builder)
    /**
     * @param consolidation Consolidation configuration for processing and organizing memory content. See `consolidation` below. Once added, this block cannot be removed without recreating the resource.
     * @return builder
     */
    def consolidation(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationConsolidationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationConsolidationArgs.builder
      builder.consolidation(args(argsBuilder).build)

    /**
     * @param extraction Extraction configuration for identifying and extracting relevant information. See `extraction` below. Cannot be used with `type` set to `SUMMARY_OVERRIDE`. Once added, this block cannot be removed without recreating the resource.
     * @return builder
     */
    def extraction(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationExtractionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStrategyConfigurationExtractionArgs.builder
      builder.extraction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationArgs.Builder)
    /**
     * @param fieldMapping Names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.Builder)
    /**
     * @param memberFunctions Contains a list of functions.
     *  Each function describes and action in the action group.
     *  See `memberFunctions` Block for details.
     * @return builder
     */
    def memberFunctions(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.builder
      builder.memberFunctions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadArgs.Builder)
    /**
     * @param inputSchema Schema for the tool&#39;s input. See `schemaDefinition` below.
     * @return builder
     */
    def inputSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.builder
      builder.inputSchema(args(argsBuilder).build)

    /**
     * @param outputSchema Schema for the tool&#39;s output. See `schemaDefinition` below.
     * @return builder
     */
    def outputSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.builder
      builder.outputSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder)
    /**
     * @param patternObjectFilters The configuration of filtering certain objects or content types of the data source. See `patternObjectFilter` block for details.
     * @return builder
     */
    def patternObjectFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.builder
      builder.patternObjectFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.Builder)
    /**
     * @param connections A list of connection definitions in the flow. See Connection for more information.
     * @return builder
     */
    def connections(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionArgs.builder
      builder.connections(args.map(_(argsBuilder).build)*)

    /**
     * @param nodes A list of node definitions in the flow. See Node for more information.
     * @return builder
     */
    def nodes(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationArgs.Builder)
    /**
     * @param toolChoice Defines which tools the model should request when invoked. See Tool Choice for more information.
     * @return builder
     */
    def toolChoice(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.builder
      builder.toolChoice(args(argsBuilder).build)

    /**
     * @param tools A list of tools to pass to a model. See Tool for more information.
     * @return builder
     */
    def tools(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolArgs.builder
      builder.tools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageArgs.Builder)
    def serviceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.builder
      builder.serviceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetState.Builder)
    /**
     * @param credentialProviderConfiguration Configuration for authenticating requests to the target. Required when using `lambda`, `openApiSchema` and `smithyModel` in `mcp` block. If using `mcpServer` in `mcp` block with no authorization, it should not be specified. See `credentialProviderConfiguration` below.
     * @return builder
     */
    def credentialProviderConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.builder
      builder.credentialProviderConfiguration(args(argsBuilder).build)

    /**
     * @param targetConfiguration Configuration for the target endpoint. See `targetConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targetConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.builder
      builder.targetConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param filterConfiguration The Salesforce standard object configuration. See `filterConfiguration` block for details.
     * @return builder
     */
    def filterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.builder
      builder.filterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param filterConfiguration The Salesforce standard object configuration. See `filterConfiguration` block for details.
     * @return builder
     */
    def filterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.builder
      builder.filterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder)
    /**
     * @param filters The configuration of specific filters applied to your data source content. Minimum of 1 filter and maximum of 25 filters.
     *  
     *  Each filter object should contain the following configuration:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.Builder)
    /**
     * @param items Items definition for array properties. See `items` above.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsArgs.builder
      builder.items(args(argsBuilder).build)

    /**
     * @param properties Set of nested property definitions for object properties.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.Builder)
    def inputVariables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatInputVariableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param messages A list of messages in the chat for the prompt. See Message for more information.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param systems A list of system prompts to provide context to the model or to describe how it should behave. See System for more information.
     * @return builder
     */
    def systems(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemArgs.builder
      builder.systems(args.map(_(argsBuilder).build)*)

    /**
     * @param toolConfiguration Configuration information for the tools that the model can use when generating a response. See Tool Configuration for more information.
     * @return builder
     */
    def toolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationArgs.builder
      builder.toolConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageArgs.Builder)
    /**
     * @param s3Location Configuration block for intermedia S3 storage.
     * @return builder
     */
    def s3Location(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageS3LocationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageS3LocationArgs.builder
      builder.s3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.Builder)
    /**
     * @param chunkingConfiguration Details about how to chunk the documents in the data source. A chunk refers to an excerpt from a data source that is returned when the knowledge base that it belongs to is queried. See `chunkingConfiguration` block for details.
     * @return builder
     */
    def chunkingConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationArgs.builder
      builder.chunkingConfiguration(args(argsBuilder).build)

    /**
     * @param customTransformationConfiguration Configuration for custom transformation of data source documents.
     * @return builder
     */
    def customTransformationConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationArgs.builder
      builder.customTransformationConfiguration(args(argsBuilder).build)

    /**
     * @param parsingConfiguration Configuration for custom parsing of data source documents. See `parsingConfiguration` block for details.
     * @return builder
     */
    def parsingConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.builder
      builder.parsingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder)
    /**
     * @param inputSchema The input schema of the tool. See Tool Input Schema for more information.
     * @return builder
     */
    def inputSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.builder
      builder.inputSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.builder
      builder.items(args(argsBuilder).build)

    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaArgs.Builder)
    /**
     * @param toolSchema Schema definition for the tool. See `toolSchema` below.
     * @return builder
     */
    def toolSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.builder
      builder.toolSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.Builder)
    /**
     * @param promptConfigurations Configurations to override a prompt template in one part of an agent sequence. See `promptConfigurations` Block for details.
     * @return builder
     */
    def promptConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.builder
      builder.promptConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.Builder)
    /**
     * @param embeddingModelConfiguration The embeddings model configuration details for the vector model used in Knowledge Base.  See `embeddingModelConfiguration` block for details.
     * @return builder
     */
    def embeddingModelConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationArgs.builder
      builder.embeddingModelConfiguration(args(argsBuilder).build)

    /**
     * @param supplementalDataStorageConfiguration supplemental_data_storage_configuration.  See `supplementalDataStorageConfiguration` block for details.
     * @return builder
     */
    def supplementalDataStorageConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationArgs.builder
      builder.supplementalDataStorageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageArgs.Builder)
    /**
     * @param content Contains the content for the message you pass to, or receive from a model. See [Message Content] for more information.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder)
    /**
     * @param lambda Lambda function target configuration. See `lambda` below.
     * @return builder
     */
    def lambda(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    /**
     * @param mcpServer MCP server target configuration. See `mcpServer` below.
     * @return builder
     */
    def mcpServer(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpMcpServerArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpMcpServerArgs.builder
      builder.mcpServer(args(argsBuilder).build)

    /**
     * @param openApiSchema OpenAPI schema-based target configuration. See `apiSchemaConfiguration` below.
     * @return builder
     */
    def openApiSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.builder
      builder.openApiSchema(args(argsBuilder).build)

    /**
     * @param smithyModel Smithy model-based target configuration. See `apiSchemaConfiguration` below.
     * @return builder
     */
    def smithyModel(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.builder
      builder.smithyModel(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a tool designation. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

    /**
     * @param toolSpec The specification for the tool. See Tool Specification for more information.
     * @return builder
     */
    def toolSpec(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecArgs.builder
      builder.toolSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.Builder)
    /**
     * @param filtersConfigs One or more blocks defining contextual grounding filter configs. See Contextual Grounding Filters Config for more information.
     * @return builder
     */
    def filtersConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigFiltersConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigFiltersConfigArgs.builder
      builder.filtersConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder)
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

    def inputVariables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextInputVariableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.Builder)
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder)
    /**
     * @param opensearchServerlessConfiguration The storage configuration of the knowledge base in Amazon OpenSearch Service. See `opensearchServerlessConfiguration` block for details.
     * @return builder
     */
    def opensearchServerlessConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationArgs.builder
      builder.opensearchServerlessConfiguration(args(argsBuilder).build)

    /**
     * @param pineconeConfiguration The storage configuration of the knowledge base in Pinecone. See `pineconeConfiguration` block for details.
     * @return builder
     */
    def pineconeConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationArgs.builder
      builder.pineconeConfiguration(args(argsBuilder).build)

    /**
     * @param rdsConfiguration Details about the storage configuration of the knowledge base in Amazon RDS. For more information, see [Create a vector index in Amazon RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup.html). See `rdsConfiguration` block for details.
     * @return builder
     */
    def rdsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationArgs.builder
      builder.rdsConfiguration(args(argsBuilder).build)

    /**
     * @param redisEnterpriseCloudConfiguration The storage configuration of the knowledge base in Redis Enterprise Cloud. See `redisEnterpriseCloudConfiguration` block for details.
     * @return builder
     */
    def redisEnterpriseCloudConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs.builder
      builder.redisEnterpriseCloudConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceState.Builder)
    /**
     * @param dataSourceConfiguration Details about how the data source is stored. See `dataSourceConfiguration` block for details.
     * @return builder
     */
    def dataSourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs.builder
      builder.dataSourceConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryptionConfiguration Details about the configuration of the server-side encryption. See `serverSideEncryptionConfiguration` block for details.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vectorIngestionConfiguration Details about the configuration of the server-side encryption. See `vectorIngestionConfiguration` block for details.
     * @return builder
     */
    def vectorIngestionConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs.builder
      builder.vectorIngestionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentAliasState.Builder)
    /**
     * @param routingConfigurations Details about the routing configuration of the alias. See `routingConfiguration` Block for details.
     * @return builder
     */
    def routingConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentAliasRoutingConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentAliasState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentAliasRoutingConfigurationArgs.builder
      builder.routingConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentAliasTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentAliasState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentAliasTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsArgs.Builder)
    /**
     * @param items Nested items definition for arrays of arrays.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsItemsArgs.builder
      builder.items(args(argsBuilder).build)

    /**
     * @param properties Set of property definitions for arrays of objects. See `property` below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyItemsPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineArgs.Builder)
    /**
     * @param inferenceConfiguration Contains inference configurations for the prompt. See Prompt Inference Configuration for more information.
     * @return builder
     */
    def inferenceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationArgs.builder
      builder.inferenceConfiguration(args(argsBuilder).build)

    /**
     * @param templateConfiguration Contains a prompt and variables in the prompt that can be replaced with values at runtime. See Prompt Template Configuration for more information.
     * @return builder
     */
    def templateConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.builder
      builder.templateConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.InferenceProfileState.Builder)
    /**
     * @param modelSource The source of the model this inference profile will track metrics and cost for. See `modelSource`.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def modelSource(args: Endofunction[com.pulumi.aws.bedrock.inputs.InferenceProfileModelSourceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.InferenceProfileState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.InferenceProfileModelSourceArgs.builder
      builder.modelSource(args(argsBuilder).build)

    /**
     * @param models A list of information about each model in the inference profile. See `models`.
     * @return builder
     */
    def models(args: Endofunction[com.pulumi.aws.bedrock.inputs.InferenceProfileModelArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.InferenceProfileState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.InferenceProfileModelArgs.builder
      builder.models(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.InferenceProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.InferenceProfileState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.InferenceProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorState.Builder)
    def agentDescriptor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.builder
      builder.agentDescriptor(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param filterConfiguration The Salesforce standard object configuration. See `filterConfiguration` block for details.
     * @return builder
     */
    def filterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.builder
      builder.filterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.Builder)
    /**
     * @param items Nested items definition for arrays of arrays.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsItemsArgs.builder
      builder.items(args(argsBuilder).build)

    /**
     * @param properties Set of property definitions for arrays of objects. See `property` below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.Builder)
    /**
     * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse documents in a data source. See `bedrockFoundationModelConfiguration` block for details.
     * @return builder
     */
    def bedrockFoundationModelConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.builder
      builder.bedrockFoundationModelConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkState.Builder)
    /**
     * @param kmsConfiguration KMS configuration for the token vault. See `kmsConfiguration` below.
     * @return builder
     */
    def kmsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.builder
      builder.kmsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscovery OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscovery(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscovery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder)
    /**
     * @param any Defines tools, at least one of which must be requested by the model. No text is generated but the results of tool use are sent back to the model to help generate a response. This object has no fields.
     * @return builder
     */
    def any(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceAnyArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceAnyArgs.builder
      builder.any(args(argsBuilder).build)

    /**
     * @param auto Defines tools. The model automatically decides whether to call a tool or to generate text instead. This object has no fields.
     * @return builder
     */
    def auto(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceAutoArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceAutoArgs.builder
      builder.auto(args(argsBuilder).build)

    /**
     * @param tool Defines a specific tool that the model must request. No text is generated but the results of tool use are sent back to the model to help generate a response. See Named Tool for more information.
     * @return builder
     */
    def tool(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceToolArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceToolArgs.builder
      builder.tool(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationArgs.Builder)
    /**
     * @param intermediateStorage The intermediate storage for custom transformation.
     * @return builder
     */
    def intermediateStorage(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageArgs.builder
      builder.intermediateStorage(args(argsBuilder).build)

    /**
     * @param transformation A custom processing step for documents moving through the data source ingestion pipeline.
     * @return builder
     */
    def transformation(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationArgs.builder
      builder.transformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder)
    def inputVariables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatInputVariableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param messages A list of messages in the chat for the prompt. See Message for more information.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param systems A list of system prompts to provide context to the model or to describe how it should behave. See System for more information.
     * @return builder
     */
    def systems(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemArgs.builder
      builder.systems(args.map(_(argsBuilder).build)*)

    /**
     * @param toolConfiguration Configuration information for the tools that the model can use when generating a response. See Tool Configuration for more information.
     * @return builder
     */
    def toolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationArgs.builder
      builder.toolConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.Builder)
    /**
     * @param s3Location Contains information about the Amazon S3 location for the extracted images.  See `s3Location` block for details.
     * @return builder
     */
    def s3Location(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationS3LocationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationS3LocationArgs.builder
      builder.s3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsArgs.Builder)
    /**
     * @param items Nested items definition for arrays of arrays.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsItemsArgs.builder
      builder.items(args(argsBuilder).build)

    /**
     * @param properties Set of property definitions for arrays of objects. See `property` below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyItemsPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder)
    /**
     * @param apiKey API key-based authentication configuration. See `apiKey` below.
     * @return builder
     */
    def apiKey(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationApiKeyArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

    /**
     * @param gatewayIamRole Use the gateway&#39;s IAM role for authentication. This is an empty configuration block.
     * @return builder
     */
    def gatewayIamRole(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationGatewayIamRoleArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationGatewayIamRoleArgs.builder
      builder.gatewayIamRole(args(argsBuilder).build)

    /**
     * @param oauth OAuth-based authentication configuration. See `oauth` below.
     * @return builder
     */
    def oauth(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationOauthArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationOauthArgs.builder
      builder.oauth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.builder
      builder.items(args(argsBuilder).build)

    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.Builder)
    /**
     * @param vpcConfig VPC configuration. See `vpcConfig` below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param crawlerLimits Configuration of crawl limits for the web URLs. See `crawlerLimits` block for details.
     * @return builder
     */
    def crawlerLimits(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationCrawlerLimitsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationCrawlerLimitsArgs.builder
      builder.crawlerLimits(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder)
    /**
     * @param patternObjectFilters The configuration of filtering certain objects or content types of the data source. See `patternObjectFilter` block for details.
     * @return builder
     */
    def patternObjectFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.builder
      builder.patternObjectFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.Builder)
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationArgs.Builder)
    /**
     * @param transformationFunction The lambda function that processes documents.
     * @return builder
     */
    def transformationFunction(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.builder
      builder.transformationFunction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder)
    /**
     * @param guardrailConfiguration Contains configurations for a guardrail to apply during query and response generation for the knowledge base in this configuration. See Guardrail Configuration for more information.
     * @return builder
     */
    def guardrailConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseGuardrailConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseGuardrailConfigurationArgs.builder
      builder.guardrailConfiguration(args(argsBuilder).build)

    /**
     * @param inferenceConfiguration Contains inference configurations for the prompt. See Prompt Inference Configuration for more information.
     * @return builder
     */
    def inferenceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.builder
      builder.inferenceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder)
    def inlinePayload(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelInlinePayloadArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelInlinePayloadArgs.builder
      builder.inlinePayload(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.Builder)
    /**
     * @param seedUrls List of one or more seed URLs to crawl. See `seedUrls` block for details.
     * @return builder
     */
    def seedUrls(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationSeedUrlArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationSeedUrlArgs.builder
      builder.seedUrls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationArgs.Builder)
    /**
     * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size chunking. Requires chunkingStrategy as `FIXED_SIZE`. See `fixedSizeChunkingConfiguration` for details.
     * @return builder
     */
    def fixedSizeChunkingConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfigurationArgs.builder
      builder.fixedSizeChunkingConfiguration(args(argsBuilder).build)

    /**
     * @param hierarchicalChunkingConfiguration Configurations for when you choose hierarchical chunking. Requires chunkingStrategy as `HIERARCHICAL`. See `hierarchicalChunkingConfiguration` for details.
     * @return builder
     */
    def hierarchicalChunkingConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationArgs.builder
      builder.hierarchicalChunkingConfiguration(args(argsBuilder).build)

    /**
     * @param semanticChunkingConfiguration Configurations for when you choose semantic chunking. Requires chunkingStrategy as `SEMANTIC`. See `semanticChunkingConfiguration` for details.
     * @return builder
     */
    def semanticChunkingConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationSemanticChunkingConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationSemanticChunkingConfigurationArgs.builder
      builder.semanticChunkingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder)
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

    def inputVariables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextInputVariableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.Builder)
    /**
     * @param conditional The configuration of a connection originating from a Condition node. See Conditional Connection Configuration for more information.
     * @return builder
     */
    def conditional(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationConditionalArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationConditionalArgs.builder
      builder.conditional(args(argsBuilder).build)

    /**
     * @param data The configuration of a connection originating from a node that isn\u2019t a Condition node. See Data Connection Configuration for more information.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationDataArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationDataArgs.builder
      builder.data(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalArgs.Builder)
    def serviceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.builder
      builder.serviceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder)
    /**
     * @param vectorKnowledgeBaseConfiguration Details about the embeddings model that&#39;sused to convert the data source. See `vectorKnowledgeBaseConfiguration` block for details.
     * @return builder
     */
    def vectorKnowledgeBaseConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.builder
      builder.vectorKnowledgeBaseConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentState.Builder)
    /**
     * @param guardrailConfigurations Details about the guardrail associated with the agent. See `guardrailConfiguration` Block for details.
     * @return builder
     */
    def guardrailConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentGuardrailConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentGuardrailConfigurationArgs.builder
      builder.guardrailConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryConfigurations Configurations for the agent&#39;s ability to retain the conversational context.
     * @return builder
     */
    def memoryConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationArgs.builder
      builder.memoryConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param promptOverrideConfigurations Configurations to override prompt templates in different parts of an agent sequence. For more information, see [Advanced prompts](https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html). See `promptOverrideConfiguration` Block for details.
     * @return builder
     */
    def promptOverrideConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.builder
      builder.promptOverrideConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailState.Builder)
    /**
     * @param contentPolicyConfig Content policy config for a guardrail. See Content Policy Config for more information.
     * @return builder
     */
    def contentPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.builder
      builder.contentPolicyConfig(args(argsBuilder).build)

    /**
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. See Contextual Grounding Policy Config for more information.
     * @return builder
     */
    def contextualGroundingPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.builder
      builder.contextualGroundingPolicyConfig(args(argsBuilder).build)

    def crossRegionConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailCrossRegionConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailCrossRegionConfigArgs.builder
      builder.crossRegionConfig(args(argsBuilder).build)

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. See Sensitive Information Policy Config for more information.
     * @return builder
     */
    def sensitiveInformationPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.builder
      builder.sensitiveInformationPolicyConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail. See Topic Policy Config for more information.
     * @return builder
     */
    def topicPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailTopicPolicyConfigArgs.builder
      builder.topicPolicyConfig(args(argsBuilder).build)

    /**
     * @param wordPolicyConfig Word policy config for a guardrail. See Word Policy Config for more information.
     * @return builder
     */
    def wordPolicyConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailWordPolicyConfigArgs.builder
      builder.wordPolicyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a tool designation. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

    /**
     * @param toolSpec The specification for the tool. See Tool Specification for more information.
     * @return builder
     */
    def toolSpec(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecArgs.builder
      builder.toolSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder)
    /**
     * @param agentRuntimeArtifact Container artifact configuration. See `agentRuntimeArtifact` below.
     * @return builder
     */
    def agentRuntimeArtifact(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.builder
      builder.agentRuntimeArtifact(args(argsBuilder).build)

    /**
     * @param authorizerConfiguration Authorization configuration for authenticating incoming requests. See `authorizerConfiguration` below.
     * @return builder
     */
    def authorizerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

    /**
     * @param lifecycleConfigurations Runtime session and resource lifecycle configuration for the agent runtime. See `lifecycleConfiguration` below.
     * @return builder
     */
    def lifecycleConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeLifecycleConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeLifecycleConfigurationArgs.builder
      builder.lifecycleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration Network configuration for the agent runtime. See `networkConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param protocolConfiguration Protocol configuration for the agent runtime. See `protocolConfiguration` below.
     * @return builder
     */
    def protocolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeProtocolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeProtocolConfigurationArgs.builder
      builder.protocolConfiguration(args(argsBuilder).build)

    /**
     * @param requestHeaderConfiguration Configuration for HTTP request headers that will be passed through to the runtime. See `requestHeaderConfiguration` below.
     * @return builder
     */
    def requestHeaderConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeRequestHeaderConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeRequestHeaderConfigurationArgs.builder
      builder.requestHeaderConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param workloadIdentityDetails Workload identity details for the agent runtime. See `workloadIdentityDetails` below.
     * @return builder
     */
    def workloadIdentityDetails(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeWorkloadIdentityDetailArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeWorkloadIdentityDetailArgs.builder
      builder.workloadIdentityDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionArgs.Builder)
    /**
     * @param configuration Configuration of the connection. See Connection Configuration for more information.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationArgs.Builder)
    /**
     * @param chat Contains configurations to use the prompt in a conversational format. See Chat Template Configuration for more information.
     * @return builder
     */
    def chat(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatArgs.builder
      builder.chat(args(argsBuilder).build)

    /**
     * @param text Contains configurations for the text in a message for a prompt. See Text Template Configuration
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceArgs.Builder)
    /**
     * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. See Agent Configuration for more information.
     * @return builder
     */
    def agent(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceAgentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceAgentArgs.builder
      builder.agent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder)
    /**
     * @param genAiResource Specifies a generative AI resource with which to use the prompt. If this is not supplied, then a `genAiResource` must be defined. See Generative AI Resource for more information.
     * @return builder
     */
    def genAiResource(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceArgs.builder
      builder.genAiResource(args(argsBuilder).build)

    /**
     * @param inferenceConfiguration Contains inference configurations for the prompt variant. See Inference Configuration for more information.
     * @return builder
     */
    def inferenceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationArgs.builder
      builder.inferenceConfiguration(args(argsBuilder).build)

    /**
     * @param metadatas A list of objects, each containing a key-value pair that defines a metadata tag and value to attach to a prompt variant. See Metadata for more information.
     * @return builder
     */
    def metadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param templateConfiguration Contains configurations for the prompt template. See Template Configuration for more information.
     * @return builder
     */
    def templateConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationArgs.builder
      builder.templateConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a tool designation. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.Builder)
    /**
     * @param validators Information about the validators.
     * @return builder
     */
    def validators(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigValidatorArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigValidatorArgs.builder
      builder.validators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder)
    /**
     * @param authorizerConfiguration Configuration for request authorization. Required when `authorizerType` is set to `CUSTOM_JWT`. See `authorizerConfiguration` below.
     * @return builder
     */
    def authorizerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

    /**
     * @param protocolConfiguration Protocol-specific configuration for the gateway. See `protocolConfiguration` below.
     * @return builder
     */
    def protocolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.builder
      builder.protocolConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param workloadIdentityDetails Workload identity details for the gateway. See `workloadIdentityDetails` below.
     * @return builder
     */
    def workloadIdentityDetails(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayWorkloadIdentityDetailArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayWorkloadIdentityDetailArgs.builder
      builder.workloadIdentityDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptState.Builder)
    /**
     * @param variants A list of objects, each containing details about a variant of the prompt. See Variant for more information.
     * @return builder
     */
    def variants(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.builder
      builder.variants(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a tool designation. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupState.Builder)
    /**
     * @param actionGroupExecutor ARN of the Lambda function containing the business logic that is carried out upon invoking the action or custom control method for handling the information elicited from the user. See `actionGroupExecutor` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def actionGroupExecutor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupActionGroupExecutorArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupActionGroupExecutorArgs.builder
      builder.actionGroupExecutor(args(argsBuilder).build)

    /**
     * @param apiSchema Either details about the S3 object containing the OpenAPI schema for the action group or the JSON or YAML-formatted payload defining the schema. For more information, see [Action group OpenAPI schemas](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html). See `apiSchema` Block for details.
     * @return builder
     */
    def apiSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.builder
      builder.apiSchema(args(argsBuilder).build)

    /**
     * @param functionSchema Describes the function schema for the action group.
     *  Each function represents an action in an action group.
     *  See `functionSchema` Block for details.
     * @return builder
     */
    def functionSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.builder
      builder.functionSchema(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationArgs.Builder)
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.Builder)
    /**
     * @param piiEntitiesConfigs List of entities. See PII Entities Config for more information.
     * @return builder
     */
    def piiEntitiesConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigPiiEntitiesConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigPiiEntitiesConfigArgs.builder
      builder.piiEntitiesConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param regexesConfigs List of regex. See Regexes Config for more information.
     * @return builder
     */
    def regexesConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigRegexesConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailSensitiveInformationPolicyConfigRegexesConfigArgs.builder
      builder.regexesConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder)
    /**
     * @param customOauth2ProviderConfig Custom OAuth2 provider configuration. See `custom` below.
     * @return builder
     */
    def customOauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigArgs.builder
      builder.customOauth2ProviderConfig(args(argsBuilder).build)

    /**
     * @param githubOauth2ProviderConfig GitHub OAuth provider configuration. See `github` below.
     * @return builder
     */
    def githubOauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigArgs.builder
      builder.githubOauth2ProviderConfig(args(argsBuilder).build)

    /**
     * @param googleOauth2ProviderConfig Google OAuth provider configuration. See `google` below.
     * @return builder
     */
    def googleOauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigArgs.builder
      builder.googleOauth2ProviderConfig(args(argsBuilder).build)

    /**
     * @param microsoftOauth2ProviderConfig Microsoft OAuth provider configuration. See `microsoft` below.
     * @return builder
     */
    def microsoftOauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigArgs.builder
      builder.microsoftOauth2ProviderConfig(args(argsBuilder).build)

    /**
     * @param salesforceOauth2ProviderConfig Salesforce OAuth provider configuration. See `salesforce` below.
     * @return builder
     */
    def salesforceOauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigArgs.builder
      builder.salesforceOauth2ProviderConfig(args(argsBuilder).build)

    /**
     * @param slackOauth2ProviderConfig Slack OAuth provider configuration. See `slack` below.
     * @return builder
     */
    def slackOauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigArgs.builder
      builder.slackOauth2ProviderConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.Builder)
    /**
     * @param networkModeConfig Network mode configuration. See `networkModeConfig` below.
     * @return builder
     */
    def networkModeConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationNetworkModeConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationNetworkModeConfigArgs.builder
      builder.networkModeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationArgs.Builder)
    /**
     * @param storageLocations A storage location specification for images extracted from multimodal documents in your data source.  See `storageLocation` block for details.
     * @return builder
     */
    def storageLocations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.builder
      builder.storageLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeArgs.Builder)
    /**
     * @param configuration Contains configurations for the node. See Node Configuration for more information.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param inputs A list of objects containing information about an input into the node. See Node Input for more information.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeInputArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param outputs A list of objects containing information about an output from the node. See Node Output for more information.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeOutputArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.Builder)
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreBrowserState.Builder)
    /**
     * @param networkConfiguration Network configuration for the browser. See `networkConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param recording Recording configuration for browser sessions. See `recording` below.
     * @return builder
     */
    def recording(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.builder
      builder.recording(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.Builder)
    /**
     * @param filtersConfigs Set of content filter configs in content policy.
     *  See Filters Config for more information.
     * @return builder
     */
    def filtersConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigFiltersConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigFiltersConfigArgs.builder
      builder.filtersConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param tierConfigs Configuration block for the content policy tier. See Tier Config for more information.
     * @return builder
     */
    def tierConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigTierConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigTierConfigArgs.builder
      builder.tierConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder)
    /**
     * @param inputSchema The input schema of the tool. See Tool Input Schema for more information.
     * @return builder
     */
    def inputSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.builder
      builder.inputSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderState.Builder)
    /**
     * @param apiKeySecretArns ARN of the AWS Secrets Manager secret containing the API key.
     * @return builder
     */
    def apiKeySecretArns(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderApiKeySecretArnArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderApiKeySecretArnArgs.builder
      builder.apiKeySecretArns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder)
    /**
     * @param agentVersionSummaries List of objects, each of which contains information about a version of the agent. See Agent Version Summaries
     * @return builder
     */
    def agentVersionSummaries(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.builder
      builder.agentVersionSummaries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.Builder)
    /**
     * @param inlinePayloads Inline tool definition. See `inlinePayload` below.
     * @return builder
     */
    def inlinePayloads(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadArgs.builder
      builder.inlinePayloads(args.map(_(argsBuilder).build)*)

    /**
     * @param s3 S3-based tool definition. See `s3` below.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder)
    /**
     * @param guardrailConfiguration Contains configurations for a guardrail to apply during query and response generation for the knowledge base in this configuration. See Guardrail Configuration for more information.
     * @return builder
     */
    def guardrailConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptGuardrailConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptGuardrailConfigurationArgs.builder
      builder.guardrailConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder)
    /**
     * @param chat Contains configurations to use the prompt in a conversational format. See Chat Template Configuration for more information.
     * @return builder
     */
    def chat(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.builder
      builder.chat(args(argsBuilder).build)

    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionArgs.Builder)
    def conditions(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionConditionArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.Builder)
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.Builder)
    /**
     * @param inline Contains configurations for a prompt that is defined inline. See Prompt Inline Configuration for more information.
     * @return builder
     */
    def inline(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineArgs.builder
      builder.inline(args(argsBuilder).build)

    /**
     * @param resource Contains configurations for a prompt from Prompt management. See Prompt Resource Configuration for more information.
     * @return builder
     */
    def resource(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationResourceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationResourceArgs.builder
      builder.resource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder)
    /**
     * @param any Defines tools, at least one of which must be requested by the model. No text is generated but the results of tool use are sent back to the model to help generate a response. This object has no fields.
     * @return builder
     */
    def any(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceAnyArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceAnyArgs.builder
      builder.any(args(argsBuilder).build)

    /**
     * @param auto Defines tools. The model automatically decides whether to call a tool or to generate text instead. This object has no fields.
     * @return builder
     */
    def auto(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceAutoArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceAutoArgs.builder
      builder.auto(args(argsBuilder).build)

    /**
     * @param tool Defines a specific tool that the model must request. No text is generated but the results of tool use are sent back to the model to help generate a response. See Named Tool for more information.
     * @return builder
     */
    def tool(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceToolArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolChoiceToolArgs.builder
      builder.tool(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder)
    def inlinePayload(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaInlinePayloadArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaInlinePayloadArgs.builder
      builder.inlinePayload(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.Builder)
    def guardrailConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryGuardrailConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryGuardrailConfigurationArgs.builder
      builder.guardrailConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationArgs.Builder)
    /**
     * @param levelConfigurations Maximum number of tokens to include in a chunk. Must contain two `levelConfigurations`. See `levelConfigurations` for details.
     * @return builder
     */
    def levelConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationLevelConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationLevelConfigurationArgs.builder
      builder.levelConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.Builder)
    /**
     * @param inferenceConfigurations Inference parameters to use when the agent invokes a foundation model in the part of the agent sequence defined by the `promptType`. For more information, see [Inference parameters for foundation models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html). See `inferenceConfiguration` Block for details.
     * @return builder
     */
    def inferenceConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationInferenceConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationInferenceConfigurationArgs.builder
      builder.inferenceConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * 
   */
  def CustomModel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.CustomModelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.CustomModelArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.CustomModel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.Builder)
    /**
     * @param networkConfiguration Network configuration for the code interpreter. See `networkConfiguration` below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def networkConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Bedrock Agents Prompt. */
  def AgentPrompt(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentPromptArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentPromptArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bedrock.AgentPrompt(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
