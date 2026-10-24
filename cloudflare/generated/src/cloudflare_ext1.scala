package jp.ukiba.ko_pulumi
package cloudflare

object cloudflare_ext1:
  extension (builder: com.pulumi.cloudflare.AccessApplicationArgs.Builder)
    def corsHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationCorsHeadersArgs.Builder]):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationCorsHeadersArgs.builder
      builder.corsHeaders(args(argsBuilder).build)

    /**
     * @param destinations List of destinations secured by Access. This supersedes `selfHostedDomains` to allow for more flexibility in defining different types of domains. If `destinations` are provided, then `selfHostedDomains` will be ignored.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationDestinationArgs.Builder]*):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param footerLinks The links in the App Launcher footer.
     * @return builder
     */
    def footerLinks(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationFooterLinkArgs.Builder]*):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationFooterLinkArgs.builder
      builder.footerLinks(args.map(_(argsBuilder).build)*)

    /**
     * @param landingPageDesign The design of the App Launcher landing page shown to users when they log in.
     * @return builder
     */
    def landingPageDesign(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationLandingPageDesignArgs.Builder]):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationLandingPageDesignArgs.builder
      builder.landingPageDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for the application. Only valid for self*hosted, ssh, vnc, and rdp application types.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param oauthConfiguration Optional configuration for managing an OAuth authorization flow controlled by Access. When set, Access will act as the OAuth authorization server for this application. This feature is currently in beta.
     * @return builder
     */
    def oauthConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.Builder]):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.builder
      builder.oauthConfiguration(args(argsBuilder).build)

    /**
     * @param policies The policies that Access applies to the application, in ascending order of precedence. Items can reference existing policies or create new policies exclusive to the application.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder]*):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

    def saasApp(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder]):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.builder
      builder.saasApp(args(argsBuilder).build)

    /**
     * @param scimConfig Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.Builder]):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

    /**
     * @param targetCriterias Defines targets covered by the application. Use either the legacy top-level target*attributes format or the rule format, but not both. The rule format requires include; require and exclude are optional. Each rule must contain a non-empty target*attributes or tags selector. Hostname selectors accept 1-5000 non-empty strings. Tag maps accept 1-50 non-empty keys, each with 1-50 non-empty values.
     * @return builder
     */
    def targetCriterias(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.Builder]*):
        com.pulumi.cloudflare.AccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.builder
      builder.targetCriterias(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AccessGroupArgs.Builder)
    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder]*):
        com.pulumi.cloudflare.AccessGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder]*):
        com.pulumi.cloudflare.AccessGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder]*):
        com.pulumi.cloudflare.AccessGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AccessIdentityProviderArgs.Builder)
    /**
     * @param config The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs.Builder]):
        com.pulumi.cloudflare.AccessIdentityProviderArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param scimConfig The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderScimConfigArgs.Builder]):
        com.pulumi.cloudflare.AccessIdentityProviderArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AccessMutualTlsHostnameSettingsArgs.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.AccessMutualTlsHostnameSettingsSettingArgs.Builder]*):
        com.pulumi.cloudflare.AccessMutualTlsHostnameSettingsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessMutualTlsHostnameSettingsSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AccessOrganizationArgs.Builder)
    def customPages(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationCustomPagesArgs.Builder]):
        com.pulumi.cloudflare.AccessOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationCustomPagesArgs.builder
      builder.customPages(args(argsBuilder).build)

    def loginDesign(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs.Builder]):
        com.pulumi.cloudflare.AccessOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs.builder
      builder.loginDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for an organization.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.AccessOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param mfaPivKeyRequirements Configures PIV key requirements for MFA using hardware security keys.
     * @return builder
     */
    def mfaPivKeyRequirements(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationMfaPivKeyRequirementsArgs.Builder]):
        com.pulumi.cloudflare.AccessOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationMfaPivKeyRequirementsArgs.builder
      builder.mfaPivKeyRequirements(args(argsBuilder).build)

    /**
     * @param serviceTokenInactivity Configures automatic enforcement for inactive service tokens. A service token is inactive if no policy references it, and it has not successfully authenticated with an Access application during the selected inactivity period. This setting applies to every service token in your Zero Trust account.
     * @return builder
     */
    def serviceTokenInactivity(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationServiceTokenInactivityArgs.Builder]):
        com.pulumi.cloudflare.AccessOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationServiceTokenInactivityArgs.builder
      builder.serviceTokenInactivity(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AccessPolicyArgs.Builder)
    /**
     * @param approvalGroups Administrators who can approve a temporary authentication request.
     * @return builder
     */
    def approvalGroups(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyApprovalGroupArgs.Builder]*):
        com.pulumi.cloudflare.AccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyApprovalGroupArgs.builder
      builder.approvalGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionRules The rules that define how users may connect to targets secured by your application.
     * @return builder
     */
    def connectionRules(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesArgs.Builder]):
        com.pulumi.cloudflare.AccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesArgs.builder
      builder.connectionRules(args(argsBuilder).build)

    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder]*):
        com.pulumi.cloudflare.AccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder]*):
        com.pulumi.cloudflare.AccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.AccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder]*):
        com.pulumi.cloudflare.AccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AccessRuleArgs.Builder)
    /**
     * @param configuration The rule configuration.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs.Builder]):
        com.pulumi.cloudflare.AccessRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AccountArgs.Builder)
    /**
     * @param managedBy Parent container details
     * @return builder
     */
    def managedBy(args: Endofunction[com.pulumi.cloudflare.inputs.AccountManagedByArgs.Builder]):
        com.pulumi.cloudflare.AccountArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountManagedByArgs.builder
      builder.managedBy(args(argsBuilder).build)

    /**
     * @param settings Account settings
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.AccountSettingsArgs.Builder]):
        com.pulumi.cloudflare.AccountArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

    /**
     * @param unit Information related to the tenant unit. Provide its ID and omit `standalone` to create the Account within an Organization. See https://developers.cloudflare.com/tenant/how-to/manage-accounts/.
     * @return builder
     */
    def unit(args: Endofunction[com.pulumi.cloudflare.inputs.AccountUnitArgs.Builder]):
        com.pulumi.cloudflare.AccountArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountUnitArgs.builder
      builder.unit(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AccountDnsSettingsArgs.Builder)
    /**
     * @param zoneDefaults Default settings for new zones created in this account.
     * @return builder
     */
    def zoneDefaults(args: Endofunction[com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.Builder]):
        com.pulumi.cloudflare.AccountDnsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.builder
      builder.zoneDefaults(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AccountMemberArgs.Builder)
    /**
     * @param policies Array of policies associated with this member.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.Builder]*):
        com.pulumi.cloudflare.AccountMemberArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AccountSubscriptionArgs.Builder)
    /**
     * @param ratePlan The rate plan applied to the subscription.
     * @return builder
     */
    def ratePlan(args: Endofunction[com.pulumi.cloudflare.inputs.AccountSubscriptionRatePlanArgs.Builder]):
        com.pulumi.cloudflare.AccountSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountSubscriptionRatePlanArgs.builder
      builder.ratePlan(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AccountTokenArgs.Builder)
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.AccountTokenConditionArgs.Builder]):
        com.pulumi.cloudflare.AccountTokenArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountTokenConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param policies List of access policies assigned to the token.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AccountTokenPolicyArgs.Builder]*):
        com.pulumi.cloudflare.AccountTokenArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountTokenPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AddressMapArgs.Builder)
    /**
     * @param memberships Zones and Accounts which will be assigned IPs on this Address Map. A zone membership will take priority over an account membership.
     * @return builder
     */
    def memberships(args: Endofunction[com.pulumi.cloudflare.inputs.AddressMapMembershipArgs.Builder]*):
        com.pulumi.cloudflare.AddressMapArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AddressMapMembershipArgs.builder
      builder.memberships(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AiGatewayArgs.Builder)
    def dlp(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDlpArgs.Builder]):
        com.pulumi.cloudflare.AiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDlpArgs.builder
      builder.dlp(args(argsBuilder).build)

    def guardrails(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.Builder]):
        com.pulumi.cloudflare.AiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.builder
      builder.guardrails(args(argsBuilder).build)

    def otels(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayOtelArgs.Builder]*):
        com.pulumi.cloudflare.AiGatewayArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayOtelArgs.builder
      builder.otels(args.map(_(argsBuilder).build)*)

    def spendLimits(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsArgs.Builder]):
        com.pulumi.cloudflare.AiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsArgs.builder
      builder.spendLimits(args(argsBuilder).build)

    def stripe(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayStripeArgs.Builder]):
        com.pulumi.cloudflare.AiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayStripeArgs.builder
      builder.stripe(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AiGatewayDynamicRoutingArgs.Builder)
    def elements(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.Builder]*):
        com.pulumi.cloudflare.AiGatewayDynamicRoutingArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AiSearchInstanceArgs.Builder)
    def customMetadatas(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceCustomMetadataArgs.Builder]*):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceCustomMetadataArgs.builder
      builder.customMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param indexMethod Controls which storage backends are used during indexing. Defaults to vector and keyword indexing for new instances.
     * @return builder
     */
    def indexMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceIndexMethodArgs.Builder]):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceIndexMethodArgs.builder
      builder.indexMethod(args(argsBuilder).build)

    def indexingOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceIndexingOptionsArgs.Builder]):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceIndexingOptionsArgs.builder
      builder.indexingOptions(args(argsBuilder).build)

    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataArgs.Builder]):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    def publicEndpointParams(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder]):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.builder
      builder.publicEndpointParams(args(argsBuilder).build)

    def retrievalOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsArgs.Builder]):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsArgs.builder
      builder.retrievalOptions(args(argsBuilder).build)

    def sourceParams(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsArgs.Builder]):
        com.pulumi.cloudflare.AiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsArgs.builder
      builder.sourceParams(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.AiSearchNamespaceArgs.Builder)
    def publicEndpointParams(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder]):
        com.pulumi.cloudflare.AiSearchNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.builder
      builder.publicEndpointParams(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ApiShieldArgs.Builder)
    def authIdCharacteristics(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldAuthIdCharacteristicArgs.Builder]*):
        com.pulumi.cloudflare.ApiShieldArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldAuthIdCharacteristicArgs.builder
      builder.authIdCharacteristics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ApiTokenArgs.Builder)
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.ApiTokenConditionArgs.Builder]):
        com.pulumi.cloudflare.ApiTokenArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiTokenConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param policies List of access policies assigned to the token.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.ApiTokenPolicyArgs.Builder]*):
        com.pulumi.cloudflare.ApiTokenArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ApiTokenPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.AuthenticatedOriginPullsArgs.Builder)
    def configs(args: Endofunction[com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsConfigArgs.Builder]*):
        com.pulumi.cloudflare.AuthenticatedOriginPullsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.CloudConnectorRulesArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.CloudConnectorRulesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.Builder)
    def host(args: Endofunction[com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.Builder]):
        com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param tlsSettings TLS settings for a connectivity service.
     * @return builder
     */
    def tlsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceTlsSettingsArgs.Builder]):
        com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceTlsSettingsArgs.builder
      builder.tlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ContentScanningExpressionArgs.Builder)
    def bodies(args: Endofunction[com.pulumi.cloudflare.inputs.ContentScanningExpressionBodyArgs.Builder]*):
        com.pulumi.cloudflare.ContentScanningExpressionArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ContentScanningExpressionBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.CustomHostnameArgs.Builder)
    /**
     * @param ssl SSL properties used when creating the custom hostname.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.Builder]):
        com.pulumi.cloudflare.CustomHostnameArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.CustomSslArgs.Builder)
    /**
     * @param geoRestrictions Specify the region where your private key can be held locally for optimal TLS performance. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Options allow distribution to only to U.S. data centers, only to E.U. data centers, or only to highest security data centers. Default distribution is to all Cloudflare datacenters, for optimal performance.
     * @return builder
     */
    def geoRestrictions(args: Endofunction[com.pulumi.cloudflare.inputs.CustomSslGeoRestrictionsArgs.Builder]):
        com.pulumi.cloudflare.CustomSslArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomSslGeoRestrictionsArgs.builder
      builder.geoRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.D1DatabaseArgs.Builder)
    /**
     * @param readReplication Configuration for D1 read replication.
     * @return builder
     */
    def readReplication(args: Endofunction[com.pulumi.cloudflare.inputs.D1DatabaseReadReplicationArgs.Builder]):
        com.pulumi.cloudflare.D1DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.D1DatabaseReadReplicationArgs.builder
      builder.readReplication(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.DeviceManagedNetworksArgs.Builder)
    /**
     * @param config The configuration object containing information for the WARP client to detect the managed network.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.DeviceManagedNetworksConfigArgs.Builder]):
        com.pulumi.cloudflare.DeviceManagedNetworksArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DeviceManagedNetworksConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.DevicePostureIntegrationArgs.Builder)
    /**
     * @param config The configuration object containing third-party integration information.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureIntegrationConfigArgs.Builder]):
        com.pulumi.cloudflare.DevicePostureIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureIntegrationConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.DevicePostureRuleArgs.Builder)
    /**
     * @param input The value to be checked against.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs.Builder]):
        com.pulumi.cloudflare.DevicePostureRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param matches The conditions that the client must match to run the rule.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs.Builder]*):
        com.pulumi.cloudflare.DevicePostureRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.DlpCustomProfileArgs.Builder)
    /**
     * @param contextAwareness Scan the context of predefined entries to only return matches surrounded by keywords.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def contextAwareness(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessArgs.Builder]):
        com.pulumi.cloudflare.DlpCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessArgs.builder
      builder.contextAwareness(args(argsBuilder).build)

    /**
     * @param entries Custom entries from this profile.
     * If this field is omitted, entries owned by this profile will not be changed.
     * @return builder
     * @deprecated This attribute will be sunset on 01/01/2026
     */
    @deprecated("This attribute will be sunset on 01/01/2026") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.DlpCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

    /**
     * @param sensitivityLevels Sensitivity levels to associate with the profile.
     * @return builder
     */
    def sensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileSensitivityLevelArgs.Builder]*):
        com.pulumi.cloudflare.DlpCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileSensitivityLevelArgs.builder
      builder.sensitivityLevels(args.map(_(argsBuilder).build)*)

    /**
     * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * @return builder
     */
    def sharedEntries(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileSharedEntryArgs.Builder]*):
        com.pulumi.cloudflare.DlpCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileSharedEntryArgs.builder
      builder.sharedEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.DlpPredefinedProfileArgs.Builder)
    /**
     * @return builder
     * @deprecated This attribute is deprecated. Use enabledEntries instead.
     */
    @deprecated("This attribute is deprecated. Use enabledEntries instead.") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.DlpPredefinedProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.DlpPredefinedProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpPredefinedProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.DnsFirewallArgs.Builder)
    /**
     * @param attackMitigation Attack mitigation settings
     * @return builder
     */
    def attackMitigation(args: Endofunction[com.pulumi.cloudflare.inputs.DnsFirewallAttackMitigationArgs.Builder]):
        com.pulumi.cloudflare.DnsFirewallArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DnsFirewallAttackMitigationArgs.builder
      builder.attackMitigation(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.DnsRecordArgs.Builder)
    /**
     * @param data Components of a MX record.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.DnsRecordDataArgs.Builder]):
        com.pulumi.cloudflare.DnsRecordArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DnsRecordDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param settings Settings for the DNS record.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.DnsRecordSettingsArgs.Builder]):
        com.pulumi.cloudflare.DnsRecordArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DnsRecordSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.EmailRoutingCatchAllArgs.Builder)
    /**
     * @param actions List actions for the catch-all routing rule.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingCatchAllActionArgs.Builder]*):
        com.pulumi.cloudflare.EmailRoutingCatchAllArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingCatchAllActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchers List of matchers for the catch-all routing rule.
     * @return builder
     */
    def matchers(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingCatchAllMatcherArgs.Builder]*):
        com.pulumi.cloudflare.EmailRoutingCatchAllArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingCatchAllMatcherArgs.builder
      builder.matchers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.EmailRoutingRuleArgs.Builder)
    /**
     * @param actions List actions patterns.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingRuleActionArgs.Builder]*):
        com.pulumi.cloudflare.EmailRoutingRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchers Matching patterns to forward to your actions.
     * @return builder
     */
    def matchers(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingRuleMatcherArgs.Builder]*):
        com.pulumi.cloudflare.EmailRoutingRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingRuleMatcherArgs.builder
      builder.matchers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.FieldExtractorArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.FieldExtractorRuleArgs.Builder]*):
        com.pulumi.cloudflare.FieldExtractorArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FieldExtractorRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.FilterArgs.Builder)
    def bodies(args: Endofunction[com.pulumi.cloudflare.inputs.FilterBodyArgs.Builder]*):
        com.pulumi.cloudflare.FilterArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FilterBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.FirewallRuleArgs.Builder)
    /**
     * @param action The action to perform when the threshold of matched traffic within the configured period is exceeded.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.cloudflare.inputs.FirewallRuleActionArgs.Builder]):
        com.pulumi.cloudflare.FirewallRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.FirewallRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.FirewallRuleFilterArgs.Builder]):
        com.pulumi.cloudflare.FirewallRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.FirewallRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.FlagshipFlagArgs.Builder)
    /**
     * @param rules Targeting rules evaluated in ascending `priority`; the first matching rule wins. An empty array means the flag always serves `defaultVariation`.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.Builder]*):
        com.pulumi.cloudflare.FlagshipFlagArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.HealthcheckArgs.Builder)
    /**
     * @param httpConfig Parameters specific to an HTTP or HTTPS health check.
     * @return builder
     */
    def httpConfig(args: Endofunction[com.pulumi.cloudflare.inputs.HealthcheckHttpConfigArgs.Builder]):
        com.pulumi.cloudflare.HealthcheckArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HealthcheckHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param tcpConfig Parameters specific to TCP health check.
     * @return builder
     */
    def tcpConfig(args: Endofunction[com.pulumi.cloudflare.inputs.HealthcheckTcpConfigArgs.Builder]):
        com.pulumi.cloudflare.HealthcheckArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HealthcheckTcpConfigArgs.builder
      builder.tcpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.HyperdriveConfigArgs.Builder)
    def caching(args: Endofunction[com.pulumi.cloudflare.inputs.HyperdriveConfigCachingArgs.Builder]):
        com.pulumi.cloudflare.HyperdriveConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HyperdriveConfigCachingArgs.builder
      builder.caching(args(argsBuilder).build)

    /**
     * @param mtls mTLS configuration for the origin connection. Cannot be used with VPC Service origins; TLS must be managed on the VPC Service.
     * @return builder
     */
    def mtls(args: Endofunction[com.pulumi.cloudflare.inputs.HyperdriveConfigMtlsArgs.Builder]):
        com.pulumi.cloudflare.HyperdriveConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HyperdriveConfigMtlsArgs.builder
      builder.mtls(args(argsBuilder).build)

    /**
     * @param origin Combines database connection fields with exactly one supported network location.
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.cloudflare.inputs.HyperdriveConfigOriginArgs.Builder]):
        com.pulumi.cloudflare.HyperdriveConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HyperdriveConfigOriginArgs.builder
      builder.origin(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ImageVariantArgs.Builder)
    /**
     * @param options Allows you to define image resizing sizes for different use cases.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.cloudflare.inputs.ImageVariantOptionsArgs.Builder]):
        com.pulumi.cloudflare.ImageVariantArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ImageVariantOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.KeylessCertificateArgs.Builder)
    /**
     * @param tunnel Configuration for using Keyless SSL through a Cloudflare Tunnel.
     * @return builder
     */
    def tunnel(args: Endofunction[com.pulumi.cloudflare.inputs.KeylessCertificateTunnelArgs.Builder]):
        com.pulumi.cloudflare.KeylessCertificateArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.KeylessCertificateTunnelArgs.builder
      builder.tunnel(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ListArgs.Builder)
    /**
     * @param items The items in the list. If set, this overwrites all items in the list. Do not use with `cloudflare.ListItem`.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemArgs.Builder]*):
        com.pulumi.cloudflare.ListArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ListItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ListItemArgs.Builder)
    /**
     * @param hostname Hostnames support ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemHostnameArgs.Builder]):
        com.pulumi.cloudflare.ListItemArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ListItemHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param redirect The definition of the redirect.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemRedirectArgs.Builder]):
        com.pulumi.cloudflare.ListItemArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ListItemRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.LoadBalancerArgs.Builder)
    /**
     * @param adaptiveRouting Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests. For example, zero-downtime failover occurs immediately when an origin becomes unavailable due to HTTP 521, 522, or 523 response codes. If there is another healthy origin in the same pool, the request is retried once against this alternate origin.
     * @return builder
     */
    def adaptiveRouting(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerAdaptiveRoutingArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerAdaptiveRoutingArgs.builder
      builder.adaptiveRouting(args(argsBuilder).build)

    /**
     * @param locationStrategy Controls location-based steering for non-proxied requests. See `steeringPolicy` to learn how steering is affected.
     * @return builder
     */
    def locationStrategy(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerLocationStrategyArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerLocationStrategyArgs.builder
      builder.locationStrategy(args(argsBuilder).build)

    /**
     * @param randomSteering Configures pool weights.
     * @return builder
     */
    def randomSteering(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRandomSteeringArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRandomSteeringArgs.builder
      builder.randomSteering(args(argsBuilder).build)

    /**
     * @param rules BETA Field Not General Access: A list of rules for this load balancer to execute.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.Builder]*):
        com.pulumi.cloudflare.LoadBalancerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionAffinityAttributes Configures attributes for session affinity.
     * @return builder
     */
    def sessionAffinityAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerSessionAffinityAttributesArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerSessionAffinityAttributesArgs.builder
      builder.sessionAffinityAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.LoadBalancerMonitorGroupArgs.Builder)
    /**
     * @param members List of monitors in this group
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerMonitorGroupMemberArgs.Builder]*):
        com.pulumi.cloudflare.LoadBalancerMonitorGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerMonitorGroupMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder)
    /**
     * @param loadShedding Configures load shedding policies and percentages for the pool.
     * @return builder
     */
    def loadShedding(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolLoadSheddingArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolLoadSheddingArgs.builder
      builder.loadShedding(args(argsBuilder).build)

    /**
     * @param notificationFilter Filter pool and origin health notifications by resource type or health status. Use null to reset.
     * @return builder
     */
    def notificationFilter(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.builder
      builder.notificationFilter(args(argsBuilder).build)

    /**
     * @param originSteering Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.
     * @return builder
     */
    def originSteering(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginSteeringArgs.Builder]):
        com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginSteeringArgs.builder
      builder.originSteering(args(argsBuilder).build)

    /**
     * @param origins The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * @return builder
     */
    def origins(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs.Builder]*):
        com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.LogpushJobArgs.Builder)
    /**
     * @param outputOptions The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
     * @return builder
     */
    def outputOptions(args: Endofunction[com.pulumi.cloudflare.inputs.LogpushJobOutputOptionsArgs.Builder]):
        com.pulumi.cloudflare.LogpushJobArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LogpushJobOutputOptionsArgs.builder
      builder.outputOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicNetworkMonitoringConfigurationArgs.Builder)
    def warpDevices(args: Endofunction[com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationWarpDeviceArgs.Builder]*):
        com.pulumi.cloudflare.MagicNetworkMonitoringConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationWarpDeviceArgs.builder
      builder.warpDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.MagicTransitCf1SiteArgs.Builder)
    def bodies(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyArgs.Builder]*):
        com.pulumi.cloudflare.MagicTransitCf1SiteArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

    def location(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitCf1SiteLocationArgs.Builder]):
        com.pulumi.cloudflare.MagicTransitCf1SiteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitCf1SiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicTransitConnectorArgs.Builder)
    def device(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitConnectorDeviceArgs.Builder]):
        com.pulumi.cloudflare.MagicTransitConnectorArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitConnectorDeviceArgs.builder
      builder.device(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicTransitSiteAclArgs.Builder)
    def lan1(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan1Args.Builder]):
        com.pulumi.cloudflare.MagicTransitSiteAclArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan1Args.builder
      builder.lan1(args(argsBuilder).build)

    def lan2(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan2Args.Builder]):
        com.pulumi.cloudflare.MagicTransitSiteAclArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan2Args.builder
      builder.lan2(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicTransitSiteArgs.Builder)
    /**
     * @param location Location of site in latitude and longitude.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLocationArgs.Builder]):
        com.pulumi.cloudflare.MagicTransitSiteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicTransitSiteLanArgs.Builder)
    def nat(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanNatArgs.Builder]):
        com.pulumi.cloudflare.MagicTransitSiteLanArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanNatArgs.builder
      builder.nat(args(argsBuilder).build)

    def routedSubnets(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetArgs.Builder]*):
        com.pulumi.cloudflare.MagicTransitSiteLanArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanRoutedSubnetArgs.builder
      builder.routedSubnets(args.map(_(argsBuilder).build)*)

    /**
     * @param staticAddressing If the site is not configured in high availability mode, this configuration is optional (if omitted, use DHCP). However, if in high availability mode, static*address is required along with secondary and virtual address.
     * @return builder
     */
    def staticAddressing(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.Builder]):
        com.pulumi.cloudflare.MagicTransitSiteLanArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteLanStaticAddressingArgs.builder
      builder.staticAddressing(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicTransitSiteWanArgs.Builder)
    /**
     * @param staticAddressing (optional) if omitted, use DHCP. Submit secondary*address when site is in high availability mode.
     * @return builder
     */
    def staticAddressing(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteWanStaticAddressingArgs.Builder]):
        com.pulumi.cloudflare.MagicTransitSiteWanArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteWanStaticAddressingArgs.builder
      builder.staticAddressing(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicWanGreTunnelArgs.Builder)
    def bgp(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanGreTunnelBgpArgs.Builder]):
        com.pulumi.cloudflare.MagicWanGreTunnelArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanGreTunnelBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

    def healthCheck(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckArgs.Builder]):
        com.pulumi.cloudflare.MagicWanGreTunnelArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanGreTunnelHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.Builder)
    def bgp(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelBgpArgs.Builder]):
        com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelBgpArgs.builder
      builder.bgp(args(argsBuilder).build)

    def customRemoteIdentities(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelCustomRemoteIdentitiesArgs.Builder]):
        com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelCustomRemoteIdentitiesArgs.builder
      builder.customRemoteIdentities(args(argsBuilder).build)

    def healthCheck(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckArgs.Builder]):
        com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanIpsecTunnelHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.MagicWanStaticRouteArgs.Builder)
    /**
     * @param scope Used only for ECMP routes.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.cloudflare.inputs.MagicWanStaticRouteScopeArgs.Builder]):
        com.pulumi.cloudflare.MagicWanStaticRouteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicWanStaticRouteScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ManagedHeadersArgs.Builder)
    /**
     * @param managedRequestHeaders The list of Managed Request Transforms.
     * @return builder
     */
    def managedRequestHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedHeadersManagedRequestHeaderArgs.Builder]*):
        com.pulumi.cloudflare.ManagedHeadersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedHeadersManagedRequestHeaderArgs.builder
      builder.managedRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param managedResponseHeaders The list of Managed Response Transforms.
     * @return builder
     */
    def managedResponseHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedHeadersManagedResponseHeaderArgs.Builder]*):
        com.pulumi.cloudflare.ManagedHeadersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedHeadersManagedResponseHeaderArgs.builder
      builder.managedResponseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ManagedTransformsArgs.Builder)
    /**
     * @param managedRequestHeaders The list of Managed Request Transforms.
     * @return builder
     */
    def managedRequestHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedTransformsManagedRequestHeaderArgs.Builder]*):
        com.pulumi.cloudflare.ManagedTransformsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedTransformsManagedRequestHeaderArgs.builder
      builder.managedRequestHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param managedResponseHeaders The list of Managed Response Transforms.
     * @return builder
     */
    def managedResponseHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ManagedTransformsManagedResponseHeaderArgs.Builder]*):
        com.pulumi.cloudflare.ManagedTransformsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ManagedTransformsManagedResponseHeaderArgs.builder
      builder.managedResponseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.MonetizationRulesArgs.Builder)
    /**
     * @param rules Full desired Payment Required ruleset. An empty array clears all payment rules. The ruleset may contain at most 40 unique wallet addresses; address comparison is case-insensitive. Every address must pass wallet screening before deployment.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.MonetizationRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.MonetizationRulesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MonetizationRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.MoqRelayArgs.Builder)
    /**
     * @param config upstreams and lingeringSubscribe are mutually exclusive.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.Builder]):
        com.pulumi.cloudflare.MoqRelayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MoqRelayConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.NelSettingArgs.Builder)
    /**
     * @param value The NEL configuration value.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.cloudflare.inputs.NelSettingValueArgs.Builder]):
        com.pulumi.cloudflare.NelSettingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.NelSettingValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.NotificationPolicyArgs.Builder)
    /**
     * @param filters Optional filters that allow you to be alerted only on a subset of events for that alert type based on some criteria. This is only available for select alert types. See alert type documentation for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyFiltersArgs.Builder]):
        com.pulumi.cloudflare.NotificationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param mechanisms List of IDs that will be used when dispatching a notification. IDs for email type will be the email address.
     * @return builder
     */
    def mechanisms(args: Endofunction[com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.Builder]):
        com.pulumi.cloudflare.NotificationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.NotificationPolicyMechanismsArgs.builder
      builder.mechanisms(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.OrganizationArgs.Builder)
    def parent(args: Endofunction[com.pulumi.cloudflare.inputs.OrganizationParentArgs.Builder]):
        com.pulumi.cloudflare.OrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OrganizationParentArgs.builder
      builder.parent(args(argsBuilder).build)

    def profile(args: Endofunction[com.pulumi.cloudflare.inputs.OrganizationProfileArgs.Builder]):
        com.pulumi.cloudflare.OrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.OrganizationProfileArgs.builder
      builder.profile(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.PageRuleArgs.Builder)
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.PageRuleActionsArgs.Builder]):
        com.pulumi.cloudflare.PageRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PageRuleActionsArgs.builder
      builder.actions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.PagesProjectArgs.Builder)
    /**
     * @param buildConfig Configs for the project build process.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs.Builder]):
        com.pulumi.cloudflare.PagesProjectArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param deploymentConfigs Configs for deployments in a project.
     * @return builder
     */
    def deploymentConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.Builder]):
        com.pulumi.cloudflare.PagesProjectArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs.builder
      builder.deploymentConfigs(args(argsBuilder).build)

    /**
     * @param source Configs for the project source control.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.PagesProjectSourceArgs.Builder]):
        com.pulumi.cloudflare.PagesProjectArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PagesProjectSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.PipelineSinkArgs.Builder)
    /**
     * @param config Defines the configuration of the R2 Sink.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.Builder]):
        com.pulumi.cloudflare.PipelineSinkArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param format Defines the output data format of a sink.
     * @return builder
     */
    def format(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkFormatArgs.Builder]):
        com.pulumi.cloudflare.PipelineSinkArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkFormatArgs.builder
      builder.format(args(argsBuilder).build)

    /**
     * @param schema Defines the schema of the events in the data stream.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineSinkSchemaArgs.Builder]):
        com.pulumi.cloudflare.PipelineSinkArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineSinkSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.PipelineStreamArgs.Builder)
    /**
     * @param format Defines the data format of the events.
     * @return builder
     */
    def format(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamFormatArgs.Builder]):
        com.pulumi.cloudflare.PipelineStreamArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamFormatArgs.builder
      builder.format(args(argsBuilder).build)

    def http(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamHttpArgs.Builder]):
        com.pulumi.cloudflare.PipelineStreamArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamHttpArgs.builder
      builder.http(args(argsBuilder).build)

    /**
     * @param schema Defines the schema of the events in the data stream.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamSchemaArgs.Builder]):
        com.pulumi.cloudflare.PipelineStreamArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    def workerBinding(args: Endofunction[com.pulumi.cloudflare.inputs.PipelineStreamWorkerBindingArgs.Builder]):
        com.pulumi.cloudflare.PipelineStreamArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.PipelineStreamWorkerBindingArgs.builder
      builder.workerBinding(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.PrecursorArgs.Builder)
    /**
     * @param enforcementRules The ordered list of enforcement rules for the zone.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def enforcementRules(args: Endofunction[com.pulumi.cloudflare.inputs.PrecursorEnforcementRuleArgs.Builder]*):
        com.pulumi.cloudflare.PrecursorArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.PrecursorEnforcementRuleArgs.builder
      builder.enforcementRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.QueueArgs.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.QueueSettingsArgs.Builder]):
        com.pulumi.cloudflare.QueueArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.QueueSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.QueueConsumerArgs.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.Builder]):
        com.pulumi.cloudflare.QueueConsumerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.QueueConsumerSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.R2BucketCorsArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketCorsRuleArgs.Builder]*):
        com.pulumi.cloudflare.R2BucketCorsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketCorsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.R2BucketEventNotificationArgs.Builder)
    /**
     * @param rules Array of rules to drive notifications.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketEventNotificationRuleArgs.Builder]*):
        com.pulumi.cloudflare.R2BucketEventNotificationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketEventNotificationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.R2BucketLifecycleArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.cloudflare.R2BucketLifecycleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLifecycleRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.R2BucketLockArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketLockRuleArgs.Builder]*):
        com.pulumi.cloudflare.R2BucketLockArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.R2BucketLockRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.R2BucketSippyArgs.Builder)
    /**
     * @param destination R2 bucket to copy objects to.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketSippyDestinationArgs.Builder]):
        com.pulumi.cloudflare.R2BucketSippyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketSippyDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param source AWS S3 bucket to copy objects from.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.R2BucketSippySourceArgs.Builder]):
        com.pulumi.cloudflare.R2BucketSippyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.R2BucketSippySourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.RateLimitArgs.Builder)
    /**
     * @param action The action to perform when the threshold of matched traffic within the configured period is exceeded.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitActionArgs.Builder]):
        com.pulumi.cloudflare.RateLimitArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param match Determines which traffic the rate limit counts towards the threshold.
     * @return builder
     */
    def `match`(args: Endofunction[com.pulumi.cloudflare.inputs.RateLimitMatchArgs.Builder]):
        com.pulumi.cloudflare.RateLimitArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RateLimitMatchArgs.builder
      builder.`match`(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.RecordArgs.Builder)
    /**
     * @param data Components of a MX record.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.RecordDataArgs.Builder]):
        com.pulumi.cloudflare.RecordArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RecordDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param settings Settings for the DNS record.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.RecordSettingsArgs.Builder]):
        com.pulumi.cloudflare.RecordArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.RecordSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.RulesetArgs.Builder)
    /**
     * @param rules The list of rules in the ruleset.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.RulesetRuleArgs.Builder]*):
        com.pulumi.cloudflare.RulesetArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.RulesetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ShareArgs.Builder)
    def recipients(args: Endofunction[com.pulumi.cloudflare.inputs.ShareRecipientArgs.Builder]*):
        com.pulumi.cloudflare.ShareArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ShareRecipientArgs.builder
      builder.recipients(args.map(_(argsBuilder).build)*)

    def resources(args: Endofunction[com.pulumi.cloudflare.inputs.ShareResourceArgs.Builder]*):
        com.pulumi.cloudflare.ShareArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ShareResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.SnippetArgs.Builder)
    /**
     * @param files The list of files belonging to the snippet.
     * @return builder
     */
    def files(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetFileArgs.Builder]*):
        com.pulumi.cloudflare.SnippetArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.SnippetFileArgs.builder
      builder.files(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Provide metadata about the snippet.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetMetadataArgs.Builder]):
        com.pulumi.cloudflare.SnippetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SnippetMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.SnippetRulesArgs.Builder)
    /**
     * @param rules Lists snippet rules.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.SnippetRulesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.SnippetRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.SnippetsArgs.Builder)
    /**
     * @param metadata Metadata about the snippet.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.SnippetsMetadataArgs.Builder]):
        com.pulumi.cloudflare.SnippetsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SnippetsMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.SpectrumApplicationArgs.Builder)
    /**
     * @param dns The name and type of DNS record for the Spectrum application.
     * @return builder
     */
    def dns(args: Endofunction[com.pulumi.cloudflare.inputs.SpectrumApplicationDnsArgs.Builder]):
        com.pulumi.cloudflare.SpectrumApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SpectrumApplicationDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param edgeIps The anycast edge IP configuration for the hostname of this application.
     * @return builder
     */
    def edgeIps(args: Endofunction[com.pulumi.cloudflare.inputs.SpectrumApplicationEdgeIpsArgs.Builder]):
        com.pulumi.cloudflare.SpectrumApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SpectrumApplicationEdgeIpsArgs.builder
      builder.edgeIps(args(argsBuilder).build)

    /**
     * @param originDns The name and type of DNS record for the Spectrum application.
     * @return builder
     */
    def originDns(args: Endofunction[com.pulumi.cloudflare.inputs.SpectrumApplicationOriginDnsArgs.Builder]):
        com.pulumi.cloudflare.SpectrumApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.SpectrumApplicationOriginDnsArgs.builder
      builder.originDns(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.StaticRouteArgs.Builder)
    /**
     * @param scope Used only for ECMP routes.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.cloudflare.inputs.StaticRouteScopeArgs.Builder]):
        com.pulumi.cloudflare.StaticRouteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StaticRouteScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.StreamArgs.Builder)
    /**
     * @param publicDetails Public details for the video including title, share link, channel link, and logo.
     * @return builder
     */
    def publicDetails(args: Endofunction[com.pulumi.cloudflare.inputs.StreamPublicDetailsArgs.Builder]):
        com.pulumi.cloudflare.StreamArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamPublicDetailsArgs.builder
      builder.publicDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.StreamLiveInputArgs.Builder)
    /**
     * @param recording Records the input to a Cloudflare Stream video. Behavior depends on the mode. In most cases, the video will initially be viewable as a live video and transition to on-demand after a condition is satisfied.
     * @return builder
     */
    def recording(args: Endofunction[com.pulumi.cloudflare.inputs.StreamLiveInputRecordingArgs.Builder]):
        com.pulumi.cloudflare.StreamLiveInputArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.StreamLiveInputRecordingArgs.builder
      builder.recording(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.TeamsAccountArgs.Builder)
    /**
     * @param settings Specify account settings.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.Builder]):
        com.pulumi.cloudflare.TeamsAccountArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsAccountSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.TeamsListArgs.Builder)
    /**
     * @param items Add items to the list.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsListItemArgs.Builder]*):
        com.pulumi.cloudflare.TeamsListArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsListItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.TeamsLocationArgs.Builder)
    /**
     * @param endpoints Configure the destination endpoints for this location.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.Builder]):
        com.pulumi.cloudflare.TeamsLocationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

    /**
     * @param maxTtl Controls how DNS response TTLs are capped for this location relative to the account `maxTtlSecs` setting. Omitting `maxTtl` on update resets it to `inherit`.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationMaxTtlArgs.Builder]):
        com.pulumi.cloudflare.TeamsLocationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param networks Specify the list of network ranges from which requests at this location originate. The list takes effect only if it is non-empty and the IPv4 endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsLocationNetworkArgs.Builder]*):
        com.pulumi.cloudflare.TeamsLocationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.TeamsLocationNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.TeamsRuleArgs.Builder)
    /**
     * @param expiration Defines the expiration time stamp and default duration of a DNS policy. Takes precedence over the policy&#39;s `schedule` configuration, if any. This  does not apply to HTTP or network policies. Settable only for `dns` rules.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleExpirationArgs.Builder]):
        com.pulumi.cloudflare.TeamsRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param ruleSettings Defines settings for this rule. Settings apply only to specific rule types and must use compatible selectors. If Terraform detects drift, confirm the setting supports your rule type and check whether the API modifies the value. Use API-returned values in your configuration to prevent drift.
     * @return builder
     */
    def ruleSettings(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.Builder]):
        com.pulumi.cloudflare.TeamsRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs.builder
      builder.ruleSettings(args(argsBuilder).build)

    /**
     * @param schedule Defines the schedule for activating DNS policies. Settable only for `dns` and `dnsResolver` rules.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.cloudflare.inputs.TeamsRuleScheduleArgs.Builder]):
        com.pulumi.cloudflare.TeamsRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TeamsRuleScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.TokenValidationConfigArgs.Builder)
    /**
     * @param credentials Request payload for create and PUT credentials operations. Provided keys define the complete stored key set. Key identities (`{alg,kid}`) must be unique.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsArgs.Builder]):
        com.pulumi.cloudflare.TokenValidationConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationConfigCredentialsArgs.builder
      builder.credentials(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.TokenValidationRulesArgs.Builder)
    /**
     * @param position Update rule order among zone rules.
     * @return builder
     */
    def position(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationRulesPositionArgs.Builder]):
        com.pulumi.cloudflare.TokenValidationRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationRulesPositionArgs.builder
      builder.position(args(argsBuilder).build)

    /**
     * @param selector Select operations covered by this rule.
     * 
     * For details on selectors, see the [Cloudflare Docs](https://developers.cloudflare.com/api-shield/security/jwt-validation/).
     * @return builder
     */
    def selector(args: Endofunction[com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.Builder]):
        com.pulumi.cloudflare.TokenValidationRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TokenValidationRulesSelectorArgs.builder
      builder.selector(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.TunnelConfigArgs.Builder)
    /**
     * @param config The tunnel configuration and ingress rules.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.Builder]):
        com.pulumi.cloudflare.TunnelConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.UserAgentBlockingRuleArgs.Builder)
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.UserAgentBlockingRuleConfigurationArgs.Builder]):
        com.pulumi.cloudflare.UserAgentBlockingRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.UserAgentBlockingRuleConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.UserGroupArgs.Builder)
    /**
     * @param policies Policies attached to the User group
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.Builder]*):
        com.pulumi.cloudflare.UserGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserGroupPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.UserGroupMembersArgs.Builder)
    def members(args: Endofunction[com.pulumi.cloudflare.inputs.UserGroupMembersMemberArgs.Builder]*):
        com.pulumi.cloudflare.UserGroupMembersArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.UserGroupMembersMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironmentArgs.Builder)
    /**
     * @param target Identifies the Cloudflare asset to scan. Uses a `type` discriminator.
     * Currently the service supports only `zone` targets.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.cloudflare.inputs.VulnerabilityScannerTargetEnvironmentTargetArgs.Builder]):
        com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.VulnerabilityScannerTargetEnvironmentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.WaitingRoomArgs.Builder)
    /**
     * @param additionalRoutes Only available for the Waiting Room Advanced subscription. Additional hostname and path combinations to which this waiting room will be applied. There is an implied wildcard at the end of the path. The hostname and path combination must be unique to this and all other waiting rooms.
     * @return builder
     */
    def additionalRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.WaitingRoomAdditionalRouteArgs.Builder]*):
        com.pulumi.cloudflare.WaitingRoomArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WaitingRoomAdditionalRouteArgs.builder
      builder.additionalRoutes(args.map(_(argsBuilder).build)*)

    /**
     * @param cookieAttributes Configures cookie attributes for the waiting room cookie. This encrypted cookie stores a user&#39;s status in the waiting room, such as queue position.
     * @return builder
     */
    def cookieAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.WaitingRoomCookieAttributesArgs.Builder]):
        com.pulumi.cloudflare.WaitingRoomArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WaitingRoomCookieAttributesArgs.builder
      builder.cookieAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.WaitingRoomRulesArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.WaitingRoomRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.WaitingRoomRulesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WaitingRoomRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkerArgs.Builder)
    /**
     * @param observability Observability settings for the Worker.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.Builder]):
        com.pulumi.cloudflare.WorkerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param previewsBaseConfig Template configuration used when creating new Previews for this Worker.
     * @return builder
     */
    def previewsBaseConfig(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.Builder]):
        com.pulumi.cloudflare.WorkerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerPreviewsBaseConfigArgs.builder
      builder.previewsBaseConfig(args(argsBuilder).build)

    /**
     * @param subdomain Subdomain settings for the Worker.
     * @return builder
     */
    def subdomain(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerSubdomainArgs.Builder]):
        com.pulumi.cloudflare.WorkerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerSubdomainArgs.builder
      builder.subdomain(args(argsBuilder).build)

    /**
     * @param tailConsumers Other Workers that should consume logs from the Worker.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.WorkerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkerCronTriggerArgs.Builder)
    def schedules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerCronTriggerScheduleArgs.Builder]*):
        com.pulumi.cloudflare.WorkerCronTriggerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerCronTriggerScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkerScriptArgs.Builder)
    /**
     * @param annotations Annotations for the version created by this upload.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param assets Configuration for assets within a Worker.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptAssetsArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptAssetsArgs.builder
      builder.assets(args(argsBuilder).build)

    /**
     * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.Builder]*):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheOptions Global CacheW configuration for the Worker. When caching is on,
     * the platform provisions a `cloudflare.app` zone for the Worker.
     * A `type: worker` entry in the `exports` map can override this
     * value for a single entrypoint.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param limits Limits to apply for this Worker.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptLimitsArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param migrations Migrations to apply for Durable Objects associated with this Worker.
     * @return builder
     */
    def migrations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptMigrationsArgs.builder
      builder.migrations(args(argsBuilder).build)

    /**
     * @param observability Observability settings for the Worker.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param packageDependencies The list of npm packages that were installed and used when this Worker was built.
     * @return builder
     */
    def packageDependencies(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptPackageDependencyArgs.Builder]*):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptPackageDependencyArgs.builder
      builder.packageDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement). Specify mode=&#39;smart&#39; for Smart Placement, or one of region/hostname/host.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs.Builder]):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param tailConsumers List of Workers that will consume logs from the attached Worker.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerScriptTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.WorkerScriptArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerScriptTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkerVersionArgs.Builder)
    /**
     * @param annotations Metadata about the version.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param assets Configuration for assets within a Worker.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionAssetsArgs.Builder]):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionAssetsArgs.builder
      builder.assets(args(argsBuilder).build)

    /**
     * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.Builder]*):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheOptions Global CacheW configuration for the Worker. When caching is on,
     * the platform provisions a `cloudflare.app` zone for the Worker.
     * A `type: worker` entry in the `exports` map can override this
     * value for a single entrypoint.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param containers List of containers attached to a Worker. Containers can only be attached to Durable Object classes of this Worker script.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionContainerArgs.Builder]*):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param limits Resource limits enforced at runtime.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionLimitsArgs.Builder]):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param migrations Migrations for Durable Objects associated with the version. Migrations are applied when the version is deployed.
     * @return builder
     */
    def migrations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.Builder]):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionMigrationsArgs.builder
      builder.migrations(args(argsBuilder).build)

    /**
     * @param modules Code, sourcemaps, and other content used at runtime.
     * 
     * This includes [`_headers`](https://developers.cloudflare.com/workers/static-assets/headers/#custom-headers) and
     * [`_redirects`](https://developers.cloudflare.com/workers/static-assets/redirects/) files used to configure
     * [Static Assets](https://developers.cloudflare.com/workers/static-assets/). `_headers` and `_redirects` files should be
     * included as modules named `_headers` and `_redirects` with content type `text/plain`.
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionModuleArgs.Builder]*):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)

    /**
     * @param packageDependencies The list of npm packages that were installed and used when this Worker
     * version was built.
     * @return builder
     */
    def packageDependencies(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionPackageDependencyArgs.Builder]*):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionPackageDependencyArgs.builder
      builder.packageDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement). Specify mode=&#39;smart&#39; for Smart Placement, or one of region/hostname/host.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkerVersionPlacementArgs.Builder]):
        com.pulumi.cloudflare.WorkerVersionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkerVersionPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.WorkersCronTriggerArgs.Builder)
    def schedules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersCronTriggerScheduleArgs.Builder]*):
        com.pulumi.cloudflare.WorkersCronTriggerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersCronTriggerScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkersDeploymentArgs.Builder)
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersDeploymentAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.WorkersDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersDeploymentAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param versions Worker versions included in this deployment. Each object must contain a `versionId` UUID and a `percentage`; percentages across all objects must total 100. In the `cf` CLI, pass the entire array as one JSON value to `--versions`, either inline, for example `--versions &#39;[{&#34;versionId&#34;:&#34;023e105f-2a42-4f8b-a1c1-73f6a2a30c0f&#34;,&#34;percentage&#34;:100}]&#39;`, or from a JSON file with `--versions {@literal @}versions.json`.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersDeploymentVersionArgs.Builder]*):
        com.pulumi.cloudflare.WorkersDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersDeploymentVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkersScriptArgs.Builder)
    /**
     * @param annotations Annotations for the version created by this upload.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptAnnotationsArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param assets Configuration for assets within a Worker.
     * @return builder
     */
    def assets(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptAssetsArgs.builder
      builder.assets(args(argsBuilder).build)

    /**
     * @param bindings List of bindings attached to a Worker. You can find more about bindings on our docs: https://developers.cloudflare.com/workers/configuration/multipart-upload-metadata/#bindings.
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.Builder]*):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

    /**
     * @param cacheOptions Global CacheW configuration for the Worker. When caching is on,
     * the platform provisions a `cloudflare.app` zone for the Worker.
     * A `type: worker` entry in the `exports` map can override this
     * value for a single entrypoint.
     * @return builder
     */
    def cacheOptions(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptCacheOptionsArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptCacheOptionsArgs.builder
      builder.cacheOptions(args(argsBuilder).build)

    /**
     * @param limits Limits to apply for this Worker.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptLimitsArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param migrations Migrations to apply for Durable Objects associated with this Worker.
     * @return builder
     */
    def migrations(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptMigrationsArgs.builder
      builder.migrations(args(argsBuilder).build)

    /**
     * @param observability Observability settings for the Worker.
     * @return builder
     */
    def observability(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptObservabilityArgs.builder
      builder.observability(args(argsBuilder).build)

    /**
     * @param packageDependencies The list of npm packages that were installed and used when this Worker was built.
     * @return builder
     */
    def packageDependencies(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptPackageDependencyArgs.Builder]*):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptPackageDependencyArgs.builder
      builder.packageDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param placement Configuration for [Smart Placement](https://developers.cloudflare.com/workers/configuration/smart-placement). Specify mode=&#39;smart&#39; for Smart Placement, or one of region/hostname/host.
     * @return builder
     */
    def placement(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs.Builder]):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs.builder
      builder.placement(args(argsBuilder).build)

    /**
     * @param tailConsumers List of Workers that will consume logs from the attached Worker.
     * @return builder
     */
    def tailConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.WorkersScriptTailConsumerArgs.Builder]*):
        com.pulumi.cloudflare.WorkersScriptArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkersScriptTailConsumerArgs.builder
      builder.tailConsumers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.WorkflowArgs.Builder)
    def concurrency(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowConcurrencyArgs.Builder]):
        com.pulumi.cloudflare.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkflowConcurrencyArgs.builder
      builder.concurrency(args(argsBuilder).build)

    /**
     * @param defaultRetention Default retention applied to instances of this version when they do not set their own retention.
     * @return builder
     */
    def defaultRetention(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowDefaultRetentionArgs.Builder]):
        com.pulumi.cloudflare.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkflowDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

    def limits(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowLimitsArgs.Builder]):
        com.pulumi.cloudflare.WorkflowArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.WorkflowLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    def schedules(args: Endofunction[com.pulumi.cloudflare.inputs.WorkflowScheduleArgs.Builder]*):
        com.pulumi.cloudflare.WorkflowArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.WorkflowScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortalArgs.Builder)
    /**
     * @param servers MCP servers attached to the portal and their portal-specific settings.
     * @return builder
     */
    def servers(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortalArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpPortalServerArgs.builder
      builder.servers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.Builder)
    /**
     * @param updatedPrompts Server-wide prompt capability overrides.
     * @return builder
     */
    def updatedPrompts(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedPromptArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedPromptArgs.builder
      builder.updatedPrompts(args.map(_(argsBuilder).build)*)

    /**
     * @param updatedTools Server-wide tool capability overrides.
     * @return builder
     */
    def updatedTools(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedToolArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessAiControlsMcpServerUpdatedToolArgs.builder
      builder.updatedTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder)
    def corsHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationCorsHeadersArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationCorsHeadersArgs.builder
      builder.corsHeaders(args(argsBuilder).build)

    /**
     * @param destinations List of destinations secured by Access. This supersedes `selfHostedDomains` to allow for more flexibility in defining different types of domains. If `destinations` are provided, then `selfHostedDomains` will be ignored.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationDestinationArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param footerLinks The links in the App Launcher footer.
     * @return builder
     */
    def footerLinks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationFooterLinkArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationFooterLinkArgs.builder
      builder.footerLinks(args.map(_(argsBuilder).build)*)

    /**
     * @param landingPageDesign The design of the App Launcher landing page shown to users when they log in.
     * @return builder
     */
    def landingPageDesign(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationLandingPageDesignArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationLandingPageDesignArgs.builder
      builder.landingPageDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for the application. Only valid for self*hosted, ssh, vnc, and rdp application types.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param oauthConfiguration Optional configuration for managing an OAuth authorization flow controlled by Access. When set, Access will act as the OAuth authorization server for this application. This feature is currently in beta.
     * @return builder
     */
    def oauthConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationOauthConfigurationArgs.builder
      builder.oauthConfiguration(args(argsBuilder).build)

    /**
     * @param policies The policies that Access applies to the application, in ascending order of precedence. Items can reference existing policies or create new policies exclusive to the application.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

    def saasApp(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationSaasAppArgs.builder
      builder.saasApp(args(argsBuilder).build)

    /**
     * @param scimConfig Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

    /**
     * @param targetCriterias Defines targets covered by the application. Use either the legacy top-level target*attributes format or the rule format, but not both. The rule format requires include; require and exclude are optional. Each rule must contain a non-empty target*attributes or tags selector. Hostname selectors accept 1-5000 non-empty strings. Tag maps accept 1-50 non-empty keys, each with 1-50 non-empty values.
     * @return builder
     */
    def targetCriterias(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessApplicationTargetCriteriaArgs.builder
      builder.targetCriterias(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.Builder)
    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.Builder)
    /**
     * @param config The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param scimConfig The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderScimConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessInfrastructureTargetArgs.Builder)
    /**
     * @param ip The IPv4/IPv6 address that identifies where to reach a target
     * @return builder
     */
    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessInfrastructureTargetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessInfrastructureTargetIpArgs.builder
      builder.ip(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessMtlsHostnameSettingsSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder)
    /**
     * @param approvalGroups Administrators who can approve a temporary authentication request.
     * @return builder
     */
    def approvalGroups(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyApprovalGroupArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyApprovalGroupArgs.builder
      builder.approvalGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionRules The rules that define how users may connect to targets secured by your application.
     * @return builder
     */
    def connectionRules(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyConnectionRulesArgs.builder
      builder.connectionRules(args(argsBuilder).build)

    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder)
    /**
     * @param anthropic Anthropic integration configuration.
     * @return builder
     */
    def anthropic(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAnthropicArgs.builder
      builder.anthropic(args(argsBuilder).build)

    /**
     * @param aws AWS integration configuration.
     * @return builder
     */
    def aws(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationAwsArgs.builder
      builder.aws(args(argsBuilder).build)

    /**
     * @param box Box integration configuration.
     * @return builder
     */
    def box(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationBoxArgs.builder
      builder.box(args(argsBuilder).build)

    /**
     * @param googleCloudPlatform Google Cloud Platform integration configuration.
     * @return builder
     */
    def googleCloudPlatform(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleCloudPlatformArgs.builder
      builder.googleCloudPlatform(args(argsBuilder).build)

    /**
     * @param googleWorkspace Google Workspace integration configuration.
     * @return builder
     */
    def googleWorkspace(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationGoogleWorkspaceArgs.builder
      builder.googleWorkspace(args(argsBuilder).build)

    /**
     * @param openai OpenAI integration configuration.
     * @return builder
     */
    def openai(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbIntegrationOpenaiArgs.builder
      builder.openai(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustCasbPolicyArgs.Builder)
    /**
     * @param actions Actions to execute when this policy is triggered, grouped by action type.
     * A policy must contain at least one action across all groups and may include
     * at most one remediation.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustCasbPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbPolicyActionsArgs.builder
      builder.actions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustCasbWebhookArgs.Builder)
    /**
     * @param headers List of custom headers to include in webhook requests.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustCasbWebhookHeaderArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustCasbWebhookArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustCasbWebhookHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder)
    /**
     * @param browserExtensionConfig Browser extension proxy settings. Required when profile*type is browser*extension and invalid for WARP profiles.
     * @return builder
     */
    def browserExtensionConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileBrowserExtensionConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileBrowserExtensionConfigArgs.builder
      builder.browserExtensionConfig(args(argsBuilder).build)

    /**
     * @param dnsSearchSuffixes List of DNS search suffixes to apply to clients. Suffixes are evaluated in order. Use an empty array to clear.
     * @return builder
     */
    def dnsSearchSuffixes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileDnsSearchSuffixArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileDnsSearchSuffixArgs.builder
      builder.dnsSearchSuffixes(args.map(_(argsBuilder).build)*)

    /**
     * @param excludes List of routes excluded in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileExcludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAcceleration Global Acceleration settings for China. When configured, WARP clients connect to the Global Accelerator addresses instead of the default ones. Please contact your account representative to enable this feature on your account. See https://developers.cloudflare.com/china-network/concepts/global-acceleration/.
     * @return builder
     */
    def globalAcceleration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileGlobalAccelerationArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileGlobalAccelerationArgs.builder
      builder.globalAcceleration(args(argsBuilder).build)

    /**
     * @param includes List of routes included in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileIncludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    def serviceModeV2(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileServiceModeV2Args.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileServiceModeV2Args.builder
      builder.serviceModeV2(args(argsBuilder).build)

    /**
     * @param virtualNetworks Virtual network access settings for the device.
     * @return builder
     */
    def virtualNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileVirtualNetworksArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileVirtualNetworksArgs.builder
      builder.virtualNetworks(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.Builder)
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileLocalDomainFallbackDomainArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceCustomProfileLocalDomainFallbackDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder)
    /**
     * @param dnsSearchSuffixes List of DNS search suffixes to apply to clients. Suffixes are evaluated in order. Use an empty array to clear.
     * @return builder
     */
    def dnsSearchSuffixes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileDnsSearchSuffixArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileDnsSearchSuffixArgs.builder
      builder.dnsSearchSuffixes(args.map(_(argsBuilder).build)*)

    /**
     * @param excludes List of routes excluded in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileExcludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param globalAcceleration Global Acceleration settings for China. When configured, WARP clients connect to the Global Accelerator addresses instead of the default ones. Please contact your account representative to enable this feature on your account. See https://developers.cloudflare.com/china-network/concepts/global-acceleration/.
     * @return builder
     */
    def globalAcceleration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileGlobalAccelerationArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileGlobalAccelerationArgs.builder
      builder.globalAcceleration(args(argsBuilder).build)

    /**
     * @param includes List of routes included in the WARP client&#39;s tunnel. Both &#39;exclude&#39; and &#39;include&#39; cannot be set in the same request.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileIncludeArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    def serviceModeV2(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileServiceModeV2Args.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileServiceModeV2Args.builder
      builder.serviceModeV2(args(argsBuilder).build)

    /**
     * @param virtualNetworks Virtual network access settings for the device.
     * @return builder
     */
    def virtualNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileVirtualNetworksArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileVirtualNetworksArgs.builder
      builder.virtualNetworks(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.Builder)
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileLocalDomainFallbackDomainArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDefaultProfileLocalDomainFallbackDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroupsArgs.Builder)
    /**
     * @param versionConfigs Contains at least one version configuration.
     * @return builder
     */
    def versionConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceDeploymentGroupsVersionConfigArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroupsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceDeploymentGroupsVersionConfigArgs.builder
      builder.versionConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworksArgs.Builder)
    /**
     * @param config The configuration object containing information for the WARP client to detect the managed network.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworksArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDevicePostureIntegrationArgs.Builder)
    /**
     * @param config The configuration object containing third-party integration information.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDevicePostureIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.Builder)
    /**
     * @param input The value to be checked against.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param matches The conditions that the client must match to run the rule.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleMatchArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDexTestArgs.Builder)
    /**
     * @param data The configuration object which contains the details for the WARP client to conduct the test.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDexTestDataArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDexTestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDexTestDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param targetPolicies DEX rules targeted by this test
     * @return builder
     */
    def targetPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDexTestTargetPolicyArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDexTestArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDexTestTargetPolicyArgs.builder
      builder.targetPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDlpCustomEntryArgs.Builder)
    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDlpCustomEntryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder)
    /**
     * @param contextAwareness Scan the context of predefined entries to only return matches surrounded by keywords.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def contextAwareness(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileContextAwarenessArgs.builder
      builder.contextAwareness(args(argsBuilder).build)

    /**
     * @param entries Custom entries from this profile.
     * If this field is omitted, entries owned by this profile will not be changed.
     * @return builder
     * @deprecated This attribute will be sunset on 01/01/2026
     */
    @deprecated("This attribute will be sunset on 01/01/2026") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

    /**
     * @param sensitivityLevels Sensitivity levels to associate with the profile.
     * @return builder
     */
    def sensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSensitivityLevelArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSensitivityLevelArgs.builder
      builder.sensitivityLevels(args.map(_(argsBuilder).build)*)

    /**
     * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * @return builder
     */
    def sharedEntries(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSharedEntryArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpCustomProfileSharedEntryArgs.builder
      builder.sharedEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDlpDataClassArgs.Builder)
    def sensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpDataClassSensitivityLevelArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDlpDataClassArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpDataClassSensitivityLevelArgs.builder
      builder.sensitivityLevels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDlpEntryArgs.Builder)
    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDlpEntryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfileArgs.Builder)
    /**
     * @return builder
     * @deprecated This attribute is deprecated. Use enabledEntries instead.
     */
    @deprecated("This attribute is deprecated. Use enabledEntries instead.") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfileArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpPredefinedProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDlpSettingsArgs.Builder)
    /**
     * @param payloadLogging Request model for payload log settings within the DLP settings endpoint.
     * Unlike the legacy endpoint, null and missing are treated identically here
     * (both mean &#34;not provided&#34; for PATCH, &#34;reset to default&#34; for PUT).
     * @return builder
     */
    def payloadLogging(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDlpSettingsPayloadLoggingArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDlpSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDlpSettingsPayloadLoggingArgs.builder
      builder.payloadLogging(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.Builder)
    /**
     * @param endpoints Configure the destination endpoints for this location.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationEndpointsArgs.builder
      builder.endpoints(args(argsBuilder).build)

    /**
     * @param maxTtl Controls how DNS response TTLs are capped for this location relative to the account `maxTtlSecs` setting. Omitting `maxTtl` on update resets it to `inherit`.
     * @return builder
     */
    def maxTtl(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationMaxTtlArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationMaxTtlArgs.builder
      builder.maxTtl(args(argsBuilder).build)

    /**
     * @param networks Specify the list of network ranges from which requests at this location originate. The list takes effect only if it is non-empty and the IPv4 endpoint is enabled for this location.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustGatewayLoggingArgs.Builder)
    /**
     * @param settingsByRuleType Configure logging settings for each rule type.
     * @return builder
     */
    def settingsByRuleType(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustGatewayLoggingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayLoggingSettingsByRuleTypeArgs.builder
      builder.settingsByRuleType(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.Builder)
    /**
     * @param expiration Defines the expiration time stamp and default duration of a DNS policy. Takes precedence over the policy&#39;s `schedule` configuration, if any. This  does not apply to HTTP or network policies. Settable only for `dns` rules.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyExpirationArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param ruleSettings Defines settings for this rule. Settings apply only to specific rule types and must use compatible selectors. If Terraform detects drift, confirm the setting supports your rule type and check whether the API modifies the value. Use API-returned values in your configuration to prevent drift.
     * @return builder
     */
    def ruleSettings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs.builder
      builder.ruleSettings(args(argsBuilder).build)

    /**
     * @param schedule Defines the schedule for activating DNS policies. Settable only for `dns` and `dnsResolver` rules.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyScheduleArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustGatewaySettingsArgs.Builder)
    /**
     * @param settings Specify account settings.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustGatewaySettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustListArgs.Builder)
    /**
     * @param items Add items to the list.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustListItemArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustListArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustListItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs.Builder)
    def domains(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainDomainArgs.Builder]*):
        com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustLocalFallbackDomainDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder)
    def customPages(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationCustomPagesArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationCustomPagesArgs.builder
      builder.customPages(args(argsBuilder).build)

    def loginDesign(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationLoginDesignArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationLoginDesignArgs.builder
      builder.loginDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for an organization.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param mfaPivKeyRequirements Configures PIV key requirements for MFA using hardware security keys.
     * @return builder
     */
    def mfaPivKeyRequirements(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaPivKeyRequirementsArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationMfaPivKeyRequirementsArgs.builder
      builder.mfaPivKeyRequirements(args(argsBuilder).build)

    /**
     * @param serviceTokenInactivity Configures automatic enforcement for inactive service tokens. A service token is inactive if no policy references it, and it has not successfully authenticated with an Access application during the selected inactivity period. This setting applies to every service token in your Zero Trust account.
     * @return builder
     */
    def serviceTokenInactivity(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustOrganizationServiceTokenInactivityArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustOrganizationServiceTokenInactivityArgs.builder
      builder.serviceTokenInactivity(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfigArgs.Builder)
    /**
     * @param config The tunnel configuration and ingress rules.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfigArgs.Builder)
    /**
     * @param config Provider-specific configuration. Required shape depends on ha_mode. For `aws`, must contain `fnrId`. For `local`, must contain `vips`. For `none` and `disabled`, must be empty or omitted.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.Builder]):
        com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZeroTrustTunnelWarpConnectorConfigConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZoneArgs.Builder)
    def account(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneAccountArgs.Builder]):
        com.pulumi.cloudflare.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneAccountArgs.builder
      builder.account(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZoneCacheVariantsArgs.Builder)
    /**
     * @param value Value of the zone setting.
     * @return builder
     */
    def value(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneCacheVariantsValueArgs.Builder]):
        com.pulumi.cloudflare.ZoneCacheVariantsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneCacheVariantsValueArgs.builder
      builder.value(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZoneDnsSettingsArgs.Builder)
    /**
     * @param internalDns Settings for this internal zone.
     * @return builder
     */
    def internalDns(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneDnsSettingsInternalDnsArgs.Builder]):
        com.pulumi.cloudflare.ZoneDnsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneDnsSettingsInternalDnsArgs.builder
      builder.internalDns(args(argsBuilder).build)

    /**
     * @param nameservers Controls the nameservers through which the zone is available.
     * @return builder
     */
    def nameservers(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneDnsSettingsNameserversArgs.Builder]):
        com.pulumi.cloudflare.ZoneDnsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneDnsSettingsNameserversArgs.builder
      builder.nameservers(args(argsBuilder).build)

    /**
     * @param soa Components of the zone&#39;s SOA record.
     * @return builder
     */
    def soa(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneDnsSettingsSoaArgs.Builder]):
        com.pulumi.cloudflare.ZoneDnsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneDnsSettingsSoaArgs.builder
      builder.soa(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZoneLockdownArgs.Builder)
    /**
     * @param configurations A list of IP addresses or CIDR ranges that will be allowed to access the URLs specified in the Zone Lockdown rule. You can include any number of `ip` or `ipRange` configurations.
     * @return builder
     */
    def configurations(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneLockdownConfigurationArgs.Builder]*):
        com.pulumi.cloudflare.ZoneLockdownArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZoneLockdownConfigurationArgs.builder
      builder.configurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.ZoneSubscriptionArgs.Builder)
    /**
     * @param ratePlan The rate plan applied to the subscription.
     * @return builder
     */
    def ratePlan(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneSubscriptionRatePlanArgs.Builder]):
        com.pulumi.cloudflare.ZoneSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ZoneSubscriptionRatePlanArgs.builder
      builder.ratePlan(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.ZoneTracingRulesArgs.Builder)
    /**
     * @param rules Trace rules in evaluation order.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.ZoneTracingRulesArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ZoneTracingRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.Builder)
    /**
     * @param dynamicClientRegistration Settings for OAuth dynamic client registration.
     * @return builder
     */
    def dynamicClientRegistration(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationDynamicClientRegistrationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationDynamicClientRegistrationArgs.builder
      builder.dynamicClientRegistration(args(argsBuilder).build)

    /**
     * @param grant Settings for OAuth grant behavior.
     * @return builder
     */
    def grant(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationGrantArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationGrantArgs.builder
      builder.grant(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder)
    /**
     * @param connectionRules The rules that define how users may connect to the targets secured by your application.
     * @return builder
     */
    def connectionRules(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesArgs.builder
      builder.connectionRules(args(argsBuilder).build)

    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for this policy. For infrastructure applications only `sshPivKey` is a supported authenticator; for other application types use `totp`, `biometrics`, or `securityKey`.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesArgs.Builder)
    /**
     * @param rdp The RDP-specific rules that define clipboard behavior for RDP connections.
     * @return builder
     */
    def rdp(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesRdpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesRdpArgs.builder
      builder.rdp(args(argsBuilder).build)

    /**
     * @param ssh The SSH-specific rules that define how users may connect to the targets secured by your application.
     * @return builder
     */
    def ssh(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesSshArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyConnectionRulesSshArgs.builder
      builder.ssh(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyExcludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyIncludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyRequireServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder)
    def customAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeArgs.builder
      builder.customAttributes(args.map(_(argsBuilder).build)*)

    def customClaims(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimArgs.builder
      builder.customClaims(args.map(_(argsBuilder).build)*)

    def hybridAndImplicitOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppHybridAndImplicitOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppHybridAndImplicitOptionsArgs.builder
      builder.hybridAndImplicitOptions(args(argsBuilder).build)

    def refreshTokenOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppRefreshTokenOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppRefreshTokenOptionsArgs.builder
      builder.refreshTokenOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeArgs.Builder)
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeSourceArgs.Builder)
    /**
     * @param nameByIdps A mapping from IdP ID to attribute name.
     * @return builder
     */
    def nameByIdps(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeSourceArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeSourceNameByIdpArgs.builder
      builder.nameByIdps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimArgs.Builder)
    def source(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimSourceArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomClaimSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.Builder)
    /**
     * @param authentication Attributes for configuring HTTP Basic authentication scheme for SCIM provisioning to an application.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationScimConfigAuthenticationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationScimConfigAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param mappings A list of mappings to apply to SCIM resources before provisioning them in this application. These can transform or filter the resources to be provisioned.
     * @return builder
     */
    def mappings(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationScimConfigMappingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationScimConfigMappingArgs.builder
      builder.mappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationScimConfigMappingArgs.Builder)
    /**
     * @param operations Whether or not this mapping applies to creates, updates, or deletes.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationScimConfigMappingOperationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationScimConfigMappingArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationScimConfigMappingOperationsArgs.builder
      builder.operations(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationState.Builder)
    def corsHeaders(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationCorsHeadersArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationCorsHeadersArgs.builder
      builder.corsHeaders(args(argsBuilder).build)

    /**
     * @param destinations List of destinations secured by Access. This supersedes `selfHostedDomains` to allow for more flexibility in defining different types of domains. If `destinations` are provided, then `selfHostedDomains` will be ignored.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationDestinationArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param footerLinks The links in the App Launcher footer.
     * @return builder
     */
    def footerLinks(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationFooterLinkArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationFooterLinkArgs.builder
      builder.footerLinks(args.map(_(argsBuilder).build)*)

    /**
     * @param landingPageDesign The design of the App Launcher landing page shown to users when they log in.
     * @return builder
     */
    def landingPageDesign(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationLandingPageDesignArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationLandingPageDesignArgs.builder
      builder.landingPageDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for the application. Only valid for self*hosted, ssh, vnc, and rdp application types.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param oauthConfiguration Optional configuration for managing an OAuth authorization flow controlled by Access. When set, Access will act as the OAuth authorization server for this application. This feature is currently in beta.
     * @return builder
     */
    def oauthConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationOauthConfigurationArgs.builder
      builder.oauthConfiguration(args(argsBuilder).build)

    /**
     * @param policies The policies that Access applies to the application, in ascending order of precedence. Items can reference existing policies or create new policies exclusive to the application.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

    def saasApp(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs.builder
      builder.saasApp(args(argsBuilder).build)

    /**
     * @param scimConfig Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

    /**
     * @param targetCriterias Defines targets covered by the application. Use either the legacy top-level target*attributes format or the rule format, but not both. The rule format requires include; require and exclude are optional. Each rule must contain a non-empty target*attributes or tags selector. Hostname selectors accept 1-5000 non-empty strings. Tag maps accept 1-50 non-empty keys, each with 1-50 non-empty values.
     * @return builder
     */
    def targetCriterias(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessApplicationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.builder
      builder.targetCriterias(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.Builder)
    /**
     * @param exclude Target is excluded when any selector in this rule matches.
     * @return builder
     */
    def exclude(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaExcludeArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaExcludeArgs.builder
      builder.exclude(args(argsBuilder).build)

    /**
     * @param include Target matches when any selector in this rule matches.
     * @return builder
     */
    def include(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaIncludeArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaIncludeArgs.builder
      builder.include(args(argsBuilder).build)

    /**
     * @param require Target matches only when every selector in this rule matches.
     * @return builder
     */
    def require(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaRequireArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaRequireArgs.builder
      builder.require(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaExcludeArgs.Builder)
    /**
     * @param targetAttributes Hostname selector map. Only the hostname key is supported.
     * @return builder
     */
    def targetAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaExcludeTargetAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaExcludeTargetAttributesArgs.builder
      builder.targetAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaIncludeArgs.Builder)
    /**
     * @param targetAttributes Hostname selector map. Only the hostname key is supported.
     * @return builder
     */
    def targetAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaIncludeTargetAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaIncludeTargetAttributesArgs.builder
      builder.targetAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaRequireArgs.Builder)
    /**
     * @param targetAttributes Hostname selector map. Only the hostname key is supported.
     * @return builder
     */
    def targetAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaRequireTargetAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessApplicationTargetCriteriaRequireTargetAttributesArgs.builder
      builder.targetAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessCustomPageState.Builder)
    /**
     * @param warnings Advisory validation findings returned when creating or updating a template. Omitted when empty.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.cloudflare.inputs.AccessCustomPageWarningArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessCustomPageState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessCustomPageWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessGroupState.Builder)
    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessGroupRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs.Builder)
    /**
     * @param headerAttributes Add a list of attribute names that will be returned in the response header from the Access callback.
     * @return builder
     */
    def headerAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigHeaderAttributeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigHeaderAttributeArgs.builder
      builder.headerAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessIdentityProviderSamlCertificateSetArgs.Builder)
    /**
     * @param currentCertificate The currently active certificate used for encrypting SAML assertions
     * @return builder
     */
    def currentCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderSamlCertificateSetCurrentCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessIdentityProviderSamlCertificateSetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderSamlCertificateSetCurrentCertificateArgs.builder
      builder.currentCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessIdentityProviderState.Builder)
    /**
     * @param config The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessIdentityProviderState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param samlCertificateSet The SAML encryption certificate set details, including current and previous certificates.
     * Only present for SAML identity providers with a certificate set assigned.
     * @return builder
     */
    def samlCertificateSet(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderSamlCertificateSetArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessIdentityProviderState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderSamlCertificateSetArgs.builder
      builder.samlCertificateSet(args(argsBuilder).build)

    /**
     * @param scimConfig The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.
     * @return builder
     */
    def scimConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessIdentityProviderScimConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessIdentityProviderState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessIdentityProviderScimConfigArgs.builder
      builder.scimConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessMutualTlsHostnameSettingsState.Builder)
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.AccessMutualTlsHostnameSettingsSettingArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessMutualTlsHostnameSettingsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessMutualTlsHostnameSettingsSettingArgs.builder
      builder.settings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessOrganizationState.Builder)
    def customPages(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationCustomPagesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationCustomPagesArgs.builder
      builder.customPages(args(argsBuilder).build)

    def loginDesign(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs.builder
      builder.loginDesign(args(argsBuilder).build)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings for an organization.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param mfaPivKeyRequirements Configures PIV key requirements for MFA using hardware security keys.
     * @return builder
     */
    def mfaPivKeyRequirements(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationMfaPivKeyRequirementsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationMfaPivKeyRequirementsArgs.builder
      builder.mfaPivKeyRequirements(args(argsBuilder).build)

    /**
     * @param serviceTokenInactivity Configures automatic enforcement for inactive service tokens. A service token is inactive if no policy references it, and it has not successfully authenticated with an Access application during the selected inactivity period. This setting applies to every service token in your Zero Trust account.
     * @return builder
     */
    def serviceTokenInactivity(args: Endofunction[com.pulumi.cloudflare.inputs.AccessOrganizationServiceTokenInactivityArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessOrganizationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessOrganizationServiceTokenInactivityArgs.builder
      builder.serviceTokenInactivity(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesArgs.Builder)
    /**
     * @param rdp The RDP-specific rules that define clipboard behavior for RDP connections.
     * @return builder
     */
    def rdp(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesRdpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesRdpArgs.builder
      builder.rdp(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder)
    /**
     * @param anyValidServiceToken An empty object which matches on all service tokens.
     * @return builder
     */
    def anyValidServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireAnyValidServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireAnyValidServiceTokenArgs.builder
      builder.anyValidServiceToken(args(argsBuilder).build)

    def authContext(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthContextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthContextArgs.builder
      builder.authContext(args(argsBuilder).build)

    def authMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthMethodArgs.builder
      builder.authMethod(args(argsBuilder).build)

    def azureAd(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireAzureAdArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireAzureAdArgs.builder
      builder.azureAd(args(argsBuilder).build)

    def certificate(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireCertificateArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    def cloudflareAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireCloudflareAccountMemberArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireCloudflareAccountMemberArgs.builder
      builder.cloudflareAccountMember(args(argsBuilder).build)

    def commonName(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireCommonNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

    def devicePosture(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireDevicePostureArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireDevicePostureArgs.builder
      builder.devicePosture(args(argsBuilder).build)

    def email(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailArgs.builder
      builder.email(args(argsBuilder).build)

    def emailDomain(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailDomainArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailDomainArgs.builder
      builder.emailDomain(args(argsBuilder).build)

    def emailList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireEmailListArgs.builder
      builder.emailList(args(argsBuilder).build)

    /**
     * @param everyone An empty object which matches on all users.
     * @return builder
     */
    def everyone(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireEveryoneArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireEveryoneArgs.builder
      builder.everyone(args(argsBuilder).build)

    def externalEvaluation(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireExternalEvaluationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireExternalEvaluationArgs.builder
      builder.externalEvaluation(args(argsBuilder).build)

    def geo(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireGeoArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireGeoArgs.builder
      builder.geo(args(argsBuilder).build)

    def githubOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireGithubOrganizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireGithubOrganizationArgs.builder
      builder.githubOrganization(args(argsBuilder).build)

    def group(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireGroupArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireGroupArgs.builder
      builder.group(args(argsBuilder).build)

    def gsuite(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireGsuiteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireGsuiteArgs.builder
      builder.gsuite(args(argsBuilder).build)

    def ip(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireIpArgs.builder
      builder.ip(args(argsBuilder).build)

    def ipList(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireIpListArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireIpListArgs.builder
      builder.ipList(args(argsBuilder).build)

    def linkedAppToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireLinkedAppTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireLinkedAppTokenArgs.builder
      builder.linkedAppToken(args(argsBuilder).build)

    def loginMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireLoginMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireLoginMethodArgs.builder
      builder.loginMethod(args(argsBuilder).build)

    def oidc(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireOidcArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

    def okta(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireOktaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireOktaArgs.builder
      builder.okta(args(argsBuilder).build)

    def saml(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireSamlArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireSamlArgs.builder
      builder.saml(args(argsBuilder).build)

    def serviceToken(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireServiceTokenArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireServiceTokenArgs.builder
      builder.serviceToken(args(argsBuilder).build)

    def userRiskScore(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireUserRiskScoreArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireUserRiskScoreArgs.builder
      builder.userRiskScore(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccessPolicyState.Builder)
    /**
     * @param approvalGroups Administrators who can approve a temporary authentication request.
     * @return builder
     */
    def approvalGroups(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyApprovalGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyApprovalGroupArgs.builder
      builder.approvalGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionRules The rules that define how users may connect to targets secured by your application.
     * @return builder
     */
    def connectionRules(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyConnectionRulesArgs.builder
      builder.connectionRules(args(argsBuilder).build)

    /**
     * @param excludes Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs.builder
      builder.excludes(args.map(_(argsBuilder).build)*)

    /**
     * @param includes Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs.builder
      builder.includes(args.map(_(argsBuilder).build)*)

    /**
     * @param mfaConfig Configures multi-factor authentication (MFA) settings.
     * @return builder
     */
    def mfaConfig(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyMfaConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessPolicyState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyMfaConfigArgs.builder
      builder.mfaConfig(args(argsBuilder).build)

    /**
     * @param requires Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
     * @return builder
     */
    def requires(args: Endofunction[com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccessPolicyState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs.builder
      builder.requires(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccessRuleState.Builder)
    /**
     * @param configuration The rule configuration.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param scope All zones owned by the user will have the rule applied.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.cloudflare.inputs.AccessRuleScopeArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccessRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccessRuleScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountDnsSettingsState.Builder)
    /**
     * @param zoneDefaults Default settings for new zones created in this account.
     * @return builder
     */
    def zoneDefaults(args: Endofunction[com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountDnsSettingsState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.builder
      builder.zoneDefaults(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.Builder)
    /**
     * @param internalDns Settings for this internal zone.
     * @return builder
     */
    def internalDns(args: Endofunction[com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsInternalDnsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsInternalDnsArgs.builder
      builder.internalDns(args(argsBuilder).build)

    /**
     * @param nameservers Settings determining the nameservers through which the zone should be available.
     * @return builder
     */
    def nameservers(args: Endofunction[com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsNameserversArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsNameserversArgs.builder
      builder.nameservers(args(argsBuilder).build)

    /**
     * @param soa Components of the zone&#39;s SOA record.
     * @return builder
     */
    def soa(args: Endofunction[com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsSoaArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountDnsSettingsZoneDefaultsSoaArgs.builder
      builder.soa(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.Builder)
    /**
     * @param permissionGroups A set of permission groups that are specified to the policy.
     * @return builder
     */
    def permissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.AccountMemberPolicyPermissionGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountMemberPolicyPermissionGroupArgs.builder
      builder.permissionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceGroups A list of resource groups that the policy applies to.
     * @return builder
     */
    def resourceGroups(args: Endofunction[com.pulumi.cloudflare.inputs.AccountMemberPolicyResourceGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountMemberPolicyResourceGroupArgs.builder
      builder.resourceGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccountMemberState.Builder)
    /**
     * @param policies Array of policies associated with this member.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccountMemberState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountMemberPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

    /**
     * @param user Details of the user associated to the membership.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.cloudflare.inputs.AccountMemberUserArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountMemberState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountMemberUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountState.Builder)
    /**
     * @param managedBy Parent container details
     * @return builder
     */
    def managedBy(args: Endofunction[com.pulumi.cloudflare.inputs.AccountManagedByArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountManagedByArgs.builder
      builder.managedBy(args(argsBuilder).build)

    /**
     * @param settings Account settings
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.AccountSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

    /**
     * @param unit Information related to the tenant unit. Provide its ID and omit `standalone` to create the Account within an Organization. See https://developers.cloudflare.com/tenant/how-to/manage-accounts/.
     * @return builder
     */
    def unit(args: Endofunction[com.pulumi.cloudflare.inputs.AccountUnitArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountUnitArgs.builder
      builder.unit(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountSubscriptionState.Builder)
    /**
     * @param ratePlan The rate plan applied to the subscription.
     * @return builder
     */
    def ratePlan(args: Endofunction[com.pulumi.cloudflare.inputs.AccountSubscriptionRatePlanArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountSubscriptionState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountSubscriptionRatePlanArgs.builder
      builder.ratePlan(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountTokenConditionArgs.Builder)
    /**
     * @param requestIp Client IP restrictions.
     * @return builder
     */
    def requestIp(args: Endofunction[com.pulumi.cloudflare.inputs.AccountTokenConditionRequestIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountTokenConditionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountTokenConditionRequestIpArgs.builder
      builder.requestIp(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AccountTokenPolicyArgs.Builder)
    /**
     * @param permissionGroups A set of permission groups that are specified to the policy.
     * @return builder
     */
    def permissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.AccountTokenPolicyPermissionGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccountTokenPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountTokenPolicyPermissionGroupArgs.builder
      builder.permissionGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AccountTokenState.Builder)
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.AccountTokenConditionArgs.Builder]):
        com.pulumi.cloudflare.inputs.AccountTokenState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AccountTokenConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param policies List of access policies assigned to the token.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AccountTokenPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AccountTokenState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AccountTokenPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AddressMapState.Builder)
    /**
     * @param memberships Zones and Accounts which will be assigned IPs on this Address Map. A zone membership will take priority over an account membership.
     * @return builder
     */
    def memberships(args: Endofunction[com.pulumi.cloudflare.inputs.AddressMapMembershipArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AddressMapState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AddressMapMembershipArgs.builder
      builder.memberships(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDlpArgs.Builder)
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDlpPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiGatewayDlpArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDlpPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.Builder)
    def outputs(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.builder
      builder.outputs(args(argsBuilder).build)

    def properties(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementPropertiesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder)
    def fallback(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsFallbackArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsFallbackArgs.builder
      builder.fallback(args(argsBuilder).build)

    def false_(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsFalseArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsFalseArgs.builder
      builder.false_(args(argsBuilder).build)

    def next(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsNextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsNextArgs.builder
      builder.next(args(argsBuilder).build)

    def success(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsSuccessArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsSuccessArgs.builder
      builder.success(args(argsBuilder).build)

    def true_(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsTrueArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementOutputsTrueArgs.builder
      builder.true_(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteArgs.Builder)
    def deployment(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteDeploymentArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteDeploymentArgs.builder
      builder.deployment(args(argsBuilder).build)

    def elements(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

    def version(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteVersionArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteVersionArgs.builder
      builder.version(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementArgs.Builder)
    def outputs(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.builder
      builder.outputs(args(argsBuilder).build)

    def properties(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementPropertiesArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder)
    def fallback(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsFallbackArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsFallbackArgs.builder
      builder.fallback(args(argsBuilder).build)

    def false_(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsFalseArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsFalseArgs.builder
      builder.false_(args(argsBuilder).build)

    def next(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsNextArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsNextArgs.builder
      builder.next(args(argsBuilder).build)

    def success(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsSuccessArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsSuccessArgs.builder
      builder.success(args(argsBuilder).build)

    def true_(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsTrueArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteElementOutputsTrueArgs.builder
      builder.true_(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingState.Builder)
    def deployment(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingDeploymentArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingDeploymentArgs.builder
      builder.deployment(args(argsBuilder).build)

    def elements(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingElementArgs.builder
      builder.elements(args.map(_(argsBuilder).build)*)

    def route(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingRouteArgs.builder
      builder.route(args(argsBuilder).build)

    def version(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingVersionArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDynamicRoutingVersionArgs.builder
      builder.version(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.Builder)
    def prompt(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayGuardrailsPromptArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayGuardrailsPromptArgs.builder
      builder.prompt(args(argsBuilder).build)

    def response(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayGuardrailsResponseArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayGuardrailsResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsArgs.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleArgs.Builder)
    def aiGatewayProvider(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleAiGatewayProviderArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleAiGatewayProviderArgs.builder
      builder.aiGatewayProvider(args(argsBuilder).build)

    def model(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleModelArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsRuleModelArgs.builder
      builder.model(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayState.Builder)
    def dlp(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayDlpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayDlpArgs.builder
      builder.dlp(args(argsBuilder).build)

    def guardrails(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayGuardrailsArgs.builder
      builder.guardrails(args(argsBuilder).build)

    def otels(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayOtelArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiGatewayState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayOtelArgs.builder
      builder.otels(args.map(_(argsBuilder).build)*)

    def spendLimits(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewaySpendLimitsArgs.builder
      builder.spendLimits(args(argsBuilder).build)

    def stripe(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayStripeArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiGatewayState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayStripeArgs.builder
      builder.stripe(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiGatewayStripeArgs.Builder)
    def usageEvents(args: Endofunction[com.pulumi.cloudflare.inputs.AiGatewayStripeUsageEventArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiGatewayStripeArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiGatewayStripeUsageEventArgs.builder
      builder.usageEvents(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataArgs.Builder)
    def createdFromEmdashPlugin(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataCreatedFromEmdashPluginArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataCreatedFromEmdashPluginArgs.builder
      builder.createdFromEmdashPlugin(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder)
    def chatCompletionsEndpoint(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsChatCompletionsEndpointArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsChatCompletionsEndpointArgs.builder
      builder.chatCompletionsEndpoint(args(argsBuilder).build)

    def mcp(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsMcpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

    def rateLimit(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsRateLimitArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsRateLimitArgs.builder
      builder.rateLimit(args(argsBuilder).build)

    def searchEndpoint(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsSearchEndpointArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsSearchEndpointArgs.builder
      builder.searchEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsArgs.Builder)
    /**
     * @param boostBies Metadata fields to boost search results by. Each entry specifies a metadata field and an optional direction. Direction defaults to &#39;asc&#39; for numeric/datetime fields and &#39;exists&#39; for text/boolean fields. Fields must match &#39;timestamp&#39; or a defined custom*metadata field.
     * @return builder
     */
    def boostBies(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsBoostByArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsBoostByArgs.builder
      builder.boostBies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsArgs.Builder)
    def webCrawler(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerArgs.builder
      builder.webCrawler(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerArgs.Builder)
    /**
     * @param discoverOptions Options for parse*type &#39;discover&#39;, where Browser Run discovers URLs by link following and sitemaps. Ignored for &#39;sitemap&#39;.
     * @return builder
     */
    def discoverOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerDiscoverOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerDiscoverOptionsArgs.builder
      builder.discoverOptions(args(argsBuilder).build)

    def parseOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerParseOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerParseOptionsArgs.builder
      builder.parseOptions(args(argsBuilder).build)

    def storeOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerStoreOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerStoreOptionsArgs.builder
      builder.storeOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerParseOptionsArgs.Builder)
    /**
     * @param contentSelectors List of path-to-selector mappings for extracting specific content from crawled pages. Each entry pairs a URL glob pattern with a CSS selector. The first matching path wins. Only the matched HTML fragment is stored and indexed. Omit the field to disable content selection \u2014 empty arrays are rejected.
     * @return builder
     */
    def contentSelectors(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerParseOptionsContentSelectorArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerParseOptionsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsWebCrawlerParseOptionsContentSelectorArgs.builder
      builder.contentSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder)
    def customMetadatas(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceCustomMetadataArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceCustomMetadataArgs.builder
      builder.customMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param indexMethod Controls which storage backends are used during indexing. Defaults to vector and keyword indexing for new instances.
     * @return builder
     */
    def indexMethod(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceIndexMethodArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceIndexMethodArgs.builder
      builder.indexMethod(args(argsBuilder).build)

    def indexingOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceIndexingOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceIndexingOptionsArgs.builder
      builder.indexingOptions(args(argsBuilder).build)

    def metadata(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    def publicEndpointParams(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstancePublicEndpointParamsArgs.builder
      builder.publicEndpointParams(args(argsBuilder).build)

    def retrievalOptions(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceRetrievalOptionsArgs.builder
      builder.retrievalOptions(args(argsBuilder).build)

    def sourceParams(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchInstanceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchInstanceSourceParamsArgs.builder
      builder.sourceParams(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder)
    def chatCompletionsEndpoint(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsChatCompletionsEndpointArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsChatCompletionsEndpointArgs.builder
      builder.chatCompletionsEndpoint(args(argsBuilder).build)

    def mcp(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsMcpArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsMcpArgs.builder
      builder.mcp(args(argsBuilder).build)

    def rateLimit(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsRateLimitArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsRateLimitArgs.builder
      builder.rateLimit(args(argsBuilder).build)

    def searchEndpoint(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsSearchEndpointArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsSearchEndpointArgs.builder
      builder.searchEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.AiSearchNamespaceState.Builder)
    def publicEndpointParams(args: Endofunction[com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.Builder]):
        com.pulumi.cloudflare.inputs.AiSearchNamespaceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.AiSearchNamespacePublicEndpointParamsArgs.builder
      builder.publicEndpointParams(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder)
    /**
     * @param apiRouting API Routing settings on endpoint.
     * @return builder
     */
    def apiRouting(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesApiRoutingArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesApiRoutingArgs.builder
      builder.apiRouting(args(argsBuilder).build)

    def confidenceIntervals(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsArgs.builder
      builder.confidenceIntervals(args(argsBuilder).build)

    def parameterSchemas(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasArgs.builder
      builder.parameterSchemas(args(argsBuilder).build)

    def schemaInfo(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesSchemaInfoArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesSchemaInfoArgs.builder
      builder.schemaInfo(args(argsBuilder).build)

    def thresholds(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesThresholdsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesThresholdsArgs.builder
      builder.thresholds(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsArgs.Builder)
    def suggestedThreshold(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs.builder
      builder.suggestedThreshold(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs.Builder)
    def confidenceIntervals(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs.builder
      builder.confidenceIntervals(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs.Builder)
    /**
     * @param p90 Upper and lower bound for percentile estimate
     * @return builder
     */
    def p90(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP90Args.builder
      builder.p90(args(argsBuilder).build)

    /**
     * @param p95 Upper and lower bound for percentile estimate
     * @return builder
     */
    def p95(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP95Args.builder
      builder.p95(args(argsBuilder).build)

    /**
     * @param p99 Upper and lower bound for percentile estimate
     * @return builder
     */
    def p99(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesConfidenceIntervalsSuggestedThresholdConfidenceIntervalsP99Args.builder
      builder.p99(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasArgs.Builder)
    /**
     * @param parameterSchemas An operation schema object containing a response.
     * @return builder
     */
    def parameterSchemas(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesParameterSchemasParameterSchemasArgs.builder
      builder.parameterSchemas(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesSchemaInfoArgs.Builder)
    /**
     * @param activeSchema Schema active on endpoint.
     * @return builder
     */
    def activeSchema(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesSchemaInfoActiveSchemaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesSchemaInfoArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesSchemaInfoActiveSchemaArgs.builder
      builder.activeSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasArgs.Builder)
    /**
     * @param learned An OpenAPI operation object fragment containing schema information for an operation. May include parameter definitions, request body specifications, and a component schema extension.
     * @return builder
     */
    def learned(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasLearnedArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasLearnedArgs.builder
      builder.learned(args(argsBuilder).build)

    /**
     * @param uploaded An OpenAPI operation object fragment containing schema information for an operation. May include parameter definitions, request body specifications, and a component schema extension.
     * @return builder
     */
    def uploaded(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasUploadedArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasUploadedArgs.builder
      builder.uploaded(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldOperationState.Builder)
    def features(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationFeaturesArgs.builder
      builder.features(args(argsBuilder).build)

    /**
     * @param schemas OpenAPI JSON schemas for an operation, including both user-uploaded and Cloudflare-learned schemas.
     * @return builder
     */
    def schemas(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldOperationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldOperationSchemasArgs.builder
      builder.schemas(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldSchemaState.Builder)
    def schema(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldSchemaSchemaArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldSchemaState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldSchemaSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    def uploadDetails(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldSchemaUploadDetailsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiShieldSchemaState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldSchemaUploadDetailsArgs.builder
      builder.uploadDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldSchemaUploadDetailsArgs.Builder)
    /**
     * @param warnings Diagnostic warning events that occurred during processing. These events are non-critical errors found within the schema.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldSchemaUploadDetailsWarningArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ApiShieldSchemaUploadDetailsArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldSchemaUploadDetailsWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ApiShieldState.Builder)
    def authIdCharacteristics(args: Endofunction[com.pulumi.cloudflare.inputs.ApiShieldAuthIdCharacteristicArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ApiShieldState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ApiShieldAuthIdCharacteristicArgs.builder
      builder.authIdCharacteristics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ApiTokenConditionArgs.Builder)
    /**
     * @param requestIp Client IP restrictions.
     * @return builder
     */
    def requestIp(args: Endofunction[com.pulumi.cloudflare.inputs.ApiTokenConditionRequestIpArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiTokenConditionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiTokenConditionRequestIpArgs.builder
      builder.requestIp(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ApiTokenPolicyArgs.Builder)
    /**
     * @param permissionGroups A set of permission groups that are specified to the policy.
     * @return builder
     */
    def permissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.ApiTokenPolicyPermissionGroupArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ApiTokenPolicyArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ApiTokenPolicyPermissionGroupArgs.builder
      builder.permissionGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ApiTokenState.Builder)
    def condition(args: Endofunction[com.pulumi.cloudflare.inputs.ApiTokenConditionArgs.Builder]):
        com.pulumi.cloudflare.inputs.ApiTokenState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ApiTokenConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param policies List of access policies assigned to the token.
     * @return builder
     */
    def policies(args: Endofunction[com.pulumi.cloudflare.inputs.ApiTokenPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ApiTokenState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ApiTokenPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsState.Builder)
    def configs(args: Endofunction[com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsConfigArgs.Builder]*):
        com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.BotManagementState.Builder)
    /**
     * @param staleZoneConfiguration A read-only field that shows which unauthorized settings are currently active on the zone. These settings typically result from upgrades or downgrades.
     * @return builder
     */
    def staleZoneConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.BotManagementStaleZoneConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.BotManagementState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.BotManagementStaleZoneConfigurationArgs.builder
      builder.staleZoneConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CertificatePackCertificateArgs.Builder)
    /**
     * @param geoRestrictions Specify the region where your private key can be held locally.
     * @return builder
     */
    def geoRestrictions(args: Endofunction[com.pulumi.cloudflare.inputs.CertificatePackCertificateGeoRestrictionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.CertificatePackCertificateArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CertificatePackCertificateGeoRestrictionsArgs.builder
      builder.geoRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CertificatePackState.Builder)
    /**
     * @param certificates Array of certificates in this pack.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.cloudflare.inputs.CertificatePackCertificateArgs.Builder]*):
        com.pulumi.cloudflare.inputs.CertificatePackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CertificatePackCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param dcvDelegationRecords DCV Delegation records for domain validation.
     * @return builder
     */
    def dcvDelegationRecords(args: Endofunction[com.pulumi.cloudflare.inputs.CertificatePackDcvDelegationRecordArgs.Builder]*):
        com.pulumi.cloudflare.inputs.CertificatePackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CertificatePackDcvDelegationRecordArgs.builder
      builder.dcvDelegationRecords(args.map(_(argsBuilder).build)*)

    /**
     * @param validationErrors Domain validation errors that have been received by the certificate authority (CA).
     * @return builder
     */
    def validationErrors(args: Endofunction[com.pulumi.cloudflare.inputs.CertificatePackValidationErrorArgs.Builder]*):
        com.pulumi.cloudflare.inputs.CertificatePackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CertificatePackValidationErrorArgs.builder
      builder.validationErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param validationRecords Certificates&#39; validation records.
     * @return builder
     */
    def validationRecords(args: Endofunction[com.pulumi.cloudflare.inputs.CertificatePackValidationRecordArgs.Builder]*):
        com.pulumi.cloudflare.inputs.CertificatePackState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CertificatePackValidationRecordArgs.builder
      builder.validationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ClientCertificateState.Builder)
    /**
     * @param certificateAuthority Certificate Authority used to issue the Client Certificate.
     * @return builder
     */
    def certificateAuthority(args: Endofunction[com.pulumi.cloudflare.inputs.ClientCertificateCertificateAuthorityArgs.Builder]):
        com.pulumi.cloudflare.inputs.ClientCertificateState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ClientCertificateCertificateAuthorityArgs.builder
      builder.certificateAuthority(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs.Builder)
    /**
     * @param parameters Parameters of Cloud Connector Rule
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleParametersArgs.Builder]):
        com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CloudConnectorRulesState.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.CloudConnectorRulesState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CloudConnectorRulesRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.Builder)
    def network(args: Endofunction[com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostNetworkArgs.Builder]):
        com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    def resolverNetwork(args: Endofunction[com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostResolverNetworkArgs.Builder]):
        com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostResolverNetworkArgs.builder
      builder.resolverNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceState.Builder)
    def host(args: Endofunction[com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.Builder]):
        com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param tlsSettings TLS settings for a connectivity service.
     * @return builder
     */
    def tlsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceTlsSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ConnectivityDirectoryServiceTlsSettingsArgs.builder
      builder.tlsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ContentScanningExpressionState.Builder)
    def bodies(args: Endofunction[com.pulumi.cloudflare.inputs.ContentScanningExpressionBodyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ContentScanningExpressionState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ContentScanningExpressionBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.Builder)
    /**
     * @param customCertBundles Array of custom certificate and key pairs (1 or 2 pairs allowed).
     * @return builder
     */
    def customCertBundles(args: Endofunction[com.pulumi.cloudflare.inputs.CustomHostnameSslCustomCertBundleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.CustomHostnameSslCustomCertBundleArgs.builder
      builder.customCertBundles(args.map(_(argsBuilder).build)*)

    /**
     * @param settings SSL specific settings.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.CustomHostnameSslSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomHostnameSslSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CustomHostnameState.Builder)
    /**
     * @param ownershipVerification This is a record which can be placed to activate a hostname.
     * @return builder
     */
    def ownershipVerification(args: Endofunction[com.pulumi.cloudflare.inputs.CustomHostnameOwnershipVerificationArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomHostnameState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomHostnameOwnershipVerificationArgs.builder
      builder.ownershipVerification(args(argsBuilder).build)

    /**
     * @param ownershipVerificationHttp This presents the token to be served by the given http url to activate a hostname.
     * @return builder
     */
    def ownershipVerificationHttp(args: Endofunction[com.pulumi.cloudflare.inputs.CustomHostnameOwnershipVerificationHttpArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomHostnameState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomHostnameOwnershipVerificationHttpArgs.builder
      builder.ownershipVerificationHttp(args(argsBuilder).build)

    /**
     * @param ssl SSL properties used when creating the custom hostname.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomHostnameState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomHostnameSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CustomSslKeylessServerArgs.Builder)
    /**
     * @param tunnel Configuration for using Keyless SSL through a Cloudflare Tunnel.
     * @return builder
     */
    def tunnel(args: Endofunction[com.pulumi.cloudflare.inputs.CustomSslKeylessServerTunnelArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomSslKeylessServerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomSslKeylessServerTunnelArgs.builder
      builder.tunnel(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.CustomSslState.Builder)
    /**
     * @param geoRestrictions Specify the region where your private key can be held locally for optimal TLS performance. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Options allow distribution to only to U.S. data centers, only to E.U. data centers, or only to highest security data centers. Default distribution is to all Cloudflare datacenters, for optimal performance.
     * @return builder
     */
    def geoRestrictions(args: Endofunction[com.pulumi.cloudflare.inputs.CustomSslGeoRestrictionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomSslState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomSslGeoRestrictionsArgs.builder
      builder.geoRestrictions(args(argsBuilder).build)

    def keylessServer(args: Endofunction[com.pulumi.cloudflare.inputs.CustomSslKeylessServerArgs.Builder]):
        com.pulumi.cloudflare.inputs.CustomSslState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.CustomSslKeylessServerArgs.builder
      builder.keylessServer(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.D1DatabaseState.Builder)
    /**
     * @param readReplication Configuration for D1 read replication.
     * @return builder
     */
    def readReplication(args: Endofunction[com.pulumi.cloudflare.inputs.D1DatabaseReadReplicationArgs.Builder]):
        com.pulumi.cloudflare.inputs.D1DatabaseState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.D1DatabaseReadReplicationArgs.builder
      builder.readReplication(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DeviceManagedNetworksState.Builder)
    /**
     * @param config The configuration object containing information for the WARP client to detect the managed network.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.DeviceManagedNetworksConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.DeviceManagedNetworksState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DeviceManagedNetworksConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DevicePostureIntegrationState.Builder)
    /**
     * @param config The configuration object containing third-party integration information.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureIntegrationConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.DevicePostureIntegrationState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureIntegrationConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs.Builder)
    def locations(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureRuleInputLocationsArgs.Builder]):
        com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureRuleInputLocationsArgs.builder
      builder.locations(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DevicePostureRuleState.Builder)
    /**
     * @param input The value to be checked against.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs.Builder]):
        com.pulumi.cloudflare.inputs.DevicePostureRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param matches The conditions that the client must match to run the rule.
     * @return builder
     */
    def matches(args: Endofunction[com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs.Builder]*):
        com.pulumi.cloudflare.inputs.DevicePostureRuleState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs.builder
      builder.matches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessArgs.Builder)
    /**
     * @param skip Content types to exclude from context analysis and return all matches.
     * @return builder
     */
    def skip(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessSkipArgs.Builder]):
        com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessSkipArgs.builder
      builder.skip(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DlpCustomProfileEntryArgs.Builder)
    def pattern(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileEntryPatternArgs.Builder]):
        com.pulumi.cloudflare.inputs.DlpCustomProfileEntryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileEntryPatternArgs.builder
      builder.pattern(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DlpCustomProfileState.Builder)
    /**
     * @param contextAwareness Scan the context of predefined entries to only return matches surrounded by keywords.
     * @return builder
     * @deprecated This attribute is deprecated.
     */
    @deprecated("This attribute is deprecated.") def contextAwareness(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessArgs.Builder]):
        com.pulumi.cloudflare.inputs.DlpCustomProfileState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileContextAwarenessArgs.builder
      builder.contextAwareness(args(argsBuilder).build)

    /**
     * @param entries Custom entries from this profile.
     * If this field is omitted, entries owned by this profile will not be changed.
     * @return builder
     * @deprecated This attribute will be sunset on 01/01/2026
     */
    @deprecated("This attribute will be sunset on 01/01/2026") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.DlpCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

    /**
     * @param sensitivityLevels Sensitivity levels to associate with the profile.
     * @return builder
     */
    def sensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileSensitivityLevelArgs.Builder]*):
        com.pulumi.cloudflare.inputs.DlpCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileSensitivityLevelArgs.builder
      builder.sensitivityLevels(args.map(_(argsBuilder).build)*)

    /**
     * @param sharedEntries Entries from other profiles (e.g. pre-defined Cloudflare profiles, or your Microsoft Information Protection profiles).
     * @return builder
     */
    def sharedEntries(args: Endofunction[com.pulumi.cloudflare.inputs.DlpCustomProfileSharedEntryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.DlpCustomProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpCustomProfileSharedEntryArgs.builder
      builder.sharedEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.DlpPredefinedProfileState.Builder)
    /**
     * @return builder
     * @deprecated This attribute is deprecated. Use enabledEntries instead.
     */
    @deprecated("This attribute is deprecated. Use enabledEntries instead.") def entries(args: Endofunction[com.pulumi.cloudflare.inputs.DlpPredefinedProfileEntryArgs.Builder]*):
        com.pulumi.cloudflare.inputs.DlpPredefinedProfileState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.DlpPredefinedProfileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.DnsFirewallState.Builder)
    /**
     * @param attackMitigation Attack mitigation settings
     * @return builder
     */
    def attackMitigation(args: Endofunction[com.pulumi.cloudflare.inputs.DnsFirewallAttackMitigationArgs.Builder]):
        com.pulumi.cloudflare.inputs.DnsFirewallState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DnsFirewallAttackMitigationArgs.builder
      builder.attackMitigation(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.DnsRecordState.Builder)
    /**
     * @param data Components of a MX record.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.cloudflare.inputs.DnsRecordDataArgs.Builder]):
        com.pulumi.cloudflare.inputs.DnsRecordState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DnsRecordDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param settings Settings for the DNS record.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.cloudflare.inputs.DnsRecordSettingsArgs.Builder]):
        com.pulumi.cloudflare.inputs.DnsRecordState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.DnsRecordSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.EmailRoutingCatchAllState.Builder)
    /**
     * @param actions List actions for the catch-all routing rule.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingCatchAllActionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.EmailRoutingCatchAllState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingCatchAllActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchers List of matchers for the catch-all routing rule.
     * @return builder
     */
    def matchers(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingCatchAllMatcherArgs.Builder]*):
        com.pulumi.cloudflare.inputs.EmailRoutingCatchAllState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingCatchAllMatcherArgs.builder
      builder.matchers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.EmailRoutingRuleState.Builder)
    /**
     * @param actions List actions patterns.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingRuleActionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.EmailRoutingRuleState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingRuleActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param matchers Matching patterns to forward to your actions.
     * @return builder
     */
    def matchers(args: Endofunction[com.pulumi.cloudflare.inputs.EmailRoutingRuleMatcherArgs.Builder]*):
        com.pulumi.cloudflare.inputs.EmailRoutingRuleState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.EmailRoutingRuleMatcherArgs.builder
      builder.matchers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.EmailSecurityDomainState.Builder)
    def authorization(args: Endofunction[com.pulumi.cloudflare.inputs.EmailSecurityDomainAuthorizationArgs.Builder]):
        com.pulumi.cloudflare.inputs.EmailSecurityDomainState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.EmailSecurityDomainAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    def emailsProcessed(args: Endofunction[com.pulumi.cloudflare.inputs.EmailSecurityDomainEmailsProcessedArgs.Builder]):
        com.pulumi.cloudflare.inputs.EmailSecurityDomainState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.EmailSecurityDomainEmailsProcessedArgs.builder
      builder.emailsProcessed(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.FieldExtractorRuleArgs.Builder)
    def fields(args: Endofunction[com.pulumi.cloudflare.inputs.FieldExtractorRuleFieldArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FieldExtractorRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FieldExtractorRuleFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FieldExtractorState.Builder)
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.FieldExtractorRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FieldExtractorState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FieldExtractorRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FilterState.Builder)
    def bodies(args: Endofunction[com.pulumi.cloudflare.inputs.FilterBodyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FilterState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FilterBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FirewallRuleActionArgs.Builder)
    /**
     * @param response A custom content type and reponse to return when the threshold is exceeded. The custom response configured in this object will override the custom error for the zone. This object is optional.
     * Notes: If you omit this object, Cloudflare will use the default HTML error page. If &#34;mode&#34; is &#34;challenge&#34;, &#34;managed*challenge&#34;, or &#34;js*challenge&#34;, Cloudflare will use the zone challenge pages and you should not provide the &#34;response&#34; object.
     * @return builder
     */
    def response(args: Endofunction[com.pulumi.cloudflare.inputs.FirewallRuleActionResponseArgs.Builder]):
        com.pulumi.cloudflare.inputs.FirewallRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.FirewallRuleActionResponseArgs.builder
      builder.response(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.FirewallRuleState.Builder)
    /**
     * @param action The action to perform when the threshold of matched traffic within the configured period is exceeded.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.cloudflare.inputs.FirewallRuleActionArgs.Builder]):
        com.pulumi.cloudflare.inputs.FirewallRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.FirewallRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.FirewallRuleFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.FirewallRuleState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.FirewallRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.Builder)
    /**
     * @param conditions Conditions the context must satisfy for this rule to match. An empty array matches all contexts.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    def rollout(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleRolloutArgs.Builder]):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionArgs.Builder)
    def clauses(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseArgs.builder
      builder.clauses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseArgs.Builder)
    def clauses(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseArgs.builder
      builder.clauses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseArgs.Builder)
    def clauses(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseArgs.builder
      builder.clauses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseArgs.Builder)
    def clauses(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseClauseArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseClauseArgs.builder
      builder.clauses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseClauseArgs.Builder)
    def clauses(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseClauseClauseArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseClauseArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleConditionClauseClauseClauseClauseClauseArgs.builder
      builder.clauses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.FlagshipFlagState.Builder)
    /**
     * @param rules Targeting rules evaluated in ascending `priority`; the first matching rule wins. An empty array means the flag always serves `defaultVariation`.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.FlagshipFlagState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.FlagshipFlagRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccessRuleArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRuleFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccessRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccessRuleFilter.Builder)
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRuleFilterConfiguration.Builder]):
        com.pulumi.cloudflare.inputs.GetAccessRuleFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRuleFilterConfiguration.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccessRuleFilterArgs.Builder)
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRuleFilterConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccessRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRuleFilterConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccessRulePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRuleFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAccessRulePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRuleFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccessRulesArgs.Builder)
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulesConfigurationArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccessRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulesConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccessRulesPlainArgs.Builder)
    def configuration(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulesConfiguration.Builder]):
        com.pulumi.cloudflare.inputs.GetAccessRulesPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulesConfiguration.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilter.Builder)
    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterName.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterName.builder
      builder.name(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterArgs.Builder)
    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilterNameArgs.builder
      builder.name(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsArgs.Builder)
    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsNameArgs.builder
      builder.name(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsPlainArgs.Builder)
    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsName.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsName.builder
      builder.name(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountMemberArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMemberFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountMemberArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMemberFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountMemberPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMemberFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountMemberPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMemberFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountTokenArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokenFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountTokenArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokenFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAccountTokenPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokenFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAccountTokenPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokenFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAiGatewayArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAiGatewayPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAiGatewayPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAiSearchInstanceArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstanceFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAiSearchInstanceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstanceFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAiSearchInstancePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstanceFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAiSearchInstancePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstanceFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAiSearchTokenArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokenFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetAiSearchTokenArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokenFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetAiSearchTokenPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokenFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetAiSearchTokenPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokenFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetApiShieldOperationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetApiShieldOperationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetApiShieldOperationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetApiShieldOperationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetApiTokenArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetApiTokenArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetApiTokenPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetApiTokenPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCertificatePackArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePackFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCertificatePackArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePackFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCertificatePackPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePackFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetCertificatePackPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePackFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetClientCertificateArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificateFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetClientCertificateArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificateFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetClientCertificatePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificateFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetClientCertificatePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificateFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCloudforceOneRequestArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCloudforceOneRequestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomCsrArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomCsrArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomCsrPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomCsrPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomHostnameArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomHostnameArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomHostnameFilter.Builder)
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFilterHostname.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomHostnameFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFilterHostname.builder
      builder.hostname(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomHostnameFilterArgs.Builder)
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFilterHostnameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomHostnameFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFilterHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomHostnamePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomHostnamePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomHostnamesArgs.Builder)
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamesHostnameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomHostnamesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamesHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomHostnamesPlainArgs.Builder)
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamesHostname.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomHostnamesPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamesHostname.builder
      builder.hostname(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomOriginTrustStorePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomOriginTrustStorePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomSslArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomSslArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetCustomSslPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetCustomSslPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetD1DatabaseArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabaseFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetD1DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabaseFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetD1DatabasePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabaseFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetD1DatabasePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabaseFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetDnsRecordArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetDnsRecordFilter.Builder)
    def comment(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterComment.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterComment.builder
      builder.comment(args(argsBuilder).build)

    def content(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterContent.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterContent.builder
      builder.content(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterName.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterName.builder
      builder.name(args(argsBuilder).build)

    def tag(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterTag.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterTag.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.Builder)
    def comment(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterCommentArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterCommentArgs.builder
      builder.comment(args(argsBuilder).build)

    def content(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterContentArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterContentArgs.builder
      builder.content(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterNameArgs.builder
      builder.name(args(argsBuilder).build)

    def tag(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilterTagArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetDnsRecordPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder)
    def comment(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsCommentArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsCommentArgs.builder
      builder.comment(args(argsBuilder).build)

    def content(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsContentArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsContentArgs.builder
      builder.content(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsNameArgs.builder
      builder.name(args(argsBuilder).build)

    def tag(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsTagArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder)
    def comment(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsComment.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsComment.builder
      builder.comment(args(argsBuilder).build)

    def content(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsContent.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsContent.builder
      builder.content(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsName.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsName.builder
      builder.name(args(argsBuilder).build)

    def tag(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsTag.Builder]):
        com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsTag.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailRoutingAddressArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailRoutingAddressArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailRoutingAddressPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailRoutingAddressPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailRoutingRuleArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRuleFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailRoutingRulePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRuleFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailRoutingRulePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRuleFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityDomainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityDomainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityDomainPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityDomainPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetFilterArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetFilterFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFilterFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetFilterPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetFilterFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetFilterPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFilterFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetFlagshipFlagArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetFlagshipFlagArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetFlagshipFlagPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetFlagshipFlagPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetLoadBalancerPoolArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetLoadBalancerPoolArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetLoadBalancerPoolPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetLoadBalancerPoolPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetMagicTransitConnectorArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetMagicTransitConnectorArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetMagicTransitConnectorPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetMagicTransitConnectorPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetMagicTransitSiteArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetMagicTransitSiteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetMagicTransitSitePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetMagicTransitSitePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetMoqRelayArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelayFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetMoqRelayArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelayFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetMoqRelayPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelayFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetMoqRelayPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelayFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOrganizationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOrganizationFilter.Builder)
    def containing(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterContaining.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterContaining.builder
      builder.containing(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterName.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterName.builder
      builder.name(args(argsBuilder).build)

    def parent(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterParent.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterParent.builder
      builder.parent(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOrganizationFilterArgs.Builder)
    def containing(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterContainingArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterContainingArgs.builder
      builder.containing(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterNameArgs.builder
      builder.name(args(argsBuilder).build)

    def parent(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilterParentArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilterParentArgs.builder
      builder.parent(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOrganizationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOrganizationsArgs.Builder)
    def containing(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsContainingArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsContainingArgs.builder
      builder.containing(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsNameArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsNameArgs.builder
      builder.name(args(argsBuilder).build)

    def parent(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsParentArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationsArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsParentArgs.builder
      builder.parent(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.Builder)
    def containing(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsContaining.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsContaining.builder
      builder.containing(args(argsBuilder).build)

    def name(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsName.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsName.builder
      builder.name(args(argsBuilder).build)

    def parent(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsParent.Builder]):
        com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsParent.builder
      builder.parent(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOriginCaCertificateArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificateFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetOriginCaCertificateArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificateFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetOriginCaCertificatePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificateFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetOriginCaCertificatePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificateFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetPipelineSinkArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinkFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetPipelineSinkArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinkFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetPipelineSinkPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinkFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetPipelineSinkPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinkFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetPipelineStreamArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetPipelineStreamArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetPipelineStreamPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetPipelineStreamPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSecretsStoreArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetSecretsStoreArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSecretsStorePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetSecretsStorePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSecretsStoreSecretArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetSecretsStoreSecretArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSecretsStoreSecretPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetSecretsStoreSecretPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetShareArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetShareArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSharePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetSharePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetShareResourceArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourceFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetShareResourceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourceFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetShareResourcePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourceFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetShareResourcePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourceFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSpectrumApplicationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetSpectrumApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetSpectrumApplicationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetSpectrumApplicationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetTokenValidationRulesArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetTokenValidationRulesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetTokenValidationRulesPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetTokenValidationRulesPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetTurnstileWidgetArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetTurnstileWidgetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetTurnstileWidgetPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetTurnstileWidgetPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetUserGroupArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetUserGroupArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetUserGroupPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetUserGroupPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWebAnalyticsSitePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetWebAnalyticsSitePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkerArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkerPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkerPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkersCustomDomainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkersCustomDomainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkersCustomDomainPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkersCustomDomainPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkersKvNamespacePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkersKvNamespacePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkersScriptArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkersScriptArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkersScriptPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkersScriptPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkflowArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkflowArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetWorkflowPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetWorkflowPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param targetPolicies DEX rules targeted by this test
     * @return builder
     */
    def targetPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestTargetPolicyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestTargetPolicyArgs.builder
      builder.targetPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestFilter.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param targetPolicies DEX rules targeted by this test
     * @return builder
     */
    def targetPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestTargetPolicy.Builder]*):
        com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestTargetPolicy.builder
      builder.targetPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustListArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustListArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustListPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustListPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZoneArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZoneArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZoneFilter.Builder)
    def account(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneFilterAccount.Builder]):
        com.pulumi.cloudflare.inputs.GetZoneFilter.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneFilterAccount.builder
      builder.account(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZoneFilterArgs.Builder)
    def account(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneFilterAccountArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZoneFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneFilterAccountArgs.builder
      builder.account(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZoneLockdownArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZoneLockdownArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZoneLockdownPlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZoneLockdownPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZonePlainArgs.Builder)
    def filter(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneFilter.Builder]):
        com.pulumi.cloudflare.inputs.GetZonePlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneFilter.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZonesArgs.Builder)
    def account(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonesAccountArgs.Builder]):
        com.pulumi.cloudflare.inputs.GetZonesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonesAccountArgs.builder
      builder.account(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.GetZonesPlainArgs.Builder)
    def account(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonesAccount.Builder]):
        com.pulumi.cloudflare.inputs.GetZonesPlainArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonesAccount.builder
      builder.account(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.HealthcheckState.Builder)
    /**
     * @param httpConfig Parameters specific to an HTTP or HTTPS health check.
     * @return builder
     */
    def httpConfig(args: Endofunction[com.pulumi.cloudflare.inputs.HealthcheckHttpConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.HealthcheckState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HealthcheckHttpConfigArgs.builder
      builder.httpConfig(args(argsBuilder).build)

    /**
     * @param tcpConfig Parameters specific to TCP health check.
     * @return builder
     */
    def tcpConfig(args: Endofunction[com.pulumi.cloudflare.inputs.HealthcheckTcpConfigArgs.Builder]):
        com.pulumi.cloudflare.inputs.HealthcheckState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HealthcheckTcpConfigArgs.builder
      builder.tcpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.HyperdriveConfigState.Builder)
    def caching(args: Endofunction[com.pulumi.cloudflare.inputs.HyperdriveConfigCachingArgs.Builder]):
        com.pulumi.cloudflare.inputs.HyperdriveConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HyperdriveConfigCachingArgs.builder
      builder.caching(args(argsBuilder).build)

    /**
     * @param mtls mTLS configuration for the origin connection. Cannot be used with VPC Service origins; TLS must be managed on the VPC Service.
     * @return builder
     */
    def mtls(args: Endofunction[com.pulumi.cloudflare.inputs.HyperdriveConfigMtlsArgs.Builder]):
        com.pulumi.cloudflare.inputs.HyperdriveConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HyperdriveConfigMtlsArgs.builder
      builder.mtls(args(argsBuilder).build)

    /**
     * @param origin Combines database connection fields with exactly one supported network location.
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.cloudflare.inputs.HyperdriveConfigOriginArgs.Builder]):
        com.pulumi.cloudflare.inputs.HyperdriveConfigState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.HyperdriveConfigOriginArgs.builder
      builder.origin(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ImageVariantState.Builder)
    /**
     * @param options Allows you to define image resizing sizes for different use cases.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.cloudflare.inputs.ImageVariantOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.ImageVariantState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ImageVariantOptionsArgs.builder
      builder.options(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.KeylessCertificateState.Builder)
    /**
     * @param tunnel Configuration for using Keyless SSL through a Cloudflare Tunnel.
     * @return builder
     */
    def tunnel(args: Endofunction[com.pulumi.cloudflare.inputs.KeylessCertificateTunnelArgs.Builder]):
        com.pulumi.cloudflare.inputs.KeylessCertificateState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.KeylessCertificateTunnelArgs.builder
      builder.tunnel(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ListItemArgs.Builder)
    /**
     * @param hostname Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemHostnameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ListItemArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ListItemHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param redirect The definition of the redirect.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemRedirectArgs.Builder]):
        com.pulumi.cloudflare.inputs.ListItemArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ListItemRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ListItemState.Builder)
    /**
     * @param hostname Hostnames support ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the hyphen (-).
     * @return builder
     */
    def hostname(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemHostnameArgs.Builder]):
        com.pulumi.cloudflare.inputs.ListItemState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ListItemHostnameArgs.builder
      builder.hostname(args(argsBuilder).build)

    /**
     * @param redirect The definition of the redirect.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemRedirectArgs.Builder]):
        com.pulumi.cloudflare.inputs.ListItemState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.ListItemRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.ListState.Builder)
    /**
     * @param items The items in the list. If set, this overwrites all items in the list. Do not use with `cloudflare.ListItem`.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.cloudflare.inputs.ListItemArgs.Builder]*):
        com.pulumi.cloudflare.inputs.ListState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.ListItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerMonitorGroupState.Builder)
    /**
     * @param members List of monitors in this group
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerMonitorGroupMemberArgs.Builder]*):
        com.pulumi.cloudflare.inputs.LoadBalancerMonitorGroupState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerMonitorGroupMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.Builder)
    /**
     * @param origin Filter options for a particular resource type (pool or origin). Use null to reset.
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterOriginArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterOriginArgs.builder
      builder.origin(args(argsBuilder).build)

    /**
     * @param pool Filter options for a particular resource type (pool or origin). Use null to reset.
     * @return builder
     */
    def pool(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterPoolArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterPoolArgs.builder
      builder.pool(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs.Builder)
    /**
     * @param header The request header is used to pass additional information with an HTTP request. Currently supported header is &#39;Host&#39;.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginHeaderArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginHeaderArgs.builder
      builder.header(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerPoolState.Builder)
    /**
     * @param loadShedding Configures load shedding policies and percentages for the pool.
     * @return builder
     */
    def loadShedding(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolLoadSheddingArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolLoadSheddingArgs.builder
      builder.loadShedding(args(argsBuilder).build)

    /**
     * @param notificationFilter Filter pool and origin health notifications by resource type or health status. Use null to reset.
     * @return builder
     */
    def notificationFilter(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolNotificationFilterArgs.builder
      builder.notificationFilter(args(argsBuilder).build)

    /**
     * @param originSteering Configures origin steering for the pool. Controls how origins are selected for new sessions and traffic without session affinity.
     * @return builder
     */
    def originSteering(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginSteeringArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginSteeringArgs.builder
      builder.originSteering(args(argsBuilder).build)

    /**
     * @param origins The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * @return builder
     */
    def origins(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs.Builder]*):
        com.pulumi.cloudflare.inputs.LoadBalancerPoolState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.Builder)
    /**
     * @param fixedResponse A collection of fields used to directly respond to the eyeball instead of routing to a pool. If a fixed*response is supplied the rule will be marked as terminates.
     * @return builder
     */
    def fixedResponse(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleFixedResponseArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleFixedResponseArgs.builder
      builder.fixedResponse(args(argsBuilder).build)

    /**
     * @param overrides A collection of overrides to apply to the load balancer when this rule&#39;s condition is true. All fields are optional.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.Builder)
    /**
     * @param adaptiveRouting Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests. For example, zero-downtime failover occurs immediately when an origin becomes unavailable due to HTTP 521, 522, or 523 response codes. If there is another healthy origin in the same pool, the request is retried once against this alternate origin.
     * @return builder
     */
    def adaptiveRouting(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesAdaptiveRoutingArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesAdaptiveRoutingArgs.builder
      builder.adaptiveRouting(args(argsBuilder).build)

    /**
     * @param locationStrategy Controls location-based steering for non-proxied requests. See `steeringPolicy` to learn how steering is affected.
     * @return builder
     */
    def locationStrategy(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesLocationStrategyArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesLocationStrategyArgs.builder
      builder.locationStrategy(args(argsBuilder).build)

    /**
     * @param randomSteering Configures pool weights.
     * @return builder
     */
    def randomSteering(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesRandomSteeringArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesRandomSteeringArgs.builder
      builder.randomSteering(args(argsBuilder).build)

    /**
     * @param sessionAffinityAttributes Configures attributes for session affinity.
     * @return builder
     */
    def sessionAffinityAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesSessionAffinityAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleOverridesSessionAffinityAttributesArgs.builder
      builder.sessionAffinityAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.LoadBalancerState.Builder)
    /**
     * @param adaptiveRouting Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests. For example, zero-downtime failover occurs immediately when an origin becomes unavailable due to HTTP 521, 522, or 523 response codes. If there is another healthy origin in the same pool, the request is retried once against this alternate origin.
     * @return builder
     */
    def adaptiveRouting(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerAdaptiveRoutingArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerAdaptiveRoutingArgs.builder
      builder.adaptiveRouting(args(argsBuilder).build)

    /**
     * @param locationStrategy Controls location-based steering for non-proxied requests. See `steeringPolicy` to learn how steering is affected.
     * @return builder
     */
    def locationStrategy(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerLocationStrategyArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerLocationStrategyArgs.builder
      builder.locationStrategy(args(argsBuilder).build)

    /**
     * @param randomSteering Configures pool weights.
     * @return builder
     */
    def randomSteering(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRandomSteeringArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRandomSteeringArgs.builder
      builder.randomSteering(args(argsBuilder).build)

    /**
     * @param rules BETA Field Not General Access: A list of rules for this load balancer to execute.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.Builder]*):
        com.pulumi.cloudflare.inputs.LoadBalancerState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param sessionAffinityAttributes Configures attributes for session affinity.
     * @return builder
     */
    def sessionAffinityAttributes(args: Endofunction[com.pulumi.cloudflare.inputs.LoadBalancerSessionAffinityAttributesArgs.Builder]):
        com.pulumi.cloudflare.inputs.LoadBalancerState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LoadBalancerSessionAffinityAttributesArgs.builder
      builder.sessionAffinityAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.LogpushJobState.Builder)
    /**
     * @param outputOptions The structured replacement for `logpullOptions`. When including this field, the `logpullOption` field will be ignored.
     * @return builder
     */
    def outputOptions(args: Endofunction[com.pulumi.cloudflare.inputs.LogpushJobOutputOptionsArgs.Builder]):
        com.pulumi.cloudflare.inputs.LogpushJobState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.LogpushJobOutputOptionsArgs.builder
      builder.outputOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationState.Builder)
    def warpDevices(args: Endofunction[com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationWarpDeviceArgs.Builder]*):
        com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicNetworkMonitoringConfigurationWarpDeviceArgs.builder
      builder.warpDevices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyArgs.Builder)
    def location(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyLocationArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyArgs.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitCf1SiteState.Builder)
    def bodies(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyArgs.Builder]*):
        com.pulumi.cloudflare.inputs.MagicTransitCf1SiteState.Builder =
      def argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitCf1SiteBodyArgs.builder
      builder.bodies(args.map(_(argsBuilder).build)*)

    def location(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitCf1SiteLocationArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitCf1SiteState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitCf1SiteLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitConnectorState.Builder)
    def device(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitConnectorDeviceArgs.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitConnectorState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitConnectorDeviceArgs.builder
      builder.device(args(argsBuilder).build)

  extension (builder: com.pulumi.cloudflare.inputs.MagicTransitSiteAclState.Builder)
    def lan1(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan1Args.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteAclState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan1Args.builder
      builder.lan1(args(argsBuilder).build)

    def lan2(args: Endofunction[com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan2Args.Builder]):
        com.pulumi.cloudflare.inputs.MagicTransitSiteAclState.Builder =
      val argsBuilder = com.pulumi.cloudflare.inputs.MagicTransitSiteAclLan2Args.builder
      builder.lan2(args(argsBuilder).build)
