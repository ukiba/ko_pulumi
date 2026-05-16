package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object discoveryengine:
  extension (builder: com.pulumi.gcp.discoveryengine.ControlArgs.Builder)
    /**
     * @param boostAction Changes the returned order of results.
     *  Structure is documented below.
     * @return builder
     */
    def boostAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.builder
      builder.boostAction(args(argsBuilder).build)

    /**
     * @param conditions The conditions under which the control is active.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param filterAction Removes entries from returned results.
     *  Structure is documented below.
     * @return builder
     */
    def filterAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.builder
      builder.filterAction(args(argsBuilder).build)

    /**
     * @param promoteAction Promotes a specified link for a query.
     *  Structure is documented below.
     * @return builder
     */
    def promoteAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.builder
      builder.promoteAction(args(argsBuilder).build)

    /**
     * @param redirectAction Redirects to a specified URI.
     *  Structure is documented below.
     * @return builder
     */
    def redirectAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.builder
      builder.redirectAction(args(argsBuilder).build)

    /**
     * @param synonymsAction Associates queries with each other.
     *  Structure is documented below.
     * @return builder
     */
    def synonymsAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ControlArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.builder
      builder.synonymsAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.AssistantArgs.Builder)
    /**
     * @param customerPolicy Customer policy for the assistant.
     *  Structure is documented below.
     * @return builder
     */
    def customerPolicy(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder]):
        com.pulumi.gcp.discoveryengine.AssistantArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.builder
      builder.customerPolicy(args(argsBuilder).build)

    /**
     * @param generationConfig Configuration for the generation of the assistant response.
     *  Structure is documented below.
     * @return builder
     */
    def generationConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.AssistantArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.builder
      builder.generationConfig(args(argsBuilder).build)

  /**
   * Vertex AI Search and Conversation can be used to create a search engine or a chat application by connecting it with a datastore
   * 
   *  To get more information about SearchEngine, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.engines)
   *  * How-to Guides
   *      * [Create a Search Engine](https://cloud.google.com/generative-ai-app-builder/docs/create-engine-es)
   */
  def SearchEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SearchEngineArgs.builder
    com.pulumi.gcp.discoveryengine.SearchEngine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Controls are rules that influence search results.
   * 
   *  To get more information about Control, see:
   * 
   *  * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1/projects.locations.collections.engines.controls)
   *  * How-to Guides
   *      * [Configure serving controls](https://cloud.google.com/gemini/enterprise/docs/configure-serving-controls)
   */
  def Control(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.ControlArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.ControlArgs.builder
    com.pulumi.gcp.discoveryengine.Control(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder)
    /**
     * @param endDate The planned end date.
     *  Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate The start date.
     *  Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  /**
   * Vertex AI Search recommendation apps.
   * 
   *  To get more information about RecommendationEngine, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.engines)
   *  * How-to Guides
   *      * [Create a Recommendation Engine](https://cloud.google.com/generative-ai-app-builder/docs/create-generic-recommendations-app)
   */
  def RecommendationEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.builder
    com.pulumi.gcp.discoveryengine.RecommendationEngine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Sitemap is a file where you provide information about the pages, videos, and
   *  other files on your site, and the relationships between them.
   * 
   *  To get more information about Sitemap, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.siteSearchEngine.sitemaps)
   */
  def Sitemap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SitemapArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SitemapArgs.builder
    com.pulumi.gcp.discoveryengine.Sitemap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Schema defines the structure and layout of a type of document data.
   * 
   *  To get more information about Schema, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.schemas)
   *  * How-to Guides
   *      * [Provide a schema for your data store](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema)
   */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SchemaArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SchemaArgs.builder
    com.pulumi.gcp.discoveryengine.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * TargetSite represents a URI pattern that the users want to confine their
   *  search.
   * 
   *  To get more information about TargetSite, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.siteSearchEngine.targetSites)
   */
  def TargetSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.TargetSiteArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.TargetSiteArgs.builder
    com.pulumi.gcp.discoveryengine.TargetSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder)
    /**
     * @param actionConfig Action configuration for the data connector. Configures action
     *  capabilities for connectors that support the ACTIONS connector mode.
     *  Structure is documented below.
     * @return builder
     */
    def actionConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.builder
      builder.actionConfig(args(argsBuilder).build)

    /**
     * @param bapConfig BAP (Business Application Platform) configuration for the data
     *  connector. Controls which actions are enabled for connectors
     *  using the ACTIONS connector mode.
     *  Structure is documented below.
     * @return builder
     */
    def bapConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.builder
      builder.bapConfig(args(argsBuilder).build)

    /**
     * @param destinationConfigs Destination connector configurations for the data connector,
     *  used to configure where data is served.
     *  Structure is documented below.
     * @return builder
     */
    def destinationConfigs(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.builder
      builder.destinationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param entities List of entities from the connected data source to ingest.
     *  Structure is documented below.
     * @return builder
     */
    def entities(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

  /**
   * Represents a WidgetConfig.
   * 
   *  To get more information about WidgetConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1alpha/projects.locations.collections.engines.widgetConfigs)
   */
  def WidgetConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.WidgetConfigArgs.builder
    com.pulumi.gcp.discoveryengine.WidgetConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder)
    /**
     * @param advancedSiteSearchConfig Configuration data for advance site search.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSiteSearchConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.builder
      builder.advancedSiteSearchConfig(args(argsBuilder).build)

    /**
     * @param documentProcessingConfig Configuration for Document understanding and enrichment.
     *  Structure is documented below.
     * @return builder
     */
    def documentProcessingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.builder
      builder.documentProcessingConfig(args(argsBuilder).build)

  /**
   * CmekConfig represents configurations used to enable CMEK data encryption with
   *  Cloud KMS keys.
   * 
   *  To get more information about CmekConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.cmekConfigs)
   */
  def CmekConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.CmekConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.CmekConfigArgs.builder
    com.pulumi.gcp.discoveryengine.CmekConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Vertex chat and Conversation Engine Chat type
   * 
   *  To get more information about ChatEngine, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.engines)
   *  * How-to Guides
   *      * [Vertex AI Conversation](https://cloud.google.com/dialogflow/cx/docs/concept/generative)
   */
  def ChatEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.ChatEngineArgs.builder
    com.pulumi.gcp.discoveryengine.ChatEngine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * DataConnector manages the connection to external data sources for all data stores grouped
   *  under a Collection. It&#39;s a singleton resource of Collection. The initialization is only
   *  supported through DataConnectorService.SetUpDataConnector method, which will create a new
   *  Collection and initialize its DataConnector.
   * 
   *  To get more information about DataConnector, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rpc/google.cloud.discoveryengine.v1alpha#dataconnectorservice)
   *  * How-to Guides
   *      * [Introduction](https://cloud.google.com/agentspace/docs/introduction-to-connectors-and-data-stores)
   */
  def DataConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.DataConnectorArgs.builder
    com.pulumi.gcp.discoveryengine.DataConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a user store.
   * 
   *  To get more information about UserStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1/projects.locations.userStores)
   */
  def UserStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.UserStoreArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.UserStoreArgs.builder
    com.pulumi.gcp.discoveryengine.UserStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     *  Structure is documented below.
     * @return builder
     */
    def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param knowledgeGraphConfig Configurations for the Knowledge Graph.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeGraphConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.builder
      builder.knowledgeGraphConfig(args(argsBuilder).build)

    /**
     * @param searchEngineConfig Configurations for a Search Engine.
     *  Structure is documented below.
     * @return builder
     */
    def searchEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.builder
      builder.searchEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.CmekConfigArgs.Builder)
    /**
     * @param singleRegionKeys Single-regional CMEKs that are required for some VAIS features.
     *  Structure is documented below.
     * @return builder
     */
    def singleRegionKeys(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.CmekConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.builder
      builder.singleRegionKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.AclConfigArgs.Builder)
    /**
     * @param idpConfig Identity provider config.
     *  Structure is documented below.
     * @return builder
     */
    def idpConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.AclConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder)
    /**
     * @param chatEngineConfig Configurations for a chat Engine.
     *  Structure is documented below.
     * @return builder
     */
    def chatEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.builder
      builder.chatEngineConfig(args(argsBuilder).build)

    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     *  Structure is documented below.
     * @return builder
     */
    def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

  /**
   * License Configuration.
   * 
   *  To get more information about LicenseConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.licenseConfigs)
   */
  def LicenseConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.LicenseConfigArgs.builder
    com.pulumi.gcp.discoveryengine.LicenseConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Access Control Configuration.
   * 
   *  To get more information about AclConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rpc/google.cloud.discoveryengine.v1alpha#aclconfigservice)
   */
  def AclConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.AclConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.AclConfigArgs.builder
    com.pulumi.gcp.discoveryengine.AclConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     *  Structure is documented below.
     * @return builder
     */
    def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param mediaRecommendationEngineConfig Configurations for a Media Recommendation Engine. Only applicable on the data stores
     *  with SOLUTION_TYPE_RECOMMENDATION solution type and MEDIA industry vertical.
     *  Structure is documented below.
     * @return builder
     */
    def mediaRecommendationEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.builder
      builder.mediaRecommendationEngineConfig(args(argsBuilder).build)

  /**
   * Data store is a collection of websites and documents used to find answers for
   *  end-user&#39;s questions in Discovery Engine (a.k.a. Vertex AI Search and
   *  Conversation).
   * 
   *  To get more information about DataStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores)
   *  * How-to Guides
   *      * [Create a search data store](https://cloud.google.com/generative-ai-app-builder/docs/create-data-store-es)
   */
  def DataStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.DataStoreArgs.builder
    com.pulumi.gcp.discoveryengine.DataStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a serving config which is a singleton resource under engine. A default
   *  serving config is automatically provisioned and deleted with its parent engine.
   * 
   *  To get more information about ServingConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1/projects.locations.collections.engines.servingConfigs)
   * 
   *  ## Import
   * 
   *  ServingConfig can be imported using any of these accepted formats:
   * 
   *  * `projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}/servingConfigs/{{serving_config_id}}`
   *  * `{{project}}/{{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}`
   *  * `{{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}`
   * 
   *  When using the `pulumi import` command, ServingConfig can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:discoveryengine/servingConfig:ServingConfig default projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}/servingConfigs/{{serving_config_id}}
   *  $ pulumi import gcp:discoveryengine/servingConfig:ServingConfig default {{project}}/{{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}
   *  $ pulumi import gcp:discoveryengine/servingConfig:ServingConfig default {{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}
   *  ```
   */
  def ServingConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.ServingConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.ServingConfigArgs.builder
    com.pulumi.gcp.discoveryengine.ServingConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder)
    /**
     * @param accessSettings Describes widget access settings.
     *  Structure is documented below.
     * @return builder
     */
    def accessSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.builder
      builder.accessSettings(args(argsBuilder).build)

    /**
     * @param homepageSetting Describes the homepage setting of the widget. It includes all homepage related settings
     *  and configurations, such as shortcuts.
     *  Structure is documented below.
     * @return builder
     */
    def homepageSetting(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.builder
      builder.homepageSetting(args(argsBuilder).build)

    /**
     * @param uiBranding Describes search widget UI branding settings, such as the widget title, logo,
     *  favicons, and colors.
     *  Structure is documented below.
     * @return builder
     */
    def uiBranding(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.builder
      builder.uiBranding(args(argsBuilder).build)

    /**
     * @param uiSettings Describes general widget (or web app) UI settings as seen in the cloud console UI configuration page.
     *  Structure is documented below.
     * @return builder
     */
    def uiSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.builder
      builder.uiSettings(args(argsBuilder).build)

  /**
   * Assistant
   * 
   *  To get more information about Assistant, see:
   * 
   *  * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rpc/google.cloud.discoveryengine.v1#assistantservice)
   */
  def Assistant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.AssistantArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.AssistantArgs.builder
    com.pulumi.gcp.discoveryengine.Assistant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder)
    /**
     * @param digitalParsingConfig Configurations applied to digital parser.
     * @return builder
     */
    def digitalParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideDigitalParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideDigitalParsingConfigArgs.builder
      builder.digitalParsingConfig(args(argsBuilder).build)

    /**
     * @param layoutParsingConfig Configurations applied to layout parser.
     *  Structure is documented below.
     * @return builder
     */
    def layoutParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs.builder
      builder.layoutParsingConfig(args(argsBuilder).build)

    /**
     * @param ocrParsingConfig Configurations applied to OCR parser. Currently it only applies to PDFs.
     *  Structure is documented below.
     * @return builder
     */
    def ocrParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfigArgs.builder
      builder.ocrParsingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder)
    /**
     * @param featureConfig Feature config for the Knowledge Graph.
     *  Structure is documented below.
     * @return builder
     */
    def featureConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigFeatureConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigFeatureConfigArgs.builder
      builder.featureConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder)
    /**
     * @param dataStoreUiConfigs Per data store configuration.
     *  Structure is documented below.
     * @return builder
     */
    def dataStoreUiConfigs(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.builder
      builder.dataStoreUiConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param generativeAnswerConfig Describes generative answer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def generativeAnswerConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsGenerativeAnswerConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsGenerativeAnswerConfigArgs.builder
      builder.generativeAnswerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder)
    /**
     * @param mostPopularConfig Feature configurations that are required for creating a Most Popular engine.
     *  Structure is documented below.
     * @return builder
     */
    def mostPopularConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigMostPopularConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigMostPopularConfigArgs.builder
      builder.mostPopularConfig(args(argsBuilder).build)

    /**
     * @param recommendedForYouConfig Additional feature configurations for creating a `recommended-for-you` engine.
     *  Structure is documented below.
     * @return builder
     */
    def recommendedForYouConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigRecommendedForYouConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigRecommendedForYouConfigArgs.builder
      builder.recommendedForYouConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder)
    /**
     * @param facetFields Structure is documented below.
     * @return builder
     */
    def facetFields(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFacetFieldArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFacetFieldArgs.builder
      builder.facetFields(args.map(_(argsBuilder).build)*)

    /**
     * @param fieldsUiComponentsMaps &#39;The key is the UI component. Currently supported `title`, `thumbnail`,
     *  `url`, `custom1`, `custom2`, `custom3`. The value is the name of
     *  the field along with its device visibility. The 3 custom fields are optional
     *  and can be added or removed.
     *  `title`, `thumbnail`, `url` are required UI components that cannot be removed.
     *  Structure is documented below.
     * @return builder
     */
    def fieldsUiComponentsMaps(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFieldsUiComponentsMapArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsDataStoreUiConfigFieldsUiComponentsMapArgs.builder
      builder.fieldsUiComponentsMaps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder)
    /**
     * @param externalIdpConfig External third party identity provider config.
     *  Structure is documented below.
     * @return builder
     */
    def externalIdpConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigExternalIdpConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigExternalIdpConfigArgs.builder
      builder.externalIdpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder)
    /**
     * @param bannedPhrases List of banned phrases.
     *  Structure is documented below.
     * @return builder
     */
    def bannedPhrases(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyBannedPhraseArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyBannedPhraseArgs.builder
      builder.bannedPhrases(args.map(_(argsBuilder).build)*)

    /**
     * @param modelArmorConfig Model Armor configuration to be used for sanitizing user prompts and assistant responses.
     *  Structure is documented below.
     * @return builder
     */
    def modelArmorConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyModelArmorConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyModelArmorConfigArgs.builder
      builder.modelArmorConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.Builder)
    /**
     * @param quotaFailure Site verification state indicating the ownership and validity.
     *  Structure is documented below.
     * @return builder
     */
    def quotaFailure(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonQuotaFailureArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonQuotaFailureArgs.builder
      builder.quotaFailure(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder)
    /**
     * @param boostAction Changes the returned order of results.
     *  Structure is documented below.
     * @return builder
     */
    def boostAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.builder
      builder.boostAction(args(argsBuilder).build)

    /**
     * @param conditions The conditions under which the control is active.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param filterAction Removes entries from returned results.
     *  Structure is documented below.
     * @return builder
     */
    def filterAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlFilterActionArgs.builder
      builder.filterAction(args(argsBuilder).build)

    /**
     * @param promoteAction Promotes a specified link for a query.
     *  Structure is documented below.
     * @return builder
     */
    def promoteAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.builder
      builder.promoteAction(args(argsBuilder).build)

    /**
     * @param redirectAction Redirects to a specified URI.
     *  Structure is documented below.
     * @return builder
     */
    def redirectAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlRedirectActionArgs.builder
      builder.redirectAction(args(argsBuilder).build)

    /**
     * @param synonymsAction Associates queries with each other.
     *  Structure is documented below.
     * @return builder
     */
    def synonymsAction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlSynonymsActionArgs.builder
      builder.synonymsAction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder)
    /**
     * @param destinations The list of destinations for this configuration.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigDestinationArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AssistantState.Builder)
    /**
     * @param customerPolicy Customer policy for the assistant.
     *  Structure is documented below.
     * @return builder
     */
    def customerPolicy(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantCustomerPolicyArgs.builder
      builder.customerPolicy(args(argsBuilder).build)

    /**
     * @param generationConfig Configuration for the generation of the assistant response.
     *  Structure is documented below.
     * @return builder
     */
    def generationConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.builder
      builder.generationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder)
    /**
     * @param chatEngineConfig Configurations for a chat Engine.
     *  Structure is documented below.
     * @return builder
     */
    def chatEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.builder
      builder.chatEngineConfig(args(argsBuilder).build)

    /**
     * @param chatEngineMetadatas Additional information of the Chat Engine.
     *  Structure is documented below.
     * @return builder
     */
    def chatEngineMetadatas(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineMetadataArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineMetadataArgs.builder
      builder.chatEngineMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     *  Structure is documented below.
     * @return builder
     */
    def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     *  Structure is documented below.
     * @return builder
     */
    def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param knowledgeGraphConfig Configurations for the Knowledge Graph.
     *  Structure is documented below.
     * @return builder
     */
    def knowledgeGraphConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineKnowledgeGraphConfigArgs.builder
      builder.knowledgeGraphConfig(args(argsBuilder).build)

    /**
     * @param searchEngineConfig Configurations for a Search Engine.
     *  Structure is documented below.
     * @return builder
     */
    def searchEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.SearchEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs.builder
      builder.searchEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder)
    /**
     * @param actionConfig Action configuration for the data connector. Configures action
     *  capabilities for connectors that support the ACTIONS connector mode.
     *  Structure is documented below.
     * @return builder
     */
    def actionConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorActionConfigArgs.builder
      builder.actionConfig(args(argsBuilder).build)

    /**
     * @param bapConfig BAP (Business Application Platform) configuration for the data
     *  connector. Controls which actions are enabled for connectors
     *  using the ACTIONS connector mode.
     *  Structure is documented below.
     * @return builder
     */
    def bapConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorBapConfigArgs.builder
      builder.bapConfig(args(argsBuilder).build)

    /**
     * @param destinationConfigs Destination connector configurations for the data connector,
     *  used to configure where data is served.
     *  Structure is documented below.
     * @return builder
     */
    def destinationConfigs(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorDestinationConfigArgs.builder
      builder.destinationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param entities List of entities from the connected data source to ingest.
     *  Structure is documented below.
     * @return builder
     */
    def entities(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorEntityArgs.builder
      builder.entities(args.map(_(argsBuilder).build)*)

    /**
     * @param errors The errors from initialization or from the latest connector run.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataConnectorErrorArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataConnectorState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataConnectorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder)
    /**
     * @param engineFeaturesConfig More feature configs of the selected engine type.
     *  Structure is documented below.
     * @return builder
     */
    def engineFeaturesConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigEngineFeaturesConfigArgs.builder
      builder.engineFeaturesConfig(args(argsBuilder).build)

    /**
     * @param optimizationObjectiveConfig Name and value of the custom threshold for cvr optimization_objective.
     *  For targetField `watch-time`, targetFieldValue must be an integer
     *  value indicating the media progress time in seconds between (0, 86400]
     *  (excludes 0, includes 86400) (e.g., 90).
     *  For targetField `watch-percentage`, the targetFieldValue must be a
     *  valid float value between (0, 1.0] (excludes 0, includes 1.0) (e.g., 0.5).
     *  Structure is documented below.
     * @return builder
     */
    def optimizationObjectiveConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigOptimizationObjectiveConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigOptimizationObjectiveConfigArgs.builder
      builder.optimizationObjectiveConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder)
    /**
     * @param digitalParsingConfig Configurations applied to digital parser.
     * @return builder
     */
    def digitalParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfigArgs.builder
      builder.digitalParsingConfig(args(argsBuilder).build)

    /**
     * @param layoutParsingConfig Configurations applied to layout parser.
     *  Structure is documented below.
     * @return builder
     */
    def layoutParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfigArgs.builder
      builder.layoutParsingConfig(args(argsBuilder).build)

    /**
     * @param ocrParsingConfig Configurations applied to OCR parser. Currently it only applies to PDFs.
     *  Structure is documented below.
     * @return builder
     */
    def ocrParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfigArgs.builder
      builder.ocrParsingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.TargetSiteState.Builder)
    /**
     * @param failureReasons Site search indexing failure reasons.
     *  Structure is documented below.
     * @return builder
     */
    def failureReasons(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.TargetSiteState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.TargetSiteFailureReasonArgs.builder
      builder.failureReasons(args.map(_(argsBuilder).build)*)

    /**
     * @param siteVerificationInfos Site ownership and validity verification status.
     *  Structure is documented below.
     * @return builder
     */
    def siteVerificationInfos(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.TargetSiteSiteVerificationInfoArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.TargetSiteState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.TargetSiteSiteVerificationInfoArgs.builder
      builder.siteVerificationInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.CmekConfigState.Builder)
    /**
     * @param singleRegionKeys Single-regional CMEKs that are required for some VAIS features.
     *  Structure is documented below.
     * @return builder
     */
    def singleRegionKeys(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.CmekConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.CmekConfigSingleRegionKeyArgs.builder
      builder.singleRegionKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineState.Builder)
    /**
     * @param commonConfig Common config spec that specifies the metadata of the engine.
     *  Structure is documented below.
     * @return builder
     */
    def commonConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineCommonConfigArgs.builder
      builder.commonConfig(args(argsBuilder).build)

    /**
     * @param mediaRecommendationEngineConfig Configurations for a Media Recommendation Engine. Only applicable on the data stores
     *  with SOLUTION_TYPE_RECOMMENDATION solution type and MEDIA industry vertical.
     *  Structure is documented below.
     * @return builder
     */
    def mediaRecommendationEngineConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.RecommendationEngineMediaRecommendationEngineConfigArgs.builder
      builder.mediaRecommendationEngineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.Builder)
    /**
     * @param icon Icon URL of shortcut.
     *  Structure is documented below.
     * @return builder
     */
    def icon(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutIconArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutIconArgs.builder
      builder.icon(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder)
    /**
     * @param searchLinkPromotion The search link promotion to apply to the search results.
     *  Structure is documented below.
     * @return builder
     */
    def searchLinkPromotion(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionSearchLinkPromotionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlPromoteActionSearchLinkPromotionArgs.builder
      builder.searchLinkPromotion(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AclConfigState.Builder)
    /**
     * @param idpConfig Identity provider config.
     *  Structure is documented below.
     * @return builder
     */
    def idpConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AclConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AclConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder)
    /**
     * @param accessSettings Describes widget access settings.
     *  Structure is documented below.
     * @return builder
     */
    def accessSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigAccessSettingsArgs.builder
      builder.accessSettings(args(argsBuilder).build)

    /**
     * @param homepageSetting Describes the homepage setting of the widget. It includes all homepage related settings
     *  and configurations, such as shortcuts.
     *  Structure is documented below.
     * @return builder
     */
    def homepageSetting(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.builder
      builder.homepageSetting(args(argsBuilder).build)

    /**
     * @param uiBranding Describes search widget UI branding settings, such as the widget title, logo,
     *  favicons, and colors.
     *  Structure is documented below.
     * @return builder
     */
    def uiBranding(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.builder
      builder.uiBranding(args(argsBuilder).build)

    /**
     * @param uiSettings Describes general widget (or web app) UI settings as seen in the cloud console UI configuration page.
     *  Structure is documented below.
     * @return builder
     */
    def uiSettings(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiSettingsArgs.builder
      builder.uiSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder)
    /**
     * @param chunkingConfig Whether chunking mode is enabled.
     *  Structure is documented below.
     * @return builder
     */
    def chunkingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.builder
      builder.chunkingConfig(args(argsBuilder).build)

    /**
     * @param defaultParsingConfig Configurations for default Document parser. If not specified, this resource
     *  will be configured to use a default DigitalParsingConfig, and the default parsing
     *  config will be applied to all file types for Document parsing.
     *  Structure is documented below.
     * @return builder
     */
    def defaultParsingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigDefaultParsingConfigArgs.builder
      builder.defaultParsingConfig(args(argsBuilder).build)

    /**
     * @param parsingConfigOverrides Map from file type to override the default parsing configuration based on the file type. Supported keys:
     * @return builder
     */
    def parsingConfigOverrides(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigParsingConfigOverrideArgs.builder
      builder.parsingConfigOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder)
    /**
     * @param interpolationBoostSpec The interpolation boost specification to apply to the search results.
     *  Structure is documented below.
     * @return builder
     */
    def interpolationBoostSpec(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.builder
      builder.interpolationBoostSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder)
    /**
     * @param shortcuts The shortcuts to display on the homepage.
     *  Structure is documented below.
     * @return builder
     */
    def shortcuts(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigHomepageSettingShortcutArgs.builder
      builder.shortcuts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder)
    /**
     * @param agentCreationConfig The configuration to generate the Dialogflow agent that is associated to this Engine.
     *  Exactly one of `agentCreationConfig` or `dialogflowAgentToLink` must be set.
     *  Structure is documented below.
     * @return builder
     */
    def agentCreationConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigAgentCreationConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigAgentCreationConfigArgs.builder
      builder.agentCreationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreState.Builder)
    /**
     * @param advancedSiteSearchConfig Configuration data for advance site search.
     *  Structure is documented below.
     * @return builder
     */
    def advancedSiteSearchConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreAdvancedSiteSearchConfigArgs.builder
      builder.advancedSiteSearchConfig(args(argsBuilder).build)

    /**
     * @param documentProcessingConfig Configuration for Document understanding and enrichment.
     *  Structure is documented below.
     * @return builder
     */
    def documentProcessingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigArgs.builder
      builder.documentProcessingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder)
    /**
     * @param activeTimeRanges The time range when the condition is active.
     *  Structure is documented below.
     * @return builder
     */
    def activeTimeRanges(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionActiveTimeRangeArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionActiveTimeRangeArgs.builder
      builder.activeTimeRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param queryTerms The query terms that must be present in the search request for this condition to be met.
     *  Structure is documented below.
     * @return builder
     */
    def queryTerms(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlConditionQueryTermArgs.Builder]*):
        com.pulumi.gcp.discoveryengine.inputs.ControlConditionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlConditionQueryTermArgs.builder
      builder.queryTerms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder)
    /**
     * @param logo Logo image.
     *  Structure is documented below.
     * @return builder
     */
    def logo(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingLogoArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.WidgetConfigUiBrandingLogoArgs.builder
      builder.logo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.Builder)
    /**
     * @param layoutBasedChunkingConfig Configuration for the layout based chunking.
     *  Structure is documented below.
     * @return builder
     */
    def layoutBasedChunkingConfig(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigLayoutBasedChunkingConfigArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.DataStoreDocumentProcessingConfigChunkingConfigLayoutBasedChunkingConfigArgs.builder
      builder.layoutBasedChunkingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.LicenseConfigState.Builder)
    /**
     * @param endDate The planned end date.
     *  Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.LicenseConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate The start date.
     *  Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.LicenseConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.LicenseConfigStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder)
    /**
     * @param systemInstruction System instruction, also known as the prompt preamble for LLM calls.
     *  See also https://cloud.google.com/vertex-ai/generative-ai/docs/learn/prompts/system-instructions
     *  Structure is documented below.
     * @return builder
     */
    def systemInstruction(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigSystemInstructionArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.AssistantGenerationConfigSystemInstructionArgs.builder
      builder.systemInstruction(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.Builder)
    /**
     * @param controlPoint The control points used to define the curve.
     *  Structure is documented below.
     * @return builder
     */
    def controlPoint(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecControlPointArgs.Builder]):
        com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.ControlBoostActionInterpolationBoostSpecControlPointArgs.builder
      builder.controlPoint(args(argsBuilder).build)

  object DiscoveryengineFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Gets an existing Discovery Engine data store by ID or display name.
     *  See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     *  and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/get).
     */
    inline def getDataStore(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStoreArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.discoveryengine.outputs.GetDataStoreResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStoreArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStore(args(argsBuilder).build)

    /**
     * Gets an existing Discovery Engine data store by ID or display name.
     *  See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     *  and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/get).
     */
    inline def getDataStorePlain(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStorePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.discoveryengine.outputs.GetDataStoreResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStorePlainArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStorePlain(args(argsBuilder).build)

    /**
     * Gets a list of existing Discovery Engine data stores.
     *  See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     *  and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/list).
     */
    inline def getDataStores(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStoresArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.discoveryengine.outputs.GetDataStoresResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStoresArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStores(args(argsBuilder).build)

    /**
     * Gets a list of existing Discovery Engine data stores.
     *  See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     *  and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/list).
     */
    inline def getDataStoresPlain(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStoresPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.discoveryengine.outputs.GetDataStoresResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStoresPlainArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStoresPlain(args(argsBuilder).build)
