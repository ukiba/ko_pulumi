package jp.ukiba.ko_pulumi
package cloudflare

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudflare:
  @deprecated("cloudflare.index/accessapplication.AccessApplication has been deprecated in favor of cloudflare.index/zerotrustaccessapplication.ZeroTrustAccessApplication") inline def AccessApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessApplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  @deprecated("cloudflare.index/accesscacertificate.AccessCaCertificate has been deprecated in favor of cloudflare.index/zerotrustaccessshortlivedcertificate.ZeroTrustAccessShortLivedCertificate") inline def AccessCaCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessCaCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessCaCertificateArgs.builder
    com.pulumi.cloudflare.AccessCaCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Custom Pages Read`
   * - `Access: Custom Pages Write`
   */
  @deprecated("cloudflare.index/accesscustompage.AccessCustomPage has been deprecated in favor of cloudflare.index/zerotrustaccesscustompage.ZeroTrustAccessCustomPage") inline def AccessCustomPage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessCustomPageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessCustomPageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessCustomPage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accessgroup.AccessGroup has been deprecated in favor of cloudflare.index/zerotrustaccessgroup.ZeroTrustAccessGroup") inline def AccessGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accessidentityprovider.AccessIdentityProvider has been deprecated in favor of cloudflare.index/zerotrustaccessidentityprovider.ZeroTrustAccessIdentityProvider") inline def AccessIdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessIdentityProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessIdentityProviderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessIdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accesskeysconfiguration.AccessKeysConfiguration has been deprecated in favor of cloudflare.index/zerotrustaccesskeyconfiguration.ZeroTrustAccessKeyConfiguration") inline def AccessKeysConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessKeysConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessKeysConfigurationArgs.builder
    com.pulumi.cloudflare.AccessKeysConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  @deprecated("cloudflare.index/accessmutualtlscertificate.AccessMutualTlsCertificate has been deprecated in favor of cloudflare.index/zerotrustaccessmtlscertificate.ZeroTrustAccessMtlsCertificate") inline def AccessMutualTlsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessMutualTlsCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessMutualTlsCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessMutualTlsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  @deprecated("cloudflare.index/accessmutualtlshostnamesettings.AccessMutualTlsHostnameSettings has been deprecated in favor of cloudflare.index/zerotrustaccessmtlshostnamesettings.ZeroTrustAccessMtlsHostnameSettings") inline def AccessMutualTlsHostnameSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessMutualTlsHostnameSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessMutualTlsHostnameSettingsArgs.builder
    com.pulumi.cloudflare.AccessMutualTlsHostnameSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Revoke`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accessorganization.AccessOrganization has been deprecated in favor of cloudflare.index/zerotrustorganization.ZeroTrustOrganization") inline def AccessOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessOrganizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessOrganizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessOrganization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  @deprecated("cloudflare.index/accesspolicy.AccessPolicy has been deprecated in favor of cloudflare.index/zerotrustaccesspolicy.ZeroTrustAccessPolicy") inline def AccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Firewall Access Rules Read`
   * - `Account Firewall Access Rules Write`
   */
  inline def AccessRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessRuleArgs.builder
    com.pulumi.cloudflare.AccessRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Service Tokens Read`
   * - `Access: Service Tokens Write`
   */
  @deprecated("cloudflare.index/accessservicetoken.AccessServiceToken has been deprecated in favor of cloudflare.index/zerotrustaccessservicetoken.ZeroTrustAccessServiceToken") inline def AccessServiceToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessServiceTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessServiceTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessServiceToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  @deprecated("cloudflare.index/accesstag.AccessTag has been deprecated in favor of cloudflare.index/zerotrustaccesstag.ZeroTrustAccessTag") inline def AccessTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessTagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Firewall Access Rules Read`
   * - `Account Firewall Access Rules Write`
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Billing Read`
   * - `Billing Write`
   * - `DDoS Botnet Feed Read`
   * - `DDoS Botnet Feed Write`
   * - `DDoS Protection Read`
   * - `DDoS Protection Write`
   * - `DNS Firewall Read`
   * - `DNS Firewall Write`
   * - `DNS View Read`
   * - `DNS View Write`
   * - `Load Balancers Account Read`
   * - `Load Balancers Account Write`
   * - `Load Balancing: Monitors and Pools Read`
   * - `Load Balancing: Monitors and Pools Write`
   * - `SCIM Provisioning`
   * - `Trust and Safety Read`
   * - `Trust and Safety Write`
   * - `Workers KV Storage Read`
   * - `Workers KV Storage Write`
   * - `Workers R2 Storage Read`
   * - `Workers R2 Storage Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * - `Zero Trust: PII Read`
   */
  inline def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccountArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Account(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account DNS Settings Read`
   * - `Account DNS Settings Write`
   */
  inline def AccountDnsSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountDnsSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccountDnsSettingsArgs.builder
    com.pulumi.cloudflare.AccountDnsSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS View Read`
   * - `DNS View Write`
   */
  inline def AccountDnsSettingsInternalView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountDnsSettingsInternalViewArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccountDnsSettingsInternalViewArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccountDnsSettingsInternalView(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `SCIM Provisioning`
   */
  inline def AccountMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccountMemberArgs.builder
    com.pulumi.cloudflare.AccountMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Billing Read`
   * - `Billing Write`
   */
  inline def AccountSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccountSubscriptionArgs.builder
    com.pulumi.cloudflare.AccountSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Tokens Read`
   * - `Account API Tokens Write`
   */
  inline def AccountToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccountTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccountToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Address Maps Read`
   * - `Address Maps Write`
   */
  inline def AddressMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AddressMapArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AddressMapArgs.builder
    com.pulumi.cloudflare.AddressMap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `AI Gateway Read`
   * - `AI Gateway Write`
   */
  inline def AiGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AiGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AiGatewayArgs.builder
    com.pulumi.cloudflare.AiGateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `AI Gateway Read`
   * - `AI Gateway Write`
   */
  inline def AiGatewayDynamicRouting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AiGatewayDynamicRoutingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AiGatewayDynamicRoutingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AiGatewayDynamicRouting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ## Import
   * 
   * ```sh
   * \$ pulumi import cloudflare:index/aiSearchInstance:AiSearchInstance example &#39;&lt;account_id&gt;/&lt;id&gt;&#39;
   * ```
   */
  inline def AiSearchInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AiSearchInstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AiSearchInstanceArgs.builder
    com.pulumi.cloudflare.AiSearchInstance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ## Import
   * 
   * &gt; This resource does not currently support `pulumi import`.
   */
  inline def AiSearchNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AiSearchNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AiSearchNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AiSearchNamespace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ## Import
   * 
   * ```sh
   * \$ pulumi import cloudflare:index/aiSearchToken:AiSearchToken example &#39;&lt;account_id&gt;/&lt;id&gt;&#39;
   * ```
   */
  inline def AiSearchToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AiSearchTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AiSearchTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AiSearchToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   * 
   * When using `type = &#34;jwt&#34;` for auth ID characteristics, the `name` field must be a claim location expressed as `\$(token_config_id):\$(json_path)`, where:
   * - `tokenConfigId` is the ID of the token configuration used in validating the JWT
   * - `jsonPath` is a [RFC 9535](https://www.rfc-editor.org/rfc/rfc9535.html) [JSONPath](https://goessner.net/articles/JsonPath/) expression that returns a singleton value (interpreted as a string)
   * 
   * The JSONPath expression may be in dot or bracket notation and may only specify literal keys or array indexes.
   */
  inline def ApiShield(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldArgs.builder
    com.pulumi.cloudflare.ApiShield(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Domain API Gateway`
   */
  inline def ApiShieldDiscoveryOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldDiscoveryOperationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldDiscoveryOperationArgs.builder
    com.pulumi.cloudflare.ApiShieldDiscoveryOperation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  inline def ApiShieldOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldOperationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldOperationArgs.builder
    com.pulumi.cloudflare.ApiShieldOperation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   * 
   * &gt; `cloudflare.ApiShieldOperationSchemaValidationSettings` is in a deprecation phase and will be removed in the future.
   *   Instead, please utilize the cloudflare.SchemaValidationOperationSettings resource instead.
   */
  inline def ApiShieldOperationSchemaValidationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldOperationSchemaValidationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldOperationSchemaValidationSettingsArgs.builder
    com.pulumi.cloudflare.ApiShieldOperationSchemaValidationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   * 
   * &gt; `cloudflare.ApiShieldSchema` is in a deprecation phase and will be removed in the future.
   *   Instead, please utilize the cloudflare.SchemaValidationSchemas resource instead.
   */
  inline def ApiShieldSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldSchemaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ApiShieldSchemaArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ApiShieldSchema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   * 
   * &gt; `cloudflare.ApiShieldSchemaValidationSettings` is in a deprecation phase and will be removed in the future.
   *   Instead, please utilize the cloudflare.SchemaValidationSettings resource instead.
   */
  inline def ApiShieldSchemaValidationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldSchemaValidationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldSchemaValidationSettingsArgs.builder
    com.pulumi.cloudflare.ApiShieldSchemaValidationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `API Tokens Read`
   * - `API Tokens Write`
   */
  inline def ApiToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ApiTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ApiToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  inline def ArgoSmartRouting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ArgoSmartRoutingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ArgoSmartRoutingArgs.builder
    com.pulumi.cloudflare.ArgoSmartRouting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ArgoTieredCaching(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ArgoTieredCachingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ArgoTieredCachingArgs.builder
    com.pulumi.cloudflare.ArgoTieredCaching(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def AuthenticatedOriginPulls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPulls(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def AuthenticatedOriginPullsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPullsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def AuthenticatedOriginPullsHostnameCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsHostnameCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsHostnameCertificateArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPullsHostnameCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def AuthenticatedOriginPullsSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsSettingsArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPullsSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Bot Management Read`
   * - `Bot Management Write`
   */
  inline def BotManagement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.BotManagementArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.BotManagementArgs.builder
    com.pulumi.cloudflare.BotManagement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `IP Prefixes: BGP On Demand Read`
   * - `IP Prefixes: BGP On Demand Write`
   * - `IP Prefixes: Read`
   * - `IP Prefixes: Write`
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   */
  inline def ByoIpPrefix(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ByoIpPrefixArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ByoIpPrefixArgs.builder
    com.pulumi.cloudflare.ByoIpPrefix(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Calls Read`
   * - `Calls Write`
   */
  inline def CallsSfuApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CallsSfuAppArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CallsSfuAppArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CallsSfuApp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Calls Read`
   * - `Calls Write`
   */
  inline def CallsTurnApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CallsTurnAppArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CallsTurnAppArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CallsTurnApp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def CertificateAuthoritiesHostnameAssociations(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CertificateAuthoritiesHostnameAssociationsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CertificateAuthoritiesHostnameAssociationsArgs.builder
    com.pulumi.cloudflare.CertificateAuthoritiesHostnameAssociations(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   * 
   * &gt; Certificate packs are not able to be updated in place. If
   * you require a zero downtime rotation, you can create multiple
   * resources using a 2-phase change where you have both resources
   * live at once and you remove the old one once you&#39;ve confirmed
   * the certificate is available.
   */
  inline def CertificatePack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CertificatePackArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CertificatePackArgs.builder
    com.pulumi.cloudflare.CertificatePack(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def ClientCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ClientCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ClientCertificateArgs.builder
    com.pulumi.cloudflare.ClientCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Connector Read`
   * - `Cloud Connector Write`
   */
  inline def CloudConnectorRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudConnectorRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudConnectorRulesArgs.builder
    com.pulumi.cloudflare.CloudConnectorRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CloudflareFunctions:
    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccessRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccessRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccessRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccessRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Billing Read`
     * - `Billing Write`
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     * - `DDoS Protection Read`
     * - `DDoS Protection Write`
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     * - `DNS View Read`
     * - `DNS View Write`
     * - `Load Balancers Account Read`
     * - `Load Balancers Account Write`
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     * - `SCIM Provisioning`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     * - `Zero Trust: PII Read`
     */
    inline def getAccount(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Billing Read`
     * - `Billing Write`
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     * - `DDoS Protection Read`
     * - `DDoS Protection Write`
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     * - `DNS View Read`
     * - `DNS View Write`
     * - `Load Balancers Account Read`
     * - `Load Balancers Account Write`
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     * - `SCIM Provisioning`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     * - `Zero Trust: PII Read`
     */
    inline def getAccountPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroupsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroupsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroupsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroupsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account DNS Settings Read`
     * - `Account DNS Settings Write`
     */
    inline def getAccountDnsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account DNS Settings Read`
     * - `Account DNS Settings Write`
     */
    inline def getAccountDnsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalView(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalView(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalViewPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalViewPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalViews(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalViews(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalViewsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalViewsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMemberArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountMemberResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMemberArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMember(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMemberPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMemberPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountMemberResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMemberPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMemberPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMembers(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMembersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountMembersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMembersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMembers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMembersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMembersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountMembersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMembersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMembersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Billing Read`
     * - `Billing Write`
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     * - `DDoS Protection Read`
     * - `DDoS Protection Write`
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     * - `DNS View Read`
     * - `DNS View Write`
     * - `Load Balancers Account Read`
     * - `Load Balancers Account Write`
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     * - `SCIM Provisioning`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     * - `Zero Trust: PII Read`
     */
    inline def getAccountPermissionGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Billing Read`
     * - `Billing Write`
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     * - `DDoS Protection Read`
     * - `DDoS Protection Write`
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     * - `DNS View Read`
     * - `DNS View Write`
     * - `Load Balancers Account Read`
     * - `Load Balancers Account Write`
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     * - `SCIM Provisioning`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     * - `Zero Trust: PII Read`
     */
    inline def getAccountPermissionGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Billing Read`
     * - `Billing Write`
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     * - `DDoS Protection Read`
     * - `DDoS Protection Write`
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     * - `DNS View Read`
     * - `DNS View Write`
     * - `Load Balancers Account Read`
     * - `Load Balancers Account Write`
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     * - `SCIM Provisioning`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     * - `Zero Trust: PII Read`
     */
    inline def getAccountPermissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Billing Read`
     * - `Billing Write`
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     * - `DDoS Protection Read`
     * - `DDoS Protection Write`
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     * - `DNS View Read`
     * - `DNS View Write`
     * - `Load Balancers Account Read`
     * - `Load Balancers Account Write`
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     * - `SCIM Provisioning`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     * - `Zero Trust: PII Read`
     */
    inline def getAccountPermissionGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRole(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRoleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountRoleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRoleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRole(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRolePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRolePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountRoleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRolePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRolePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRoles(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRolesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountRolesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRolesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRoles(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRolesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRolesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountRolesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRolesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRolesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getAccountSubscription(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountSubscriptionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountSubscriptionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountSubscription(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getAccountSubscriptionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountSubscriptionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountSubscriptionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountSubscriptionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokensArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountTokens(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokensPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountTokensPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAccounts(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccounts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAccountsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMap(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAddressMapResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMap(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMapPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAddressMapResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMapPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMaps(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAddressMapsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMaps(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMapsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAddressMapsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMapsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGateway(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewayPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewayDynamicRouting(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiGatewayDynamicRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewayDynamicRouting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewayDynamicRoutingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiGatewayDynamicRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewayDynamicRoutingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGateways(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewaysArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiGatewaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewaysArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGateways(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewaysPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewaysPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiGatewaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewaysPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewaysPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAiSearchInstance(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstanceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchInstanceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstanceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAiSearchInstancePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchInstanceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstancePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAiSearchInstances(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstancesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchInstancesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstancesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstances(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAiSearchInstancesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstancesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchInstancesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstancesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstancesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAiSearchNamespace(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespaceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAiSearchNamespacePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespacePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAiSearchNamespaces(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespacesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespacesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespaces(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAiSearchNamespacesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespacesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespacesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespacesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAiSearchToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAiSearchTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAiSearchTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokensArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchTokens(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAiSearchTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokensPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchTokensPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShield(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShield(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldDiscoveryOperations(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldDiscoveryOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldDiscoveryOperations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldDiscoveryOperationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldDiscoveryOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldDiscoveryOperationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperation(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldOperationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldOperationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationSchemaValidationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldOperationSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationSchemaValidationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationSchemaValidationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldOperationSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationSchemaValidationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperations(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchema(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldSchemaResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchema(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemaPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldSchemaResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemaPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemaValidationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemaValidationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemaValidationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemaValidationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemas(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemasArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldSchemasInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemasArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemas(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemasPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemasPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldSchemasInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemasPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemasPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokenPermissionGroupsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokenPermissionGroupsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokenPermissionGroupsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokenPermissionGroupsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokensArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokens(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokensPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokensPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getArgoSmartRouting(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoSmartRoutingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetArgoSmartRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoSmartRoutingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoSmartRouting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getArgoSmartRoutingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoSmartRoutingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetArgoSmartRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoSmartRoutingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoSmartRoutingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getArgoTieredCaching(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoTieredCachingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetArgoTieredCachingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoTieredCachingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoTieredCaching(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getArgoTieredCachingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoTieredCachingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetArgoTieredCachingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoTieredCachingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoTieredCachingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAuthenticatedOriginPulls(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPulls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAuthenticatedOriginPullsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAuthenticatedOriginPullsCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAuthenticatedOriginPullsCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAuthenticatedOriginPullsCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAuthenticatedOriginPullsCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAuthenticatedOriginPullsHostnameCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAuthenticatedOriginPullsHostnameCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getAuthenticatedOriginPullsHostnameCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getAuthenticatedOriginPullsHostnameCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getAuthenticatedOriginPullsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getAuthenticatedOriginPullsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Bot Management Read`
     * - `Bot Management Write`
     */
    inline def getBotManagement(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotManagementArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetBotManagementResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotManagementArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotManagement(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Bot Management Read`
     * - `Bot Management Write`
     */
    inline def getBotManagementPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotManagementPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetBotManagementResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotManagementPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotManagementPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     */
    inline def getBotnetFeedConfigAsn(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetBotnetFeedConfigAsnResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotnetFeedConfigAsn(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     */
    inline def getBotnetFeedConfigAsnPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetBotnetFeedConfigAsnResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotnetFeedConfigAsnPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `IP Prefixes: BGP On Demand Read`
     * - `IP Prefixes: BGP On Demand Write`
     * - `IP Prefixes: Read`
     * - `IP Prefixes: Write`
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     */
    inline def getByoIpPrefix(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetByoIpPrefixResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefix(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `IP Prefixes: BGP On Demand Read`
     * - `IP Prefixes: BGP On Demand Write`
     * - `IP Prefixes: Read`
     * - `IP Prefixes: Write`
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     */
    inline def getByoIpPrefixPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetByoIpPrefixResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefixPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `IP Prefixes: BGP On Demand Read`
     * - `IP Prefixes: BGP On Demand Write`
     * - `IP Prefixes: Read`
     * - `IP Prefixes: Write`
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     */
    inline def getByoIpPrefixes(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetByoIpPrefixesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefixes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `IP Prefixes: BGP On Demand Read`
     * - `IP Prefixes: BGP On Demand Write`
     * - `IP Prefixes: Read`
     * - `IP Prefixes: Write`
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     */
    inline def getByoIpPrefixesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetByoIpPrefixesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefixesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuApp(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsSfuAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuApp(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuAppPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsSfuAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuAppPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuApps(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsSfuAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuApps(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuAppsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsSfuAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuAppsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnApp(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsTurnAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnApp(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnAppPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsTurnAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnAppPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnApps(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsTurnAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnApps(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnAppsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsTurnAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnAppsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificateAuthoritiesHostnameAssociations(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCertificateAuthoritiesHostnameAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificateAuthoritiesHostnameAssociations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificateAuthoritiesHostnameAssociationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCertificateAuthoritiesHostnameAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificateAuthoritiesHostnameAssociationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePack(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePackArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCertificatePackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePack(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePackPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCertificatePackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePackPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePacks(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePacksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCertificatePacksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePacksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePacks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePacksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePacksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCertificatePacksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePacksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePacksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetClientCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetClientCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetClientCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetClientCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Connector Read`
     * - `Cloud Connector Write`
     */
    inline def getCloudConnectorRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudConnectorRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudConnectorRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudConnectorRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudConnectorRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Connector Read`
     * - `Cloud Connector Write`
     */
    inline def getCloudConnectorRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudConnectorRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudConnectorRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudConnectorRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudConnectorRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequest(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequest(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestAsset(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestAsset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestAssetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestAssetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestMessage(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestMessageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestMessage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestMessagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestMessageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestMessagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestPriority(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestPriorityResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestPriority(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestPriorityPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestPriorityResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestPriorityPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequests(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequests(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getConnectivityDirectoryService(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServiceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getConnectivityDirectoryServicePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServiceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getConnectivityDirectoryServices(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServicesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryServices(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getConnectivityDirectoryServicesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServicesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryServicesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanning(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetContentScanningResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanning(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanningPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetContentScanningResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanningPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanningExpressions(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningExpressionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetContentScanningExpressionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningExpressionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanningExpressions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanningExpressionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningExpressionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetContentScanningExpressionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningExpressionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanningExpressionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCtAlerting(args: Endofunction[com.pulumi.cloudflare.inputs.GetCtAlertingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCtAlertingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCtAlertingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCtAlerting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCtAlertingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCtAlertingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCtAlertingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCtAlertingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCtAlertingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsr(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomCsrResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsr(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsrPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomCsrResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsrPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsrs(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomCsrsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsrs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsrsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomCsrsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsrsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostname(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnamePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnamePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnameFallbackOrigin(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomHostnameFallbackOriginResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnameFallbackOrigin(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnameFallbackOriginPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomHostnameFallbackOriginResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnameFallbackOriginPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnames(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnames(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnamesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnamesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStore(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStorePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStorePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStorePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStores(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStores(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStoresPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStoresPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getCustomPageAsset(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPageAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAsset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getCustomPageAssetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPageAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAssetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getCustomPageAssets(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPageAssetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAssets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getCustomPageAssetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPageAssetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAssetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPages(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPagesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPages(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPagesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPagesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPagesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPagesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPagesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPagesList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPagesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPagesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPagesListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSsl(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomSslResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSsl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSslPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomSslResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSslPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSsls(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomSslsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSsls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSslsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomSslsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSslsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1Database(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetD1DatabaseResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabaseArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1Database(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1DatabasePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetD1DatabaseResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabasePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1DatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1Databases(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabasesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetD1DatabasesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabasesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1Databases(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1DatabasesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabasesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetD1DatabasesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabasesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1DatabasesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getDcvDelegation(args: Endofunction[com.pulumi.cloudflare.inputs.GetDcvDelegationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDcvDelegationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDcvDelegationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDcvDelegation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getDcvDelegationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDcvDelegationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDcvDelegationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDcvDelegationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDcvDelegationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getDlsPrefixBinding(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBinding(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getDlsPrefixBindingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBindingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getDlsPrefixBindings(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBindings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getDlsPrefixBindingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBindingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewall(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsFirewallResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewall(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewallPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsFirewallResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewallPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewalls(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsFirewallsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewalls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewallsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsFirewallsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewallsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecord(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsRecordResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecord(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecordPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsRecordResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecordPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecords(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsRecordsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecords(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecordsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsRecordsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecordsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAcl(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAcl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAclPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAclPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAcls(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAcls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAclsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAclsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersIncoming(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersIncomingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersIncoming(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersIncomingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersIncomingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersIncomingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersOutgoing(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersOutgoingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersOutgoing(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersOutgoingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersOutgoingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersOutgoingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeer(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeers(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsig(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsigs(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsigs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsigsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsigsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddress(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddress(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddressPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddressPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddresses(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddresses(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddressesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddressesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingCatchAll(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingCatchAllResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingCatchAll(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingCatchAllPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingCatchAllResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingCatchAllPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingDns(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingDnsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingDnsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingDnsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingDns(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingDnsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingDnsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingDnsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingDnsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingDnsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSender(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSenderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSender(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSenderPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSenderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSenderPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSenders(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSendersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSenders(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSendersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSendersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSendersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomains(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomainsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistries(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistries(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistry(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistry(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomains(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomainsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomainsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomainsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomainsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomainsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getEmailSendingSubdomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getEmailSendingSubdomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getEmailSendingSubdomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomains(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getEmailSendingSubdomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomainsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getFieldExtractor(args: Endofunction[com.pulumi.cloudflare.inputs.GetFieldExtractorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFieldExtractorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFieldExtractorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFieldExtractor(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getFieldExtractorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFieldExtractorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFieldExtractorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFieldExtractorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFieldExtractorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFilter(args: Endofunction[com.pulumi.cloudflare.inputs.GetFilterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFilterResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFilterArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFilter(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFilterPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFilterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFilterResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFilterPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFilterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFilters(args: Endofunction[com.pulumi.cloudflare.inputs.GetFiltersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFiltersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFiltersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFilters(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFiltersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFiltersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFiltersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFiltersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFiltersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFirewallRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFirewallRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFirewallRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFirewallRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipApp(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipApp(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipAppPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipAppPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipApps(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipApps(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipAppsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipAppsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlag(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipFlagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlag(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlagPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipFlagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlagPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlags(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipFlagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlags(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlagsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipFlagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlagsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     */
    inline def getGoogleTagGateway(args: Endofunction[com.pulumi.cloudflare.inputs.GetGoogleTagGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetGoogleTagGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetGoogleTagGatewayArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getGoogleTagGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     */
    inline def getGoogleTagGatewayPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetGoogleTagGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetGoogleTagGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetGoogleTagGatewayPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getGoogleTagGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthcheck(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthcheckArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHealthcheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthcheckArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthcheck(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthcheckPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthcheckPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHealthcheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthcheckPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthcheckPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthchecks(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthchecksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHealthchecksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthchecksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthchecks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthchecksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthchecksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHealthchecksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthchecksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthchecksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getHostnameTlsSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSetting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getHostnameTlsSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSettingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getHostnameTlsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getHostnameTlsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHyperdriveConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHyperdriveConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHyperdriveConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfigs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfigsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHyperdriveConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfigsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImage(args: Endofunction[com.pulumi.cloudflare.inputs.GetImageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetImagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImageVariant(args: Endofunction[com.pulumi.cloudflare.inputs.GetImageVariantArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetImageVariantResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImageVariantArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImageVariant(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImageVariantPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetImageVariantPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetImageVariantResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImageVariantPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImageVariantPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImages(args: Endofunction[com.pulumi.cloudflare.inputs.GetImagesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetImagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImagesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImages(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImagesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetImagesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetImagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImagesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImagesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getIpRanges(args: Endofunction[com.pulumi.cloudflare.inputs.GetIpRangesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetIpRangesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetIpRangesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getIpRanges(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getIpRangesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetIpRangesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetIpRangesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetIpRangesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getIpRangesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getKeylessCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetKeylessCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getKeylessCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetKeylessCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getKeylessCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetKeylessCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getKeylessCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetKeylessCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheck(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheck(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Read`
     */
    inline def getList(args: Endofunction[com.pulumi.cloudflare.inputs.GetListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Read`
     */
    inline def getListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItem(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListItemResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItem(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItemPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListItemResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItemPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItems(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListItemsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItems(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItemsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListItemsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItemsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getLists(args: Endofunction[com.pulumi.cloudflare.inputs.GetListsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLists(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancer(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitor(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitor(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getLoadBalancerMonitorGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getLoadBalancerMonitorGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getLoadBalancerMonitorGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getLoadBalancerMonitorGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitors(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitors(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPool(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPoolPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPools(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPools(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPoolsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPoolsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancers(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     * - `Logs Write`
     */
    inline def getLogpullRetention(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpullRetentionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpullRetentionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpullRetentionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpullRetention(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     * - `Logs Write`
     */
    inline def getLogpullRetentionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpullRetentionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpullRetentionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpullRetentionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpullRetentionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     */
    inline def getLogpushDatasetField(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushDatasetFieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetField(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     */
    inline def getLogpushDatasetFieldPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushDatasetFieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetFieldPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushDatasetJob(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetJobArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushDatasetJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetJobArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetJob(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushDatasetJobPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetJobPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushDatasetJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetJobPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetJobPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJob(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJob(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJobPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJobPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJobs(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushJobsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJobs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJobsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushJobsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJobsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringConfigurationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1Site(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SiteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SiteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1Site(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1SitePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1SitePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1Sites(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1Sites(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1SitesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1SitesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnector(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnector(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnectorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnectorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnectors(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnectors(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnectorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnectorsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSite(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSite(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSitePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSitePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSitePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSitePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAcl(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAcl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAclPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAclPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAcls(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAcls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAclsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAclsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLan(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLanPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLans(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLans(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLansPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLansPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWan(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWanPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWans(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWans(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWansPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWansPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSites(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSitesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSitesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSites(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSitesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSitesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSitesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSitesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMagicWanBgpFilterProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMagicWanBgpFilterProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMagicWanBgpFilterProfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfiles(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMagicWanBgpFilterProfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfilesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanGreTunnel(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanGreTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanGreTunnel(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanGreTunnelPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanGreTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanGreTunnelPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanIpsecTunnel(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanIpsecTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanIpsecTunnel(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanIpsecTunnelPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanIpsecTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanIpsecTunnelPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanStaticRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanStaticRouteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanStaticRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanStaticRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanStaticRoute(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanStaticRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanStaticRoutePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanStaticRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanStaticRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanStaticRoutePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Rulesets Read`
     * - `Account Rulesets Write`
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Bot Management Read`
     * - `Bot Management Write`
     * - `Cache Settings Read`
     * - `Cache Settings Write`
     * - `Config Settings Read`
     * - `Config Settings Write`
     * - `Custom Errors Read`
     * - `Custom Errors Write`
     * - `Dynamic URL Redirects Read`
     * - `Dynamic URL Redirects Write`
     * - `HTTP DDoS Managed Ruleset Read`
     * - `HTTP DDoS Managed Ruleset Write`
     * - `L4 DDoS Managed Ruleset Read`
     * - `L4 DDoS Managed Ruleset Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Magic Firewall Read`
     * - `Magic Firewall Write`
     * - `Managed headers Read`
     * - `Managed headers Write`
     * - `Mass URL Redirects Read`
     * - `Mass URL Redirects Write`
     * - `Origin Read`
     * - `Origin Write`
     * - `Response Compression Read`
     * - `Response Compression Write`
     * - `Sanitize Read`
     * - `Sanitize Write`
     * - `Select Configuration Read`
     * - `Select Configuration Write`
     * - `Transform Rules Read`
     * - `Transform Rules Write`
     * - `Zone Transform Rules Read`
     * - `Zone Transform Rules Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getManagedTransforms(args: Endofunction[com.pulumi.cloudflare.inputs.GetManagedTransformsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetManagedTransformsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetManagedTransformsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getManagedTransforms(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Rulesets Read`
     * - `Account Rulesets Write`
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Bot Management Read`
     * - `Bot Management Write`
     * - `Cache Settings Read`
     * - `Cache Settings Write`
     * - `Config Settings Read`
     * - `Config Settings Write`
     * - `Custom Errors Read`
     * - `Custom Errors Write`
     * - `Dynamic URL Redirects Read`
     * - `Dynamic URL Redirects Write`
     * - `HTTP DDoS Managed Ruleset Read`
     * - `HTTP DDoS Managed Ruleset Write`
     * - `L4 DDoS Managed Ruleset Read`
     * - `L4 DDoS Managed Ruleset Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Magic Firewall Read`
     * - `Magic Firewall Write`
     * - `Managed headers Read`
     * - `Managed headers Write`
     * - `Mass URL Redirects Read`
     * - `Mass URL Redirects Write`
     * - `Origin Read`
     * - `Origin Write`
     * - `Response Compression Read`
     * - `Response Compression Write`
     * - `Sanitize Read`
     * - `Sanitize Write`
     * - `Select Configuration Read`
     * - `Select Configuration Write`
     * - `Transform Rules Read`
     * - `Transform Rules Write`
     * - `Zone Transform Rules Read`
     * - `Zone Transform Rules Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getManagedTransformsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetManagedTransformsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetManagedTransformsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetManagedTransformsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getManagedTransformsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMonetizationRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetMonetizationRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMonetizationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMonetizationRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMonetizationRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMonetizationRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMonetizationRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMonetizationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMonetizationRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMonetizationRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMoqRelay(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMoqRelayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelayArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelay(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMoqRelayPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMoqRelayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelayPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMoqRelays(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelaysArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMoqRelaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelaysArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelays(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMoqRelaysPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelaysPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMoqRelaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelaysPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelaysPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMtlsCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMtlsCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getMtlsCertificateAssociations(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMtlsCertificateAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificateAssociations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getMtlsCertificateAssociationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMtlsCertificateAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificateAssociationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getMtlsCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getMtlsCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     */
    inline def getNelSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetNelSettingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNelSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNelSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNelSetting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     */
    inline def getNelSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNelSettingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNelSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNelSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNelSettingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooks(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooksList(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooksList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooksListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooksListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClient(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOauthClientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClient(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClientPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOauthClientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClientPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClients(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOauthClientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClients(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClientsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOauthClientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClientsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOauthScopes(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthScopesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOauthScopesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthScopesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthScopes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOauthScopesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthScopesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOauthScopesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthScopesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthScopesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getObservatoryScheduledTest(args: Endofunction[com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetObservatoryScheduledTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getObservatoryScheduledTest(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getObservatoryScheduledTestPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetObservatoryScheduledTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getObservatoryScheduledTestPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganization(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganizationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOrganizationProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOrganizationProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOrganizationProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOrganizationProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganizations(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOrganizationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganizationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOrganizationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOriginCaCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCaCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOriginCaCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCaCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOriginCaCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCaCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOriginCaCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCaCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOriginCloudRegion(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCloudRegionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOriginCloudRegionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCloudRegionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOriginCloudRegions(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCloudRegionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOriginCloudRegionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCloudRegionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOriginTlsComplianceModes(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginTlsComplianceModesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginTlsComplianceModes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOriginTlsComplianceModesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginTlsComplianceModesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginTlsComplianceModesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getPageRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getPageRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldConnections(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnections(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldConnectionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnectionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldConnectionsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnectionsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldConnectionsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnectionsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldCookies(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldCookiesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldCookiesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldCookiesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookiesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldCookiesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldCookiesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookiesList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldCookiesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldCookiesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookiesListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldScripts(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldScriptsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScripts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldScriptsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldScriptsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScriptsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldScriptsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldScriptsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScriptsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Domain Page Shield`
     * - `Domain Page Shield Read`
     * - `Page Shield`
     * - `Page Shield Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getPageShieldScriptsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldScriptsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScriptsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomains(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomainsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProject(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesProjectResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProject(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProjectPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesProjectResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProjectPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProjects(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesProjectsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProjects(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProjectsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesProjectsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProjectsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipeline(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipeline(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelinePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelinePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelinePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelinePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSink(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineSinkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinkArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSink(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSinkPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineSinkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinkPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSinkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSinks(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineSinksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSinks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSinksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineSinksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSinksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStream(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStream(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStreamPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStreamPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStreams(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStreams(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStreamsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStreamsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getPrecursor(args: Endofunction[com.pulumi.cloudflare.inputs.GetPrecursorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPrecursorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPrecursorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPrecursor(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getPrecursorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPrecursorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPrecursorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPrecursorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPrecursorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueue(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueuePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueuePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueuePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumer(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueueConsumerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueueConsumerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueueConsumersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueueConsumersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueues(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueuesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueuesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueuesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueues(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueuesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueuesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueuesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueuesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueuesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getR2Bucket(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2Bucket(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getR2BucketPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getR2BucketCors(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketCorsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketCorsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketCorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketCors(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getR2BucketCorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketCorsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketCorsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketCorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketCorsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2BucketEventNotification(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketEventNotification(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2BucketEventNotificationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketEventNotificationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getR2BucketLifecycle(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLifecycleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketLifecycleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLifecycleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLifecycle(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getR2BucketLifecyclePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLifecyclePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketLifecycleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLifecyclePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLifecyclePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getR2BucketLock(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLockArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketLockResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLockArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLock(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getR2BucketLockPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLockPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketLockResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLockPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLockPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getR2BucketSippy(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketSippyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketSippyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketSippyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketSippy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getR2BucketSippyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketSippyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketSippyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketSippyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketSippyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2CustomDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2CustomDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2CustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2CustomDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2CustomDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2CustomDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2CustomDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2CustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2CustomDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2CustomDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Data Catalog Read`
     * - `Workers R2 Data Catalog Write`
     */
    inline def getR2DataCatalog(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2DataCatalogArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2DataCatalogResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2DataCatalogArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2DataCatalog(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Data Catalog Read`
     * - `Workers R2 Data Catalog Write`
     */
    inline def getR2DataCatalogPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2DataCatalogPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2DataCatalogResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2DataCatalogPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2DataCatalogPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getRateLimit(args: Endofunction[com.pulumi.cloudflare.inputs.GetRateLimitArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRateLimitResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRateLimitArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRateLimit(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getRateLimitPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRateLimitPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRateLimitResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRateLimitPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRateLimitPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnameArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRegionalHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnameArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostname(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostnamePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnamePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRegionalHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnamePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostnamePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostnames(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnamesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRegionalHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnamesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostnames(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostnamesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnamesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRegionalHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnamesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostnamesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getRegionalTieredCache(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalTieredCacheArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRegionalTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalTieredCacheArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalTieredCache(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getRegionalTieredCachePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalTieredCachePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRegionalTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalTieredCachePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalTieredCachePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetResourceGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetResourceGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetResourceGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetResourceGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getRuleset(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRulesetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRuleset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getRulesetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRulesetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRulesetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getRulesets(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRulesetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRulesets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getRulesetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRulesetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRulesetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettingsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettingsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettingsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettingsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemas(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemas(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemasPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemasPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemasList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemasList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemasListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemasListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStore(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStorePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStorePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStorePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecret(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecret(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecretPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecretPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecrets(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecrets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecretsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecretsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStores(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoresArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoresArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStores(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoresPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoresPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoresPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoresPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getShare(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShare(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getSharePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSharePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSharePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSharePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getShareRecipient(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareRecipientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipient(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getShareRecipientPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareRecipientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipientPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getShareRecipients(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareRecipientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipients(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getShareRecipientsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareRecipientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipientsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getShareResource(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareResourceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResource(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getShareResourcePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourcePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareResourceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourcePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResourcePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getShareResources(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourcesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareResourcesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourcesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResources(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getShareResourcesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourcesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareResourcesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourcesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResourcesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getShares(args: Endofunction[com.pulumi.cloudflare.inputs.GetSharesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSharesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSharesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShares(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getSharesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSharesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSharesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSharesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSharesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippet(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRulesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRulesList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRulesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRulesListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getSnippets(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getSnippetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getSnippetsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getSnippetsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplication(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSpectrumApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplication(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplicationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSpectrumApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplicationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplications(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSpectrumApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplications(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplicationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSpectrumApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplicationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumProtocols(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumProtocolsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSpectrumProtocolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumProtocolsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumProtocols(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumProtocolsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumProtocolsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSpectrumProtocolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumProtocolsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumProtocolsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnector(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSsoConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnector(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnectorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSsoConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnectorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnectors(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSsoConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnectors(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnectorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSsoConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnectorsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStream(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStream(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamAudioTrack(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamAudioTrackArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamAudioTrackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamAudioTrackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamAudioTrack(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamAudioTrackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamAudioTrackPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamAudioTrackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamAudioTrackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamAudioTrackPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamCaptionLanguage(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamCaptionLanguageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamCaptionLanguageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamCaptionLanguageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamCaptionLanguage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamCaptionLanguagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamCaptionLanguagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamCaptionLanguageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamCaptionLanguagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamCaptionLanguagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamDownload(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamDownloadArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamDownloadResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamDownloadArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamDownload(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamDownloadPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamDownloadPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamDownloadResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamDownloadPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamDownloadPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamKey(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamKeyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamKeyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamKeyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamLiveInput(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamLiveInputArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamLiveInputResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamLiveInputArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamLiveInput(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamLiveInputPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamLiveInputPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamLiveInputResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamLiveInputPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamLiveInputPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermark(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamWatermarkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarkArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermark(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermarkPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamWatermarkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarkPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermarkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermarks(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamWatermarksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermarks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermarksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamWatermarksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermarksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWebhook(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWebhookArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWebhookArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWebhook(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWebhookPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWebhookPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWebhookPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWebhookPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreams(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreams(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getTieredCache(args: Endofunction[com.pulumi.cloudflare.inputs.GetTieredCacheArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTieredCacheArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTieredCache(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getTieredCachePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTieredCachePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTieredCachePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTieredCachePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfigs(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfigsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfigsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRulesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRulesList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRulesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRulesListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getTotalTls(args: Endofunction[com.pulumi.cloudflare.inputs.GetTotalTlsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTotalTlsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTotalTlsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTotalTls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getTotalTlsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTotalTlsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTotalTlsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTotalTlsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTotalTlsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidget(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTurnstileWidgetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidget(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidgetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTurnstileWidgetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidgetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidgets(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTurnstileWidgetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidgets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidgetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTurnstileWidgetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidgetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getUniversalSslSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetUniversalSslSettingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUniversalSslSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUniversalSslSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUniversalSslSetting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getUniversalSslSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUniversalSslSettingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUniversalSslSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUniversalSslSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUniversalSslSettingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Rulesets Read`
     * - `Account Rulesets Write`
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Bot Management Read`
     * - `Bot Management Write`
     * - `Cache Settings Read`
     * - `Cache Settings Write`
     * - `Config Settings Read`
     * - `Config Settings Write`
     * - `Custom Errors Read`
     * - `Custom Errors Write`
     * - `Dynamic URL Redirects Read`
     * - `Dynamic URL Redirects Write`
     * - `HTTP DDoS Managed Ruleset Read`
     * - `HTTP DDoS Managed Ruleset Write`
     * - `L4 DDoS Managed Ruleset Read`
     * - `L4 DDoS Managed Ruleset Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Magic Firewall Read`
     * - `Magic Firewall Write`
     * - `Managed headers Read`
     * - `Managed headers Write`
     * - `Mass URL Redirects Read`
     * - `Mass URL Redirects Write`
     * - `Origin Read`
     * - `Origin Write`
     * - `Response Compression Read`
     * - `Response Compression Write`
     * - `Sanitize Read`
     * - `Sanitize Write`
     * - `Select Configuration Read`
     * - `Select Configuration Write`
     * - `Transform Rules Read`
     * - `Transform Rules Write`
     * - `Zone Transform Rules Read`
     * - `Zone Transform Rules Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getUrlNormalizationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUrlNormalizationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUrlNormalizationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Rulesets Read`
     * - `Account Rulesets Write`
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Bot Management Read`
     * - `Bot Management Write`
     * - `Cache Settings Read`
     * - `Cache Settings Write`
     * - `Config Settings Read`
     * - `Config Settings Write`
     * - `Custom Errors Read`
     * - `Custom Errors Write`
     * - `Dynamic URL Redirects Read`
     * - `Dynamic URL Redirects Write`
     * - `HTTP DDoS Managed Ruleset Read`
     * - `HTTP DDoS Managed Ruleset Write`
     * - `L4 DDoS Managed Ruleset Read`
     * - `L4 DDoS Managed Ruleset Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Magic Firewall Read`
     * - `Magic Firewall Write`
     * - `Managed headers Read`
     * - `Managed headers Write`
     * - `Mass URL Redirects Read`
     * - `Mass URL Redirects Write`
     * - `Origin Read`
     * - `Origin Write`
     * - `Response Compression Read`
     * - `Response Compression Write`
     * - `Sanitize Read`
     * - `Sanitize Write`
     * - `Select Configuration Read`
     * - `Select Configuration Write`
     * - `Transform Rules Read`
     * - `Transform Rules Write`
     * - `Zone Transform Rules Read`
     * - `Zone Transform Rules Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getUrlNormalizationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUrlNormalizationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUrlNormalizationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupMembers(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupMembersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserGroupMembersResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupMembersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupMembers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupMembersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupMembersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserGroupMembersResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupMembersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupMembersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getVulnerabilityScannerCredential(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredential(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getVulnerabilityScannerCredentialPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getVulnerabilityScannerCredentialSet(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getVulnerabilityScannerCredentialSetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getVulnerabilityScannerCredentialSets(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getVulnerabilityScannerCredentialSetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getVulnerabilityScannerCredentials(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentials(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getVulnerabilityScannerCredentialsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getVulnerabilityScannerTargetEnvironment(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getVulnerabilityScannerTargetEnvironmentPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getVulnerabilityScannerTargetEnvironments(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironments(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getVulnerabilityScannerTargetEnvironmentsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironmentsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoom(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoom(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEvent(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomEventResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEvent(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEventPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomEventResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEventPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEvents(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomEventsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEvents(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEventsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomEventsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEventsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Waiting Rooms Read`
     */
    inline def getWaitingRooms(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRooms(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Waiting Rooms Read`
     */
    inline def getWaitingRoomsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3Hostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnameArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWeb3HostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnameArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3Hostname(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3HostnamePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnamePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWeb3HostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnamePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3HostnamePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3Hostnames(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnamesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWeb3HostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnamesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3Hostnames(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3HostnamesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnamesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWeb3HostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnamesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3HostnamesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSite(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWebAnalyticsSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSite(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSitePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSitePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWebAnalyticsSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSitePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSitePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSites(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWebAnalyticsSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSites(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSitesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWebAnalyticsSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSitesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorker(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorker(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersion(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkerVersionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkerVersionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersions(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkerVersionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkerVersionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkers(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCronTrigger(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCronTriggerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersCronTriggerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCronTriggerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCronTrigger(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCronTriggerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCronTriggerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersCronTriggerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCronTriggerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCronTriggerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomains(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomainsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeployment(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersDeploymentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeployment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeploymentPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersDeploymentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeploymentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeployments(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersDeploymentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeployments(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeploymentsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersDeploymentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeploymentsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespace(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespaceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespacePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespaces(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespaces(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespacesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespacesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKv(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersKvResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKv(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersKvResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespace(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersKvNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespacePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersKvNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespacePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespaces(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersKvNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespaces(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespacesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersKvNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespacesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRouteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoute(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRoutePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoutePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRoutesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRoutesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoutes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoutesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRoutesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRoutesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoutesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScript(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersScriptResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScript(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersScriptResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptSubdomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersScriptSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptSubdomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptSubdomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersScriptSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptSubdomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScripts(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersScriptsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScripts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersScriptsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflow(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflow(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflowPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflowPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflows(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkflowsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflows(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflowsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkflowsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflowsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortal(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortal(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortalPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortalPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortals(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortals(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortalsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortalsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServer(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServers(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustAccessApplication(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplication(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustAccessApplicationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplicationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustAccessApplications(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplications(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustAccessApplicationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplicationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPage(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPageArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPage(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPagePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPages(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPages(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPagesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPagesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProvider(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProviderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProvider(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProviderPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProviderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProviderPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProviders(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProvidersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProviders(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProvidersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProvidersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProvidersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustAccessInfrastructureTarget(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTarget(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustAccessInfrastructureTargetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTargetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustAccessInfrastructureTargets(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTargets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustAccessInfrastructureTargetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTargetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessKeyConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessKeyConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessKeyConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessKeyConfigurationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessKeyConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessKeyConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsHostnameSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsHostnameSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsHostnameSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsHostnameSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsHostnameSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsHostnameSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceTokens(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceTokensPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustAccessTag(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTag(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustAccessTagPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTagPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustAccessTags(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTags(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustAccessTagsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTagsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustCasbIntegration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustCasbIntegrationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegrationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustCasbIntegrations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegrations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustCasbIntegrationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegrationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhook(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhook(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhookPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhookPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhooks(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhooksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhooks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhooksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhooksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhooksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustConnectivitySettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustConnectivitySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustConnectivitySettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustConnectivitySettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustConnectivitySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustConnectivitySettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceCustomProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceCustomProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceCustomProfileLocalDomainFallback(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfileLocalDomainFallback(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceCustomProfileLocalDomainFallbackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfileLocalDomainFallbackPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceCustomProfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfiles(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceCustomProfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfilesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceDefaultProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceDefaultProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getZeroTrustDeviceDefaultProfileCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileCertificatesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getZeroTrustDeviceDefaultProfileCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileCertificatesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceDefaultProfileLocalDomainFallback(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileLocalDomainFallback(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceDefaultProfileLocalDomainFallbackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileLocalDomainFallbackPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceDeploymentGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceDeploymentGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceDeploymentGroupsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroupsList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceDeploymentGroupsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroupsListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfiles(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfilesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceManagedNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceManagedNetworksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceManagedNetworksList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworksList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceManagedNetworksListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworksListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDevicePostureIntegration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDevicePostureIntegrationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegrationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDevicePostureIntegrations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegrations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDevicePostureIntegrationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegrationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDevicePostureRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDevicePostureRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDevicePostureRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDevicePostureRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustDeviceSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustDeviceSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     */
    inline def getZeroTrustDeviceSubnet(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSubnetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSubnet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     */
    inline def getZeroTrustDeviceSubnetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSubnetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSubnetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTest(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTest(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTestPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTestPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTests(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTests(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTestsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTestsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntries(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntry(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopic(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopic(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopicPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopicPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopics(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopics(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopicsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopicsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClass(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClass(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClassPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClassPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClasses(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClasses(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClassesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClassesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTag(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTag(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategories(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategories(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategoriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategoriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategory(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategory(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategoryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTags(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTags(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataset(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDatasetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDatasetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDatasets(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDatasets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDatasetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDatasetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntries(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntry(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntries(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntry(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntries(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntry(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevel(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevel(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelOrder(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelOrderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelOrder(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelOrderPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelOrderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelOrderPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevels(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocation(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayAppTypesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayAppTypesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayAppTypesList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayAppTypesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayAppTypesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayAppTypesListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayCategoriesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCategoriesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCategoriesList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayCategoriesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCategoriesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCategoriesListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayLogging(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayLogging(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayLoggingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayLoggingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfiles(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfilesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayProxyEndpoint(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpoint(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayProxyEndpointPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpointPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewayProxyEndpoints(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpoints(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewayProxyEndpointsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpointsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustGatewaySettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewaySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewaySettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustGatewaySettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewaySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewaySettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustList(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustListPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustLists(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustLists(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustListsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustListsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoute(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoutePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoutes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoutesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoutesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Revoke`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustOrganization(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Revoke`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustOrganizationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustOrganizationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustResourceLibraryApplication(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplication(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustResourceLibraryApplicationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplicationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustResourceLibraryApplications(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplications(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustResourceLibraryApplicationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplicationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustResourceLibraryCategories(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategories(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustResourceLibraryCategoriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategoriesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZeroTrustResourceLibraryCategory(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategory(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZeroTrustResourceLibraryCategoryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategoryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskBehavior(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustRiskBehaviorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskBehavior(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskBehaviorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustRiskBehaviorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskBehaviorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegrationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegrationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegrations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegrations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegrationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegrationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Read`
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflared(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflared(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Read`
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Read`
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Read`
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoute(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoutePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoutes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoutesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoutesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetwork(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetworkPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetworks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetworksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetworksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Read`
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflareds(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflareds(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Read`
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnector(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnector(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelWarpConnectorToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorToken(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelWarpConnectorTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorTokenPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectors(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectors(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     * - `Zone Zone Read`
     */
    inline def getZone(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZone(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     * - `Zone Zone Read`
     */
    inline def getZonePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZonePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZoneAutoOriginTlsKex(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneAutoOriginTlsKexResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneAutoOriginTlsKex(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZoneAutoOriginTlsKexPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneAutoOriginTlsKexResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneAutoOriginTlsKexPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheReserve(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheReserveArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneCacheReserveResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheReserveArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheReserve(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheReservePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheReservePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneCacheReserveResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheReservePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheReservePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheVariants(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheVariantsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneCacheVariantsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheVariantsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheVariants(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheVariantsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheVariantsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneCacheVariantsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheVariantsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheVariantsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone DNS Settings Read`
     * - `Zone DNS Settings Write`
     */
    inline def getZoneDnsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnsSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnsSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone DNS Settings Read`
     * - `Zone DNS Settings Write`
     */
    inline def getZoneDnsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnsSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnsSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getZoneDnssec(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnssecArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneDnssecResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnssecArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnssec(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getZoneDnssecPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnssecPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneDnssecResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnssecPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnssecPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneHold(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneHoldArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneHoldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneHoldArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneHold(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Revoke`
     * - `Access: Apps and Policies Write`
     * - `Access: Mutual TLS Certificates Write`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     * - `Analytics Read`
     * - `Apps Write`
     * - `Cache Purge`
     * - `DNS Read`
     * - `DNS Write`
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     * - `Logs Read`
     * - `Logs Write`
     * - `Page Rules Read`
     * - `Page Rules Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     * - `Stream Read`
     * - `Stream Write`
     * - `Trust and Safety Read`
     * - `Trust and Safety Write`
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     * - `Zero Trust: PII Read`
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneHoldPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneHoldPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneHoldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneHoldPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneHoldPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdown(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneLockdownResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdown(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdownPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneLockdownResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdownPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdowns(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneLockdownsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdowns(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdownsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneLockdownsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdownsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * 
     * ## Available Setting IDs
     * 
     * &lt;!-- BEGIN_ZONE_SETTING_IDS --&gt;
     * &lt;!-- This table is auto-generated by scripts/generate-zone-setting-ids from the OpenAPI spec. Do not edit manually. --&gt;
     * 
     * The following table lists all valid `settingId` values. Some settings may require a specific Cloudflare plan level. For more details, see the [API documentation](https://developers.cloudflare.com/api/resources/zones/subresources/settings/methods/list/).
     * 
     * | Setting ID | Value Type | Description |
     * |---|---|---|
     * | `0rtt` | `&#34;on&#34;` / `&#34;off&#34;` | 0-RTT session resumption enabled for this zone. |
     * | `advancedDdos` | `&#34;on&#34;` / `&#34;off&#34;` | Advanced protection from Distributed Denial of Service (DDoS) attacks on your... |
     * | `aegis` | Object | Aegis provides dedicated egress IPs (from Cloudflare to your origin) for your... |
     * | `alwaysOnline` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare serves limited copies of web pages available from th... |
     * | `alwaysUseHttps` | `&#34;on&#34;` / `&#34;off&#34;` | Reply to all requests for URLs that use &#34;http&#34; with a 301 redirect to the equ... |
     * | `automaticHttpsRewrites` | `&#34;on&#34;` / `&#34;off&#34;` | Enable the Automatic HTTPS Rewrites feature for this zone. |
     * | `automaticPlatformOptimization` | Object | [Automatic Platform Optimization for WordPress](https://developers.cloudflare... |
     * | `brotli` | `&#34;on&#34;` / `&#34;off&#34;` | When the client requesting an asset supports the Brotli compression algorithm... |
     * | `browserCacheTtl` | Number | Browser Cache TTL (in seconds) specifies how long Cloudflare-cached resources... |
     * | `browserCheck` | `&#34;on&#34;` / `&#34;off&#34;` | Browser Integrity Check is similar to Bad Behavior and looks for common HTTP ... |
     * | `cacheLevel` | `&#34;aggressive&#34;`, `&#34;basic&#34;`, `&#34;simplified&#34;` | Cache Level functions based off the setting level. The basic setting will cac... |
     * | `challengeTtl` | Number (14 values) | Specify how long a visitor is allowed access to your site after successfully ... |
     * | `ciphers` | Array of string | An allowlist of ciphers for TLS termination. These ciphers must be in the Bor... |
     * | `cnameFlattening` | `&#34;flattenAtRoot&#34;`, `&#34;flattenAll&#34;` | Whether or not cname flattening is on. |
     * | `contentConverter` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled and the client sends an Accept header requesting text/markdown, ... |
     * | `developmentMode` | `&#34;on&#34;` / `&#34;off&#34;` | Development Mode temporarily allows you to enter development mode for your we... |
     * | `earlyHints` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare will attempt to speed up overall page loads by servi... |
     * | `edgeCacheTtl` | Number (21 values) | Time (in seconds) that a resource will be ensured to remain on Cloudflare&#39;s c... |
     * | `emailObfuscation` | `&#34;on&#34;` / `&#34;off&#34;` | Encrypt email adresses on your web page from bots, while keeping them visible... |
     * | `h2Prioritization` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;custom&#34;` | HTTP/2 Edge Prioritization optimises the delivery of resources served through... |
     * | `hotlinkProtection` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, the Hotlink Protection option ensures that other sites cannot s... |
     * | `http2` | `&#34;on&#34;` / `&#34;off&#34;` | HTTP2 enabled for this zone. |
     * | `http3` | `&#34;on&#34;` / `&#34;off&#34;` | HTTP3 enabled for this zone. |
     * | `imageResizing` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;open&#34;` | Image Transformations provides on-demand resizing, conversion and optimizatio... |
     * | `ipGeolocation` | `&#34;on&#34;` / `&#34;off&#34;` | Enable IP Geolocation to have Cloudflare geolocate visitors to your website a... |
     * | `ipv6` | `&#34;on&#34;` / `&#34;off&#34;` | Enable IPv6 on all subdomains that are Cloudflare enabled.  (https://support.... |
     * | `maxUpload` | Number (26 values) | Maximum size of an allowable upload. |
     * | `minTlsVersion` | `&#34;1.0&#34;`, `&#34;1.1&#34;`, `&#34;1.2&#34;`, `&#34;1.3&#34;` | Only accepts HTTPS requests that use at least the TLS protocol version specif... |
     * | `mirage` | `&#34;on&#34;` / `&#34;off&#34;` | Automatically optimize image loading for website visitors on mobile devices. ... |
     * | `nel` | Object | Enable Network Error Logging reporting on your zone. (Beta) |
     * | `opportunisticEncryption` | `&#34;on&#34;` / `&#34;off&#34;` | Enables the Opportunistic Encryption feature for a zone. |
     * | `opportunisticOnion` | `&#34;on&#34;` / `&#34;off&#34;` | Add an Alt-Svc header to all legitimate requests from Tor, allowing the conne... |
     * | `orangeToOrange` | `&#34;on&#34;` / `&#34;off&#34;` | Orange to Orange (O2O) allows zones on Cloudflare to CNAME to other zones als... |
     * | `originErrorPagePassThru` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will proxy customer error pages on any 502,504 errors on origin se... |
     * | `originH2MaxStreams` | Number | Origin H2 Max Streams configures the max number of concurrent requests that C... |
     * | `originMaxHttpVersion` | `&#34;2&#34;`, `&#34;1&#34;` | Origin Max HTTP Setting Version sets the highest HTTP version Cloudflare will... |
     * | `polish` | `&#34;off&#34;`, `&#34;lossless&#34;`, `&#34;lossy&#34;` | Removes metadata and compresses your images for faster page load times. Basic... |
     * | `preRender` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare serves pre-rendered HTML to eligible search and AI c... |
     * | `prefetchPreload` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will prefetch any URLs that are included in the response headers. ... |
     * | `privacyPass` | `&#34;on&#34;` / `&#34;off&#34;` | Privacy Pass v1 was a browser extension developed by the Privacy Pass Team to... |
     * | `proxyReadTimeout` | Number | Maximum time between two read operations from origin. |
     * | `pseudoIpv4` | `&#34;off&#34;`, `&#34;addHeader&#34;`, `&#34;overwriteHeader&#34;` | The value set for the Pseudo IPv4 setting. |
     * | `redirectsForAiTraining` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare will redirect verified AI training crawlers to canon... |
     * | `replaceInsecureJs` | `&#34;on&#34;` / `&#34;off&#34;` | Automatically replace insecure JavaScript libraries with safer and faster alt... |
     * | `responseBuffering` | `&#34;on&#34;` / `&#34;off&#34;` | Enables or disables buffering of responses from the proxied server. Cloudflar... |
     * | `rocketLoader` | `&#34;on&#34;` / `&#34;off&#34;` | Rocket Loader is a general-purpose asynchronous JavaScript optimisation that ... |
     * | `searchForAgents` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare provisions an AI Search instance for the zone and ex... |
     * | `securityHeader` | Object | Cloudflare security header for a zone. |
     * | `securityLevel` | `&#34;off&#34;`, `&#34;essentiallyOff&#34;`, `&#34;low&#34;`, `&#34;medium&#34;`, `&#34;high&#34;`, `&#34;underAttack&#34;` | Choose the appropriate security profile for your website, which will automati... |
     * | `serverSideExclude` | `&#34;on&#34;` / `&#34;off&#34;` | If there is sensitive content on your website that you want visible to real v... |
     * | `sha1Support` | `&#34;on&#34;` / `&#34;off&#34;` | Allow SHA1 support. |
     * | `sortQueryStringForCache` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will treat files with the same query strings as the same file in c... |
     * | `ssl` | `&#34;off&#34;`, `&#34;flexible&#34;`, `&#34;full&#34;`, `&#34;strict&#34;` | SSL encrypts your visitor&#39;s connection and safeguards credit card numbers and... |
     * | `sslRecommender` | Uses `enabled` attr | Enrollment in the SSL/TLS Recommender service which tries to detect and recom... |
     * | `tls12Only` | `&#34;on&#34;` / `&#34;off&#34;` | Only allows TLS1.2. |
     * | `tls13` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;zrt&#34;` | Enables Crypto TLS 1.3 feature for a zone. |
     * | `tlsClientAuth` | `&#34;on&#34;` / `&#34;off&#34;` | TLS Client Auth requires Cloudflare to connect to your origin server using a ... |
     * | `transformations` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;open&#34;` | Media Transformations provides on-demand resizing, conversion and optimizatio... |
     * | `transformationsAllowedOrigins` | String | Media Transformations Allowed Origins restricts transformations for images an... |
     * | `trueClientIpHeader` | `&#34;on&#34;` / `&#34;off&#34;` | Allows customer to continue to use True Client IP (Akamai feature) in the hea... |
     * | `waf` | `&#34;on&#34;` / `&#34;off&#34;` | The WAF examines HTTP requests to your website.  It inspects both GET and POS... |
     * | `webmcpEnabled` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare injects the WebMCP bridge (bridge.js) into HTML resp... |
     * | `webmcpMcpUrl` | String | Optional per-zone path of the site&#39;s own MCP server, used by the WebMCP mcp-s... |
     * | `webmcpPacks` | String | Optional per-zone override of which bundled WebMCP tool packs the injected br... |
     * | `webp` | `&#34;on&#34;` / `&#34;off&#34;` | When the client requesting the image supports the WebP image codec, and WebP ... |
     * | `websockets` | `&#34;on&#34;` / `&#34;off&#34;` | WebSockets are open connections sustained between the client and the origin s... |
     * 
     * &lt;!-- END_ZONE_SETTING_IDS --&gt;
     */
    inline def getZoneSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSettingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSetting(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * 
     * ## Available Setting IDs
     * 
     * &lt;!-- BEGIN_ZONE_SETTING_IDS --&gt;
     * &lt;!-- This table is auto-generated by scripts/generate-zone-setting-ids from the OpenAPI spec. Do not edit manually. --&gt;
     * 
     * The following table lists all valid `settingId` values. Some settings may require a specific Cloudflare plan level. For more details, see the [API documentation](https://developers.cloudflare.com/api/resources/zones/subresources/settings/methods/list/).
     * 
     * | Setting ID | Value Type | Description |
     * |---|---|---|
     * | `0rtt` | `&#34;on&#34;` / `&#34;off&#34;` | 0-RTT session resumption enabled for this zone. |
     * | `advancedDdos` | `&#34;on&#34;` / `&#34;off&#34;` | Advanced protection from Distributed Denial of Service (DDoS) attacks on your... |
     * | `aegis` | Object | Aegis provides dedicated egress IPs (from Cloudflare to your origin) for your... |
     * | `alwaysOnline` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare serves limited copies of web pages available from th... |
     * | `alwaysUseHttps` | `&#34;on&#34;` / `&#34;off&#34;` | Reply to all requests for URLs that use &#34;http&#34; with a 301 redirect to the equ... |
     * | `automaticHttpsRewrites` | `&#34;on&#34;` / `&#34;off&#34;` | Enable the Automatic HTTPS Rewrites feature for this zone. |
     * | `automaticPlatformOptimization` | Object | [Automatic Platform Optimization for WordPress](https://developers.cloudflare... |
     * | `brotli` | `&#34;on&#34;` / `&#34;off&#34;` | When the client requesting an asset supports the Brotli compression algorithm... |
     * | `browserCacheTtl` | Number | Browser Cache TTL (in seconds) specifies how long Cloudflare-cached resources... |
     * | `browserCheck` | `&#34;on&#34;` / `&#34;off&#34;` | Browser Integrity Check is similar to Bad Behavior and looks for common HTTP ... |
     * | `cacheLevel` | `&#34;aggressive&#34;`, `&#34;basic&#34;`, `&#34;simplified&#34;` | Cache Level functions based off the setting level. The basic setting will cac... |
     * | `challengeTtl` | Number (14 values) | Specify how long a visitor is allowed access to your site after successfully ... |
     * | `ciphers` | Array of string | An allowlist of ciphers for TLS termination. These ciphers must be in the Bor... |
     * | `cnameFlattening` | `&#34;flattenAtRoot&#34;`, `&#34;flattenAll&#34;` | Whether or not cname flattening is on. |
     * | `contentConverter` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled and the client sends an Accept header requesting text/markdown, ... |
     * | `developmentMode` | `&#34;on&#34;` / `&#34;off&#34;` | Development Mode temporarily allows you to enter development mode for your we... |
     * | `earlyHints` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare will attempt to speed up overall page loads by servi... |
     * | `edgeCacheTtl` | Number (21 values) | Time (in seconds) that a resource will be ensured to remain on Cloudflare&#39;s c... |
     * | `emailObfuscation` | `&#34;on&#34;` / `&#34;off&#34;` | Encrypt email adresses on your web page from bots, while keeping them visible... |
     * | `h2Prioritization` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;custom&#34;` | HTTP/2 Edge Prioritization optimises the delivery of resources served through... |
     * | `hotlinkProtection` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, the Hotlink Protection option ensures that other sites cannot s... |
     * | `http2` | `&#34;on&#34;` / `&#34;off&#34;` | HTTP2 enabled for this zone. |
     * | `http3` | `&#34;on&#34;` / `&#34;off&#34;` | HTTP3 enabled for this zone. |
     * | `imageResizing` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;open&#34;` | Image Transformations provides on-demand resizing, conversion and optimizatio... |
     * | `ipGeolocation` | `&#34;on&#34;` / `&#34;off&#34;` | Enable IP Geolocation to have Cloudflare geolocate visitors to your website a... |
     * | `ipv6` | `&#34;on&#34;` / `&#34;off&#34;` | Enable IPv6 on all subdomains that are Cloudflare enabled.  (https://support.... |
     * | `maxUpload` | Number (26 values) | Maximum size of an allowable upload. |
     * | `minTlsVersion` | `&#34;1.0&#34;`, `&#34;1.1&#34;`, `&#34;1.2&#34;`, `&#34;1.3&#34;` | Only accepts HTTPS requests that use at least the TLS protocol version specif... |
     * | `mirage` | `&#34;on&#34;` / `&#34;off&#34;` | Automatically optimize image loading for website visitors on mobile devices. ... |
     * | `nel` | Object | Enable Network Error Logging reporting on your zone. (Beta) |
     * | `opportunisticEncryption` | `&#34;on&#34;` / `&#34;off&#34;` | Enables the Opportunistic Encryption feature for a zone. |
     * | `opportunisticOnion` | `&#34;on&#34;` / `&#34;off&#34;` | Add an Alt-Svc header to all legitimate requests from Tor, allowing the conne... |
     * | `orangeToOrange` | `&#34;on&#34;` / `&#34;off&#34;` | Orange to Orange (O2O) allows zones on Cloudflare to CNAME to other zones als... |
     * | `originErrorPagePassThru` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will proxy customer error pages on any 502,504 errors on origin se... |
     * | `originH2MaxStreams` | Number | Origin H2 Max Streams configures the max number of concurrent requests that C... |
     * | `originMaxHttpVersion` | `&#34;2&#34;`, `&#34;1&#34;` | Origin Max HTTP Setting Version sets the highest HTTP version Cloudflare will... |
     * | `polish` | `&#34;off&#34;`, `&#34;lossless&#34;`, `&#34;lossy&#34;` | Removes metadata and compresses your images for faster page load times. Basic... |
     * | `preRender` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare serves pre-rendered HTML to eligible search and AI c... |
     * | `prefetchPreload` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will prefetch any URLs that are included in the response headers. ... |
     * | `privacyPass` | `&#34;on&#34;` / `&#34;off&#34;` | Privacy Pass v1 was a browser extension developed by the Privacy Pass Team to... |
     * | `proxyReadTimeout` | Number | Maximum time between two read operations from origin. |
     * | `pseudoIpv4` | `&#34;off&#34;`, `&#34;addHeader&#34;`, `&#34;overwriteHeader&#34;` | The value set for the Pseudo IPv4 setting. |
     * | `redirectsForAiTraining` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare will redirect verified AI training crawlers to canon... |
     * | `replaceInsecureJs` | `&#34;on&#34;` / `&#34;off&#34;` | Automatically replace insecure JavaScript libraries with safer and faster alt... |
     * | `responseBuffering` | `&#34;on&#34;` / `&#34;off&#34;` | Enables or disables buffering of responses from the proxied server. Cloudflar... |
     * | `rocketLoader` | `&#34;on&#34;` / `&#34;off&#34;` | Rocket Loader is a general-purpose asynchronous JavaScript optimisation that ... |
     * | `searchForAgents` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare provisions an AI Search instance for the zone and ex... |
     * | `securityHeader` | Object | Cloudflare security header for a zone. |
     * | `securityLevel` | `&#34;off&#34;`, `&#34;essentiallyOff&#34;`, `&#34;low&#34;`, `&#34;medium&#34;`, `&#34;high&#34;`, `&#34;underAttack&#34;` | Choose the appropriate security profile for your website, which will automati... |
     * | `serverSideExclude` | `&#34;on&#34;` / `&#34;off&#34;` | If there is sensitive content on your website that you want visible to real v... |
     * | `sha1Support` | `&#34;on&#34;` / `&#34;off&#34;` | Allow SHA1 support. |
     * | `sortQueryStringForCache` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will treat files with the same query strings as the same file in c... |
     * | `ssl` | `&#34;off&#34;`, `&#34;flexible&#34;`, `&#34;full&#34;`, `&#34;strict&#34;` | SSL encrypts your visitor&#39;s connection and safeguards credit card numbers and... |
     * | `sslRecommender` | Uses `enabled` attr | Enrollment in the SSL/TLS Recommender service which tries to detect and recom... |
     * | `tls12Only` | `&#34;on&#34;` / `&#34;off&#34;` | Only allows TLS1.2. |
     * | `tls13` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;zrt&#34;` | Enables Crypto TLS 1.3 feature for a zone. |
     * | `tlsClientAuth` | `&#34;on&#34;` / `&#34;off&#34;` | TLS Client Auth requires Cloudflare to connect to your origin server using a ... |
     * | `transformations` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;open&#34;` | Media Transformations provides on-demand resizing, conversion and optimizatio... |
     * | `transformationsAllowedOrigins` | String | Media Transformations Allowed Origins restricts transformations for images an... |
     * | `trueClientIpHeader` | `&#34;on&#34;` / `&#34;off&#34;` | Allows customer to continue to use True Client IP (Akamai feature) in the hea... |
     * | `waf` | `&#34;on&#34;` / `&#34;off&#34;` | The WAF examines HTTP requests to your website.  It inspects both GET and POS... |
     * | `webmcpEnabled` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare injects the WebMCP bridge (bridge.js) into HTML resp... |
     * | `webmcpMcpUrl` | String | Optional per-zone path of the site&#39;s own MCP server, used by the WebMCP mcp-s... |
     * | `webmcpPacks` | String | Optional per-zone override of which bundled WebMCP tool packs the injected br... |
     * | `webp` | `&#34;on&#34;` / `&#34;off&#34;` | When the client requesting the image supports the WebP image codec, and WebP ... |
     * | `websockets` | `&#34;on&#34;` / `&#34;off&#34;` | WebSockets are open connections sustained between the client and the origin s... |
     * 
     * &lt;!-- END_ZONE_SETTING_IDS --&gt;
     */
    inline def getZoneSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSettingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSettingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getZoneSubscription(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSubscriptionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSubscriptionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSubscription(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getZoneSubscriptionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSubscriptionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSubscriptionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSubscriptionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZoneTracing(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneTracingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracing(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZoneTracingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneTracingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getZoneTracingRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingRulesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneTracingRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracingRules(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getZoneTracingRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingRulesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneTracingRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracingRulesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Zone Read`
     */
    inline def getZones(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZonesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZones(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Zone Read`
     */
    inline def getZonesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZonesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZonesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Read`
   * - `Cloudforce One Write`
   */
  inline def CloudforceOneRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequest(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Read`
   * - `Cloudforce One Write`
   */
  inline def CloudforceOneRequestAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestAssetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestAssetArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequestAsset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Write`
   */
  inline def CloudforceOneRequestMessage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestMessageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestMessageArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequestMessage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Read`
   * - `Cloudforce One Write`
   */
  inline def CloudforceOneRequestPriority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestPriorityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestPriorityArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequestPriority(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ConnectivityDirectoryService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ConnectivityDirectoryService(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  inline def ContentScanning(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ContentScanningArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ContentScanningArgs.builder
    com.pulumi.cloudflare.ContentScanning(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Write`
   * - `Zone WAF Write`
   */
  inline def ContentScanningExpression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ContentScanningExpressionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ContentScanningExpressionArgs.builder
    com.pulumi.cloudflare.ContentScanningExpression(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def CtAlerting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CtAlertingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CtAlertingArgs.builder
    com.pulumi.cloudflare.CtAlerting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account: SSL and Certificates Read`
   * - `Account: SSL and Certificates Write`
   */
  inline def CustomCsr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomCsrArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CustomCsrArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CustomCsr(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def CustomHostname(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomHostnameArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomHostnameArgs.builder
    com.pulumi.cloudflare.CustomHostname(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def CustomHostnameFallbackOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomHostnameFallbackOriginArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomHostnameFallbackOriginArgs.builder
    com.pulumi.cloudflare.CustomHostnameFallbackOrigin(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def CustomOriginTrustStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomOriginTrustStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomOriginTrustStoreArgs.builder
    com.pulumi.cloudflare.CustomOriginTrustStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def CustomPageAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomPageAssetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CustomPageAssetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CustomPageAsset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Custom Pages Read`
   * - `Account Custom Pages Write`
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Zero Trust: PII Read`
   */
  inline def CustomPages(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomPagesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomPagesArgs.builder
    com.pulumi.cloudflare.CustomPages(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def CustomSsl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomSslArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomSslArgs.builder
    com.pulumi.cloudflare.CustomSsl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `D1 Read`
   * - `D1 Write`
   * 
   * &gt; When a D1 Database is replaced all the data is lost. Please ensure you have a
   *    backup of your data before replacing a D1 Database.
   */
  inline def D1Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.D1DatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.D1DatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.D1Database(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/devicemanagednetworks.DeviceManagedNetworks has been deprecated in favor of cloudflare.index/zerotrustdevicemanagednetworks.ZeroTrustDeviceManagedNetworks") inline def DeviceManagedNetworks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DeviceManagedNetworksArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DeviceManagedNetworksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DeviceManagedNetworks(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/devicepostureintegration.DevicePostureIntegration has been deprecated in favor of cloudflare.index/zerotrustdevicepostureintegration.ZeroTrustDevicePostureIntegration") inline def DevicePostureIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DevicePostureIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DevicePostureIntegrationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DevicePostureIntegration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/deviceposturerule.DevicePostureRule has been deprecated in favor of cloudflare.index/zerotrustdeviceposturerule.ZeroTrustDevicePostureRule") inline def DevicePostureRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DevicePostureRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DevicePostureRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DevicePostureRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/dlpcustomprofile.DlpCustomProfile has been deprecated in favor of cloudflare.index/zerotrustdlpcustomprofile.ZeroTrustDlpCustomProfile") inline def DlpCustomProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DlpCustomProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DlpCustomProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DlpCustomProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/dlppredefinedprofile.DlpPredefinedProfile has been deprecated in favor of cloudflare.index/zerotrustdlppredefinedprofile.ZeroTrustDlpPredefinedProfile") inline def DlpPredefinedProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DlpPredefinedProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.DlpPredefinedProfileArgs.builder
    com.pulumi.cloudflare.DlpPredefinedProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DLS: Read`
   * - `DLS: Write`
   * - `IP Prefixes: Write`
   */
  inline def DlsPrefixBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DlsPrefixBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.DlsPrefixBindingArgs.builder
    com.pulumi.cloudflare.DlsPrefixBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Firewall Read`
   * - `DNS Firewall Write`
   */
  inline def DnsFirewall(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsFirewallArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsFirewallArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsFirewall(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  inline def DnsRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsRecordArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsRecordArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsRecord(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  inline def DnsZoneTransfersAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersAclArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersAclArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersAcl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def DnsZoneTransfersIncoming(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersIncomingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersIncomingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersIncoming(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def DnsZoneTransfersOutgoing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersOutgoingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersOutgoingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersOutgoing(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  inline def DnsZoneTransfersPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersPeerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersPeerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersPeer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  inline def DnsZoneTransfersTsig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersTsigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersTsigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersTsig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Email Routing Addresses Read`
   * - `Email Routing Addresses Write`
   */
  inline def EmailRoutingAddress(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingAddressArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailRoutingAddressArgs.builder
    com.pulumi.cloudflare.EmailRoutingAddress(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Email Routing Rules Read`
   * - `Email Routing Rules Write`
   */
  inline def EmailRoutingCatchAll(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingCatchAllArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailRoutingCatchAllArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailRoutingCatchAll(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  inline def EmailRoutingDns(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingDnsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailRoutingDnsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailRoutingDns(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Email Routing Rules Read`
   * - `Email Routing Rules Write`
   */
  inline def EmailRoutingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailRoutingRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailRoutingRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  inline def EmailRoutingSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailRoutingSettingsArgs.builder
    com.pulumi.cloudflare.EmailRoutingSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  inline def EmailSecurityAllowPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityAllowPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityAllowPolicyArgs.builder
    com.pulumi.cloudflare.EmailSecurityAllowPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  inline def EmailSecurityBlockSender(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityBlockSenderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityBlockSenderArgs.builder
    com.pulumi.cloudflare.EmailSecurityBlockSender(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  inline def EmailSecurityDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityDomainArgs.builder
    com.pulumi.cloudflare.EmailSecurityDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  inline def EmailSecurityImpersonationRegistry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityImpersonationRegistryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailSecurityImpersonationRegistryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailSecurityImpersonationRegistry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  inline def EmailSecurityTrustedDomains(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityTrustedDomainsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityTrustedDomainsArgs.builder
    com.pulumi.cloudflare.EmailSecurityTrustedDomains(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def EmailSendingSubdomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSendingSubdomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailSendingSubdomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailSendingSubdomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def FieldExtractor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.FieldExtractorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FieldExtractorArgs.builder
    com.pulumi.cloudflare.FieldExtractor(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * 
   * &gt; `cloudflare.Filter` is in a deprecation phase until June 15th, 2025.
   *   During this time period, this resource is still fully
   *   supported but you are strongly advised to move to the
   *   `cloudflare.Ruleset` resource. Full details can be found in the
   *   developer documentation.
   */
  inline def Filter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.FilterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FilterArgs.builder
    com.pulumi.cloudflare.Filter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * 
   * &gt; `cloudflare.FirewallRule` is in a deprecation phase until June 15th, 2025.
   *   During this time period, this resource is still
   *   fully supported but you are strongly advised  to move to the
   *   `cloudflare.Ruleset` resource. Full details can be found in the
   *   developer documentation.
   */
  inline def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.FirewallRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FirewallRuleArgs.builder
    com.pulumi.cloudflare.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Flagship Read`
   * - `Flagship Write`
   */
  inline def FlagshipApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.FlagshipAppArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.FlagshipAppArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.FlagshipApp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Flagship Read`
   * - `Flagship Write`
   */
  inline def FlagshipFlag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.FlagshipFlagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FlagshipFlagArgs.builder
    com.pulumi.cloudflare.FlagshipFlag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zaraz Admin`
   * - `Zaraz Edit`
   * - `Zaraz Read`
   */
  inline def GoogleTagGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.GoogleTagGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.GoogleTagGatewayArgs.builder
    com.pulumi.cloudflare.GoogleTagGateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Health Checks Read`
   * - `Health Checks Write`
   */
  inline def Healthcheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.HealthcheckArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.HealthcheckArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Healthcheck(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Write`
   */
  inline def HostnameTlsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.HostnameTlsSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.HostnameTlsSettingArgs.builder
    com.pulumi.cloudflare.HostnameTlsSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Hyperdrive Read`
   * - `Hyperdrive Write`
   */
  inline def HyperdriveConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.HyperdriveConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.HyperdriveConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.HyperdriveConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Images Read`
   * - `Images Write`
   * 
   * &gt; Set either `file` (base64-encoded image data, e.g. from
   *   `filebase64`)
   *   or `url` (fetched server-side), not both.
   * 
   * &gt; `requireSignedUrls = true` is rejected for images with a custom `id` (API
   *   error 5410). Since `id` is required here, leave it unset or `false`.
   * 
   * ## Import
   * 
   * ```sh
   * \$ pulumi import cloudflare:index/image:Image example &#39;&lt;account_id&gt;/&lt;image_id&gt;&#39;
   * ```
   */
  inline def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ImageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ImageArgs.builder
    com.pulumi.cloudflare.Image(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Images Read`
   * - `Images Write`
   */
  inline def ImageVariant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ImageVariantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ImageVariantArgs.builder
    com.pulumi.cloudflare.ImageVariant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Revoke`
   * - `Access: Apps and Policies Write`
   * - `Access: Mutual TLS Certificates Write`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   * - `Analytics Read`
   * - `Apps Write`
   * - `Cache Purge`
   * - `DNS Read`
   * - `DNS Write`
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * - `Load Balancers Read`
   * - `Load Balancers Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Page Rules Read`
   * - `Page Rules Write`
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   * - `Stream Read`
   * - `Stream Write`
   * - `Trust and Safety Read`
   * - `Trust and Safety Write`
   * - `Workers Routes Read`
   * - `Workers Routes Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Zaraz Admin`
   * - `Zaraz Edit`
   * - `Zaraz Read`
   * - `Zero Trust: PII Read`
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def KeylessCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.KeylessCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.KeylessCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.KeylessCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  inline def LeakedCredentialCheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LeakedCredentialCheckArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LeakedCredentialCheckArgs.builder
    com.pulumi.cloudflare.LeakedCredentialCheck(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  inline def LeakedCredentialCheckRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LeakedCredentialCheckRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LeakedCredentialCheckRuleArgs.builder
    com.pulumi.cloudflare.LeakedCredentialCheckRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Filter Lists Edit`
   * - `Account Filter Lists Read`
   * 
   * &gt; The `cloudflare.List` resource supports defining list items in line with the
   *   `items` attribute. The provider also has a `cloudflare.ListItem` resource for
   *   managing items as independent resources. Using both in line `items` definitions
   *   _and_ `cloudflare.getListItems` on the same list is not supported and will cause
   *   Terraform into an irreconcilable state.
   */
  inline def List(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ListArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.List(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Filter Lists Edit`
   * - `Account Filter Lists Read`
   */
  inline def ListItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ListItemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ListItemArgs.builder
    com.pulumi.cloudflare.ListItem(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Load Balancers Read`
   * - `Load Balancers Write`
   */
  inline def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.LoadBalancerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.LoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Load Balancing: Monitors and Pools Read`
   * - `Load Balancing: Monitors and Pools Write`
   */
  inline def LoadBalancerMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerMonitorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LoadBalancerMonitorArgs.builder
    com.pulumi.cloudflare.LoadBalancerMonitor(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def LoadBalancerMonitorGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerMonitorGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LoadBalancerMonitorGroupArgs.builder
    com.pulumi.cloudflare.LoadBalancerMonitorGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Load Balancing: Monitors and Pools Read`
   * - `Load Balancing: Monitors and Pools Write`
   */
  inline def LoadBalancerPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.LoadBalancerPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.LoadBalancerPool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Logs Read`
   * - `Logs Write`
   */
  inline def LogpullRetention(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LogpullRetentionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LogpullRetentionArgs.builder
    com.pulumi.cloudflare.LogpullRetention(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Logs Write`
   */
  inline def LogpushJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LogpushJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.LogpushJobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.LogpushJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Logs Write`
   */
  inline def LogpushOwnershipChallenge(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.LogpushOwnershipChallengeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LogpushOwnershipChallengeArgs.builder
    com.pulumi.cloudflare.LogpushOwnershipChallenge(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Network Monitoring Admin`
   * - `Magic Network Monitoring Config Read`
   * - `Magic Network Monitoring Config Write`
   */
  inline def MagicNetworkMonitoringConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicNetworkMonitoringConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicNetworkMonitoringConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicNetworkMonitoringConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Network Monitoring Admin`
   * - `Magic Network Monitoring Config Read`
   * - `Magic Network Monitoring Config Write`
   */
  inline def MagicNetworkMonitoringRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicNetworkMonitoringRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicNetworkMonitoringRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicNetworkMonitoringRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  inline def MagicTransitCf1Site(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitCf1SiteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitCf1SiteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitCf1Site(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MagicTransitConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.MagicTransitConnectorArgs.builder
    com.pulumi.cloudflare.MagicTransitConnector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  inline def MagicTransitSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSite(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  inline def MagicTransitSiteAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteAclArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteAclArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSiteAcl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  inline def MagicTransitSiteLan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteLanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteLanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSiteLan(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  inline def MagicTransitSiteWan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteWanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteWanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSiteWan(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MagicWanBgpFilterProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanBgpFilterProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicWanBgpFilterProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicWanBgpFilterProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MagicWanGreTunnel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanGreTunnelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicWanGreTunnelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicWanGreTunnel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MagicWanIpsecTunnel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicWanIpsecTunnel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MagicWanStaticRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanStaticRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.MagicWanStaticRouteArgs.builder
    com.pulumi.cloudflare.MagicWanStaticRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Rulesets Read`
   * - `Account Rulesets Write`
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Bot Management Read`
   * - `Bot Management Write`
   * - `Cache Settings Read`
   * - `Cache Settings Write`
   * - `Config Settings Read`
   * - `Config Settings Write`
   * - `Custom Errors Read`
   * - `Custom Errors Write`
   * - `Dynamic URL Redirects Read`
   * - `Dynamic URL Redirects Write`
   * - `HTTP DDoS Managed Ruleset Read`
   * - `HTTP DDoS Managed Ruleset Write`
   * - `L4 DDoS Managed Ruleset Read`
   * - `L4 DDoS Managed Ruleset Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Magic Firewall Read`
   * - `Magic Firewall Write`
   * - `Managed headers Read`
   * - `Managed headers Write`
   * - `Mass URL Redirects Read`
   * - `Mass URL Redirects Write`
   * - `Origin Read`
   * - `Origin Write`
   * - `Response Compression Read`
   * - `Response Compression Write`
   * - `Sanitize Read`
   * - `Sanitize Write`
   * - `Select Configuration Read`
   * - `Select Configuration Write`
   * - `Transform Rules Read`
   * - `Transform Rules Write`
   * - `Zone Transform Rules Read`
   * - `Zone Transform Rules Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  @deprecated("cloudflare.index/managedheaders.ManagedHeaders has been deprecated in favor of cloudflare.index/managedtransforms.ManagedTransforms") inline def ManagedHeaders(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ManagedHeadersArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ManagedHeadersArgs.builder
    com.pulumi.cloudflare.ManagedHeaders(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Rulesets Read`
   * - `Account Rulesets Write`
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Bot Management Read`
   * - `Bot Management Write`
   * - `Cache Settings Read`
   * - `Cache Settings Write`
   * - `Config Settings Read`
   * - `Config Settings Write`
   * - `Custom Errors Read`
   * - `Custom Errors Write`
   * - `Dynamic URL Redirects Read`
   * - `Dynamic URL Redirects Write`
   * - `HTTP DDoS Managed Ruleset Read`
   * - `HTTP DDoS Managed Ruleset Write`
   * - `L4 DDoS Managed Ruleset Read`
   * - `L4 DDoS Managed Ruleset Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Magic Firewall Read`
   * - `Magic Firewall Write`
   * - `Managed headers Read`
   * - `Managed headers Write`
   * - `Mass URL Redirects Read`
   * - `Mass URL Redirects Write`
   * - `Origin Read`
   * - `Origin Write`
   * - `Response Compression Read`
   * - `Response Compression Write`
   * - `Sanitize Read`
   * - `Sanitize Write`
   * - `Select Configuration Read`
   * - `Select Configuration Write`
   * - `Transform Rules Read`
   * - `Transform Rules Write`
   * - `Zone Transform Rules Read`
   * - `Zone Transform Rules Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  inline def ManagedTransforms(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ManagedTransformsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ManagedTransformsArgs.builder
    com.pulumi.cloudflare.ManagedTransforms(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MonetizationRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MonetizationRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.MonetizationRulesArgs.builder
    com.pulumi.cloudflare.MonetizationRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MoqRelay(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MoqRelayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MoqRelayArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MoqRelay(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def MtlsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.MtlsCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MtlsCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MtlsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  inline def NelSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.NelSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.NelSettingArgs.builder
    com.pulumi.cloudflare.NelSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Notifications Read`
   * - `Notifications Write`
   * - `Zero Trust: PII Read`
   */
  inline def NotificationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.NotificationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.NotificationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.NotificationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Notifications Read`
   * - `Notifications Write`
   * - `Zero Trust: PII Read`
   */
  inline def NotificationPolicyWebhooks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.NotificationPolicyWebhooksArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.NotificationPolicyWebhooksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.NotificationPolicyWebhooks(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `OAuth Client Read`
   * - `OAuth Client Write`
   */
  inline def OauthClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.OauthClientArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OauthClientArgs.builder
    com.pulumi.cloudflare.OauthClient(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  inline def ObservatoryScheduledTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ObservatoryScheduledTestArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ObservatoryScheduledTestArgs.builder
    com.pulumi.cloudflare.ObservatoryScheduledTest(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `User Details Write`
   */
  inline def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.OrganizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.OrganizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Organization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def OrganizationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.OrganizationProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OrganizationProfileArgs.builder
    com.pulumi.cloudflare.OrganizationProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def OriginCaCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.OriginCaCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OriginCaCertificateArgs.builder
    com.pulumi.cloudflare.OriginCaCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def OriginCloudRegion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.OriginCloudRegionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OriginCloudRegionArgs.builder
    com.pulumi.cloudflare.OriginCloudRegion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def OriginTlsComplianceModes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.OriginTlsComplianceModesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OriginTlsComplianceModesArgs.builder
    com.pulumi.cloudflare.OriginTlsComplianceModes(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Revoke`
   * - `Access: Apps and Policies Write`
   * - `Access: Mutual TLS Certificates Write`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   * - `Analytics Read`
   * - `Apps Write`
   * - `Cache Purge`
   * - `DNS Read`
   * - `DNS Write`
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * - `Load Balancers Read`
   * - `Load Balancers Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Page Rules Read`
   * - `Page Rules Write`
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   * - `Stream Read`
   * - `Stream Write`
   * - `Trust and Safety Read`
   * - `Trust and Safety Write`
   * - `Workers Routes Read`
   * - `Workers Routes Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Zaraz Admin`
   * - `Zaraz Edit`
   * - `Zaraz Read`
   * - `Zero Trust: PII Read`
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def PageRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PageRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.PageRuleArgs.builder
    com.pulumi.cloudflare.PageRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Domain Page Shield`
   * - `Domain Page Shield Read`
   * - `Page Shield`
   * - `Page Shield Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * 
   * ## Import
   * 
   * ```sh
   * \$ pulumi import cloudflare:index/pageShieldPolicy:PageShieldPolicy example &#39;&lt;zone_id&gt;/&lt;policy_id&gt;&#39;
   * ```
   */
  inline def PageShieldPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PageShieldPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.PageShieldPolicyArgs.builder
    com.pulumi.cloudflare.PageShieldPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Pages Read`
   * - `Pages Write`
   * 
   * &gt; A DNS record for the domain is not automatically created. You need to create
   *    a `cloudflareRecord` resource for the domain you want to use.
   */
  inline def PagesDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PagesDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PagesDomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PagesDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Pages Read`
   * - `Pages Write`
   * 
   * &gt; If you are using a `source` block configuration, you must first have a
   *    connected GitHub or GitLab account connected to Cloudflare. See the
   *    [Getting Started with Pages](https://developers.cloudflare.com/pages/get-started/git-integration/)
   *    documentation on how to link your accounts.
   */
  inline def PagesProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PagesProjectArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PagesProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PagesProject(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Pipelines Read`
   * - `Pipelines Write`
   */
  inline def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PipelineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Pipelines Read`
   * - `Pipelines Write`
   */
  inline def PipelineSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PipelineSinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PipelineSinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PipelineSink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Pipelines Read`
   * - `Pipelines Write`
   */
  inline def PipelineStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PipelineStreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PipelineStreamArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PipelineStream(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def Precursor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.PrecursorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.PrecursorArgs.builder
    com.pulumi.cloudflare.Precursor(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The provider type for the cloudflare package. By default, resources use package-wide configuration
   * settings, however an explicit `Provider` instance may be created and passed during resource
   * construction to achieve fine-grained programmatic control over provider settings. See the
   * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
   */
  inline def Provider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ProviderArgs.builder
    com.pulumi.cloudflare.Provider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Queues Read`
   * - `Queues Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  inline def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.QueueArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.QueueArgs.builder
    com.pulumi.cloudflare.Queue(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Queues Read`
   * - `Queues Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  inline def QueueConsumer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.QueueConsumerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.QueueConsumerArgs.builder
    com.pulumi.cloudflare.QueueConsumer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Write`
   */
  inline def R2Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.R2BucketArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.R2Bucket(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def R2BucketCors(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketCorsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketCorsArgs.builder
    com.pulumi.cloudflare.R2BucketCors(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Read`
   * - `Workers R2 Storage Write`
   */
  inline def R2BucketEventNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketEventNotificationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketEventNotificationArgs.builder
    com.pulumi.cloudflare.R2BucketEventNotification(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def R2BucketLifecycle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketLifecycleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketLifecycleArgs.builder
    com.pulumi.cloudflare.R2BucketLifecycle(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def R2BucketLock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketLockArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketLockArgs.builder
    com.pulumi.cloudflare.R2BucketLock(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Write`
   */
  inline def R2BucketSippy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketSippyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketSippyArgs.builder
    com.pulumi.cloudflare.R2BucketSippy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Read`
   * - `Workers R2 Storage Write`
   */
  inline def R2CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2CustomDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2CustomDomainArgs.builder
    com.pulumi.cloudflare.R2CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Data Catalog Read`
   * - `Workers R2 Data Catalog Write`
   */
  inline def R2DataCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2DataCatalogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2DataCatalogArgs.builder
    com.pulumi.cloudflare.R2DataCatalog(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def R2ManagedDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.R2ManagedDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2ManagedDomainArgs.builder
    com.pulumi.cloudflare.R2ManagedDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * 
   * &gt; `cloudflare.RateLimit` is in a deprecation phase until June 15th, 2025.
   *   During this time period, this resource is still
   *   fully supported but you are strongly advised to move to the
   *   `cloudflare.Ruleset` resource. Full details can be found in the
   *   developer documentation.
   */
  inline def RateLimit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.RateLimitArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RateLimitArgs.builder
    com.pulumi.cloudflare.RateLimit(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  @deprecated("cloudflare.index/record.Record has been deprecated in favor of cloudflare.index/dnsrecord.DnsRecord") inline def Record(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.RecordArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.RecordArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Record(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  inline def RegionalHostname(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.RegionalHostnameArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RegionalHostnameArgs.builder
    com.pulumi.cloudflare.RegionalHostname(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def RegionalTieredCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.RegionalTieredCacheArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RegionalTieredCacheArgs.builder
    com.pulumi.cloudflare.RegionalTieredCache(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/riskbehavior.RiskBehavior has been deprecated in favor of cloudflare.index/zerotrustriskbehavior.ZeroTrustRiskBehavior") inline def RiskBehavior(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.RiskBehaviorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RiskBehaviorArgs.builder
    com.pulumi.cloudflare.RiskBehavior(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def Ruleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.RulesetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.RulesetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Ruleset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  inline def SchemaValidationOperationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SchemaValidationOperationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SchemaValidationOperationSettingsArgs.builder
    com.pulumi.cloudflare.SchemaValidationOperationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  inline def SchemaValidationSchemas(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SchemaValidationSchemasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.SchemaValidationSchemasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.SchemaValidationSchemas(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  inline def SchemaValidationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SchemaValidationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SchemaValidationSettingsArgs.builder
    com.pulumi.cloudflare.SchemaValidationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Secrets Store Read`
   * - `Secrets Store Write`
   */
  inline def SecretsStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SecretsStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.SecretsStoreArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.SecretsStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Secrets Store Read`
   * - `Secrets Store Write`
   */
  inline def SecretsStoreSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SecretsStoreSecretArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.SecretsStoreSecretArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.SecretsStoreSecret(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def Share(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ShareArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ShareArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Share(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ShareRecipient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ShareRecipientArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ShareRecipientArgs.builder
    com.pulumi.cloudflare.ShareRecipient(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ShareResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ShareResourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ShareResourceArgs.builder
    com.pulumi.cloudflare.ShareResource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Snippets Read`
   * - `Snippets Write`
   */
  inline def Snippet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SnippetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SnippetArgs.builder
    com.pulumi.cloudflare.Snippet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Snippets Read`
   * - `Snippets Write`
   */
  inline def SnippetRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SnippetRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SnippetRulesArgs.builder
    com.pulumi.cloudflare.SnippetRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ## Import
   * 
   * &gt; This resource does not currently support `pulumi import`.
   */
  inline def Snippets(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SnippetsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SnippetsArgs.builder
    com.pulumi.cloudflare.Snippets(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  inline def SpectrumApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SpectrumApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SpectrumApplicationArgs.builder
    com.pulumi.cloudflare.SpectrumApplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSO Connector Read`
   * - `SSO Connector Write`
   */
  inline def SsoConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.SsoConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SsoConnectorArgs.builder
    com.pulumi.cloudflare.SsoConnector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  @deprecated("cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute") inline def StaticRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StaticRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StaticRouteArgs.builder
    com.pulumi.cloudflare.StaticRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamArgs.builder
    com.pulumi.cloudflare.Stream(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamAudioTrack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamAudioTrackArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamAudioTrackArgs.builder
    com.pulumi.cloudflare.StreamAudioTrack(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamCaptionLanguage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamCaptionLanguageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamCaptionLanguageArgs.builder
    com.pulumi.cloudflare.StreamCaptionLanguage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamDownload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamDownloadArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamDownloadArgs.builder
    com.pulumi.cloudflare.StreamDownload(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamKeyArgs.builder
    com.pulumi.cloudflare.StreamKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamLiveInput(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamLiveInputArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamLiveInputArgs.builder
    com.pulumi.cloudflare.StreamLiveInput(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamWatermark(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamWatermarkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.StreamWatermarkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.StreamWatermark(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  inline def StreamWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamWebhookArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamWebhookArgs.builder
    com.pulumi.cloudflare.StreamWebhook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  @deprecated("cloudflare.index/teamsaccount.TeamsAccount has been deprecated in favor of cloudflare.index/zerotrustgatewaysettings.ZeroTrustGatewaySettings") inline def TeamsAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TeamsAccountArgs.builder
    com.pulumi.cloudflare.TeamsAccount(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  @deprecated("cloudflare.index/teamslist.TeamsList has been deprecated in favor of cloudflare.index/zerotrustlist.ZeroTrustList") inline def TeamsList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsListArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsList(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare Zero Trust Secure DNS Locations Write`
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation") inline def TeamsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsLocationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsLocationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsLocation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  @deprecated("cloudflare.index/teamsproxyendpoint.TeamsProxyEndpoint has been deprecated in favor of cloudflare.index/zerotrustgatewayproxyendpoint.ZeroTrustGatewayProxyEndpoint") inline def TeamsProxyEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsProxyEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsProxyEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsProxyEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  @deprecated("cloudflare.index/teamsrule.TeamsRule has been deprecated in favor of cloudflare.index/zerotrustgatewaypolicy.ZeroTrustGatewayPolicy") inline def TeamsRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def TieredCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TieredCacheArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TieredCacheArgs.builder
    com.pulumi.cloudflare.TieredCache(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  inline def TokenValidationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TokenValidationConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TokenValidationConfigArgs.builder
    com.pulumi.cloudflare.TokenValidationConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  inline def TokenValidationRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TokenValidationRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TokenValidationRulesArgs.builder
    com.pulumi.cloudflare.TokenValidationRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def TotalTls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TotalTlsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TotalTlsArgs.builder
    com.pulumi.cloudflare.TotalTls(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: cloudflared Read`
   * - `Cloudflare One Connector: cloudflared Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   * - `Cloudflare Tunnel Read`
   * - `Cloudflare Tunnel Write`
   */
  @deprecated("cloudflare.index/tunnel.Tunnel has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflared.ZeroTrustTunnelCloudflared") inline def Tunnel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TunnelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Tunnel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: cloudflared Read`
   * - `Cloudflare One Connector: cloudflared Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   * - `Cloudflare Tunnel Read`
   * - `Cloudflare Tunnel Write`
   */
  @deprecated("cloudflare.index/tunnelconfig.TunnelConfig has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflaredconfig.ZeroTrustTunnelCloudflaredConfig") inline def TunnelConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TunnelConfigArgs.builder
    com.pulumi.cloudflare.TunnelConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  @deprecated("cloudflare.index/tunnelroute.TunnelRoute has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflaredroute.ZeroTrustTunnelCloudflaredRoute") inline def TunnelRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TunnelRouteArgs.builder
    com.pulumi.cloudflare.TunnelRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  @deprecated("cloudflare.index/tunnelvirtualnetwork.TunnelVirtualNetwork has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflaredvirtualnetwork.ZeroTrustTunnelCloudflaredVirtualNetwork") inline def TunnelVirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelVirtualNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TunnelVirtualNetworkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TunnelVirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Turnstile Sites Read`
   * - `Turnstile Sites Write`
   */
  inline def TurnstileWidget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.TurnstileWidgetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TurnstileWidgetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TurnstileWidget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def UniversalSslSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.UniversalSslSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UniversalSslSettingArgs.builder
    com.pulumi.cloudflare.UniversalSslSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Rulesets Read`
   * - `Account Rulesets Write`
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Bot Management Read`
   * - `Bot Management Write`
   * - `Cache Settings Read`
   * - `Cache Settings Write`
   * - `Config Settings Read`
   * - `Config Settings Write`
   * - `Custom Errors Read`
   * - `Custom Errors Write`
   * - `Dynamic URL Redirects Read`
   * - `Dynamic URL Redirects Write`
   * - `HTTP DDoS Managed Ruleset Read`
   * - `HTTP DDoS Managed Ruleset Write`
   * - `L4 DDoS Managed Ruleset Read`
   * - `L4 DDoS Managed Ruleset Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Magic Firewall Read`
   * - `Magic Firewall Write`
   * - `Managed headers Read`
   * - `Managed headers Write`
   * - `Mass URL Redirects Read`
   * - `Mass URL Redirects Write`
   * - `Origin Read`
   * - `Origin Write`
   * - `Response Compression Read`
   * - `Response Compression Write`
   * - `Sanitize Read`
   * - `Sanitize Write`
   * - `Select Configuration Read`
   * - `Select Configuration Write`
   * - `Transform Rules Read`
   * - `Transform Rules Write`
   * - `Zone Transform Rules Read`
   * - `Zone Transform Rules Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  inline def UrlNormalizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.UrlNormalizationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UrlNormalizationSettingsArgs.builder
    com.pulumi.cloudflare.UrlNormalizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `User Details Read`
   * - `User Details Write`
   */
  inline def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UserArgs.builder
    com.pulumi.cloudflare.User(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   */
  inline def UserAgentBlockingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.UserAgentBlockingRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UserAgentBlockingRuleArgs.builder
    com.pulumi.cloudflare.UserAgentBlockingRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `SCIM Provisioning`
   */
  inline def UserGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.UserGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.UserGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.UserGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `SCIM Provisioning`
   */
  inline def UserGroupMembers(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.UserGroupMembersArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UserGroupMembersArgs.builder
    com.pulumi.cloudflare.UserGroupMembers(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def VulnerabilityScannerCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.VulnerabilityScannerCredentialArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.VulnerabilityScannerCredentialArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.VulnerabilityScannerCredential(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def VulnerabilityScannerCredentialSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.VulnerabilityScannerCredentialSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.VulnerabilityScannerCredentialSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.VulnerabilityScannerCredentialSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def VulnerabilityScannerTargetEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  inline def WaitingRoom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WaitingRoomArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WaitingRoom(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  inline def WaitingRoomEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomEventArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WaitingRoomEventArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WaitingRoomEvent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  inline def WaitingRoomRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WaitingRoomRulesArgs.builder
    com.pulumi.cloudflare.WaitingRoomRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  inline def WaitingRoomSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WaitingRoomSettingsArgs.builder
    com.pulumi.cloudflare.WaitingRoomSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Web3 Hostnames Read`
   * - `Web3 Hostnames Write`
   */
  inline def Web3Hostname(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.Web3HostnameArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.Web3HostnameArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Web3Hostname(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def WebAnalyticsRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WebAnalyticsRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WebAnalyticsRuleArgs.builder
    com.pulumi.cloudflare.WebAnalyticsRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  inline def WebAnalyticsSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WebAnalyticsSiteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WebAnalyticsSiteArgs.builder
    com.pulumi.cloudflare.WebAnalyticsSite(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  inline def Worker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WorkerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Worker(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  @deprecated("cloudflare.index/workercrontrigger.WorkerCronTrigger has been deprecated in favor of cloudflare.index/workerscrontrigger.WorkersCronTrigger") inline def WorkerCronTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerCronTriggerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerCronTriggerArgs.builder
    com.pulumi.cloudflare.WorkerCronTrigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  @deprecated("cloudflare.index/workerdomain.WorkerDomain has been deprecated in favor of cloudflare.index/workerscustomdomain.WorkersCustomDomain") inline def WorkerDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerDomainArgs.builder
    com.pulumi.cloudflare.WorkerDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * 
   * &gt; For more direct control over Workers resources, we recommend the beta `cloudflare.Worker`, `cloudflare.WorkerVersion`, and `cloudflare.WorkersDeployment` resources. See how to use them in the [developer documentation](https://developers.cloudflare.com/workers/platform/infrastructure-as-code/).
   */
  @deprecated("cloudflare.index/workerscript.WorkerScript has been deprecated in favor of cloudflare.index/workersscript.WorkersScript") inline def WorkerScript(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerScriptArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerScriptArgs.builder
    com.pulumi.cloudflare.WorkerScript(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  inline def WorkerVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerVersionArgs.builder
    com.pulumi.cloudflare.WorkerVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  inline def WorkersCronTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersCronTriggerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersCronTriggerArgs.builder
    com.pulumi.cloudflare.WorkersCronTrigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  inline def WorkersCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersCustomDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersCustomDomainArgs.builder
    com.pulumi.cloudflare.WorkersCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  inline def WorkersDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersDeploymentArgs.builder
    com.pulumi.cloudflare.WorkersDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  inline def WorkersForPlatformsDispatchNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersForPlatformsDispatchNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WorkersForPlatformsDispatchNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WorkersForPlatformsDispatchNamespace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  @deprecated("cloudflare.index/workersforplatformsnamespace.WorkersForPlatformsNamespace has been deprecated in favor of cloudflare.index/workersforplatformsdispatchnamespace.WorkersForPlatformsDispatchNamespace") inline def WorkersForPlatformsNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersForPlatformsNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WorkersForPlatformsNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WorkersForPlatformsNamespace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers KV Storage Read`
   * - `Workers KV Storage Write`
   */
  inline def WorkersKv(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersKvArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersKvArgs.builder
    com.pulumi.cloudflare.WorkersKv(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers KV Storage Read`
   * - `Workers KV Storage Write`
   */
  inline def WorkersKvNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersKvNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersKvNamespaceArgs.builder
    com.pulumi.cloudflare.WorkersKvNamespace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Routes Read`
   * - `Workers Routes Write`
   */
  inline def WorkersRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersRouteArgs.builder
    com.pulumi.cloudflare.WorkersRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * 
   * &gt; For more direct control over Workers resources, we recommend the beta `cloudflare.Worker`, `cloudflare.WorkerVersion`, and `cloudflare.WorkersDeployment` resources. See how to use them in the [developer documentation](https://developers.cloudflare.com/workers/platform/infrastructure-as-code/).
   */
  inline def WorkersScript(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersScriptArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersScriptArgs.builder
    com.pulumi.cloudflare.WorkersScript(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * 
   * &gt; This resource is redundant with `cloudflare.Worker` and should not be used together. When using the `cloudflare.Worker` resource, use the nested `subdomain` attribute to control subdomain settings instead.
   */
  inline def WorkersScriptSubdomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersScriptSubdomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersScriptSubdomainArgs.builder
    com.pulumi.cloudflare.WorkersScriptSubdomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  inline def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkflowArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkflowArgs.builder
    com.pulumi.cloudflare.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `MCP Portals Read`
   * - `MCP Portals Write`
   */
  inline def ZeroTrustAccessAiControlsMcpPortal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortalArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortalArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortal(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `MCP Portals Read`
   * - `MCP Portals Write`
   */
  inline def ZeroTrustAccessAiControlsMcpServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustAccessApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessApplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Custom Pages Read`
   * - `Access: Custom Pages Write`
   */
  inline def ZeroTrustAccessCustomPage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessCustomPageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessCustomPageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessCustomPage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  inline def ZeroTrustAccessGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  inline def ZeroTrustAccessIdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessIdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustAccessInfrastructureTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessInfrastructureTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessInfrastructureTargetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.cloudflare.ZeroTrustAccessInfrastructureTarget(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  inline def ZeroTrustAccessKeyConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessKeyConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessKeyConfigurationArgs.builder
    com.pulumi.cloudflare.ZeroTrustAccessKeyConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  inline def ZeroTrustAccessMtlsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessMtlsCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessMtlsCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessMtlsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  inline def ZeroTrustAccessMtlsHostnameSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  inline def ZeroTrustAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Service Tokens Read`
   * - `Access: Service Tokens Write`
   */
  inline def ZeroTrustAccessServiceToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessServiceTokenArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessServiceTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessServiceToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  inline def ZeroTrustAccessShortLivedCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessShortLivedCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessShortLivedCertificateArgs.builder
    com.pulumi.cloudflare.ZeroTrustAccessShortLivedCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustAccessTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessTagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates and manages a CASB integration. Exactly one vendor and exactly one authentication method must be configured. */
  inline def ZeroTrustCasbIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustCasbIntegration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustCasbPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustCasbPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustCasbPolicyArgs.builder
    com.pulumi.cloudflare.ZeroTrustCasbPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustCasbWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustCasbWebhookArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustCasbWebhookArgs.builder
    com.pulumi.cloudflare.ZeroTrustCasbWebhook(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Report`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustConnectivitySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustConnectivitySettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustConnectivitySettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustConnectivitySettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceCustomProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceCustomProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceCustomProfileLocalDomainFallback(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallback(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceDefaultProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  inline def ZeroTrustDeviceDefaultProfileCertificates(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileCertificatesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileCertificatesArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileCertificates(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceDefaultProfileLocalDomainFallback(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallback(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustDeviceDeploymentGroups(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroupsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroupsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroups(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceIpProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceIpProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceIpProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceIpProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceManagedNetworks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworksArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworks(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDevicePostureIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDevicePostureIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDevicePostureIntegrationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDevicePostureIntegration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDevicePostureRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDevicePostureRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDeviceSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceSettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Read`
   * - `Cloudflare One Networks Write`
   */
  inline def ZeroTrustDeviceSubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceSubnetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceSubnetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceSubnet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare DEX Read`
   * - `Cloudflare DEX Write`
   * - `Zero Trust Read`
   * - `Zero Trust Report`
   */
  inline def ZeroTrustDexRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDexRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDexRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDexRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare DEX Read`
   * - `Cloudflare DEX Write`
   * - `Zero Trust Read`
   * - `Zero Trust Report`
   */
  inline def ZeroTrustDexTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDexTestArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDexTestArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDexTest(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpCustomEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpCustomEntryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpCustomEntryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpCustomEntry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpCustomProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpCustomProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpDataClass(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDataClassArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDataClassArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataClass(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpDataTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDataTagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDataTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataTag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpDataTagCategory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDataTagCategoryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDataTagCategoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataTagCategory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDatasetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDatasetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpEntryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpEntryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpEntry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpIntegrationEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpIntegrationEntryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpIntegrationEntryArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpIntegrationEntry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpPredefinedEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpPredefinedEntryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpPredefinedEntryArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpPredefinedEntry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpPredefinedProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfileArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpSensitivityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSensitivityGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSensitivityGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpSensitivityGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpSensitivityLevel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpSensitivityLevelOrder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelOrderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelOrderArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelOrder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDlpSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare Zero Trust Secure DNS Locations Write`
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustDnsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDnsLocation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustGatewayCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayCertificateArgs.builder
    com.pulumi.cloudflare.ZeroTrustGatewayCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustGatewayLogging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayLoggingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayLoggingArgs.builder
    com.pulumi.cloudflare.ZeroTrustGatewayLogging(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustGatewayPacfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayPacfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayPacfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustGatewayPacfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustGatewayPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustGatewayPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustGatewayProxyEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustGatewaySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewaySettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewaySettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustGatewaySettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustListArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustList(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/zerotrustlocalfallbackdomain.ZeroTrustLocalFallbackDomain has been deprecated in favor of cloudflare.index/zerotrustdevicecustomprofilelocaldomainfallback.ZeroTrustDeviceCustomProfileLocalDomainFallback") inline def ZeroTrustLocalFallbackDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs.builder
    com.pulumi.cloudflare.ZeroTrustLocalFallbackDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Read`
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Read`
   * - `Cloudflare Tunnel Write`
   */
  inline def ZeroTrustNetworkHostnameRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustNetworkHostnameRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustNetworkHostnameRouteArgs.builder
    com.pulumi.cloudflare.ZeroTrustNetworkHostnameRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Revoke`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  inline def ZeroTrustOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustOrganizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustOrganization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZeroTrustResourceLibraryApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustResourceLibraryApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustResourceLibraryApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustResourceLibraryApplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustRiskBehavior(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustRiskBehaviorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustRiskBehaviorArgs.builder
    com.pulumi.cloudflare.ZeroTrustRiskBehavior(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  inline def ZeroTrustRiskScoringIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustRiskScoringIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustRiskScoringIntegrationArgs.builder
    com.pulumi.cloudflare.ZeroTrustRiskScoringIntegration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: cloudflared Read`
   * - `Cloudflare One Connector: cloudflared Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   * - `Cloudflare Tunnel Read`
   * - `Cloudflare Tunnel Write`
   */
  inline def ZeroTrustTunnelCloudflared(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflared(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: cloudflared Read`
   * - `Cloudflare One Connector: cloudflared Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   * - `Cloudflare Tunnel Read`
   * - `Cloudflare Tunnel Write`
   */
  inline def ZeroTrustTunnelCloudflaredConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfigArgs.builder
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  inline def ZeroTrustTunnelCloudflaredRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredRouteArgs.builder
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  inline def ZeroTrustTunnelCloudflaredVirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredVirtualNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredVirtualNetworkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredVirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: WARP Read`
   * - `Cloudflare One Connector: WARP Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   */
  inline def ZeroTrustTunnelWarpConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustTunnelWarpConnector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: WARP Read`
   * - `Cloudflare One Connector: WARP Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   */
  inline def ZeroTrustTunnelWarpConnectorConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfigArgs.builder
    com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Revoke`
   * - `Access: Apps and Policies Write`
   * - `Access: Mutual TLS Certificates Write`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   * - `Analytics Read`
   * - `Apps Write`
   * - `Cache Purge`
   * - `DNS Read`
   * - `DNS Write`
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * - `Load Balancers Read`
   * - `Load Balancers Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Page Rules Read`
   * - `Page Rules Write`
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   * - `Stream Read`
   * - `Stream Write`
   * - `Trust and Safety Read`
   * - `Trust and Safety Write`
   * - `Workers Routes Read`
   * - `Workers Routes Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Zaraz Admin`
   * - `Zaraz Edit`
   * - `Zaraz Read`
   * - `Zero Trust: PII Read`
   * - `Zone DNS Edit`
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   * - `Zone Zone Edit`
   * 
   * &gt; If you are attempting to sign up a subdomain of a zone you must first have Subdomain Support entitlement for your account.
   */
  inline def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZoneArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Zone(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZoneAutoOriginTlsKex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneAutoOriginTlsKexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneAutoOriginTlsKexArgs.builder
    com.pulumi.cloudflare.ZoneAutoOriginTlsKex(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def ZoneCacheReserve(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneCacheReserveArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneCacheReserveArgs.builder
    com.pulumi.cloudflare.ZoneCacheReserve(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def ZoneCacheVariants(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneCacheVariantsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneCacheVariantsArgs.builder
    com.pulumi.cloudflare.ZoneCacheVariants(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   * - `Zone DNS Settings Read`
   * - `Zone DNS Settings Write`
   */
  inline def ZoneDnsSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneDnsSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneDnsSettingsArgs.builder
    com.pulumi.cloudflare.ZoneDnsSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  inline def ZoneDnssec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneDnssecArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneDnssecArgs.builder
    com.pulumi.cloudflare.ZoneDnssec(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Revoke`
   * - `Access: Apps and Policies Write`
   * - `Access: Mutual TLS Certificates Write`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   * - `Analytics Read`
   * - `Apps Write`
   * - `Cache Purge`
   * - `DNS Read`
   * - `DNS Write`
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   * - `Load Balancers Read`
   * - `Load Balancers Write`
   * - `Logs Read`
   * - `Logs Write`
   * - `Page Rules Read`
   * - `Page Rules Write`
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   * - `Stream Read`
   * - `Stream Write`
   * - `Trust and Safety Read`
   * - `Trust and Safety Write`
   * - `Workers Routes Read`
   * - `Workers Routes Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Zaraz Admin`
   * - `Zaraz Edit`
   * - `Zaraz Read`
   * - `Zero Trust: PII Read`
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  inline def ZoneHold(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneHoldArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneHoldArgs.builder
    com.pulumi.cloudflare.ZoneHold(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   */
  inline def ZoneLockdown(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneLockdownArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneLockdownArgs.builder
    com.pulumi.cloudflare.ZoneLockdown(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * 
   * &gt; If using the `sslRecommender` zone setting, use the `enabled` attribute instead of `value`.
   * 
   * ## Available Setting IDs
   * 
   * &lt;!-- BEGIN_ZONE_SETTING_IDS --&gt;
   * &lt;!-- This table is auto-generated by scripts/generate-zone-setting-ids from the OpenAPI spec. Do not edit manually. --&gt;
   * 
   * The following table lists all valid `settingId` values. Some settings may require a specific Cloudflare plan level. For more details, see the [API documentation](https://developers.cloudflare.com/api/resources/zones/subresources/settings/methods/list/).
   * 
   * | Setting ID | Value Type | Description |
   * |---|---|---|
   * | `0rtt` | `&#34;on&#34;` / `&#34;off&#34;` | 0-RTT session resumption enabled for this zone. |
   * | `advancedDdos` | `&#34;on&#34;` / `&#34;off&#34;` | Advanced protection from Distributed Denial of Service (DDoS) attacks on your... |
   * | `aegis` | Object | Aegis provides dedicated egress IPs (from Cloudflare to your origin) for your... |
   * | `alwaysOnline` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare serves limited copies of web pages available from th... |
   * | `alwaysUseHttps` | `&#34;on&#34;` / `&#34;off&#34;` | Reply to all requests for URLs that use &#34;http&#34; with a 301 redirect to the equ... |
   * | `automaticHttpsRewrites` | `&#34;on&#34;` / `&#34;off&#34;` | Enable the Automatic HTTPS Rewrites feature for this zone. |
   * | `automaticPlatformOptimization` | Object | [Automatic Platform Optimization for WordPress](https://developers.cloudflare... |
   * | `brotli` | `&#34;on&#34;` / `&#34;off&#34;` | When the client requesting an asset supports the Brotli compression algorithm... |
   * | `browserCacheTtl` | Number | Browser Cache TTL (in seconds) specifies how long Cloudflare-cached resources... |
   * | `browserCheck` | `&#34;on&#34;` / `&#34;off&#34;` | Browser Integrity Check is similar to Bad Behavior and looks for common HTTP ... |
   * | `cacheLevel` | `&#34;aggressive&#34;`, `&#34;basic&#34;`, `&#34;simplified&#34;` | Cache Level functions based off the setting level. The basic setting will cac... |
   * | `challengeTtl` | Number (14 values) | Specify how long a visitor is allowed access to your site after successfully ... |
   * | `ciphers` | Array of string | An allowlist of ciphers for TLS termination. These ciphers must be in the Bor... |
   * | `cnameFlattening` | `&#34;flattenAtRoot&#34;`, `&#34;flattenAll&#34;` | Whether or not cname flattening is on. |
   * | `contentConverter` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled and the client sends an Accept header requesting text/markdown, ... |
   * | `developmentMode` | `&#34;on&#34;` / `&#34;off&#34;` | Development Mode temporarily allows you to enter development mode for your we... |
   * | `earlyHints` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare will attempt to speed up overall page loads by servi... |
   * | `edgeCacheTtl` | Number (21 values) | Time (in seconds) that a resource will be ensured to remain on Cloudflare&#39;s c... |
   * | `emailObfuscation` | `&#34;on&#34;` / `&#34;off&#34;` | Encrypt email adresses on your web page from bots, while keeping them visible... |
   * | `h2Prioritization` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;custom&#34;` | HTTP/2 Edge Prioritization optimises the delivery of resources served through... |
   * | `hotlinkProtection` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, the Hotlink Protection option ensures that other sites cannot s... |
   * | `http2` | `&#34;on&#34;` / `&#34;off&#34;` | HTTP2 enabled for this zone. |
   * | `http3` | `&#34;on&#34;` / `&#34;off&#34;` | HTTP3 enabled for this zone. |
   * | `imageResizing` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;open&#34;` | Image Transformations provides on-demand resizing, conversion and optimizatio... |
   * | `ipGeolocation` | `&#34;on&#34;` / `&#34;off&#34;` | Enable IP Geolocation to have Cloudflare geolocate visitors to your website a... |
   * | `ipv6` | `&#34;on&#34;` / `&#34;off&#34;` | Enable IPv6 on all subdomains that are Cloudflare enabled.  (https://support.... |
   * | `maxUpload` | Number (26 values) | Maximum size of an allowable upload. |
   * | `minTlsVersion` | `&#34;1.0&#34;`, `&#34;1.1&#34;`, `&#34;1.2&#34;`, `&#34;1.3&#34;` | Only accepts HTTPS requests that use at least the TLS protocol version specif... |
   * | `mirage` | `&#34;on&#34;` / `&#34;off&#34;` | Automatically optimize image loading for website visitors on mobile devices. ... |
   * | `nel` | Object | Enable Network Error Logging reporting on your zone. (Beta) |
   * | `opportunisticEncryption` | `&#34;on&#34;` / `&#34;off&#34;` | Enables the Opportunistic Encryption feature for a zone. |
   * | `opportunisticOnion` | `&#34;on&#34;` / `&#34;off&#34;` | Add an Alt-Svc header to all legitimate requests from Tor, allowing the conne... |
   * | `orangeToOrange` | `&#34;on&#34;` / `&#34;off&#34;` | Orange to Orange (O2O) allows zones on Cloudflare to CNAME to other zones als... |
   * | `originErrorPagePassThru` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will proxy customer error pages on any 502,504 errors on origin se... |
   * | `originH2MaxStreams` | Number | Origin H2 Max Streams configures the max number of concurrent requests that C... |
   * | `originMaxHttpVersion` | `&#34;2&#34;`, `&#34;1&#34;` | Origin Max HTTP Setting Version sets the highest HTTP version Cloudflare will... |
   * | `polish` | `&#34;off&#34;`, `&#34;lossless&#34;`, `&#34;lossy&#34;` | Removes metadata and compresses your images for faster page load times. Basic... |
   * | `preRender` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare serves pre-rendered HTML to eligible search and AI c... |
   * | `prefetchPreload` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will prefetch any URLs that are included in the response headers. ... |
   * | `privacyPass` | `&#34;on&#34;` / `&#34;off&#34;` | Privacy Pass v1 was a browser extension developed by the Privacy Pass Team to... |
   * | `proxyReadTimeout` | Number | Maximum time between two read operations from origin. |
   * | `pseudoIpv4` | `&#34;off&#34;`, `&#34;addHeader&#34;`, `&#34;overwriteHeader&#34;` | The value set for the Pseudo IPv4 setting. |
   * | `redirectsForAiTraining` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare will redirect verified AI training crawlers to canon... |
   * | `replaceInsecureJs` | `&#34;on&#34;` / `&#34;off&#34;` | Automatically replace insecure JavaScript libraries with safer and faster alt... |
   * | `responseBuffering` | `&#34;on&#34;` / `&#34;off&#34;` | Enables or disables buffering of responses from the proxied server. Cloudflar... |
   * | `rocketLoader` | `&#34;on&#34;` / `&#34;off&#34;` | Rocket Loader is a general-purpose asynchronous JavaScript optimisation that ... |
   * | `searchForAgents` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare provisions an AI Search instance for the zone and ex... |
   * | `securityHeader` | Object | Cloudflare security header for a zone. |
   * | `securityLevel` | `&#34;off&#34;`, `&#34;essentiallyOff&#34;`, `&#34;low&#34;`, `&#34;medium&#34;`, `&#34;high&#34;`, `&#34;underAttack&#34;` | Choose the appropriate security profile for your website, which will automati... |
   * | `serverSideExclude` | `&#34;on&#34;` / `&#34;off&#34;` | If there is sensitive content on your website that you want visible to real v... |
   * | `sha1Support` | `&#34;on&#34;` / `&#34;off&#34;` | Allow SHA1 support. |
   * | `sortQueryStringForCache` | `&#34;on&#34;` / `&#34;off&#34;` | Cloudflare will treat files with the same query strings as the same file in c... |
   * | `ssl` | `&#34;off&#34;`, `&#34;flexible&#34;`, `&#34;full&#34;`, `&#34;strict&#34;` | SSL encrypts your visitor&#39;s connection and safeguards credit card numbers and... |
   * | `sslRecommender` | Uses `enabled` attr | Enrollment in the SSL/TLS Recommender service which tries to detect and recom... |
   * | `tls12Only` | `&#34;on&#34;` / `&#34;off&#34;` | Only allows TLS1.2. |
   * | `tls13` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;zrt&#34;` | Enables Crypto TLS 1.3 feature for a zone. |
   * | `tlsClientAuth` | `&#34;on&#34;` / `&#34;off&#34;` | TLS Client Auth requires Cloudflare to connect to your origin server using a ... |
   * | `transformations` | `&#34;on&#34;`, `&#34;off&#34;`, `&#34;open&#34;` | Media Transformations provides on-demand resizing, conversion and optimizatio... |
   * | `transformationsAllowedOrigins` | String | Media Transformations Allowed Origins restricts transformations for images an... |
   * | `trueClientIpHeader` | `&#34;on&#34;` / `&#34;off&#34;` | Allows customer to continue to use True Client IP (Akamai feature) in the hea... |
   * | `waf` | `&#34;on&#34;` / `&#34;off&#34;` | The WAF examines HTTP requests to your website.  It inspects both GET and POS... |
   * | `webmcpEnabled` | `&#34;on&#34;` / `&#34;off&#34;` | When enabled, Cloudflare injects the WebMCP bridge (bridge.js) into HTML resp... |
   * | `webmcpMcpUrl` | String | Optional per-zone path of the site&#39;s own MCP server, used by the WebMCP mcp-s... |
   * | `webmcpPacks` | String | Optional per-zone override of which bundled WebMCP tool packs the injected br... |
   * | `webp` | `&#34;on&#34;` / `&#34;off&#34;` | When the client requesting the image supports the WebP image codec, and WebP ... |
   * | `websockets` | `&#34;on&#34;` / `&#34;off&#34;` | WebSockets are open connections sustained between the client and the origin s... |
   * 
   * &lt;!-- END_ZONE_SETTING_IDS --&gt;
   */
  inline def ZoneSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneSettingArgs.builder
    com.pulumi.cloudflare.ZoneSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Billing Read`
   * - `Billing Write`
   */
  inline def ZoneSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneSubscriptionArgs.builder
    com.pulumi.cloudflare.ZoneSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZoneTracing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneTracingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneTracingArgs.builder
    com.pulumi.cloudflare.ZoneTracing(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  inline def ZoneTracingRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneTracingRulesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneTracingRulesArgs.builder
    com.pulumi.cloudflare.ZoneTracingRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
