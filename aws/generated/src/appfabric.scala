package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appfabric:
  extension (builder: com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder)
    /**
     * @param credential Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     *  Specify credentials that match the authorization type for your request. For example, if the authorization type for your request is OAuth2 (oauth2), then you should provide only the OAuth2 credentials.
     * @return builder
     */
    def credential(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder]):
        com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.builder
      builder.credential(args(argsBuilder).build)

    /**
     * @param tenants Contains information about an application tenant, such as the application display name and identifier.
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

  /** Resource for managing an AWS AppFabric App Authorization. */
  def AppAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appfabric.AppAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.AppAuthorizationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appfabric.AppAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS AppFabric App Authorization Connection. */
  def AppAuthorizationConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.builder
    
    com.pulumi.aws.appfabric.AppAuthorizationConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder)
    /**
     * @param destinationConfiguration Contains information about the destination of ingested data.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param processingConfiguration Contains information about how ingested data is processed.
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

  /** Resource for managing an AWS AppFabric Ingestion. */
  def Ingestion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appfabric.IngestionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.IngestionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appfabric.Ingestion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appfabric.AppAuthorizationConnectionArgs.Builder)
    /**
     * @param authRequest Contains OAuth2 authorization information.This is required if the app authorization for the request is configured with an OAuth2 (oauth2) authorization type.
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

  /** Resource for managing an AWS AppFabric Ingestion Destination. */
  def IngestionDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appfabric.IngestionDestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.IngestionDestinationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appfabric.IngestionDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS AppFabric AppBundle. */
  def AppBundle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appfabric.AppBundleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appfabric.AppBundleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appfabric.AppBundle(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder)
    /**
     * @param apiKeyCredentials Contains API key credential information.
     * @return builder
     */
    def apiKeyCredentials(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialApiKeyCredentialArgs.Builder]*):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder =
      def argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialApiKeyCredentialArgs.builder
      builder.apiKeyCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param oauth2Credential Contains OAuth2 client credential information.
     * @return builder
     */
    def oauth2Credential(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialOauth2CredentialArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialOauth2CredentialArgs.builder
      builder.oauth2Credential(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.Builder)
    /**
     * @param auditLog Contains information about an audit log processing configuration.
     * @return builder
     */
    def auditLog(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationAuditLogArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationProcessingConfigurationAuditLogArgs.builder
      builder.auditLog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder)
    /**
     * @param auditLog Contains information about an audit log processing configuration.
     * @return builder
     */
    def auditLog(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.builder
      builder.auditLog(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationState.Builder)
    /**
     * @param destinationConfiguration Contains information about the destination of ingested data.
     * @return builder
     */
    def destinationConfiguration(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param processingConfiguration Contains information about how ingested data is processed.
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

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder)
    /**
     * @param firehoseStream Contains information about an Amazon Data Firehose delivery stream.
     * @return builder
     */
    def firehoseStream(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationFirehoseStreamArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationFirehoseStreamArgs.builder
      builder.firehoseStream(args(argsBuilder).build)

    /**
     * @param s3Bucket Contains information about an Amazon S3 bucket.
     * @return builder
     */
    def s3Bucket(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationS3BucketArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationS3BucketArgs.builder
      builder.s3Bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appfabric.inputs.AppAuthorizationConnectionState.Builder)
    /**
     * @param authRequest Contains OAuth2 authorization information.This is required if the app authorization for the request is configured with an OAuth2 (oauth2) authorization type.
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

  extension (builder: com.pulumi.aws.appfabric.inputs.AppAuthorizationState.Builder)
    /**
     * @param credential Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     *  Specify credentials that match the authorization type for your request. For example, if the authorization type for your request is OAuth2 (oauth2), then you should provide only the OAuth2 credentials.
     * @return builder
     */
    def credential(args: Endofunction[com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.AppAuthorizationState.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.AppAuthorizationCredentialArgs.builder
      builder.credential(args(argsBuilder).build)

    /**
     * @param tenants Contains information about an application tenant, such as the application display name and identifier.
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

  extension (builder: com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.Builder)
    /**
     * @param destination Contains information about an audit log destination. Only one destination (Firehose Stream) or (S3 Bucket) can be specified.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.Builder]):
        com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogArgs.Builder =
      val argsBuilder = com.pulumi.aws.appfabric.inputs.IngestionDestinationDestinationConfigurationAuditLogDestinationArgs.builder
      builder.destination(args(argsBuilder).build)
