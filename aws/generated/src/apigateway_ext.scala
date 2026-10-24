package jp.ukiba.ko_pulumi
package aws

object apigateway_ext:
  extension (builder: com.pulumi.aws.apigateway.DocumentationPartArgs.Builder)
    /**
     * @param location Location of the targeted API entity of the to-be-created documentation part. See below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.Builder]):
        com.pulumi.aws.apigateway.DocumentationPartArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.DomainNameArgs.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint information including type. See below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name. See below.
     * @return builder
     */
    def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigateway.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.IntegrationArgs.Builder)
    /**
     * @param tlsConfig TLS configuration. See below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigateway.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.MethodSettingsArgs.Builder)
    /**
     * @param settings Settings block, see below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.MethodSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.RestApiArgs.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint configuration including endpoint type. Defined below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.RestApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.RestApiPutArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.Builder]):
        com.pulumi.aws.apigateway.RestApiPutArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.StageArgs.Builder)
    /**
     * @param accessLogSettings Enables access logs for the API stage. See `accessLogSettings` Block below.
     * @return builder
     */
    def accessLogSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param canarySettings Configuration settings of a canary deployment. See `canarySettings` Block below.
     * @return builder
     */
    def canarySettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.Builder]):
        com.pulumi.aws.apigateway.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.builder
      builder.canarySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.UsagePlanArgs.Builder)
    /**
     * @param apiStages Associated API stages of the usage plan. See `apiStages` Block below.
     * @return builder
     */
    def apiStages(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder]*):
        com.pulumi.aws.apigateway.UsagePlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.builder
      builder.apiStages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaSettings Quota settings of the usage plan. See `quotaSettings` Block below.
     * @return builder
     */
    def quotaSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.UsagePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.builder
      builder.quotaSettings(args(argsBuilder).build)

    /**
     * @param throttleSettings Throttling limits of the usage plan. See `throttleSettings` Block below.
     * @return builder
     */
    def throttleSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.UsagePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.builder
      builder.throttleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.AccountState.Builder)
    /**
     * @param throttleSettings Account-Level throttle settings. See `throttleSettings` Block below.
     * @return builder
     */
    def throttleSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.AccountThrottleSettingArgs.Builder]*):
        com.pulumi.aws.apigateway.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.AccountThrottleSettingArgs.builder
      builder.throttleSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigateway.inputs.DocumentationPartState.Builder)
    /**
     * @param location Location of the targeted API entity of the to-be-created documentation part. See below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.DocumentationPartState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.DomainNameState.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint information including type. See below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name. See below.
     * @return builder
     */
    def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.IntegrationState.Builder)
    /**
     * @param tlsConfig TLS configuration. See below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.MethodSettingsState.Builder)
    /**
     * @param settings Settings block, see below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.MethodSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.RestApiPutState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.RestApiPutState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.RestApiState.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint configuration including endpoint type. Defined below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.RestApiState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.StageState.Builder)
    /**
     * @param accessLogSettings Enables access logs for the API stage. See `accessLogSettings` Block below.
     * @return builder
     */
    def accessLogSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param canarySettings Configuration settings of a canary deployment. See `canarySettings` Block below.
     * @return builder
     */
    def canarySettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.builder
      builder.canarySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder)
    /**
     * @param throttles Throttling limits applied to the API stage. See `throttle` Block below.
     * @return builder
     */
    def throttles(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanApiStageThrottleArgs.Builder]*):
        com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanApiStageThrottleArgs.builder
      builder.throttles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder)
    /**
     * @param apiStages Associated API stages of the usage plan. See `apiStages` Block below.
     * @return builder
     */
    def apiStages(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder]*):
        com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.builder
      builder.apiStages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaSettings Quota settings of the usage plan. See `quotaSettings` Block below.
     * @return builder
     */
    def quotaSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.builder
      builder.quotaSettings(args(argsBuilder).build)

    /**
     * @param throttleSettings Throttling limits of the usage plan. See `throttleSettings` Block below.
     * @return builder
     */
    def throttleSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.builder
      builder.throttleSettings(args(argsBuilder).build)
