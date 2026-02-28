package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object appflow:
  extension (builder: com.pulumi.aws.appflow.FlowArgs.Builder)
    /**
     * @param destinationFlowConfigs A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * @return builder
     */
    def destinationFlowConfigs(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder]*):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.builder
      builder.destinationFlowConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataCatalogConfig A Catalog that determines the configuration that Amazon AppFlow uses when it catalogs the data that\u2019s transferred by the associated flow. When Amazon AppFlow catalogs the data from a flow, it stores metadata in a data catalog.
     * @return builder
     */
    def metadataCatalogConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder]):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.builder
      builder.metadataCatalogConfig(args(argsBuilder).build)

    /**
     * @param sourceFlowConfig The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * @return builder
     */
    def sourceFlowConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder]):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.builder
      builder.sourceFlowConfig(args(argsBuilder).build)

    /**
     * @param tasks A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder]*):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerConfig A Trigger that determine how and when the flow runs.
     * @return builder
     */
    def triggerConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder]):
        com.pulumi.aws.appflow.FlowArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.builder
      builder.triggerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.ConnectorProfileArgs.Builder)
    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
     * @return builder
     */
    def connectorProfileConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder]):
        com.pulumi.aws.appflow.ConnectorProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.builder
      builder.connectorProfileConfig(args(argsBuilder).build)

  /** Provides an AppFlow flow resource. */
  def Flow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appflow.FlowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appflow.FlowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appflow.Flow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an AppFlow connector profile resource.
   *  
   *  For information about AppFlow flows, see the [Amazon AppFlow API Reference](https://docs.aws.amazon.com/appflow/1.0/APIReference/Welcome.html).
   *  For specific information about creating an AppFlow connector profile, see the
   *  [CreateConnectorProfile](https://docs.aws.amazon.com/appflow/1.0/APIReference/API_CreateConnectorProfile.html) page in the Amazon AppFlow API Reference.
   */
  def ConnectorProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appflow.ConnectorProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appflow.ConnectorProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.appflow.ConnectorProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder)
    /**
     * @param customConnector Properties that are required to query the custom Connector. See Custom Connector Destination Properties for more details.
     * @return builder
     */
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param customerProfiles Properties that are required to query Amazon Connect Customer Profiles. See Customer Profiles Destination Properties for more details.
     * @return builder
     */
    def customerProfiles(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfilesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfilesArgs.builder
      builder.customerProfiles(args(argsBuilder).build)

    /**
     * @param eventBridge Properties that are required to query Amazon EventBridge. See Generic Destination Properties for more details.
     * @return builder
     */
    def eventBridge(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.builder
      builder.eventBridge(args(argsBuilder).build)

    /**
     * @param honeycode Properties that are required to query Amazon Honeycode. See Generic Destination Properties for more details.
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

    /**
     * @param marketo Properties that are required to query Marketo. See Generic Destination Properties for more details.
     * @return builder
     */
    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param redshift Properties that are required to query Amazon Redshift. See Redshift Destination Properties for more details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param s3 Properties that are required to query Amazon S3. See S3 Destination Properties for more details.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.builder
      builder.s3(args(argsBuilder).build)

    /**
     * @param salesforce Properties that are required to query Salesforce. See Salesforce Destination Properties for more details.
     * @return builder
     */
    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    /**
     * @param sapoData Properties that are required to query SAPOData. See SAPOData Destination Properties for more details.
     * @return builder
     */
    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param snowflake Properties that are required to query Snowflake. See Snowflake Destination Properties for more details.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param upsolver Properties that are required to query Upsolver. See Upsolver Destination Properties for more details.
     * @return builder
     */
    def upsolver(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.builder
      builder.upsolver(args(argsBuilder).build)

    /**
     * @param zendesk Properties that are required to query Zendesk. See Zendesk Destination Properties for more details.
     * @return builder
     */
    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.Builder)
    /**
     * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format that you provide the flow input data. See S3 Input Format Config for details.
     * @return builder
     */
    def s3InputFormatConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs.builder
      builder.s3InputFormatConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder)
    def glueDataCatalog(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigGlueDataCatalogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigGlueDataCatalogArgs.builder
      builder.glueDataCatalog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder)
    /**
     * @param destinationConnectorProperties This stores the information that is required to query a particular connector. See Destination Connector Properties for more information.
     * @return builder
     */
    def destinationConnectorProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.builder
      builder.destinationConnectorProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder)
    /**
     * @param amplitude Information that is required for querying Amplitude. See Generic Source Properties for more details.
     * @return builder
     */
    def amplitude(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitudeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitudeArgs.builder
      builder.amplitude(args(argsBuilder).build)

    /**
     * @param customConnector Properties that are applied when the custom connector is being used as a source. See Custom Connector Source Properties.
     * @return builder
     */
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param datadog Information that is required for querying Datadog. See Generic Source Properties for more details.
     * @return builder
     */
    def datadog(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadogArgs.builder
      builder.datadog(args(argsBuilder).build)

    /**
     * @param dynatrace Operation to be performed on the provided Dynatrace source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * @return builder
     */
    def dynatrace(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatraceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatraceArgs.builder
      builder.dynatrace(args(argsBuilder).build)

    /**
     * @param googleAnalytics Operation to be performed on the provided Google Analytics source fields. Valid values are `PROJECTION` and `BETWEEN`.
     * @return builder
     */
    def googleAnalytics(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs.builder
      builder.googleAnalytics(args(argsBuilder).build)

    /**
     * @param inforNexus Information that is required for querying Infor Nexus. See Generic Source Properties for more details.
     * @return builder
     */
    def inforNexus(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexusArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexusArgs.builder
      builder.inforNexus(args(argsBuilder).build)

    /**
     * @param marketo Information that is required for querying Marketo. See Generic Source Properties for more details.
     * @return builder
     */
    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param s3 Information that is required for querying Amazon S3. See S3 Source Properties for more details.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3Args.builder
      builder.s3(args(argsBuilder).build)

    /**
     * @param salesforce Information that is required for querying Salesforce. See Salesforce Source Properties for more details.
     * @return builder
     */
    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    /**
     * @param sapoData Information that is required for querying SAPOData as a flow source. See SAPO Source Properties for more details.
     * @return builder
     */
    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param serviceNow Information that is required for querying ServiceNow. See Generic Source Properties for more details.
     * @return builder
     */
    def serviceNow(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNowArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param singular Information that is required for querying Singular. See Generic Source Properties for more details.
     * @return builder
     */
    def singular(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSingularArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSingularArgs.builder
      builder.singular(args(argsBuilder).build)

    /**
     * @param slack Information that is required for querying Slack. See Generic Source Properties for more details.
     * @return builder
     */
    def slack(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSlackArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSlackArgs.builder
      builder.slack(args(argsBuilder).build)

    /**
     * @param trendmicro Operation to be performed on the provided Trend Micro source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * @return builder
     */
    def trendmicro(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicroArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicroArgs.builder
      builder.trendmicro(args(argsBuilder).build)

    /**
     * @param veeva Information that is required for querying Veeva. See Veeva Source Properties for more details.
     * @return builder
     */
    def veeva(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs.builder
      builder.veeva(args(argsBuilder).build)

    /**
     * @param zendesk Information that is required for querying Zendesk. See Generic Source Properties for more details.
     * @return builder
     */
    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.Builder)
    /**
     * @param oauth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
     * @return builder
     */
    def oauth2Properties(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesArgs.builder
      builder.oauth2Properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder)
    /**
     * @param aggregationConfig Aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * @return builder
     */
    def aggregationConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfigArgs.builder
      builder.aggregationConfig(args(argsBuilder).build)

    /**
     * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * @return builder
     */
    def prefixConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs.builder
      builder.prefixConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowState.Builder)
    /**
     * @param destinationFlowConfigs A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * @return builder
     */
    def destinationFlowConfigs(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.Builder]*):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs.builder
      builder.destinationFlowConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataCatalogConfig A Catalog that determines the configuration that Amazon AppFlow uses when it catalogs the data that\u2019s transferred by the associated flow. When Amazon AppFlow catalogs the data from a flow, it stores metadata in a data catalog.
     * @return builder
     */
    def metadataCatalogConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowMetadataCatalogConfigArgs.builder
      builder.metadataCatalogConfig(args(argsBuilder).build)

    /**
     * @param sourceFlowConfig The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * @return builder
     */
    def sourceFlowConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.builder
      builder.sourceFlowConfig(args(argsBuilder).build)

    /**
     * @param tasks A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * @return builder
     */
    def tasks(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder]*):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowTaskArgs.builder
      builder.tasks(args.map(_(argsBuilder).build)*)

    /**
     * @param triggerConfig A Trigger that determine how and when the flow runs.
     * @return builder
     */
    def triggerConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.builder
      builder.triggerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder)
    /**
     * @param aggregationConfig Aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * @return builder
     */
    def aggregationConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs.builder
      builder.aggregationConfig(args(argsBuilder).build)

    /**
     * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * @return builder
     */
    def prefixConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs.builder
      builder.prefixConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder)
    /**
     * @param basicAuthCredentials The SAPOData basic authentication credentials.
     * @return builder
     */
    def basicAuthCredentials(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentialsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentialsArgs.builder
      builder.basicAuthCredentials(args(argsBuilder).build)

    /**
     * @param oauthCredentials The SAPOData OAuth type authentication credentials.
     * @return builder
     */
    def oauthCredentials(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.builder
      builder.oauthCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder)
    /**
     * @param paginationConfig Sets the page size for each concurrent process that transfers OData records from your SAP instance.
     * @return builder
     */
    def paginationConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataPaginationConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataPaginationConfigArgs.builder
      builder.paginationConfig(args(argsBuilder).build)

    /**
     * @param parallelismConfig Sets the number of concurrent processes that transfers OData records from your SAP instance.
     * @return builder
     */
    def parallelismConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataParallelismConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoDataParallelismConfigArgs.builder
      builder.parallelismConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder)
    def apiKey(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyArgs.builder
      builder.apiKey(args(argsBuilder).build)

    /**
     * @param basic Basic credentials that are required for the authentication of the user.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param custom If the connector uses the custom authentication mechanism, this holds the required credentials.
     * @return builder
     */
    def custom(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomArgs.builder
      builder.custom(args(argsBuilder).build)

    /**
     * @param oauth2 OAuth 2.0 credentials required for the authentication of the user.
     * @return builder
     */
    def oauth2(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2Args.builder
      builder.oauth2(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.Builder)
    /**
     * @param oauthProperties The SAPOData OAuth properties required for OAuth type authentication.
     * @return builder
     */
    def oauthProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs.builder
      builder.oauthProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.Builder)
    def scheduled(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesScheduledArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesScheduledArgs.builder
      builder.scheduled(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder)
    /**
     * @param triggerProperties Configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
     * @return builder
     */
    def triggerProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs.builder
      builder.triggerProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.Builder)
    def s3OutputFormatConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.builder
      builder.s3OutputFormatConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder)
    /**
     * @param amplitude The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
     * @return builder
     */
    def amplitude(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeArgs.builder
      builder.amplitude(args(argsBuilder).build)

    /**
     * @param customConnector The connector-specific profile properties required when using the custom connector. See Custom Connector Profile Properties for more details.
     * @return builder
     */
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param datadog Connector-specific properties required when using Datadog. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def datadog(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogArgs.builder
      builder.datadog(args(argsBuilder).build)

    /**
     * @param dynatrace The connector-specific properties required when using Dynatrace. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def dynatrace(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceArgs.builder
      builder.dynatrace(args(argsBuilder).build)

    /**
     * @param googleAnalytics The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
     * @return builder
     */
    def googleAnalytics(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsArgs.builder
      builder.googleAnalytics(args(argsBuilder).build)

    /**
     * @param honeycode The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
     * @return builder
     */
    def honeycode(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeArgs.builder
      builder.honeycode(args(argsBuilder).build)

    /**
     * @param inforNexus The connector-specific properties required when using Infor Nexus. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def inforNexus(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusArgs.builder
      builder.inforNexus(args(argsBuilder).build)

    /**
     * @param marketo Connector-specific properties required when using Marketo. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param redshift Connector-specific properties required when using Amazon Redshift. See Redshift Connector Profile Properties for more details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param salesforce The connector-specific properties required when using Salesforce. See Salesforce Connector Profile Properties for more details.
     * @return builder
     */
    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    /**
     * @param sapoData The connector-specific properties required when using SAPOData. See SAPOData Connector Profile Properties for more details.
     * @return builder
     */
    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param serviceNow The connector-specific properties required when using ServiceNow. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def serviceNow(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param singular Connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
     * @return builder
     */
    def singular(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularArgs.builder
      builder.singular(args(argsBuilder).build)

    /**
     * @param slack Connector-specific properties required when using Slack. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def slack(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackArgs.builder
      builder.slack(args(argsBuilder).build)

    /**
     * @param snowflake The connector-specific properties required when using Snowflake. See Snowflake Connector Profile Properties for more details.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param trendmicro The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
     * @return builder
     */
    def trendmicro(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroArgs.builder
      builder.trendmicro(args(argsBuilder).build)

    /**
     * @param veeva Connector-specific properties required when using Veeva. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def veeva(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaArgs.builder
      builder.veeva(args(argsBuilder).build)

    /**
     * @param zendesk Connector-specific properties required when using Zendesk. See Generic Connector Profile Properties for more details.
     * @return builder
     */
    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder)
    /**
     * @param incrementalPullConfig Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields specified in the configuration are used when querying for the incremental data pull. See Incremental Pull Config for more details.
     * @return builder
     */
    def incrementalPullConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigIncrementalPullConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigIncrementalPullConfigArgs.builder
      builder.incrementalPullConfig(args(argsBuilder).build)

    /**
     * @param sourceConnectorProperties Information that is required to query a particular source connector. See Source Connector Properties for details.
     * @return builder
     */
    def sourceConnectorProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesArgs.builder
      builder.sourceConnectorProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder)
    /**
     * @param connectorProfileCredentials The connector-specific credentials required by each connector. See Connector Profile Credentials for more details.
     * @return builder
     */
    def connectorProfileCredentials(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.builder
      builder.connectorProfileCredentials(args(argsBuilder).build)

    /**
     * @param connectorProfileProperties The connector-specific properties of the profile configuration. See Connector Profile Properties for more details.
     * @return builder
     */
    def connectorProfileProperties(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesArgs.builder
      builder.connectorProfileProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)

    /**
     * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
     * @return builder
     */
    def successResponseHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs.builder
      builder.successResponseHandlingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileState.Builder)
    /**
     * @param connectorProfileConfig Defines the connector-specific configuration and credentials. See Connector Profile Config for more details.
     * @return builder
     */
    def connectorProfileConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileState.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigArgs.builder
      builder.connectorProfileConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder)
    /**
     * @param amplitude The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
     * @return builder
     */
    def amplitude(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitudeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsAmplitudeArgs.builder
      builder.amplitude(args(argsBuilder).build)

    /**
     * @param customConnector The connector-specific profile credentials required when using the custom connector. See Custom Connector Profile Credentials for more details.
     * @return builder
     */
    def customConnector(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorArgs.builder
      builder.customConnector(args(argsBuilder).build)

    /**
     * @param datadog Connector-specific credentials required when using Datadog. See Datadog Connector Profile Credentials for more details.
     * @return builder
     */
    def datadog(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadogArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDatadogArgs.builder
      builder.datadog(args(argsBuilder).build)

    /**
     * @param dynatrace The connector-specific credentials required when using Dynatrace. See Dynatrace Connector Profile Credentials for more details.
     * @return builder
     */
    def dynatrace(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs.builder
      builder.dynatrace(args(argsBuilder).build)

    /**
     * @param googleAnalytics The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
     * @return builder
     */
    def googleAnalytics(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsGoogleAnalyticsArgs.builder
      builder.googleAnalytics(args(argsBuilder).build)

    /**
     * @param honeycode The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
     * @return builder
     */
    def honeycode(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.builder
      builder.honeycode(args(argsBuilder).build)

    /**
     * @param inforNexus The connector-specific credentials required when using Infor Nexus. See Infor Nexus Connector Profile Credentials for more details.
     * @return builder
     */
    def inforNexus(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs.builder
      builder.inforNexus(args(argsBuilder).build)

    /**
     * @param marketo Connector-specific credentials required when using Marketo. See Marketo Connector Profile Credentials for more details.
     * @return builder
     */
    def marketo(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoArgs.builder
      builder.marketo(args(argsBuilder).build)

    /**
     * @param redshift Connector-specific credentials required when using Amazon Redshift. See Redshift Connector Profile Credentials for more details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshiftArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param salesforce The connector-specific credentials required when using Salesforce. See Salesforce Connector Profile Credentials for more details.
     * @return builder
     */
    def salesforce(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSalesforceArgs.builder
      builder.salesforce(args(argsBuilder).build)

    /**
     * @param sapoData The connector-specific credentials required when using SAPOData. See SAPOData Connector Profile Credentials for more details.
     * @return builder
     */
    def sapoData(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs.builder
      builder.sapoData(args(argsBuilder).build)

    /**
     * @param serviceNow The connector-specific credentials required when using ServiceNow. See ServiceNow Connector Profile Credentials for more details.
     * @return builder
     */
    def serviceNow(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs.builder
      builder.serviceNow(args(argsBuilder).build)

    /**
     * @param singular Connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
     * @return builder
     */
    def singular(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSingularArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSingularArgs.builder
      builder.singular(args(argsBuilder).build)

    /**
     * @param slack Connector-specific credentials required when using Slack. See Slack Connector Profile Credentials for more details.
     * @return builder
     */
    def slack(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackArgs.builder
      builder.slack(args(argsBuilder).build)

    /**
     * @param snowflake The connector-specific credentials required when using Snowflake. See Snowflake Connector Profile Credentials for more details.
     * @return builder
     */
    def snowflake(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSnowflakeArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSnowflakeArgs.builder
      builder.snowflake(args(argsBuilder).build)

    /**
     * @param trendmicro The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
     * @return builder
     */
    def trendmicro(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsTrendmicroArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsTrendmicroArgs.builder
      builder.trendmicro(args(argsBuilder).build)

    /**
     * @param veeva Connector-specific credentials required when using Veeva. See Veeva Connector Profile Credentials for more details.
     * @return builder
     */
    def veeva(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsVeevaArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsVeevaArgs.builder
      builder.veeva(args(argsBuilder).build)

    /**
     * @param zendesk Connector-specific credentials required when using Zendesk. See Zendesk Connector Profile Credentials for more details.
     * @return builder
     */
    def zendesk(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsZendeskArgs.builder
      builder.zendesk(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder)
    /**
     * @param connectorOperators Operation to be performed on the provided source fields. See Connector Operator for details.
     * @return builder
     */
    def connectorOperators(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowTaskConnectorOperatorArgs.Builder]*):
        com.pulumi.aws.appflow.inputs.FlowTaskArgs.Builder =
      def argsBuilder = com.pulumi.aws.appflow.inputs.FlowTaskConnectorOperatorArgs.builder
      builder.connectorOperators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.Builder)
    def s3OutputFormatConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs.builder
      builder.s3OutputFormatConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.Builder)
    def oauthRequest(args: Endofunction[com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequestArgs.Builder]):
        com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequestArgs.builder
      builder.oauthRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.Builder)
    def errorHandlingConfig(args: Endofunction[com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskErrorHandlingConfigArgs.Builder]):
        com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskArgs.Builder =
      val argsBuilder = com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesZendeskErrorHandlingConfigArgs.builder
      builder.errorHandlingConfig(args(argsBuilder).build)
