package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object appsync:
  /** Manages an [AWS AppSync Channel Namespace](https://docs.aws.amazon.com/appsync/latest/eventapi/event-api-concepts.html#namespace). */
  def ChannelNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appsync.ChannelNamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appsync.ChannelNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appsync.DataSourceArgs.Builder)
    /**
     * @param dynamodbConfig DynamoDB settings. See `dynamodbConfig` Block for details.
     * @return builder
     */
    def dynamodbConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.builder
      builder.dynamodbConfig(args(argsBuilder).build)

    /**
     * @param elasticsearchConfig Amazon Elasticsearch settings. See `elasticsearchConfig` Block for details.
     * @return builder
     */
    def elasticsearchConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.builder
      builder.elasticsearchConfig(args(argsBuilder).build)

    /**
     * @param eventBridgeConfig AWS EventBridge settings. See `eventBridgeConfig` Block for details.
     * @return builder
     */
    def eventBridgeConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.builder
      builder.eventBridgeConfig(args(argsBuilder).build)

    /**
     * @param httpConfig HTTP settings. See `httpConfig` Block for details.
     * @return builder
     */
    def httpConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param lambdaConfig AWS Lambda settings. See `lambdaConfig` Block for details.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

    /**
     * @param opensearchserviceConfig Amazon OpenSearch Service settings. See `opensearchserviceConfig` Block for details.
     * @return builder
     */
    def opensearchserviceConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.builder
      builder.opensearchserviceConfig(args(argsBuilder).build)

    /**
     * @param relationalDatabaseConfig AWS RDS settings. See `relationalDatabaseConfig` Block for details.
     * @return builder
     */
    def relationalDatabaseConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.builder
      builder.relationalDatabaseConfig(args(argsBuilder).build)

  /** Provides an AppSync API Cache. */
  def ApiCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.ApiCacheArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.ApiCacheArgs.builder
    
    com.pulumi.aws.appsync.ApiCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appsync.ResolverArgs.Builder)
    /**
     * @param cachingConfig The Caching Config. See Caching Config.
     * @return builder
     */
    def cachingConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.builder
      builder.cachingConfig(args(argsBuilder).build)

    /**
     * @param pipelineConfig The caching configuration for the resolver. See Pipeline Config.
     * @return builder
     */
    def pipelineConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.builder
      builder.pipelineConfig(args(argsBuilder).build)

    /**
     * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     * @return builder
     */
    def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver. See Sync Config.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  /** Provides an AppSync Type. */
  def Type(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.TypeArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.TypeArgs.builder
    
    com.pulumi.aws.appsync.Type(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppSync Resolver. */
  def Resolver(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.ResolverArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.ResolverArgs.builder
    
    com.pulumi.aws.appsync.Resolver(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppSync Domain Name. */
  def DomainName(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.DomainNameArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.DomainNameArgs.builder
    
    com.pulumi.aws.appsync.DomainName(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appsync.GraphQLApiArgs.Builder)
    /**
     * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphQL API. See `additionalAuthenticationProvider` Block for details.
     * @return builder
     */
    def additionalAuthenticationProviders(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder]*):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.builder
      builder.additionalAuthenticationProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. See `enhancedMetricsConfig` Block for details.
     * @return builder
     */
    def enhancedMetricsConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.builder
      builder.enhancedMetricsConfig(args(argsBuilder).build)

    /**
     * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. See `lambdaAuthorizerConfig` Block for details.
     * @return builder
     */
    def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param logConfig Nested argument containing logging configuration. See `logConfig` Block for details.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Nested argument containing OpenID Connect configuration. See `openidConnectConfig` Block for details.
     * @return builder
     */
    def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

    /**
     * @param userPoolConfig Amazon Cognito User Pool configuration. See `userPoolConfig` Block for details.
     * @return builder
     */
    def userPoolConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.builder
      builder.userPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder)
    def sourceApiAssociationConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.Builder]*):
        com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.builder
      builder.sourceApiAssociationConfigs(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides an AppSync API Key. */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.ApiKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.ApiKeyArgs.builder
    
    com.pulumi.aws.appsync.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppSync GraphQL API. */
  def GraphQLApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.GraphQLApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appsync.GraphQLApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appsync.GraphQLApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appsync.FunctionArgs.Builder)
    /**
     * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See `runtime` Block for details.
     * @return builder
     */
    def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver. See `syncConfig` Block for details.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder)
    /**
     * @param handlerConfigs Configuration for the `onPublish` and `onSubscribe` handlers. See Handler Configs below.
     * @return builder
     */
    def handlerConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder]):
        com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.builder
      builder.handlerConfigs(args(argsBuilder).build)

    /**
     * @param publishAuthModes Authorization modes to use for publishing messages on the channel namespace. This configuration overrides the default API authorization configuration. See Auth Modes below.
     * @return builder
     */
    def publishAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.builder
      builder.publishAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param subscribeAuthModes Authorization modes to use for subscribing to messages on the channel namespace. This configuration overrides the default API authorization configuration. See Auth Modes below.
     * @return builder
     */
    def subscribeAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.builder
      builder.subscribeAuthModes(args.map(_(argsBuilder).build)*)

  /** Manages an [AWS AppSync Event API](https://docs.aws.amazon.com/appsync/latest/eventapi/event-api-concepts.html#API). Event APIs enable real-time subscriptions and event-driven communication in AppSync applications. */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.ApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appsync.ApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appsync.Api(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppSync Function. */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.FunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appsync.FunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.appsync.Function(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AppSync API Association. */
  def DomainNameApiAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.DomainNameApiAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.DomainNameApiAssociationArgs.builder
    
    com.pulumi.aws.appsync.DomainNameApiAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.Builder)
    /**
     * @param integration Integration data source configuration for the handler. See Integration below.
     * @return builder
     */
    def integration(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.Builder)
    /**
     * @param lambdaConfig Configuration for a Lambda data source. See Lambda Config below.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder)
    /**
     * @param lambdaConflictHandlerConfig Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * @return builder
     */
    def lambdaConflictHandlerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverSyncConfigLambdaConflictHandlerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverSyncConfigLambdaConflictHandlerConfigArgs.builder
      builder.lambdaConflictHandlerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder)
    /**
     * @param handlerConfigs Configuration for the `onPublish` and `onSubscribe` handlers. See Handler Configs below.
     * @return builder
     */
    def handlerConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.builder
      builder.handlerConfigs(args(argsBuilder).build)

    /**
     * @param publishAuthModes Authorization modes to use for publishing messages on the channel namespace. This configuration overrides the default API authorization configuration. See Auth Modes below.
     * @return builder
     */
    def publishAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.builder
      builder.publishAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param subscribeAuthModes Authorization modes to use for subscribing to messages on the channel namespace. This configuration overrides the default API authorization configuration. See Auth Modes below.
     * @return builder
     */
    def subscribeAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.builder
      builder.subscribeAuthModes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder)
    /**
     * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. See `lambdaAuthorizerConfig` Block for details.
     * @return builder
     */
    def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Nested argument containing OpenID Connect configuration. See `openidConnectConfig` Block for details.
     * @return builder
     */
    def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

    /**
     * @param userPoolConfig Amazon Cognito User Pool configuration. See `userPoolConfig` Block for details.
     * @return builder
     */
    def userPoolConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs.builder
      builder.userPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder)
    /**
     * @param authProviders List of authentication providers. See Auth Providers below.
     * @return builder
     */
    def authProviders(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.builder
      builder.authProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionAuthModes List of authentication modes for connections. See Auth Modes below.
     * @return builder
     */
    def connectionAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigConnectionAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigConnectionAuthModeArgs.builder
      builder.connectionAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultPublishAuthModes List of default authentication modes for publishing. See Auth Modes below.
     * @return builder
     */
    def defaultPublishAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultPublishAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultPublishAuthModeArgs.builder
      builder.defaultPublishAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultSubscribeAuthModes List of default authentication modes for subscribing. See Auth Modes below.
     * @return builder
     */
    def defaultSubscribeAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultSubscribeAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultSubscribeAuthModeArgs.builder
      builder.defaultSubscribeAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param logConfig Logging configuration. See Log Config below.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigLogConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder)
    /**
     * @param deltaSyncConfig The DeltaSyncConfig for a versioned data source. See `deltaSyncConfig` Block for details.
     * @return builder
     */
    def deltaSyncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigArgs.builder
      builder.deltaSyncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.SourceApiAssociationState.Builder)
    def sourceApiAssociationConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.SourceApiAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.builder
      builder.sourceApiAssociationConfigs(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.appsync.inputs.SourceApiAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder)
    /**
     * @param cognitoConfig Configuration for Cognito user pool authentication. Required when `authType` is `AMAZON_COGNITO_USER_POOLS`. See Cognito Config below.
     * @return builder
     */
    def cognitoConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderCognitoConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderCognitoConfigArgs.builder
      builder.cognitoConfig(args(argsBuilder).build)

    /**
     * @param lambdaAuthorizerConfig Configuration for Lambda authorization. Required when `authType` is `AWS_LAMBDA`. See Lambda Authorizer Config below.
     * @return builder
     */
    def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Configuration for OpenID Connect. Required when `authType` is `OPENID_CONNECT`. See OpenID Connect Config below.
     * @return builder
     */
    def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder)
    /**
     * @param authorizationConfig Authorization configuration in case the HTTP endpoint requires authorization. See `authorizationConfig` Block for details.
     * @return builder
     */
    def authorizationConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.builder
      builder.authorizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ApiState.Builder)
    /**
     * @param eventConfig Configuration for the Event API. See Event Config below.
     * @return builder
     */
    def eventConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.builder
      builder.eventConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.FunctionState.Builder)
    /**
     * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See `runtime` Block for details.
     * @return builder
     */
    def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver. See `syncConfig` Block for details.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.Builder)
    /**
     * @param lambdaConfig Configuration for a Lambda data source. See Lambda Config below.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder)
    /**
     * @param httpEndpointConfig Amazon RDS HTTP endpoint configuration. See `httpEndpointConfig` Block for details.
     * @return builder
     */
    def httpEndpointConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs.builder
      builder.httpEndpointConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.Builder)
    /**
     * @param integration Integration data source configuration for the handler. See Integration below.
     * @return builder
     */
    def integration(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder)
    /**
     * @param onPublish Handler configuration. See Handler Config below.
     * @return builder
     */
    def onPublish(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.builder
      builder.onPublish(args(argsBuilder).build)

    /**
     * @param onSubscribe Handler configuration. See Handler Config below.
     * @return builder
     */
    def onSubscribe(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.builder
      builder.onSubscribe(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder)
    /**
     * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphQL API. See `additionalAuthenticationProvider` Block for details.
     * @return builder
     */
    def additionalAuthenticationProviders(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.builder
      builder.additionalAuthenticationProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. See `enhancedMetricsConfig` Block for details.
     * @return builder
     */
    def enhancedMetricsConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.builder
      builder.enhancedMetricsConfig(args(argsBuilder).build)

    /**
     * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. See `lambdaAuthorizerConfig` Block for details.
     * @return builder
     */
    def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param logConfig Nested argument containing logging configuration. See `logConfig` Block for details.
     * @return builder
     */
    def logConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Nested argument containing OpenID Connect configuration. See `openidConnectConfig` Block for details.
     * @return builder
     */
    def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

    /**
     * @param userPoolConfig Amazon Cognito User Pool configuration. See `userPoolConfig` Block for details.
     * @return builder
     */
    def userPoolConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.builder
      builder.userPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder)
    /**
     * @param lambdaConflictHandlerConfig Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See `lambdaConflictHandlerConfig` Block for details.
     * @return builder
     */
    def lambdaConflictHandlerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionSyncConfigLambdaConflictHandlerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionSyncConfigLambdaConflictHandlerConfigArgs.builder
      builder.lambdaConflictHandlerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ResolverState.Builder)
    /**
     * @param cachingConfig The Caching Config. See Caching Config.
     * @return builder
     */
    def cachingConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.builder
      builder.cachingConfig(args(argsBuilder).build)

    /**
     * @param pipelineConfig The caching configuration for the resolver. See Pipeline Config.
     * @return builder
     */
    def pipelineConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.builder
      builder.pipelineConfig(args(argsBuilder).build)

    /**
     * @param runtime Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     * @return builder
     */
    def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Describes a Sync configuration for a resolver. See Sync Config.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.Builder)
    /**
     * @param awsIamConfig Identity and Access Management (IAM) settings. See `awsIamConfig` Block for details.
     * @return builder
     */
    def awsIamConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs.builder
      builder.awsIamConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceState.Builder)
    /**
     * @param dynamodbConfig DynamoDB settings. See `dynamodbConfig` Block for details.
     * @return builder
     */
    def dynamodbConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.builder
      builder.dynamodbConfig(args(argsBuilder).build)

    /**
     * @param elasticsearchConfig Amazon Elasticsearch settings. See `elasticsearchConfig` Block for details.
     * @return builder
     */
    def elasticsearchConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.builder
      builder.elasticsearchConfig(args(argsBuilder).build)

    /**
     * @param eventBridgeConfig AWS EventBridge settings. See `eventBridgeConfig` Block for details.
     * @return builder
     */
    def eventBridgeConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.builder
      builder.eventBridgeConfig(args(argsBuilder).build)

    /**
     * @param httpConfig HTTP settings. See `httpConfig` Block for details.
     * @return builder
     */
    def httpConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param lambdaConfig AWS Lambda settings. See `lambdaConfig` Block for details.
     * @return builder
     */
    def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

    /**
     * @param opensearchserviceConfig Amazon OpenSearch Service settings. See `opensearchserviceConfig` Block for details.
     * @return builder
     */
    def opensearchserviceConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.builder
      builder.opensearchserviceConfig(args(argsBuilder).build)

    /**
     * @param relationalDatabaseConfig AWS RDS settings. See `relationalDatabaseConfig` Block for details.
     * @return builder
     */
    def relationalDatabaseConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.builder
      builder.relationalDatabaseConfig(args(argsBuilder).build)

  /** Resource for managing an AWS AppSync Source API Association. */
  def SourceApiAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.appsync.SourceApiAssociationArgs.builder
    
    com.pulumi.aws.appsync.SourceApiAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appsync.ApiArgs.Builder)
    /**
     * @param eventConfig Configuration for the Event API. See Event Config below.
     * @return builder
     */
    def eventConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder]):
        com.pulumi.aws.appsync.ApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.builder
      builder.eventConfig(args(argsBuilder).build)

  /** Provides an AppSync Data Source. */
  def DataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appsync.DataSourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appsync.DataSourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.appsync.DataSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
