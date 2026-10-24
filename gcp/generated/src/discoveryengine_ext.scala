package jp.ukiba.ko_pulumi
package gcp

object discoveryengine_ext:
  extension (builder: com.pulumi.gcp.discoveryengine.AclConfigArgs.Builder)
    /**
     * @param idpConfig Identity provider config.
     * Structure is documented below.
     * @return builder
     */
    inline def idpConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.AclConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.AssistantArgs.Builder)
    /**
     * @param customerPolicy Customer policy for the assistant.
     * Structure is documented below.
     * @return builder
     */
    inline def customerPolicy(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder]):
        com.pulumi.gcp.discoveryengine.AssistantArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.builder
      builder.customerPolicy(args(argsBuilder).build)

    /**
     * @param generationConfig Configuration for the generation of the assistant response.
     * Structure is documented below.
     * @return builder
     */
    inline def generationConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.AssistantArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.builder
      builder.generationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder)
    /**
     * @param chatEngineConfig Configurations for a chat Engine.
     * Structure is documented below.
     * @return builder
     */
    inline def chatEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.builder
      builder.chatEngineConfig(args(argsBuilder).build)

    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * @return builder
     */
    inline def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.CmekConfigArgs.Builder)
    /**
     * @param singleRegionKeys Single-regional CMEKs that are required for some VAIS features.
     * Structure is documented below.
     * @return builder
     */
    inline def singleRegionKeys(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.CmekConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.builder
      builder.singleRegionKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.ControlArgs.Builder)
    /**
     * @param boostAction Changes the returned order of results.
     * Structure is documented below.
     * @return builder
     */
    inline def boostAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.builder
      builder.boostAction(args(argsBuilder).build)

    /**
     * @param conditions The conditions under which the control is active.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param filterAction Removes entries from returned results.
     * Structure is documented below.
     * @return builder
     */
    inline def filterAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.builder
      builder.filterAction(args(argsBuilder).build)

    /**
     * @param promoteAction Promotes a specified link for a query.
     * Structure is documented below.
     * @return builder
     */
    inline def promoteAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.builder
      builder.promoteAction(args(argsBuilder).build)

    /**
     * @param redirectAction Redirects to a specified URI.
     * Structure is documented below.
     * @return builder
     */
    inline def redirectAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.builder
      builder.redirectAction(args(argsBuilder).build)

    /**
     * @param synonymsAction Associates queries with each other.
     * Structure is documented below.
     * @return builder
     */
    inline def synonymsAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.builder
      builder.synonymsAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder)
    /**
     * @param actionConfig Action configuration for the data connector. Configures action
     * capabilities for connectors that support the ACTIONS connector mode.
     * Structure is documented below.
     * @return builder
     */
    inline def actionConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.builder
      builder.actionConfig(args(argsBuilder).build)

    /**
     * @param bapConfig BAP (Business Application Platform) configuration for the data
     * connector. Controls which actions are enabled for connectors
     * using the ACTIONS connector mode.
     * Structure is documented below.
     * @return builder
     */
    inline def bapConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.builder
      builder.bapConfig(args(argsBuilder).build)

    /**
     * @param destinationConfigs Destination connector configurations for the data connector,
     * used to configure where data is served.
     * Structure is documented below.
     * @return builder
     */
    inline def destinationConfigs(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.builder
      builder.destinationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param entities List of entities from the connected data source to ingest.
     * Structure is documented below.
     * @return builder
     */
    inline def entities(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata User-facing metadata for the connector.
     * Structure is documented below.
     * @return builder
     */
    inline def metadata(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorMetadataArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder)
    /**
     * @param advancedSiteSearchConfig Configuration data for advance site search.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedSiteSearchConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.builder
      builder.advancedSiteSearchConfig(args(argsBuilder).build)

    /**
     * @param documentProcessingConfig Configuration for Document understanding and enrichment.
     * Structure is documented below.
     * @return builder
     */
    inline def documentProcessingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.builder
      builder.documentProcessingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder)
    /**
     * @param endDate The planned end date.
     * Structure is documented below.
     * @return builder
     */
    inline def endDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate The start date.
     * Structure is documented below.
     * @return builder
     */
    inline def startDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * @return builder
     */
    inline def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param mediaRecommendationEngineConfig Configurations for a Media Recommendation Engine. Only applicable on the data stores
     * with SOLUTION_TYPE_RECOMMENDATION solution type and MEDIA industry vertical.
     * Structure is documented below.
     * @return builder
     */
    inline def mediaRecommendationEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.builder
      builder.mediaRecommendationEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * @return builder
     */
    inline def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param knowledgeGraphConfig Configurations for the Knowledge Graph.
     * Structure is documented below.
     * @return builder
     */
    inline def knowledgeGraphConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.builder
      builder.knowledgeGraphConfig(args(argsBuilder).build)

    /**
     * @param searchEngineConfig Configurations for a Search Engine.
     * Structure is documented below.
     * @return builder
     */
    inline def searchEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.builder
      builder.searchEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder)
    /**
     * @param accessSettings Describes widget access settings.
     * Structure is documented below.
     * @return builder
     */
    inline def accessSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.builder
      builder.accessSettings(args(argsBuilder).build)

    /**
     * @param homepageSetting Describes the homepage setting of the widget. It includes all homepage related settings
     * and configurations, such as shortcuts.
     * Structure is documented below.
     * @return builder
     */
    inline def homepageSetting(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.builder
      builder.homepageSetting(args(argsBuilder).build)

    /**
     * @param uiBranding Describes search widget UI branding settings, such as the widget title, logo,
     * favicons, and colors.
     * Structure is documented below.
     * @return builder
     */
    inline def uiBranding(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.builder
      builder.uiBranding(args(argsBuilder).build)

    /**
     * @param uiSettings Describes general widget (or web app) UI settings as seen in the cloud console UI configuration page.
     * Structure is documented below.
     * @return builder
     */
    inline def uiSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.builder
      builder.uiSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder)
    /**
     * @param externalIdpConfig External third party identity provider config.
     * Structure is documented below.
     * @return builder
     */
    inline def externalIdpConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigExternalIdpConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigExternalIdpConfigArgs.builder
      builder.externalIdpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AclConfigState.Builder)
    /**
     * @param idpConfig Identity provider config.
     * Structure is documented below.
     * @return builder
     */
    inline def idpConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AclConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder)
    /**
     * @param bannedPhrases List of banned phrases.
     * Structure is documented below.
     * @return builder
     */
    inline def bannedPhrases(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyBannedPhraseArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyBannedPhraseArgs.builder
      builder.bannedPhrases(args.map(_(argsBuilder).build)*)

    /**
     * @param modelArmorConfig Model Armor configuration to be used for sanitizing user prompts and assistant responses.
     * Structure is documented below.
     * @return builder
     */
    inline def modelArmorConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyModelArmorConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyModelArmorConfigArgs.builder
      builder.modelArmorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder)
    /**
     * @param systemInstruction System instruction, also known as the prompt preamble for LLM calls.
     * See also https://cloud.google.com/vertex-ai/generative-ai/docs/learn/prompts/system-instructions
     * Structure is documented below.
     * @return builder
     */
    inline def systemInstruction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigSystemInstructionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigSystemInstructionArgs.builder
      builder.systemInstruction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AssistantState.Builder)
    /**
     * @param customerPolicy Customer policy for the assistant.
     * Structure is documented below.
     * @return builder
     */
    inline def customerPolicy(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.builder
      builder.customerPolicy(args(argsBuilder).build)

    /**
     * @param generationConfig Configuration for the generation of the assistant response.
     * Structure is documented below.
     * @return builder
     */
    inline def generationConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.builder
      builder.generationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder)
    /**
     * @param agentCreationConfig The configuration to generate the Dialogflow agent that is associated to this Engine.
     * Exactly one of `agentCreationConfig` or `dialogflowAgentToLink` must be set.
     * Structure is documented below.
     * @return builder
     */
    inline def agentCreationConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigAgentCreationConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigAgentCreationConfigArgs.builder
      builder.agentCreationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder)
    /**
     * @param chatEngineConfig Configurations for a chat Engine.
     * Structure is documented below.
     * @return builder
     */
    inline def chatEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.builder
      builder.chatEngineConfig(args(argsBuilder).build)

    /**
     * @param chatEngineMetadatas Additional information of the Chat Engine.
     * Structure is documented below.
     * @return builder
     */
    inline def chatEngineMetadatas(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineMetadataArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineMetadataArgs.builder
      builder.chatEngineMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * @return builder
     */
    inline def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.CmekConfigState.Builder)
    /**
     * @param singleRegionKeys Single-regional CMEKs that are required for some VAIS features.
     * Structure is documented below.
     * @return builder
     */
    inline def singleRegionKeys(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.CmekConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.builder
      builder.singleRegionKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder)
    /**
     * @param interpolationBoostSpec The interpolation boost specification to apply to the search results.
     * Structure is documented below.
     * @return builder
     */
    inline def interpolationBoostSpec(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.builder
      builder.interpolationBoostSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.Builder)
    /**
     * @param controlPoint The control points used to define the curve.
     * Structure is documented below.
     * @return builder
     */
    inline def controlPoint(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecControlPointArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecControlPointArgs.builder
      builder.controlPoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder)
    /**
     * @param activeTimeRanges The time range when the condition is active.
     * Structure is documented below.
     * @return builder
     */
    inline def activeTimeRanges(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionActiveTimeRangeArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionActiveTimeRangeArgs.builder
      builder.activeTimeRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param queryTerms The query terms that must be present in the search request for this condition to be met.
     * Structure is documented below.
     * @return builder
     */
    inline def queryTerms(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionQueryTermArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionQueryTermArgs.builder
      builder.queryTerms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder)
    /**
     * @param searchLinkPromotion The search link promotion to apply to the search results.
     * Structure is documented below.
     * @return builder
     */
    inline def searchLinkPromotion(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionSearchLinkPromotionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionSearchLinkPromotionArgs.builder
      builder.searchLinkPromotion(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder)
    /**
     * @param boostAction Changes the returned order of results.
     * Structure is documented below.
     * @return builder
     */
    inline def boostAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.builder
      builder.boostAction(args(argsBuilder).build)

    /**
     * @param conditions The conditions under which the control is active.
     * Structure is documented below.
     * @return builder
     */
    inline def conditions(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param filterAction Removes entries from returned results.
     * Structure is documented below.
     * @return builder
     */
    inline def filterAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.builder
      builder.filterAction(args(argsBuilder).build)

    /**
     * @param promoteAction Promotes a specified link for a query.
     * Structure is documented below.
     * @return builder
     */
    inline def promoteAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.builder
      builder.promoteAction(args(argsBuilder).build)

    /**
     * @param redirectAction Redirects to a specified URI.
     * Structure is documented below.
     * @return builder
     */
    inline def redirectAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.builder
      builder.redirectAction(args(argsBuilder).build)

    /**
     * @param synonymsAction Associates queries with each other.
     * Structure is documented below.
     * @return builder
     */
    inline def synonymsAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.builder
      builder.synonymsAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder)
    /**
     * @param destinations The list of destinations for this configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigDestinationArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder)
    /**
     * @param actionConfig Action configuration for the data connector. Configures action
     * capabilities for connectors that support the ACTIONS connector mode.
     * Structure is documented below.
     * @return builder
     */
    inline def actionConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.builder
      builder.actionConfig(args(argsBuilder).build)

    /**
     * @param bapConfig BAP (Business Application Platform) configuration for the data
     * connector. Controls which actions are enabled for connectors
     * using the ACTIONS connector mode.
     * Structure is documented below.
     * @return builder
     */
    inline def bapConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.builder
      builder.bapConfig(args(argsBuilder).build)

    /**
     * @param destinationConfigs Destination connector configurations for the data connector,
     * used to configure where data is served.
     * Structure is documented below.
     * @return builder
     */
    inline def destinationConfigs(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.builder
      builder.destinationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param entities List of entities from the connected data source to ingest.
     * Structure is documented below.
     * @return builder
     */
    inline def entities(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

    /**
     * @param errors The errors from initialization or from the latest connector run.
     * Structure is documented below.
     * @return builder
     */
    inline def errors(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorErrorArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata User-facing metadata for the connector.
     * Structure is documented below.
     * @return builder
     */
    inline def metadata(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorMetadataArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder)
    /**
     * @param chunkingConfig Whether chunking mode is enabled.
     * Structure is documented below.
     * @return builder
     */
    inline def chunkingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.builder
      builder.chunkingConfig(args(argsBuilder).build)

    /**
     * @param defaultParsingConfig Configurations for default Document parser. If not specified, this resource
     * will be configured to use a default DigitalParsingConfig, and the default parsing
     * config will be applied to all file types for Document parsing.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.builder
      builder.defaultParsingConfig(args(argsBuilder).build)

    /**
     * @param parsingConfigOverrides Map from file type to override the default parsing configuration based on the file type. Supported keys:
     * @return builder
     */
    inline def parsingConfigOverrides(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.builder
      builder.parsingConfigOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.Builder)
    /**
     * @param layoutBasedChunkingConfig Configuration for the layout based chunking.
     * Structure is documented below.
     * @return builder
     */
    inline def layoutBasedChunkingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigLayoutBasedChunkingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigLayoutBasedChunkingConfigArgs.builder
      builder.layoutBasedChunkingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder)
    /**
     * @param digitalParsingConfig Configurations applied to digital parser.
     * @return builder
     */
    inline def digitalParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfigArgs.builder
      builder.digitalParsingConfig(args(argsBuilder).build)

    /**
     * @param layoutParsingConfig Configurations applied to layout parser.
     * Structure is documented below.
     * @return builder
     */
    inline def layoutParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfigArgs.builder
      builder.layoutParsingConfig(args(argsBuilder).build)

    /**
     * @param ocrParsingConfig Configurations applied to OCR parser. Currently it only applies to PDFs.
     * Structure is documented below.
     * @return builder
     */
    inline def ocrParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfigArgs.builder
      builder.ocrParsingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder)
    /**
     * @param digitalParsingConfig Configurations applied to digital parser.
     * @return builder
     */
    inline def digitalParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideDigitalParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideDigitalParsingConfigArgs.builder
      builder.digitalParsingConfig(args(argsBuilder).build)

    /**
     * @param layoutParsingConfig Configurations applied to layout parser.
     * Structure is documented below.
     * @return builder
     */
    inline def layoutParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs.builder
      builder.layoutParsingConfig(args(argsBuilder).build)

    /**
     * @param ocrParsingConfig Configurations applied to OCR parser. Currently it only applies to PDFs.
     * Structure is documented below.
     * @return builder
     */
    inline def ocrParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfigArgs.builder
      builder.ocrParsingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreState.Builder)
    /**
     * @param advancedSiteSearchConfig Configuration data for advance site search.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedSiteSearchConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.builder
      builder.advancedSiteSearchConfig(args(argsBuilder).build)

    /**
     * @param documentProcessingConfig Configuration for Document understanding and enrichment.
     * Structure is documented below.
     * @return builder
     */
    inline def documentProcessingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.builder
      builder.documentProcessingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.LicenseConfigState.Builder)
    /**
     * @param endDate The planned end date.
     * Structure is documented below.
     * @return builder
     */
    inline def endDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.LicenseConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate The start date.
     * Structure is documented below.
     * @return builder
     */
    inline def startDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.LicenseConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder)
    /**
     * @param engineFeaturesConfig More feature configs of the selected engine type.
     * Structure is documented below.
     * @return builder
     */
    inline def engineFeaturesConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.builder
      builder.engineFeaturesConfig(args(argsBuilder).build)

    /**
     * @param optimizationObjectiveConfig Name and value of the custom threshold for cvr optimization_objective.
     * For targetField `watch-time`, targetFieldValue must be an integer
     * value indicating the media progress time in seconds between (0, 86400]
     * (excludes 0, includes 86400) (e.g., 90).
     * For targetField `watch-percentage`, the targetFieldValue must be a
     * valid float value between (0, 1.0] (excludes 0, includes 1.0) (e.g., 0.5).
     * Structure is documented below.
     * @return builder
     */
    inline def optimizationObjectiveConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigOptimizationObjectiveConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigOptimizationObjectiveConfigArgs.builder
      builder.optimizationObjectiveConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder)
    /**
     * @param mostPopularConfig Feature configurations that are required for creating a Most Popular engine.
     * Structure is documented below.
     * @return builder
     */
    inline def mostPopularConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigMostPopularConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigMostPopularConfigArgs.builder
      builder.mostPopularConfig(args(argsBuilder).build)

    /**
     * @param recommendedForYouConfig Additional feature configurations for creating a `recommended-for-you` engine.
     * Structure is documented below.
     * @return builder
     */
    inline def recommendedForYouConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigRecommendedForYouConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigRecommendedForYouConfigArgs.builder
      builder.recommendedForYouConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineState.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * @return builder
     */
    inline def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param mediaRecommendationEngineConfig Configurations for a Media Recommendation Engine. Only applicable on the data stores
     * with SOLUTION_TYPE_RECOMMENDATION solution type and MEDIA industry vertical.
     * Structure is documented below.
     * @return builder
     */
    inline def mediaRecommendationEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.builder
      builder.mediaRecommendationEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder)
    /**
     * @param featureConfig Feature config for the Knowledge Graph.
     * Structure is documented below.
     * @return builder
     */
    inline def featureConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigFeatureConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigFeatureConfigArgs.builder
      builder.featureConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * @return builder
     */
    inline def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param knowledgeGraphConfig Configurations for the Knowledge Graph.
     * Structure is documented below.
     * @return builder
     */
    inline def knowledgeGraphConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.builder
      builder.knowledgeGraphConfig(args(argsBuilder).build)

    /**
     * @param searchEngineConfig Configurations for a Search Engine.
     * Structure is documented below.
     * @return builder
     */
    inline def searchEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.builder
      builder.searchEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.Builder)
    /**
     * @param quotaFailure Site verification state indicating the ownership and validity.
     * Structure is documented below.
     * @return builder
     */
    inline def quotaFailure(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonQuotaFailureArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonQuotaFailureArgs.builder
      builder.quotaFailure(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.TargetSiteState.Builder)
    /**
     * @param failureReasons Site search indexing failure reasons.
     * Structure is documented below.
     * @return builder
     */
    inline def failureReasons(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.TargetSiteState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.builder
      builder.failureReasons(args.map(_(argsBuilder).build)*)

    /**
     * @param siteVerificationInfos Site ownership and validity verification status.
     * Structure is documented below.
     * @return builder
     */
    inline def siteVerificationInfos(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.TargetSiteSiteVerificationInfoArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.TargetSiteState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.TargetSiteSiteVerificationInfoArgs.builder
      builder.siteVerificationInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder)
    /**
     * @param shortcuts The shortcuts to display on the homepage.
     * Structure is documented below.
     * @return builder
     */
    inline def shortcuts(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.builder
      builder.shortcuts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.Builder)
    /**
     * @param icon Icon URL of shortcut.
     * Structure is documented below.
     * @return builder
     */
    inline def icon(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutIconArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutIconArgs.builder
      builder.icon(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder)
    /**
     * @param accessSettings Describes widget access settings.
     * Structure is documented below.
     * @return builder
     */
    inline def accessSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.builder
      builder.accessSettings(args(argsBuilder).build)

    /**
     * @param homepageSetting Describes the homepage setting of the widget. It includes all homepage related settings
     * and configurations, such as shortcuts.
     * Structure is documented below.
     * @return builder
     */
    inline def homepageSetting(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.builder
      builder.homepageSetting(args(argsBuilder).build)

    /**
     * @param uiBranding Describes search widget UI branding settings, such as the widget title, logo,
     * favicons, and colors.
     * Structure is documented below.
     * @return builder
     */
    inline def uiBranding(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.builder
      builder.uiBranding(args(argsBuilder).build)

    /**
     * @param uiSettings Describes general widget (or web app) UI settings as seen in the cloud console UI configuration page.
     * Structure is documented below.
     * @return builder
     */
    inline def uiSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.builder
      builder.uiSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder)
    /**
     * @param logo Logo image.
     * Structure is documented below.
     * @return builder
     */
    inline def logo(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingLogoArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingLogoArgs.builder
      builder.logo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder)
    /**
     * @param dataStoreUiConfigs Per data store configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def dataStoreUiConfigs(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.builder
      builder.dataStoreUiConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param generativeAnswerConfig Describes generative answer configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def generativeAnswerConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsGenerativeAnswerConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsGenerativeAnswerConfigArgs.builder
      builder.generativeAnswerConfig(args(argsBuilder).build)

    /**
     * @param searchAddonSpec SearchAddonSpec is used to disable add-ons for search. By default, if this
     * field is not specified, add-ons are enabled wherever applicable.
     * This field is only supported for search requests.
     * Structure is documented below.
     * @return builder
     */
    inline def searchAddonSpec(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsSearchAddonSpecArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsSearchAddonSpecArgs.builder
      builder.searchAddonSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder)
    /**
     * @param facetFields Structure is documented below.
     * @return builder
     */
    inline def facetFields(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFacetFieldArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFacetFieldArgs.builder
      builder.facetFields(args.map(_(argsBuilder).build)*)

    /**
     * @param fieldsUiComponentsMaps &#39;The key is the UI component. Currently supported `title`, `thumbnail`,
     * `url`, `custom1`, `custom2`, `custom3`. The value is the name of
     * the field along with its device visibility. The 3 custom fields are optional
     * and can be added or removed.
     * `title`, `thumbnail`, `url` are required UI components that cannot be removed.
     * Structure is documented below.
     * @return builder
     */
    inline def fieldsUiComponentsMaps(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFieldsUiComponentsMapArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFieldsUiComponentsMapArgs.builder
      builder.fieldsUiComponentsMaps(args.map(_(argsBuilder).build)*)
