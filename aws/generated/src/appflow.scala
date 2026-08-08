package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appflow:
  /**
   * Provides an AppFlow connector profile resource.
   * 
   * For information about AppFlow flows, see the [Amazon AppFlow API Reference](https://docs.aws.amazon.com/appflow/1.0/APIReference/Welcome.html).
   * For specific information about creating an AppFlow connector profile, see the
   * [CreateConnectorProfile](https://docs.aws.amazon.com/appflow/1.0/APIReference/API_CreateConnectorProfile.html) page in the Amazon AppFlow API Reference.
   */
  def ConnectorProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appflow.ConnectorProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appflow.ConnectorProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.appflow.ConnectorProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appflow.ConnectorProfileArgs.Builder)
    /**
     * @param connectorProfileConfig Connector-specific configuration and credentials. See `connectorProfileConfig` Block for details.
     * @return builder
     */
    def connectorProfileConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder]):
        com.pulumi.aws.appflow.ConnectorProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.builder
      builder.connectorProfileConfig(args(argsBuilder).build)

  /** Provides an AppFlow flow resource. */
  def Flow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appflow.FlowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appflow.FlowArgs.builder
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
    com.pulumi.aws.appflow.Flow(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appflow.FlowArgs.Builder)
    /**
     * @param destinationFlowConfigs Configuration that controls how Amazon AppFlow places data in the destination connector. See the `destinationFlowConfig` Block for details.
     * @return builder
     */
    def destinationFlowConfigs(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder]*):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.builder
      builder.destinationFlowConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataCatalogConfig Configuration that determines how Amazon AppFlow catalogs the data that the flow transfers. See the `metadataCatalogConfig` Block for details.
     * @return builder
     */
    def metadataCatalogConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder]):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.builder
      builder.metadataCatalogConfig(args(argsBuilder).build)

    /**
     * @param sourceFlowConfig Configuration that controls how Amazon AppFlow retrieves data from the source connector. See the `sourceFlowConfig` Block for details.
     * @return builder
     */
    def sourceFlowConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder]):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.builder
      builder.sourceFlowConfig(args(argsBuilder).build)

    /**
     * @param tasks Tasks that Amazon AppFlow performs while transferring the data in the flow run. See the `task` Block for details.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder]*):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerConfig Configuration that determines how and when the flow runs. See the `triggerConfig` Block for details.
     * @return builder
     */
    def triggerConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder]):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.builder
      builder.triggerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder)
    /**
     * @param connectorProfileCredentials Connector-specific credentials required by each connector. See `connectorProfileCredentials` Block for details.
     * @return builder
     */
    def connectorProfileCredentials(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.builder
      builder.connectorProfileCredentials(args(argsBuilder).build)

    /**
     * @param connectorProfileProperties Connector-specific properties of the profile configuration. See `connectorProfileProperties` Block for details.
     * @return builder
     */
    def connectorProfileProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.builder
      builder.connectorProfileProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder)
    /**
     * @param amplitude Connector-specific credentials required when using Amplitude. See `connector_profile_config.connector_profile_credentials.amplitude` Block for details.
     * @return builder
     */
    def amplitude(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitudeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitudeArgs.builder
      builder.amplitude(args(argsBuilder).build)

    /**
     * @param customConnector Connector-specific profile credentials required when using the custom connector. See `connector_profile_config.connector_profile_credentials.custom_connector` Block for details.
     * @return builder
     */
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param datadog Connector-specific credentials required when using Datadog. See `connector_profile_config.connector_profile_credentials.datadog` Block for details.
     * @return builder
     */
    def datadog(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadogArgs.builder
      builder.datadog(args(argsBuilder).build)

    /**
     * @param dynatrace Connector-specific credentials required when using Dynatrace. See `connector_profile_config.connector_profile_credentials.dynatrace` Block for details.
     * @return builder
     */
    def dynatrace(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs.builder
      builder.dynatrace(args(argsBuilder).build)

    /**
     * @param googleAnalytics Connector-specific credentials required when using Google Analytics. See `connector_profile_config.connector_profile_credentials.google_analytics` Block for details.
     * @return builder
     */
    def googleAnalytics(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.builder
      builder.googleAnalytics(args(argsBuilder).build)

    /**
     * @param honeycode Connector-specific credentials required when using Amazon Honeycode. See `connector_profile_config.connector_profile_credentials.honeycode` Block for details.
     * @return builder
     */
    def honeycode(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.builder
      builder.honeycode(args(argsBuilder).build)

    /**
     * @param inforNexus Connector-specific credentials required when using Infor Nexus. See `connector_profile_config.connector_profile_credentials.infor_nexus` Block for details.
     * @return builder
     */
    def inforNexus(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs.builder
      builder.inforNexus(args(argsBuilder).build)

    /**
     * @param marketo Connector-specific credentials required when using Marketo. See `connector_profile_config.connector_profile_credentials.marketo` Block for details.
     * @return builder
     */
    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param redshift Connector-specific credentials required when using Amazon Redshift. See `connector_profile_config.connector_profile_credentials.redshift` Block for details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshiftArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param salesforce Connector-specific credentials required when using Salesforce. See `connector_profile_config.connector_profile_credentials.salesforce` Block for details.
     * @return builder
     */
    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    /**
     * @param sapoData Connector-specific credentials required when using SAPOData. See `connector_profile_config.connector_profile_credentials.sapo_data` Block for details.
     * @return builder
     */
    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param serviceNow Connector-specific credentials required when using ServiceNow. See `connector_profile_config.connector_profile_credentials.service_now` Block for details.
     * @return builder
     */
    def serviceNow(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param singular Connector-specific credentials required when using Singular. See `connector_profile_config.connector_profile_credentials.singular` Block for details.
     * @return builder
     */
    def singular(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSingularArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSingularArgs.builder
      builder.singular(args(argsBuilder).build)

    /**
     * @param slack Connector-specific credentials required when using Slack. See `connector_profile_config.connector_profile_credentials.slack` Block for details.
     * @return builder
     */
    def slack(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.builder
      builder.slack(args(argsBuilder).build)

    /**
     * @param snowflake Connector-specific credentials required when using Snowflake. See `connector_profile_config.connector_profile_credentials.snowflake` Block for details.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSnowflakeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param trendmicro Connector-specific credentials required when using Trend Micro. See `connector_profile_config.connector_profile_credentials.trendmicro` Block for details.
     * @return builder
     */
    def trendmicro(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsTrendmicroArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsTrendmicroArgs.builder
      builder.trendmicro(args(argsBuilder).build)

    /**
     * @param veeva Connector-specific credentials required when using Veeva. See `connector_profile_config.connector_profile_credentials.veeva` Block for details.
     * @return builder
     */
    def veeva(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsVeevaArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsVeevaArgs.builder
      builder.veeva(args(argsBuilder).build)

    /**
     * @param zendesk Connector-specific credentials required when using Zendesk. See `connector_profile_config.connector_profile_credentials.zendesk` Block for details.
     * @return builder
     */
    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder)
    /**
     * @param apiKey Unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * @return builder
     */
    def apiKey(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

    /**
     * @param basic Basic credentials that are required for the authentication of the user. See `connector_profile_config.connector_profile_credentials.custom_connector.basic` Block for details.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom Credentials required when the connector uses the custom authentication mechanism. See `connector_profile_config.connector_profile_credentials.custom_connector.custom` Block for details.
     * @return builder
     */
    def custom(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs.builder
      builder.custom(args(argsBuilder).build)

    /**
     * @param oauth2 OAuth 2.0 credentials required for the authentication of the user. See `connector_profile_config.connector_profile_credentials.custom_connector.oauth2` Block for details.
     * @return builder
     */
    def oauth2(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.builder
      builder.oauth2(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder)
    /**
     * @param basicAuthCredentials SAPOData basic authentication credentials. See `connector_profile_config.connector_profile_credentials.sapo_data.basic_auth_credentials` Block for details.
     * @return builder
     */
    def basicAuthCredentials(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentialsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentialsArgs.builder
      builder.basicAuthCredentials(args(argsBuilder).build)

    /**
     * @param oauthCredentials SAPOData OAuth type authentication credentials. See `connector_profile_config.connector_profile_credentials.sapo_data.oauth_credentials` Block for details.
     * @return builder
     */
    def oauthCredentials(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.builder
      builder.oauthCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.Builder)
    /**
     * @param oauthRequest OAuth requirement needed to request security tokens from the connector endpoint. See `connector_profile_config.connector_profile_credentials.zendesk.oauth_request` Block for details.
     * @return builder
     */
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder)
    /**
     * @param amplitude Connector-specific credentials required when using Amplitude. See `connector_profile_config.connector_profile_credentials.amplitude` Block for details.
     * @return builder
     */
    def amplitude(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs.builder
      builder.amplitude(args(argsBuilder).build)

    /**
     * @param customConnector Connector-specific profile properties required when using the custom connector. See `connector_profile_config.connector_profile_properties.custom_connector` Block for details.
     * @return builder
     */
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param datadog Connector-specific properties required when using Datadog. See `connector_profile_config.connector_profile_properties.datadog` Block for details.
     * @return builder
     */
    def datadog(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs.builder
      builder.datadog(args(argsBuilder).build)

    /**
     * @param dynatrace Connector-specific properties required when using Dynatrace. See `connector_profile_config.connector_profile_properties.dynatrace` Block for details.
     * @return builder
     */
    def dynatrace(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs.builder
      builder.dynatrace(args(argsBuilder).build)

    /**
     * @param googleAnalytics Connector-specific credentials required when using Google Analytics. See `connector_profile_config.connector_profile_credentials.google_analytics` Block for details.
     * @return builder
     */
    def googleAnalytics(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs.builder
      builder.googleAnalytics(args(argsBuilder).build)

    /**
     * @param honeycode Connector-specific credentials required when using Amazon Honeycode. See `connector_profile_config.connector_profile_credentials.honeycode` Block for details.
     * @return builder
     */
    def honeycode(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs.builder
      builder.honeycode(args(argsBuilder).build)

    /**
     * @param inforNexus Connector-specific properties required when using Infor Nexus. See `connector_profile_config.connector_profile_properties.infor_nexus` Block for details.
     * @return builder
     */
    def inforNexus(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs.builder
      builder.inforNexus(args(argsBuilder).build)

    /**
     * @param marketo Connector-specific properties required when using Marketo. See `connector_profile_config.connector_profile_properties.marketo` Block for details.
     * @return builder
     */
    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param redshift Connector-specific properties required when using Amazon Redshift. See `connector_profile_config.connector_profile_properties.redshift` Block for details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param salesforce Connector-specific properties required when using Salesforce. See `connector_profile_config.connector_profile_properties.salesforce` Block for details.
     * @return builder
     */
    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    /**
     * @param sapoData Connector-specific properties required when using SAPOData. See `connector_profile_config.connector_profile_properties.sapo_data` Block for details.
     * @return builder
     */
    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param serviceNow Connector-specific properties required when using ServiceNow. See `connector_profile_config.connector_profile_properties.service_now` Block for details.
     * @return builder
     */
    def serviceNow(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param singular Connector-specific credentials required when using Singular. See `connector_profile_config.connector_profile_credentials.singular` Block for details.
     * @return builder
     */
    def singular(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs.builder
      builder.singular(args(argsBuilder).build)

    /**
     * @param slack Connector-specific properties required when using Slack. See `connector_profile_config.connector_profile_properties.slack` Block for details.
     * @return builder
     */
    def slack(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs.builder
      builder.slack(args(argsBuilder).build)

    /**
     * @param snowflake Connector-specific properties required when using Snowflake. See `connector_profile_config.connector_profile_properties.snowflake` Block for details.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param trendmicro Connector-specific credentials required when using Trend Micro. See `connector_profile_config.connector_profile_credentials.trendmicro` Block for details.
     * @return builder
     */
    def trendmicro(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs.builder
      builder.trendmicro(args(argsBuilder).build)

    /**
     * @param veeva Connector-specific properties required when using Veeva. See `connector_profile_config.connector_profile_properties.veeva` Block for details.
     * @return builder
     */
    def veeva(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs.builder
      builder.veeva(args(argsBuilder).build)

    /**
     * @param zendesk Connector-specific properties required when using Zendesk. See `connector_profile_config.connector_profile_properties.zendesk` Block for details.
     * @return builder
     */
    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.Builder)
    /**
     * @param oauth2Properties OAuth 2.0 properties required for OAuth 2.0 authentication. See `connector_profile_config.connector_profile_properties.custom_connector.oauth2_properties` Block for details.
     * @return builder
     */
    def oauth2Properties(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesArgs.builder
      builder.oauth2Properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.Builder)
    /**
     * @param oauthProperties SAPOData OAuth properties required for OAuth type authentication. See `connector_profile_config.connector_profile_properties.sapo_data.oauth_properties` Block for details.
     * @return builder
     */
    def oauthProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs.builder
      builder.oauthProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileState.Builder)
    /**
     * @param connectorProfileConfig Connector-specific configuration and credentials. See `connectorProfileConfig` Block for details.
     * @return builder
     */
    def connectorProfileConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.builder
      builder.connectorProfileConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder)
    /**
     * @param destinationConnectorProperties Information required to query a particular connector. See the `destination_flow_config.destination_connector_properties` Block for details.
     * @return builder
     */
    def destinationConnectorProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.builder
      builder.destinationConnectorProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder)
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param customerProfiles Properties required to query Amazon Connect Customer Profiles. See the `destination_flow_config.destination_connector_properties.customer_profiles` Block for details.
     * @return builder
     */
    def customerProfiles(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfilesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfilesArgs.builder
      builder.customerProfiles(args(argsBuilder).build)

    /**
     * @param eventBridge Properties required to query Amazon EventBridge. See the `destination_flow_config.destination_connector_properties.event_bridge` Block for details.
     * @return builder
     */
    def eventBridge(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.builder
      builder.eventBridge(args(argsBuilder).build)

    /**
     * @param honeycode Properties required to query Amazon Honeycode. See the `destination_flow_config.destination_connector_properties.honeycode` Block for details.
     * @return builder
     */
    def honeycode(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeArgs.builder
      builder.honeycode(args(argsBuilder).build)

    def lookoutMetrics(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetricsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetricsArgs.builder
      builder.lookoutMetrics(args(argsBuilder).build)

    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param redshift Properties required to query Amazon Redshift. See the `destination_flow_config.destination_connector_properties.redshift` Block for details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.builder
      builder.s3(args(argsBuilder).build)

    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param snowflake Properties required to query Snowflake. See the `destination_flow_config.destination_connector_properties.snowflake` Block for details.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param upsolver Properties required to query Upsolver. See the `destination_flow_config.destination_connector_properties.upsolver` Block for details.
     * @return builder
     */
    def upsolver(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.builder
      builder.upsolver(args(argsBuilder).build)

    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.Builder)
    /**
     * @param s3OutputFormatConfig Configuration that determines how Amazon AppFlow formats the flow output data when Upsolver is used as the destination. See the `destination_flow_config.destination_connector_properties.upsolver.s3_output_format_config` Block for details.
     * @return builder
     */
    def s3OutputFormatConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.builder
      builder.s3OutputFormatConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder)
    /**
     * @param aggregationConfig Aggregation settings that you can use to customize the output format of your flow data. See the `destination_flow_config.destination_connector_properties.upsolver.s3_output_format_config.aggregation_config` Block for details.
     * @return builder
     */
    def aggregationConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs.builder
      builder.aggregationConfig(args(argsBuilder).build)

    /**
     * @param prefixConfig Prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. See the `destination_flow_config.destination_connector_properties.upsolver.s3_output_format_config.prefix_config` Block for details.
     * @return builder
     */
    def prefixConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs.builder
      builder.prefixConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

    /**
     * @param successResponseHandlingConfig Settings that determine how Amazon AppFlow handles the success response it gets from the connector after placing data. See the `destination_flow_config.destination_connector_properties.sapo_data.success_response_handling_config` Block for details.
     * @return builder
     */
    def successResponseHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs.builder
      builder.successResponseHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.Builder)
    /**
     * @param s3OutputFormatConfig Configuration that determines how Amazon AppFlow formats the flow output data when Upsolver is used as the destination. See the `destination_flow_config.destination_connector_properties.upsolver.s3_output_format_config` Block for details.
     * @return builder
     */
    def s3OutputFormatConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.builder
      builder.s3OutputFormatConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder)
    /**
     * @param aggregationConfig Aggregation settings that you can use to customize the output format of your flow data. See the `destination_flow_config.destination_connector_properties.upsolver.s3_output_format_config.aggregation_config` Block for details.
     * @return builder
     */
    def aggregationConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs.builder
      builder.aggregationConfig(args(argsBuilder).build)

    /**
     * @param prefixConfig Prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. See the `destination_flow_config.destination_connector_properties.upsolver.s3_output_format_config.prefix_config` Block for details.
     * @return builder
     */
    def prefixConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs.builder
      builder.prefixConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.Builder)
    /**
     * @param errorHandlingConfig Settings that determine how Amazon AppFlow handles an error when placing data in the destination. See the `destination_flow_config.destination_connector_properties.zendesk.error_handling_config` Block for details.
     * @return builder
     */
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder)
    /**
     * @param glueDataCatalog Configuration that determines how Amazon AppFlow catalogs data with the AWS Glue Data Catalog. See the `metadata_catalog_config.glue_data_catalog` Block for details.
     * @return builder
     */
    def glueDataCatalog(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigGlueDataCatalogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigGlueDataCatalogArgs.builder
      builder.glueDataCatalog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder)
    /**
     * @param incrementalPullConfig Configuration for a scheduled incremental data pull. When a valid configuration is provided, the specified fields are used when querying for the incremental data pull. See the `source_flow_config.incremental_pull_config` Block for details.
     * @return builder
     */
    def incrementalPullConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigIncrementalPullConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigIncrementalPullConfigArgs.builder
      builder.incrementalPullConfig(args(argsBuilder).build)

    /**
     * @param sourceConnectorProperties Information required to query a particular source connector. See the `source_flow_config.source_connector_properties` Block for details.
     * @return builder
     */
    def sourceConnectorProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.builder
      builder.sourceConnectorProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder)
    def amplitude(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitudeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitudeArgs.builder
      builder.amplitude(args(argsBuilder).build)

    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    def datadog(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs.builder
      builder.datadog(args(argsBuilder).build)

    def dynatrace(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatraceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatraceArgs.builder
      builder.dynatrace(args(argsBuilder).build)

    def googleAnalytics(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs.builder
      builder.googleAnalytics(args(argsBuilder).build)

    def inforNexus(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexusArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexusArgs.builder
      builder.inforNexus(args(argsBuilder).build)

    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.builder
      builder.s3(args(argsBuilder).build)

    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    def serviceNow(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNowArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    def singular(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSingularArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSingularArgs.builder
      builder.singular(args(argsBuilder).build)

    def slack(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSlackArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSlackArgs.builder
      builder.slack(args(argsBuilder).build)

    def trendmicro(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicroArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicroArgs.builder
      builder.trendmicro(args(argsBuilder).build)

    def veeva(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs.builder
      builder.veeva(args(argsBuilder).build)

    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.Builder)
    /**
     * @param s3InputFormatConfig When you use Amazon S3 as the source, configuration format that you provide for the flow input data. See the `source_flow_config.source_connector_properties.s3.s3_input_format_config` Block for details.
     * @return builder
     */
    def s3InputFormatConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs.builder
      builder.s3InputFormatConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder)
    /**
     * @param paginationConfig Page size for each concurrent process that transfers OData records from your SAP instance. See the `source_flow_config.source_connector_properties.sapo_data.pagination_config` Block for details.
     * @return builder
     */
    def paginationConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataPaginationConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataPaginationConfigArgs.builder
      builder.paginationConfig(args(argsBuilder).build)

    /**
     * @param parallelismConfig Number of concurrent processes that transfer OData records from your SAP instance. See the `source_flow_config.source_connector_properties.sapo_data.parallelism_config` Block for details.
     * @return builder
     */
    def parallelismConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataParallelismConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataParallelismConfigArgs.builder
      builder.parallelismConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowState.Builder)
    /**
     * @param destinationFlowConfigs Configuration that controls how Amazon AppFlow places data in the destination connector. See the `destinationFlowConfig` Block for details.
     * @return builder
     */
    def destinationFlowConfigs(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder]*):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.builder
      builder.destinationFlowConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataCatalogConfig Configuration that determines how Amazon AppFlow catalogs the data that the flow transfers. See the `metadataCatalogConfig` Block for details.
     * @return builder
     */
    def metadataCatalogConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.builder
      builder.metadataCatalogConfig(args(argsBuilder).build)

    /**
     * @param sourceFlowConfig Configuration that controls how Amazon AppFlow retrieves data from the source connector. See the `sourceFlowConfig` Block for details.
     * @return builder
     */
    def sourceFlowConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.builder
      builder.sourceFlowConfig(args(argsBuilder).build)

    /**
     * @param tasks Tasks that Amazon AppFlow performs while transferring the data in the flow run. See the `task` Block for details.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder]*):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerConfig Configuration that determines how and when the flow runs. See the `triggerConfig` Block for details.
     * @return builder
     */
    def triggerConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.builder
      builder.triggerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder)
    /**
     * @param connectorOperators Operation to be performed on the provided source fields. See the `task.connector_operator` Block for details.
     * @return builder
     */
    def connectorOperators(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTaskConnectorOperatorArgs.Builder]*):
        com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowTaskConnectorOperatorArgs.builder
      builder.connectorOperators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder)
    /**
     * @param triggerProperties Configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See the `trigger_config.trigger_properties` Block for details.
     * @return builder
     */
    def triggerProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.builder
      builder.triggerProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.Builder)
    /**
     * @param scheduled Configuration details of a schedule-triggered flow. See the `trigger_config.trigger_properties.scheduled` Block for details.
     * @return builder
     */
    def scheduled(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesScheduledArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesScheduledArgs.builder
      builder.scheduled(args(argsBuilder).build)
