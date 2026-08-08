package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appfabric:
  /** Resource for managing an AWS AppFabric App Authorization. */
  def AppAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.AppAuthorizationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.appfabric.AppAuthorization(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder)
    /**
     * @param credential Credentials for the application, such as an API key or OAuth2 client ID and secret. Specify credentials that match the authorization type for your request. For example, if the authorization type for your request is OAuth2 (`oauth2`), then you should provide only the OAuth2 credentials. See `credential` Block for details.
     * @return builder
     */
    def credential(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder]):
        com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.builder
      builder.credential(args(argsBuilder).build)

    /**
     * @param tenants Information about an application tenant, such as the application display name and identifier. See `tenant` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tenants(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationTenantArgs.Builder]*):
        com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationTenantArgs.builder
      builder.tenants(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationTimeoutsArgs.Builder]):
        com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS AppFabric App Authorization Connection. */
  def AppAuthorizationConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.builder
    com.pulumi.aws.appfabric.AppAuthorizationConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.Builder)
    /**
     * @param authRequest OAuth2 authorization information. Required if the app authorization for the request is configured with an OAuth2 (`oauth2`) authorization type. See `authRequest` Block for details.
     * @return builder
     */
    def authRequest(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionAuthRequestArgs.Builder]):
        com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionAuthRequestArgs.builder
      builder.authRequest(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS AppFabric AppBundle. */
  def AppBundle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appfabric.AppBundleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.AppBundleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.appfabric.AppBundle(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS AppFabric Ingestion. */
  def Ingestion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appfabric.IngestionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.IngestionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.appfabric.Ingestion(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS AppFabric Ingestion Destination. */
  def IngestionDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.IngestionDestinationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.appfabric.IngestionDestination(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder)
    /**
     * @param destinationConfiguration Configuration for the destination of ingested data. See `destinationConfiguration` Block below.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param processingConfiguration Configuration for how ingested data is processed. See `processingConfiguration` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationTimeoutsArgs.Builder]):
        com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionState.Builder)
    /**
     * @param authRequest OAuth2 authorization information. Required if the app authorization for the request is configured with an OAuth2 (`oauth2`) authorization type. See `authRequest` Block for details.
     * @return builder
     */
    def authRequest(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionAuthRequestArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionAuthRequestArgs.builder
      builder.authRequest(args(argsBuilder).build)

    /**
     * @param tenants Contains information about an application tenant, such as the application display name and identifier.
     * @return builder
     */
    def tenants(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionTenantArgs.Builder]*):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionState.Builder =
      def argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionTenantArgs.builder
      builder.tenants(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder)
    /**
     * @param apiKeyCredentials API key credential information. See `apiKeyCredential` Block for details.
     * @return builder
     */
    def apiKeyCredentials(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialApiKeyCredentialArgs.Builder]*):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder =
      def argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialApiKeyCredentialArgs.builder
      builder.apiKeyCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param oauth2Credential OAuth2 client credential information. See `oauth2Credential` Block for details.
     * @return builder
     */
    def oauth2Credential(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialOauth2CredentialArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialOauth2CredentialArgs.builder
      builder.oauth2Credential(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.AppAuthorizationState.Builder)
    /**
     * @param credential Credentials for the application, such as an API key or OAuth2 client ID and secret. Specify credentials that match the authorization type for your request. For example, if the authorization type for your request is OAuth2 (`oauth2`), then you should provide only the OAuth2 credentials. See `credential` Block for details.
     * @return builder
     */
    def credential(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.builder
      builder.credential(args(argsBuilder).build)

    /**
     * @param tenants Information about an application tenant, such as the application display name and identifier. See `tenant` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def tenants(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationTenantArgs.Builder]*):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationState.Builder =
      def argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationTenantArgs.builder
      builder.tenants(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationTimeoutsArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder)
    /**
     * @param auditLog Audit log destination configuration. See `destination_configuration.audit_log` Block below.
     * @return builder
     */
    def auditLog(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.builder
      builder.auditLog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.Builder)
    /**
     * @param destination Destination for the audit log. Only one destination, either `firehoseStream` or `s3Bucket`, can be specified. See `destination_configuration.audit_log.destination` Block below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder)
    /**
     * @param firehoseStream Amazon Data Firehose delivery stream destination. See `destination_configuration.audit_log.destination.firehose_stream` Block below.
     * @return builder
     */
    def firehoseStream(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationFirehoseStreamArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationFirehoseStreamArgs.builder
      builder.firehoseStream(args(argsBuilder).build)

    /**
     * @param s3Bucket Amazon S3 bucket destination. See `destination_configuration.audit_log.destination.s3_bucket` Block below.
     * @return builder
     */
    def s3Bucket(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationS3BucketArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationS3BucketArgs.builder
      builder.s3Bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.Builder)
    /**
     * @param auditLog Audit log processing configuration. See `processing_configuration.audit_log` Block below.
     * @return builder
     */
    def auditLog(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationAuditLogArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationAuditLogArgs.builder
      builder.auditLog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationState.Builder)
    /**
     * @param destinationConfiguration Configuration for the destination of ingested data. See `destinationConfiguration` Block below.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param processingConfiguration Configuration for how ingested data is processed. See `processingConfiguration` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def processingConfiguration(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.builder
      builder.processingConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationTimeoutsArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
