package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object ces:
  extension (builder: com.pulumi.gcp.ces.ExampleArgs.Builder)
    /**
     * @param messages The collection of messages that make up the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageArgs.Builder]*):
        com.pulumi.gcp.ces.ExampleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  /**
   * Customer Engagement Suite Evaluation
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Evaluation, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/customer-engagement-ai/conversational-agents/ps/reference/rest/v1beta/projects.locations.apps.evaluations)
   */
  def Evaluation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.EvaluationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.EvaluationArgs.builder
    com.pulumi.gcp.ces.Evaluation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Description */
  def Toolset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.ToolsetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.ToolsetArgs.builder
    com.pulumi.gcp.ces.Toolset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.ces.EvaluationArgs.Builder)
    /**
     * @param golden Golden input.
     *  Structure is documented below.
     * @return builder
     */
    def golden(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenArgs.Builder]):
        com.pulumi.gcp.ces.EvaluationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenArgs.builder
      builder.golden(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.AgentArgs.Builder)
    /**
     * @param afterAgentCallbacks The callbacks to execute after the agent is called.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentAfterAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentAfterAgentCallbackArgs.builder
      builder.afterAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterModelCallbacks The callbacks to execute after the model is called. If there are multiple
     *  calls to the model, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentAfterModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentAfterModelCallbackArgs.builder
      builder.afterModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterToolCallbacks The callbacks to execute after the tool is invoked. If there are multiple
     *  tool invocations, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterToolCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentAfterToolCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentAfterToolCallbackArgs.builder
      builder.afterToolCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeAgentCallbacks The callbacks to execute before the agent is called.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentBeforeAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentBeforeAgentCallbackArgs.builder
      builder.beforeAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeModelCallbacks The callbacks to execute before the model is called. If there are multiple
     *  calls to the model, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentBeforeModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentBeforeModelCallbackArgs.builder
      builder.beforeModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeToolCallbacks The callbacks to execute before the tool is invoked. If there are multiple
     *  tool invocations, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeToolCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentBeforeToolCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentBeforeToolCallbackArgs.builder
      builder.beforeToolCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param llmAgent Default agent type. The agent uses instructions and callbacks specified in
     *  the agent to perform the task using a large language model.
     * @return builder
     */
    def llmAgent(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentLlmAgentArgs.Builder]):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AgentLlmAgentArgs.builder
      builder.llmAgent(args(argsBuilder).build)

    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AgentModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

    /**
     * @param remoteDialogflowAgent The agent which will transfer execution to an existing remote
     *  [Dialogflow](https://cloud.google.com/dialogflow/cx/docs/concept/console-conversational-agents)
     *  agent flow. The corresponding Dialogflow agent will process subsequent user
     *  queries until the session ends or flow ends and the control is transferred
     *  back to the parent CES agent.
     *  Structure is documented below.
     * @return builder
     */
    def remoteDialogflowAgent(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentRemoteDialogflowAgentArgs.Builder]):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AgentRemoteDialogflowAgentArgs.builder
      builder.remoteDialogflowAgent(args(argsBuilder).build)

    /**
     * @param toolsets List of toolsets for the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolsets(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentToolsetArgs.Builder]*):
        com.pulumi.gcp.ces.AgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentToolsetArgs.builder
      builder.toolsets(args.map(_(argsBuilder).build)*)

  /** Description */
  def AppVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AppVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.AppVersionArgs.builder
    com.pulumi.gcp.ces.AppVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.ces.ToolArgs.Builder)
    /**
     * @param clientFunction Represents a client-side function that the agent can invoke. When the
     *  tool is chosen by the agent, control is handed off to the client.
     *  The client is responsible for executing the function and returning the result
     *  as a ToolResponse to continue the interaction with the agent.
     *  Structure is documented below.
     * @return builder
     */
    def clientFunction(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.Builder]):
        com.pulumi.gcp.ces.ToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.builder
      builder.clientFunction(args(argsBuilder).build)

    /**
     * @param dataStoreTool Tool to retrieve from Vertex AI Search datastore or engine for grounding.
     *  Accepts either a datastore or an engine, but not both.
     *  See Vertex AI Search:
     *  https://cloud.google.com/generative-ai-app-builder/docs/enterprise-search-introduction.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreTool(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.Builder]):
        com.pulumi.gcp.ces.ToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.builder
      builder.dataStoreTool(args(argsBuilder).build)

    /**
     * @param googleSearchTool Represents a tool to perform Google web searches for grounding.
     *  See
     *  https://cloud.google.com/vertex-ai/generative-ai/docs/grounding/grounding-with-google-search.
     *  Structure is documented below.
     * @return builder
     */
    def googleSearchTool(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolGoogleSearchToolArgs.Builder]):
        com.pulumi.gcp.ces.ToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolGoogleSearchToolArgs.builder
      builder.googleSearchTool(args(argsBuilder).build)

    /**
     * @param pythonFunction A Python function tool.
     *  Structure is documented below.
     * @return builder
     */
    def pythonFunction(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolPythonFunctionArgs.Builder]):
        com.pulumi.gcp.ces.ToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolPythonFunctionArgs.builder
      builder.pythonFunction(args(argsBuilder).build)

  /** Description */
  def Guardrail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.GuardrailArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.GuardrailArgs.builder
    com.pulumi.gcp.ces.Guardrail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** An example represents a sample conversation between the user and the agent(s). */
  def Example(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.ExampleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.ExampleArgs.builder
    com.pulumi.gcp.ces.Example(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Description */
  def Agent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AgentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.AgentArgs.builder
    com.pulumi.gcp.ces.Agent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Description */
  def Tool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.ToolArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.ToolArgs.builder
    com.pulumi.gcp.ces.Tool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.ces.AppArgs.Builder)
    /**
     * @param audioProcessingConfig Configuration for how the input and output audio should be processed and
     *  delivered.
     *  Structure is documented below.
     * @return builder
     */
    def audioProcessingConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.builder
      builder.audioProcessingConfig(args(argsBuilder).build)

    /**
     * @param clientCertificateSettings The default client certificate settings for the app.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificateSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppClientCertificateSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppClientCertificateSettingsArgs.builder
      builder.clientCertificateSettings(args(argsBuilder).build)

    /**
     * @param dataStoreSettings Data store related settings for the app.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDataStoreSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppDataStoreSettingsArgs.builder
      builder.dataStoreSettings(args(argsBuilder).build)

    /**
     * @param defaultChannelProfile A ChannelProfile configures the agent&#39;s behavior for a specific communication
     *  channel, such as web UI or telephony.
     *  Structure is documented below.
     * @return builder
     */
    def defaultChannelProfile(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.builder
      builder.defaultChannelProfile(args(argsBuilder).build)

    /**
     * @param evaluationMetricsThresholds Threshold settings for metrics in an Evaluation.
     *  Structure is documented below.
     * @return builder
     */
    def evaluationMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsArgs.builder
      builder.evaluationMetricsThresholds(args(argsBuilder).build)

    /**
     * @param languageSettings Language settings of the app.
     *  Structure is documented below.
     * @return builder
     */
    def languageSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLanguageSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLanguageSettingsArgs.builder
      builder.languageSettings(args(argsBuilder).build)

    /**
     * @param loggingSettings Settings to describe the logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.builder
      builder.loggingSettings(args(argsBuilder).build)

    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

    /**
     * @param timeZoneSettings TimeZone settings of the app.
     *  Structure is documented below.
     * @return builder
     */
    def timeZoneSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppTimeZoneSettingsArgs.Builder]):
        com.pulumi.gcp.ces.AppArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppTimeZoneSettingsArgs.builder
      builder.timeZoneSettings(args(argsBuilder).build)

    /**
     * @param variableDeclarations The declarations of the variables.
     *  Structure is documented below.
     * @return builder
     */
    def variableDeclarations(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVariableDeclarationArgs.Builder]*):
        com.pulumi.gcp.ces.AppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVariableDeclarationArgs.builder
      builder.variableDeclarations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.GuardrailArgs.Builder)
    /**
     * @param action Action that is taken when a certain precondition is met.
     *  Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailActionArgs.Builder]):
        com.pulumi.gcp.ces.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param codeCallback Guardrail that blocks the conversation based on the code callbacks
     *  provided.
     *  Structure is documented below.
     * @return builder
     */
    def codeCallback(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder]):
        com.pulumi.gcp.ces.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.builder
      builder.codeCallback(args(argsBuilder).build)

    /**
     * @param contentFilter Guardrail that bans certain content from being used in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def contentFilter(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailContentFilterArgs.Builder]):
        com.pulumi.gcp.ces.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailContentFilterArgs.builder
      builder.contentFilter(args(argsBuilder).build)

    /**
     * @param llmPolicy Guardrail that blocks the conversation if the LLM response is considered
     *  violating the policy based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def llmPolicy(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyArgs.Builder]):
        com.pulumi.gcp.ces.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyArgs.builder
      builder.llmPolicy(args(argsBuilder).build)

    /**
     * @param llmPromptSecurity Guardrail that blocks the conversation if the input is considered unsafe
     *  based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def llmPromptSecurity(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.Builder]):
        com.pulumi.gcp.ces.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.builder
      builder.llmPromptSecurity(args(argsBuilder).build)

    /**
     * @param modelSafety Model safety settings overrides. When this is set, it will override the
     *  default settings and trigger the guardrail if the response is considered
     *  unsafe.
     *  Structure is documented below.
     * @return builder
     */
    def modelSafety(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailModelSafetyArgs.Builder]):
        com.pulumi.gcp.ces.GuardrailArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailModelSafetyArgs.builder
      builder.modelSafety(args(argsBuilder).build)

  /**
   * Sets the root agent of a CES App after both the app and the agent have
   *  been created.
   * 
   *  Because a CES Agent must reference its parent app at creation time, the
   *  app must exist before any agent can be created. This means the root agent
   *  cannot be set on the app at creation time \u2014 use this resource to set it
   *  afterwards.
   * 
   *  &gt; **Note:** This resource modifies the `rootAgent` field on the parent
   *  `gcp.ces.App`. Add `lifecycle { ignoreChanges = [rootAgent] }` to
   *  your `gcp.ces.App` resource to prevent Terraform from detecting drift
   *  and clearing the field on every plan.
   */
  def AppRootAgentAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AppRootAgentAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.AppRootAgentAssociationArgs.builder
    com.pulumi.gcp.ces.AppRootAgentAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.ces.DeploymentArgs.Builder)
    /**
     * @param channelProfile A ChannelProfile configures the agent&#39;s behavior for a specific communication
     *  channel, such as web UI or telephony.
     *  Structure is documented below.
     * @return builder
     */
    def channelProfile(args: Endofunction[com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.Builder]):
        com.pulumi.gcp.ces.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.builder
      builder.channelProfile(args(argsBuilder).build)

  /** Description */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AppArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.AppArgs.builder
    com.pulumi.gcp.ces.App(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Description */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.DeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.ces.DeploymentArgs.builder
    com.pulumi.gcp.ces.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.ces.ToolsetArgs.Builder)
    /**
     * @param mcpToolset A toolset that contains a list of tools that are offered by the MCP
     *  server.
     *  Structure is documented below.
     * @return builder
     */
    def mcpToolset(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.Builder]):
        com.pulumi.gcp.ces.ToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.builder
      builder.mcpToolset(args(argsBuilder).build)

    /**
     * @param openApiToolset A toolset that contains a list of tools that are defined by an OpenAPI
     *  schema.
     *  Structure is documented below.
     * @return builder
     */
    def openApiToolset(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.Builder]):
        com.pulumi.gcp.ces.ToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.builder
      builder.openApiToolset(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.Builder)
    /**
     * @param apiAuthentication Authentication information required for API calls.
     *  Structure is documented below.
     * @return builder
     */
    def apiAuthentication(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.builder
      builder.apiAuthentication(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig Configuration for tools using Service Directory.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig The TLS configuration.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetTlsConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigSummarizationConfigArgs.Builder)
    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigSummarizationConfigModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigSummarizationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigSummarizationConfigModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.Builder)
    /**
     * @param ambientSoundConfig Configuration for the ambient sound to be played with the synthesized agent
     *  response, to enhance the naturalness of the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def ambientSoundConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigAmbientSoundConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigAmbientSoundConfigArgs.builder
      builder.ambientSoundConfig(args(argsBuilder).build)

    /**
     * @param bargeInConfig Configuration for how the user barge-in activities should be handled.
     *  Structure is documented below.
     * @return builder
     */
    def bargeInConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigBargeInConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigBargeInConfigArgs.builder
      builder.bargeInConfig(args(argsBuilder).build)

    /**
     * @param synthesizeSpeechConfigs Configuration of how the agent response should be synthesized, mapping from
     *  the language code to SynthesizeSpeechConfig.
     *  If the configuration for the specified language code is not found, the
     *  configuration for the root language code will be used. For example, if the
     *  map contains &#34;en-us&#34; and &#34;en&#34;, and the specified language code is &#34;en-gb&#34;,
     *  then &#34;en&#34; configuration will be used.
     *  Note: Language code is case-insensitive.
     *  Structure is documented below.
     * @return builder
     */
    def synthesizeSpeechConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigSynthesizeSpeechConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigSynthesizeSpeechConfigArgs.builder
      builder.synthesizeSpeechConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepArgs.Builder)
    /**
     * @param agentTransfer Represents an event indicating the transfer of the conversation to a different agent.
     *  Structure is documented below.
     * @return builder
     */
    def agentTransfer(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepAgentTransferArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepAgentTransferArgs.builder
      builder.agentTransfer(args(argsBuilder).build)

    /**
     * @param expectation Executes an expectation on the current turn to verify the agent&#39;s behavior. Note: &#39;user_input&#39; and &#39;expectation&#39; are mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def expectation(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.builder
      builder.expectation(args(argsBuilder).build)

    /**
     * @param userInput Represents user input for the conversation. Note: &#39;user_input&#39; and &#39;expectation&#39; are mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def userInput(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.builder
      builder.userInput(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder)
    /**
     * @param audioRecordingConfigs (Output)
     *  Configuration for how the audio interactions should be recorded.
     *  Structure is documented below.
     * @return builder
     */
    def audioRecordingConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingAudioRecordingConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingAudioRecordingConfigArgs.builder
      builder.audioRecordingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bigqueryExportSettings (Output)
     *  Settings to describe the BigQuery export behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryExportSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingBigqueryExportSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingBigqueryExportSettingArgs.builder
      builder.bigqueryExportSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param cloudLoggingSettings (Output)
     *  Settings to describe the Cloud Logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def cloudLoggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingCloudLoggingSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingCloudLoggingSettingArgs.builder
      builder.cloudLoggingSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param conversationLoggingSettings (Output)
     *  Settings to describe the conversation logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def conversationLoggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingConversationLoggingSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingConversationLoggingSettingArgs.builder
      builder.conversationLoggingSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param redactionConfigs (Output)
     *  Configuration to instruct how sensitive data should be handled.
     *  Structure is documented below.
     * @return builder
     */
    def redactionConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingRedactionConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingRedactionConfigArgs.builder
      builder.redactionConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnArgs.Builder)
    /**
     * @param rootSpans (Output)
     *  The root span of the golden turn for processing and maintaining audio information.
     *  Structure is documented below.
     * @return builder
     */
    def rootSpans(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnRootSpanArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnRootSpanArgs.builder
      builder.rootSpans(args.map(_(argsBuilder).build)*)

    /**
     * @param steps The sequence of steps required to replay a golden conversation turn.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedGoldenTurnsRootSpan&#34;&gt;&lt;/a&gt;The `rootSpan` block contains:
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesToolResponseArgs.Builder)
    /**
     * @param toolsetTool The toolset tool that got executed.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesToolResponseToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesToolResponseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesToolResponseToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolCallArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolCallToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolCallArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolCallToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder)
    /**
     * @param clientFunctions (Output)
     *  Represents a client-side function that the agent can invoke. When the
     *  tool is chosen by the agent, control is handed off to the client.
     *  The client is responsible for executing the function and returning the result
     *  as a ToolResponse to continue the interaction with the agent.
     *  Structure is documented below.
     * @return builder
     */
    def clientFunctions(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionArgs.builder
      builder.clientFunctions(args.map(_(argsBuilder).build)*)

    /**
     * @param dataStoreTools (Output)
     *  Tool to retrieve from Vertex AI Search datastore or engine for grounding.
     *  Accepts either a datastore or an engine, but not both.
     *  See Vertex AI Search:
     *  https://cloud.google.com/generative-ai-app-builder/docs/enterprise-search-introduction.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreTools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolArgs.builder
      builder.dataStoreTools(args.map(_(argsBuilder).build)*)

    /**
     * @param googleSearchTools (Output)
     *  Represents a tool to perform Google web searches for grounding.
     *  See
     *  https://cloud.google.com/vertex-ai/generative-ai/docs/grounding/grounding-with-google-search.
     *  Structure is documented below.
     * @return builder
     */
    def googleSearchTools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolGoogleSearchToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolGoogleSearchToolArgs.builder
      builder.googleSearchTools(args.map(_(argsBuilder).build)*)

    /**
     * @param openApiTools (Output)
     *  A remote API tool defined by an OpenAPI schema.
     *  Structure is documented below.
     * @return builder
     */
    def openApiTools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolArgs.builder
      builder.openApiTools(args.map(_(argsBuilder).build)*)

    /**
     * @param pythonFunctions (Output)
     *  A Python function tool.
     *  Structure is documented below.
     * @return builder
     */
    def pythonFunctions(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolPythonFunctionArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolPythonFunctionArgs.builder
      builder.pythonFunctions(args.map(_(argsBuilder).build)*)

    /**
     * @param systemTools (Output)
     *  The system tool.
     *  Structure is documented below.
     * @return builder
     */
    def systemTools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolSystemToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolSystemToolArgs.builder
      builder.systemTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationState.Builder)
    /**
     * @param golden Golden input.
     *  Structure is documented below.
     * @return builder
     */
    def golden(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenArgs.builder
      builder.golden(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.Builder)
    /**
     * @param agentTransfers (Output)
     *  Represents an event indicating the transfer of a conversation to a different
     *  agent.
     *  Structure is documented below.
     * @return builder
     */
    def agentTransfers(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkAgentTransferArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkAgentTransferArgs.builder
      builder.agentTransfers(args.map(_(argsBuilder).build)*)

    /**
     * @param images (Output)
     *  Represents an image input or output in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def images(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkImageArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkImageArgs.builder
      builder.images(args.map(_(argsBuilder).build)*)

    /**
     * @param toolCalls (Output)
     *  Request for the client or the agent to execute the specified tool.
     *  Structure is documented below.
     * @return builder
     */
    def toolCalls(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolCallArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolCallArgs.builder
      builder.toolCalls(args.map(_(argsBuilder).build)*)

    /**
     * @param toolResponses (Output)
     *  The execution result of a specific tool from the client or the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolResponses(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolResponseArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolResponseArgs.builder
      builder.toolResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.Builder)
    /**
     * @param connectorConfigs (Output)
     *  The connector config for the data store connection.
     *  Structure is documented below.
     * @return builder
     */
    def connectorConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceDataStoreConnectorConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceDataStoreConnectorConfigArgs.builder
      builder.connectorConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder)
    /**
     * @param actions (Output)
     *  Action that is taken when a certain precondition is met.
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param codeCallbacks (Output)
     *  Guardrail that blocks the conversation based on the code callbacks
     *  provided.
     *  Structure is documented below.
     * @return builder
     */
    def codeCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.builder
      builder.codeCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param contentFilters (Output)
     *  Guardrail that bans certain content from being used in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def contentFilters(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailContentFilterArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailContentFilterArgs.builder
      builder.contentFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param llmPolicies (Output)
     *  Guardrail that blocks the conversation if the LLM response is considered
     *  violating the policy based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def llmPolicies(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPolicyArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPolicyArgs.builder
      builder.llmPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param llmPromptSecurities (Output)
     *  Guardrail that blocks the conversation if the input is considered unsafe
     *  based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def llmPromptSecurities(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityArgs.builder
      builder.llmPromptSecurities(args.map(_(argsBuilder).build)*)

    /**
     * @param modelSafeties (Output)
     *  Model safety settings overrides. When this is set, it will override the
     *  default settings and trigger the guardrail if the response is considered
     *  unsafe.
     *  Structure is documented below.
     * @return builder
     */
    def modelSafeties(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailModelSafetyArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailModelSafetyArgs.builder
      builder.modelSafeties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdArgs.Builder)
    /**
     * @param goldenEvaluationMetricsThresholds (Output)
     *  Settings for golden evaluations.
     *  Structure is documented below.
     * @return builder
     */
    def goldenEvaluationMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdArgs.builder
      builder.goldenEvaluationMetricsThresholds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.Builder)
    /**
     * @param apiAuthentication Authentication information required to access tools and execute a tool
     *  against the MCP server. For API key auth, the API key can only be sent in
     *  the request header; sending it via query parameters is not supported.
     *  Structure is documented below.
     * @return builder
     */
    def apiAuthentication(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.builder
      builder.apiAuthentication(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig Service Directory configuration for VPC-SC, used to resolve service names
     *  within a perimeter.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig The TLS configuration. Includes the custom server certificates that the
     *  client should trust.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetTlsConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.Builder)
    /**
     * @param boostSpecs Boost specification to boost certain documents.
     *  Structure is documented below.
     * @return builder
     */
    def boostSpecs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecArgs.builder
      builder.boostSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param engineSource Configuration for searching within an Engine, potentially targeting
     *  specific DataStores.
     *  Structure is documented below.
     * @return builder
     */
    def engineSource(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceArgs.builder
      builder.engineSource(args(argsBuilder).build)

    /**
     * @param modalityConfigs The modality configs for the data store.
     *  Structure is documented below.
     * @return builder
     */
    def modalityConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigArgs.builder
      builder.modalityConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.Builder)
    /**
     * @param blob Blob data from the end user.
     *  Structure is documented below.
     * @return builder
     */
    def blob(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputBlobArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputBlobArgs.builder
      builder.blob(args(argsBuilder).build)

    /**
     * @param event An event to be sent to the session.
     *  Structure is documented below.
     * @return builder
     */
    def event(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputEventArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputEventArgs.builder
      builder.event(args(argsBuilder).build)

    /**
     * @param image Image data from the end user.
     *  Structure is documented below.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputImageArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param toolResponses The list of tool execution results.
     *  Structure is documented below.
     * @return builder
     */
    def toolResponses(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesArgs.builder
      builder.toolResponses(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.Builder)
    /**
     * @param boostControlSpec Specification for custom ranking based on customer specified attribute
     *  value. It provides more controls for customized ranking than the simple
     *  (condition, boost) combination above.
     *  Structure is documented below.
     * @return builder
     */
    def boostControlSpec(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.builder
      builder.boostControlSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder)
    /**
     * @param agentResponse Expectation on agent response.
     *  Structure is documented below.
     * @return builder
     */
    def agentResponse(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseArgs.builder
      builder.agentResponse(args(argsBuilder).build)

    /**
     * @param agentTransfer Expectation on agent transfer.
     *  Structure is documented below.
     * @return builder
     */
    def agentTransfer(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentTransferArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentTransferArgs.builder
      builder.agentTransfer(args(argsBuilder).build)

    /**
     * @param mockToolResponse A mock response to provide if a tool is called.
     *  Structure is documented below.
     * @return builder
     */
    def mockToolResponse(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationMockToolResponseArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationMockToolResponseArgs.builder
      builder.mockToolResponse(args(argsBuilder).build)

    /**
     * @param toolCall Expectation on tool call.
     *  Structure is documented below.
     * @return builder
     */
    def toolCall(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolCallArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolCallArgs.builder
      builder.toolCall(args(argsBuilder).build)

    /**
     * @param toolResponse Expectation on tool response.
     *  Structure is documented below.
     * @return builder
     */
    def toolResponse(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolResponseArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolResponseArgs.builder
      builder.toolResponse(args(argsBuilder).build)

    /**
     * @param updatedVariables Expectation on updated variables.
     *  Structure is documented below.
     * @return builder
     */
    def updatedVariables(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationUpdatedVariablesArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationUpdatedVariablesArgs.builder
      builder.updatedVariables(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetArgs.Builder)
    /**
     * @param apiAuthentications (Output)
     *  Authentication information required for API calls.
     *  Structure is documented below.
     * @return builder
     */
    def apiAuthentications(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.builder
      builder.apiAuthentications(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceDirectoryConfigs (Output)
     *  Configuration for tools using Service Directory.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetServiceDirectoryConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfigs (Output)
     *  The TLS configuration.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetTlsConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetTlsConfigArgs.builder
      builder.tlsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppDataStoreSettingsArgs.Builder)
    /**
     * @param engines (Output)
     *  The engines for the app.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedDataStoreSettingsEngines&#34;&gt;&lt;/a&gt;The `engines` block contains:
     * @return builder
     */
    def engines(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDataStoreSettingsEngineArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppDataStoreSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppDataStoreSettingsEngineArgs.builder
      builder.engines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionArgs.Builder)
    /**
     * @param parameters (Output)
     *  Represents a select subset of an OpenAPI 3.0 schema object.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionParameterArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    /**
     * @param responses (Output)
     *  Represents a select subset of an OpenAPI 3.0 schema object.
     *  Structure is documented below.
     * @return builder
     */
    def responses(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionResponseArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolClientFunctionResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolOpenApiToolArgs.Builder)
    /**
     * @param apiAuthentications (Output)
     *  Authentication information required for API calls.
     *  Structure is documented below.
     * @return builder
     */
    def apiAuthentications(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.builder
      builder.apiAuthentications(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceDirectoryConfigs (Output)
     *  Configuration for tools using Service Directory.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolServiceDirectoryConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfigs (Output)
     *  The TLS configuration.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolTlsConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolTlsConfigArgs.builder
      builder.tlsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolCallArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolCallToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolCallArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolCallToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyArgs.Builder)
    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionArgs.Builder)
    /**
     * @param generativeAnswers (Output)
     *  The agent will immediately respond with a generative answer.
     *  Structure is documented below.
     * @return builder
     */
    def generativeAnswers(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionGenerativeAnswerArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionGenerativeAnswerArgs.builder
      builder.generativeAnswers(args.map(_(argsBuilder).build)*)

    /**
     * @param respondImmediatelies (Output)
     *  The agent will immediately respond with a preconfigured response.
     *  Structure is documented below.
     * @return builder
     */
    def respondImmediatelies(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionRespondImmediatelyArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionRespondImmediatelyArgs.builder
      builder.respondImmediatelies(args.map(_(argsBuilder).build)*)

    /**
     * @param transferAgents (Output)
     *  The agent will transfer the conversation to a different agent.
     *  Structure is documented below.
     * @return builder
     */
    def transferAgents(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionTransferAgentArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionTransferAgentArgs.builder
      builder.transferAgents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigRewriterConfigArgs.Builder)
    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigRewriterConfigModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigRewriterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigRewriterConfigModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder)
    /**
     * @param agentTransfer Represents an event indicating the transfer of a conversation to a different agent.
     *  Structure is documented below.
     * @return builder
     */
    def agentTransfer(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkAgentTransferArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkAgentTransferArgs.builder
      builder.agentTransfer(args(argsBuilder).build)

    /**
     * @param blob Represents a blob input or output in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def blob(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkBlobArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkBlobArgs.builder
      builder.blob(args(argsBuilder).build)

    /**
     * @param image Represents an image input or output in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkImageArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param toolCall Request for the client or the agent to execute the specified tool.
     *  Structure is documented below.
     * @return builder
     */
    def toolCall(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolCallArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolCallArgs.builder
      builder.toolCall(args(argsBuilder).build)

    /**
     * @param toolResponse The execution result of a specific tool from the client or the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolResponse(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolResponseArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolResponseArgs.builder
      builder.toolResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolArgs.Builder)
    /**
     * @param apiAuthentications (Output)
     *  Authentication information required for API calls.
     *  Structure is documented below.
     * @return builder
     */
    def apiAuthentications(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.builder
      builder.apiAuthentications(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceDirectoryConfigs (Output)
     *  Configuration for tools using Service Directory.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolServiceDirectoryConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param tlsConfigs (Output)
     *  The TLS configuration.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolTlsConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolTlsConfigArgs.builder
      builder.tlsConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder)
    /**
     * @param audioRecordingConfig Configuration for how the audio interactions should be recorded.
     *  Structure is documented below.
     * @return builder
     */
    def audioRecordingConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsAudioRecordingConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsAudioRecordingConfigArgs.builder
      builder.audioRecordingConfig(args(argsBuilder).build)

    /**
     * @param bigqueryExportSettings Settings to describe the BigQuery export behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryExportSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsBigqueryExportSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsBigqueryExportSettingsArgs.builder
      builder.bigqueryExportSettings(args(argsBuilder).build)

    /**
     * @param cloudLoggingSettings Settings to describe the Cloud Logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def cloudLoggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsCloudLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsCloudLoggingSettingsArgs.builder
      builder.cloudLoggingSettings(args(argsBuilder).build)

    /**
     * @param conversationLoggingSettings Settings to describe the conversation logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def conversationLoggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsConversationLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsConversationLoggingSettingsArgs.builder
      builder.conversationLoggingSettings(args(argsBuilder).build)

    /**
     * @param redactionConfig Configuration to instruct how sensitive data should be handled.
     *  Structure is documented below.
     * @return builder
     */
    def redactionConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsRedactionConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsRedactionConfigArgs.builder
      builder.redactionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsArgs.Builder)
    /**
     * @param goldenEvaluationMetricsThresholds Settings for golden evaluations.
     *  Structure is documented below.
     * @return builder
     */
    def goldenEvaluationMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsArgs.builder
      builder.goldenEvaluationMetricsThresholds(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailActionArgs.Builder)
    /**
     * @param generativeAnswer The agent will immediately respond with a generative answer.
     *  Structure is documented below.
     * @return builder
     */
    def generativeAnswer(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailActionGenerativeAnswerArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailActionGenerativeAnswerArgs.builder
      builder.generativeAnswer(args(argsBuilder).build)

    /**
     * @param respondImmediately The agent will immediately respond with a preconfigured response.
     *  Structure is documented below.
     * @return builder
     */
    def respondImmediately(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailActionRespondImmediatelyArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailActionRespondImmediatelyArgs.builder
      builder.respondImmediately(args(argsBuilder).build)

    /**
     * @param transferAgent The agent will transfer the conversation to a different agent.
     *  Structure is documented below.
     * @return builder
     */
    def transferAgent(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailActionTransferAgentArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailActionTransferAgentArgs.builder
      builder.transferAgent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolCallArgs.Builder)
    /**
     * @param toolsetTools (Output)
     *  A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolCallToolsetToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolCallArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolCallToolsetToolArgs.builder
      builder.toolsetTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityArgs.Builder)
    /**
     * @param customPolicies (Output)
     *  Guardrail that blocks the conversation if the LLM response is considered
     *  violating the policy based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def customPolicies(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityCustomPolicyArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityCustomPolicyArgs.builder
      builder.customPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultSettings (Output)
     *  Configuration for default system security settings.
     *  Structure is documented below.
     * @return builder
     */
    def defaultSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityDefaultSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityDefaultSettingArgs.builder
      builder.defaultSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.Builder)
    /**
     * @param controlPoints The control points used to define the curve. The monotonic function
     *  (defined through the interpolationType above) passes through the
     *  control points listed here.
     *  Structure is documented below.
     * @return builder
     */
    def controlPoints(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecControlPointArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecControlPointArgs.builder
      builder.controlPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecArgs.Builder)
    /**
     * @param specs (Output)
     *  A list of boosting specifications.
     *  Structure is documented below.
     * @return builder
     */
    def specs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecArgs.builder
      builder.specs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder)
    /**
     * @param audioProcessingConfigs (Output)
     *  Configuration for how the input and output audio should be processed and
     *  delivered.
     *  Structure is documented below.
     * @return builder
     */
    def audioProcessingConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigArgs.builder
      builder.audioProcessingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param clientCertificateSettings (Output)
     *  The default client certificate settings for the app.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificateSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppClientCertificateSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppClientCertificateSettingArgs.builder
      builder.clientCertificateSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param dataStoreSettings (Output)
     *  Data store related settings for the app.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDataStoreSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDataStoreSettingArgs.builder
      builder.dataStoreSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultChannelProfiles (Output)
     *  A ChannelProfile configures the agent&#39;s behavior for a specific communication
     *  channel, such as web UI or telephony.
     *  Structure is documented below.
     * @return builder
     */
    def defaultChannelProfiles(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileArgs.builder
      builder.defaultChannelProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param evaluationMetricsThresholds (Output)
     *  Threshold settings for metrics in an Evaluation.
     *  Structure is documented below.
     * @return builder
     */
    def evaluationMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdArgs.builder
      builder.evaluationMetricsThresholds(args.map(_(argsBuilder).build)*)

    /**
     * @param languageSettings (Output)
     *  Language settings of the app.
     *  Structure is documented below.
     * @return builder
     */
    def languageSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLanguageSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLanguageSettingArgs.builder
      builder.languageSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param loggingSettings (Output)
     *  Settings to describe the logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppLoggingSettingArgs.builder
      builder.loggingSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param modelSettings (Output)
     *  Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppModelSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppModelSettingArgs.builder
      builder.modelSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param timeZoneSettings (Output)
     *  TimeZone settings of the app.
     *  Structure is documented below.
     * @return builder
     */
    def timeZoneSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppTimeZoneSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppTimeZoneSettingArgs.builder
      builder.timeZoneSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param variableDeclarations (Output)
     *  The declarations of the variables.
     *  Structure is documented below.
     * @return builder
     */
    def variableDeclarations(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppVariableDeclarationArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppVariableDeclarationArgs.builder
      builder.variableDeclarations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolResponseArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolResponseToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolResponseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationToolResponseToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfigs (Output)
     *  Configurations for authentication with API key.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationApiKeyConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bearerTokenConfigs (Output)
     *  Configurations for authentication with a bearer token.
     *  Structure is documented below.
     * @return builder
     */
    def bearerTokenConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationBearerTokenConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationBearerTokenConfigArgs.builder
      builder.bearerTokenConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param oauthConfigs (Output)
     *  Configurations for authentication with OAuth.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationOauthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationOauthConfigArgs.builder
      builder.oauthConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccountAuthConfigs (Output)
     *  Configurations for authentication using a custom service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationServiceAccountAuthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAgentIdTokenAuthConfigs (Output)
     *  Configurations for authentication with [ID
     *  token](https://cloud.google.com/docs/authentication/token-types#id) generated
     *  from service agent.
     * @return builder
     */
    def serviceAgentIdTokenAuthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationServiceAgentIdTokenAuthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolApiAuthenticationServiceAgentIdTokenAuthConfigArgs.builder
      builder.serviceAgentIdTokenAuthConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenArgs.Builder)
    /**
     * @param turns The golden turns required to replay a golden conversation.
     *  Structure is documented below.
     * @return builder
     */
    def turns(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnArgs.builder
      builder.turns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfig Configurations for authentication with API key.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationApiKeyConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfig(args(argsBuilder).build)

    /**
     * @param bearerTokenConfig Configurations for authentication with a bearer token.
     *  Structure is documented below.
     * @return builder
     */
    def bearerTokenConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationBearerTokenConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationBearerTokenConfigArgs.builder
      builder.bearerTokenConfig(args(argsBuilder).build)

    /**
     * @param oauthConfig Configurations for authentication with OAuth.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationOauthConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param serviceAccountAuthConfig Configurations for authentication using a custom service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationServiceAccountAuthConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfig(args(argsBuilder).build)

    /**
     * @param serviceAgentIdTokenAuthConfig Configurations for authentication with [ID
     *  token](https://cloud.google.com/docs/authentication/token-types#id) generated
     *  from service agent.
     * @return builder
     */
    def serviceAgentIdTokenAuthConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationServiceAgentIdTokenAuthConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetApiAuthenticationServiceAgentIdTokenAuthConfigArgs.builder
      builder.serviceAgentIdTokenAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseArgs.Builder)
    /**
     * @param chunks Content of the message as a series of chunks.
     *  Structure is documented below.
     * @return builder
     */
    def chunks(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkArgs.builder
      builder.chunks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailModelSafetyArgs.Builder)
    /**
     * @param safetySettings (Output)
     *  List of safety settings.
     *  Structure is documented below.
     * @return builder
     */
    def safetySettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailModelSafetySafetySettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailModelSafetyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailModelSafetySafetySettingArgs.builder
      builder.safetySettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AgentState.Builder)
    /**
     * @param afterAgentCallbacks The callbacks to execute after the agent is called.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentAfterAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentAfterAgentCallbackArgs.builder
      builder.afterAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterModelCallbacks The callbacks to execute after the model is called. If there are multiple
     *  calls to the model, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentAfterModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentAfterModelCallbackArgs.builder
      builder.afterModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterToolCallbacks The callbacks to execute after the tool is invoked. If there are multiple
     *  tool invocations, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterToolCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentAfterToolCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentAfterToolCallbackArgs.builder
      builder.afterToolCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeAgentCallbacks The callbacks to execute before the agent is called.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentBeforeAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentBeforeAgentCallbackArgs.builder
      builder.beforeAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeModelCallbacks The callbacks to execute before the model is called. If there are multiple
     *  calls to the model, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentBeforeModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentBeforeModelCallbackArgs.builder
      builder.beforeModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeToolCallbacks The callbacks to execute before the tool is invoked. If there are multiple
     *  tool invocations, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeToolCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentBeforeToolCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentBeforeToolCallbackArgs.builder
      builder.beforeToolCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param llmAgent Default agent type. The agent uses instructions and callbacks specified in
     *  the agent to perform the task using a large language model.
     * @return builder
     */
    def llmAgent(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentLlmAgentArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AgentLlmAgentArgs.builder
      builder.llmAgent(args(argsBuilder).build)

    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AgentModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

    /**
     * @param remoteDialogflowAgent The agent which will transfer execution to an existing remote
     *  [Dialogflow](https://cloud.google.com/dialogflow/cx/docs/concept/console-conversational-agents)
     *  agent flow. The corresponding Dialogflow agent will process subsequent user
     *  queries until the session ends or flow ends and the control is transferred
     *  back to the parent CES agent.
     *  Structure is documented below.
     * @return builder
     */
    def remoteDialogflowAgent(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentRemoteDialogflowAgentArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AgentRemoteDialogflowAgentArgs.builder
      builder.remoteDialogflowAgent(args(argsBuilder).build)

    /**
     * @param toolsets List of toolsets for the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolsets(args: Endofunction[com.pulumi.gcp.ces.inputs.AgentToolsetArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AgentState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AgentToolsetArgs.builder
      builder.toolsets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfigs (Output)
     *  Configurations for authentication with API key.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationApiKeyConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param oauthConfigs (Output)
     *  Configurations for authentication with OAuth.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationOauthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationOauthConfigArgs.builder
      builder.oauthConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccountAuthConfigs (Output)
     *  Configurations for authentication using a custom service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationServiceAccountAuthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAgentIdTokenAuthConfigs (Output)
     *  Configurations for authentication with [ID
     *  token](https://cloud.google.com/docs/authentication/token-types#id) generated
     *  from service agent.
     * @return builder
     */
    def serviceAgentIdTokenAuthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationServiceAgentIdTokenAuthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolApiAuthenticationServiceAgentIdTokenAuthConfigArgs.builder
      builder.serviceAgentIdTokenAuthConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceArgs.Builder)
    /**
     * @param dataStores (Output)
     *  A DataStore resource in Vertex AI Search.
     *  Structure is documented below.
     * @return builder
     */
    def dataStores(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.builder
      builder.dataStores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetArgs.Builder)
    /**
     * @param openApiToolsets (Output)
     *  A toolset that contains a list of tools that are defined by an OpenAPI
     *  schema.
     *  Structure is documented below.
     * @return builder
     */
    def openApiToolsets(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetArgs.builder
      builder.openApiToolsets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigArgs.Builder)
    /**
     * @param ambientSoundConfigs (Output)
     *  Configuration for the ambient sound to be played with the synthesized agent
     *  response, to enhance the naturalness of the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def ambientSoundConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigAmbientSoundConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigAmbientSoundConfigArgs.builder
      builder.ambientSoundConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bargeInConfigs (Output)
     *  Configuration for how the user barge-in activities should be handled.
     *  Structure is documented below.
     * @return builder
     */
    def bargeInConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigBargeInConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigBargeInConfigArgs.builder
      builder.bargeInConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param synthesizeSpeechConfigs (Output)
     *  Configuration of how the agent response should be synthesized, mapping from
     *  the language code to SynthesizeSpeechConfig.
     *  If the configuration for the specified language code is not found, the
     *  configuration for the root language code will be used. For example, if the
     *  map contains &#34;en-us&#34; and &#34;en&#34;, and the specified language code is &#34;en-gb&#34;,
     *  then &#34;en&#34; configuration will be used.
     *  Note: Language code is case-insensitive.
     *  Structure is documented below.
     * @return builder
     */
    def synthesizeSpeechConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigSynthesizeSpeechConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppAudioProcessingConfigSynthesizeSpeechConfigArgs.builder
      builder.synthesizeSpeechConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecArgs.Builder)
    /**
     * @param conditionBoostSpecs A list of boosting specifications.
     *  Structure is documented below.
     * @return builder
     */
    def conditionBoostSpecs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.builder
      builder.conditionBoostSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationMockToolResponseArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationMockToolResponseToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationMockToolResponseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationMockToolResponseToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.Builder)
    /**
     * @param personaProperty Represents the persona property of a channel.
     *  Structure is documented below.
     * @return builder
     */
    def personaProperty(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDefaultChannelProfilePersonaPropertyArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppDefaultChannelProfilePersonaPropertyArgs.builder
      builder.personaProperty(args(argsBuilder).build)

    /**
     * @param webWidgetConfig Message for configuration for the web widget.
     *  Structure is documented below.
     * @return builder
     */
    def webWidgetConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileWebWidgetConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileWebWidgetConfigArgs.builder
      builder.webWidgetConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionRespondImmediatelyArgs.Builder)
    /**
     * @param responses (Output)
     *  The canned responses for the agent to choose from. The response is chosen
     *  randomly.
     *  Structure is documented below.
     * @return builder
     */
    def responses(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionRespondImmediatelyResponseArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionRespondImmediatelyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailActionRespondImmediatelyResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppVariableDeclarationArgs.Builder)
    /**
     * @param schemas (Output)
     *  Represents a select subset of an OpenAPI 3.0 schema object.
     *  Structure is documented below.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppVariableDeclarationSchemaArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppVariableDeclarationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppVariableDeclarationSchemaArgs.builder
      builder.schemas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleArgs.Builder)
    /**
     * @param messages (Output)
     *  The collection of messages that make up the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolTlsConfigArgs.Builder)
    /**
     * @param caCerts (Output)
     *  Specifies a list of allowed custom CA certificates for HTTPS
     *  verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolOpenApiToolTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigSummarizationConfigArgs.Builder)
    /**
     * @param modelSettings (Output)
     *  Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigSummarizationConfigModelSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigSummarizationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigSummarizationConfigModelSettingArgs.builder
      builder.modelSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetTlsConfigArgs.Builder)
    /**
     * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS
     *  verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.Builder)
    /**
     * @param customPolicy Guardrail that blocks the conversation if the LLM response is considered
     *  violating the policy based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def customPolicy(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityCustomPolicyArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityCustomPolicyArgs.builder
      builder.customPolicy(args(argsBuilder).build)

    /**
     * @param defaultSettings Configuration for default system security settings.
     *  Structure is documented below.
     * @return builder
     */
    def defaultSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityDefaultSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityDefaultSettingsArgs.builder
      builder.defaultSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolResponseArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolResponseToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolResponseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolResponseToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceArgs.Builder)
    /**
     * @param dataStoreSources Use to target specific DataStores within the Engine.
     *  If empty, the search applies to all DataStores associated with the
     *  Engine.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSources(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceArgs.builder
      builder.dataStoreSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetTlsConfigArgs.Builder)
    /**
     * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS
     *  verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecArgs.Builder)
    /**
     * @param specs A list of boosting specifications.
     *  Structure is documented below.
     * @return builder
     */
    def specs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolBoostSpecSpecArgs.builder
      builder.specs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigArgs.Builder)
    /**
     * @param groundingConfig Grounding configuration.
     *  Structure is documented below.
     * @return builder
     */
    def groundingConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigGroundingConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigGroundingConfigArgs.builder
      builder.groundingConfig(args(argsBuilder).build)

    /**
     * @param rewriterConfig Rewriter configuration.
     *  Structure is documented below.
     * @return builder
     */
    def rewriterConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigRewriterConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigRewriterConfigArgs.builder
      builder.rewriterConfig(args(argsBuilder).build)

    /**
     * @param summarizationConfig Summarization configuration.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigSummarizationConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolModalityConfigSummarizationConfigArgs.builder
      builder.summarizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder)
    /**
     * @param afterAgentCallback A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def afterAgentCallback(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackAfterAgentCallbackArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackAfterAgentCallbackArgs.builder
      builder.afterAgentCallback(args(argsBuilder).build)

    /**
     * @param afterModelCallback A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def afterModelCallback(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackAfterModelCallbackArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackAfterModelCallbackArgs.builder
      builder.afterModelCallback(args(argsBuilder).build)

    /**
     * @param beforeAgentCallback A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def beforeAgentCallback(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackBeforeAgentCallbackArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackBeforeAgentCallbackArgs.builder
      builder.beforeAgentCallback(args(argsBuilder).build)

    /**
     * @param beforeModelCallback A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def beforeModelCallback(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackBeforeModelCallbackArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackBeforeModelCallbackArgs.builder
      builder.beforeModelCallback(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolState.Builder)
    /**
     * @param clientFunction Represents a client-side function that the agent can invoke. When the
     *  tool is chosen by the agent, control is handed off to the client.
     *  The client is responsible for executing the function and returning the result
     *  as a ToolResponse to continue the interaction with the agent.
     *  Structure is documented below.
     * @return builder
     */
    def clientFunction(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.builder
      builder.clientFunction(args(argsBuilder).build)

    /**
     * @param dataStoreTool Tool to retrieve from Vertex AI Search datastore or engine for grounding.
     *  Accepts either a datastore or an engine, but not both.
     *  See Vertex AI Search:
     *  https://cloud.google.com/generative-ai-app-builder/docs/enterprise-search-introduction.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreTool(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolArgs.builder
      builder.dataStoreTool(args(argsBuilder).build)

    /**
     * @param googleSearchTool Represents a tool to perform Google web searches for grounding.
     *  See
     *  https://cloud.google.com/vertex-ai/generative-ai/docs/grounding/grounding-with-google-search.
     *  Structure is documented below.
     * @return builder
     */
    def googleSearchTool(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolGoogleSearchToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolGoogleSearchToolArgs.builder
      builder.googleSearchTool(args(argsBuilder).build)

    /**
     * @param openApiTools A remote API tool defined by an OpenAPI schema.
     *  Structure is documented below.
     * @return builder
     */
    def openApiTools(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolArgs.builder
      builder.openApiTools(args.map(_(argsBuilder).build)*)

    /**
     * @param pythonFunction A Python function tool.
     *  Structure is documented below.
     * @return builder
     */
    def pythonFunction(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolPythonFunctionArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolPythonFunctionArgs.builder
      builder.pythonFunction(args(argsBuilder).build)

    /**
     * @param systemTools The system tool.
     *  Structure is documented below.
     * @return builder
     */
    def systemTools(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolSystemToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolSystemToolArgs.builder
      builder.systemTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailActionRespondImmediatelyArgs.Builder)
    /**
     * @param responses The canned responses for the agent to choose from. The response is chosen
     *  randomly.
     *  Structure is documented below.
     * @return builder
     */
    def responses(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailActionRespondImmediatelyResponseArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.GuardrailActionRespondImmediatelyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailActionRespondImmediatelyResponseArgs.builder
      builder.responses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVariableDeclarationArgs.Builder)
    /**
     * @param schema Represents a select subset of an OpenAPI 3.0 schema object.
     *  Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVariableDeclarationSchemaArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppVariableDeclarationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppVariableDeclarationSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageArgs.Builder)
    /**
     * @param chunks (Output)
     *  Content of the message as a series of chunks.
     *  Structure is documented below.
     * @return builder
     */
    def chunks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkArgs.builder
      builder.chunks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDataStoreSettingArgs.Builder)
    /**
     * @param engines (Output)
     *  The engines for the app.
     *  Structure is documented below.
     * @return builder
     */
    def engines(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDataStoreSettingEngineArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDataStoreSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDataStoreSettingEngineArgs.builder
      builder.engines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigArgs.Builder)
    /**
     * @param groundingConfigs (Output)
     *  Grounding configuration.
     *  Structure is documented below.
     * @return builder
     */
    def groundingConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigGroundingConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigGroundingConfigArgs.builder
      builder.groundingConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param rewriterConfigs (Output)
     *  Rewriter configuration.
     *  Structure is documented below.
     * @return builder
     */
    def rewriterConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigRewriterConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigRewriterConfigArgs.builder
      builder.rewriterConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param summarizationConfigs (Output)
     *  Summarization configuration.
     *  Structure is documented below.
     * @return builder
     */
    def summarizationConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigSummarizationConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigSummarizationConfigArgs.builder
      builder.summarizationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceArgs.Builder)
    /**
     * @param dataStore A DataStore resource in Vertex AI Search.
     *  Structure is documented below.
     * @return builder
     */
    def dataStore(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.builder
      builder.dataStore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPolicyArgs.Builder)
    /**
     * @param modelSettings (Output)
     *  Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPolicyModelSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPolicyModelSettingArgs.builder
      builder.modelSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.Builder)
    /**
     * @param agentTransfer Represents an event indicating the transfer of a conversation to a different
     *  agent.
     *  Structure is documented below.
     * @return builder
     */
    def agentTransfer(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkAgentTransferArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkAgentTransferArgs.builder
      builder.agentTransfer(args(argsBuilder).build)

    /**
     * @param image Represents an image input or output in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkImageArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkImageArgs.builder
      builder.image(args(argsBuilder).build)

    /**
     * @param toolCall Request for the client or the agent to execute the specified tool.
     *  Structure is documented below.
     * @return builder
     */
    def toolCall(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolCallArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolCallArgs.builder
      builder.toolCall(args(argsBuilder).build)

    /**
     * @param toolResponse The execution result of a specific tool from the client or the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolResponse(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolResponseArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkToolResponseArgs.builder
      builder.toolResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ExampleMessageArgs.Builder)
    /**
     * @param chunks Content of the message as a series of chunks.
     *  Structure is documented below.
     * @return builder
     */
    def chunks(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ExampleMessageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageChunkArgs.builder
      builder.chunks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.Builder)
    /**
     * @param parameters Represents a select subset of an OpenAPI 3.0 schema object.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolClientFunctionParametersArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolClientFunctionParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    /**
     * @param response Represents a select subset of an OpenAPI 3.0 schema object.
     *  Structure is documented below.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolClientFunctionResponseArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolClientFunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolClientFunctionResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfigs (Output)
     *  Configurations for authentication with API key.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationApiKeyConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bearerTokenConfigs (Output)
     *  Configurations for authentication with a bearer token.
     *  Structure is documented below.
     * @return builder
     */
    def bearerTokenConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationBearerTokenConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationBearerTokenConfigArgs.builder
      builder.bearerTokenConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param oauthConfigs (Output)
     *  Configurations for authentication with OAuth.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationOauthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationOauthConfigArgs.builder
      builder.oauthConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAccountAuthConfigs (Output)
     *  Configurations for authentication using a custom service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationServiceAccountAuthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceAgentIdTokenAuthConfigs (Output)
     *  Configurations for authentication with [ID
     *  token](https://cloud.google.com/docs/authentication/token-types#id) generated
     *  from service agent.
     * @return builder
     */
    def serviceAgentIdTokenAuthConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationServiceAgentIdTokenAuthConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetApiAuthenticationServiceAgentIdTokenAuthConfigArgs.builder
      builder.serviceAgentIdTokenAuthConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.Builder)
    /**
     * @param boostControlSpecs (Output)
     *  Specification for custom ranking based on customer specified attribute
     *  value. It provides more controls for customized ranking than the simple
     *  (condition, boost) combination above.
     *  Structure is documented below.
     * @return builder
     */
    def boostControlSpecs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.builder
      builder.boostControlSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.Builder)
    /**
     * @param afterAgentCallbacks (Output)
     *  A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def afterAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackAfterAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackAfterAgentCallbackArgs.builder
      builder.afterAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterModelCallbacks (Output)
     *  A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def afterModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackAfterModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackAfterModelCallbackArgs.builder
      builder.afterModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeAgentCallbacks (Output)
     *  A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def beforeAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackBeforeAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackBeforeAgentCallbackArgs.builder
      builder.beforeAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeModelCallbacks (Output)
     *  A callback defines the custom logic to be executed at various stages of
     *  agent interaction.
     *  Structure is documented below.
     * @return builder
     */
    def beforeModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackBeforeModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailCodeCallbackBeforeModelCallbackArgs.builder
      builder.beforeModelCallbacks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceArgs.Builder)
    /**
     * @param dataStoreSources (Output)
     *  Use to target specific DataStores within the Engine.
     *  If empty, the search applies to all DataStores associated with the
     *  Engine.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSources(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceDataStoreSourceArgs.builder
      builder.dataStoreSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolCallArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolCallToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolCallArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolCallToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.Builder)
    /**
     * @param controlPoints (Output)
     *  The control points used to define the curve. The monotonic function
     *  (defined through the interpolationType above) passes through the
     *  control points listed here.
     *  Structure is documented below.
     * @return builder
     */
    def controlPoints(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecControlPointArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecBoostControlSpecControlPointArgs.builder
      builder.controlPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailState.Builder)
    /**
     * @param action Action that is taken when a certain precondition is met.
     *  Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailActionArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param codeCallback Guardrail that blocks the conversation based on the code callbacks
     *  provided.
     *  Structure is documented below.
     * @return builder
     */
    def codeCallback(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailCodeCallbackArgs.builder
      builder.codeCallback(args(argsBuilder).build)

    /**
     * @param contentFilter Guardrail that bans certain content from being used in the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def contentFilter(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailContentFilterArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailContentFilterArgs.builder
      builder.contentFilter(args(argsBuilder).build)

    /**
     * @param llmPolicy Guardrail that blocks the conversation if the LLM response is considered
     *  violating the policy based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def llmPolicy(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPolicyArgs.builder
      builder.llmPolicy(args(argsBuilder).build)

    /**
     * @param llmPromptSecurity Guardrail that blocks the conversation if the input is considered unsafe
     *  based on the LLM classification.
     *  Structure is documented below.
     * @return builder
     */
    def llmPromptSecurity(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityArgs.builder
      builder.llmPromptSecurity(args(argsBuilder).build)

    /**
     * @param modelSafety Model safety settings overrides. When this is set, it will override the
     *  default settings and trigger the guardrail if the response is considered
     *  unsafe.
     *  Structure is documented below.
     * @return builder
     */
    def modelSafety(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailModelSafetyArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailModelSafetyArgs.builder
      builder.modelSafety(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolResponseArgs.Builder)
    /**
     * @param toolsetTools (Output)
     *  A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolResponseToolsetToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolResponseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleMessageChunkToolResponseToolsetToolArgs.builder
      builder.toolsetTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityCustomPolicyArgs.Builder)
    /**
     * @param modelSettings (Output)
     *  Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityCustomPolicyModelSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityCustomPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailLlmPromptSecurityCustomPolicyModelSettingArgs.builder
      builder.modelSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesArgs.Builder)
    /**
     * @param toolResponses The list of tool execution results.
     *  Structure is documented below.
     * @return builder
     */
    def toolResponses(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesToolResponseArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepUserInputToolResponsesToolResponseArgs.builder
      builder.toolResponses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder)
    /**
     * @param afterAgentCallbacks (Output)
     *  The callbacks to execute after the agent is called.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentAfterAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentAfterAgentCallbackArgs.builder
      builder.afterAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterModelCallbacks (Output)
     *  The callbacks to execute after the model is called. If there are multiple
     *  calls to the model, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentAfterModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentAfterModelCallbackArgs.builder
      builder.afterModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param afterToolCallbacks (Output)
     *  The callbacks to execute after the tool is invoked. If there are multiple
     *  tool invocations, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def afterToolCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentAfterToolCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentAfterToolCallbackArgs.builder
      builder.afterToolCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeAgentCallbacks (Output)
     *  The callbacks to execute before the agent is called.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeAgentCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentBeforeAgentCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentBeforeAgentCallbackArgs.builder
      builder.beforeAgentCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeModelCallbacks (Output)
     *  The callbacks to execute before the model is called. If there are multiple
     *  calls to the model, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeModelCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentBeforeModelCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentBeforeModelCallbackArgs.builder
      builder.beforeModelCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param beforeToolCallbacks (Output)
     *  The callbacks to execute before the tool is invoked. If there are multiple
     *  tool invocations, the callback will be executed multiple times.
     *  The provided callbacks are executed sequentially in the exact order they
     *  are given in the list. If a callback returns an overridden response,
     *  execution stops and any remaining callbacks are skipped.
     *  Structure is documented below.
     * @return builder
     */
    def beforeToolCallbacks(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentBeforeToolCallbackArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentBeforeToolCallbackArgs.builder
      builder.beforeToolCallbacks(args.map(_(argsBuilder).build)*)

    /**
     * @param llmAgents (Output)
     *  Default agent type. The agent uses instructions and callbacks specified in
     *  the agent to perform the task using a large language model.
     * @return builder
     */
    def llmAgents(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentLlmAgentArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentLlmAgentArgs.builder
      builder.llmAgents(args.map(_(argsBuilder).build)*)

    /**
     * @param modelSettings (Output)
     *  Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentModelSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentModelSettingArgs.builder
      builder.modelSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteDialogflowAgents (Output)
     *  The agent which will transfer execution to an existing remote
     *  [Dialogflow](https://cloud.google.com/dialogflow/cx/docs/concept/console-conversational-agents)
     *  agent flow. The corresponding Dialogflow agent will process subsequent user
     *  queries until the session ends or flow ends and the control is transferred
     *  back to the parent CES agent.
     *  Structure is documented below.
     * @return builder
     */
    def remoteDialogflowAgents(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentRemoteDialogflowAgentArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentRemoteDialogflowAgentArgs.builder
      builder.remoteDialogflowAgents(args.map(_(argsBuilder).build)*)

    /**
     * @param toolsets (Output)
     *  List of toolsets for the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolsets(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentToolsetArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentToolsetArgs.builder
      builder.toolsets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigRewriterConfigArgs.Builder)
    /**
     * @param modelSettings (Output)
     *  Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigRewriterConfigModelSettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigRewriterConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigRewriterConfigModelSettingArgs.builder
      builder.modelSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecArgs.Builder)
    /**
     * @param conditionBoostSpecs (Output)
     *  A list of boosting specifications.
     *  Structure is documented below.
     * @return builder
     */
    def conditionBoostSpecs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecSpecConditionBoostSpecArgs.builder
      builder.conditionBoostSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailModelSafetyArgs.Builder)
    /**
     * @param safetySettings List of safety settings.
     *  Structure is documented below.
     * @return builder
     */
    def safetySettings(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailModelSafetySafetySettingArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.GuardrailModelSafetyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailModelSafetySafetySettingArgs.builder
      builder.safetySettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetTlsConfigArgs.Builder)
    /**
     * @param caCerts (Output)
     *  Specifies a list of allowed custom CA certificates for HTTPS
     *  verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetOpenApiToolsetTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsArgs.Builder)
    /**
     * @param expectationLevelMetricsThresholds Expectation level metrics thresholds.
     *  Structure is documented below.
     * @return builder
     */
    def expectationLevelMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsExpectationLevelMetricsThresholdsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsExpectationLevelMetricsThresholdsArgs.builder
      builder.expectationLevelMetricsThresholds(args(argsBuilder).build)

    /**
     * @param turnLevelMetricsThresholds Turn level metrics thresholds.
     *  Structure is documented below.
     * @return builder
     */
    def turnLevelMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsTurnLevelMetricsThresholdsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsGoldenEvaluationMetricsThresholdsTurnLevelMetricsThresholdsArgs.builder
      builder.turnLevelMetricsThresholds(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityCustomPolicyArgs.Builder)
    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityCustomPolicyModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityCustomPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.GuardrailLlmPromptSecurityCustomPolicyModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetState.Builder)
    /**
     * @param mcpToolset A toolset that contains a list of tools that are offered by the MCP
     *  server.
     *  Structure is documented below.
     * @return builder
     */
    def mcpToolset(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetMcpToolsetArgs.builder
      builder.mcpToolset(args(argsBuilder).build)

    /**
     * @param openApiToolset A toolset that contains a list of tools that are defined by an OpenAPI
     *  schema.
     *  Structure is documented below.
     * @return builder
     */
    def openApiToolset(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetArgs.builder
      builder.openApiToolset(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder)
    /**
     * @param apiKeyConfig Configurations for authentication with API key.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationApiKeyConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationApiKeyConfigArgs.builder
      builder.apiKeyConfig(args(argsBuilder).build)

    /**
     * @param bearerTokenConfig Configurations for authentication with a bearer token.
     *  Structure is documented below.
     * @return builder
     */
    def bearerTokenConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationBearerTokenConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationBearerTokenConfigArgs.builder
      builder.bearerTokenConfig(args(argsBuilder).build)

    /**
     * @param oauthConfig Configurations for authentication with OAuth.
     *  Structure is documented below.
     * @return builder
     */
    def oauthConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationOauthConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationOauthConfigArgs.builder
      builder.oauthConfig(args(argsBuilder).build)

    /**
     * @param serviceAccountAuthConfig Configurations for authentication using a custom service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccountAuthConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationServiceAccountAuthConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationServiceAccountAuthConfigArgs.builder
      builder.serviceAccountAuthConfig(args(argsBuilder).build)

    /**
     * @param serviceAgentIdTokenAuthConfig Configurations for authentication with [ID
     *  token](https://cloud.google.com/docs/authentication/token-types#id) generated
     *  from service agent.
     * @return builder
     */
    def serviceAgentIdTokenAuthConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationServiceAgentIdTokenAuthConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.ToolsetOpenApiToolsetApiAuthenticationServiceAgentIdTokenAuthConfigArgs.builder
      builder.serviceAgentIdTokenAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionState.Builder)
    /**
     * @param snapshots A snapshot of the app.
     *  Structure is documented below.
     * @return builder
     */
    def snapshots(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.builder
      builder.snapshots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.Builder)
    /**
     * @param connectorConfigs (Output)
     *  The connector config for the data store connection.
     *  Structure is documented below.
     * @return builder
     */
    def connectorConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceDataStoreConnectorConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceDataStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolDataStoreToolEngineSourceDataStoreSourceDataStoreConnectorConfigArgs.builder
      builder.connectorConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdArgs.Builder)
    /**
     * @param expectationLevelMetricsThresholds (Output)
     *  Expectation level metrics thresholds.
     *  Structure is documented below.
     * @return builder
     */
    def expectationLevelMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdExpectationLevelMetricsThresholdArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdExpectationLevelMetricsThresholdArgs.builder
      builder.expectationLevelMetricsThresholds(args.map(_(argsBuilder).build)*)

    /**
     * @param turnLevelMetricsThresholds (Output)
     *  Turn level metrics thresholds.
     *  Structure is documented below.
     * @return builder
     */
    def turnLevelMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdTurnLevelMetricsThresholdArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppEvaluationMetricsThresholdGoldenEvaluationMetricsThresholdTurnLevelMetricsThresholdArgs.builder
      builder.turnLevelMetricsThresholds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolResponseArgs.Builder)
    /**
     * @param toolsetTool A tool that is created from a toolset.
     *  Structure is documented below.
     * @return builder
     */
    def toolsetTool(args: Endofunction[com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolResponseToolsetToolArgs.Builder]):
        com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolResponseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.EvaluationGoldenTurnStepExpectationAgentResponseChunkToolResponseToolsetToolArgs.builder
      builder.toolsetTool(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolArgs.Builder)
    /**
     * @param boostSpecs (Output)
     *  Boost specification to boost certain documents.
     *  Structure is documented below.
     * @return builder
     */
    def boostSpecs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolBoostSpecArgs.builder
      builder.boostSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param engineSources (Output)
     *  Configuration for searching within an Engine, potentially targeting
     *  specific DataStores.
     *  Structure is documented below.
     * @return builder
     */
    def engineSources(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolEngineSourceArgs.builder
      builder.engineSources(args.map(_(argsBuilder).build)*)

    /**
     * @param modalityConfigs (Output)
     *  The modality configs for the data store.
     *  Structure is documented below.
     * @return builder
     */
    def modalityConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolDataStoreToolModalityConfigArgs.builder
      builder.modalityConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ToolOpenApiToolTlsConfigArgs.Builder)
    /**
     * @param caCerts (Output)
     *  Specifies a list of allowed custom CA certificates for HTTPS
     *  verification.
     *  Structure is documented below.
     * @return builder
     */
    def caCerts(args: Endofunction[com.pulumi.gcp.ces.inputs.ToolOpenApiToolTlsConfigCaCertArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ToolOpenApiToolTlsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ToolOpenApiToolTlsConfigCaCertArgs.builder
      builder.caCerts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.ExampleState.Builder)
    /**
     * @param messages The collection of messages that make up the conversation.
     *  Structure is documented below.
     * @return builder
     */
    def messages(args: Endofunction[com.pulumi.gcp.ces.inputs.ExampleMessageArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.ExampleState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.ExampleMessageArgs.builder
      builder.messages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppState.Builder)
    /**
     * @param audioProcessingConfig Configuration for how the input and output audio should be processed and
     *  delivered.
     *  Structure is documented below.
     * @return builder
     */
    def audioProcessingConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppAudioProcessingConfigArgs.builder
      builder.audioProcessingConfig(args(argsBuilder).build)

    /**
     * @param clientCertificateSettings The default client certificate settings for the app.
     *  Structure is documented below.
     * @return builder
     */
    def clientCertificateSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppClientCertificateSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppClientCertificateSettingsArgs.builder
      builder.clientCertificateSettings(args(argsBuilder).build)

    /**
     * @param dataStoreSettings Data store related settings for the app.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDataStoreSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppDataStoreSettingsArgs.builder
      builder.dataStoreSettings(args(argsBuilder).build)

    /**
     * @param defaultChannelProfile A ChannelProfile configures the agent&#39;s behavior for a specific communication
     *  channel, such as web UI or telephony.
     *  Structure is documented below.
     * @return builder
     */
    def defaultChannelProfile(args: Endofunction[com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppDefaultChannelProfileArgs.builder
      builder.defaultChannelProfile(args(argsBuilder).build)

    /**
     * @param evaluationMetricsThresholds Threshold settings for metrics in an Evaluation.
     *  Structure is documented below.
     * @return builder
     */
    def evaluationMetricsThresholds(args: Endofunction[com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppEvaluationMetricsThresholdsArgs.builder
      builder.evaluationMetricsThresholds(args(argsBuilder).build)

    /**
     * @param languageSettings Language settings of the app.
     *  Structure is documented below.
     * @return builder
     */
    def languageSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLanguageSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLanguageSettingsArgs.builder
      builder.languageSettings(args(argsBuilder).build)

    /**
     * @param loggingSettings Settings to describe the logging behaviors for the app.
     *  Structure is documented below.
     * @return builder
     */
    def loggingSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppLoggingSettingsArgs.builder
      builder.loggingSettings(args(argsBuilder).build)

    /**
     * @param modelSettings Model settings contains various configurations for the LLM model.
     *  Structure is documented below.
     * @return builder
     */
    def modelSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppModelSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppModelSettingsArgs.builder
      builder.modelSettings(args(argsBuilder).build)

    /**
     * @param timeZoneSettings TimeZone settings of the app.
     *  Structure is documented below.
     * @return builder
     */
    def timeZoneSettings(args: Endofunction[com.pulumi.gcp.ces.inputs.AppTimeZoneSettingsArgs.Builder]):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.AppTimeZoneSettingsArgs.builder
      builder.timeZoneSettings(args(argsBuilder).build)

    /**
     * @param variableDeclarations The declarations of the variables.
     *  Structure is documented below.
     * @return builder
     */
    def variableDeclarations(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVariableDeclarationArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppState.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVariableDeclarationArgs.builder
      builder.variableDeclarations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.Builder)
    /**
     * @param personaProperty Represents the persona property of a channel.
     *  Structure is documented below.
     * @return builder
     */
    def personaProperty(args: Endofunction[com.pulumi.gcp.ces.inputs.DeploymentChannelProfilePersonaPropertyArgs.Builder]):
        com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.DeploymentChannelProfilePersonaPropertyArgs.builder
      builder.personaProperty(args(argsBuilder).build)

    /**
     * @param webWidgetConfig Message for configuration for the web widget.
     *  Structure is documented below.
     * @return builder
     */
    def webWidgetConfig(args: Endofunction[com.pulumi.gcp.ces.inputs.DeploymentChannelProfileWebWidgetConfigArgs.Builder]):
        com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.DeploymentChannelProfileWebWidgetConfigArgs.builder
      builder.webWidgetConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.DeploymentState.Builder)
    /**
     * @param channelProfile A ChannelProfile configures the agent&#39;s behavior for a specific communication
     *  channel, such as web UI or telephony.
     *  Structure is documented below.
     * @return builder
     */
    def channelProfile(args: Endofunction[com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.Builder]):
        com.pulumi.gcp.ces.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.ces.inputs.DeploymentChannelProfileArgs.builder
      builder.channelProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder)
    /**
     * @param agents (Output)
     *  List of agents in the app.
     *  Structure is documented below.
     * @return builder
     */
    def agents(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAgentArgs.builder
      builder.agents(args.map(_(argsBuilder).build)*)

    /**
     * @param apps Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * @return builder
     */
    def apps(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppArgs.builder
      builder.apps(args.map(_(argsBuilder).build)*)

    /**
     * @param examples (Output)
     *  List of examples in the app.
     *  Structure is documented below.
     * @return builder
     */
    def examples(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotExampleArgs.builder
      builder.examples(args.map(_(argsBuilder).build)*)

    /**
     * @param guardrails (Output)
     *  List of guardrails for the app.
     *  Format:
     *  `projects/{project}/locations/{location}/apps/{app}/guardrails/{guardrail}`
     * @return builder
     */
    def guardrails(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotGuardrailArgs.builder
      builder.guardrails(args.map(_(argsBuilder).build)*)

    /**
     * @param tools (Output)
     *  List of available tools for the agent.
     *  Format: `projects/{project}/locations/{location}/apps/{app}/tools/{tool}`
     * @return builder
     */
    def tools(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolArgs.builder
      builder.tools(args.map(_(argsBuilder).build)*)

    /**
     * @param toolsets (Output)
     *  List of toolsets for the agent.
     *  Structure is documented below.
     * @return builder
     */
    def toolsets(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotToolsetArgs.builder
      builder.toolsets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileArgs.Builder)
    /**
     * @param personaProperties (Output)
     *  Represents the persona property of a channel.
     *  Structure is documented below.
     * @return builder
     */
    def personaProperties(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfilePersonaPropertyArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfilePersonaPropertyArgs.builder
      builder.personaProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param webWidgetConfigs (Output)
     *  Message for configuration for the web widget.
     *  Structure is documented below.
     * @return builder
     */
    def webWidgetConfigs(args: Endofunction[com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileWebWidgetConfigArgs.Builder]*):
        com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.ces.inputs.AppVersionSnapshotAppDefaultChannelProfileWebWidgetConfigArgs.builder
      builder.webWidgetConfigs(args.map(_(argsBuilder).build)*)
