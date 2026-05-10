package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object apihub:
  extension (builder: com.pulumi.gcp.apihub.PluginInstanceArgs.Builder)
    /**
     * @param actions The action status for the plugin instance.
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.Builder]*):
        com.pulumi.gcp.apihub.PluginInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param authConfig AuthConfig represents the authentication information.
     *  Structure is documented below.
     * @return builder
     */
    def authConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder]):
        com.pulumi.gcp.apihub.PluginInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.builder
      builder.authConfig(args(argsBuilder).build)

  /**
   * An ApiHubInstance represents the instance resources of the API Hub.
   *  Currently, only one ApiHub instance is allowed for each project.
   *  Currently, updation/deletion of ApiHub instance is not allowed.
   */
  def ApiHubInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.ApiHubInstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apihub.ApiHubInstanceArgs.builder
    com.pulumi.gcp.apihub.ApiHubInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Description */
  def PluginInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.PluginInstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apihub.PluginInstanceArgs.builder
    com.pulumi.gcp.apihub.PluginInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apihub.PluginArgs.Builder)
    /**
     * @param actionsConfigs The configuration of actions supported by the plugin.
     *  Structure is documented below.
     * @return builder
     */
    def actionsConfigs(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginActionsConfigArgs.Builder]*):
        com.pulumi.gcp.apihub.PluginArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginActionsConfigArgs.builder
      builder.actionsConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param configTemplate ConfigTemplate represents the configuration template for a plugin.
     *  Structure is documented below.
     * @return builder
     */
    def configTemplate(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.Builder]):
        com.pulumi.gcp.apihub.PluginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.builder
      builder.configTemplate(args(argsBuilder).build)

    /**
     * @param documentation Documentation details.
     *  Structure is documented below.
     * @return builder
     */
    def documentation(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginDocumentationArgs.Builder]):
        com.pulumi.gcp.apihub.PluginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginDocumentationArgs.builder
      builder.documentation(args(argsBuilder).build)

    /**
     * @param hostingService The information related to the service implemented by the plugin
     *  developer, used to invoke the plugin&#39;s functionality.
     *  Structure is documented below.
     * @return builder
     */
    def hostingService(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginHostingServiceArgs.Builder]):
        com.pulumi.gcp.apihub.PluginArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginHostingServiceArgs.builder
      builder.hostingService(args(argsBuilder).build)

  /** A plugin resource in the API hub. */
  def Plugin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.PluginArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apihub.PluginArgs.builder
    com.pulumi.gcp.apihub.Plugin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apihub.ApiHubInstanceArgs.Builder)
    /**
     * @param config Available configurations to provision an ApiHub Instance.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.apihub.inputs.ApiHubInstanceConfigArgs.Builder]):
        com.pulumi.gcp.apihub.ApiHubInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.ApiHubInstanceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  /**
   * Host project registration refers to the registration of a Google cloud project with API hub as a host project.
   *  This is the project where API hub is provisioned.
   *  It acts as the consumer project for the API hub instance provisioned.
   *  Multiple runtime projects can be attached to the host project and these attachments define the scope of API hub.
   */
  def HostProjectRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.HostProjectRegistrationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apihub.HostProjectRegistrationArgs.builder
    com.pulumi.gcp.apihub.HostProjectRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Description */
  def Curation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.CurationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apihub.CurationArgs.builder
    com.pulumi.gcp.apihub.Curation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apihub.CurationArgs.Builder)
    /**
     * @param endpoint The endpoint to be triggered for curation.
     *  The endpoint will be invoked with a request payload containing
     *  ApiMetadata.
     *  Response should contain curated data in the form of
     *  ApiMetadata.
     *  Structure is documented below.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.gcp.apihub.inputs.CurationEndpointArgs.Builder]):
        com.pulumi.gcp.apihub.CurationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.CurationEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder)
    /**
     * @param apiKeyConfig Config for authentication with API key.
     *  Structure is documented below.
     * @return builder
     */
    def apiKeyConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigApiKeyConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigApiKeyConfigArgs.builder
      builder.apiKeyConfig(args(argsBuilder).build)

    /**
     * @param googleServiceAccountConfig Config for Google service account authentication.
     *  Structure is documented below.
     * @return builder
     */
    def googleServiceAccountConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigGoogleServiceAccountConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigGoogleServiceAccountConfigArgs.builder
      builder.googleServiceAccountConfig(args(argsBuilder).build)

    /**
     * @param oauth2ClientCredentialsConfig Parameters to support Oauth 2.0 client credentials grant authentication.
     *  See https://tools.ietf.org/html/rfc6749#section-1.3.4 for more details.
     *  Structure is documented below.
     * @return builder
     */
    def oauth2ClientCredentialsConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfigArgs.builder
      builder.oauth2ClientCredentialsConfig(args(argsBuilder).build)

    /**
     * @param userPasswordConfig Parameters to support Username and Password Authentication.
     *  Structure is documented below.
     * @return builder
     */
    def userPasswordConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigUserPasswordConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigUserPasswordConfigArgs.builder
      builder.userPasswordConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigApiKeyConfigArgs.Builder)
    /**
     * @param apiKey Secret provides a reference to entries in Secret Manager.
     *  Structure is documented below.
     * @return builder
     */
    def apiKey(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigApiKeyConfigApiKeyArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigApiKeyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigApiKeyConfigApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.ApiHubInstanceState.Builder)
    /**
     * @param config Available configurations to provision an ApiHub Instance.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.apihub.inputs.ApiHubInstanceConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.ApiHubInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.ApiHubInstanceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfigArgs.Builder)
    /**
     * @param clientSecret Secret provides a reference to entries in Secret Manager.
     * @return builder
     */
    def clientSecret(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfigClientSecretArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigOauth2ClientCredentialsConfigClientSecretArgs.builder
      builder.clientSecret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionArgs.Builder)
    /**
     * @param lastExecutions The result of the last execution of the plugin instance.
     * @return builder
     */
    def lastExecutions(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionLastExecutionArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionLastExecutionArgs.builder
      builder.lastExecutions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigUserPasswordConfigArgs.Builder)
    /**
     * @param password Secret provides a reference to entries in Secret Manager.
     *  Structure is documented below.
     * @return builder
     */
    def password(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigUserPasswordConfigPasswordArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigUserPasswordConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigUserPasswordConfigPasswordArgs.builder
      builder.password(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceState.Builder)
    /**
     * @param actions The action status for the plugin instance.
     *  Structure is documented below.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginInstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param authConfig AuthConfig represents the authentication information.
     *  Structure is documented below.
     * @return builder
     */
    def authConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceAuthConfigArgs.builder
      builder.authConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigArgs.Builder)
    /**
     * @param customCuration Custom curation information for this plugin instance.
     *  Structure is documented below.
     * @return builder
     */
    def customCuration(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigCustomCurationArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigCustomCurationArgs.builder
      builder.customCuration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateArgs.Builder)
    /**
     * @param enumOptions Enum options. To be populated if `ValueType` is `ENUM`.
     *  Structure is documented below.
     * @return builder
     */
    def enumOptions(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateEnumOptionArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateEnumOptionArgs.builder
      builder.enumOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param multiSelectOptions Multi select options. To be populated if `ValueType` is `MULTI_SELECT`.
     *  Structure is documented below.
     * @return builder
     */
    def multiSelectOptions(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateMultiSelectOptionArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateMultiSelectOptionArgs.builder
      builder.multiSelectOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.Builder)
    /**
     * @param curationConfig The curation information for this plugin instance.
     *  Structure is documented below.
     * @return builder
     */
    def curationConfig(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigArgs.builder
      builder.curationConfig(args(argsBuilder).build)

    /**
     * @param hubInstanceActions (Output)
     *  The execution status for the plugin instance.
     *  Structure is documented below.
     * @return builder
     */
    def hubInstanceActions(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginInstanceActionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionArgs.builder
      builder.hubInstanceActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginState.Builder)
    /**
     * @param actionsConfigs The configuration of actions supported by the plugin.
     *  Structure is documented below.
     * @return builder
     */
    def actionsConfigs(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginActionsConfigArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginState.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginActionsConfigArgs.builder
      builder.actionsConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param configTemplate ConfigTemplate represents the configuration template for a plugin.
     *  Structure is documented below.
     * @return builder
     */
    def configTemplate(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginState.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.builder
      builder.configTemplate(args(argsBuilder).build)

    /**
     * @param documentation Documentation details.
     *  Structure is documented below.
     * @return builder
     */
    def documentation(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginDocumentationArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginState.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginDocumentationArgs.builder
      builder.documentation(args(argsBuilder).build)

    /**
     * @param hostingService The information related to the service implemented by the plugin
     *  developer, used to invoke the plugin&#39;s functionality.
     *  Structure is documented below.
     * @return builder
     */
    def hostingService(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginHostingServiceArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginState.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginHostingServiceArgs.builder
      builder.hostingService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.Builder)
    /**
     * @param additionalConfigTemplates The list of additional configuration variables for the plugin&#39;s
     *  configuration.
     *  Structure is documented below.
     * @return builder
     */
    def additionalConfigTemplates(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAdditionalConfigTemplateArgs.builder
      builder.additionalConfigTemplates(args.map(_(argsBuilder).build)*)

    /**
     * @param authConfigTemplate AuthConfigTemplate represents the authentication template for a plugin.
     *  Structure is documented below.
     * @return builder
     */
    def authConfigTemplate(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAuthConfigTemplateArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginConfigTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAuthConfigTemplateArgs.builder
      builder.authConfigTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.CurationEndpointArgs.Builder)
    /**
     * @param applicationIntegrationEndpointDetails The details of the Application Integration endpoint to be triggered for
     *  curation.
     *  Structure is documented below.
     * @return builder
     */
    def applicationIntegrationEndpointDetails(args: Endofunction[com.pulumi.gcp.apihub.inputs.CurationEndpointApplicationIntegrationEndpointDetailsArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.CurationEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.CurationEndpointApplicationIntegrationEndpointDetailsArgs.builder
      builder.applicationIntegrationEndpointDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apihub.inputs.CurationState.Builder)
    /**
     * @param endpoint The endpoint to be triggered for curation.
     *  The endpoint will be invoked with a request payload containing
     *  ApiMetadata.
     *  Response should contain curated data in the form of
     *  ApiMetadata.
     *  Structure is documented below.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.gcp.apihub.inputs.CurationEndpointArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.CurationState.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.CurationEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

    /**
     * @param pluginInstanceActions The plugin instances and associated actions that are using the curation.
     *  Note: A particular curation could be used by multiple plugin instances or
     *  multiple actions in a plugin instance.
     *  Structure is documented below.
     * @return builder
     */
    def pluginInstanceActions(args: Endofunction[com.pulumi.gcp.apihub.inputs.CurationPluginInstanceActionArgs.Builder]*):
        com.pulumi.gcp.apihub.inputs.CurationState.Builder =
      def argsBuilder = com.pulumi.gcp.apihub.inputs.CurationPluginInstanceActionArgs.builder
      builder.pluginInstanceActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAuthConfigTemplateArgs.Builder)
    /**
     * @param serviceAccount Config for Google service account authentication.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccount(args: Endofunction[com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAuthConfigTemplateServiceAccountArgs.Builder]):
        com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAuthConfigTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apihub.inputs.PluginConfigTemplateAuthConfigTemplateServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)
