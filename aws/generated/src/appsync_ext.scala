package jp.ukiba.ko_pulumi
package aws

object appsync_ext:
  extension (builder: com.pulumi.aws.appsync.ApiArgs.Builder)
    /**
     * @param eventConfig Configuration for the Event API. See `eventConfig` Block below.
     * @return builder
     */
    inline def eventConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder]):
        com.pulumi.aws.appsync.ApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.builder
      builder.eventConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder)
    /**
     * @param handlerConfigs Configuration for the `onPublish` and `onSubscribe` handlers. See `handlerConfigs` below.
     * @return builder
     */
    inline def handlerConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder]):
        com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.builder
      builder.handlerConfigs(args(argsBuilder).build)

    /**
     * @param publishAuthModes Authorization modes to use for publishing messages on the channel namespace. This configuration overrides the default API authorization configuration. See `publishAuthMode` below.
     * @return builder
     */
    inline def publishAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.builder
      builder.publishAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param subscribeAuthModes Authorization modes to use for subscribing to messages on the channel namespace. This configuration overrides the default API authorization configuration. See `subscribeAuthMode` below.
     * @return builder
     */
    inline def subscribeAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.ChannelNamespaceArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.builder
      builder.subscribeAuthModes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appsync.DataSourceArgs.Builder)
    /**
     * @param dynamodbConfig DynamoDB settings. See `dynamodbConfig` Block for details.
     * @return builder
     */
    inline def dynamodbConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.builder
      builder.dynamodbConfig(args(argsBuilder).build)

    /**
     * @param elasticsearchConfig Amazon Elasticsearch settings. See `elasticsearchConfig` Block for details.
     * @return builder
     */
    inline def elasticsearchConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.builder
      builder.elasticsearchConfig(args(argsBuilder).build)

    /**
     * @param eventBridgeConfig AWS EventBridge settings. See `eventBridgeConfig` Block for details.
     * @return builder
     */
    inline def eventBridgeConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.builder
      builder.eventBridgeConfig(args(argsBuilder).build)

    /**
     * @param httpConfig HTTP settings. See `httpConfig` Block for details.
     * @return builder
     */
    inline def httpConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param lambdaConfig AWS Lambda settings. See `lambdaConfig` Block for details.
     * @return builder
     */
    inline def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

    /**
     * @param opensearchserviceConfig Amazon OpenSearch Service settings. See `opensearchserviceConfig` Block for details.
     * @return builder
     */
    inline def opensearchserviceConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.builder
      builder.opensearchserviceConfig(args(argsBuilder).build)

    /**
     * @param relationalDatabaseConfig AWS RDS settings. See `relationalDatabaseConfig` Block for details.
     * @return builder
     */
    inline def relationalDatabaseConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder]):
        com.pulumi.aws.appsync.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.builder
      builder.relationalDatabaseConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.FunctionArgs.Builder)
    /**
     * @param runtime Runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See `runtime` Block for details.
     * @return builder
     */
    inline def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Sync configuration for a resolver. See `syncConfig` Block for details.
     * @return builder
     */
    inline def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.GraphQLApiArgs.Builder)
    /**
     * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphQL API. See `additionalAuthenticationProvider` Block for details.
     * @return builder
     */
    inline def additionalAuthenticationProviders(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder]*):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.builder
      builder.additionalAuthenticationProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. See `enhancedMetricsConfig` Block for details.
     * @return builder
     */
    inline def enhancedMetricsConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.builder
      builder.enhancedMetricsConfig(args(argsBuilder).build)

    /**
     * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. See `lambdaAuthorizerConfig` Block for details.
     * @return builder
     */
    inline def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param logConfig Nested argument containing logging configuration. See `logConfig` Block for details.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Nested argument containing OpenID Connect configuration. See `openidConnectConfig` Block for details.
     * @return builder
     */
    inline def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

    /**
     * @param userPoolConfig Amazon Cognito User Pool configuration. See `userPoolConfig` Block for details.
     * @return builder
     */
    inline def userPoolConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.Builder]):
        com.pulumi.aws.appsync.GraphQLApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.builder
      builder.userPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.ResolverArgs.Builder)
    /**
     * @param cachingConfig Caching Config. See Caching Config.
     * @return builder
     */
    inline def cachingConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.builder
      builder.cachingConfig(args(argsBuilder).build)

    /**
     * @param pipelineConfig Caching configuration for the resolver. See Pipeline Config.
     * @return builder
     */
    inline def pipelineConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.builder
      builder.pipelineConfig(args(argsBuilder).build)

    /**
     * @param runtime Runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     * @return builder
     */
    inline def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Sync configuration for a resolver. See Sync Config.
     * @return builder
     */
    inline def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.ResolverArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder)
    /**
     * @param sourceApiAssociationConfigs Source API Association configuration. See `sourceApiAssociationConfig` Block for details.
     * @return builder
     */
    inline def sourceApiAssociationConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.Builder]*):
        com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.builder
      builder.sourceApiAssociationConfigs(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.appsync.SourceApiAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder)
    /**
     * @param authProviders List of authentication providers. See `event_config.auth_provider` Block below.
     * @return builder
     */
    inline def authProviders(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.builder
      builder.authProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionAuthModes List of authentication modes for connections. See `event_config.connection_auth_mode` Block below.
     * @return builder
     */
    inline def connectionAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigConnectionAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigConnectionAuthModeArgs.builder
      builder.connectionAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultPublishAuthModes List of default authentication modes for publishing. See `event_config.default_publish_auth_mode` Block below.
     * @return builder
     */
    inline def defaultPublishAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultPublishAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultPublishAuthModeArgs.builder
      builder.defaultPublishAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultSubscribeAuthModes List of default authentication modes for subscribing. See `event_config.default_subscribe_auth_mode` Block below.
     * @return builder
     */
    inline def defaultSubscribeAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultSubscribeAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigDefaultSubscribeAuthModeArgs.builder
      builder.defaultSubscribeAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param logConfig Logging configuration. See `logConfig` Block below.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigLogConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder)
    /**
     * @param cognitoConfig Configuration for Cognito user pool authentication. Required when `authType` is `AMAZON_COGNITO_USER_POOLS`. See `cognitoConfig` Block below.
     * @return builder
     */
    inline def cognitoConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderCognitoConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderCognitoConfigArgs.builder
      builder.cognitoConfig(args(argsBuilder).build)

    /**
     * @param lambdaAuthorizerConfig Configuration for Lambda authorization. Required when `authType` is `AWS_LAMBDA`. See `lambdaAuthorizerConfig` Block below.
     * @return builder
     */
    inline def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Configuration for OpenID Connect. Required when `authType` is `OPENID_CONNECT`. See `openidConnectConfig` Block below.
     * @return builder
     */
    inline def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigAuthProviderOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ApiState.Builder)
    /**
     * @param eventConfig Configuration for the Event API. See `eventConfig` Block below.
     * @return builder
     */
    inline def eventConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ApiEventConfigArgs.builder
      builder.eventConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder)
    /**
     * @param onPublish Handler configuration for published events. See `onPublish` below.
     * @return builder
     */
    inline def onPublish(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.builder
      builder.onPublish(args(argsBuilder).build)

    /**
     * @param onSubscribe Handler configuration for subscribe requests. See `onSubscribe` below.
     * @return builder
     */
    inline def onSubscribe(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.builder
      builder.onSubscribe(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.Builder)
    /**
     * @param integration Integration data source configuration for the handler. See `integration` below.
     * @return builder
     */
    inline def integration(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.Builder)
    /**
     * @param lambdaConfig Configuration for a Lambda data source. See `lambdaConfig` below.
     * @return builder
     */
    inline def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnPublishIntegrationLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.Builder)
    /**
     * @param integration Integration data source configuration for the handler. See `integration` below.
     * @return builder
     */
    inline def integration(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.builder
      builder.integration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.Builder)
    /**
     * @param lambdaConfig Configuration for a Lambda data source. See `lambdaConfig` below.
     * @return builder
     */
    inline def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsOnSubscribeIntegrationLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder)
    /**
     * @param handlerConfigs Configuration for the `onPublish` and `onSubscribe` handlers. See `handlerConfigs` below.
     * @return builder
     */
    inline def handlerConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceHandlerConfigsArgs.builder
      builder.handlerConfigs(args(argsBuilder).build)

    /**
     * @param publishAuthModes Authorization modes to use for publishing messages on the channel namespace. This configuration overrides the default API authorization configuration. See `publishAuthMode` below.
     * @return builder
     */
    inline def publishAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespacePublishAuthModeArgs.builder
      builder.publishAuthModes(args.map(_(argsBuilder).build)*)

    /**
     * @param subscribeAuthModes Authorization modes to use for subscribing to messages on the channel namespace. This configuration overrides the default API authorization configuration. See `subscribeAuthMode` below.
     * @return builder
     */
    inline def subscribeAuthModes(args: Endofunction[com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.ChannelNamespaceState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.ChannelNamespaceSubscribeAuthModeArgs.builder
      builder.subscribeAuthModes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder)
    /**
     * @param deltaSyncConfig DeltaSyncConfig for a versioned data source. See `deltaSyncConfig` Block for details.
     * @return builder
     */
    inline def deltaSyncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigArgs.builder
      builder.deltaSyncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder)
    /**
     * @param authorizationConfig Authorization configuration in case the HTTP endpoint requires authorization. See `authorizationConfig` Block for details.
     * @return builder
     */
    inline def authorizationConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.builder
      builder.authorizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.Builder)
    /**
     * @param awsIamConfig Identity and Access Management (IAM) settings. See `awsIamConfig` Block for details.
     * @return builder
     */
    inline def awsIamConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs.builder
      builder.awsIamConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder)
    /**
     * @param httpEndpointConfig Amazon RDS HTTP endpoint configuration. See `httpEndpointConfig` Block for details.
     * @return builder
     */
    inline def httpEndpointConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs.builder
      builder.httpEndpointConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.DataSourceState.Builder)
    /**
     * @param dynamodbConfig DynamoDB settings. See `dynamodbConfig` Block for details.
     * @return builder
     */
    inline def dynamodbConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs.builder
      builder.dynamodbConfig(args(argsBuilder).build)

    /**
     * @param elasticsearchConfig Amazon Elasticsearch settings. See `elasticsearchConfig` Block for details.
     * @return builder
     */
    inline def elasticsearchConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs.builder
      builder.elasticsearchConfig(args(argsBuilder).build)

    /**
     * @param eventBridgeConfig AWS EventBridge settings. See `eventBridgeConfig` Block for details.
     * @return builder
     */
    inline def eventBridgeConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceEventBridgeConfigArgs.builder
      builder.eventBridgeConfig(args(argsBuilder).build)

    /**
     * @param httpConfig HTTP settings. See `httpConfig` Block for details.
     * @return builder
     */
    inline def httpConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param lambdaConfig AWS Lambda settings. See `lambdaConfig` Block for details.
     * @return builder
     */
    inline def lambdaConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs.builder
      builder.lambdaConfig(args(argsBuilder).build)

    /**
     * @param opensearchserviceConfig Amazon OpenSearch Service settings. See `opensearchserviceConfig` Block for details.
     * @return builder
     */
    inline def opensearchserviceConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceOpensearchserviceConfigArgs.builder
      builder.opensearchserviceConfig(args(argsBuilder).build)

    /**
     * @param relationalDatabaseConfig AWS RDS settings. See `relationalDatabaseConfig` Block for details.
     * @return builder
     */
    inline def relationalDatabaseConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs.builder
      builder.relationalDatabaseConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.FunctionState.Builder)
    /**
     * @param runtime Runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See `runtime` Block for details.
     * @return builder
     */
    inline def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Sync configuration for a resolver. See `syncConfig` Block for details.
     * @return builder
     */
    inline def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder)
    /**
     * @param lambdaConflictHandlerConfig Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See `lambdaConflictHandlerConfig` Block for details.
     * @return builder
     */
    inline def lambdaConflictHandlerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.FunctionSyncConfigLambdaConflictHandlerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.FunctionSyncConfigLambdaConflictHandlerConfigArgs.builder
      builder.lambdaConflictHandlerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder)
    /**
     * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. See `lambdaAuthorizerConfig` Block for details.
     * @return builder
     */
    inline def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Nested argument containing OpenID Connect configuration. See `openidConnectConfig` Block for details.
     * @return builder
     */
    inline def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

    /**
     * @param userPoolConfig Amazon Cognito User Pool configuration. See `additional_authentication_provider.user_pool_config` Block for details.
     * @return builder
     */
    inline def userPoolConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs.builder
      builder.userPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder)
    /**
     * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphQL API. See `additionalAuthenticationProvider` Block for details.
     * @return builder
     */
    inline def additionalAuthenticationProviders(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs.builder
      builder.additionalAuthenticationProviders(args.map(_(argsBuilder).build)*)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. See `enhancedMetricsConfig` Block for details.
     * @return builder
     */
    inline def enhancedMetricsConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiEnhancedMetricsConfigArgs.builder
      builder.enhancedMetricsConfig(args(argsBuilder).build)

    /**
     * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. See `lambdaAuthorizerConfig` Block for details.
     * @return builder
     */
    inline def lambdaAuthorizerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs.builder
      builder.lambdaAuthorizerConfig(args(argsBuilder).build)

    /**
     * @param logConfig Nested argument containing logging configuration. See `logConfig` Block for details.
     * @return builder
     */
    inline def logConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs.builder
      builder.logConfig(args(argsBuilder).build)

    /**
     * @param openidConnectConfig Nested argument containing OpenID Connect configuration. See `openidConnectConfig` Block for details.
     * @return builder
     */
    inline def openidConnectConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs.builder
      builder.openidConnectConfig(args(argsBuilder).build)

    /**
     * @param userPoolConfig Amazon Cognito User Pool configuration. See `userPoolConfig` Block for details.
     * @return builder
     */
    inline def userPoolConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.GraphQLApiState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs.builder
      builder.userPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ResolverState.Builder)
    /**
     * @param cachingConfig Caching Config. See Caching Config.
     * @return builder
     */
    inline def cachingConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs.builder
      builder.cachingConfig(args(argsBuilder).build)

    /**
     * @param pipelineConfig Caching configuration for the resolver. See Pipeline Config.
     * @return builder
     */
    inline def pipelineConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs.builder
      builder.pipelineConfig(args(argsBuilder).build)

    /**
     * @param runtime Runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
     * @return builder
     */
    inline def runtime(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverRuntimeArgs.builder
      builder.runtime(args(argsBuilder).build)

    /**
     * @param syncConfig Sync configuration for a resolver. See Sync Config.
     * @return builder
     */
    inline def syncConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder)
    /**
     * @param lambdaConflictHandlerConfig Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * @return builder
     */
    inline def lambdaConflictHandlerConfig(args: Endofunction[com.pulumi.aws.appsync.inputs.ResolverSyncConfigLambdaConflictHandlerConfigArgs.Builder]):
        com.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.ResolverSyncConfigLambdaConflictHandlerConfigArgs.builder
      builder.lambdaConflictHandlerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appsync.inputs.SourceApiAssociationState.Builder)
    /**
     * @param sourceApiAssociationConfigs Source API Association configuration. See `sourceApiAssociationConfig` Block for details.
     * @return builder
     */
    inline def sourceApiAssociationConfigs(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.Builder]*):
        com.pulumi.aws.appsync.inputs.SourceApiAssociationState.Builder =
      def argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationSourceApiAssociationConfigArgs.builder
      builder.sourceApiAssociationConfigs(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.appsync.inputs.SourceApiAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.appsync.inputs.SourceApiAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
