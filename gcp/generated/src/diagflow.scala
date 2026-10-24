package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object diagflow:
  /**
   * A Dialogflow agent is a virtual agent that handles conversations with your end-users. It is a natural language
   * understanding module that understands the nuances of human language. Dialogflow translates end-user text or audio
   * during a conversation to structured data that your apps and services can understand. You design and build a Dialogflow
   * agent to handle the types of conversations required for your system.
   * 
   * To get more information about Agent, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Agent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.AgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.AgentArgs.builder
    com.pulumi.gcp.diagflow.Agent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A conversation profile configures a set of parameters that control the suggestions made to an agent. These parameters control the suggestions that are surfaced during runtime. Each profile configures either a Dialogflow virtual agent or a human agent for a conversation.
   * 
   * To get more information about ConversationProfile, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.conversationProfiles)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def ConversationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.ConversationProfileArgs.builder
    com.pulumi.gcp.diagflow.ConversationProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * 
   * To get more information about Agent, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxAgentArgs.builder
    com.pulumi.gcp.diagflow.CxAgent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Entities are extracted from user input and represent parameters that are meaningful to your application.
   * For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * 
   * To get more information about EntityType, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.entityTypes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxEntityType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxEntityTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxEntityTypeArgs.builder
    com.pulumi.gcp.diagflow.CxEntityType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an environment for an agent. You can create multiple versions of your agent and publish them to separate environments.
   * When you edit an agent, you are editing the draft agent. At any point, you can save the draft agent as an agent version, which is an immutable snapshot of your agent.
   * When you save the draft agent, it is published to the default environment. When you create agent versions, you can publish them to custom environments. You can create a variety of custom environments for testing, development, production, etc.
   * 
   * To get more information about Environment, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.environments)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxEnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxEnvironmentArgs.builder
    com.pulumi.gcp.diagflow.CxEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Flows represents the conversation flows when you build your chatbot agent.
   * 
   * To get more information about Flow, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxFlowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxFlowArgs.builder
    com.pulumi.gcp.diagflow.CxFlow(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Settings for Generative AI.
   * 
   * To get more information about GenerativeSettings, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents/getGenerativeSettings)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxGenerativeSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.builder
    com.pulumi.gcp.diagflow.CxGenerativeSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Generators contain prompt to be sent to the LLM model to generate text. The prompt can contain parameters which will be resolved before calling the model. It can optionally contain banned phrases to ensure the model responses are safe.
   * 
   * To get more information about Generator, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.generators)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxGenerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxGeneratorArgs.builder
    com.pulumi.gcp.diagflow.CxGenerator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An intent represents a user&#39;s intent to interact with a conversational agent.
   * 
   * To get more information about Intent, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.intents)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxIntentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxIntentArgs.builder
    com.pulumi.gcp.diagflow.CxIntent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The states of a CX session are represented by pages.
   * 
   * To get more information about Page, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.pages)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxPage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxPageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxPageArgs.builder
    com.pulumi.gcp.diagflow.CxPage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Playbook is the basic building block to instruct the LLM how to execute a certain task.
   * 
   * To get more information about Playbook, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.playbooks)
   * * How-to Guides
   *     * [Official CX Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxPlaybook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxPlaybookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxPlaybookArgs.builder
    com.pulumi.gcp.diagflow.CxPlaybook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents the settings related to security issues, such as data redaction and data retention. It may take hours for updates on the settings to propagate to all the related components and take effect.
   * Multiple security settings can be configured in each location. Each agent can specify the security settings to apply, and each setting can be applied to multiple agents in the same project and location.
   * 
   * To get more information about SecuritySettings, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.securitySettings)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxSecuritySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.builder
    com.pulumi.gcp.diagflow.CxSecuritySettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * You can use the built-in test feature to uncover bugs and prevent regressions. A test execution verifies that agent responses have not changed for end-user inputs defined in the test case.
   * 
   * To get more information about TestCase, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.testCases)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxTestCase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxTestCaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxTestCaseArgs.builder
    com.pulumi.gcp.diagflow.CxTestCase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A tool provides a list of actions which are available to the Playbook to attain its goal.
   * A Tool consists of a description of the tool&#39;s usage and a specification of the tool which contains the schema and authentication information.
   * 
   * To get more information about Tool, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.tools)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxTool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxToolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxToolArgs.builder
    com.pulumi.gcp.diagflow.CxTool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Tool version is a snapshot of the tool at certain timestamp.
   * 
   * To get more information about ToolVersion, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.tools.versions)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxToolVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxToolVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxToolVersionArgs.builder
    com.pulumi.gcp.diagflow.CxToolVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * You can create multiple versions of your agent flows and deploy them to separate serving environments.
   * When you edit a flow, you are editing a draft flow. At any point, you can save a draft flow as a flow version. A flow version is an immutable snapshot of your flow data and associated agent data like intents, entities, webhooks, pages, route groups, etc.
   * 
   * To get more information about Version, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.versions)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxVersionArgs.builder
    com.pulumi.gcp.diagflow.CxVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Webhooks host the developer&#39;s business logic. During a session, webhooks allow the developer to use the data extracted by Dialogflow&#39;s natural language processing to generate dynamic responses, validate collected data, or trigger actions on the backend.
   * 
   * To get more information about Webhook, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.webhooks)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxWebhookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxWebhookArgs.builder
    com.pulumi.gcp.diagflow.CxWebhook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Initializes a location-level encryption key specification.
   * 
   * To get more information about EncryptionSpec, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.locations.encryptionSpec)
   * * How-to Guides
   *     * [Official CX Documentation](https://cloud.google.com/dialogflow/cx/docs)
   *     * [Official ES Documentation](https://cloud.google.com/dialogflow/es/docs)
   */
  def EncryptionSpec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.EncryptionSpecArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.EncryptionSpecArgs.builder
    com.pulumi.gcp.diagflow.EncryptionSpec(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an entity type. Entity types serve as a tool for extracting parameter values from natural language queries.
   * 
   * To get more information about EntityType, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.entityTypes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def EntityType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.EntityTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.EntityTypeArgs.builder
    com.pulumi.gcp.diagflow.EntityType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an environment for an agent. You can create multiple versions of your agent and publish them to separate environments.
   * 
   * To get more information about Environment, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.environments)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.EnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.EnvironmentArgs.builder
    com.pulumi.gcp.diagflow.Environment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * By default, your agent responds to a matched intent with a static response. If you&#39;re using one of the integration options, you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an intent, Dialogflow responds to that intent by calling a service that you define. For example, if an end-user wants to schedule a haircut on Friday, your service can check your database and respond to the end-user with availability information for Friday.
   * 
   * To get more information about Fulfillment, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent/getFulfillment)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/es/docs/fulfillment-overview)
   */
  def Fulfillment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.FulfillmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.FulfillmentArgs.builder
    com.pulumi.gcp.diagflow.Fulfillment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * LLM generator.
   * 
   * To get more information about Generator, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/es/docs/reference/rest/v2beta1/projects.locations.generators)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/agent-assist/docs)
   */
  def Generator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.GeneratorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.GeneratorArgs.builder
    com.pulumi.gcp.diagflow.Generator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a Dialogflow intent. Intents convert a number of user expressions or patterns into an action. An action
   * is an extraction of a user command or sentence semantics.
   * 
   * To get more information about Intent, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.intents)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Intent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.IntentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.IntentArgs.builder
    com.pulumi.gcp.diagflow.Intent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * SipTrunk is the resource that represents a SIP trunk to connect to the Google Telephony Platform SIP trunking service.
   * 
   * To get more information about SipTrunk, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.locations.sipTrunks)
   */
  def SipTrunk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.SipTrunkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.SipTrunkArgs.builder
    com.pulumi.gcp.diagflow.SipTrunk(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a list of actions available to a Generator (e.g., OpenAPI call, Function call, Connector call).
   * 
   * To get more information about Tool, see:
   * 
   * * [API documentation](https://cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.locations.tools)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/agent-assist/docs)
   */
  def Tool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.ToolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.ToolArgs.builder
    com.pulumi.gcp.diagflow.Tool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * You can create multiple versions of your agent and publish them to separate environments.
   * 
   * To get more information about Version, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.versions)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Version(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.VersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.diagflow.VersionArgs.builder
    com.pulumi.gcp.diagflow.Version(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
