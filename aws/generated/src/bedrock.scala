package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object bedrock:
  /** Resource for managing an AWS Agents for Amazon Bedrock Agent. */
  def AgentAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentAgentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.AgentAgent(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent Action Group. */
  def AgentAgentActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.builder
    com.pulumi.aws.bedrock.AgentAgentActionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder)
    /**
     * @param actionGroupExecutor ARN of the Lambda function containing the business logic that is carried out upon invoking the action or custom control method for handling the information elicited from the user. See `actionGroupExecutor` Block for details.
     * 
     * The following arguments are optional:
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
     * Each function represents an action in an action group.
     * See `functionSchema` Block for details.
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

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent Alias. */
  def AgentAgentAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentAliasArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentAgentAliasArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.AgentAgentAlias(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS Bedrock Agents Agent Collaborator. */
  def AgentAgentCollaborator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.builder
    com.pulumi.aws.bedrock.AgentAgentCollaborator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder)
    def agentDescriptor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.builder
      builder.agentDescriptor(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Agent Knowledge Base Association. */
  def AgentAgentKnowledgeBaseAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.builder
    com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Agents for Amazon Bedrock Data Source. */
  def AgentDataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentDataSourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentDataSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS Bedrock Agents Flow. */
  def AgentFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentFlowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentFlowArgs.builder
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
    com.pulumi.aws.bedrock.AgentFlow(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS Agents for Amazon Bedrock Knowledge Base. */
  def AgentKnowledgeBase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentKnowledgeBaseArgs.builder
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
    com.pulumi.aws.bedrock.AgentKnowledgeBase(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS Bedrock Agents Prompt. */
  def AgentPrompt(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentPromptArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentPromptArgs.builder
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
    com.pulumi.aws.bedrock.AgentPrompt(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentPromptArgs.Builder)
    /**
     * @param variants A list of objects, each containing details about a variant of the prompt. See Variant for more information.
     * @return builder
     */
    def variants(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentPromptArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.builder
      builder.variants(args.map(_(argsBuilder).build)*)

  /** Manages an AWS Bedrock AgentCore Agent Runtime. Agent Runtime provides a containerized execution environment for AI agents. */
  def AgentcoreAgentRuntime(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.AgentcoreAgentRuntime(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
     * @param filesystemConfigurations List of filesystems to mount into the agent runtime. Up to 5 entries are supported. Each entry is one of session storage, Amazon S3 Files access point, or Amazon EFS access point. See `filesystemConfiguration` below.
     * @return builder
     */
    def filesystemConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.builder
      builder.filesystemConfigurations(args.map(_(argsBuilder).build)*)

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
     * The following arguments are optional:
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

  /** Manages an AWS Bedrock AgentCore Agent Runtime Endpoint. Agent Runtime Endpoints provide a network-accessible interface for interacting with agent runtimes, enabling external systems to communicate with and invoke agent capabilities. */
  def AgentcoreAgentRuntimeEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpoint(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreAgentRuntimeEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS Bedrock AgentCore API Key Credential Provider. API Key credential providers enable secure authentication with external services that use API key-based authentication for agent runtimes.
   * 
   * &gt; **Note:** Write-Only argument `apiKeyWo` is available to use in place of `apiKey`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def AgentcoreApiKeyCredentialProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreApiKeyCredentialProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreApiKeyCredentialProviderArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreApiKeyCredentialProvider(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an AWS Bedrock AgentCore Browser. Browser provides AI agents with web browsing capabilities, allowing them to navigate websites, extract information, and interact with web content in a controlled environment. */
  def AgentcoreBrowser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreBrowserArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreBrowser(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreBrowserArgs.Builder)
    /**
     * @param networkConfiguration Network configuration for the browser. See `networkConfiguration` below.
     * 
     * The following arguments are optional:
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

  /** Manages an AWS Bedrock AgentCore Code Interpreter. Code Interpreter provides a secure environment for AI agents to execute Python code, enabling data analysis, calculations, and file processing capabilities. */
  def AgentcoreCodeInterpreter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreCodeInterpreter(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreCodeInterpreterArgs.Builder)
    /**
     * @param networkConfiguration Network configuration for the code interpreter. See `networkConfiguration` below.
     * 
     * The following arguments are optional:
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

  /** Manages an AWS Bedrock AgentCore Evaluator. An evaluator scores how an agent performs. You can configure it in one of two ways: an LLM-as-a-Judge evaluator that uses a model to score agent behavior against your instructions and a rating scale, or a code-based evaluator that runs a Lambda function you provide. */
  def AgentcoreEvaluator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreEvaluatorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreEvaluatorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.AgentcoreEvaluator(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreEvaluatorArgs.Builder)
    /**
     * @param evaluatorConfig Configuration that defines how the evaluator assesses agent performance. See `evaluatorConfig` below.
     * @return builder
     */
    def evaluatorConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreEvaluatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.builder
      builder.evaluatorConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreEvaluatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Gateway. With Gateway, developers can convert APIs, Lambda functions, and existing services into Model Context Protocol (MCP)-compatible tools. */
  def AgentcoreGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreGatewayArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreGateway(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
     * @param interceptorConfigurations List of interceptor configurations for the gateway. Minimum of 1, maximum of 2. See `interceptorConfiguration` below.
     * @return builder
     */
    def interceptorConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.builder
      builder.interceptorConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param policyEngineConfiguration Configuration for a policy engine associated with the gateway. A policy engine is a collection of policies that evaluates and authorizes agent tool calls. When associated with a gateway, the policy engine intercepts all agent requests and determines whether to allow or deny each action based on the defined policies. See `policyEngineConfiguration` below.
     * @return builder
     */
    def policyEngineConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayPolicyEngineConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayPolicyEngineConfigurationArgs.builder
      builder.policyEngineConfiguration(args(argsBuilder).build)

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

  /** Manages an AWS Bedrock AgentCore Gateway Target. Gateway targets define the endpoints and configurations that a gateway can invoke, such as Lambda functions, APIs, or AgentCore Runtime agents, allowing agents to interact with external services through the Model Context Protocol (MCP) or by routing HTTP traffic directly to a runtime. */
  def AgentcoreGatewayTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcoreGatewayTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
     * @param metadataConfiguration Configuration for HTTP header and query parameter propagation between the gateway and target servers. See `metadataConfiguration` below.
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    /**
     * @param privateEndpoint Configuration for private connectivity from AgentCore Gateway to a resource inside your VPC. Traffic is routed through Amazon VPC Lattice and never traverses the public internet. See `privateEndpoint` below.
     * @return builder
     */
    def privateEndpoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.builder
      builder.privateEndpoint(args(argsBuilder).build)

    /**
     * @param targetConfiguration Configuration for the target endpoint. See `targetConfiguration` below.
     * 
     * The following arguments are optional:
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

  /** Manages an AWS Bedrock AgentCore Harness. A Harness is a managed agent loop that wraps model configuration, tools, skills, memory, and compute environment into a single deployable unit. */
  def AgentcoreHarness(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreHarnessArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.AgentcoreHarness(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder)
    /**
     * @param authorizerConfiguration Authorization configuration for authenticating requests. See `authorizerConfiguration` below.
     * @return builder
     */
    def authorizerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

    /**
     * @param environmentArtifact Environment artifact configuration. See `environmentArtifact` below.
     * @return builder
     */
    def environmentArtifact(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactArgs.builder
      builder.environmentArtifact(args(argsBuilder).build)

    /**
     * @param environments Compute environment configuration. See `environment` below.
     * @return builder
     */
    def environments(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param memory Memory configuration. See `memory` below.
     * @return builder
     */
    def memory(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryArgs.builder
      builder.memory(args(argsBuilder).build)

    /**
     * @param model Model configuration for the harness. See `model` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def model(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.builder
      builder.model(args(argsBuilder).build)

    /**
     * @param skills Skill configurations. See `skill` below.
     * @return builder
     */
    def skills(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSkillArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSkillArgs.builder
      builder.skills(args.map(_(argsBuilder).build)*)

    /**
     * @param systemPrompts System prompt blocks for the harness. See `systemPrompt` below.
     * @return builder
     */
    def systemPrompts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSystemPromptArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSystemPromptArgs.builder
      builder.systemPrompts(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param tools Tool configurations. See `tool` below.
     * @return builder
     */
    def tools(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolArgs.builder
      builder.tools(args.map(_(argsBuilder).build)*)

    /**
     * @param truncations Truncation configuration for conversation history. See `truncation` below.
     * @return builder
     */
    def truncations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreHarnessArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationArgs.builder
      builder.truncations(args.map(_(argsBuilder).build)*)

  /** Manages an AWS Bedrock AgentCore Memory. Memory provides persistent storage for AI agent interactions, allowing agents to retain context across conversations and sessions. */
  def AgentcoreMemory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreMemoryArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreMemory(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder)
    /**
     * @param indexedKeys Metadata keys to index for filtering. Up to 10 entries. Changing this forces a new resource to be created. See `indexedKey` below.
     * @return builder
     */
    def indexedKeys(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryIndexedKeyArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryIndexedKeyArgs.builder
      builder.indexedKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param streamDeliveryResources Configuration for streaming memory record data to external resources. See `streamDeliveryResources` below.
     * @return builder
     */
    def streamDeliveryResources(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesArgs.builder
      builder.streamDeliveryResources(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreMemoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an AWS Bedrock AgentCore Memory Strategy. Memory strategies define how the agent processes and organizes information within a memory, such as semantic understanding, summarization, or custom processing logic.
   * 
   * **Important Limitations:**
   * 
   * - Each memory can have a maximum of 6 strategies total
   * - Only one strategy of each built-in type (`SEMANTIC`, `SUMMARIZATION`, `USER_PREFERENCE`, `EPISODIC`) can exist per memory
   * - Multiple `CUSTOM` strategies are allowed (subject to the total limit of 6)
   */
  def AgentcoreMemoryStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcoreMemoryStrategy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Manages an AWS Bedrock AgentCore OAuth2 Credential Provider. OAuth2 credential providers enable secure authentication with external OAuth2/OpenID Connect identity providers for agent runtimes.
   * 
   * &gt; **Note:** Write-Only arguments `clientIdWo` and `clientSecretWo` are available to use in place of `clientId` and `clientSecret`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def AgentcoreOauth2CredentialProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProvider(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.Builder)
    /**
     * @param oauth2ProviderConfig OAuth2 provider configuration. Must contain exactly one provider type. See `oauth2ProviderConfig` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def oauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreOauth2CredentialProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.builder
      builder.oauth2ProviderConfig(args(argsBuilder).build)

  /**
   * Manages an AWS Bedrock AgentCore Online Evaluation Configuration. Online evaluation configurations continuously monitor agent performance by sampling live traffic from CloudWatch logs and applying evaluators to assess agent quality in production.
   * 
   * &gt; **Note:** CloudWatch Transaction Serach must be [enabled](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Enable-TransactionSearch.html) before using this resource.
   */
  def AgentcoreOnlineEvaluationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfig(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.Builder)
    /**
     * @param dataSourceConfig Data source configuration specifying where to read agent traces. See `dataSourceConfig` Block below.
     * @return builder
     */
    def dataSourceConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigArgs.builder
      builder.dataSourceConfig(args(argsBuilder).build)

    /**
     * @param evaluators List of evaluators to apply during online evaluation. Minimum 1, maximum 10. See `evaluator` Block below.
     * @return builder
     */
    def evaluators(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigEvaluatorArgs.Builder]*):
        com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigEvaluatorArgs.builder
      builder.evaluators(args.map(_(argsBuilder).build)*)

    /**
     * @param rule Evaluation rule defining sampling configuration, filters, and session detection settings. See `rule` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreOnlineEvaluationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Policy. A Policy attaches Cedar authorization rules to a Policy Engine, which evaluates them at runtime to control agent access to resources. */
  def AgentcorePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcorePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcorePolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcorePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcorePolicyArgs.Builder)
    /**
     * @param definition Policy definition. See `definition` Block for details.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcorePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcorePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Policy Engine. A Policy Engine controls what actions and resources an agent runtime can use. */
  def AgentcorePolicyEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcorePolicyEngineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcorePolicyEngineArgs.builder
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
    com.pulumi.aws.bedrock.AgentcorePolicyEngine(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcorePolicyEngineArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyEngineTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcorePolicyEngineArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyEngineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an AWS Bedrock Agent Core Resource Policy. Resource-based policies in Amazon Bedrock Agent Core allow you to control which principals (AWS accounts, IAM users, or IAM roles) can invoke and manage your Amazon Bedrock Agent Core Runtime and Gateway resources. */
  def AgentcoreResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentcoreResourcePolicyArgs.builder
    com.pulumi.aws.bedrock.AgentcoreResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages the AWS KMS customer master key (CMK) for a token vault.
   * 
   * &gt; Deletion of this resource will not modify the CMK, only remove the resource from state.
   */
  def AgentcoreTokenVaultCmk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.builder
    com.pulumi.aws.bedrock.AgentcoreTokenVaultCmk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder)
    /**
     * @param kmsConfiguration KMS configuration for the token vault. See `kmsConfiguration` below.
     * @return builder
     */
    def kmsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.builder
      builder.kmsConfiguration(args(argsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Workload Identity. Workload Identity provides OAuth2-based authentication and authorization for AI agents to access external resources securely. */
  def AgentcoreWorkloadIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreWorkloadIdentityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreWorkloadIdentityArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcoreWorkloadIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object BedrockFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Amazon BedrockAgent Agent Versions. */
    inline def getAgentAgentVersions(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetAgentAgentVersionsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getAgentAgentVersions(args(argsBuilder).build)

    /** Data source for managing an AWS Amazon BedrockAgent Agent Versions. */
    inline def getAgentAgentVersionsPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetAgentAgentVersionsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getAgentAgentVersionsPlain(args(argsBuilder).build)

    /** Returns properties of a specific Amazon Bedrock custom model. */
    inline def getCustomModel(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetCustomModelResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModel(args(argsBuilder).build)

    /** Returns properties of a specific Amazon Bedrock custom model. */
    inline def getCustomModelPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetCustomModelResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModelPlain(args(argsBuilder).build)

    /** Returns a list of Amazon Bedrock custom models. */
    inline def getCustomModels(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetCustomModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelsArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModels(args(argsBuilder).build)

    /** Returns a list of Amazon Bedrock custom models. */
    inline def getCustomModelsPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetCustomModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelsPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModelsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Bedrock Inference Profile. */
    inline def getInferenceProfile(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetInferenceProfileResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfileArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfile(args(argsBuilder).build)

    /** Data source for managing an AWS Bedrock Inference Profile. */
    inline def getInferenceProfilePlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetInferenceProfileResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilePlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfilePlain(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Inference Profiles. */
    inline def getInferenceProfiles(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetInferenceProfilesResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilesArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfiles(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Inference Profiles. */
    inline def getInferenceProfilesPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetInferenceProfilesResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilesPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfilesPlain(args(argsBuilder).build)

  /**
   * Manages an Amazon Bedrock custom model.
   * Model customization is the process of providing training data to a base model in order to improve its performance for specific use-cases.
   * 
   * This Terraform resource interacts with two Amazon Bedrock entities:
   * 
   * 1. A Continued Pre-training or Fine-tuning job which is started when the Terraform resource is created. The customization job can take several hours to run to completion. The duration of the job depends on the size of the training data (number of records, input tokens, and output tokens), and [hyperparameters](https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models-hp.html) (number of epochs, and batch size).
   * 2. The custom model output on successful completion of the customization job.
   * 
   * This resource&#39;s behaviors correspond to operations on these Amazon Bedrock entities:
   * 
   * * _Create_ starts the customization job and immediately returns.
   * * _Read_ returns the status and results of the customization job. If the customization job has completed, the output model&#39;s properties are returned.
   * * _Update_ updates the customization job&#39;s [tags](https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html).
   * * _Delete_ stops the customization job if it is still active. If the customization job has completed, the custom model output by the job is deleted.
   */
  def CustomModel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.CustomModelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.CustomModelArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.CustomModel(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an Amazon Bedrock Guardrail. */
  def Guardrail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.GuardrailArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.GuardrailArgs.builder
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
    com.pulumi.aws.bedrock.Guardrail(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS Bedrock Guardrail Version. */
  def GuardrailVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.GuardrailVersionArgs.builder
    com.pulumi.aws.bedrock.GuardrailVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS Bedrock Inference Profile. */
  def InferenceProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.InferenceProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.InferenceProfileArgs.builder
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
    com.pulumi.aws.bedrock.InferenceProfile(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.InferenceProfileArgs.Builder)
    /**
     * @param modelSource The source of the model this inference profile will track metrics and cost for. See `modelSource`.
     * 
     * The following arguments are optional:
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

  /** Manages [Provisioned Throughput](https://docs.aws.amazon.com/bedrock/latest/userguide/prov-throughput.html) for an Amazon Bedrock model. */
  def ProvisionedModelThroughput(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.ProvisionedModelThroughput(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.ProvisionedModelThroughputArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.Builder)
    /**
     * @param s3 Details about the S3 object containing the OpenAPI schema for the action group. See `s3` Block for details.
     * Only one of `s3` or `payload` can be specified.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupApiSchemaS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.Builder)
    /**
     * @param memberFunctions Contains a list of functions.
     * Each function describes and action in the action group.
     * See `memberFunctions` Block for details.
     * @return builder
     */
    def memberFunctions(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.builder
      builder.memberFunctions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.Builder)
    /**
     * @param functions Functions that each define an action in the action group. See `functions` Block for details.
     * @return builder
     */
    def functions(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.builder
      builder.functions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.Builder)
    /**
     * @param parameters Parameters that the agent elicits from the user to fulfill the function. See `parameters` Block for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionParameterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupFunctionSchemaMemberFunctionsFunctionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentActionGroupState.Builder)
    /**
     * @param actionGroupExecutor ARN of the Lambda function containing the business logic that is carried out upon invoking the action or custom control method for handling the information elicited from the user. See `actionGroupExecutor` Block for details.
     * 
     * The following arguments are optional:
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
     * Each function represents an action in an action group.
     * See `functionSchema` Block for details.
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorState.Builder)
    def agentDescriptor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorAgentDescriptorArgs.builder
      builder.agentDescriptor(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentCollaboratorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationArgs.Builder)
    /**
     * @param sessionSummaryConfigurations Configuration block for `SESSION_SUMMARY` memory type enabled for the agent. See `sessionSummaryConfiguration` Block for details.
     * @return builder
     */
    def sessionSummaryConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationSessionSummaryConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentMemoryConfigurationSessionSummaryConfigurationArgs.builder
      builder.sessionSummaryConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.Builder)
    /**
     * @param promptConfigurations Configurations to override a prompt template in one part of an agent sequence. See `promptConfigurations` Block for details.
     * @return builder
     */
    def promptConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.builder
      builder.promptConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.Builder)
    /**
     * @param inferenceConfigurations Inference parameters to use when the agent invokes a foundation model in the part of the agent sequence defined by the `promptType`. For more information, see [Inference parameters for foundation models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html). See `inferenceConfiguration` Block for details.
     * @return builder
     */
    def inferenceConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationInferenceConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentAgentPromptOverrideConfigurationPromptConfigurationInferenceConfigurationArgs.builder
      builder.inferenceConfigurations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param filterConfiguration The Salesforce standard object configuration. See `filterConfiguration` block for details.
     * @return builder
     */
    def filterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.builder
      builder.filterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder)
    /**
     * @param patternObjectFilters The configuration of filtering certain objects or content types of the data source. See `patternObjectFilter` block for details.
     * @return builder
     */
    def patternObjectFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.builder
      builder.patternObjectFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder)
    /**
     * @param filters The configuration of specific filters applied to your data source content. Minimum of 1 filter and maximum of 25 filters.
     * 
     * Each filter object should contain the following configuration:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationConfluenceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param filterConfiguration The Salesforce standard object configuration. See `filterConfiguration` block for details.
     * @return builder
     */
    def filterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.builder
      builder.filterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder)
    /**
     * @param patternObjectFilters The configuration of filtering certain objects or content types of the data source. See `patternObjectFilter` block for details.
     * @return builder
     */
    def patternObjectFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.builder
      builder.patternObjectFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder)
    /**
     * @param filters The configuration of specific filters applied to your data source content. Minimum of 1 filter and maximum of 25 filters.
     * 
     * Each filter object should contain the following configuration:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSalesforceConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param filterConfiguration The Salesforce standard object configuration. See `filterConfiguration` block for details.
     * @return builder
     */
    def filterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.builder
      builder.filterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder)
    /**
     * @param patternObjectFilters The configuration of filtering certain objects or content types of the data source. See `patternObjectFilter` block for details.
     * @return builder
     */
    def patternObjectFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.builder
      builder.patternObjectFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder)
    /**
     * @param filters The configuration of specific filters applied to your data source content. Minimum of 1 filter and maximum of 25 filters.
     * 
     * Each filter object should contain the following configuration:
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationSharePointConfigurationCrawlerConfigurationFilterConfigurationPatternObjectFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder)
    def crawlerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.builder
      builder.crawlerConfiguration(args(argsBuilder).build)

    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.Builder)
    /**
     * @param crawlerLimits Configuration of crawl limits for the web URLs. See `crawlerLimits` block for details.
     * @return builder
     */
    def crawlerLimits(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationCrawlerLimitsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationCrawlerConfigurationCrawlerLimitsArgs.builder
      builder.crawlerLimits(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.Builder)
    /**
     * @param urlConfiguration The URL configuration of your web data source. See `urlConfiguration` block for details.
     * @return builder
     */
    def urlConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.builder
      builder.urlConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.Builder)
    /**
     * @param seedUrls List of one or more seed URLs to crawl. See `seedUrls` block for details.
     * @return builder
     */
    def seedUrls(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationSeedUrlArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationWebConfigurationSourceConfigurationUrlConfigurationSeedUrlArgs.builder
      builder.seedUrls(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationArgs.Builder)
    /**
     * @param levelConfigurations Maximum number of tokens to include in a chunk. Must contain two `levelConfigurations`. See `levelConfigurations` for details.
     * @return builder
     */
    def levelConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationLevelConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationHierarchicalChunkingConfigurationLevelConfigurationArgs.builder
      builder.levelConfigurations(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageArgs.Builder)
    /**
     * @param s3Location Configuration block for intermedia S3 storage.
     * @return builder
     */
    def s3Location(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageS3LocationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationIntermediateStorageS3LocationArgs.builder
      builder.s3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationArgs.Builder)
    /**
     * @param transformationFunction The lambda function that processes documents.
     * @return builder
     */
    def transformationFunction(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.builder
      builder.transformationFunction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.Builder)
    /**
     * @param transformationLambdaConfiguration The configuration of the lambda function.
     * @return builder
     */
    def transformationLambdaConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionTransformationLambdaConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationCustomTransformationConfigurationTransformationTransformationFunctionTransformationLambdaConfigurationArgs.builder
      builder.transformationLambdaConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.Builder)
    /**
     * @param bedrockDataAutomationConfiguration Settings for using Amazon Bedrock Data Automation to parse documents. See `bedrockDataAutomationConfiguration` block for details.
     * @return builder
     */
    def bedrockDataAutomationConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockDataAutomationConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockDataAutomationConfigurationArgs.builder
      builder.bedrockDataAutomationConfiguration(args(argsBuilder).build)

    /**
     * @param bedrockFoundationModelConfiguration Settings for a foundation model used to parse documents in a data source. See `bedrockFoundationModelConfiguration` block for details.
     * @return builder
     */
    def bedrockFoundationModelConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.builder
      builder.bedrockFoundationModelConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.Builder)
    /**
     * @param parsingPrompt Instructions for interpreting the contents of the document. See `parsingPrompt` block for details.
     * @return builder
     */
    def parsingPrompt(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationParsingPromptArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationParsingConfigurationBedrockFoundationModelConfigurationParsingPromptArgs.builder
      builder.parsingPrompt(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionArgs.Builder)
    /**
     * @param configuration Configuration of the connection. See Connection Configuration for more information.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionConnectionConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

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

    /**
     * @param condition Contains configurations for a Condition node in your flow. Defines conditions that lead to different branches of the flow. See Condition Node Configuration for more information.
     * @return builder
     */
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

    /**
     * @param input Contains configurations for an input flow node in your flow. The node `inputs` can\u2019t be specified for this node. This block has no fields.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationInputArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param iterator Contains configurations for an iterator node in your flow. Takes an input that is an array and iteratively sends each item of the array as an output to the following node. The size of the array is also returned in the output. The output flow node at the end of the flow iteration will return a response for each member of the array. To return only one response, you can include a collector node downstream from the iterator node. This block has no fields.
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

    /**
     * @param output Contains configurations for an output flow node in your flow. The node `outputs` can\u2019t be specified for this node. This block has no fields.
     * @return builder
     */
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionArgs.Builder)
    /**
     * @param conditions A list of conditions. See Condition Config for more information.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionConditionArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationConditionConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder)
    /**
     * @param guardrailConfiguration Configures a guardrail for knowledge base query and response generation. See Guardrail Configuration for more information.
     * @return builder
     */
    def guardrailConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseGuardrailConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseGuardrailConfigurationArgs.builder
      builder.guardrailConfiguration(args(argsBuilder).build)

    /**
     * @param inferenceConfiguration Configures model inference for knowledge base query and response generation. See Inference Configuration for more information.
     * @return builder
     */
    def inferenceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.builder
      builder.inferenceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.Builder)
    /**
     * @param text Contains inference configurations for a text prompt. See Text Inference Configuration for more information.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationKnowledgeBaseInferenceConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder)
    /**
     * @param guardrailConfiguration Configures a guardrail for prompt generation. See Guardrail Configuration for more information.
     * @return builder
     */
    def guardrailConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptGuardrailConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptGuardrailConfigurationArgs.builder
      builder.guardrailConfiguration(args(argsBuilder).build)

    /**
     * @param sourceConfiguration Configures the prompt source, either inline or from Prompt management. See Source Configuration for more information.
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineArgs.Builder)
    /**
     * @param inferenceConfiguration Contains inference configurations for the prompt. See Inference Configuration for more information.
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationArgs.Builder)
    /**
     * @param text Contains inference configurations for a text prompt. See Text Inference Configuration for more information.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineInferenceConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder)
    /**
     * @param chat Contains configurations to use the prompt in a conversational format. See Chat Template Configuration for more information.
     * @return builder
     */
    def chat(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatArgs.builder
      builder.chat(args(argsBuilder).build)

    /**
     * @param text Contains configurations for the text in a message for a prompt. See Text Template Configuration for more information.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageArgs.Builder)
    /**
     * @param content Contains the content for the message you pass to, or receive from a model. See Message Content for more information.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a message. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatMessageContentCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a tool designation. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatSystemCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder)
    /**
     * @param any Defines tools, at least one of which must be requested by the model. No text is generated but the results of tool use are sent back to the model to help generate a response. This block has no fields.
     * @return builder
     */
    def any(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceAnyArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolChoiceAnyArgs.builder
      builder.any(args(argsBuilder).build)

    /**
     * @param auto Defines tools. The model automatically decides whether to call a tool or to generate text instead. This block has no fields.
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder)
    /**
     * @param inputSchema The input schema of the tool. See Tool Input Schema for more information.
     * @return builder
     */
    def inputSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.builder
      builder.inputSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder)
    /**
     * @param cachePoint A cache checkpoint within a template configuration. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

    /**
     * @param inputVariables A list of variables in the prompt template. See Input Variable for more information.
     * @return builder
     */
    def inputVariables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextInputVariableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationPromptSourceConfigurationInlineTemplateConfigurationTextInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalArgs.Builder)
    /**
     * @param serviceConfiguration Contains configurations for the service to use for retrieving data to return as the output from the node. See Retrieval Service Configuration for more information.
     * @return builder
     */
    def serviceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.builder
      builder.serviceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.Builder)
    /**
     * @param s3 Contains configurations for the service to use for storing the input into the node. See Storage S3 Service Configuration for more information.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationRetrievalServiceConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageArgs.Builder)
    /**
     * @param serviceConfiguration Contains configurations for a Storage node in your flow. Stores an input in an Amazon S3 location. See Storage Service Configuration for more information.
     * @return builder
     */
    def serviceConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.builder
      builder.serviceConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.Builder)
    /**
     * @param s3 Contains configurations for the service to use for storing the input into the node. See Storage S3 Service Configuration for more information.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentFlowDefinitionNodeConfigurationStorageServiceConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder)
    /**
     * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base. See `kendraKnowledgeBaseConfiguration` block for details.
     * @return builder
     */
    def kendraKnowledgeBaseConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationKendraKnowledgeBaseConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationKendraKnowledgeBaseConfigurationArgs.builder
      builder.kendraKnowledgeBaseConfiguration(args(argsBuilder).build)

    /**
     * @param sqlKnowledgeBaseConfiguration Configurations for a knowledge base connected to an SQL database. See `sqlKnowledgeBaseConfiguration` block for details.
     * @return builder
     */
    def sqlKnowledgeBaseConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationArgs.builder
      builder.sqlKnowledgeBaseConfiguration(args(argsBuilder).build)

    /**
     * @param vectorKnowledgeBaseConfiguration Details about the model that&#39;s used to convert the data source into vector embeddings. See `vectorKnowledgeBaseConfiguration` block for details.
     * @return builder
     */
    def vectorKnowledgeBaseConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs.builder
      builder.vectorKnowledgeBaseConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationArgs.Builder)
    /**
     * @param redshiftConfiguration Configurations for a knowledge base connected to an Amazon Redshift database. See `redshiftConfiguration` block for details.
     * @return builder
     */
    def redshiftConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationArgs.builder
      builder.redshiftConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationArgs.Builder)
    /**
     * @param queryEngineConfiguration Configurations for an Amazon Redshift query engine. See `queryEngineConfiguration` block for details.
     * @return builder
     */
    def queryEngineConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationArgs.builder
      builder.queryEngineConfiguration(args(argsBuilder).build)

    /**
     * @param queryGenerationConfiguration Configurations for generating queries. See `queryGenerationConfiguration` block for details.
     * @return builder
     */
    def queryGenerationConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationArgs.builder
      builder.queryGenerationConfiguration(args(argsBuilder).build)

    /**
     * @param storageConfiguration Configurations for Amazon Redshift database storage. See `storageConfiguration` block for details.
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationArgs.Builder)
    /**
     * @param provisionedConfiguration Configurations for a provisioned Amazon Redshift query engine. See `provisionedConfiguration` block for details.
     * @return builder
     */
    def provisionedConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationProvisionedConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationProvisionedConfigurationArgs.builder
      builder.provisionedConfiguration(args(argsBuilder).build)

    /**
     * @param serverlessConfiguration Configurations for a serverless Amazon Redshift query engine. See `serverlessConfiguration` block for details.
     * @return builder
     */
    def serverlessConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationServerlessConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationServerlessConfigurationArgs.builder
      builder.serverlessConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationProvisionedConfigurationArgs.Builder)
    /**
     * @param authConfiguration Configurations for authentication to Amazon Redshift. See `authConfiguration` block for details.
     * @return builder
     */
    def authConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationProvisionedConfigurationAuthConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationProvisionedConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationProvisionedConfigurationAuthConfigurationArgs.builder
      builder.authConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationServerlessConfigurationArgs.Builder)
    /**
     * @param authConfiguration Configurations for authentication to a Redshift Serverless. See `authConfiguration` block for details.
     * @return builder
     */
    def authConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationServerlessConfigurationAuthConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationServerlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryEngineConfigurationServerlessConfigurationAuthConfigurationArgs.builder
      builder.authConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationArgs.Builder)
    /**
     * @param generationContext Configurations for context to use during query generation. See `generationContext` block for details.
     * @return builder
     */
    def generationContext(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextArgs.builder
      builder.generationContext(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextArgs.Builder)
    /**
     * @param curatedQueries Information about example queries to help the query engine generate appropriate SQL queries. See `curatedQuery` block for details.
     * @return builder
     */
    def curatedQueries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextCuratedQueryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextCuratedQueryArgs.builder
      builder.curatedQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param tables Information about a table in the database. See `table` block for details.
     * @return builder
     */
    def tables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextTableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextTableArgs.builder
      builder.tables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextTableArgs.Builder)
    /**
     * @param columns Information about a column in the table. See `column` block for details.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextTableColumnArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextTableArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationQueryGenerationConfigurationGenerationContextTableColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationArgs.Builder)
    /**
     * @param awsDataCatalogConfiguration Configurations for storage in AWS Glue Data Catalog. See `awsDataCatalogConfiguration` block for details.
     * @return builder
     */
    def awsDataCatalogConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationAwsDataCatalogConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationAwsDataCatalogConfigurationArgs.builder
      builder.awsDataCatalogConfiguration(args(argsBuilder).build)

    /**
     * @param redshiftConfiguration Configurations for storage in Amazon Redshift. See `redshiftConfiguration` block for details.
     * @return builder
     */
    def redshiftConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationRedshiftConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationSqlKnowledgeBaseConfigurationRedshiftConfigurationStorageConfigurationRedshiftConfigurationArgs.builder
      builder.redshiftConfiguration(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationArgs.Builder)
    /**
     * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock embeddings model.  See `bedrockEmbeddingModelConfiguration` block for details.
     * @return builder
     */
    def bedrockEmbeddingModelConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationBedrockEmbeddingModelConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationEmbeddingModelConfigurationBedrockEmbeddingModelConfigurationArgs.builder
      builder.bedrockEmbeddingModelConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationArgs.Builder)
    /**
     * @param storageLocations A storage location specification for images extracted from multimodal documents in your data source.  See `storageLocation` block for details.
     * @return builder
     */
    def storageLocations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.builder
      builder.storageLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.Builder)
    /**
     * @param s3Location Contains information about the Amazon S3 location for the extracted images.  See `s3Location` block for details.
     * @return builder
     */
    def s3Location(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationS3LocationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationSupplementalDataStorageConfigurationStorageLocationS3LocationArgs.builder
      builder.s3Location(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder)
    /**
     * @param mongoDbAtlasConfiguration The storage configuration of the knowledge base in MongoDB Atlas. See `mongoDbAtlasConfiguration` block for details.
     * @return builder
     */
    def mongoDbAtlasConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationMongoDbAtlasConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationMongoDbAtlasConfigurationArgs.builder
      builder.mongoDbAtlasConfiguration(args(argsBuilder).build)

    /**
     * @param neptuneAnalyticsConfiguration The storage configuration of the knowledge base in Amazon Neptune Analytics. See `neptuneAnalyticsConfiguration` block for details.
     * @return builder
     */
    def neptuneAnalyticsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationNeptuneAnalyticsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationNeptuneAnalyticsConfigurationArgs.builder
      builder.neptuneAnalyticsConfiguration(args(argsBuilder).build)

    /**
     * @param opensearchManagedClusterConfiguration The storage configuration of the knowledge base in Amazon OpenSearch Service Managed Cluster. See `opensearchManagedClusterConfiguration` block for details.
     * @return builder
     */
    def opensearchManagedClusterConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchManagedClusterConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchManagedClusterConfigurationArgs.builder
      builder.opensearchManagedClusterConfiguration(args(argsBuilder).build)

    /**
     * @param opensearchServerlessConfiguration The storage configuration of the knowledge base in Amazon OpenSearch Service Serverless. See `opensearchServerlessConfiguration` block for details.
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

    /**
     * @param s3VectorsConfiguration The storage configuration of the knowledge base in Amazon S3 Vectors. See `s3VectorsConfiguration` block for details.
     * @return builder
     */
    def s3VectorsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationS3VectorsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationS3VectorsConfigurationArgs.builder
      builder.s3VectorsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationMongoDbAtlasConfigurationArgs.Builder)
    /**
     * @param fieldMapping Contains the names of the fields to which to map information about the vector store.
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationMongoDbAtlasConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationMongoDbAtlasConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationMongoDbAtlasConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationNeptuneAnalyticsConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationNeptuneAnalyticsConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationNeptuneAnalyticsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationNeptuneAnalyticsConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchManagedClusterConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchManagedClusterConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchManagedClusterConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchManagedClusterConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationOpensearchServerlessConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationPineconeConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationArgs.Builder)
    /**
     * @param fieldMapping Names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRdsConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs.Builder)
    /**
     * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * @return builder
     */
    def fieldMapping(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs.builder
      builder.fieldMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptState.Builder)
    /**
     * @param variants A list of objects, each containing details about a variant of the prompt. See Variant for more information.
     * @return builder
     */
    def variants(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantArgs.builder
      builder.variants(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceArgs.Builder)
    /**
     * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. See Agent Configuration for more information.
     * @return builder
     */
    def agent(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceAgentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantGenAiResourceAgentArgs.builder
      builder.agent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationArgs.Builder)
    /**
     * @param text Contains inference configurations for the prompt variant. See Text Inference Configuration for more information.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationTextArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantInferenceConfigurationTextArgs.builder
      builder.text(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageArgs.Builder)
    /**
     * @param content Contains the content for the message you pass to, or receive from a model. See [Message Content] for more information.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.Builder)
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatMessageContentCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemArgs.Builder)
    /**
     * @param cachePoint Creates a cache checkpoint within a tool designation. See Cache Point for more information.
     * @return builder
     */
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatSystemCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder)
    /**
     * @param inputSchema The input schema of the tool. See Tool Input Schema for more information.
     * @return builder
     */
    def inputSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationChatToolConfigurationToolToolSpecInputSchemaArgs.builder
      builder.inputSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder)
    def cachePoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextCachePointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextCachePointArgs.builder
      builder.cachePoint(args(argsBuilder).build)

    def inputVariables(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextInputVariableArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentPromptVariantTemplateConfigurationTextInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder)
    /**
     * @param codeConfiguration Code configuration block for the agent runtime artifact, including the source code location and execution settings. Exactly one of `codeConfiguration` or `containerConfiguration` must be specified. See `codeConfiguration` below.
     * @return builder
     */
    def codeConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationArgs.builder
      builder.codeConfiguration(args(argsBuilder).build)

    /**
     * @param containerConfiguration Container configuration block for the agent artifact. Exactly one of `codeConfiguration` or `containerConfiguration` must be specified. See `containerConfiguration` below.
     * @return builder
     */
    def containerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactContainerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationArgs.Builder)
    /**
     * @param code Configuration block for the source code location and configuration details. See `code` below.
     * @return builder
     */
    def code(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationCodeArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationCodeArgs.builder
      builder.code(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationCodeArgs.Builder)
    /**
     * @param s3 Configuration block for the Amazon S3 object that contains the source code for the agent runtime. See `s3` below.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationCodeS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationCodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAgentRuntimeArtifactCodeConfigurationCodeS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.Builder)
    /**
     * @param customJwtAuthorizer JWT-based authorization configuration block. See `customJwtAuthorizer` below.
     * @return builder
     */
    def customJwtAuthorizer(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerArgs.builder
      builder.customJwtAuthorizer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder)
    /**
     * @param customClaims Repeatable block to define a custom claim validation name, value, and operation. See `customClaim` below.
     * @return builder
     */
    def customClaims(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.builder
      builder.customClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder)
    /**
     * @param authorizingClaimMatchValue Configuration block to define the value or values to match for and the relationship of the match. See `authorizingClaimMatchValue` below.
     * @return builder
     */
    def authorizingClaimMatchValue(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.builder
      builder.authorizingClaimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder)
    /**
     * @param claimMatchValue Value or values to match for. See `claimMatchValue` below.
     * @return builder
     */
    def claimMatchValue(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.builder
      builder.claimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.Builder)
    /**
     * @param efsAccessPoint Amazon EFS access point to mount as shared file storage. Exactly one of `sessionStorage`, `s3FilesAccessPoint`, or `efsAccessPoint` must be specified. See `efsAccessPoint` below.
     * @return builder
     */
    def efsAccessPoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationEfsAccessPointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationEfsAccessPointArgs.builder
      builder.efsAccessPoint(args(argsBuilder).build)

    /**
     * @param s3FilesAccessPoint Amazon S3 Files access point to mount as shared file storage. Exactly one of `sessionStorage`, `s3FilesAccessPoint`, or `efsAccessPoint` must be specified. See `s3FilesAccessPoint` below.
     * @return builder
     */
    def s3FilesAccessPoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationS3FilesAccessPointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationS3FilesAccessPointArgs.builder
      builder.s3FilesAccessPoint(args(argsBuilder).build)

    /**
     * @param sessionStorage Session storage filesystem providing persistent storage across agent runtime session invocations. Exactly one of `sessionStorage`, `s3FilesAccessPoint`, or `efsAccessPoint` must be specified. See `sessionStorage` below.
     * @return builder
     */
    def sessionStorage(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationSessionStorageArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationSessionStorageArgs.builder
      builder.sessionStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.Builder)
    /**
     * @param networkModeConfig Network mode configuration. See `networkModeConfig` below.
     * @return builder
     */
    def networkModeConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationNetworkModeConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeNetworkConfigurationNetworkModeConfigArgs.builder
      builder.networkModeConfig(args(argsBuilder).build)

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
     * @param filesystemConfigurations List of filesystems to mount into the agent runtime. Up to 5 entries are supported. Each entry is one of session storage, Amazon S3 Files access point, or Amazon EFS access point. See `filesystemConfiguration` below.
     * @return builder
     */
    def filesystemConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreAgentRuntimeFilesystemConfigurationArgs.builder
      builder.filesystemConfigurations(args.map(_(argsBuilder).build)*)

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
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderState.Builder)
    /**
     * @param apiKeySecretArns ARN of the AWS Secrets Manager secret containing the API key.
     * @return builder
     */
    def apiKeySecretArns(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderApiKeySecretArnArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreApiKeyCredentialProviderApiKeySecretArnArgs.builder
      builder.apiKeySecretArns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.Builder)
    /**
     * @param vpcConfig VPC configuration when `networkMode` is `VPC`. See `vpcConfig` below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserNetworkConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.Builder)
    /**
     * @param s3Location S3 location where browser session recordings are stored. See `s3Location` below.
     * @return builder
     */
    def s3Location(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingS3LocationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreBrowserRecordingS3LocationArgs.builder
      builder.s3Location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreBrowserState.Builder)
    /**
     * @param networkConfiguration Network configuration for the browser. See `networkConfiguration` below.
     * 
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.Builder)
    /**
     * @param vpcConfig VPC configuration. See `vpcConfig` below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationVpcConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterNetworkConfigurationVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreCodeInterpreterState.Builder)
    /**
     * @param networkConfiguration Network configuration for the code interpreter. See `networkConfiguration` below.
     * 
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.Builder)
    /**
     * @param codeBased Configuration that runs a Lambda function you provide to score the agent. See `codeBased` below.
     * @return builder
     */
    def codeBased(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigCodeBasedArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigCodeBasedArgs.builder
      builder.codeBased(args(argsBuilder).build)

    /**
     * @param llmAsAJudge Configuration that uses a Bedrock model to score the agent. See `llmAsAJudge` below.
     * @return builder
     */
    def llmAsAJudge(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeArgs.builder
      builder.llmAsAJudge(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigCodeBasedArgs.Builder)
    /**
     * @param lambdaConfig Lambda function configuration. See `lambdaConfig` below.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigCodeBasedLambdaConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigCodeBasedArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigCodeBasedLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeArgs.Builder)
    /**
     * @param modelConfig Which Bedrock model to use. See `modelConfig` below.
     * @return builder
     */
    def modelConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigArgs.builder
      builder.modelConfig(args(argsBuilder).build)

    /**
     * @param ratingScale Scale used to score the agent. See `ratingScale` below.
     * @return builder
     */
    def ratingScale(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleArgs.builder
      builder.ratingScale(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigArgs.Builder)
    /**
     * @param bedrockEvaluatorModelConfig Amazon Bedrock model configuration. See `bedrockEvaluatorModelConfig` below.
     * @return builder
     */
    def bedrockEvaluatorModelConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigBedrockEvaluatorModelConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigBedrockEvaluatorModelConfigArgs.builder
      builder.bedrockEvaluatorModelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigBedrockEvaluatorModelConfigArgs.Builder)
    /**
     * @param inferenceConfig Settings that control how the model generates its response. See `inferenceConfig` below.
     * @return builder
     */
    def inferenceConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigBedrockEvaluatorModelConfigInferenceConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigBedrockEvaluatorModelConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeModelConfigBedrockEvaluatorModelConfigInferenceConfigArgs.builder
      builder.inferenceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleArgs.Builder)
    /**
     * @param categoricals One or more categorical rating scale definitions. See `categorical` below.
     * @return builder
     */
    def categoricals(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleCategoricalArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleCategoricalArgs.builder
      builder.categoricals(args.map(_(argsBuilder).build)*)

    /**
     * @param numericals One or more numerical rating scale definitions. See `numerical` below.
     * @return builder
     */
    def numericals(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleNumericalArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigLlmAsAJudgeRatingScaleNumericalArgs.builder
      builder.numericals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorState.Builder)
    /**
     * @param evaluatorConfig Configuration that defines how the evaluator assesses agent performance. See `evaluatorConfig` below.
     * @return builder
     */
    def evaluatorConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorEvaluatorConfigArgs.builder
      builder.evaluatorConfig(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreEvaluatorTimeoutsArgs.builder
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder)
    /**
     * @param customClaims Repeatable block to define a custom claim validation name, value, and operation. See `customClaim` below.
     * @return builder
     */
    def customClaims(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.builder
      builder.customClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder)
    /**
     * @param authorizingClaimMatchValue Configuration block to define the value or values to match for and the relationship of the match. See `authorizingClaimMatchValue` below.
     * @return builder
     */
    def authorizingClaimMatchValue(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.builder
      builder.authorizingClaimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder)
    /**
     * @param claimMatchValue Value or values to match for. See `claimMatchValue` below.
     * @return builder
     */
    def claimMatchValue(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.builder
      builder.claimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.Builder)
    /**
     * @param inputConfiguration Input configuration for the interceptor. See `inputConfiguration` below.
     * @return builder
     */
    def inputConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInputConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInputConfigurationArgs.builder
      builder.inputConfiguration(args(argsBuilder).build)

    /**
     * @param interceptor Interceptor infrastructure configuration. See `interceptor` below.
     * @return builder
     */
    def interceptor(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInterceptorArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInterceptorArgs.builder
      builder.interceptor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInterceptorArgs.Builder)
    /**
     * @param lambda Lambda function configuration for the interceptor. See `lambda` below.
     * @return builder
     */
    def lambda(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInterceptorLambdaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInterceptorArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationInterceptorLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.Builder)
    /**
     * @param mcp Model Context Protocol (MCP) configuration block. See `mcp` below.
     * @return builder
     */
    def mcp(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.Builder)
    /**
     * @param sessionConfiguration Configuration block for session settings of the MCP gateway. See `sessionConfiguration` below.
     * @return builder
     */
    def sessionConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpSessionConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpSessionConfigurationArgs.builder
      builder.sessionConfiguration(args(argsBuilder).build)

    /**
     * @param streamingConfiguration Configuration block for streaming settings of the MCP gateway. See `streamingConfiguration` below.
     * @return builder
     */
    def streamingConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpStreamingConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayProtocolConfigurationMcpStreamingConfigurationArgs.builder
      builder.streamingConfiguration(args(argsBuilder).build)

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
     * @param interceptorConfigurations List of interceptor configurations for the gateway. Minimum of 1, maximum of 2. See `interceptorConfiguration` below.
     * @return builder
     */
    def interceptorConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayInterceptorConfigurationArgs.builder
      builder.interceptorConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param policyEngineConfiguration Configuration for a policy engine associated with the gateway. A policy engine is a collection of policies that evaluates and authorizes agent tool calls. When associated with a gateway, the policy engine intercepts all agent requests and determines whether to allow or deny each action based on the defined policies. See `policyEngineConfiguration` below.
     * @return builder
     */
    def policyEngineConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayPolicyEngineConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayPolicyEngineConfigurationArgs.builder
      builder.policyEngineConfiguration(args(argsBuilder).build)

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
     * @param callerIamCredentials Caller IAM credentials-based authentication configuration. See `callerIamCredentials` below.
     * @return builder
     */
    def callerIamCredentials(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationCallerIamCredentialsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationCallerIamCredentialsArgs.builder
      builder.callerIamCredentials(args(argsBuilder).build)

    /**
     * @param gatewayIamRole Use the gateway&#39;s IAM role for authentication. See `gatewayIamRole` below.
     * @return builder
     */
    def gatewayIamRole(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationGatewayIamRoleArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationGatewayIamRoleArgs.builder
      builder.gatewayIamRole(args(argsBuilder).build)

    /**
     * @param jwtPassthrough JWT passthrough-based authentication configuration. This is an empty configuration block.
     * @return builder
     */
    def jwtPassthrough(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationJwtPassthroughArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationJwtPassthroughArgs.builder
      builder.jwtPassthrough(args(argsBuilder).build)

    /**
     * @param oauth OAuth-based authentication configuration. See `oauth` below.
     * @return builder
     */
    def oauth(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationOauthArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetCredentialProviderConfigurationOauthArgs.builder
      builder.oauth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.Builder)
    /**
     * @param managedVpcResource AWS creates and manages the VPC Lattice resource gateway and resource configuration on your behalf using a service-linked role. See `managedVpcResource` below.
     * @return builder
     */
    def managedVpcResource(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointManagedVpcResourceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointManagedVpcResourceArgs.builder
      builder.managedVpcResource(args(argsBuilder).build)

    /**
     * @param selfManagedLatticeResource Use an existing VPC Lattice resource configuration that you manage yourself. Useful for cross-account setups or advanced Lattice configurations. See `selfManagedLatticeResource` below.
     * @return builder
     */
    def selfManagedLatticeResource(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointSelfManagedLatticeResourceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointSelfManagedLatticeResourceArgs.builder
      builder.selfManagedLatticeResource(args(argsBuilder).build)

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
     * @param metadataConfiguration Configuration for HTTP header and query parameter propagation between the gateway and target servers. See `metadataConfiguration` below.
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    /**
     * @param privateEndpoint Configuration for private connectivity from AgentCore Gateway to a resource inside your VPC. Traffic is routed through Amazon VPC Lattice and never traverses the public internet. See `privateEndpoint` below.
     * @return builder
     */
    def privateEndpoint(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetPrivateEndpointArgs.builder
      builder.privateEndpoint(args(argsBuilder).build)

    /**
     * @param targetConfiguration Configuration for the target endpoint. See `targetConfiguration` below.
     * 
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder)
    /**
     * @param http HTTP target configuration for routing requests directly to an AgentCore Runtime agent. See `http` below.
     * @return builder
     */
    def http(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationHttpArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationHttpArgs.builder
      builder.http(args(argsBuilder).build)

    /**
     * @param mcp Model Context Protocol (MCP) configuration. See `mcp` below.
     * @return builder
     */
    def mcp(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationHttpArgs.Builder)
    /**
     * @param agentcoreRuntime AgentCore Runtime target configuration. See `agentcoreRuntime` below.
     * 
     * &gt; **Note:** HTTP targets can only be attached to gateways that do not have a `protocolType` set. They are not supported on MCP-protocol gateways.
     * @return builder
     */
    def agentcoreRuntime(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationHttpAgentcoreRuntimeArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationHttpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationHttpAgentcoreRuntimeArgs.builder
      builder.agentcoreRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationArgs.Builder)
    /**
     * @param toolFilters Repeatable block of path and method patterns to expose as tools. See `toolFilter` below.
     * @return builder
     */
    def toolFilters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationToolFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationToolFilterArgs.builder
      builder.toolFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param toolOverrides Repeatable block of explicit tool definitions with optional custom names and descriptions. See `toolOverride` below.
     * @return builder
     */
    def toolOverrides(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationToolOverrideArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationToolOverrideArgs.builder
      builder.toolOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayArgs.Builder)
    /**
     * @param apiGatewayToolConfiguration Configuration for API Gateway tools. See `apiGatewayToolConfiguration` below.
     * @return builder
     */
    def apiGatewayToolConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayApiGatewayToolConfigurationArgs.builder
      builder.apiGatewayToolConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder)
    /**
     * @param apiGateway API Gateway target configuration. See `apiGateway` below.
     * @return builder
     */
    def apiGateway(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpApiGatewayArgs.builder
      builder.apiGateway(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaArgs.Builder)
    /**
     * @param toolSchema Schema definition for the tool. See `toolSchema` below.
     * @return builder
     */
    def toolSchema(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaArgs.builder
      builder.toolSchema(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaItemsArgs.builder
      builder.items(args(argsBuilder).build)

    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadInputSchemaPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaItemsArgs.builder
      builder.items(args(argsBuilder).build)

    def properties(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpLambdaToolSchemaInlinePayloadOutputSchemaPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder)
    def inlinePayload(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaInlinePayloadArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaInlinePayloadArgs.builder
      builder.inlinePayload(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpOpenApiSchemaS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder)
    def inlinePayload(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelInlinePayloadArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelInlinePayloadArgs.builder
      builder.inlinePayload(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelS3Args.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreGatewayTargetTargetConfigurationMcpSmithyModelS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationArgs.Builder)
    /**
     * @param customJwtAuthorizer JWT-based authorization configuration block. See `customJwtAuthorizer` below.
     * @return builder
     */
    def customJwtAuthorizer(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerArgs.builder
      builder.customJwtAuthorizer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder)
    /**
     * @param customClaims Repeatable block to define a custom claim validation name, value, and operation. See `customClaim` below.
     * @return builder
     */
    def customClaims(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.builder
      builder.customClaims(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder)
    /**
     * @param authorizingClaimMatchValue Configuration block to define the value or values to match for and the relationship of the match. See `authorizingClaimMatchValue` below.
     * @return builder
     */
    def authorizingClaimMatchValue(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.builder
      builder.authorizingClaimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder)
    /**
     * @param claimMatchValue Value or values to match for. See `claimMatchValue` below.
     * @return builder
     */
    def claimMatchValue(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.builder
      builder.claimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentArgs.Builder)
    /**
     * @param filesystemConfigurations Filesystem configurations. See `filesystemConfiguration` below.
     * @return builder
     */
    def filesystemConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationArgs.builder
      builder.filesystemConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleConfigurations Lifecycle configuration. See `lifecycleConfiguration` below.
     * @return builder
     */
    def lifecycleConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentLifecycleConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentLifecycleConfigurationArgs.builder
      builder.lifecycleConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfigurations Network configuration. See `networkConfiguration` below.
     * @return builder
     */
    def networkConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentNetworkConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentNetworkConfigurationArgs.builder
      builder.networkConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationArgs.Builder)
    /**
     * @param efsAccessPoints Amazon EFS access point to mount as shared file storage. Exactly one of `sessionStorage`, `s3FilesAccessPoint`, or `efsAccessPoint` must be specified. See `efsAccessPoint` below.
     * @return builder
     */
    def efsAccessPoints(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationEfsAccessPointArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationEfsAccessPointArgs.builder
      builder.efsAccessPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param s3FilesAccessPoints Amazon S3 Files access point to mount as shared file storage. Exactly one of `sessionStorage`, `s3FilesAccessPoint`, or `efsAccessPoint` must be specified. See `s3FilesAccessPoint` below.
     * @return builder
     */
    def s3FilesAccessPoints(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationS3FilesAccessPointArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationS3FilesAccessPointArgs.builder
      builder.s3FilesAccessPoints(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionStorages Session storage filesystem providing persistent storage across agent runtime session invocations. Exactly one of `sessionStorage`, `s3FilesAccessPoint`, or `efsAccessPoint` must be specified. See `sessionStorage` below.
     * @return builder
     */
    def sessionStorages(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationSessionStorageArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentFilesystemConfigurationSessionStorageArgs.builder
      builder.sessionStorages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentNetworkConfigurationArgs.Builder)
    /**
     * @param networkModeConfigs VPC configuration. See `networkModeConfig` below.
     * @return builder
     */
    def networkModeConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentNetworkConfigurationNetworkModeConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentNetworkConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentNetworkConfigurationNetworkModeConfigArgs.builder
      builder.networkModeConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArgs.Builder)
    /**
     * @param agentcoreRuntimeEnvironments AgentCore runtime environment configuration. See `agentcoreRuntimeEnvironment` below.
     * @return builder
     */
    def agentcoreRuntimeEnvironments(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentAgentcoreRuntimeEnvironmentArgs.builder
      builder.agentcoreRuntimeEnvironments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactArgs.Builder)
    /**
     * @param containerConfiguration Container configuration. See `containerConfiguration` below.
     * @return builder
     */
    def containerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactContainerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryAgentcoreMemoryConfigurationArgs.Builder)
    /**
     * @param retrievalConfig Retrieval configuration parameters. See `retrievalConfig` below.
     * @return builder
     */
    def retrievalConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryAgentcoreMemoryConfigurationRetrievalConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryAgentcoreMemoryConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryAgentcoreMemoryConfigurationRetrievalConfigArgs.builder
      builder.retrievalConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryArgs.Builder)
    /**
     * @param agentcoreMemoryConfiguration AgentCore memory configuration. See `agentcoreMemoryConfiguration` below.
     * @return builder
     */
    def agentcoreMemoryConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryAgentcoreMemoryConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryAgentcoreMemoryConfigurationArgs.builder
      builder.agentcoreMemoryConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.Builder)
    /**
     * @param bedrockModelConfig Amazon Bedrock model configuration. See `bedrockModelConfig` below.
     * @return builder
     */
    def bedrockModelConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelBedrockModelConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelBedrockModelConfigArgs.builder
      builder.bedrockModelConfig(args(argsBuilder).build)

    /**
     * @param geminiModelConfig Gemini model configuration. See `geminiModelConfig` below.
     * @return builder
     */
    def geminiModelConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelGeminiModelConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelGeminiModelConfigArgs.builder
      builder.geminiModelConfig(args(argsBuilder).build)

    /**
     * @param openaiModelConfig OpenAI model configuration. See `openaiModelConfig` below.
     * @return builder
     */
    def openaiModelConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelOpenaiModelConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelOpenaiModelConfigArgs.builder
      builder.openaiModelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder)
    /**
     * @param authorizerConfiguration Authorization configuration for authenticating requests. See `authorizerConfiguration` below.
     * @return builder
     */
    def authorizerConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

    /**
     * @param environmentArtifact Environment artifact configuration. See `environmentArtifact` below.
     * @return builder
     */
    def environmentArtifact(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArtifactArgs.builder
      builder.environmentArtifact(args(argsBuilder).build)

    /**
     * @param environments Compute environment configuration. See `environment` below.
     * @return builder
     */
    def environments(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessEnvironmentArgs.builder
      builder.environments(args.map(_(argsBuilder).build)*)

    /**
     * @param memory Memory configuration. See `memory` below.
     * @return builder
     */
    def memory(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessMemoryArgs.builder
      builder.memory(args(argsBuilder).build)

    /**
     * @param model Model configuration for the harness. See `model` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def model(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessModelArgs.builder
      builder.model(args(argsBuilder).build)

    /**
     * @param skills Skill configurations. See `skill` below.
     * @return builder
     */
    def skills(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSkillArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSkillArgs.builder
      builder.skills(args.map(_(argsBuilder).build)*)

    /**
     * @param systemPrompts System prompt blocks for the harness. See `systemPrompt` below.
     * @return builder
     */
    def systemPrompts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSystemPromptArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessSystemPromptArgs.builder
      builder.systemPrompts(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param tools Tool configurations. See `tool` below.
     * @return builder
     */
    def tools(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolArgs.builder
      builder.tools(args.map(_(argsBuilder).build)*)

    /**
     * @param truncations Truncation configuration for conversation history. See `truncation` below.
     * @return builder
     */
    def truncations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationArgs.builder
      builder.truncations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolArgs.Builder)
    /**
     * @param config Tool-specific configuration. See `tool config` below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayArgs.Builder)
    /**
     * @param outboundAuth Outbound authentication configuration. See `outboundAuth` below.
     * @return builder
     */
    def outboundAuth(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayOutboundAuthArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayOutboundAuthArgs.builder
      builder.outboundAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayOutboundAuthArgs.Builder)
    /**
     * @param oauth OAuth credential provider configuration. See `oauth` below.
     * @return builder
     */
    def oauth(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayOutboundAuthOauthArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayOutboundAuthArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayOutboundAuthOauthArgs.builder
      builder.oauth(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder)
    /**
     * @param agentcoreBrowser AgentCore browser configuration. See `agentcoreBrowser` below.
     * @return builder
     */
    def agentcoreBrowser(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreBrowserArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreBrowserArgs.builder
      builder.agentcoreBrowser(args(argsBuilder).build)

    /**
     * @param agentcoreCodeInterpreter AgentCore code interpreter configuration. See `agentcoreCodeInterpreter` below.
     * @return builder
     */
    def agentcoreCodeInterpreter(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreCodeInterpreterArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreCodeInterpreterArgs.builder
      builder.agentcoreCodeInterpreter(args(argsBuilder).build)

    /**
     * @param agentcoreGateway AgentCore gateway configuration. See `agentcoreGateway` below.
     * @return builder
     */
    def agentcoreGateway(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigAgentcoreGatewayArgs.builder
      builder.agentcoreGateway(args(argsBuilder).build)

    /**
     * @param inlineFunction Inline function configuration. See `inlineFunction` below.
     * @return builder
     */
    def inlineFunction(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigInlineFunctionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigInlineFunctionArgs.builder
      builder.inlineFunction(args(argsBuilder).build)

    /**
     * @param remoteMcp Remote MCP server configuration. See `remoteMcp` below.
     * @return builder
     */
    def remoteMcp(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigRemoteMcpArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessToolConfigRemoteMcpArgs.builder
      builder.remoteMcp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationArgs.Builder)
    /**
     * @param configs Strategy-specific configuration. See `truncation config` below.
     * @return builder
     */
    def configs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigArgs.Builder)
    /**
     * @param slidingWindows Sliding window truncation configuration. See `slidingWindow` below.
     * @return builder
     */
    def slidingWindows(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigSlidingWindowArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigSlidingWindowArgs.builder
      builder.slidingWindows(args.map(_(argsBuilder).build)*)

    /**
     * @param summarizations Summarization truncation configuration. See `summarization` below.
     * @return builder
     */
    def summarizations(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigSummarizationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreHarnessTruncationConfigSummarizationArgs.builder
      builder.summarizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryState.Builder)
    /**
     * @param indexedKeys Metadata keys to index for filtering. Up to 10 entries. Changing this forces a new resource to be created. See `indexedKey` below.
     * @return builder
     */
    def indexedKeys(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryIndexedKeyArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryIndexedKeyArgs.builder
      builder.indexedKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param streamDeliveryResources Configuration for streaming memory record data to external resources. See `streamDeliveryResources` below.
     * @return builder
     */
    def streamDeliveryResources(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesArgs.builder
      builder.streamDeliveryResources(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesArgs.Builder)
    /**
     * @param resource List of stream delivery resource configurations. See `resource` below.
     * @return builder
     */
    def resource(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceArgs.builder
      builder.resource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceArgs.Builder)
    /**
     * @param kinesis Kinesis Data Stream configuration. See `kinesis` below.
     * @return builder
     */
    def kinesis(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceKinesisArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceKinesisArgs.builder
      builder.kinesis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceKinesisArgs.Builder)
    /**
     * @param contentConfiguration Content configurations for stream delivery. See `contentConfiguration` below.
     * @return builder
     */
    def contentConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceKinesisContentConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceKinesisArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreMemoryStreamDeliveryResourcesResourceKinesisContentConfigurationArgs.builder
      builder.contentConfiguration(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscovery OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscovery(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscovery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadata Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadata(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigCustomOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGithubOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigGoogleOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigMicrosoftOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSalesforceOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
      builder.authorizationServerMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigArgs.Builder)
    /**
     * @param oauthDiscoveries OAuth discovery configuration. See `oauthDiscovery` below.
     * @return builder
     */
    def oauthDiscoveries(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.builder
      builder.oauthDiscoveries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.Builder)
    /**
     * @param authorizationServerMetadatas Manual OAuth2 authorization server metadata configuration. Cannot be used together with `discoveryUrl`. See `authorizationServerMetadata` below.
     * @return builder
     */
    def authorizationServerMetadatas(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigSlackOauth2ProviderConfigOauthDiscoveryAuthorizationServerMetadataArgs.builder
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
     * The following arguments are optional:
     * @return builder
     */
    def oauth2ProviderConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOauth2CredentialProviderOauth2ProviderConfigArgs.builder
      builder.oauth2ProviderConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigArgs.Builder)
    /**
     * @param cloudwatchLogs CloudWatch logs configuration for reading agent traces. See `cloudwatchLogs` Block below.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigOutputConfigArgs.Builder)
    /**
     * @param cloudwatchConfigs CloudWatch configuration for evaluation results. See `cloudwatchConfig` Block below.
     * @return builder
     */
    def cloudwatchConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigOutputConfigCloudwatchConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigOutputConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigOutputConfigCloudwatchConfigArgs.builder
      builder.cloudwatchConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.Builder)
    /**
     * @param filters List of filters determining which agent traces to evaluate. Maximum 5. See `filter` Block below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleFilterArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param samplingConfig Sampling configuration determining what percentage of agent traces to evaluate. See `samplingConfig` Block below.
     * @return builder
     */
    def samplingConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleSamplingConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleSamplingConfigArgs.builder
      builder.samplingConfig(args(argsBuilder).build)

    /**
     * @param sessionConfig Session configuration defining timeout settings for detecting when agent sessions are complete. See `sessionConfig` Block below.
     * @return builder
     */
    def sessionConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleSessionConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleSessionConfigArgs.builder
      builder.sessionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleFilterArgs.Builder)
    /**
     * @param value Value to compare against. See `value` Block below.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleFilterValueArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleFilterValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigState.Builder)
    /**
     * @param dataSourceConfig Data source configuration specifying where to read agent traces. See `dataSourceConfig` Block below.
     * @return builder
     */
    def dataSourceConfig(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigDataSourceConfigArgs.builder
      builder.dataSourceConfig(args(argsBuilder).build)

    /**
     * @param evaluators List of evaluators to apply during online evaluation. Minimum 1, maximum 10. See `evaluator` Block below.
     * @return builder
     */
    def evaluators(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigEvaluatorArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigEvaluatorArgs.builder
      builder.evaluators(args.map(_(argsBuilder).build)*)

    /**
     * @param outputConfigs Configuration specifying where evaluation results are written. See `outputConfig` Block below.
     * @return builder
     */
    def outputConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigOutputConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigState.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigOutputConfigArgs.builder
      builder.outputConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rule Evaluation rule defining sampling configuration, filters, and session detection settings. See `rule` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigRuleArgs.builder
      builder.rule(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreOnlineEvaluationConfigTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionArgs.Builder)
    /**
     * @param cedar Inline Cedar policy. See `cedar` Block for details.
     * @return builder
     */
    def cedar(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionCedarArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionCedarArgs.builder
      builder.cedar(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcorePolicyEngineState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyEngineTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcorePolicyEngineState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyEngineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcorePolicyState.Builder)
    /**
     * @param definition Policy definition. See `definition` Block for details.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcorePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcorePolicyTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcorePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcorePolicyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkState.Builder)
    /**
     * @param kmsConfiguration KMS configuration for the token vault. See `kmsConfiguration` below.
     * @return builder
     */
    def kmsConfiguration(args: Endofunction[com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.AgentcoreTokenVaultCmkKmsConfigurationArgs.builder
      builder.kmsConfiguration(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.Builder)
    /**
     * @param validators Information about the validators.
     * @return builder
     */
    def validators(args: Endofunction[com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigValidatorArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.CustomModelValidationDataConfigValidatorArgs.builder
      builder.validators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.Builder)
    def guardrailConfigurations(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryGuardrailConfigurationArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryGuardrailConfigurationArgs.builder
      builder.guardrailConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder)
    /**
     * @param agentVersionSummaries List of objects, each of which contains information about a version of the agent. See Agent Version Summaries
     * @return builder
     */
    def agentVersionSummaries(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsAgentVersionSummaryArgs.builder
      builder.agentVersionSummaries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailContentPolicyConfigArgs.Builder)
    /**
     * @param filtersConfigs Set of content filter configs in content policy.
     * See Filters Config for more information.
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

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.Builder)
    /**
     * @param filtersConfigs One or more blocks defining contextual grounding filter configs. See Contextual Grounding Filters Config for more information.
     * @return builder
     */
    def filtersConfigs(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigFiltersConfigArgs.Builder]*):
        com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailContextualGroundingPolicyConfigFiltersConfigArgs.builder
      builder.filtersConfigs(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.GuardrailVersionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.GuardrailVersionState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GuardrailVersionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.bedrock.inputs.InferenceProfileState.Builder)
    /**
     * @param modelSource The source of the model this inference profile will track metrics and cost for. See `modelSource`.
     * 
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputState.Builder =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.ProvisionedModelThroughputTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
