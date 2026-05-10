package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object diagflow:
  /**
   * Represents the settings related to security issues, such as data redaction and data retention. It may take hours for updates on the settings to propagate to all the related components and take effect.
   *  Multiple security settings can be configured in each location. Each agent can specify the security settings to apply, and each setting can be applied to multiple agents in the same project and location.
   * 
   *  To get more information about SecuritySettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.securitySettings)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxSecuritySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.builder
    com.pulumi.gcp.diagflow.CxSecuritySettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
   * 
   *  To get more information about Agent, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxAgentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxAgentArgs.builder
    com.pulumi.gcp.diagflow.CxAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an environment for an agent. You can create multiple versions of your agent and publish them to separate environments.
   * 
   *  To get more information about Environment, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.environments)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.EnvironmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.EnvironmentArgs.builder
    com.pulumi.gcp.diagflow.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Playbook is the basic building block to instruct the LLM how to execute a certain task.
   * 
   *  To get more information about Playbook, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.playbooks)
   *  * How-to Guides
   *      * [Official CX Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxPlaybook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxPlaybookArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxPlaybookArgs.builder
    com.pulumi.gcp.diagflow.CxPlaybook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Generators contain prompt to be sent to the LLM model to generate text. The prompt can contain parameters which will be resolved before calling the model. It can optionally contain banned phrases to ensure the model responses are safe.
   * 
   *  To get more information about Generator, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.generators)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxGenerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxGeneratorArgs.builder
    com.pulumi.gcp.diagflow.CxGenerator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A conversation profile configures a set of parameters that control the suggestions made to an agent. These parameters control the suggestions that are surfaced during runtime. Each profile configures either a Dialogflow virtual agent or a human agent for a conversation.
   * 
   *  To get more information about ConversationProfile, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.conversationProfiles)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def ConversationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.ConversationProfileArgs.builder
    com.pulumi.gcp.diagflow.ConversationProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A tool provides a list of actions which are available to the Playbook to attain its goal.
   *  A Tool consists of a description of the tool&#39;s usage and a specification of the tool which contains the schema and authentication information.
   * 
   *  To get more information about Tool, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.tools)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxTool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxToolArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxToolArgs.builder
    com.pulumi.gcp.diagflow.CxTool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Tool version is a snapshot of the tool at certain timestamp.
   * 
   *  To get more information about ToolVersion, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.tools.versions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxToolVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxToolVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxToolVersionArgs.builder
    com.pulumi.gcp.diagflow.CxToolVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxPlaybookArgs.Builder)
    /**
     * @param instruction Instruction to accomplish target goal.
     *  Structure is documented below.
     * @return builder
     */
    def instruction(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionArgs.Builder]):
        com.pulumi.gcp.diagflow.CxPlaybookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionArgs.builder
      builder.instruction(args(argsBuilder).build)

    /**
     * @param llmModelSettings Llm model settings for the playbook.
     *  Structure is documented below.
     * @return builder
     */
    def llmModelSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPlaybookLlmModelSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxPlaybookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPlaybookLlmModelSettingsArgs.builder
      builder.llmModelSettings(args(argsBuilder).build)

  /**
   * Entities are extracted from user input and represent parameters that are meaningful to your application.
   *  For example, a date range, a proper name such as a geographic location or landmark, and so on. Entities represent actionable data for your application.
   * 
   *  To get more information about EntityType, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.entityTypes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxEntityType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxEntityTypeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxEntityTypeArgs.builder
    com.pulumi.gcp.diagflow.CxEntityType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxIntentArgs.Builder)
    /**
     * @param parameters The collection of parameters associated with the intent.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxIntentParameterArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxIntentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxIntentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
     *  Structure is documented below.
     * @return builder
     */
    def trainingPhrases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxIntentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs.builder
      builder.trainingPhrases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.CxFlowArgs.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this flow. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxFlowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param eventHandlers A flow&#39;s event handlers serve two purposes:
     *  They are responsible for handling events (e.g. no match, webhook errors) in the flow.
     *  They are inherited by every page&#39;s [event handlers][Page.event_handlers], which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow.
     *  Unlike transitionRoutes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     *  Structure is documented below.
     * @return builder
     */
    def eventHandlers(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxFlowArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param knowledgeConnectorSettings Knowledge connector configuration.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeConnectorSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxFlowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.builder
      builder.knowledgeConnectorSettings(args(argsBuilder).build)

    /**
     * @param nluSettings NLU related settings of the flow.
     *  Structure is documented below.
     * @return builder
     */
    def nluSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowNluSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxFlowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowNluSettingsArgs.builder
      builder.nluSettings(args(argsBuilder).build)

    /**
     * @param transitionRoutes A flow&#39;s transition routes serve two purposes:
     *  They are responsible for matching the user&#39;s first utterances in the flow.
     *  They are inherited by every page&#39;s [transition routes][Page.transition_routes] and can support use cases such as the user saying &#34;help&#34; or &#34;can I talk to a human?&#34;, which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow.
     *  TransitionRoutes are evalauted in the following order:
     *  TransitionRoutes with intent specified.
     *  TransitionRoutes with only condition specified.
     *  TransitionRoutes with intent specified are inherited by pages in the flow.
     *  Structure is documented below.
     * @return builder
     */
    def transitionRoutes(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxFlowArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteArgs.builder
      builder.transitionRoutes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.CxEntityTypeArgs.Builder)
    /**
     * @param entities The collection of entity entries associated with the entity type.
     *  Structure is documented below.
     * @return builder
     */
    def entities(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxEntityTypeEntityArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxEntityTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxEntityTypeEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

    /**
     * @param excludedPhrases Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry giant(an adjective), you might consider adding giants(a noun) as an exclusion.
     *  If the kind of entity type is KIND_MAP, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def excludedPhrases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxEntityTypeExcludedPhraseArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxEntityTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxEntityTypeExcludedPhraseArgs.builder
      builder.excludedPhrases(args.map(_(argsBuilder).build)*)

  /**
   * Represents an entity type. Entity types serve as a tool for extracting parameter values from natural language queries.
   * 
   *  To get more information about EntityType, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.entityTypes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def EntityType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.EntityTypeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.EntityTypeArgs.builder
    com.pulumi.gcp.diagflow.EntityType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An intent represents a user&#39;s intent to interact with a conversational agent.
   * 
   *  To get more information about Intent, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.intents)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxIntent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxIntentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxIntentArgs.builder
    com.pulumi.gcp.diagflow.CxIntent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.Builder)
    /**
     * @param audioExportSettings Controls audio export settings for post-conversation analytics when ingesting audio to conversations.
     *  If retentionStrategy is set to REMOVE_AFTER_CONVERSATION or gcsBucket is empty, audio export is disabled.
     *  If audio export is enabled, audio is recorded and saved to gcs_bucket, subject to retention policy of gcs_bucket.
     *  This setting won&#39;t effect audio input for implicit sessions via [Sessions.DetectIntent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.sessions/detectIntent#google.cloud.dialogflow.cx.v3.Sessions.DetectIntent).
     *  Structure is documented below.
     * @return builder
     */
    def audioExportSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsAudioExportSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsAudioExportSettingsArgs.builder
      builder.audioExportSettings(args(argsBuilder).build)

    /**
     * @param insightsExportSettings Controls conversation exporting settings to Insights after conversation is completed.
     *  If retentionStrategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     *  Structure is documented below.
     * @return builder
     */
    def insightsExportSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsInsightsExportSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxSecuritySettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsInsightsExportSettingsArgs.builder
      builder.insightsExportSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxEnvironmentArgs.Builder)
    /**
     * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     *  Structure is documented below.
     * @return builder
     */
    def versionConfigs(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs.builder
      builder.versionConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Initializes a location-level encryption key specification.
   * 
   *  To get more information about EncryptionSpec, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.locations.encryptionSpec)
   *  * How-to Guides
   *      * [Official CX Documentation](https://cloud.google.com/dialogflow/cx/docs)
   *      * [Official ES Documentation](https://cloud.google.com/dialogflow/es/docs)
   */
  def EncryptionSpec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.EncryptionSpecArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.EncryptionSpecArgs.builder
    com.pulumi.gcp.diagflow.EncryptionSpec(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Dialogflow agent is a virtual agent that handles conversations with your end-users. It is a natural language
   *  understanding module that understands the nuances of human language. Dialogflow translates end-user text or audio
   *  during a conversation to structured data that your apps and services can understand. You design and build a Dialogflow
   *  agent to handle the types of conversations required for your system.
   * 
   *  To get more information about Agent, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Agent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.AgentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.AgentArgs.builder
    com.pulumi.gcp.diagflow.Agent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * You can use the built-in test feature to uncover bugs and prevent regressions. A test execution verifies that agent responses have not changed for end-user inputs defined in the test case.
   * 
   *  To get more information about TestCase, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.testCases)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxTestCase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxTestCaseArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxTestCaseArgs.builder
    com.pulumi.gcp.diagflow.CxTestCase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxTestCaseArgs.Builder)
    /**
     * @param testCaseConversationTurns The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     *  Structure is documented below.
     * @return builder
     */
    def testCaseConversationTurns(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxTestCaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.builder
      builder.testCaseConversationTurns(args.map(_(argsBuilder).build)*)

    /**
     * @param testConfig Config for the test case.
     *  Structure is documented below.
     * @return builder
     */
    def testConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.CxTestCaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestConfigArgs.builder
      builder.testConfig(args(argsBuilder).build)

  /**
   * Represents an environment for an agent. You can create multiple versions of your agent and publish them to separate environments.
   *  When you edit an agent, you are editing the draft agent. At any point, you can save the draft agent as an agent version, which is an immutable snapshot of your agent.
   *  When you save the draft agent, it is published to the default environment. When you create agent versions, you can publish them to custom environments. You can create a variety of custom environments for testing, development, production, etc.
   * 
   *  To get more information about Environment, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.environments)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxEnvironmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxEnvironmentArgs.builder
    com.pulumi.gcp.diagflow.CxEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.EncryptionSpecArgs.Builder)
    /**
     * @param encryptionSpec A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EncryptionSpecEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.EncryptionSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EncryptionSpecEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxWebhookArgs.Builder)
    /**
     * @param genericWebService Represents configuration for a generic web service.
     *  Structure is documented below.
     * @return builder
     */
    def genericWebService(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.Builder]):
        com.pulumi.gcp.diagflow.CxWebhookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.builder
      builder.genericWebService(args(argsBuilder).build)

    /**
     * @param serviceDirectory Configuration for a Service Directory service.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectory(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryArgs.Builder]):
        com.pulumi.gcp.diagflow.CxWebhookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryArgs.builder
      builder.serviceDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.EnvironmentArgs.Builder)
    /**
     * @param fulfillment desc
     *  Structure is documented below.
     * @return builder
     */
    def fulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.builder
      builder.fulfillment(args(argsBuilder).build)

    /**
     * @param textToSpeechSettings Text to speech settings for this environment.
     *  Structure is documented below.
     * @return builder
     */
    def textToSpeechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsArgs.builder
      builder.textToSpeechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder)
    /**
     * @param fallbackSettings Settings for Generative Fallback.
     *  Structure is documented below.
     * @return builder
     */
    def fallbackSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsArgs.builder
      builder.fallbackSettings(args(argsBuilder).build)

    /**
     * @param generativeSafetySettings Settings for Generative Safety.
     *  Structure is documented below.
     * @return builder
     */
    def generativeSafetySettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs.builder
      builder.generativeSafetySettings(args(argsBuilder).build)

    /**
     * @param knowledgeConnectorSettings Settings for knowledge connector.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeConnectorSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsKnowledgeConnectorSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsKnowledgeConnectorSettingsArgs.builder
      builder.knowledgeConnectorSettings(args(argsBuilder).build)

    /**
     * @param llmModelSettings LLM model settings.
     *  Structure is documented below.
     * @return builder
     */
    def llmModelSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsLlmModelSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsLlmModelSettingsArgs.builder
      builder.llmModelSettings(args(argsBuilder).build)

  /**
   * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The states of a CX session are represented by pages.
   * 
   *  To get more information about Page, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.pages)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxPage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxPageArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxPageArgs.builder
    com.pulumi.gcp.diagflow.CxPage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Settings for Generative AI.
   * 
   *  To get more information about GenerativeSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents/getGenerativeSettings)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxGenerativeSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxGenerativeSettingsArgs.builder
    com.pulumi.gcp.diagflow.CxGenerativeSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxToolVersionArgs.Builder)
    /**
     * @param tool Snapshot of the tool to be associated with this version.
     *  Structure is documented below.
     * @return builder
     */
    def tool(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder]):
        com.pulumi.gcp.diagflow.CxToolVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.builder
      builder.tool(args(argsBuilder).build)

  /**
   * By default, your agent responds to a matched intent with a static response. If you&#39;re using one of the integration options, you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an intent, Dialogflow responds to that intent by calling a service that you define. For example, if an end-user wants to schedule a haircut on Friday, your service can check your database and respond to the end-user with availability information for Friday.
   * 
   *  To get more information about Fulfillment, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent/getFulfillment)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/es/docs/fulfillment-overview)
   */
  def Fulfillment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.FulfillmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.FulfillmentArgs.builder
    com.pulumi.gcp.diagflow.Fulfillment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.FulfillmentArgs.Builder)
    /**
     * @param features The field defines whether the fulfillment is enabled for certain features.
     *  Structure is documented below.
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.gcp.diagflow.inputs.FulfillmentFeatureArgs.Builder]*):
        com.pulumi.gcp.diagflow.FulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.FulfillmentFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

    /**
     * @param genericWebService Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers.
     *  Structure is documented below.
     * @return builder
     */
    def genericWebService(args: Endofunction[com.pulumi.gcp.diagflow.inputs.FulfillmentGenericWebServiceArgs.Builder]):
        com.pulumi.gcp.diagflow.FulfillmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.FulfillmentGenericWebServiceArgs.builder
      builder.genericWebService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder)
    /**
     * @param llmModelSettings The LLM model settings.
     *  Structure is documented below.
     * @return builder
     */
    def llmModelSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorLlmModelSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorLlmModelSettingsArgs.builder
      builder.llmModelSettings(args(argsBuilder).build)

    /**
     * @param modelParameter Parameters passed to the LLM to configure its behavior.
     *  Structure is documented below.
     * @return builder
     */
    def modelParameter(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorModelParameterArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorModelParameterArgs.builder
      builder.modelParameter(args(argsBuilder).build)

    /**
     * @param placeholders List of custom placeholders in the prompt text.
     *  Structure is documented below.
     * @return builder
     */
    def placeholders(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorPlaceholderArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorPlaceholderArgs.builder
      builder.placeholders(args.map(_(argsBuilder).build)*)

    /**
     * @param promptText Prompt for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def promptText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorPromptTextArgs.Builder]):
        com.pulumi.gcp.diagflow.CxGeneratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorPromptTextArgs.builder
      builder.promptText(args(argsBuilder).build)

  /**
   * Flows represents the conversation flows when you build your chatbot agent.
   * 
   *  To get more information about Flow, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxFlow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxFlowArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxFlowArgs.builder
    com.pulumi.gcp.diagflow.CxFlow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.EntityTypeArgs.Builder)
    /**
     * @param entities The collection of entity entries associated with the entity type.
     *  Structure is documented below.
     * @return builder
     */
    def entities(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EntityTypeEntityArgs.Builder]*):
        com.pulumi.gcp.diagflow.EntityTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.EntityTypeEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

  /**
   * Webhooks host the developer&#39;s business logic. During a session, webhooks allow the developer to use the data extracted by Dialogflow&#39;s natural language processing to generate dynamic responses, validate collected data, or trigger actions on the backend.
   * 
   *  To get more information about Webhook, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.webhooks)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxWebhookArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxWebhookArgs.builder
    com.pulumi.gcp.diagflow.CxWebhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder)
    /**
     * @param automatedAgentConfig Configuration for an automated agent to use with this profile
     *  Structure is documented below.
     * @return builder
     */
    def automatedAgentConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileAutomatedAgentConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileAutomatedAgentConfigArgs.builder
      builder.automatedAgentConfig(args(argsBuilder).build)

    /**
     * @param humanAgentAssistantConfig Configuration for connecting to a live agent
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentAssistantConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.builder
      builder.humanAgentAssistantConfig(args(argsBuilder).build)

    /**
     * @param humanAgentHandoffConfig Defines the hand off to a live agent, typically on which external agent service provider to connect to a conversation.
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentHandoffConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigArgs.builder
      builder.humanAgentHandoffConfig(args(argsBuilder).build)

    /**
     * @param loggingConfig Defines logging behavior for conversation lifecycle events.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileLoggingConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param newMessageEventNotificationConfig Pub/Sub topic on which to publish new agent assistant events.
     *  Expects the format &#34;projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;&#34;
     *  Structure is documented below.
     * @return builder
     */
    def newMessageEventNotificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileNewMessageEventNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileNewMessageEventNotificationConfigArgs.builder
      builder.newMessageEventNotificationConfig(args(argsBuilder).build)

    /**
     * @param newRecognitionResultNotificationConfig Optional. Configuration for publishing transcription intermediate results. Event will be sent in format of ConversationEvent. If configured, the following information will be populated as ConversationEvent Pub/Sub message attributes: - &#34;participantId&#34; - &#34;participantRole&#34; - &#34;messageId&#34;
     *  Structure is documented below.
     * @return builder
     */
    def newRecognitionResultNotificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileNewRecognitionResultNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileNewRecognitionResultNotificationConfigArgs.builder
      builder.newRecognitionResultNotificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
     *  Expects the format &#34;projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;&#34;
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param sttConfig Settings for speech transcription.
     *  Structure is documented below.
     * @return builder
     */
    def sttConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileSttConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileSttConfigArgs.builder
      builder.sttConfig(args(argsBuilder).build)

    /**
     * @param ttsConfig Configuration for Text-to-Speech synthesization. If agent defines synthesization options as well, agent settings overrides the option here.
     *  Structure is documented below.
     * @return builder
     */
    def ttsConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.ConversationProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigArgs.builder
      builder.ttsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxPageArgs.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this page. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxPageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param entryFulfillment The fulfillment to call when the session is entering the page.
     *  Structure is documented below.
     * @return builder
     */
    def entryFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.CxPageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.builder
      builder.entryFulfillment(args(argsBuilder).build)

    /**
     * @param eventHandlers Handlers associated with the page to handle events such as webhook errors, no match or no input.
     *  Structure is documented below.
     * @return builder
     */
    def eventHandlers(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxPageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param form The form associated with the page, used for collecting parameters relevant to the page.
     *  Structure is documented below.
     * @return builder
     */
    def form(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormArgs.Builder]):
        com.pulumi.gcp.diagflow.CxPageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormArgs.builder
      builder.form(args(argsBuilder).build)

    /**
     * @param knowledgeConnectorSettings Knowledge connector configuration.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeConnectorSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxPageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.builder
      builder.knowledgeConnectorSettings(args(argsBuilder).build)

    /**
     * @param transitionRoutes A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow.
     *  When we are in a certain page, the TransitionRoutes are evalauted in the following order:
     *  TransitionRoutes defined in the page with intent specified.
     *  TransitionRoutes defined in the transition route groups with intent specified.
     *  TransitionRoutes defined in flow with intent specified.
     *  TransitionRoutes defined in the transition route groups with intent specified.
     *  TransitionRoutes defined in the page with only condition specified.
     *  TransitionRoutes defined in the transition route groups with only condition specified.
     *  Structure is documented below.
     * @return builder
     */
    def transitionRoutes(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs.Builder]*):
        com.pulumi.gcp.diagflow.CxPageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs.builder
      builder.transitionRoutes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.GeneratorArgs.Builder)
    /**
     * @param inferenceParameter Optional. Inference parameters for this generator.
     *  Structure is documented below.
     * @return builder
     */
    def inferenceParameter(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorInferenceParameterArgs.Builder]):
        com.pulumi.gcp.diagflow.GeneratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorInferenceParameterArgs.builder
      builder.inferenceParameter(args(argsBuilder).build)

    /**
     * @param summarizationContext Input of prebuilt Summarization feature.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationContext(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.Builder]):
        com.pulumi.gcp.diagflow.GeneratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.builder
      builder.summarizationContext(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxAgentArgs.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param answerFeedbackSettings Answer feedback collection settings.
     *  Structure is documented below.
     * @return builder
     */
    def answerFeedbackSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAnswerFeedbackSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAnswerFeedbackSettingsArgs.builder
      builder.answerFeedbackSettings(args(argsBuilder).build)

    /**
     * @param clientCertificateSettings Settings for custom client certificates.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificateSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentClientCertificateSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentClientCertificateSettingsArgs.builder
      builder.clientCertificateSettings(args(argsBuilder).build)

    /**
     * @param genAppBuilderSettings Gen App Builder-related agent-level settings.
     *  Structure is documented below.
     * @return builder
     */
    def genAppBuilderSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentGenAppBuilderSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentGenAppBuilderSettingsArgs.builder
      builder.genAppBuilderSettings(args(argsBuilder).build)

    /**
     * @param gitIntegrationSettings Git integration settings for this agent.
     *  Structure is documented below.
     * @return builder
     */
    def gitIntegrationSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs.builder
      builder.gitIntegrationSettings(args(argsBuilder).build)

    /**
     * @param personalizationSettings Settings for end user personalization.
     *  Structure is documented below.
     * @return builder
     */
    def personalizationSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentPersonalizationSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentPersonalizationSettingsArgs.builder
      builder.personalizationSettings(args(argsBuilder).build)

    /**
     * @param speechToTextSettings Settings related to speech recognition.
     *  Structure is documented below.
     * @return builder
     */
    def speechToTextSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs.builder
      builder.speechToTextSettings(args(argsBuilder).build)

    /**
     * @param textToSpeechSettings Settings related to speech synthesizing.
     *  Structure is documented below.
     * @return builder
     */
    def textToSpeechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentTextToSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.CxAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentTextToSpeechSettingsArgs.builder
      builder.textToSpeechSettings(args(argsBuilder).build)

  /**
   * You can create multiple versions of your agent and publish them to separate environments.
   * 
   *  To get more information about Version, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.versions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Version(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.VersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.VersionArgs.builder
    com.pulumi.gcp.diagflow.Version(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * You can create multiple versions of your agent flows and deploy them to separate serving environments.
   *  When you edit a flow, you are editing a draft flow. At any point, you can save a draft flow as a flow version. A flow version is an immutable snapshot of your flow data and associated agent data like intents, entities, webhooks, pages, route groups, etc.
   * 
   *  To get more information about Version, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.versions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
   */
  def CxVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.CxVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.CxVersionArgs.builder
    com.pulumi.gcp.diagflow.CxVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a Dialogflow intent. Intents convert a number of user expressions or patterns into an action. An action
   *  is an extraction of a user command or sentence semantics.
   * 
   *  To get more information about Intent, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dialogflow/es/docs/reference/rest/v2/projects.agent.intents)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
   */
  def Intent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.IntentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.IntentArgs.builder
    com.pulumi.gcp.diagflow.Intent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs.Builder)
    /**
     * @param parts The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase.
     *  Note: The API does not automatically annotate training phrases like the Dialogflow Console does.
     *  Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated.
     *  If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set.
     *  If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways:
     *  Part.text is set to a part of the phrase that has no parameters.
     *  Part.text is set to a part of the phrase that you want to annotate, and the parameterId field is set.
     *  Structure is documented below.
     * @return builder
     */
    def parts(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhrasePartArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhrasePartArgs.builder
      builder.parts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigArgs.Builder)
    /**
     * @param contextFilterSettings Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     *  Structure is documented below.
     * @return builder
     */
    def contextFilterSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigContextFilterSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigContextFilterSettingsArgs.builder
      builder.contextFilterSettings(args(argsBuilder).build)

    /**
     * @param dialogflowQuerySource Query from Dialogflow agent.
     *  This feature is supported for types: DIALOGFLOW_ASSIST.
     *  Structure is documented below.
     * @return builder
     */
    def dialogflowQuerySource(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.builder
      builder.dialogflowQuerySource(args(argsBuilder).build)

    /**
     * @param sections he customized sections chosen to return when requesting a summary of a conversation.
     *  Structure is documented below.
     * @return builder
     */
    def sections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigSectionsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigSectionsArgs.builder
      builder.sections(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.Builder)
    /**
     * @param actions Actions for the tool to use.
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param endUserAuthConfig Integration Connectors end-user authentication configuration.
     *  If configured, the end-user authentication fields will be passed in the Integration Connectors API request
     *  and override the admin, default authentication configured for the Connection.
     *  Note: The Connection must have authentication override enabled in order to specify an EUC configuration here - otherwise,
     *  the ConnectorTool creation will fail.
     *  See: https://cloud.google.com/application-integration/docs/configure-connectors-task#configure-authentication-override        properties:
     *  Structure is documented below.
     * @return builder
     */
    def endUserAuthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigArgs.builder
      builder.endUserAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigArgs.Builder)
    /**
     * @param featureConfigs Configuration of different suggestion features. One feature can have only one config.
     *  Structure is documented below.
     * @return builder
     */
    def featureConfigs(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.builder
      builder.featureConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPlaybookState.Builder)
    /**
     * @param instruction Instruction to accomplish target goal.
     *  Structure is documented below.
     * @return builder
     */
    def instruction(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPlaybookState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionArgs.builder
      builder.instruction(args(argsBuilder).build)

    /**
     * @param llmModelSettings Llm model settings for the playbook.
     *  Structure is documented below.
     * @return builder
     */
    def llmModelSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPlaybookLlmModelSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPlaybookState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPlaybookLlmModelSettingsArgs.builder
      builder.llmModelSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder)
    /**
     * @param conversationModelConfig Configs of custom conversation model.
     *  Structure is documented below.
     * @return builder
     */
    def conversationModelConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigConversationModelConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigConversationModelConfigArgs.builder
      builder.conversationModelConfig(args(argsBuilder).build)

    /**
     * @param conversationProcessConfig Config to process conversation.
     *  Structure is documented below.
     * @return builder
     */
    def conversationProcessConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigConversationProcessConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigConversationProcessConfigArgs.builder
      builder.conversationProcessConfig(args(argsBuilder).build)

    /**
     * @param queryConfig Configs of query.
     *  Structure is documented below.
     * @return builder
     */
    def queryConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigArgs.builder
      builder.queryConfig(args(argsBuilder).build)

    /**
     * @param suggestionFeature The suggestion feature.
     *  Structure is documented below.
     * @return builder
     */
    def suggestionFeature(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigSuggestionFeatureArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigSuggestionFeatureArgs.builder
      builder.suggestionFeature(args(argsBuilder).build)

    /**
     * @param suggestionTriggerSettings Settings of suggestion trigger.
     *  This feature is only supported for types: ARTICLE_SUGGESTION, FAQ.
     *  Structure is documented below.
     * @return builder
     */
    def suggestionTriggerSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigSuggestionTriggerSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigSuggestionTriggerSettingsArgs.builder
      builder.suggestionTriggerSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorArgs.Builder)
    /**
     * @param initialPromptFulfillment The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def initialPromptFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs.builder
      builder.initialPromptFulfillment(args(argsBuilder).build)

    /**
     * @param repromptEventHandlers The handlers for parameter-level events, used to provide reprompt for the parameter or transition to a different page/flow. The supported events are:
     *  * sys.no-match-&lt;N&gt;, where N can be from 1 to 6
     *  * sys.no-match-default
     *  * sys.no-input-&lt;N&gt;, where N can be from 1 to 6
     *  * sys.no-input-default
     *  * sys.invalid-parameter
     *    [initialPromptFulfillment][initialPromptFulfillment] provides the first prompt for the parameter.
     *    If the user&#39;s response does not fill the parameter, a no-match/no-input event will be triggered, and the fulfillment associated with the sys.no-match-1/sys.no-input-1 handler (if defined) will be called to provide a prompt. The sys.no-match-2/sys.no-input-2 handler (if defined) will respond to the next no-match/no-input event, and so on.
     *    A sys.no-match-default or sys.no-input-default handler will be used to handle all following no-match/no-input events after all numbered no-match/no-input handlers for the parameter are consumed.
     *    A sys.invalid-parameter handler can be defined to handle the case where the parameter values have been invalidated by webhook. For example, if the user&#39;s response fill the parameter, however the parameter was invalidated by webhook, the fulfillment associated with the sys.invalid-parameter handler (if defined) will be called to provide a prompt.
     *    If the event handler for the corresponding event can&#39;t be found on the parameter, initialPromptFulfillment will be re-prompted.
     *    Structure is documented below.
     * @return builder
     */
    def repromptEventHandlers(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerArgs.builder
      builder.repromptEventHandlers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs.Builder)
    /**
     * @param githubSettings Settings of integration with GitHub.
     *  Structure is documented below.
     * @return builder
     */
    def githubSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsGithubSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsGithubSettingsArgs.builder
      builder.githubSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfig Config for API key auth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationApiKeyConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfig(args(argsBuilder).build)

    /**
     * @param bearerTokenConfig Config for bearer token auth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def bearerTokenConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationBearerTokenConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationBearerTokenConfigArgs.builder
      builder.bearerTokenConfig(args(argsBuilder).build)

    /**
     * @param oauthConfig Config for OAuth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationOauthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param serviceAgentAuthConfig Config for [Diglogflow service agent](https://cloud.google.com/iam/docs/service-agents#dialogflow-service-agent) auth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAgentAuthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationServiceAgentAuthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationServiceAgentAuthConfigArgs.builder
      builder.serviceAgentAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecArgs.Builder)
    /**
     * @param dataStoreConnections List of data stores to search.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreConnections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecDataStoreConnectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecDataStoreConnectionArgs.builder
      builder.dataStoreConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param fallbackPrompt Fallback prompt configurations to use.
     * @return builder
     */
    def fallbackPrompt(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecFallbackPromptArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecFallbackPromptArgs.builder
      builder.fallbackPrompt(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormArgs.Builder)
    /**
     * @param parameters Parameters to collect from the user.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultArgs.Builder)
    /**
     * @param conversationTurns The conversation turns uttered during the test case replay in chronological order.
     *  Structure is documented below.
     * @return builder
     */
    def conversationTurns(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnArgs.builder
      builder.conversationTurns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputArgs.Builder)
    /**
     * @param summarySuggestion Optional. Suggested summary.
     *  Structure is documented below.
     * @return builder
     */
    def summarySuggestion(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputSummarySuggestionArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputSummarySuggestionArgs.builder
      builder.summarySuggestion(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputArgs.Builder)
    /**
     * @param dtmf The DTMF event to be handled.
     *  Structure is documented below.
     * @return builder
     */
    def dtmf(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputDtmfArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputDtmfArgs.builder
      builder.dtmf(args(argsBuilder).build)

    /**
     * @param event The event to be triggered.
     *  Structure is documented below.
     * @return builder
     */
    def event(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputEventArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputEventArgs.builder
      builder.event(args(argsBuilder).build)

    /**
     * @param text The natural language text to be processed.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.Builder)
    /**
     * @param humanAgentSideConfig The Dialogflow assist configuration for human agent.
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentSideConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceHumanAgentSideConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceHumanAgentSideConfigArgs.builder
      builder.humanAgentSideConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs.Builder)
    /**
     * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnArgs.Builder)
    /**
     * @param userInput The user input.
     *  Structure is documented below.
     * @return builder
     */
    def userInput(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputArgs.builder
      builder.userInput(args(argsBuilder).build)

    /**
     * @param virtualAgentOutput The virtual agent output.
     *  Structure is documented below.
     * @return builder
     */
    def virtualAgentOutput(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.builder
      builder.virtualAgentOutput(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleConversationContextArgs.Builder)
    /**
     * @param messageEntries Optional. List of message transcripts in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def messageEntries(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleConversationContextMessageEntryArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleConversationContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleConversationContextMessageEntryArgs.builder
      builder.messageEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.EncryptionSpecState.Builder)
    /**
     * @param encryptionSpec A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EncryptionSpecEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.EncryptionSpecState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EncryptionSpecEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder)
    /**
     * @param connectorSpec (Optional, Beta)
     *  Integration connectors tool specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, `functionSpec`, or `connectorSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def connectorSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecArgs.builder
      builder.connectorSpec(args(argsBuilder).build)

    /**
     * @param dataStoreSpec Data store search tool specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolDataStoreSpecArgs.builder
      builder.dataStoreSpec(args(argsBuilder).build)

    /**
     * @param functionSpec Client side executed function specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def functionSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolFunctionSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolFunctionSpecArgs.builder
      builder.functionSpec(args(argsBuilder).build)

    /**
     * @param openApiSpec OpenAPI specification of the Tool.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def openApiSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecArgs.builder
      builder.openApiSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsState.Builder)
    /**
     * @param audioExportSettings Controls audio export settings for post-conversation analytics when ingesting audio to conversations.
     *  If retentionStrategy is set to REMOVE_AFTER_CONVERSATION or gcsBucket is empty, audio export is disabled.
     *  If audio export is enabled, audio is recorded and saved to gcs_bucket, subject to retention policy of gcs_bucket.
     *  This setting won&#39;t effect audio input for implicit sessions via [Sessions.DetectIntent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.sessions/detectIntent#google.cloud.dialogflow.cx.v3.Sessions.DetectIntent).
     *  Structure is documented below.
     * @return builder
     */
    def audioExportSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsAudioExportSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsAudioExportSettingsArgs.builder
      builder.audioExportSettings(args(argsBuilder).build)

    /**
     * @param insightsExportSettings Controls conversation exporting settings to Insights after conversation is completed.
     *  If retentionStrategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     *  Structure is documented below.
     * @return builder
     */
    def insightsExportSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsInsightsExportSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxSecuritySettingsInsightsExportSettingsArgs.builder
      builder.insightsExportSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param endInteractions (Output)
     *  This type has no fields.
     *  Indicates that interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only and not supposed to be defined by the user.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * @return builder
     */
    def endInteractions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs.builder
      builder.endInteractions(args.map(_(argsBuilder).build)*)

    /**
     * @param knowledgeInfoCard This type has no fields.
     *  Represents info card response. If the response contains generative knowledge prediction, Dialogflow will return a payload with Infobot Messenger compatible info card.
     *  Otherwise, the info card response is skipped.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * @return builder
     */
    def knowledgeInfoCard(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageKnowledgeInfoCardArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageKnowledgeInfoCardArgs.builder
      builder.knowledgeInfoCard(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param mixedAudios (Output)
     *  Represents an audio message that is composed of both segments synthesized from the Dialogflow agent prompts and ones hosted externally at the specified URIs. The external URIs are specified via playAudio. This message is generated by Dialogflow only and not supposed to be defined by the user.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def mixedAudios(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.builder
      builder.mixedAudios(args.map(_(argsBuilder).build)*)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxEntityTypeState.Builder)
    /**
     * @param entities The collection of entity entries associated with the entity type.
     *  Structure is documented below.
     * @return builder
     */
    def entities(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxEntityTypeEntityArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxEntityTypeState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxEntityTypeEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

    /**
     * @param excludedPhrases Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry giant(an adjective), you might consider adding giants(a noun) as an exclusion.
     *  If the kind of entity type is KIND_MAP, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def excludedPhrases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxEntityTypeExcludedPhraseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxEntityTypeState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxEntityTypeExcludedPhraseArgs.builder
      builder.excludedPhrases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxIntentState.Builder)
    /**
     * @param parameters The collection of parameters associated with the intent.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxIntentParameterArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxIntentState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxIntentParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
     *  Structure is documented below.
     * @return builder
     */
    def trainingPhrases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxIntentState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseArgs.builder
      builder.trainingPhrases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxWebhookState.Builder)
    /**
     * @param genericWebService Represents configuration for a generic web service.
     *  Structure is documented below.
     * @return builder
     */
    def genericWebService(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.builder
      builder.genericWebService(args(argsBuilder).build)

    /**
     * @param serviceDirectory Configuration for a Service Directory service.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectory(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryArgs.builder
      builder.serviceDirectory(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolState.Builder)
    /**
     * @param connectorSpec (Optional, Beta)
     *  Integration connectors tool specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, `functionSpec`, or `connectorSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def connectorSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.builder
      builder.connectorSpec(args(argsBuilder).build)

    /**
     * @param dataStoreSpec Data store search tool specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.builder
      builder.dataStoreSpec(args(argsBuilder).build)

    /**
     * @param functionSpec Client side executed function specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def functionSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolFunctionSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolFunctionSpecArgs.builder
      builder.functionSpec(args(argsBuilder).build)

    /**
     * @param openApiSpec OpenAPI specification of the Tool.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def openApiSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.builder
      builder.openApiSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param answerFeedbackSettings Answer feedback collection settings.
     *  Structure is documented below.
     * @return builder
     */
    def answerFeedbackSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAnswerFeedbackSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAnswerFeedbackSettingsArgs.builder
      builder.answerFeedbackSettings(args(argsBuilder).build)

    /**
     * @param clientCertificateSettings Settings for custom client certificates.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificateSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentClientCertificateSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentClientCertificateSettingsArgs.builder
      builder.clientCertificateSettings(args(argsBuilder).build)

    /**
     * @param genAppBuilderSettings Gen App Builder-related agent-level settings.
     *  Structure is documented below.
     * @return builder
     */
    def genAppBuilderSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentGenAppBuilderSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentGenAppBuilderSettingsArgs.builder
      builder.genAppBuilderSettings(args(argsBuilder).build)

    /**
     * @param gitIntegrationSettings Git integration settings for this agent.
     *  Structure is documented below.
     * @return builder
     */
    def gitIntegrationSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs.builder
      builder.gitIntegrationSettings(args(argsBuilder).build)

    /**
     * @param personalizationSettings Settings for end user personalization.
     *  Structure is documented below.
     * @return builder
     */
    def personalizationSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentPersonalizationSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentPersonalizationSettingsArgs.builder
      builder.personalizationSettings(args(argsBuilder).build)

    /**
     * @param speechToTextSettings Settings related to speech recognition.
     *  Structure is documented below.
     * @return builder
     */
    def speechToTextSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs.builder
      builder.speechToTextSettings(args(argsBuilder).build)

    /**
     * @param textToSpeechSettings Settings related to speech synthesizing.
     *  Structure is documented below.
     * @return builder
     */
    def textToSpeechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentTextToSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentTextToSpeechSettingsArgs.builder
      builder.textToSpeechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsArgs.Builder)
    /**
     * @param promptTemplates Stored prompts that can be selected, for example default templates like &#34;conservative&#34; or &#34;chatty&#34;, or user defined ones.
     *  Structure is documented below.
     * @return builder
     */
    def promptTemplates(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsPromptTemplateArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsPromptTemplateArgs.builder
      builder.promptTemplates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigArgs.Builder)
    /**
     * @param oauth2AuthCodeConfig Oauth 2.0 Authorization Code authentication. This field is part of a union field `endUserAuthConfig`. Only one of `oauth2AuthCodeConfig` or `oauth2JwtBearerConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2AuthCodeConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigOauth2AuthCodeConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigOauth2AuthCodeConfigArgs.builder
      builder.oauth2AuthCodeConfig(args(argsBuilder).build)

    /**
     * @param oauth2JwtBearerConfig JWT Profile Oauth 2.0 Authorization Grant authentication.. This field is part of a union field `endUserAuthConfig`. Only one of `oauth2AuthCodeConfig` or `oauth2JwtBearerConfig` may be set.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedConnectorSpecEndUserAuthConfigOauth2AuthCodeConfig&#34;&gt;&lt;/a&gt;The `oauth2AuthCodeConfig` block supports:
     * @return builder
     */
    def oauth2JwtBearerConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigOauth2JwtBearerConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecEndUserAuthConfigOauth2JwtBearerConfigArgs.builder
      builder.oauth2JwtBearerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.Builder)
    /**
     * @param segments Segments this audio response is composed of.
     * @return builder
     */
    def segments(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioSegmentArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioSegmentArgs.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterAdvancedSettingsArgs.Builder)
    /**
     * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def dtmfSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterAdvancedSettingsDtmfSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterAdvancedSettingsDtmfSettingsArgs.builder
      builder.dtmfSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder)
    /**
     * @param audioExportGcsDestination If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *    Structure is documented below.
     * @return builder
     */
    def audioExportGcsDestination(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsAudioExportGcsDestinationArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsAudioExportGcsDestinationArgs.builder
      builder.audioExportGcsDestination(args(argsBuilder).build)

    /**
     * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def dtmfSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsDtmfSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsDtmfSettingsArgs.builder
      builder.dtmfSettings(args(argsBuilder).build)

    /**
     * @param loggingSettings Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     *  * Agent level
     *    Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsLoggingSettingsArgs.builder
      builder.loggingSettings(args(argsBuilder).build)

    /**
     * @param speechSettings Settings for speech to text detection. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def speechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsSpeechSettingsArgs.builder
      builder.speechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder)
    /**
     * @param audioExportGcsDestination If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *    Structure is documented below.
     * @return builder
     */
    def audioExportGcsDestination(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsAudioExportGcsDestinationArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsAudioExportGcsDestinationArgs.builder
      builder.audioExportGcsDestination(args(argsBuilder).build)

    /**
     * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def dtmfSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsDtmfSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsDtmfSettingsArgs.builder
      builder.dtmfSettings(args(argsBuilder).build)

    /**
     * @param loggingSettings Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     *  * Agent level
     *    Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsLoggingSettingsArgs.builder
      builder.loggingSettings(args(argsBuilder).build)

    /**
     * @param speechSettings Settings for speech to text detection. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def speechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsSpeechSettingsArgs.builder
      builder.speechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder)
    /**
     * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def dtmfSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettingsArgs.builder
      builder.dtmfSettings(args(argsBuilder).build)

    /**
     * @param loggingSettings Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     *  * Agent level
     *    Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettingsArgs.builder
      builder.loggingSettings(args(argsBuilder).build)

    /**
     * @param speechSettings Settings for speech to text detection. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def speechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettingsArgs.builder
      builder.speechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsState.Builder)
    /**
     * @param fallbackSettings Settings for Generative Fallback.
     *  Structure is documented below.
     * @return builder
     */
    def fallbackSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsFallbackSettingsArgs.builder
      builder.fallbackSettings(args(argsBuilder).build)

    /**
     * @param generativeSafetySettings Settings for Generative Safety.
     *  Structure is documented below.
     * @return builder
     */
    def generativeSafetySettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs.builder
      builder.generativeSafetySettings(args(argsBuilder).build)

    /**
     * @param knowledgeConnectorSettings Settings for knowledge connector.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeConnectorSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsKnowledgeConnectorSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsKnowledgeConnectorSettingsArgs.builder
      builder.knowledgeConnectorSettings(args(argsBuilder).build)

    /**
     * @param llmModelSettings LLM model settings.
     *  Structure is documented below.
     * @return builder
     */
    def llmModelSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsLlmModelSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsLlmModelSettingsArgs.builder
      builder.llmModelSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder)
    /**
     * @param endUserSuggestionConfig Configuration for agent assistance of end user participant.
     *  Structure is documented below.
     * @return builder
     */
    def endUserSuggestionConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigArgs.builder
      builder.endUserSuggestionConfig(args(argsBuilder).build)

    /**
     * @param humanAgentSuggestionConfig Configuration for agent assistance of human agent participant.
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentSuggestionConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigHumanAgentSuggestionConfigArgs.builder
      builder.humanAgentSuggestionConfig(args(argsBuilder).build)

    /**
     * @param messageAnalysisConfig desc
     *  Structure is documented below.
     * @return builder
     */
    def messageAnalysisConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigMessageAnalysisConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigMessageAnalysisConfigArgs.builder
      builder.messageAnalysisConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
     *  Expects the format &#34;projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;&#34;
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.EntityTypeState.Builder)
    /**
     * @param entities The collection of entity entries associated with the entity type.
     *  Structure is documented below.
     * @return builder
     */
    def entities(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EntityTypeEntityArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.EntityTypeState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.EntityTypeEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxGeneratorState.Builder)
    /**
     * @param llmModelSettings The LLM model settings.
     *  Structure is documented below.
     * @return builder
     */
    def llmModelSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorLlmModelSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGeneratorState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorLlmModelSettingsArgs.builder
      builder.llmModelSettings(args(argsBuilder).build)

    /**
     * @param modelParameter Parameters passed to the LLM to configure its behavior.
     *  Structure is documented below.
     * @return builder
     */
    def modelParameter(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorModelParameterArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGeneratorState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorModelParameterArgs.builder
      builder.modelParameter(args(argsBuilder).build)

    /**
     * @param placeholders List of custom placeholders in the prompt text.
     *  Structure is documented below.
     * @return builder
     */
    def placeholders(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorPlaceholderArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxGeneratorState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorPlaceholderArgs.builder
      builder.placeholders(args.map(_(argsBuilder).build)*)

    /**
     * @param promptText Prompt for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def promptText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGeneratorPromptTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxGeneratorState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGeneratorPromptTextArgs.builder
      builder.promptText(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleArgs.Builder)
    /**
     * @param conversationContext Optional. Conversation transcripts.
     *  Structure is documented below.
     * @return builder
     */
    def conversationContext(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleConversationContextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleConversationContextArgs.builder
      builder.conversationContext(args(argsBuilder).build)

    /**
     * @param output Required. Example output of the model.
     *  Structure is documented below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputArgs.builder
      builder.output(args(argsBuilder).build)

    /**
     * @param summarizationSectionList Summarization sections.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationSectionList(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleSummarizationSectionListArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleSummarizationSectionListArgs.builder
      builder.summarizationSectionList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.Builder)
    /**
     * @param dataStoreConnections Optional. List of related data store connections.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreConnections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsDataStoreConnectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsDataStoreConnectionArgs.builder
      builder.dataStoreConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerFulfillment The fulfillment to be triggered.
     *  When the answers from the Knowledge Connector are selected by Dialogflow, you can utitlize the request scoped parameter $request.knowledge.answers (contains up to the 5 highest confidence answers) and $request.knowledge.questions (contains the corresponding questions) to construct the fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecActionArgs.Builder)
    /**
     * @param entityOperation Entity operation configuration for the tool to use. This field is part of a required union field `actionSpec`.
     *  Structure is documented below.
     * @return builder
     */
    def entityOperation(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecActionEntityOperationArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecActionEntityOperationArgs.builder
      builder.entityOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsArgs.Builder)
    /**
     * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def dtmfSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsDtmfSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsDtmfSettingsArgs.builder
      builder.dtmfSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting level. For example, the playbackInterruptionSettings at fulfillment level only overrides the playbackInterruptionSettings at the agent level, leaving other settings at the agent level unchanged.
     *  DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.EnvironmentState.Builder)
    /**
     * @param fulfillment desc
     *  Structure is documented below.
     * @return builder
     */
    def fulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.builder
      builder.fulfillment(args(argsBuilder).build)

    /**
     * @param textToSpeechSettings Text to speech settings for this environment.
     *  Structure is documented below.
     * @return builder
     */
    def textToSpeechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsArgs.builder
      builder.textToSpeechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.FulfillmentState.Builder)
    /**
     * @param features The field defines whether the fulfillment is enabled for certain features.
     *  Structure is documented below.
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.gcp.diagflow.inputs.FulfillmentFeatureArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.FulfillmentState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.FulfillmentFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

    /**
     * @param genericWebService Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers.
     *  Structure is documented below.
     * @return builder
     */
    def genericWebService(args: Endofunction[com.pulumi.gcp.diagflow.inputs.FulfillmentGenericWebServiceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.FulfillmentState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.FulfillmentGenericWebServiceArgs.builder
      builder.genericWebService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputArgs.Builder)
    /**
     * @param dtmf The DTMF event to be handled.
     *  Structure is documented below.
     * @return builder
     */
    def dtmf(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs.builder
      builder.dtmf(args(argsBuilder).build)

    /**
     * @param event The event to be triggered.
     *  Structure is documented below.
     * @return builder
     */
    def event(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs.builder
      builder.event(args(argsBuilder).build)

    /**
     * @param text The natural language text to be processed.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecArgs.Builder)
    /**
     * @param authentication Optional. Authentication information required by the API.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig Optional. Service Directory configuration.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig Optional. TLS configuration for the HTTPS verification.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecTlsConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.Builder)
    /**
     * @param userInput The user input.
     *  Structure is documented below.
     * @return builder
     */
    def userInput(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputArgs.builder
      builder.userInput(args(argsBuilder).build)

    /**
     * @param virtualAgentOutput The virtual agent output.
     *  Structure is documented below.
     * @return builder
     */
    def virtualAgentOutput(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs.builder
      builder.virtualAgentOutput(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.Builder)
    /**
     * @param segments Segments this audio response is composed of.
     * @return builder
     */
    def segments(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioSegmentArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioSegmentArgs.builder
      builder.segments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionState.Builder)
    /**
     * @param tool Snapshot of the tool to be associated with this version.
     *  Structure is documented below.
     * @return builder
     */
    def tool(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolArgs.builder
      builder.tool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowState.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this flow. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param eventHandlers A flow&#39;s event handlers serve two purposes:
     *  They are responsible for handling events (e.g. no match, webhook errors) in the flow.
     *  They are inherited by every page&#39;s [event handlers][Page.event_handlers], which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow.
     *  Unlike transitionRoutes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     *  Structure is documented below.
     * @return builder
     */
    def eventHandlers(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param knowledgeConnectorSettings Knowledge connector configuration.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeConnectorSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.builder
      builder.knowledgeConnectorSettings(args(argsBuilder).build)

    /**
     * @param nluSettings NLU related settings of the flow.
     *  Structure is documented below.
     * @return builder
     */
    def nluSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowNluSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowNluSettingsArgs.builder
      builder.nluSettings(args(argsBuilder).build)

    /**
     * @param transitionRoutes A flow&#39;s transition routes serve two purposes:
     *  They are responsible for matching the user&#39;s first utterances in the flow.
     *  They are inherited by every page&#39;s [transition routes][Page.transition_routes] and can support use cases such as the user saying &#34;help&#34; or &#34;can I talk to a human?&#34;, which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow.
     *  TransitionRoutes are evalauted in the following order:
     *  TransitionRoutes with intent specified.
     *  TransitionRoutes with only condition specified.
     *  TransitionRoutes with intent specified are inherited by pages in the flow.
     *  Structure is documented below.
     * @return builder
     */
    def transitionRoutes(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteArgs.builder
      builder.transitionRoutes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Overriding occurs at the sub-setting level. For example, the playbackInterruptionSettings at fulfillment level only overrides the playbackInterruptionSettings at the agent level, leaving other settings at the agent level unchanged.
     *  DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleSummarizationSectionListArgs.Builder)
    /**
     * @param summarizationSections Optional. Summarization sections.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationSections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleSummarizationSectionListSummarizationSectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleSummarizationSectionListArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleSummarizationSectionListSummarizationSectionArgs.builder
      builder.summarizationSections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder)
    /**
     * @param automatedAgentConfig Configuration for an automated agent to use with this profile
     *  Structure is documented below.
     * @return builder
     */
    def automatedAgentConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileAutomatedAgentConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileAutomatedAgentConfigArgs.builder
      builder.automatedAgentConfig(args(argsBuilder).build)

    /**
     * @param humanAgentAssistantConfig Configuration for connecting to a live agent
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentAssistantConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigArgs.builder
      builder.humanAgentAssistantConfig(args(argsBuilder).build)

    /**
     * @param humanAgentHandoffConfig Defines the hand off to a live agent, typically on which external agent service provider to connect to a conversation.
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentHandoffConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigArgs.builder
      builder.humanAgentHandoffConfig(args(argsBuilder).build)

    /**
     * @param loggingConfig Defines logging behavior for conversation lifecycle events.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileLoggingConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param newMessageEventNotificationConfig Pub/Sub topic on which to publish new agent assistant events.
     *  Expects the format &#34;projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;&#34;
     *  Structure is documented below.
     * @return builder
     */
    def newMessageEventNotificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileNewMessageEventNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileNewMessageEventNotificationConfigArgs.builder
      builder.newMessageEventNotificationConfig(args(argsBuilder).build)

    /**
     * @param newRecognitionResultNotificationConfig Optional. Configuration for publishing transcription intermediate results. Event will be sent in format of ConversationEvent. If configured, the following information will be populated as ConversationEvent Pub/Sub message attributes: - &#34;participantId&#34; - &#34;participantRole&#34; - &#34;messageId&#34;
     *  Structure is documented below.
     * @return builder
     */
    def newRecognitionResultNotificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileNewRecognitionResultNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileNewRecognitionResultNotificationConfigArgs.builder
      builder.newRecognitionResultNotificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Pub/Sub topic on which to publish new agent assistant events.
     *  Expects the format &#34;projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;&#34;
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileNotificationConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param sttConfig Settings for speech transcription.
     *  Structure is documented below.
     * @return builder
     */
    def sttConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileSttConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileSttConfigArgs.builder
      builder.sttConfig(args(argsBuilder).build)

    /**
     * @param ttsConfig Configuration for Text-to-Speech synthesization. If agent defines synthesization options as well, agent settings overrides the option here.
     *  Structure is documented below.
     * @return builder
     */
    def ttsConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigArgs.builder
      builder.ttsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerArgs.Builder)
    /**
     * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfig Config for API key auth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationApiKeyConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfig(args(argsBuilder).build)

    /**
     * @param bearerTokenConfig Config for bearer token auth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def bearerTokenConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationBearerTokenConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationBearerTokenConfigArgs.builder
      builder.bearerTokenConfig(args(argsBuilder).build)

    /**
     * @param oauthConfig Config for OAuth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationOauthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param serviceAgentAuthConfig Config for [Diglogflow service agent](https://cloud.google.com/iam/docs/service-agents#dialogflow-service-agent) auth.
     *  This field is part of a union field `authConfig`: Only one of `apiKeyConfig`, `oauthConfig`, `serviceAgentAuthConfig`, or `bearerTokenConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAgentAuthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationServiceAgentAuthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecAuthenticationServiceAgentAuthConfigArgs.builder
      builder.serviceAgentAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigArgs.Builder)
    /**
     * @param voice The desired voice of the synthesized audio.
     *  Structure is documented below.
     * @return builder
     */
    def voice(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigVoiceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileTtsConfigVoiceArgs.builder
      builder.voice(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerArgs.Builder)
    /**
     * @param triggerFulfillment The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs.Builder)
    /**
     * @param bannedPhrases Banned phrases for generated text.
     *  Structure is documented below.
     * @return builder
     */
    def bannedPhrases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseArgs.builder
      builder.bannedPhrases(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteArgs.Builder)
    /**
     * @param triggerFulfillment The fulfillment to call when the condition is satisfied. At least one of triggerFulfillment and target must be specified. When both are defined, triggerFulfillment is executed first.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.Builder)
    /**
     * @param authentication Optional. Authentication information required by the API.
     *  Structure is documented below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig Optional. Service Directory configuration.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig Optional. TLS configuration for the HTTPS verification.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputArgs.Builder)
    /**
     * @param input User input. Supports text input, event input, dtmf input in the test case.
     *  Structure is documented below.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputArgs.builder
      builder.input(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.Builder)
    /**
     * @param humanAgentSideConfig The Dialogflow assist configuration for human agent.
     *  Structure is documented below.
     * @return builder
     */
    def humanAgentSideConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceHumanAgentSideConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceHumanAgentSideConfigArgs.builder
      builder.humanAgentSideConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder)
    /**
     * @param currentPage The [Page](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.pages#Page) on which the utterance was spoken.
     *  Structure is documented below.
     * @return builder
     */
    def currentPage(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputCurrentPageArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputCurrentPageArgs.builder
      builder.currentPage(args(argsBuilder).build)

    /**
     * @param differences The list of differences between the original run and the replay for this output, if any.
     *  Structure is documented below.
     * @return builder
     */
    def differences(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputDifferenceArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputDifferenceArgs.builder
      builder.differences(args.map(_(argsBuilder).build)*)

    /**
     * @param status Response error from the agent in the test result. If set, other output is empty.
     *  Structure is documented below.
     * @return builder
     */
    def status(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatusArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatusArgs.builder
      builder.status(args(argsBuilder).build)

    /**
     * @param textResponses The text responses from the agent for the turn.
     *  Structure is documented below.
     * @return builder
     */
    def textResponses(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputTextResponseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputTextResponseArgs.builder
      builder.textResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param triggeredIntent The [Intent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.intents#Intent) that triggered the response.
     *  Structure is documented below.
     * @return builder
     */
    def triggeredIntent(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputTriggeredIntentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnVirtualAgentOutputTriggeredIntentArgs.builder
      builder.triggeredIntent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseState.Builder)
    /**
     * @param lastTestResults The latest test result.
     *  Structure is documented below.
     * @return builder
     */
    def lastTestResults(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultArgs.builder
      builder.lastTestResults(args.map(_(argsBuilder).build)*)

    /**
     * @param testCaseConversationTurns The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     *  Structure is documented below.
     * @return builder
     */
    def testCaseConversationTurns(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnArgs.builder
      builder.testCaseConversationTurns(args.map(_(argsBuilder).build)*)

    /**
     * @param testConfig Config for the test case.
     *  Structure is documented below.
     * @return builder
     */
    def testConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestConfigArgs.builder
      builder.testConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxVersionState.Builder)
    /**
     * @param nluSettings The NLU settings of the flow at version creation.
     *  Structure is documented below.
     * @return builder
     */
    def nluSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxVersionNluSettingArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxVersionNluSettingArgs.builder
      builder.nluSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputArgs.Builder)
    /**
     * @param input User input. Supports text input, event input, dtmf input in the test case.
     *  Structure is documented below.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnUserInputInputArgs.builder
      builder.input(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorState.Builder)
    /**
     * @param inferenceParameter Optional. Inference parameters for this generator.
     *  Structure is documented below.
     * @return builder
     */
    def inferenceParameter(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorInferenceParameterArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.GeneratorState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorInferenceParameterArgs.builder
      builder.inferenceParameter(args(argsBuilder).build)

    /**
     * @param summarizationContext Input of prebuilt Summarization feature.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationContext(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.GeneratorState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.builder
      builder.summarizationContext(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.Builder)
    /**
     * @param features The field defines whether the fulfillment is enabled for certain features.
     *  Structure is documented below.
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentFeatureArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

    /**
     * @param genericWebService Represents configuration for a generic web service.
     *  Structure is documented below.
     * @return builder
     */
    def genericWebService(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentGenericWebServiceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentFulfillmentGenericWebServiceArgs.builder
      builder.genericWebService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.Builder)
    /**
     * @param dataStoreConnections List of data stores to search.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreConnections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecDataStoreConnectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecDataStoreConnectionArgs.builder
      builder.dataStoreConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param fallbackPrompt Fallback prompt configurations to use.
     * @return builder
     */
    def fallbackPrompt(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecFallbackPromptArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecFallbackPromptArgs.builder
      builder.fallbackPrompt(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs.Builder)
    /**
     * @param triggerFulfillment The fulfillment to call when the condition is satisfied. At least one of triggerFulfillment and target must be specified. When both are defined, triggerFulfillment is executed first.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigArgs.Builder)
    /**
     * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsArgs.Builder)
    /**
     * @param synthesizeSpeechConfigs Configuration of how speech should be synthesized, mapping from language to SynthesizeSpeechConfig.
     *  Structure is documented below.
     * @return builder
     */
    def synthesizeSpeechConfigs(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsSynthesizeSpeechConfigArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsSynthesizeSpeechConfigArgs.builder
      builder.synthesizeSpeechConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxEnvironmentState.Builder)
    /**
     * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from [Start Flow][Agent.start_flow] in the agent. Otherwise, an error will be returned.
     *  Structure is documented below.
     * @return builder
     */
    def versionConfigs(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxEnvironmentState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxEnvironmentVersionConfigArgs.builder
      builder.versionConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigArgs.Builder)
    /**
     * @param livePersonConfig Config for using LivePerson.
     *  Structure is documented below.
     * @return builder
     */
    def livePersonConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigLivePersonConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentHandoffConfigLivePersonConfigArgs.builder
      builder.livePersonConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder)
    /**
     * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def dtmfSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsDtmfSettingsArgs.builder
      builder.dtmfSettings(args(argsBuilder).build)

    /**
     * @param loggingSettings Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels:
     *  * Agent level
     *    Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsLoggingSettingsArgs.builder
      builder.loggingSettings(args(argsBuilder).build)

    /**
     * @param speechSettings Settings for speech to text detection. Exposed at the following levels:
     *  * Agent level
     *  * Flow level
     *  * Page level
     *  * Parameter level
     *    Structure is documented below.
     * @return builder
     */
    def speechSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentAdvancedSettingsSpeechSettingsArgs.builder
      builder.speechSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.IntentState.Builder)
    /**
     * @param followupIntentInfos Information about all followup intents that have this intent as a direct or indirect parent. We populate this field
     *  only in the output.
     *  Structure is documented below.
     * @return builder
     */
    def followupIntentInfos(args: Endofunction[com.pulumi.gcp.diagflow.inputs.IntentFollowupIntentInfoArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.IntentState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.IntentFollowupIntentInfoArgs.builder
      builder.followupIntentInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterArgs.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this parameter. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param fillBehavior Defines fill behavior for the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def fillBehavior(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorArgs.builder
      builder.fillBehavior(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceArgs.Builder)
    /**
     * @param oauthConfig Represents configuration of OAuth client credential flow for 3rd party
     *  API authentication.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceOauthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param secretVersionsForRequestHeaders The HTTP request headers to send together with webhook requests. Header
     *  values are stored in SecretManager secret versions.
     *  When the same header name is specified in both `requestHeaders` and
     *  `secretVersionsForRequestHeaders`, the value in
     *  `secretVersionsForRequestHeaders` will be used.
     *  Structure is documented below.
     * @return builder
     */
    def secretVersionsForRequestHeaders(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceSecretVersionsForRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceSecretVersionsForRequestHeaderArgs.builder
      builder.secretVersionsForRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccountAuthConfig Configuration for authentication using a service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceServiceAccountAuthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder)
    /**
     * @param contextFilterSettings Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     *  Structure is documented below.
     * @return builder
     */
    def contextFilterSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigContextFilterSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigContextFilterSettingsArgs.builder
      builder.contextFilterSettings(args(argsBuilder).build)

    /**
     * @param dialogflowQuerySource Query from Dialogflow agent.
     *  This feature is supported for types: DIALOGFLOW_ASSIST.
     *  Structure is documented below.
     * @return builder
     */
    def dialogflowQuerySource(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDialogflowQuerySourceArgs.builder
      builder.dialogflowQuerySource(args(argsBuilder).build)

    /**
     * @param documentQuerySource Query from knowledge base document.
     *  This feature is supported for types: SMART_REPLY, SMART_COMPOSE.
     *  Structure is documented below.
     * @return builder
     */
    def documentQuerySource(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDocumentQuerySourceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigDocumentQuerySourceArgs.builder
      builder.documentQuerySource(args(argsBuilder).build)

    /**
     * @param knowledgeBaseQuerySource Query from knowledgebase.
     *  This feature is only supported for types: ARTICLE_SUGGESTION, FAQ.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeBaseQuerySource(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigKnowledgeBaseQuerySourceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigKnowledgeBaseQuerySourceArgs.builder
      builder.knowledgeBaseQuerySource(args(argsBuilder).build)

    /**
     * @param sections he customized sections chosen to return when requesting a summary of a conversation.
     *  Structure is documented below.
     * @return builder
     */
    def sections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigSectionsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigSectionsArgs.builder
      builder.sections(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsSynthesizeSpeechConfigArgs.Builder)
    /**
     * @param voice The desired voice of the synthesized audio.
     *  Structure is documented below.
     * @return builder
     */
    def voice(args: Endofunction[com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsSynthesizeSpeechConfigVoiceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsSynthesizeSpeechConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.EnvironmentTextToSpeechSettingsSynthesizeSpeechConfigVoiceArgs.builder
      builder.voice(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorRepromptEventHandlerTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.Builder)
    /**
     * @param fewShotExamples Optional. List of few shot examples.
     *  Structure is documented below.
     * @return builder
     */
    def fewShotExamples(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleArgs.builder
      builder.fewShotExamples(args.map(_(argsBuilder).build)*)

    /**
     * @param summarizationSections Optional. List of sections. Note it contains both predefined section sand customer defined sections.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationSections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextSummarizationSectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextSummarizationSectionArgs.builder
      builder.summarizationSections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecArgs.Builder)
    /**
     * @param actions Actions for the tool to use.
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param endUserAuthConfig Integration Connectors end-user authentication configuration.
     *  If configured, the end-user authentication fields will be passed in the Integration Connectors API request
     *  and override the admin, default authentication configured for the Connection.
     *  Note: The Connection must have authentication override enabled in order to specify an EUC configuration here - otherwise,
     *  the ConnectorTool creation will fail.
     *  See: https://cloud.google.com/application-integration/docs/configure-connectors-task#configure-authentication-override        properties:
     *  Structure is documented below.
     * @return builder
     */
    def endUserAuthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigArgs.builder
      builder.endUserAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.Builder)
    /**
     * @param oauthConfig Represents configuration of OAuth client credential flow for 3rd party
     *  API authentication.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceOauthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param secretVersionsForRequestHeaders The HTTP request headers to send together with webhook requests. Header
     *  values are stored in SecretManager secret versions.
     *  When the same header name is specified in both `requestHeaders` and
     *  `secretVersionsForRequestHeaders`, the value in
     *  `secretVersionsForRequestHeaders` will be used.
     *  Structure is documented below.
     * @return builder
     */
    def secretVersionsForRequestHeaders(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceSecretVersionsForRequestHeaderArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceSecretVersionsForRequestHeaderArgs.builder
      builder.secretVersionsForRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccountAuthConfig Configuration for authentication using a service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceServiceAccountAuthConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookGenericWebServiceServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder)
    /**
     * @param conversationModelConfig Configs of custom conversation model.
     *  Structure is documented below.
     * @return builder
     */
    def conversationModelConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigConversationModelConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigConversationModelConfigArgs.builder
      builder.conversationModelConfig(args(argsBuilder).build)

    /**
     * @param conversationProcessConfig Config to process conversation.
     *  Structure is documented below.
     * @return builder
     */
    def conversationProcessConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigConversationProcessConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigConversationProcessConfigArgs.builder
      builder.conversationProcessConfig(args(argsBuilder).build)

    /**
     * @param queryConfig Configs of query.
     *  Structure is documented below.
     * @return builder
     */
    def queryConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigQueryConfigArgs.builder
      builder.queryConfig(args(argsBuilder).build)

    /**
     * @param suggestionFeature The suggestion feature.
     *  Structure is documented below.
     * @return builder
     */
    def suggestionFeature(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigSuggestionFeatureArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigSuggestionFeatureArgs.builder
      builder.suggestionFeature(args(argsBuilder).build)

    /**
     * @param suggestionTriggerSettings Settings of suggestion trigger.
     *  This feature is only supported for types: ARTICLE_SUGGESTION, FAQ.
     *  Structure is documented below.
     * @return builder
     */
    def suggestionTriggerSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigSuggestionTriggerSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigSuggestionTriggerSettingsArgs.builder
      builder.suggestionTriggerSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPageState.Builder)
    /**
     * @param advancedSettings Hierarchical advanced settings for this page. The settings exposed at the lower level overrides the settings exposed at the higher level.
     *  Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageAdvancedSettingsArgs.builder
      builder.advancedSettings(args(argsBuilder).build)

    /**
     * @param entryFulfillment The fulfillment to call when the session is entering the page.
     *  Structure is documented below.
     * @return builder
     */
    def entryFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs.builder
      builder.entryFulfillment(args(argsBuilder).build)

    /**
     * @param eventHandlers Handlers associated with the page to handle events such as webhook errors, no match or no input.
     *  Structure is documented below.
     * @return builder
     */
    def eventHandlers(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs.builder
      builder.eventHandlers(args.map(_(argsBuilder).build)*)

    /**
     * @param form The form associated with the page, used for collecting parameters relevant to the page.
     *  Structure is documented below.
     * @return builder
     */
    def form(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageFormArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageFormArgs.builder
      builder.form(args(argsBuilder).build)

    /**
     * @param knowledgeConnectorSettings Knowledge connector configuration.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeConnectorSettings(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxPageState.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageKnowledgeConnectorSettingsArgs.builder
      builder.knowledgeConnectorSettings(args(argsBuilder).build)

    /**
     * @param transitionRoutes A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow.
     *  When we are in a certain page, the TransitionRoutes are evalauted in the following order:
     *  TransitionRoutes defined in the page with intent specified.
     *  TransitionRoutes defined in the transition route groups with intent specified.
     *  TransitionRoutes defined in flow with intent specified.
     *  TransitionRoutes defined in the transition route groups with intent specified.
     *  TransitionRoutes defined in the page with only condition specified.
     *  TransitionRoutes defined in the transition route groups with only condition specified.
     *  Structure is documented below.
     * @return builder
     */
    def transitionRoutes(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPageState.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs.builder
      builder.transitionRoutes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.Builder)
    /**
     * @param dataStoreConnections Optional. List of related data store connections.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreConnections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsDataStoreConnectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsDataStoreConnectionArgs.builder
      builder.dataStoreConnections(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerFulfillment The fulfillment to be triggered.
     *  When the answers from the Knowledge Connector are selected by Dialogflow, you can utitlize the request scoped parameter $request.knowledge.answers (contains up to the 5 highest confidence answers) and $request.knowledge.questions (contains the corresponding questions) to construct the fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def triggerFulfillment(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentArgs.builder
      builder.triggerFulfillment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryArgs.Builder)
    /**
     * @param genericWebService Represents configuration for a generic web service.
     *  Structure is documented below.
     * @return builder
     */
    def genericWebService(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxWebhookServiceDirectoryGenericWebServiceArgs.builder
      builder.genericWebService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecTlsConfigArgs.Builder)
    /**
     * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolOpenApiSpecTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigArgs.Builder)
    /**
     * @param oauth2AuthCodeConfig Oauth 2.0 Authorization Code authentication. This field is part of a union field `endUserAuthConfig`. Only one of `oauth2AuthCodeConfig` or `oauth2JwtBearerConfig` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2AuthCodeConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigOauth2AuthCodeConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigOauth2AuthCodeConfigArgs.builder
      builder.oauth2AuthCodeConfig(args(argsBuilder).build)

    /**
     * @param oauth2JwtBearerConfig JWT Profile Oauth 2.0 Authorization Grant authentication.. This field is part of a union field `endUserAuthConfig`. Only one of `oauth2AuthCodeConfig` or `oauth2JwtBearerConfig` may be set.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedToolConnectorSpecEndUserAuthConfigOauth2AuthCodeConfig&#34;&gt;&lt;/a&gt;The `oauth2AuthCodeConfig` block supports:
     * @return builder
     */
    def oauth2JwtBearerConfig(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigOauth2JwtBearerConfigArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecEndUserAuthConfigOauth2JwtBearerConfigArgs.builder
      builder.oauth2JwtBearerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs.Builder)
    /**
     * @param conditionalCases Conditional cases for this fulfillment.
     *  Structure is documented below.
     * @return builder
     */
    def conditionalCases(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentConditionalCaseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentConditionalCaseArgs.builder
      builder.conditionalCases(args.map(_(argsBuilder).build)*)

    /**
     * @param messages The list of rich message responses to present to the user.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

    /**
     * @param setParameterActions Set parameter values before executing the webhook.
     *  Structure is documented below.
     * @return builder
     */
    def setParameterActions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentSetParameterActionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentSetParameterActionArgs.builder
      builder.setParameterActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputSummarySuggestionArgs.Builder)
    /**
     * @param summarySections Required. All the parts of generated summary.
     *  Structure is documented below.
     * @return builder
     */
    def summarySections(args: Endofunction[com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputSummarySuggestionSummarySectionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputSummarySuggestionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.GeneratorSummarizationContextFewShotExampleOutputSummarySuggestionSummarySectionArgs.builder
      builder.summarySections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionArgs.Builder)
    /**
     * @param steps Ordered list of step by step execution instructions to accomplish target goal.
     *  Structure is documented below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionStepArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxPlaybookInstructionStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigArgs.Builder)
    /**
     * @param featureConfigs Configuration of different suggestion features. One feature can have only one config.
     *  Structure is documented below.
     * @return builder
     */
    def featureConfigs(args: Endofunction[com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.ConversationProfileHumanAgentAssistantConfigEndUserSuggestionConfigFeatureConfigArgs.builder
      builder.featureConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs.Builder)
    /**
     * @param currentPage The [Page](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.pages#Page) on which the utterance was spoken.
     *  Structure is documented below.
     * @return builder
     */
    def currentPage(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputCurrentPageArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputCurrentPageArgs.builder
      builder.currentPage(args(argsBuilder).build)

    /**
     * @param textResponses The text responses from the agent for the turn.
     *  Structure is documented below.
     * @return builder
     */
    def textResponses(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs.builder
      builder.textResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param triggeredIntent The [Intent](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.intents#Intent) that triggered the response.
     *  Structure is documented below.
     * @return builder
     */
    def triggeredIntent(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTriggeredIntentArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputTriggeredIntentArgs.builder
      builder.triggeredIntent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder)
    /**
     * @param conversationSuccess Indicates that the conversation succeeded, i.e., the bot handled the issue that the customer talked to it about.
     *  Dialogflow only uses this to determine which conversations should be counted as successful and doesn&#39;t process the metadata in this message in any way. Note that Dialogflow also considers conversations that get to the conversation end page as successful even if they don&#39;t return ConversationSuccess.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates that the conversation succeeded.
     *  * In a webhook response when you determine that you handled the customer issue.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def conversationSuccess(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageConversationSuccessArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageConversationSuccessArgs.builder
      builder.conversationSuccess(args(argsBuilder).build)

    /**
     * @param endInteractions (Output)
     *  This type has no fields.
     *  Indicates that interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only and not supposed to be defined by the user.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * @return builder
     */
    def endInteractions(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageEndInteractionArgs.builder
      builder.endInteractions(args.map(_(argsBuilder).build)*)

    /**
     * @param knowledgeInfoCard This type has no fields.
     *  Represents info card response. If the response contains generative knowledge prediction, Dialogflow will return a payload with Infobot Messenger compatible info card.
     *  Otherwise, the info card response is skipped.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     * @return builder
     */
    def knowledgeInfoCard(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageKnowledgeInfoCardArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageKnowledgeInfoCardArgs.builder
      builder.knowledgeInfoCard(args(argsBuilder).build)

    /**
     * @param liveAgentHandoff Indicates that the conversation should be handed off to a live agent.
     *  Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures.
     *  You may set this, for example:
     *  * In the entryFulfillment of a Page if entering the page indicates something went extremely wrong in the conversation.
     *  * In a webhook response when you determine that the customer issue can only be handled by a human.
     *    This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *    Structure is documented below.
     * @return builder
     */
    def liveAgentHandoff(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs.builder
      builder.liveAgentHandoff(args(argsBuilder).build)

    /**
     * @param mixedAudios (Output)
     *  Represents an audio message that is composed of both segments synthesized from the Dialogflow agent prompts and ones hosted externally at the specified URIs. The external URIs are specified via playAudio. This message is generated by Dialogflow only and not supposed to be defined by the user.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def mixedAudios(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.Builder]*):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageMixedAudioArgs.builder
      builder.mixedAudios(args.map(_(argsBuilder).build)*)

    /**
     * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def outputAudioText(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageOutputAudioTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageOutputAudioTextArgs.builder
      builder.outputAudioText(args(argsBuilder).build)

    /**
     * @param playAudio Specifies an audio clip to be played by the client as part of the response.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def playAudio(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessagePlayAudioArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessagePlayAudioArgs.builder
      builder.playAudio(args(argsBuilder).build)

    /**
     * @param telephonyTransferCall Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def telephonyTransferCall(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageTelephonyTransferCallArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageTelephonyTransferCallArgs.builder
      builder.telephonyTransferCall(args(argsBuilder).build)

    /**
     * @param text The text response message.
     *  This field is part of a union field `message`: Only one of `text`, `payload`, `conversationSuccess`, `outputAudioText`, `liveAgentHandoff`, `endInteraction`, `playAudio`, `mixedAudio`, `telephonyTransferCall`, or `knowledgeInfoCard` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def text(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageTextArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageTextArgs.builder
      builder.text(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecActionArgs.Builder)
    /**
     * @param entityOperation Entity operation configuration for the tool to use. This field is part of a required union field `actionSpec`.
     *  Structure is documented below.
     * @return builder
     */
    def entityOperation(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecActionEntityOperationArgs.Builder]):
        com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolVersionToolConnectorSpecActionEntityOperationArgs.builder
      builder.entityOperation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.diagflow.CxToolArgs.Builder)
    /**
     * @param connectorSpec (Optional, Beta)
     *  Integration connectors tool specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, `functionSpec`, or `connectorSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def connectorSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.CxToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolConnectorSpecArgs.builder
      builder.connectorSpec(args(argsBuilder).build)

    /**
     * @param dataStoreSpec Data store search tool specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.CxToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolDataStoreSpecArgs.builder
      builder.dataStoreSpec(args(argsBuilder).build)

    /**
     * @param functionSpec Client side executed function specification.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def functionSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolFunctionSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.CxToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolFunctionSpecArgs.builder
      builder.functionSpec(args(argsBuilder).build)

    /**
     * @param openApiSpec OpenAPI specification of the Tool.
     *  This field is part of a union field `specification`: Only one of `openApiSpec`, `dataStoreSpec`, or `functionSpec` may be set.
     *  Structure is documented below.
     * @return builder
     */
    def openApiSpec(args: Endofunction[com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.Builder]):
        com.pulumi.gcp.diagflow.CxToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecArgs.builder
      builder.openApiSpec(args(argsBuilder).build)

  /**
   * LLM generator.
   * 
   *  To get more information about Generator, see:
   * 
   *  * [API documentation](https://cloud.google.com/dialogflow/es/docs/reference/rest/v2beta1/projects.locations.generators)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/agent-assist/docs)
   */
  def Generator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.diagflow.GeneratorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.diagflow.GeneratorArgs.builder
    com.pulumi.gcp.diagflow.Generator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
