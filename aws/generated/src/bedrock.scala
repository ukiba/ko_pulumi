package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object bedrock:
  /** Manages an AWS Agents for Amazon Bedrock Agent. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Agents for Amazon Bedrock Agent Action Group. */
  def AgentAgentActionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentActionGroupArgs.builder
    com.pulumi.aws.bedrock.AgentAgentActionGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Agents for Amazon Bedrock Agent Alias. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock Agents Agent Collaborator. */
  def AgentAgentCollaborator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentCollaboratorArgs.builder
    com.pulumi.aws.bedrock.AgentAgentCollaborator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Agents for Amazon Bedrock Agent Knowledge Base Association. */
  def AgentAgentKnowledgeBaseAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs.builder
    com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Agents for Amazon Bedrock Data Source. */
  def AgentDataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentDataSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentDataSourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentDataSource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock Agents Flow. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Agents for Amazon Bedrock Knowledge Base. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock Agents Prompt. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Browser Profile. Browser profiles define browser state that can be re-used across different browser sessions within AgentCore Browser. Browser state includes cookies and local storage. */
  def AgentcoreBrowserProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreBrowserProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreBrowserProfileArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreBrowserProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Gateway Rule. Rules define conditions and actions that control how requests are routed and processed through a gateway, including principal-based access control, path-based routing, weighted target routing, and configuration bundle overrides. Rules are evaluated in order of `priority` (lower numbers first). */
  def AgentcoreGatewayRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreGatewayRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentcoreGatewayRuleArgs.builder
    com.pulumi.aws.bedrock.AgentcoreGatewayRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Gateway Target. Gateway targets define the endpoints and configurations that a gateway can invoke, such as Lambda functions, APIs, or AgentCore Runtime agents, allowing agents to interact with external services through the Model Context Protocol (MCP) or by routing HTTP traffic directly to a runtime. */
  def AgentcoreGatewayTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreGatewayTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcoreGatewayTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Bedrock AgentCore Memory Strategy. Memory strategies define how the agent processes and organizes information within a memory, such as semantic understanding, summarization, or custom processing logic.
   * 
   * &gt; **Note:** Each memory can have a maximum of 6 strategies. Only one strategy of each built-in type (`SEMANTIC`, `SUMMARIZATION`, `USER_PREFERENCE`, `EPISODIC`) can exist per memory. Multiple `CUSTOM` strategies are allowed, subject to the total limit of 6.
   */
  def AgentcoreMemoryStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreMemoryStrategyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcoreMemoryStrategy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Bedrock AgentCore Online Evaluation Configuration. Online evaluation configurations continuously monitor agent performance by sampling live traffic from CloudWatch logs and applying evaluators to assess agent quality in production.
   * 
   * &gt; **Note:** CloudWatch Transaction Search must be [enabled](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Enable-TransactionSearch.html) before using this resource.
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Policy. A Policy attaches Cedar authorization rules to a Policy Engine, which evaluates them at runtime to control agent access to resources. */
  def AgentcorePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcorePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcorePolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcorePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Bedrock AgentCore Registry. A registry serves as a centralized catalog for organizing and managing registry records, including MCP servers, A2A agents, agent skills, and custom resource types.
   * 
   * &gt; **Warning:** This resource is deprecated. AWS Agent Registry is currently available in public preview. [On August 6, 2026](https://docs.aws.amazon.com/bedrock-agentcore/latest/devguide/registry-faq.html#registry-faq-what-is-changing) functionality will move from the `bedrock-agentcore` namespace to the `agent-registry` namespace. This resource will continue to work until [September 17, 2026](https://docs.aws.amazon.com/bedrock-agentcore/latest/devguide/registry-faq.html). Use the `aws.agentregistry.Registry` resource for all new registries.
   */
  def AgentcoreRegistry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreRegistryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreRegistryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.bedrock.AgentcoreRegistry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Resource Policy. Resource-based policies in Amazon Bedrock AgentCore allow you to control which principals (AWS accounts, IAM users, or IAM roles) can invoke and manage your Amazon Bedrock AgentCore Runtime and Gateway resources. */
  def AgentcoreResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentcoreResourcePolicyArgs.builder
    com.pulumi.aws.bedrock.AgentcoreResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the AWS KMS customer master key (CMK) for a token vault.
   * 
   * &gt; **Note:** Deletion of this resource will not modify the CMK, only remove the resource from state.
   */
  def AgentcoreTokenVaultCmk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.AgentcoreTokenVaultCmkArgs.builder
    com.pulumi.aws.bedrock.AgentcoreTokenVaultCmk(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock AgentCore Workload Identity. Workload Identity provides OAuth2-based authentication and authorization for AI agents to access external resources securely. */
  def AgentcoreWorkloadIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.AgentcoreWorkloadIdentityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.AgentcoreWorkloadIdentityArgs.builder
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
    com.pulumi.aws.bedrock.AgentcoreWorkloadIdentity(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BedrockFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about AWS Bedrock Agents Agent Versions. */
    inline def getAgentAgentVersions(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetAgentAgentVersionsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getAgentAgentVersions(args(argsBuilder).build)

    /** Provides details about AWS Bedrock Agents Agent Versions. */
    inline def getAgentAgentVersionsPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetAgentAgentVersionsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetAgentAgentVersionsPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getAgentAgentVersionsPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Bedrock custom model. */
    inline def getCustomModel(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetCustomModelResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModel(args(argsBuilder).build)

    /** Provides details about a specific Amazon Bedrock custom model. */
    inline def getCustomModelPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetCustomModelResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModelPlain(args(argsBuilder).build)

    /** Provides details about Amazon Bedrock custom models. */
    inline def getCustomModels(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetCustomModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelsArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModels(args(argsBuilder).build)

    /** Provides details about Amazon Bedrock custom models. */
    inline def getCustomModelsPlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetCustomModelsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetCustomModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetCustomModelsPlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getCustomModelsPlain(args(argsBuilder).build)

    /** Provides details about an AWS Bedrock Inference Profile. */
    inline def getInferenceProfile(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetInferenceProfileResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfileArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfile(args(argsBuilder).build)

    /** Provides details about an AWS Bedrock Inference Profile. */
    inline def getInferenceProfilePlain(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrock.outputs.GetInferenceProfileResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilePlainArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfilePlain(args(argsBuilder).build)

    /** Provides details about AWS Bedrock Inference Profiles. */
    inline def getInferenceProfiles(args: Endofunction[com.pulumi.aws.bedrock.inputs.GetInferenceProfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrock.outputs.GetInferenceProfilesResult] =
      val argsBuilder = com.pulumi.aws.bedrock.inputs.GetInferenceProfilesArgs.builder
      com.pulumi.aws.bedrock.BedrockFunctions.getInferenceProfiles(args(argsBuilder).build)

    /** Provides details about AWS Bedrock Inference Profiles. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon Bedrock evaluation job. An evaluation job assesses model or knowledge base performance using either automated metrics or human workers.
   * 
   * &gt; **Note:** Amazon Bedrock does not support permanently deleting an evaluation job. Destroying this resource stops the job (if it is still running) using the [StopEvaluationJob](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_StopEvaluationJob.html) API, then removes it from Terraform state. Set `skipDestroy` to leave the job in its current state instead.
   */
  def EvaluationJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.EvaluationJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bedrock.EvaluationJobArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.bedrock.EvaluationJob(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Amazon Bedrock Guardrail. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock Guardrail Version. */
  def GuardrailVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.GuardrailVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.GuardrailVersionArgs.builder
    com.pulumi.aws.bedrock.GuardrailVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Bedrock Inference Profile. */
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Bedrock Use Case For Model Access.
   * 
   * **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   * 
   * The `aws.bedrock.UseCaseForModelAccess` resource behaves differently from normal resources in that if a Use Case For Model Access already exists, Terraform does not _create_ this resource, but instead &#34;adopts&#34; it into management if it is the same. As the ability to update doesn&#39;t exist, changes compared to the existing resource generate an error.
   * If no Use Case For Model Access exists, Terraform creates a new Use Case For Model Access.
   * `terraform destroy` does not delete the Use Case For Model Access but does remove the resource from Terraform state. Real deletion does not exist for this resource.
   */
  def UseCaseForModelAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrock.UseCaseForModelAccessArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrock.UseCaseForModelAccessArgs.builder
    com.pulumi.aws.bedrock.UseCaseForModelAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
