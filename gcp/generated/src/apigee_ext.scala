package jp.ukiba.ko_pulumi
package gcp

object apigee_ext:
  extension (builder: com.pulumi.gcp.apigee.AddonsConfigArgs.Builder)
    /**
     * @param addonsConfig Addon configurations of the Apigee organization.
     * Structure is documented below.
     * @return builder
     */
    inline def addonsConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder]):
        com.pulumi.gcp.apigee.AddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.builder
      builder.addonsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.ApiProductArgs.Builder)
    /**
     * @param attributes Array of attributes that may be used to extend the default API product profile with customer-specific metadata. You can specify a maximum of 18 attributes.
     * Use this property to specify the access level of the API product as either public, private, or internal.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param graphqlOperationGroup Configuration used to group Apigee proxies or remote services with graphQL operation name, graphQL operation type and quotas. This grouping allows us to precisely set quota for a particular combination of graphQL name and operation type for a particular proxy request. If graphQL name is not set, this would imply quota will be applied on all graphQL requests matching the operation type.
     * Structure is documented below.
     * @return builder
     */
    inline def graphqlOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.builder
      builder.graphqlOperationGroup(args(argsBuilder).build)

    /**
     * @param grpcOperationGroup Optional. Configuration used to group Apigee proxies with gRPC services and method names. This grouping allows us to set quota for a particular proxy with the gRPC service name and method. If a method name is not set, this implies quota and authorization are applied to all gRPC methods implemented by that proxy for that particular gRPC service.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.builder
      builder.grpcOperationGroup(args(argsBuilder).build)

    /**
     * @param operationGroup Configuration used to group Apigee proxies or remote services with resources, method types, and quotas. The resource refers to the resource URI (excluding the base path). With this grouping, the API product creator is able to fine-tune and give precise control over which REST methods have access to specific resources and how many calls can be made (using the quota setting).
     * Note: The apiResources setting cannot be specified for both the API product and operation group; otherwise the call will fail.
     * Structure is documented below.
     * @return builder
     */
    inline def operationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.builder
      builder.operationGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.AppGroupArgs.Builder)
    /**
     * @param attributes A list of attributes
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.AppGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.DatastoreArgs.Builder)
    /**
     * @param datastoreConfig Configuration of the datastore target.
     * Structure is documented below.
     * @return builder
     */
    inline def datastoreConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.DatastoreDatastoreConfigArgs.Builder]):
        com.pulumi.gcp.apigee.DatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.DatastoreDatastoreConfigArgs.builder
      builder.datastoreConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.DeveloperAppArgs.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.DeveloperAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.DeveloperArgs.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.DeveloperArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.DnsZoneArgs.Builder)
    /**
     * @param peeringConfig Peering zone config
     * Structure is documented below.
     * @return builder
     */
    inline def peeringConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.apigee.DnsZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.EnvironmentArgs.Builder)
    /**
     * @param clientIpResolutionConfig The algorithm to resolve IP. This will affect Analytics, API Security, and other features that use the client ip. To remove a client ip resolution config, update the field to an empty value. Example: &#39;{ &#34;clientIpResolutionConfig&#34; = {} }&#39; For more information, see: https://cloud.google.com/apigee/docs/api-platform/system-administration/client-ip-resolution
     * Structure is documented below.
     * @return builder
     */
    inline def clientIpResolutionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.builder
      builder.clientIpResolutionConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig NodeConfig for setting the min/max number of nodes associated with the environment.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param properties Key-value pairs that may be used for customizing the environment.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.EnvironmentIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.EnvironmentIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.InstanceArgs.Builder)
    /**
     * @param accessLoggingConfig Access logging configuration enables the access logging feature at the instance.
     * Apigee customers can enable access logging to ship the access logs to their own project&#39;s cloud logging.
     * Structure is documented below.
     * @return builder
     */
    inline def accessLoggingConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.Builder]):
        com.pulumi.gcp.apigee.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.builder
      builder.accessLoggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFileArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.Builder]):
        com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder)
    /**
     * @param subject Subject details.
     * Structure is documented below.
     * @return builder
     */
    inline def subject(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.Builder]):
        com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

    /**
     * @param subjectAlternativeDnsNames List of alternative host names. Maximum length is 255 characters for each value.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAlternativeDnsNames(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.Builder]):
        com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.builder
      builder.subjectAlternativeDnsNames(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.OrganizationArgs.Builder)
    /**
     * @param properties Properties defined in the Apigee organization profile.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.OrganizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityActionArgs.Builder)
    /**
     * @param allow Allow a request through if it matches this SecurityAction.
     * @return builder
     */
    inline def allow(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param conditionConfig A valid SecurityAction must contain at least one condition.
     * Structure is documented below.
     * @return builder
     */
    inline def conditionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.builder
      builder.conditionConfig(args(argsBuilder).build)

    /**
     * @param deny Deny a request through if it matches this SecurityAction.
     * Structure is documented below.
     * @return builder
     */
    inline def deny(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.builder
      builder.deny(args(argsBuilder).build)

    /**
     * @param flag Flag a request through if it matches this SecurityAction.
     * Structure is documented below.
     * @return builder
     */
    inline def flag(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.builder
      builder.flag(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityFeedbackArgs.Builder)
    /**
     * @param feedbackContexts One or more attribute/value pairs for constraining the feedback.
     * Structure is documented below.
     * @return builder
     */
    inline def feedbackContexts(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.Builder]*):
        com.pulumi.gcp.apigee.SecurityFeedbackArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.builder
      builder.feedbackContexts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.SecurityMonitoringConditionArgs.Builder)
    /**
     * @param includeAllResources A nested object resource.
     * @return builder
     */
    inline def includeAllResources(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityMonitoringConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.builder
      builder.includeAllResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityProfileV2Args.Builder)
    /**
     * @param profileAssessmentConfigs A map of the assessment name and the assessment config.
     * Structure is documented below.
     * @return builder
     */
    inline def profileAssessmentConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.SecurityProfileV2Args.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.builder
      builder.profileAssessmentConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.TargetServerArgs.Builder)
    /**
     * @param sSlInfo Specifies TLS configuration info for this TargetServer. The JSON name is sSLInfo for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def sSlInfo(args: Endofunction[com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder]):
        com.pulumi.gcp.apigee.TargetServerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.builder
      builder.sSlInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder)
    /**
     * @param advancedApiOpsConfig Configuration for the Advanced API Ops add-on.
     * Structure is documented below.
     * @return builder
     */
    inline def advancedApiOpsConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigAdvancedApiOpsConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigAdvancedApiOpsConfigArgs.builder
      builder.advancedApiOpsConfig(args(argsBuilder).build)

    /**
     * @param apiSecurityConfig Configuration for the API Security add-on.
     * Structure is documented below.
     * @return builder
     */
    inline def apiSecurityConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigApiSecurityConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigApiSecurityConfigArgs.builder
      builder.apiSecurityConfig(args(argsBuilder).build)

    /**
     * @param connectorsPlatformConfig Configuration for the Monetization add-on.
     * Structure is documented below.
     * @return builder
     */
    inline def connectorsPlatformConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigConnectorsPlatformConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigConnectorsPlatformConfigArgs.builder
      builder.connectorsPlatformConfig(args(argsBuilder).build)

    /**
     * @param integrationConfig Configuration for the Integration add-on.
     * Structure is documented below.
     * @return builder
     */
    inline def integrationConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigIntegrationConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigIntegrationConfigArgs.builder
      builder.integrationConfig(args(argsBuilder).build)

    /**
     * @param monetizationConfig Configuration for the Monetization add-on.
     * Structure is documented below.
     * @return builder
     */
    inline def monetizationConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigMonetizationConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigMonetizationConfigArgs.builder
      builder.monetizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.AddonsConfigState.Builder)
    /**
     * @param addonsConfig Addon configurations of the Apigee organization.
     * Structure is documented below.
     * @return builder
     */
    inline def addonsConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.builder
      builder.addonsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder)
    /**
     * @param operationConfigs List of graphQL operation configuration details associated with Apigee API proxies or remote services. Remote services are non-Apigee proxies, such as Istio-Envoy.
     * Structure is documented below.
     * @return builder
     */
    inline def operationConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.builder
      builder.operationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder)
    /**
     * @param attributes Custom attributes associated with the operation.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Required. List of GraphQL name/operation type pairs for the proxy or remote service to which quota will be applied. If only operation types are specified, the quota will be applied to all GraphQL requests irrespective of the GraphQL name.
     * Note: Currently, you can specify only a single GraphQLOperation. Specifying more than one will cause the operation to fail.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigOperationArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

    /**
     * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * Structure is documented below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigQuotaArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder)
    /**
     * @param operationConfigs Required. List of operation configurations for either Apigee API proxies that are associated with this API product.
     * Structure is documented below.
     * @return builder
     */
    inline def operationConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.builder
      builder.operationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder)
    /**
     * @param attributes Custom attributes associated with the operation.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * Structure is documented below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigQuotaArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder)
    /**
     * @param operationConfigs Required. List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * Structure is documented below.
     * @return builder
     */
    inline def operationConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.builder
      builder.operationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder)
    /**
     * @param attributes Custom attributes associated with the operation.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Required. List of GraphQL name/operation type pairs for the proxy or remote service to which quota will be applied. If only operation types are specified, the quota will be applied to all GraphQL requests irrespective of the GraphQL name.
     * Note: Currently, you can specify only a single GraphQLOperation. Specifying more than one will cause the operation to fail.
     * Structure is documented below.
     * @return builder
     */
    inline def operations(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigOperationArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

    /**
     * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * Structure is documented below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigQuotaArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductState.Builder)
    /**
     * @param attributes Array of attributes that may be used to extend the default API product profile with customer-specific metadata. You can specify a maximum of 18 attributes.
     * Use this property to specify the access level of the API product as either public, private, or internal.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param graphqlOperationGroup Configuration used to group Apigee proxies or remote services with graphQL operation name, graphQL operation type and quotas. This grouping allows us to precisely set quota for a particular combination of graphQL name and operation type for a particular proxy request. If graphQL name is not set, this would imply quota will be applied on all graphQL requests matching the operation type.
     * Structure is documented below.
     * @return builder
     */
    inline def graphqlOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.builder
      builder.graphqlOperationGroup(args(argsBuilder).build)

    /**
     * @param grpcOperationGroup Optional. Configuration used to group Apigee proxies with gRPC services and method names. This grouping allows us to set quota for a particular proxy with the gRPC service name and method. If a method name is not set, this implies quota and authorization are applied to all gRPC methods implemented by that proxy for that particular gRPC service.
     * Structure is documented below.
     * @return builder
     */
    inline def grpcOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.builder
      builder.grpcOperationGroup(args(argsBuilder).build)

    /**
     * @param operationGroup Configuration used to group Apigee proxies or remote services with resources, method types, and quotas. The resource refers to the resource URI (excluding the base path). With this grouping, the API product creator is able to fine-tune and give precise control over which REST methods have access to specific resources and how many calls can be made (using the quota setting).
     * Note: The apiResources setting cannot be specified for both the API product and operation group; otherwise the call will fail.
     * Structure is documented below.
     * @return builder
     */
    inline def operationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.builder
      builder.operationGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiState.Builder)
    /**
     * @param metaDatas Metadata describing the API proxy.
     * Structure is documented below.
     * @return builder
     */
    inline def metaDatas(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiMetaDataArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiMetaDataArgs.builder
      builder.metaDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.AppGroupState.Builder)
    /**
     * @param attributes A list of attributes
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.AppGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.DatastoreState.Builder)
    /**
     * @param datastoreConfig Configuration of the datastore target.
     * Structure is documented below.
     * @return builder
     */
    inline def datastoreConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.DatastoreDatastoreConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.DatastoreState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.DatastoreDatastoreConfigArgs.builder
      builder.datastoreConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder)
    /**
     * @param apiProducts List of API products associated with the developer app.
     * @return builder
     */
    inline def apiProducts(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialApiProductArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialApiProductArgs.builder
      builder.apiProducts(args.map(_(argsBuilder).build)*)

    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.DeveloperAppState.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param credentials Output only. Set of credentials for the developer app consisting of
     * the consumer key/secret pairs associated with the API products.
     * Structure is documented below.
     * @return builder
     */
    inline def credentials(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.builder
      builder.credentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.DeveloperState.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     * Structure is documented below.
     * @return builder
     */
    inline def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.DnsZoneState.Builder)
    /**
     * @param peeringConfig Peering zone config
     * Structure is documented below.
     * @return builder
     */
    inline def peeringConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.DnsZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder)
    /**
     * @param headerIndexAlgorithm Resolves the client ip based on a custom header.
     * Structure is documented below.
     * @return builder
     */
    inline def headerIndexAlgorithm(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigHeaderIndexAlgorithmArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigHeaderIndexAlgorithmArgs.builder
      builder.headerIndexAlgorithm(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder)
    /**
     * @param properties List of all properties in the object.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesPropertyArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder)
    /**
     * @param clientIpResolutionConfig The algorithm to resolve IP. This will affect Analytics, API Security, and other features that use the client ip. To remove a client ip resolution config, update the field to an empty value. Example: &#39;{ &#34;clientIpResolutionConfig&#34; = {} }&#39; For more information, see: https://cloud.google.com/apigee/docs/api-platform/system-administration/client-ip-resolution
     * Structure is documented below.
     * @return builder
     */
    inline def clientIpResolutionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.builder
      builder.clientIpResolutionConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig NodeConfig for setting the min/max number of nodes associated with the environment.
     * Structure is documented below.
     * @return builder
     */
    inline def nodeConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param properties Key-value pairs that may be used for customizing the environment.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.InstanceState.Builder)
    /**
     * @param accessLoggingConfig Access logging configuration enables the access logging feature at the instance.
     * Apigee customers can enable access logging to ship the access logs to their own project&#39;s cloud logging.
     * Structure is documented below.
     * @return builder
     */
    inline def accessLoggingConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.builder
      builder.accessLoggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileState.Builder)
    /**
     * @param certsInfos Chain of certificates under this alias.
     * Structure is documented below.
     * @return builder
     */
    inline def certsInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileCertsInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileCertsInfoArgs.builder
      builder.certsInfos(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.Builder)
    /**
     * @param certInfos (Output)
     * List of all properties in the object.
     * Structure is documented below.
     * @return builder
     */
    inline def certInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoCertInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoCertInfoArgs.builder
      builder.certInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12State.Builder)
    /**
     * @param certsInfos Chain of certificates under this alias.
     * Structure is documented below.
     * @return builder
     */
    inline def certsInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12State.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.builder
      builder.certsInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.Builder)
    /**
     * @param certInfos (Output)
     * List of all properties in the object.
     * Structure is documented below.
     * @return builder
     */
    inline def certInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs.builder
      builder.certInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder)
    /**
     * @param certsInfos Chain of certificates under this alias.
     * Structure is documented below.
     * @return builder
     */
    inline def certsInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.builder
      builder.certsInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param subject Subject details.
     * Structure is documented below.
     * @return builder
     */
    inline def subject(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

    /**
     * @param subjectAlternativeDnsNames List of alternative host names. Maximum length is 255 characters for each value.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAlternativeDnsNames(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.builder
      builder.subjectAlternativeDnsNames(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder)
    /**
     * @param properties List of all properties in the object.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.OrganizationPropertiesPropertyArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.OrganizationPropertiesPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.OrganizationState.Builder)
    /**
     * @param properties Properties defined in the Apigee organization profile.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder)
    /**
     * @param headers A list of HTTP headers to be sent to the target in case of a FLAG SecurityAction.
     * Limit 5 headers per SecurityAction.
     * At least one is mandatory.
     * Structure is documented below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionFlagHeaderArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionFlagHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder)
    /**
     * @param allow Allow a request through if it matches this SecurityAction.
     * @return builder
     */
    inline def allow(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param conditionConfig A valid SecurityAction must contain at least one condition.
     * Structure is documented below.
     * @return builder
     */
    inline def conditionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.builder
      builder.conditionConfig(args(argsBuilder).build)

    /**
     * @param deny Deny a request through if it matches this SecurityAction.
     * Structure is documented below.
     * @return builder
     */
    inline def deny(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.builder
      builder.deny(args(argsBuilder).build)

    /**
     * @param flag Flag a request through if it matches this SecurityAction.
     * Structure is documented below.
     * @return builder
     */
    inline def flag(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.builder
      builder.flag(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityFeedbackState.Builder)
    /**
     * @param feedbackContexts One or more attribute/value pairs for constraining the feedback.
     * Structure is documented below.
     * @return builder
     */
    inline def feedbackContexts(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SecurityFeedbackState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.builder
      builder.feedbackContexts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionState.Builder)
    /**
     * @param includeAllResources A nested object resource.
     * @return builder
     */
    inline def includeAllResources(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.builder
      builder.includeAllResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityProfileV2State.Builder)
    /**
     * @param profileAssessmentConfigs A map of the assessment name and the assessment config.
     * Structure is documented below.
     * @return builder
     */
    inline def profileAssessmentConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SecurityProfileV2State.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.builder
      builder.profileAssessmentConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.SharedflowState.Builder)
    /**
     * @param metaDatas Metadata describing the shared flow.
     * Structure is documented below.
     * @return builder
     */
    inline def metaDatas(args: Endofunction[com.pulumi.gcp.apigee.inputs.SharedflowMetaDataArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SharedflowState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SharedflowMetaDataArgs.builder
      builder.metaDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder)
    /**
     * @param commonName The TLS Common Name of the certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def commonName(args: Endofunction[com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoCommonNameArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.TargetServerState.Builder)
    /**
     * @param sSlInfo Specifies TLS configuration info for this TargetServer. The JSON name is sSLInfo for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def sSlInfo(args: Endofunction[com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.TargetServerState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.builder
      builder.sSlInfo(args(argsBuilder).build)
