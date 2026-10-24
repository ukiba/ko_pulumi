package jp.ukiba.ko_pulumi
package cloudflare

import com.pulumi.resources.CustomResourceOptions

object cloudflare:
  @deprecated("cloudflare.index/accessapplication.AccessApplication has been deprecated in favor of cloudflare.index/zerotrustaccessapplication.ZeroTrustAccessApplication") def AccessApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  @deprecated("cloudflare.index/accesscacertificate.AccessCaCertificate has been deprecated in favor of cloudflare.index/zerotrustaccessshortlivedcertificate.ZeroTrustAccessShortLivedCertificate") def AccessCaCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessCaCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessCaCertificateArgs.builder
    com.pulumi.cloudflare.AccessCaCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Custom Pages Read`
   * - `Access: Custom Pages Write`
   */
  @deprecated("cloudflare.index/accesscustompage.AccessCustomPage has been deprecated in favor of cloudflare.index/zerotrustaccesscustompage.ZeroTrustAccessCustomPage") def AccessCustomPage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessCustomPageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessCustomPageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessCustomPage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accessgroup.AccessGroup has been deprecated in favor of cloudflare.index/zerotrustaccessgroup.ZeroTrustAccessGroup") def AccessGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accessidentityprovider.AccessIdentityProvider has been deprecated in favor of cloudflare.index/zerotrustaccessidentityprovider.ZeroTrustAccessIdentityProvider") def AccessIdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessIdentityProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessIdentityProviderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessIdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accesskeysconfiguration.AccessKeysConfiguration has been deprecated in favor of cloudflare.index/zerotrustaccesskeyconfiguration.ZeroTrustAccessKeyConfiguration") def AccessKeysConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessKeysConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessKeysConfigurationArgs.builder
    com.pulumi.cloudflare.AccessKeysConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  @deprecated("cloudflare.index/accessmutualtlscertificate.AccessMutualTlsCertificate has been deprecated in favor of cloudflare.index/zerotrustaccessmtlscertificate.ZeroTrustAccessMtlsCertificate") def AccessMutualTlsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessMutualTlsCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessMutualTlsCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessMutualTlsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  @deprecated("cloudflare.index/accessmutualtlshostnamesettings.AccessMutualTlsHostnameSettings has been deprecated in favor of cloudflare.index/zerotrustaccessmtlshostnamesettings.ZeroTrustAccessMtlsHostnameSettings") def AccessMutualTlsHostnameSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessMutualTlsHostnameSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessMutualTlsHostnameSettingsArgs.builder
    com.pulumi.cloudflare.AccessMutualTlsHostnameSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Revoke`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  @deprecated("cloudflare.index/accessorganization.AccessOrganization has been deprecated in favor of cloudflare.index/zerotrustorganization.ZeroTrustOrganization") def AccessOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessOrganizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessOrganization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  @deprecated("cloudflare.index/accesspolicy.AccessPolicy has been deprecated in favor of cloudflare.index/zerotrustaccesspolicy.ZeroTrustAccessPolicy") def AccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Firewall Access Rules Read`
   * - `Account Firewall Access Rules Write`
   */
  def AccessRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccessRuleArgs.builder
    com.pulumi.cloudflare.AccessRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Service Tokens Read`
   * - `Access: Service Tokens Write`
   */
  @deprecated("cloudflare.index/accessservicetoken.AccessServiceToken has been deprecated in favor of cloudflare.index/zerotrustaccessservicetoken.ZeroTrustAccessServiceToken") def AccessServiceToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessServiceTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessServiceTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessServiceToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  @deprecated("cloudflare.index/accesstag.AccessTag has been deprecated in favor of cloudflare.index/zerotrustaccesstag.ZeroTrustAccessTag") def AccessTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccessTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccessTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccessTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccountArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account DNS Settings Read`
   * - `Account DNS Settings Write`
   */
  def AccountDnsSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountDnsSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccountDnsSettingsArgs.builder
    com.pulumi.cloudflare.AccountDnsSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS View Read`
   * - `DNS View Write`
   */
  def AccountDnsSettingsInternalView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountDnsSettingsInternalViewArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccountDnsSettingsInternalViewArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccountDnsSettingsInternalView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `SCIM Provisioning`
   */
  def AccountMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccountMemberArgs.builder
    com.pulumi.cloudflare.AccountMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Billing Read`
   * - `Billing Write`
   */
  def AccountSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AccountSubscriptionArgs.builder
    com.pulumi.cloudflare.AccountSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Tokens Read`
   * - `Account API Tokens Write`
   */
  def AccountToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AccountTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AccountTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AccountToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Address Maps Read`
   * - `Address Maps Write`
   */
  def AddressMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AddressMapArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AddressMapArgs.builder
    com.pulumi.cloudflare.AddressMap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `AI Gateway Read`
   * - `AI Gateway Write`
   */
  def AiGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AiGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AiGatewayArgs.builder
    com.pulumi.cloudflare.AiGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `AI Gateway Read`
   * - `AI Gateway Write`
   */
  def AiGatewayDynamicRouting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AiGatewayDynamicRoutingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AiGatewayDynamicRoutingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AiGatewayDynamicRouting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * ## Import
   * 
   * ```sh
   * \$ pulumi import cloudflare:index/aiSearchInstance:AiSearchInstance example &#39;&lt;account_id&gt;/&lt;id&gt;&#39;
   * ```
   */
  def AiSearchInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AiSearchInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AiSearchInstanceArgs.builder
    com.pulumi.cloudflare.AiSearchInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * ## Import
   * 
   * &gt; This resource does not currently support `pulumi import`.
   */
  def AiSearchNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AiSearchNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AiSearchNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AiSearchNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * ## Import
   * 
   * ```sh
   * \$ pulumi import cloudflare:index/aiSearchToken:AiSearchToken example &#39;&lt;account_id&gt;/&lt;id&gt;&#39;
   * ```
   */
  def AiSearchToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AiSearchTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.AiSearchTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.AiSearchToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ApiShield(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldArgs.builder
    com.pulumi.cloudflare.ApiShield(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Domain API Gateway`
   */
  def ApiShieldDiscoveryOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldDiscoveryOperationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldDiscoveryOperationArgs.builder
    com.pulumi.cloudflare.ApiShieldDiscoveryOperation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  def ApiShieldOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldOperationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldOperationArgs.builder
    com.pulumi.cloudflare.ApiShieldOperation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ApiShieldOperationSchemaValidationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldOperationSchemaValidationSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldOperationSchemaValidationSettingsArgs.builder
    com.pulumi.cloudflare.ApiShieldOperationSchemaValidationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ApiShieldSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldSchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ApiShieldSchemaArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ApiShieldSchema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ApiShieldSchemaValidationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiShieldSchemaValidationSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ApiShieldSchemaValidationSettingsArgs.builder
    com.pulumi.cloudflare.ApiShieldSchemaValidationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `API Tokens Read`
   * - `API Tokens Write`
   */
  def ApiToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ApiTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ApiTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ApiToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  def ArgoSmartRouting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ArgoSmartRoutingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ArgoSmartRoutingArgs.builder
    com.pulumi.cloudflare.ArgoSmartRouting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ArgoTieredCaching(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ArgoTieredCachingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ArgoTieredCachingArgs.builder
    com.pulumi.cloudflare.ArgoTieredCaching(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def AuthenticatedOriginPulls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPulls(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def AuthenticatedOriginPullsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPullsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def AuthenticatedOriginPullsHostnameCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsHostnameCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsHostnameCertificateArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPullsHostnameCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def AuthenticatedOriginPullsSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.AuthenticatedOriginPullsSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.AuthenticatedOriginPullsSettingsArgs.builder
    com.pulumi.cloudflare.AuthenticatedOriginPullsSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Bot Management Read`
   * - `Bot Management Write`
   */
  def BotManagement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.BotManagementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.BotManagementArgs.builder
    com.pulumi.cloudflare.BotManagement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ByoIpPrefix(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ByoIpPrefixArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ByoIpPrefixArgs.builder
    com.pulumi.cloudflare.ByoIpPrefix(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Calls Read`
   * - `Calls Write`
   */
  def CallsSfuApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CallsSfuAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CallsSfuAppArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CallsSfuApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Calls Read`
   * - `Calls Write`
   */
  def CallsTurnApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CallsTurnAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CallsTurnAppArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CallsTurnApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def CertificateAuthoritiesHostnameAssociations(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CertificateAuthoritiesHostnameAssociationsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CertificateAuthoritiesHostnameAssociationsArgs.builder
    com.pulumi.cloudflare.CertificateAuthoritiesHostnameAssociations(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def CertificatePack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CertificatePackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CertificatePackArgs.builder
    com.pulumi.cloudflare.CertificatePack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def ClientCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ClientCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ClientCertificateArgs.builder
    com.pulumi.cloudflare.ClientCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Connector Read`
   * - `Cloud Connector Write`
   */
  def CloudConnectorRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudConnectorRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudConnectorRulesArgs.builder
    com.pulumi.cloudflare.CloudConnectorRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object CloudflareFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccessRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccessRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccessRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Firewall Access Rules Read`
     * - `Account Firewall Access Rules Write`
     */
    inline def getAccessRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccessRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccessRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccessRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccessRulesPlain(args(argsBuilder).build)

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
    inline def getAccount(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccount(args(argsBuilder).build)

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
    inline def getAccountPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroups(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroupsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroupsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroupsList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountApiTokenPermissionGroupsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountApiTokenPermissionGroupsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountApiTokenPermissionGroupsListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account DNS Settings Read`
     * - `Account DNS Settings Write`
     */
    inline def getAccountDnsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account DNS Settings Read`
     * - `Account DNS Settings Write`
     */
    inline def getAccountDnsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalView(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalView(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalViewPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalViewPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalViews(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalViews(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS View Read`
     * - `DNS View Write`
     */
    inline def getAccountDnsSettingsInternalViewsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountDnsSettingsInternalViewsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountDnsSettingsInternalViewsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountDnsSettingsInternalViewsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMember(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMemberArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountMemberResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMemberArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMember(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMemberPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMemberPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountMemberResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMemberPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMemberPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMembers(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMembersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountMembersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMembersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMembers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountMembersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountMembersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountMembersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountMembersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountMembersPlain(args(argsBuilder).build)

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
    inline def getAccountPermissionGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroup(args(argsBuilder).build)

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
    inline def getAccountPermissionGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroupPlain(args(argsBuilder).build)

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
    inline def getAccountPermissionGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroups(args(argsBuilder).build)

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
    inline def getAccountPermissionGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountPermissionGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountPermissionGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountPermissionGroupsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRole(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRoleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountRoleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRoleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRole(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRolePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRolePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountRoleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRolePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRolePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRoles(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRolesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountRolesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRolesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRoles(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getAccountRolesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountRolesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountRolesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountRolesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountRolesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getAccountSubscription(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountSubscriptionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountSubscription(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getAccountSubscriptionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountSubscriptionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountSubscriptionPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountToken(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountTokenPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokensArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountTokens(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Tokens Read`
     * - `Account API Tokens Write`
     */
    inline def getAccountTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountTokensPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountTokensPlain(args(argsBuilder).build)

    inline def getAccounts(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAccountsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccounts(args(argsBuilder).build)

    inline def getAccountsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAccountsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAccountsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAccountsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAccountsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMap(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAddressMapResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMap(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMapPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAddressMapResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMapPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMaps(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAddressMapsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMaps(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Address Maps Read`
     * - `Address Maps Write`
     */
    inline def getAddressMapsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAddressMapsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAddressMapsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAddressMapsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAddressMapsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGateway(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGateway(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewayPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewayPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewayDynamicRouting(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiGatewayDynamicRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewayDynamicRouting(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewayDynamicRoutingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiGatewayDynamicRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewayDynamicRoutingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewayDynamicRoutingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGateways(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewaysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiGatewaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewaysArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGateways(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `AI Gateway Read`
     * - `AI Gateway Write`
     */
    inline def getAiGatewaysPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiGatewaysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiGatewaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiGatewaysPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiGatewaysPlain(args(argsBuilder).build)

    inline def getAiSearchInstance(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchInstanceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstanceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstance(args(argsBuilder).build)

    inline def getAiSearchInstancePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchInstanceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstancePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstancePlain(args(argsBuilder).build)

    inline def getAiSearchInstances(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstancesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchInstancesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstancesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstances(args(argsBuilder).build)

    inline def getAiSearchInstancesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchInstancesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchInstancesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchInstancesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchInstancesPlain(args(argsBuilder).build)

    inline def getAiSearchNamespace(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespaceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespace(args(argsBuilder).build)

    inline def getAiSearchNamespacePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespacePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespacePlain(args(argsBuilder).build)

    inline def getAiSearchNamespaces(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespacesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespacesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespaces(args(argsBuilder).build)

    inline def getAiSearchNamespacesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchNamespacesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchNamespacesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchNamespacesPlain(args(argsBuilder).build)

    inline def getAiSearchToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchToken(args(argsBuilder).build)

    inline def getAiSearchTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchTokenPlain(args(argsBuilder).build)

    inline def getAiSearchTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokensArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAiSearchTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchTokens(args(argsBuilder).build)

    inline def getAiSearchTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAiSearchTokensPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAiSearchTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAiSearchTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAiSearchTokensPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShield(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShield(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldDiscoveryOperations(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldDiscoveryOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldDiscoveryOperations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldDiscoveryOperationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldDiscoveryOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldDiscoveryOperationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldDiscoveryOperationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperation(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldOperationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperation(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldOperationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationSchemaValidationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldOperationSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationSchemaValidationSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationSchemaValidationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldOperationSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationSchemaValidationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationSchemaValidationSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperations(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldOperationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldOperationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldOperationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldOperationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldOperationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchema(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldSchemaResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchema(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemaPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldSchemaResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemaPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemaValidationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemaValidationSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemaValidationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemaValidationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemaValidationSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemas(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemasArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiShieldSchemasInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemasArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemas(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getApiShieldSchemasPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiShieldSchemasPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiShieldSchemasInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiShieldSchemasPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiShieldSchemasPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiToken(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokenPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokenPermissionGroupsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokenPermissionGroupsList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokenPermissionGroupsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiTokenPermissionGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokenPermissionGroupsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokenPermissionGroupsListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokensArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetApiTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokens(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `API Tokens Read`
     * - `API Tokens Write`
     */
    inline def getApiTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetApiTokensPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetApiTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetApiTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getApiTokensPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getArgoSmartRouting(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoSmartRoutingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetArgoSmartRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoSmartRoutingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoSmartRouting(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getArgoSmartRoutingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoSmartRoutingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetArgoSmartRoutingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoSmartRoutingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoSmartRoutingPlain(args(argsBuilder).build)

    inline def getArgoTieredCaching(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoTieredCachingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetArgoTieredCachingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoTieredCachingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoTieredCaching(args(argsBuilder).build)

    inline def getArgoTieredCachingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetArgoTieredCachingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetArgoTieredCachingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetArgoTieredCachingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getArgoTieredCachingPlain(args(argsBuilder).build)

    inline def getAuthenticatedOriginPulls(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPulls(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsPlain(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificate(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificatePlain(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificates(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsCertificatesPlain(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsHostnameCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificate(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsHostnameCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificatePlain(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsHostnameCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificates(args(argsBuilder).build)

    inline def getAuthenticatedOriginPullsHostnameCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsHostnameCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsHostnameCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsHostnameCertificatesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getAuthenticatedOriginPullsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getAuthenticatedOriginPullsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetAuthenticatedOriginPullsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetAuthenticatedOriginPullsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getAuthenticatedOriginPullsSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Bot Management Read`
     * - `Bot Management Write`
     */
    inline def getBotManagement(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotManagementArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetBotManagementResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotManagementArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotManagement(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Bot Management Read`
     * - `Bot Management Write`
     */
    inline def getBotManagementPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotManagementPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetBotManagementResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotManagementPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotManagementPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     */
    inline def getBotnetFeedConfigAsn(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetBotnetFeedConfigAsnResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotnetFeedConfigAsn(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DDoS Botnet Feed Read`
     * - `DDoS Botnet Feed Write`
     */
    inline def getBotnetFeedConfigAsnPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetBotnetFeedConfigAsnResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetBotnetFeedConfigAsnPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getBotnetFeedConfigAsnPlain(args(argsBuilder).build)

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
    inline def getByoIpPrefix(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetByoIpPrefixResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefix(args(argsBuilder).build)

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
    inline def getByoIpPrefixPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetByoIpPrefixResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefixPlain(args(argsBuilder).build)

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
    inline def getByoIpPrefixes(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetByoIpPrefixesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefixes(args(argsBuilder).build)

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
    inline def getByoIpPrefixesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetByoIpPrefixesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetByoIpPrefixesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetByoIpPrefixesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getByoIpPrefixesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuApp(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsSfuAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuApp(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuAppPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsSfuAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuAppPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuApps(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsSfuAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuApps(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsSfuAppsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsSfuAppsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsSfuAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsSfuAppsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsSfuAppsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnApp(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsTurnAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnApp(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnAppPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsTurnAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnAppPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnApps(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCallsTurnAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnApps(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Calls Read`
     * - `Calls Write`
     */
    inline def getCallsTurnAppsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCallsTurnAppsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCallsTurnAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCallsTurnAppsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCallsTurnAppsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificateAuthoritiesHostnameAssociations(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCertificateAuthoritiesHostnameAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificateAuthoritiesHostnameAssociations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificateAuthoritiesHostnameAssociationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCertificateAuthoritiesHostnameAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificateAuthoritiesHostnameAssociationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificateAuthoritiesHostnameAssociationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePack(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePackArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCertificatePackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePack(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePackPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCertificatePackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePackPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePacks(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePacksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCertificatePacksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePacksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePacks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCertificatePacksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCertificatePacksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCertificatePacksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCertificatePacksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCertificatePacksPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetClientCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificate(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetClientCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificatePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetClientCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificates(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getClientCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetClientCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetClientCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetClientCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getClientCertificatesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Connector Read`
     * - `Cloud Connector Write`
     */
    inline def getCloudConnectorRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudConnectorRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudConnectorRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudConnectorRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudConnectorRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Connector Read`
     * - `Cloud Connector Write`
     */
    inline def getCloudConnectorRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudConnectorRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudConnectorRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudConnectorRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudConnectorRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequest(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequest(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestAsset(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestAsset(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestAssetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestAssetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestAssetPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestMessage(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestMessageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestMessage(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestMessagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestMessageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestMessagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestMessagePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestPriority(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestPriorityResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestPriority(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Read`
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestPriorityPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestPriorityResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestPriorityPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestPriorityPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequests(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequests(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudforce One Write`
     */
    inline def getCloudforceOneRequestsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCloudforceOneRequestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCloudforceOneRequestsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCloudforceOneRequestsPlain(args(argsBuilder).build)

    inline def getConnectivityDirectoryService(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServiceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServiceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryService(args(argsBuilder).build)

    inline def getConnectivityDirectoryServicePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServiceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryServicePlain(args(argsBuilder).build)

    inline def getConnectivityDirectoryServices(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServicesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryServices(args(argsBuilder).build)

    inline def getConnectivityDirectoryServicesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetConnectivityDirectoryServicesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetConnectivityDirectoryServicesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getConnectivityDirectoryServicesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanning(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetContentScanningResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanning(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanningPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetContentScanningResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanningPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanningExpressions(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningExpressionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetContentScanningExpressionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningExpressionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanningExpressions(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getContentScanningExpressionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetContentScanningExpressionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetContentScanningExpressionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetContentScanningExpressionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getContentScanningExpressionsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCtAlerting(args: Endofunction[com.pulumi.cloudflare.inputs.GetCtAlertingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCtAlertingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCtAlertingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCtAlerting(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCtAlertingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCtAlertingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCtAlertingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCtAlertingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCtAlertingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsr(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomCsrResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsr(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsrPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomCsrResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsrPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsrs(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomCsrsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsrs(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getCustomCsrsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomCsrsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomCsrsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomCsrsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomCsrsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostname(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnamePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnamePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnameFallbackOrigin(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomHostnameFallbackOriginResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnameFallbackOrigin(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnameFallbackOriginPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomHostnameFallbackOriginResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnameFallbackOriginPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnameFallbackOriginPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnames(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnames(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomHostnamesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomHostnamesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomHostnamesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomHostnamesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStore(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoreArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStore(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStorePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStorePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStorePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStorePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStores(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStores(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomOriginTrustStoresPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomOriginTrustStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomOriginTrustStoresPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomOriginTrustStoresPlain(args(argsBuilder).build)

    inline def getCustomPageAsset(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPageAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAsset(args(argsBuilder).build)

    inline def getCustomPageAssetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPageAssetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAssetPlain(args(argsBuilder).build)

    inline def getCustomPageAssets(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPageAssetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAssets(args(argsBuilder).build)

    inline def getCustomPageAssetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPageAssetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPageAssetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPageAssetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPageAssetsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPages(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPagesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPages(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPagesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPagesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPagesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPagesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomPagesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPagesList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Custom Pages Read`
     * - `Account Custom Pages Write`
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Zero Trust: PII Read`
     */
    inline def getCustomPagesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomPagesListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomPagesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomPagesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomPagesListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSsl(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomSslResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSsl(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSslPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomSslResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSslPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSsls(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetCustomSslsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSsls(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getCustomSslsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetCustomSslsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetCustomSslsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetCustomSslsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getCustomSslsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1Database(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetD1DatabaseResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabaseArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1Database(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1DatabasePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetD1DatabaseResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabasePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1DatabasePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1Databases(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabasesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetD1DatabasesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabasesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1Databases(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `D1 Read`
     * - `D1 Write`
     */
    inline def getD1DatabasesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetD1DatabasesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetD1DatabasesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetD1DatabasesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getD1DatabasesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getDcvDelegation(args: Endofunction[com.pulumi.cloudflare.inputs.GetDcvDelegationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDcvDelegationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDcvDelegationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDcvDelegation(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getDcvDelegationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDcvDelegationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDcvDelegationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDcvDelegationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDcvDelegationPlain(args(argsBuilder).build)

    inline def getDlsPrefixBinding(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBinding(args(argsBuilder).build)

    inline def getDlsPrefixBindingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBindingPlain(args(argsBuilder).build)

    inline def getDlsPrefixBindings(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBindings(args(argsBuilder).build)

    inline def getDlsPrefixBindingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDlsPrefixBindingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDlsPrefixBindingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDlsPrefixBindingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewall(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsFirewallResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewall(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewallPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsFirewallResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewallPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewalls(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsFirewallsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewalls(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Firewall Read`
     * - `DNS Firewall Write`
     */
    inline def getDnsFirewallsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsFirewallsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsFirewallsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsFirewallsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsFirewallsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecord(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsRecordResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecord(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecordPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsRecordResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecordPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecords(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsRecordsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecords(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getDnsRecordsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsRecordsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsRecordsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsRecordsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAcl(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAcl(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAclPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAclPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAcls(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAcls(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersAclsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersAclsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersAclsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersIncoming(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersIncomingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersIncoming(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersIncomingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersIncomingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersIncomingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersIncomingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersOutgoing(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersOutgoingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersOutgoing(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getDnsZoneTransfersOutgoingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersOutgoingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersOutgoingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersOutgoingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeer(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeer(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeerPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeers(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersPeersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersPeersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersPeersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersPeersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsig(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsig(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsigPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsigs(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsigs(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     */
    inline def getDnsZoneTransfersTsigsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetDnsZoneTransfersTsigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetDnsZoneTransfersTsigsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getDnsZoneTransfersTsigsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddress(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddress(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddressPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddressPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddresses(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddresses(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Addresses Read`
     * - `Email Routing Addresses Write`
     */
    inline def getEmailRoutingAddressesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingAddressesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingAddressesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingAddressesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingCatchAll(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingCatchAllResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingCatchAll(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingCatchAllPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingCatchAllResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingCatchAllPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingCatchAllPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingDns(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingDnsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingDnsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingDnsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingDns(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingDnsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingDnsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingDnsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingDnsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingDnsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Email Routing Rules Read`
     * - `Email Routing Rules Write`
     */
    inline def getEmailRoutingRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailRoutingSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getEmailRoutingSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailRoutingSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailRoutingSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailRoutingSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPolicies(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPoliciesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPolicy(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityAllowPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityAllowPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityAllowPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityAllowPolicyPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSender(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSenderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSender(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSenderPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSenderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSenderPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSenderPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSenders(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSendersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSenders(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityBlockSendersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityBlockSendersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityBlockSendersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityBlockSendersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomainPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomains(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityDomainsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistries(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistries(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistriesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistry(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistry(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityImpersonationRegistryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityImpersonationRegistryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityImpersonationRegistryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityImpersonationRegistryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomains(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomainsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomainsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomainsList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloud Email Security: Read`
     * - `Cloud Email Security: Write`
     */
    inline def getEmailSecurityTrustedDomainsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSecurityTrustedDomainsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSecurityTrustedDomainsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSecurityTrustedDomainsListPlain(args(argsBuilder).build)

    inline def getEmailSendingSubdomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomain(args(argsBuilder).build)

    inline def getEmailSendingSubdomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomainPlain(args(argsBuilder).build)

    inline def getEmailSendingSubdomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomains(args(argsBuilder).build)

    inline def getEmailSendingSubdomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetEmailSendingSubdomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetEmailSendingSubdomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getEmailSendingSubdomainsPlain(args(argsBuilder).build)

    inline def getFieldExtractor(args: Endofunction[com.pulumi.cloudflare.inputs.GetFieldExtractorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFieldExtractorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFieldExtractorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFieldExtractor(args(argsBuilder).build)

    inline def getFieldExtractorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFieldExtractorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFieldExtractorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFieldExtractorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFieldExtractorPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFilter(args: Endofunction[com.pulumi.cloudflare.inputs.GetFilterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFilterResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFilterArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFilter(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFilterPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFilterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFilterResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFilterPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFilterPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFilters(args: Endofunction[com.pulumi.cloudflare.inputs.GetFiltersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFiltersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFiltersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFilters(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFiltersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFiltersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFiltersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFiltersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFiltersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFirewallRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFirewallRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFirewallRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getFirewallRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFirewallRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFirewallRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFirewallRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFirewallRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipApp(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipApp(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipAppPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipAppResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipAppPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipApps(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipApps(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipAppsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipAppsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipAppsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipAppsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipAppsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlag(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipFlagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlag(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlagPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipFlagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlagPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlags(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetFlagshipFlagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlags(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Flagship Read`
     */
    inline def getFlagshipFlagsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetFlagshipFlagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetFlagshipFlagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetFlagshipFlagsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getFlagshipFlagsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     */
    inline def getGoogleTagGateway(args: Endofunction[com.pulumi.cloudflare.inputs.GetGoogleTagGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetGoogleTagGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetGoogleTagGatewayArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getGoogleTagGateway(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zaraz Admin`
     * - `Zaraz Edit`
     * - `Zaraz Read`
     */
    inline def getGoogleTagGatewayPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetGoogleTagGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetGoogleTagGatewayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetGoogleTagGatewayPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getGoogleTagGatewayPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthcheck(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthcheckArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHealthcheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthcheckArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthcheck(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthcheckPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthcheckPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHealthcheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthcheckPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthcheckPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthchecks(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthchecksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHealthchecksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthchecksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthchecks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Health Checks Read`
     * - `Health Checks Write`
     */
    inline def getHealthchecksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHealthchecksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHealthchecksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHealthchecksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHealthchecksPlain(args(argsBuilder).build)

    inline def getHostnameTlsSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSetting(args(argsBuilder).build)

    inline def getHostnameTlsSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSettingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getHostnameTlsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getHostnameTlsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHostnameTlsSettingsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHostnameTlsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHostnameTlsSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHyperdriveConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfig(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHyperdriveConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfigPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetHyperdriveConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfigs(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Hyperdrive Read`
     * - `Hyperdrive Write`
     */
    inline def getHyperdriveConfigsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetHyperdriveConfigsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetHyperdriveConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetHyperdriveConfigsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getHyperdriveConfigsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImage(args: Endofunction[com.pulumi.cloudflare.inputs.GetImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImage(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetImageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImagePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImageVariant(args: Endofunction[com.pulumi.cloudflare.inputs.GetImageVariantArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetImageVariantResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImageVariantArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImageVariant(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImageVariantPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetImageVariantPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetImageVariantResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImageVariantPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImageVariantPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImages(args: Endofunction[com.pulumi.cloudflare.inputs.GetImagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetImagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImagesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImages(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Images Read`
     * - `Images Write`
     */
    inline def getImagesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetImagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetImagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetImagesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getImagesPlain(args(argsBuilder).build)

    inline def getIpRanges(args: Endofunction[com.pulumi.cloudflare.inputs.GetIpRangesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetIpRangesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetIpRangesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getIpRanges(args(argsBuilder).build)

    inline def getIpRangesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetIpRangesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetIpRangesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetIpRangesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getIpRangesPlain(args(argsBuilder).build)

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
    inline def getKeylessCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetKeylessCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificate(args(argsBuilder).build)

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
    inline def getKeylessCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetKeylessCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificatePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getKeylessCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetKeylessCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificates(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getKeylessCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetKeylessCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetKeylessCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetKeylessCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getKeylessCertificatesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheck(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheck(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account WAF Read`
     * - `Account WAF Write`
     * - `Zone WAF Read`
     * - `Zone WAF Write`
     */
    inline def getLeakedCredentialCheckRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLeakedCredentialCheckRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLeakedCredentialCheckRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLeakedCredentialCheckRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Read`
     */
    inline def getList(args: Endofunction[com.pulumi.cloudflare.inputs.GetListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Read`
     */
    inline def getListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItem(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListItemResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItem(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItemPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListItemResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItemPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItems(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListItemsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItems(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListItemsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListItemsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListItemsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListItemsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListItemsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getLists(args: Endofunction[com.pulumi.cloudflare.inputs.GetListsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLists(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Filter Lists Edit`
     * - `Account Filter Lists Read`
     */
    inline def getListsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetListsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetListsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getListsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancer(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancer(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitor(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitor(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorPlain(args(argsBuilder).build)

    inline def getLoadBalancerMonitorGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroup(args(argsBuilder).build)

    inline def getLoadBalancerMonitorGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroupPlain(args(argsBuilder).build)

    inline def getLoadBalancerMonitorGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroups(args(argsBuilder).build)

    inline def getLoadBalancerMonitorGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorGroupsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitors(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitors(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerMonitorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerMonitorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerMonitorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerMonitorsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPool(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPool(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPoolPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPoolPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPools(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPools(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancing: Monitors and Pools Read`
     * - `Load Balancing: Monitors and Pools Write`
     */
    inline def getLoadBalancerPoolsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancerPoolsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancers(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLoadBalancersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Load Balancers Read`
     * - `Load Balancers Write`
     */
    inline def getLoadBalancersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLoadBalancersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLoadBalancersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLoadBalancersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLoadBalancersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     * - `Logs Write`
     */
    inline def getLogpullRetention(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpullRetentionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpullRetentionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpullRetentionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpullRetention(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     * - `Logs Write`
     */
    inline def getLogpullRetentionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpullRetentionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpullRetentionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpullRetentionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpullRetentionPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     */
    inline def getLogpushDatasetField(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushDatasetFieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetField(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Read`
     */
    inline def getLogpushDatasetFieldPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushDatasetFieldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetFieldPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetFieldPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushDatasetJob(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetJobArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushDatasetJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetJobArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetJob(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushDatasetJobPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushDatasetJobPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushDatasetJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushDatasetJobPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushDatasetJobPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJob(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJob(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJobPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushJobResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJobPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJobs(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetLogpushJobsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJobs(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Logs Write`
     */
    inline def getLogpushJobsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetLogpushJobsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetLogpushJobsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetLogpushJobsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getLogpushJobsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringConfiguration(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringConfigurationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringConfigurationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringConfigurationPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Network Monitoring Admin`
     * - `Magic Network Monitoring Config Read`
     * - `Magic Network Monitoring Config Write`
     */
    inline def getMagicNetworkMonitoringRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicNetworkMonitoringRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicNetworkMonitoringRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicNetworkMonitoringRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1Site(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SiteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SiteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1Site(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1SitePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1SitePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1Sites(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1Sites(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitCf1SitesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitCf1SitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitCf1SitesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitCf1SitesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnector(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnector(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnectorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnectorPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnectors(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnectors(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitConnectorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitConnectorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitConnectorsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSite(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSite(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSitePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSitePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSitePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSitePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAcl(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAcl(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAclPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAclPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAcls(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAcls(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteAclsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteAclsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteAclsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteAclsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLan(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLan(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLanPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLanPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLanPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLans(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLans(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteLansPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteLansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteLansPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteLansPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWan(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWan(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWanPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWanResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWanPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWanPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWans(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWans(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSiteWansPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSiteWansInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSiteWansPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSiteWansPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSites(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSitesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicTransitSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSitesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSites(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicTransitSitesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicTransitSitesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicTransitSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicTransitSitesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicTransitSitesPlain(args(argsBuilder).build)

    inline def getMagicWanBgpFilterProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfile(args(argsBuilder).build)

    inline def getMagicWanBgpFilterProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfilePlain(args(argsBuilder).build)

    inline def getMagicWanBgpFilterProfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfiles(args(argsBuilder).build)

    inline def getMagicWanBgpFilterProfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanBgpFilterProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanBgpFilterProfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanBgpFilterProfilesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanGreTunnel(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanGreTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanGreTunnel(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanGreTunnelPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanGreTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanGreTunnelPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanGreTunnelPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanIpsecTunnel(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanIpsecTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanIpsecTunnel(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanIpsecTunnelPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanIpsecTunnelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanIpsecTunnelPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanIpsecTunnelPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanStaticRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanStaticRouteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMagicWanStaticRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanStaticRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanStaticRoute(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Magic Transit Read`
     * - `Magic Transit Write`
     * - `Magic WAN Read`
     * - `Magic WAN Write`
     */
    inline def getMagicWanStaticRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMagicWanStaticRoutePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMagicWanStaticRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMagicWanStaticRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMagicWanStaticRoutePlain(args(argsBuilder).build)

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
    inline def getManagedTransforms(args: Endofunction[com.pulumi.cloudflare.inputs.GetManagedTransformsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetManagedTransformsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetManagedTransformsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getManagedTransforms(args(argsBuilder).build)

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
    inline def getManagedTransformsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetManagedTransformsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetManagedTransformsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetManagedTransformsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getManagedTransformsPlain(args(argsBuilder).build)

    inline def getMonetizationRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetMonetizationRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMonetizationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMonetizationRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMonetizationRules(args(argsBuilder).build)

    inline def getMonetizationRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMonetizationRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMonetizationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMonetizationRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMonetizationRulesPlain(args(argsBuilder).build)

    inline def getMoqRelay(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMoqRelayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelayArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelay(args(argsBuilder).build)

    inline def getMoqRelayPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMoqRelayResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelayPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelayPlain(args(argsBuilder).build)

    inline def getMoqRelays(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelaysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMoqRelaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelaysArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelays(args(argsBuilder).build)

    inline def getMoqRelaysPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMoqRelaysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMoqRelaysInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMoqRelaysPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMoqRelaysPlain(args(argsBuilder).build)

    inline def getMtlsCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificate(args(argsBuilder).build)

    inline def getMtlsCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificatePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getMtlsCertificateAssociations(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMtlsCertificateAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificateAssociations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account: SSL and Certificates Read`
     * - `Account: SSL and Certificates Write`
     */
    inline def getMtlsCertificateAssociationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMtlsCertificateAssociationsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificateAssociationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificateAssociationsPlain(args(argsBuilder).build)

    inline def getMtlsCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificates(args(argsBuilder).build)

    inline def getMtlsCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetMtlsCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetMtlsCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getMtlsCertificatesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     */
    inline def getNelSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetNelSettingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNelSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNelSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNelSetting(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     */
    inline def getNelSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNelSettingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNelSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNelSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNelSettingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicies(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPoliciesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicy(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooks(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooksPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooksList(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooksList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Notifications Read`
     * - `Notifications Write`
     * - `Zero Trust: PII Read`
     */
    inline def getNotificationPolicyWebhooksListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetNotificationPolicyWebhooksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetNotificationPolicyWebhooksListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getNotificationPolicyWebhooksListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClient(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOauthClientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClient(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClientPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOauthClientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClientPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClients(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOauthClientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClients(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `OAuth Client Read`
     */
    inline def getOauthClientsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthClientsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOauthClientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthClientsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthClientsPlain(args(argsBuilder).build)

    inline def getOauthScopes(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthScopesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOauthScopesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthScopesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthScopes(args(argsBuilder).build)

    inline def getOauthScopesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOauthScopesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOauthScopesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOauthScopesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOauthScopesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getObservatoryScheduledTest(args: Endofunction[com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetObservatoryScheduledTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getObservatoryScheduledTest(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getObservatoryScheduledTestPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetObservatoryScheduledTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetObservatoryScheduledTestPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getObservatoryScheduledTestPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganization(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganizationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationPlain(args(argsBuilder).build)

    inline def getOrganizationProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOrganizationProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationProfile(args(argsBuilder).build)

    inline def getOrganizationProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOrganizationProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationProfilePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganizations(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOrganizationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `User Details Read`
     * - `User Details Write`
     */
    inline def getOrganizationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOrganizationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOrganizationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOrganizationsPlain(args(argsBuilder).build)

    inline def getOriginCaCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCaCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificate(args(argsBuilder).build)

    inline def getOriginCaCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCaCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificatePlain(args(argsBuilder).build)

    inline def getOriginCaCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCaCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificates(args(argsBuilder).build)

    inline def getOriginCaCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCaCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCaCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCaCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCaCertificatesPlain(args(argsBuilder).build)

    inline def getOriginCloudRegion(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCloudRegionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegion(args(argsBuilder).build)

    inline def getOriginCloudRegionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCloudRegionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegionPlain(args(argsBuilder).build)

    inline def getOriginCloudRegions(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginCloudRegionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegions(args(argsBuilder).build)

    inline def getOriginCloudRegionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginCloudRegionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginCloudRegionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginCloudRegionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginCloudRegionsPlain(args(argsBuilder).build)

    inline def getOriginTlsComplianceModes(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetOriginTlsComplianceModesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginTlsComplianceModes(args(argsBuilder).build)

    inline def getOriginTlsComplianceModesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetOriginTlsComplianceModesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetOriginTlsComplianceModesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getOriginTlsComplianceModesPlain(args(argsBuilder).build)

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
    inline def getPageRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageRule(args(argsBuilder).build)

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
    inline def getPageRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageRulePlain(args(argsBuilder).build)

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
    inline def getPageShieldConnections(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnections(args(argsBuilder).build)

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
    inline def getPageShieldConnectionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnectionsPlain(args(argsBuilder).build)

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
    inline def getPageShieldConnectionsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnectionsList(args(argsBuilder).build)

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
    inline def getPageShieldConnectionsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldConnectionsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldConnectionsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldConnectionsListPlain(args(argsBuilder).build)

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
    inline def getPageShieldCookies(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldCookiesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookies(args(argsBuilder).build)

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
    inline def getPageShieldCookiesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldCookiesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookiesPlain(args(argsBuilder).build)

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
    inline def getPageShieldCookiesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldCookiesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookiesList(args(argsBuilder).build)

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
    inline def getPageShieldCookiesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldCookiesListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldCookiesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldCookiesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldCookiesListPlain(args(argsBuilder).build)

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
    inline def getPageShieldPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPolicies(args(argsBuilder).build)

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
    inline def getPageShieldPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPoliciesPlain(args(argsBuilder).build)

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
    inline def getPageShieldPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPolicy(args(argsBuilder).build)

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
    inline def getPageShieldPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldPolicyPlain(args(argsBuilder).build)

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
    inline def getPageShieldScripts(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldScriptsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScripts(args(argsBuilder).build)

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
    inline def getPageShieldScriptsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldScriptsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScriptsPlain(args(argsBuilder).build)

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
    inline def getPageShieldScriptsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPageShieldScriptsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScriptsList(args(argsBuilder).build)

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
    inline def getPageShieldScriptsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPageShieldScriptsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPageShieldScriptsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPageShieldScriptsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPageShieldScriptsListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomainPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomains(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesDomainsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesDomainsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProject(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesProjectResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProject(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProjectPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesProjectResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProjectPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProjects(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPagesProjectsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProjects(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pages Read`
     * - `Pages Write`
     */
    inline def getPagesProjectsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPagesProjectsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPagesProjectsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPagesProjectsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPagesProjectsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipeline(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipeline(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelinePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelinePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelinePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelinePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSink(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineSinkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinkArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSink(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSinkPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineSinkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinkPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSinkPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSinks(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineSinksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSinks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineSinksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineSinksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineSinksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineSinksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineSinksPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStream(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStream(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStreamPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStreamPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStreams(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPipelineStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStreams(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Pipelines Read`
     * - `Pipelines Write`
     */
    inline def getPipelineStreamsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPipelineStreamsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPipelineStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPipelineStreamsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPipelineStreamsPlain(args(argsBuilder).build)

    inline def getPrecursor(args: Endofunction[com.pulumi.cloudflare.inputs.GetPrecursorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetPrecursorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPrecursorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPrecursor(args(argsBuilder).build)

    inline def getPrecursorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetPrecursorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetPrecursorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetPrecursorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getPrecursorPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueue(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueue(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueuePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueuePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueuePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueuePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumer(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueueConsumerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumer(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueueConsumerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumerPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumers(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueueConsumersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueueConsumersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueueConsumersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueueConsumersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueueConsumersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueueConsumersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueues(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueuesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetQueuesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueuesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueues(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Queues Read`
     * - `Queues Write`
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getQueuesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetQueuesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetQueuesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetQueuesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getQueuesPlain(args(argsBuilder).build)

    inline def getR2Bucket(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2Bucket(args(argsBuilder).build)

    inline def getR2BucketPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketPlain(args(argsBuilder).build)

    inline def getR2BucketCors(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketCorsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketCorsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketCorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketCors(args(argsBuilder).build)

    inline def getR2BucketCorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketCorsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketCorsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketCorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketCorsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2BucketEventNotification(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketEventNotification(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2BucketEventNotificationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketEventNotificationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketEventNotificationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketEventNotificationPlain(args(argsBuilder).build)

    inline def getR2BucketLifecycle(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLifecycleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketLifecycleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLifecycleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLifecycle(args(argsBuilder).build)

    inline def getR2BucketLifecyclePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLifecyclePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketLifecycleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLifecyclePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLifecyclePlain(args(argsBuilder).build)

    inline def getR2BucketLock(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLockArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketLockResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLockArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLock(args(argsBuilder).build)

    inline def getR2BucketLockPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketLockPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketLockResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketLockPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketLockPlain(args(argsBuilder).build)

    inline def getR2BucketSippy(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketSippyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2BucketSippyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketSippyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketSippy(args(argsBuilder).build)

    inline def getR2BucketSippyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2BucketSippyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2BucketSippyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2BucketSippyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2BucketSippyPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2CustomDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2CustomDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2CustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2CustomDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2CustomDomain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Storage Read`
     * - `Workers R2 Storage Write`
     */
    inline def getR2CustomDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2CustomDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2CustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2CustomDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2CustomDomainPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Data Catalog Read`
     * - `Workers R2 Data Catalog Write`
     */
    inline def getR2DataCatalog(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2DataCatalogArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetR2DataCatalogResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2DataCatalogArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2DataCatalog(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers R2 Data Catalog Read`
     * - `Workers R2 Data Catalog Write`
     */
    inline def getR2DataCatalogPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetR2DataCatalogPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetR2DataCatalogResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetR2DataCatalogPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getR2DataCatalogPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getRateLimit(args: Endofunction[com.pulumi.cloudflare.inputs.GetRateLimitArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRateLimitResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRateLimitArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRateLimit(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getRateLimitPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRateLimitPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRateLimitResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRateLimitPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRateLimitPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnameArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRegionalHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnameArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostname(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostnamePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnamePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRegionalHostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnamePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostnamePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostnames(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnamesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRegionalHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnamesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostnames(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getRegionalHostnamesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalHostnamesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRegionalHostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalHostnamesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalHostnamesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getRegionalTieredCache(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalTieredCacheArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRegionalTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalTieredCacheArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalTieredCache(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getRegionalTieredCachePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRegionalTieredCachePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRegionalTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRegionalTieredCachePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRegionalTieredCachePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetResourceGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroup(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetResourceGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroupPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetResourceGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroups(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getResourceGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetResourceGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetResourceGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetResourceGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getResourceGroupsPlain(args(argsBuilder).build)

    inline def getRuleset(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRulesetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRuleset(args(argsBuilder).build)

    inline def getRulesetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRulesetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRulesetPlain(args(argsBuilder).build)

    inline def getRulesets(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetRulesetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRulesets(args(argsBuilder).build)

    inline def getRulesetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetRulesetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetRulesetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetRulesetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getRulesetsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettingsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettingsList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationOperationSettingsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationOperationSettingsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationOperationSettingsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationOperationSettingsListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemas(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemas(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemasPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemasPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemasList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemasList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSchemasListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationSchemasListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSchemasListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSchemasListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getSchemaValidationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSchemaValidationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSchemaValidationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSchemaValidationSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStore(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStore(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStorePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStorePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoreResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStorePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStorePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecret(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecret(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecretPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecretPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecrets(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecrets(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoreSecretsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoreSecretsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoreSecretsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoreSecretsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStores(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoresArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSecretsStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoresArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStores(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Secrets Store Read`
     * - `Secrets Store Write`
     */
    inline def getSecretsStoresPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSecretsStoresPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSecretsStoresInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSecretsStoresPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSecretsStoresPlain(args(argsBuilder).build)

    inline def getShare(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShare(args(argsBuilder).build)

    inline def getSharePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSharePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSharePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSharePlain(args(argsBuilder).build)

    inline def getShareRecipient(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareRecipientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipient(args(argsBuilder).build)

    inline def getShareRecipientPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareRecipientResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipientPlain(args(argsBuilder).build)

    inline def getShareRecipients(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareRecipientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipients(args(argsBuilder).build)

    inline def getShareRecipientsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareRecipientsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareRecipientsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareRecipientsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareRecipientsPlain(args(argsBuilder).build)

    inline def getShareResource(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareResourceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResource(args(argsBuilder).build)

    inline def getShareResourcePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareResourceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourcePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResourcePlain(args(argsBuilder).build)

    inline def getShareResources(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourcesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetShareResourcesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourcesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResources(args(argsBuilder).build)

    inline def getShareResourcesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetShareResourcesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetShareResourcesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetShareResourcesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShareResourcesPlain(args(argsBuilder).build)

    inline def getShares(args: Endofunction[com.pulumi.cloudflare.inputs.GetSharesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSharesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSharesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getShares(args(argsBuilder).build)

    inline def getSharesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSharesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSharesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSharesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSharesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippet(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippet(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRulesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRulesList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Snippets Read`
     * - `Snippets Write`
     */
    inline def getSnippetRulesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetRulesListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetRulesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetRulesListPlain(args(argsBuilder).build)

    inline def getSnippets(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippets(args(argsBuilder).build)

    inline def getSnippetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetsPlain(args(argsBuilder).build)

    inline def getSnippetsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSnippetsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetsList(args(argsBuilder).build)

    inline def getSnippetsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSnippetsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSnippetsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSnippetsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSnippetsListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplication(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSpectrumApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplication(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplicationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSpectrumApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplicationPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplications(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSpectrumApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplications(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumApplicationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumApplicationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSpectrumApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumApplicationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumApplicationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumProtocols(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumProtocolsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSpectrumProtocolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumProtocolsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumProtocols(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     */
    inline def getSpectrumProtocolsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSpectrumProtocolsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSpectrumProtocolsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSpectrumProtocolsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSpectrumProtocolsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnector(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSsoConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnector(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnectorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSsoConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnectorPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnectors(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetSsoConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnectors(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSO Connector Read`
     */
    inline def getSsoConnectorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetSsoConnectorsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetSsoConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetSsoConnectorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getSsoConnectorsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStream(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStream(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamAudioTrack(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamAudioTrackArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamAudioTrackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamAudioTrackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamAudioTrack(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamAudioTrackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamAudioTrackPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamAudioTrackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamAudioTrackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamAudioTrackPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamCaptionLanguage(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamCaptionLanguageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamCaptionLanguageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamCaptionLanguageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamCaptionLanguage(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamCaptionLanguagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamCaptionLanguagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamCaptionLanguageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamCaptionLanguagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamCaptionLanguagePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamDownload(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamDownloadArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamDownloadResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamDownloadArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamDownload(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamDownloadPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamDownloadPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamDownloadResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamDownloadPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamDownloadPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamKey(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamKeyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamKey(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamKeyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamKeyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamKeyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamKeyPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamLiveInput(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamLiveInputArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamLiveInputResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamLiveInputArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamLiveInput(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamLiveInputPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamLiveInputPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamLiveInputResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamLiveInputPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamLiveInputPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermark(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamWatermarkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarkArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermark(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermarkPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamWatermarkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarkPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermarkPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermarks(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamWatermarksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermarks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWatermarksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWatermarksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamWatermarksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWatermarksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWatermarksPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWebhook(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWebhookArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWebhookArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWebhook(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamWebhookPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamWebhookPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamWebhookPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamWebhookPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreams(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreams(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Stream Read`
     * - `Stream Write`
     */
    inline def getStreamsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetStreamsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetStreamsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetStreamsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getStreamsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getTieredCache(args: Endofunction[com.pulumi.cloudflare.inputs.GetTieredCacheArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTieredCacheArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTieredCache(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getTieredCachePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTieredCachePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTieredCacheResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTieredCachePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTieredCachePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfig(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfigPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfigs(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfigs(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationConfigsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationConfigsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationConfigsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationConfigsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationConfigsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRulesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTokenValidationRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRulesList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account API Gateway`
     * - `Account API Gateway Read`
     * - `Domain API Gateway`
     * - `Domain API Gateway Read`
     */
    inline def getTokenValidationRulesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTokenValidationRulesListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTokenValidationRulesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTokenValidationRulesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTokenValidationRulesListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getTotalTls(args: Endofunction[com.pulumi.cloudflare.inputs.GetTotalTlsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTotalTlsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTotalTlsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTotalTls(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getTotalTlsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTotalTlsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTotalTlsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTotalTlsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTotalTlsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidget(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTurnstileWidgetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidget(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidgetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTurnstileWidgetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidgetPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidgets(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetTurnstileWidgetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidgets(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `Turnstile Sites Read`
     * - `Turnstile Sites Write`
     */
    inline def getTurnstileWidgetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetTurnstileWidgetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetTurnstileWidgetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetTurnstileWidgetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getTurnstileWidgetsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getUniversalSslSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetUniversalSslSettingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUniversalSslSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUniversalSslSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUniversalSslSetting(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getUniversalSslSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUniversalSslSettingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUniversalSslSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUniversalSslSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUniversalSslSettingPlain(args(argsBuilder).build)

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
    inline def getUrlNormalizationSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUrlNormalizationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUrlNormalizationSettings(args(argsBuilder).build)

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
    inline def getUrlNormalizationSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUrlNormalizationSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUrlNormalizationSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUrlNormalizationSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getUserAgentBlockingRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserAgentBlockingRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserAgentBlockingRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserAgentBlockingRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroup(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupMembers(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupMembersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserGroupMembersResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupMembersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupMembers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupMembersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupMembersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserGroupMembersResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupMembersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupMembersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetUserGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroups(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     * - `Account Settings Write`
     * - `SCIM Provisioning`
     */
    inline def getUserGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetUserGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetUserGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetUserGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getUserGroupsPlain(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredential(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredential(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentialPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialPlain(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentialSet(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSet(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentialSetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSetPlain(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentialSets(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSets(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentialSetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialSetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialSetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialSetsPlain(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentials(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentials(args(argsBuilder).build)

    inline def getVulnerabilityScannerCredentialsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerCredentialsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerCredentialsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerCredentialsPlain(args(argsBuilder).build)

    inline def getVulnerabilityScannerTargetEnvironment(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironment(args(argsBuilder).build)

    inline def getVulnerabilityScannerTargetEnvironmentPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironmentPlain(args(argsBuilder).build)

    inline def getVulnerabilityScannerTargetEnvironments(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironments(args(argsBuilder).build)

    inline def getVulnerabilityScannerTargetEnvironmentsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetVulnerabilityScannerTargetEnvironmentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetVulnerabilityScannerTargetEnvironmentsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getVulnerabilityScannerTargetEnvironmentsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoom(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoom(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEvent(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomEventResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEvent(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEventPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomEventResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEventPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEvents(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomEventsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEvents(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomEventsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomEventsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomEventsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomEventsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomEventsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Waiting Rooms Read`
     * - `Waiting Rooms Write`
     */
    inline def getWaitingRoomSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Waiting Rooms Read`
     */
    inline def getWaitingRooms(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWaitingRoomsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRooms(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Waiting Rooms Read`
     */
    inline def getWaitingRoomsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWaitingRoomsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWaitingRoomsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWaitingRoomsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWaitingRoomsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3Hostname(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnameArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWeb3HostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnameArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3Hostname(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3HostnamePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnamePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWeb3HostnameResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnamePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3HostnamePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3Hostnames(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnamesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWeb3HostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnamesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3Hostnames(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Web3 Hostnames Read`
     * - `Web3 Hostnames Write`
     */
    inline def getWeb3HostnamesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWeb3HostnamesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWeb3HostnamesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWeb3HostnamesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWeb3HostnamesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSite(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWebAnalyticsSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSiteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSite(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSitePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSitePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWebAnalyticsSiteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSitePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSitePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSites(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWebAnalyticsSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSites(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Account Settings Read`
     */
    inline def getWebAnalyticsSitesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWebAnalyticsSitesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWebAnalyticsSitesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWebAnalyticsSitesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorker(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorker(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersion(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkerVersionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersion(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkerVersionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersionPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersions(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkerVersionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersions(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkerVersionsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkerVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkerVersionsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkerVersionsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkerVersionsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkers(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCronTrigger(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCronTriggerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersCronTriggerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCronTriggerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCronTrigger(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCronTriggerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCronTriggerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersCronTriggerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCronTriggerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCronTriggerPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomainPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomains(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomains(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     */
    inline def getWorkersCustomDomainsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersCustomDomainsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersCustomDomainsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersCustomDomainsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeployment(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersDeploymentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeployment(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeploymentPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersDeploymentResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeploymentPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeployments(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersDeploymentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeployments(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersDeploymentsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersDeploymentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersDeploymentsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersDeploymentsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersDeploymentsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespace(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespaceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespace(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespacePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespacePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespaces(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespaces(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersForPlatformsDispatchNamespacesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersForPlatformsDispatchNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersForPlatformsDispatchNamespacesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersForPlatformsDispatchNamespacesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKv(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersKvResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKv(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersKvResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespace(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersKvNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespaceArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespace(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespacePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersKvNamespaceResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespacePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespacePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespaces(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersKvNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespaces(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers KV Storage Read`
     * - `Workers KV Storage Write`
     */
    inline def getWorkersKvNamespacesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersKvNamespacesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersKvNamespacesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersKvNamespacesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRouteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoute(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRoutePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoutePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRoutesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRoutesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoutes(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Routes Read`
     * - `Workers Routes Write`
     */
    inline def getWorkersRoutesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersRoutesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersRoutesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersRoutesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScript(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersScriptResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScript(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersScriptResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptSubdomain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersScriptSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptSubdomain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptSubdomainPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersScriptSubdomainResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptSubdomainPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptSubdomainPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScripts(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkersScriptsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScripts(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkersScriptsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkersScriptsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkersScriptsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkersScriptsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkersScriptsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflow(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflow(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflowPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflowPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflows(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetWorkflowsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflows(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Workers Scripts Read`
     * - `Workers Scripts Write`
     * - `Workers Tail Read`
     */
    inline def getWorkflowsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetWorkflowsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetWorkflowsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetWorkflowsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getWorkflowsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortal(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortal(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortalPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortalPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortals(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortals(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpPortalsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpPortalsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpPortalsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpPortalsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServer(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServer(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServerPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServerResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServerPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServerPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServers(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServers(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `MCP Portals Read`
     * - `MCP Portals Write`
     */
    inline def getZeroTrustAccessAiControlsMcpServersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessAiControlsMcpServersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessAiControlsMcpServersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessAiControlsMcpServersPlain(args(argsBuilder).build)

    inline def getZeroTrustAccessApplication(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplication(args(argsBuilder).build)

    inline def getZeroTrustAccessApplicationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplicationPlain(args(argsBuilder).build)

    inline def getZeroTrustAccessApplications(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplications(args(argsBuilder).build)

    inline def getZeroTrustAccessApplicationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessApplicationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessApplicationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPage(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPageArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPage(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPagePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPageResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPagePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPages(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPages(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Custom Pages Read`
     * - `Access: Custom Pages Write`
     */
    inline def getZeroTrustAccessCustomPagesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessCustomPagesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessCustomPagesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessCustomPagesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroup(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroupPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroups(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessGroupsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProvider(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProviderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProvider(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProviderPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProviderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProviderPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProviderPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProviders(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProvidersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProviders(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessIdentityProvidersPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessIdentityProvidersInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessIdentityProvidersPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessIdentityProvidersPlain(args(argsBuilder).build)

    inline def getZeroTrustAccessInfrastructureTarget(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTarget(args(argsBuilder).build)

    inline def getZeroTrustAccessInfrastructureTargetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTargetPlain(args(argsBuilder).build)

    inline def getZeroTrustAccessInfrastructureTargets(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTargets(args(argsBuilder).build)

    inline def getZeroTrustAccessInfrastructureTargetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessInfrastructureTargetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessInfrastructureTargetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessInfrastructureTargetsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessKeyConfiguration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessKeyConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessKeyConfiguration(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustAccessKeyConfigurationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessKeyConfigurationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessKeyConfigurationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessKeyConfigurationPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificate(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificatePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificates(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsCertificatesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsHostnameSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsHostnameSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsHostnameSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Mutual TLS Certificates Read`
     * - `Access: Mutual TLS Certificates Write`
     */
    inline def getZeroTrustAccessMtlsHostnameSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessMtlsHostnameSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessMtlsHostnameSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessMtlsHostnameSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPolicies(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPoliciesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPolicy(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessPolicyPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceToken(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceTokenPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceTokens(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceTokens(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Service Tokens Read`
     * - `Access: Service Tokens Write`
     */
    inline def getZeroTrustAccessServiceTokensPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessServiceTokensInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessServiceTokensPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessServiceTokensPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificate(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificatePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificates(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Apps and Policies Read`
     * - `Access: Apps and Policies Write`
     */
    inline def getZeroTrustAccessShortLivedCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessShortLivedCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessShortLivedCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessShortLivedCertificatesPlain(args(argsBuilder).build)

    inline def getZeroTrustAccessTag(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTag(args(argsBuilder).build)

    inline def getZeroTrustAccessTagPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTagPlain(args(argsBuilder).build)

    inline def getZeroTrustAccessTags(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTags(args(argsBuilder).build)

    inline def getZeroTrustAccessTagsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustAccessTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustAccessTagsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustAccessTagsPlain(args(argsBuilder).build)

    inline def getZeroTrustCasbIntegration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegration(args(argsBuilder).build)

    inline def getZeroTrustCasbIntegrationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegrationPlain(args(argsBuilder).build)

    inline def getZeroTrustCasbIntegrations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegrations(args(argsBuilder).build)

    inline def getZeroTrustCasbIntegrationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbIntegrationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbIntegrationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPolicies(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPoliciesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPolicy(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbPolicyPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhook(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhook(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhookPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhookResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhookPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhookPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhooks(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhooksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhooks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustCasbWebhooksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustCasbWebhooksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustCasbWebhooksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustCasbWebhooksPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustConnectivitySettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustConnectivitySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustConnectivitySettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustConnectivitySettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustConnectivitySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustConnectivitySettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustConnectivitySettingsPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceCustomProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfile(args(argsBuilder).build)

    inline def getZeroTrustDeviceCustomProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfilePlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceCustomProfileLocalDomainFallback(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfileLocalDomainFallback(args(argsBuilder).build)

    inline def getZeroTrustDeviceCustomProfileLocalDomainFallbackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfileLocalDomainFallbackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfileLocalDomainFallbackPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceCustomProfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfiles(args(argsBuilder).build)

    inline def getZeroTrustDeviceCustomProfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceCustomProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceCustomProfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceCustomProfilesPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceDefaultProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfile(args(argsBuilder).build)

    inline def getZeroTrustDeviceDefaultProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfilePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getZeroTrustDeviceDefaultProfileCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileCertificatesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileCertificates(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `SSL and Certificates Read`
     * - `SSL and Certificates Write`
     */
    inline def getZeroTrustDeviceDefaultProfileCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileCertificatesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileCertificatesPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceDefaultProfileLocalDomainFallback(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileLocalDomainFallback(args(argsBuilder).build)

    inline def getZeroTrustDeviceDefaultProfileLocalDomainFallbackPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDefaultProfileLocalDomainFallbackPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDefaultProfileLocalDomainFallbackPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceDeploymentGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroups(args(argsBuilder).build)

    inline def getZeroTrustDeviceDeploymentGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroupsPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceDeploymentGroupsList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroupsList(args(argsBuilder).build)

    inline def getZeroTrustDeviceDeploymentGroupsListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceDeploymentGroupsListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceDeploymentGroupsListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceDeploymentGroupsListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfile(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfilePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfiles(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDeviceIpProfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceIpProfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceIpProfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceIpProfilesPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceManagedNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworks(args(argsBuilder).build)

    inline def getZeroTrustDeviceManagedNetworksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworksPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceManagedNetworksList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworksList(args(argsBuilder).build)

    inline def getZeroTrustDeviceManagedNetworksListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceManagedNetworksListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceManagedNetworksListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceManagedNetworksListPlain(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureIntegration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegration(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureIntegrationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegrationPlain(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureIntegrations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegrations(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureIntegrationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureIntegrationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureIntegrationsPlain(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRule(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRulePlain(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRules(args(argsBuilder).build)

    inline def getZeroTrustDevicePostureRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDevicePostureRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDevicePostureRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDevicePostureRulesPlain(args(argsBuilder).build)

    inline def getZeroTrustDeviceSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSettings(args(argsBuilder).build)

    inline def getZeroTrustDeviceSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     */
    inline def getZeroTrustDeviceSubnet(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSubnetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSubnet(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     */
    inline def getZeroTrustDeviceSubnetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDeviceSubnetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDeviceSubnetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDeviceSubnetPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRule(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRuleArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRule(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRulePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexRuleResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRulePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRulePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRules(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexRulesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTest(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTest(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTestPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTestPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTests(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTests(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare DEX Read`
     * - `Cloudflare DEX Write`
     * - `Zero Trust Read`
     * - `Zero Trust Report`
     */
    inline def getZeroTrustDexTestsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDexTestsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDexTestsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDexTestsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntries(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntriesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntry(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomEntryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomProfile(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomProfilePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopic(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopic(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopicPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopicPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopics(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopics(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpCustomPromptTopicsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpCustomPromptTopicsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpCustomPromptTopicsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpCustomPromptTopicsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClass(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClass(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClassPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClassPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClasses(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClasses(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataClassesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataClassesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataClassesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataClassesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTag(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTag(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategories(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategories(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategoriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategoriesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategory(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategory(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagCategoryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagCategoryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagCategoryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTags(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTags(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataTagsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDataTagsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDataTagsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataTagsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDataset(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDataset(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDatasetPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDatasetPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDatasets(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDatasets(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpDatasetsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpDatasetsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpDatasetsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpDatasetsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntries(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntriesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntry(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpEntryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntries(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntriesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntry(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpIntegrationEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpIntegrationEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpIntegrationEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpIntegrationEntryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntries(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntries(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntriesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntry(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntry(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedEntryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedEntryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedEntryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedEntryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedProfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedProfile(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpPredefinedProfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpPredefinedProfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpPredefinedProfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpPredefinedProfilePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroup(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroup(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroupPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroupPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroups(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroups(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityGroupsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityGroupsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityGroupsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityGroupsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevel(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevel(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelOrder(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelOrderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelOrder(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelOrderPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelOrderResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelOrderPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelOrderPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevels(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevels(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSensitivityLevelsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSensitivityLevelsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSensitivityLevelsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSensitivityLevelsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDlpSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDlpSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDlpSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDlpSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocation(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocation(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocationPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare Zero Trust Secure DNS Locations Write`
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustDnsLocationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustDnsLocationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustDnsLocationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustDnsLocationsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayAppTypesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayAppTypesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayAppTypesList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayAppTypesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayAppTypesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayAppTypesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayAppTypesListPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayCategoriesList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCategoriesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCategoriesList(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayCategoriesListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCategoriesListInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCategoriesListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCategoriesListPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayCertificate(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificateArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificate(args(argsBuilder).build)

    inline def getZeroTrustGatewayCertificatePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificateResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificatePlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayCertificates(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificates(args(argsBuilder).build)

    inline def getZeroTrustGatewayCertificatesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayCertificatesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayCertificatesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayCertificatesPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayLogging(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayLogging(args(argsBuilder).build)

    inline def getZeroTrustGatewayLoggingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayLoggingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayLoggingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayLoggingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfile(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfileArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfile(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfilePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfileResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfilePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfiles(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfiles(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustGatewayPacfilesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPacfilesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPacfilesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPacfilesPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayPolicies(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPolicies(args(argsBuilder).build)

    inline def getZeroTrustGatewayPoliciesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPoliciesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPoliciesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPoliciesPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayPolicy(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPolicy(args(argsBuilder).build)

    inline def getZeroTrustGatewayPolicyPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayPolicyResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayPolicyPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayPolicyPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayProxyEndpoint(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpoint(args(argsBuilder).build)

    inline def getZeroTrustGatewayProxyEndpointPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpointPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewayProxyEndpoints(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpoints(args(argsBuilder).build)

    inline def getZeroTrustGatewayProxyEndpointsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewayProxyEndpointsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewayProxyEndpointsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewayProxyEndpointsPlain(args(argsBuilder).build)

    inline def getZeroTrustGatewaySettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustGatewaySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewaySettings(args(argsBuilder).build)

    inline def getZeroTrustGatewaySettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustGatewaySettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustGatewaySettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustGatewaySettingsPlain(args(argsBuilder).build)

    inline def getZeroTrustList(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustList(args(argsBuilder).build)

    inline def getZeroTrustListPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustListResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustListPlain(args(argsBuilder).build)

    inline def getZeroTrustLists(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustLists(args(argsBuilder).build)

    inline def getZeroTrustListsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustListsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustListsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustListsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustListsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoute(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoutePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoutes(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustNetworkHostnameRoutesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustNetworkHostnameRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustNetworkHostnameRoutesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustNetworkHostnameRoutesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Revoke`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustOrganization(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustOrganization(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Access: Organizations, Identity Providers, and Groups Read`
     * - `Access: Organizations, Identity Providers, and Groups Revoke`
     * - `Access: Organizations, Identity Providers, and Groups Write`
     */
    inline def getZeroTrustOrganizationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustOrganizationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustOrganizationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustOrganizationPlain(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryApplication(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplication(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryApplicationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplicationPlain(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryApplications(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplications(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryApplicationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryApplicationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryApplicationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryApplicationsPlain(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryCategories(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategories(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryCategoriesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoriesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoriesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategoriesPlain(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryCategory(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategory(args(argsBuilder).build)

    inline def getZeroTrustResourceLibraryCategoryPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustResourceLibraryCategoryResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustResourceLibraryCategoryPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustResourceLibraryCategoryPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskBehavior(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustRiskBehaviorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskBehavior(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskBehaviorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustRiskBehaviorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskBehaviorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskBehaviorPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegration(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegration(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegrationPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegrationPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegrations(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegrations(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zero Trust Read`
     * - `Zero Trust Write`
     */
    inline def getZeroTrustRiskScoringIntegrationsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustRiskScoringIntegrationsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustRiskScoringIntegrationsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustRiskScoringIntegrationsPlain(args(argsBuilder).build)

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
    inline def getZeroTrustTunnelCloudflared(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflared(args(argsBuilder).build)

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
    inline def getZeroTrustTunnelCloudflaredPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredPlain(args(argsBuilder).build)

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
    inline def getZeroTrustTunnelCloudflaredConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredConfig(args(argsBuilder).build)

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
    inline def getZeroTrustTunnelCloudflaredConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredConfigPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoute(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRouteArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoute(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoutePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRouteResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoutePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoutes(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoutes(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredRoutesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredRoutesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredRoutesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredRoutesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredToken(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredTokenPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetwork(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetwork(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetworkPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworkResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworkPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetworkPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetworks(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetworks(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Networks Read`
     * - `Cloudflare One Networks Write`
     * - `Cloudflare Tunnel Read`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelCloudflaredVirtualNetworksPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredVirtualNetworksInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredVirtualNetworksPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredVirtualNetworksPlain(args(argsBuilder).build)

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
    inline def getZeroTrustTunnelCloudflareds(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflareds(args(argsBuilder).build)

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
    inline def getZeroTrustTunnelCloudflaredsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelCloudflaredsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelCloudflaredsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelCloudflaredsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnector(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnector(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorConfig(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorConfig(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorConfigPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorConfigResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorConfigPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorConfigPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelWarpConnectorToken(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorToken(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: cloudflared Write`
     * - `Cloudflare One Connectors Write`
     * - `Cloudflare Tunnel Write`
     */
    inline def getZeroTrustTunnelWarpConnectorTokenPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorTokenResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorTokenPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorTokenPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectors(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectors(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Cloudflare One Connector: WARP Read`
     * - `Cloudflare One Connector: WARP Write`
     * - `Cloudflare One Connectors Read`
     * - `Cloudflare One Connectors Write`
     */
    inline def getZeroTrustTunnelWarpConnectorsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZeroTrustTunnelWarpConnectorsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZeroTrustTunnelWarpConnectorsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZeroTrustTunnelWarpConnectorsPlain(args(argsBuilder).build)

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
    inline def getZone(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZone(args(argsBuilder).build)

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
    inline def getZonePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZonePlain(args(argsBuilder).build)

    inline def getZoneAutoOriginTlsKex(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneAutoOriginTlsKexResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneAutoOriginTlsKex(args(argsBuilder).build)

    inline def getZoneAutoOriginTlsKexPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneAutoOriginTlsKexResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneAutoOriginTlsKexPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneAutoOriginTlsKexPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheReserve(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheReserveArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneCacheReserveResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheReserveArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheReserve(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheReservePlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheReservePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneCacheReserveResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheReservePlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheReservePlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheVariants(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheVariantsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneCacheVariantsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheVariantsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheVariants(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Read`
     * - `Zone Settings Read`
     * - `Zone Settings Write`
     * - `Zone Write`
     */
    inline def getZoneCacheVariantsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneCacheVariantsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneCacheVariantsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneCacheVariantsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneCacheVariantsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone DNS Settings Read`
     * - `Zone DNS Settings Write`
     */
    inline def getZoneDnsSettings(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnsSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnsSettingsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnsSettings(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     * - `Zone DNS Settings Read`
     * - `Zone DNS Settings Write`
     */
    inline def getZoneDnsSettingsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnsSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneDnsSettingsResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnsSettingsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnsSettingsPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getZoneDnssec(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnssecArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneDnssecResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnssecArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnssec(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `DNS Read`
     * - `DNS Write`
     */
    inline def getZoneDnssecPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneDnssecPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneDnssecResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneDnssecPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneDnssecPlain(args(argsBuilder).build)

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
    inline def getZoneHold(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneHoldArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneHoldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneHoldArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneHold(args(argsBuilder).build)

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
    inline def getZoneHoldPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneHoldPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneHoldResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneHoldPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneHoldPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdown(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneLockdownResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdown(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdownPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneLockdownResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdownPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdowns(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneLockdownsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownsArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdowns(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Firewall Services Read`
     * - `Firewall Services Write`
     */
    inline def getZoneLockdownsPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneLockdownsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneLockdownsInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneLockdownsPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneLockdownsPlain(args(argsBuilder).build)

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
    inline def getZoneSetting(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSettingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSettingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSetting(args(argsBuilder).build)

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
    inline def getZoneSettingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSettingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneSettingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSettingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSettingPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getZoneSubscription(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSubscriptionArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSubscription(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Billing Read`
     * - `Billing Write`
     */
    inline def getZoneSubscriptionPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneSubscriptionResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneSubscriptionPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneSubscriptionPlain(args(argsBuilder).build)

    inline def getZoneTracing(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneTracingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracing(args(argsBuilder).build)

    inline def getZoneTracingPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneTracingResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracingPlain(args(argsBuilder).build)

    inline def getZoneTracingRules(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZoneTracingRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingRulesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracingRules(args(argsBuilder).build)

    inline def getZoneTracingRulesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZoneTracingRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZoneTracingRulesResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZoneTracingRulesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZoneTracingRulesPlain(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Zone Read`
     */
    inline def getZones(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.cloudflare.outputs.GetZonesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonesArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZones(args(argsBuilder).build)

    /**
     * Accepted Permissions
     * 
     * - `Zone Zone Read`
     */
    inline def getZonesPlain(args: Endofunction[com.pulumi.cloudflare.inputs.GetZonesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.cloudflare.outputs.GetZonesInvokeResult] =
      val argsBuilder = com.pulumi.cloudflare.inputs.GetZonesPlainArgs.builder
      com.pulumi.cloudflare.CloudflareFunctions.getZonesPlain(args(argsBuilder).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Read`
   * - `Cloudforce One Write`
   */
  def CloudforceOneRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Read`
   * - `Cloudforce One Write`
   */
  def CloudforceOneRequestAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestAssetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestAssetArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequestAsset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Write`
   */
  def CloudforceOneRequestMessage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestMessageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestMessageArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequestMessage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudforce One Read`
   * - `Cloudforce One Write`
   */
  def CloudforceOneRequestPriority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CloudforceOneRequestPriorityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CloudforceOneRequestPriorityArgs.builder
    com.pulumi.cloudflare.CloudforceOneRequestPriority(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ConnectivityDirectoryService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ConnectivityDirectoryServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ConnectivityDirectoryService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  def ContentScanning(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ContentScanningArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ContentScanningArgs.builder
    com.pulumi.cloudflare.ContentScanning(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Write`
   * - `Zone WAF Write`
   */
  def ContentScanningExpression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ContentScanningExpressionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ContentScanningExpressionArgs.builder
    com.pulumi.cloudflare.ContentScanningExpression(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def CtAlerting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CtAlertingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CtAlertingArgs.builder
    com.pulumi.cloudflare.CtAlerting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account: SSL and Certificates Read`
   * - `Account: SSL and Certificates Write`
   */
  def CustomCsr(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomCsrArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CustomCsrArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CustomCsr(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def CustomHostname(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomHostnameArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomHostnameArgs.builder
    com.pulumi.cloudflare.CustomHostname(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def CustomHostnameFallbackOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomHostnameFallbackOriginArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomHostnameFallbackOriginArgs.builder
    com.pulumi.cloudflare.CustomHostnameFallbackOrigin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def CustomOriginTrustStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomOriginTrustStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomOriginTrustStoreArgs.builder
    com.pulumi.cloudflare.CustomOriginTrustStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def CustomPageAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomPageAssetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.CustomPageAssetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.CustomPageAsset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Custom Pages Read`
   * - `Account Custom Pages Write`
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Zero Trust: PII Read`
   */
  def CustomPages(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomPagesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomPagesArgs.builder
    com.pulumi.cloudflare.CustomPages(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def CustomSsl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.CustomSslArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.CustomSslArgs.builder
    com.pulumi.cloudflare.CustomSsl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `D1 Read`
   * - `D1 Write`
   * 
   * &gt; When a D1 Database is replaced all the data is lost. Please ensure you have a
   *    backup of your data before replacing a D1 Database.
   */
  def D1Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.D1DatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.D1DatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.D1Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/devicemanagednetworks.DeviceManagedNetworks has been deprecated in favor of cloudflare.index/zerotrustdevicemanagednetworks.ZeroTrustDeviceManagedNetworks") def DeviceManagedNetworks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DeviceManagedNetworksArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DeviceManagedNetworksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DeviceManagedNetworks(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/devicepostureintegration.DevicePostureIntegration has been deprecated in favor of cloudflare.index/zerotrustdevicepostureintegration.ZeroTrustDevicePostureIntegration") def DevicePostureIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DevicePostureIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DevicePostureIntegrationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DevicePostureIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/deviceposturerule.DevicePostureRule has been deprecated in favor of cloudflare.index/zerotrustdeviceposturerule.ZeroTrustDevicePostureRule") def DevicePostureRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DevicePostureRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DevicePostureRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DevicePostureRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/dlpcustomprofile.DlpCustomProfile has been deprecated in favor of cloudflare.index/zerotrustdlpcustomprofile.ZeroTrustDlpCustomProfile") def DlpCustomProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DlpCustomProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DlpCustomProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DlpCustomProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/dlppredefinedprofile.DlpPredefinedProfile has been deprecated in favor of cloudflare.index/zerotrustdlppredefinedprofile.ZeroTrustDlpPredefinedProfile") def DlpPredefinedProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DlpPredefinedProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.DlpPredefinedProfileArgs.builder
    com.pulumi.cloudflare.DlpPredefinedProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DLS: Read`
   * - `DLS: Write`
   * - `IP Prefixes: Write`
   */
  def DlsPrefixBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DlsPrefixBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.DlsPrefixBindingArgs.builder
    com.pulumi.cloudflare.DlsPrefixBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Firewall Read`
   * - `DNS Firewall Write`
   */
  def DnsFirewall(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsFirewallArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsFirewallArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsFirewall(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  def DnsRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsRecordArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsRecordArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  def DnsZoneTransfersAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersAclArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  def DnsZoneTransfersIncoming(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersIncomingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersIncomingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersIncoming(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  def DnsZoneTransfersOutgoing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersOutgoingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersOutgoingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersOutgoing(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  def DnsZoneTransfersPeer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersPeerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersPeerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersPeer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  def DnsZoneTransfersTsig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.DnsZoneTransfersTsigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.DnsZoneTransfersTsigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.DnsZoneTransfersTsig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Email Routing Addresses Read`
   * - `Email Routing Addresses Write`
   */
  def EmailRoutingAddress(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingAddressArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailRoutingAddressArgs.builder
    com.pulumi.cloudflare.EmailRoutingAddress(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Email Routing Rules Read`
   * - `Email Routing Rules Write`
   */
  def EmailRoutingCatchAll(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingCatchAllArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailRoutingCatchAllArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailRoutingCatchAll(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  def EmailRoutingDns(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingDnsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailRoutingDnsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailRoutingDns(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Email Routing Rules Read`
   * - `Email Routing Rules Write`
   */
  def EmailRoutingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailRoutingRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailRoutingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  def EmailRoutingSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailRoutingSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailRoutingSettingsArgs.builder
    com.pulumi.cloudflare.EmailRoutingSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  def EmailSecurityAllowPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityAllowPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityAllowPolicyArgs.builder
    com.pulumi.cloudflare.EmailSecurityAllowPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  def EmailSecurityBlockSender(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityBlockSenderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityBlockSenderArgs.builder
    com.pulumi.cloudflare.EmailSecurityBlockSender(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  def EmailSecurityDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityDomainArgs.builder
    com.pulumi.cloudflare.EmailSecurityDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  def EmailSecurityImpersonationRegistry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityImpersonationRegistryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailSecurityImpersonationRegistryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailSecurityImpersonationRegistry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloud Email Security: Read`
   * - `Cloud Email Security: Write`
   */
  def EmailSecurityTrustedDomains(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSecurityTrustedDomainsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.EmailSecurityTrustedDomainsArgs.builder
    com.pulumi.cloudflare.EmailSecurityTrustedDomains(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def EmailSendingSubdomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.EmailSendingSubdomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.EmailSendingSubdomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.EmailSendingSubdomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def FieldExtractor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.FieldExtractorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FieldExtractorArgs.builder
    com.pulumi.cloudflare.FieldExtractor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def Filter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.FilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FilterArgs.builder
    com.pulumi.cloudflare.Filter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.FirewallRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FirewallRuleArgs.builder
    com.pulumi.cloudflare.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Flagship Read`
   * - `Flagship Write`
   */
  def FlagshipApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.FlagshipAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.FlagshipAppArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.FlagshipApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Flagship Read`
   * - `Flagship Write`
   */
  def FlagshipFlag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.FlagshipFlagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.FlagshipFlagArgs.builder
    com.pulumi.cloudflare.FlagshipFlag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zaraz Admin`
   * - `Zaraz Edit`
   * - `Zaraz Read`
   */
  def GoogleTagGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.GoogleTagGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.GoogleTagGatewayArgs.builder
    com.pulumi.cloudflare.GoogleTagGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Health Checks Read`
   * - `Health Checks Write`
   */
  def Healthcheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.HealthcheckArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.HealthcheckArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Healthcheck(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Write`
   */
  def HostnameTlsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.HostnameTlsSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.HostnameTlsSettingArgs.builder
    com.pulumi.cloudflare.HostnameTlsSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Hyperdrive Read`
   * - `Hyperdrive Write`
   */
  def HyperdriveConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.HyperdriveConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.HyperdriveConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.HyperdriveConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ImageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ImageArgs.builder
    com.pulumi.cloudflare.Image(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Images Read`
   * - `Images Write`
   */
  def ImageVariant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ImageVariantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ImageVariantArgs.builder
    com.pulumi.cloudflare.ImageVariant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def KeylessCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.KeylessCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.KeylessCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.KeylessCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  def LeakedCredentialCheck(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LeakedCredentialCheckArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LeakedCredentialCheckArgs.builder
    com.pulumi.cloudflare.LeakedCredentialCheck(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account WAF Read`
   * - `Account WAF Write`
   * - `Zone WAF Read`
   * - `Zone WAF Write`
   */
  def LeakedCredentialCheckRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LeakedCredentialCheckRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LeakedCredentialCheckRuleArgs.builder
    com.pulumi.cloudflare.LeakedCredentialCheckRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def List(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.List(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Filter Lists Edit`
   * - `Account Filter Lists Read`
   */
  def ListItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ListItemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ListItemArgs.builder
    com.pulumi.cloudflare.ListItem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Load Balancers Read`
   * - `Load Balancers Write`
   */
  def LoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.LoadBalancerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.LoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Load Balancing: Monitors and Pools Read`
   * - `Load Balancing: Monitors and Pools Write`
   */
  def LoadBalancerMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerMonitorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LoadBalancerMonitorArgs.builder
    com.pulumi.cloudflare.LoadBalancerMonitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def LoadBalancerMonitorGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerMonitorGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LoadBalancerMonitorGroupArgs.builder
    com.pulumi.cloudflare.LoadBalancerMonitorGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Load Balancing: Monitors and Pools Read`
   * - `Load Balancing: Monitors and Pools Write`
   */
  def LoadBalancerPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LoadBalancerPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.LoadBalancerPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.LoadBalancerPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Logs Read`
   * - `Logs Write`
   */
  def LogpullRetention(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LogpullRetentionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LogpullRetentionArgs.builder
    com.pulumi.cloudflare.LogpullRetention(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Logs Write`
   */
  def LogpushJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LogpushJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.LogpushJobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.LogpushJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Logs Write`
   */
  def LogpushOwnershipChallenge(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.LogpushOwnershipChallengeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.LogpushOwnershipChallengeArgs.builder
    com.pulumi.cloudflare.LogpushOwnershipChallenge(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Network Monitoring Admin`
   * - `Magic Network Monitoring Config Read`
   * - `Magic Network Monitoring Config Write`
   */
  def MagicNetworkMonitoringConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicNetworkMonitoringConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicNetworkMonitoringConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicNetworkMonitoringConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Network Monitoring Admin`
   * - `Magic Network Monitoring Config Read`
   * - `Magic Network Monitoring Config Write`
   */
  def MagicNetworkMonitoringRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicNetworkMonitoringRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicNetworkMonitoringRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicNetworkMonitoringRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  def MagicTransitCf1Site(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitCf1SiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitCf1SiteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitCf1Site(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MagicTransitConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.MagicTransitConnectorArgs.builder
    com.pulumi.cloudflare.MagicTransitConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  def MagicTransitSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  def MagicTransitSiteAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteAclArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSiteAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  def MagicTransitSiteLan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteLanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteLanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSiteLan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Magic Transit Read`
   * - `Magic Transit Write`
   * - `Magic WAN Read`
   * - `Magic WAN Write`
   */
  def MagicTransitSiteWan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicTransitSiteWanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicTransitSiteWanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicTransitSiteWan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MagicWanBgpFilterProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanBgpFilterProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicWanBgpFilterProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicWanBgpFilterProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MagicWanGreTunnel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanGreTunnelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicWanGreTunnelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicWanGreTunnel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MagicWanIpsecTunnel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MagicWanIpsecTunnelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MagicWanIpsecTunnel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MagicWanStaticRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MagicWanStaticRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.MagicWanStaticRouteArgs.builder
    com.pulumi.cloudflare.MagicWanStaticRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  @deprecated("cloudflare.index/managedheaders.ManagedHeaders has been deprecated in favor of cloudflare.index/managedtransforms.ManagedTransforms") def ManagedHeaders(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ManagedHeadersArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ManagedHeadersArgs.builder
    com.pulumi.cloudflare.ManagedHeaders(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ManagedTransforms(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ManagedTransformsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ManagedTransformsArgs.builder
    com.pulumi.cloudflare.ManagedTransforms(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MonetizationRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MonetizationRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.MonetizationRulesArgs.builder
    com.pulumi.cloudflare.MonetizationRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MoqRelay(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MoqRelayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MoqRelayArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MoqRelay(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def MtlsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.MtlsCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.MtlsCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.MtlsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  def NelSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.NelSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.NelSettingArgs.builder
    com.pulumi.cloudflare.NelSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Notifications Read`
   * - `Notifications Write`
   * - `Zero Trust: PII Read`
   */
  def NotificationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.NotificationPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.NotificationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.NotificationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Notifications Read`
   * - `Notifications Write`
   * - `Zero Trust: PII Read`
   */
  def NotificationPolicyWebhooks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.NotificationPolicyWebhooksArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.NotificationPolicyWebhooksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.NotificationPolicyWebhooks(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `OAuth Client Read`
   * - `OAuth Client Write`
   */
  def OauthClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.OauthClientArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OauthClientArgs.builder
    com.pulumi.cloudflare.OauthClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  def ObservatoryScheduledTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ObservatoryScheduledTestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ObservatoryScheduledTestArgs.builder
    com.pulumi.cloudflare.ObservatoryScheduledTest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `User Details Write`
   */
  def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.OrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.OrganizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Organization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def OrganizationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.OrganizationProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OrganizationProfileArgs.builder
    com.pulumi.cloudflare.OrganizationProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def OriginCaCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.OriginCaCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OriginCaCertificateArgs.builder
    com.pulumi.cloudflare.OriginCaCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def OriginCloudRegion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.OriginCloudRegionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OriginCloudRegionArgs.builder
    com.pulumi.cloudflare.OriginCloudRegion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def OriginTlsComplianceModes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.OriginTlsComplianceModesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.OriginTlsComplianceModesArgs.builder
    com.pulumi.cloudflare.OriginTlsComplianceModes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def PageRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PageRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.PageRuleArgs.builder
    com.pulumi.cloudflare.PageRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def PageShieldPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PageShieldPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.PageShieldPolicyArgs.builder
    com.pulumi.cloudflare.PageShieldPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Pages Read`
   * - `Pages Write`
   * 
   * &gt; A DNS record for the domain is not automatically created. You need to create
   *    a `cloudflareRecord` resource for the domain you want to use.
   */
  def PagesDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PagesDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PagesDomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PagesDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def PagesProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PagesProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PagesProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PagesProject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Pipelines Read`
   * - `Pipelines Write`
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Pipelines Read`
   * - `Pipelines Write`
   */
  def PipelineSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PipelineSinkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PipelineSinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PipelineSink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Pipelines Read`
   * - `Pipelines Write`
   */
  def PipelineStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PipelineStreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.PipelineStreamArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.PipelineStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def Precursor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.PrecursorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.PrecursorArgs.builder
    com.pulumi.cloudflare.Precursor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The provider type for the cloudflare package. By default, resources use package-wide configuration
   * settings, however an explicit `Provider` instance may be created and passed during resource
   * construction to achieve fine-grained programmatic control over provider settings. See the
   * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
   */
  def Provider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ProviderArgs.builder
    com.pulumi.cloudflare.Provider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Queues Read`
   * - `Queues Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.QueueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.QueueArgs.builder
    com.pulumi.cloudflare.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Queues Read`
   * - `Queues Write`
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  def QueueConsumer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.QueueConsumerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.QueueConsumerArgs.builder
    com.pulumi.cloudflare.QueueConsumer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Write`
   */
  def R2Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.R2BucketArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.R2Bucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def R2BucketCors(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketCorsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketCorsArgs.builder
    com.pulumi.cloudflare.R2BucketCors(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Read`
   * - `Workers R2 Storage Write`
   */
  def R2BucketEventNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketEventNotificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketEventNotificationArgs.builder
    com.pulumi.cloudflare.R2BucketEventNotification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def R2BucketLifecycle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketLifecycleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketLifecycleArgs.builder
    com.pulumi.cloudflare.R2BucketLifecycle(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def R2BucketLock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketLockArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketLockArgs.builder
    com.pulumi.cloudflare.R2BucketLock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Write`
   */
  def R2BucketSippy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2BucketSippyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2BucketSippyArgs.builder
    com.pulumi.cloudflare.R2BucketSippy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Storage Read`
   * - `Workers R2 Storage Write`
   */
  def R2CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2CustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2CustomDomainArgs.builder
    com.pulumi.cloudflare.R2CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers R2 Data Catalog Read`
   * - `Workers R2 Data Catalog Write`
   */
  def R2DataCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2DataCatalogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2DataCatalogArgs.builder
    com.pulumi.cloudflare.R2DataCatalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def R2ManagedDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.R2ManagedDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.R2ManagedDomainArgs.builder
    com.pulumi.cloudflare.R2ManagedDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def RateLimit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.RateLimitArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RateLimitArgs.builder
    com.pulumi.cloudflare.RateLimit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  @deprecated("cloudflare.index/record.Record has been deprecated in favor of cloudflare.index/dnsrecord.DnsRecord") def Record(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.RecordArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.RecordArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Record(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  def RegionalHostname(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.RegionalHostnameArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RegionalHostnameArgs.builder
    com.pulumi.cloudflare.RegionalHostname(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  def RegionalTieredCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.RegionalTieredCacheArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RegionalTieredCacheArgs.builder
    com.pulumi.cloudflare.RegionalTieredCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/riskbehavior.RiskBehavior has been deprecated in favor of cloudflare.index/zerotrustriskbehavior.ZeroTrustRiskBehavior") def RiskBehavior(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.RiskBehaviorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.RiskBehaviorArgs.builder
    com.pulumi.cloudflare.RiskBehavior(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def Ruleset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.RulesetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.RulesetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Ruleset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  def SchemaValidationOperationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SchemaValidationOperationSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SchemaValidationOperationSettingsArgs.builder
    com.pulumi.cloudflare.SchemaValidationOperationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  def SchemaValidationSchemas(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SchemaValidationSchemasArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.SchemaValidationSchemasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.SchemaValidationSchemas(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  def SchemaValidationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SchemaValidationSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SchemaValidationSettingsArgs.builder
    com.pulumi.cloudflare.SchemaValidationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Secrets Store Read`
   * - `Secrets Store Write`
   */
  def SecretsStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SecretsStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.SecretsStoreArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.SecretsStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Secrets Store Read`
   * - `Secrets Store Write`
   */
  def SecretsStoreSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SecretsStoreSecretArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.SecretsStoreSecretArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.SecretsStoreSecret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def Share(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ShareArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ShareArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Share(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ShareRecipient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ShareRecipientArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ShareRecipientArgs.builder
    com.pulumi.cloudflare.ShareRecipient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ShareResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ShareResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ShareResourceArgs.builder
    com.pulumi.cloudflare.ShareResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Snippets Read`
   * - `Snippets Write`
   */
  def Snippet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SnippetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SnippetArgs.builder
    com.pulumi.cloudflare.Snippet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Snippets Read`
   * - `Snippets Write`
   */
  def SnippetRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SnippetRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SnippetRulesArgs.builder
    com.pulumi.cloudflare.SnippetRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * ## Import
   * 
   * &gt; This resource does not currently support `pulumi import`.
   */
  def Snippets(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SnippetsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SnippetsArgs.builder
    com.pulumi.cloudflare.Snippets(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   */
  def SpectrumApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SpectrumApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SpectrumApplicationArgs.builder
    com.pulumi.cloudflare.SpectrumApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSO Connector Read`
   * - `SSO Connector Write`
   */
  def SsoConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.SsoConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.SsoConnectorArgs.builder
    com.pulumi.cloudflare.SsoConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  @deprecated("cloudflare.index/staticroute.StaticRoute has been deprecated in favor of cloudflare.index/magicwanstaticroute.MagicWanStaticRoute") def StaticRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StaticRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StaticRouteArgs.builder
    com.pulumi.cloudflare.StaticRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamArgs.builder
    com.pulumi.cloudflare.Stream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamAudioTrack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamAudioTrackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamAudioTrackArgs.builder
    com.pulumi.cloudflare.StreamAudioTrack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamCaptionLanguage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamCaptionLanguageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamCaptionLanguageArgs.builder
    com.pulumi.cloudflare.StreamCaptionLanguage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamDownload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamDownloadArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamDownloadArgs.builder
    com.pulumi.cloudflare.StreamDownload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamKeyArgs.builder
    com.pulumi.cloudflare.StreamKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamLiveInput(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamLiveInputArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamLiveInputArgs.builder
    com.pulumi.cloudflare.StreamLiveInput(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamWatermark(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamWatermarkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.StreamWatermarkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.StreamWatermark(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Stream Read`
   * - `Stream Write`
   */
  def StreamWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.StreamWebhookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.StreamWebhookArgs.builder
    com.pulumi.cloudflare.StreamWebhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  @deprecated("cloudflare.index/teamsaccount.TeamsAccount has been deprecated in favor of cloudflare.index/zerotrustgatewaysettings.ZeroTrustGatewaySettings") def TeamsAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsAccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TeamsAccountArgs.builder
    com.pulumi.cloudflare.TeamsAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  @deprecated("cloudflare.index/teamslist.TeamsList has been deprecated in favor of cloudflare.index/zerotrustlist.ZeroTrustList") def TeamsList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare Zero Trust Secure DNS Locations Write`
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/teamslocation.TeamsLocation has been deprecated in favor of cloudflare.index/zerotrustdnslocation.ZeroTrustDnsLocation") def TeamsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsLocationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsLocationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  @deprecated("cloudflare.index/teamsproxyendpoint.TeamsProxyEndpoint has been deprecated in favor of cloudflare.index/zerotrustgatewayproxyendpoint.ZeroTrustGatewayProxyEndpoint") def TeamsProxyEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsProxyEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsProxyEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsProxyEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  @deprecated("cloudflare.index/teamsrule.TeamsRule has been deprecated in favor of cloudflare.index/zerotrustgatewaypolicy.ZeroTrustGatewayPolicy") def TeamsRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TeamsRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TeamsRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TeamsRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  def TieredCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TieredCacheArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TieredCacheArgs.builder
    com.pulumi.cloudflare.TieredCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  def TokenValidationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TokenValidationConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TokenValidationConfigArgs.builder
    com.pulumi.cloudflare.TokenValidationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account API Gateway`
   * - `Account API Gateway Read`
   * - `Domain API Gateway`
   * - `Domain API Gateway Read`
   */
  def TokenValidationRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TokenValidationRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TokenValidationRulesArgs.builder
    com.pulumi.cloudflare.TokenValidationRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def TotalTls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TotalTlsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TotalTlsArgs.builder
    com.pulumi.cloudflare.TotalTls(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  @deprecated("cloudflare.index/tunnel.Tunnel has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflared.ZeroTrustTunnelCloudflared") def Tunnel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TunnelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Tunnel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  @deprecated("cloudflare.index/tunnelconfig.TunnelConfig has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflaredconfig.ZeroTrustTunnelCloudflaredConfig") def TunnelConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TunnelConfigArgs.builder
    com.pulumi.cloudflare.TunnelConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  @deprecated("cloudflare.index/tunnelroute.TunnelRoute has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflaredroute.ZeroTrustTunnelCloudflaredRoute") def TunnelRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.TunnelRouteArgs.builder
    com.pulumi.cloudflare.TunnelRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  @deprecated("cloudflare.index/tunnelvirtualnetwork.TunnelVirtualNetwork has been deprecated in favor of cloudflare.index/zerotrusttunnelcloudflaredvirtualnetwork.ZeroTrustTunnelCloudflaredVirtualNetwork") def TunnelVirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TunnelVirtualNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TunnelVirtualNetworkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TunnelVirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `Turnstile Sites Read`
   * - `Turnstile Sites Write`
   */
  def TurnstileWidget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.TurnstileWidgetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.TurnstileWidgetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.TurnstileWidget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def UniversalSslSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.UniversalSslSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UniversalSslSettingArgs.builder
    com.pulumi.cloudflare.UniversalSslSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def UrlNormalizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.UrlNormalizationSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UrlNormalizationSettingsArgs.builder
    com.pulumi.cloudflare.UrlNormalizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `User Details Read`
   * - `User Details Write`
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.UserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UserArgs.builder
    com.pulumi.cloudflare.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   */
  def UserAgentBlockingRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.UserAgentBlockingRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UserAgentBlockingRuleArgs.builder
    com.pulumi.cloudflare.UserAgentBlockingRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `SCIM Provisioning`
   */
  def UserGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.UserGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.UserGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.UserGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   * - `SCIM Provisioning`
   */
  def UserGroupMembers(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.UserGroupMembersArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.UserGroupMembersArgs.builder
    com.pulumi.cloudflare.UserGroupMembers(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def VulnerabilityScannerCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.VulnerabilityScannerCredentialArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.VulnerabilityScannerCredentialArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.VulnerabilityScannerCredential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def VulnerabilityScannerCredentialSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.VulnerabilityScannerCredentialSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.VulnerabilityScannerCredentialSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.VulnerabilityScannerCredentialSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def VulnerabilityScannerTargetEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.VulnerabilityScannerTargetEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  def WaitingRoom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WaitingRoomArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WaitingRoom(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  def WaitingRoomEvent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomEventArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WaitingRoomEventArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WaitingRoomEvent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  def WaitingRoomRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WaitingRoomRulesArgs.builder
    com.pulumi.cloudflare.WaitingRoomRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Waiting Rooms Read`
   * - `Waiting Rooms Write`
   */
  def WaitingRoomSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WaitingRoomSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WaitingRoomSettingsArgs.builder
    com.pulumi.cloudflare.WaitingRoomSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Web3 Hostnames Read`
   * - `Web3 Hostnames Write`
   */
  def Web3Hostname(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.Web3HostnameArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.Web3HostnameArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Web3Hostname(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def WebAnalyticsRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WebAnalyticsRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WebAnalyticsRuleArgs.builder
    com.pulumi.cloudflare.WebAnalyticsRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Account Settings Read`
   * - `Account Settings Write`
   */
  def WebAnalyticsSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WebAnalyticsSiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WebAnalyticsSiteArgs.builder
    com.pulumi.cloudflare.WebAnalyticsSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  def Worker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WorkerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Worker(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  @deprecated("cloudflare.index/workercrontrigger.WorkerCronTrigger has been deprecated in favor of cloudflare.index/workerscrontrigger.WorkersCronTrigger") def WorkerCronTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerCronTriggerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerCronTriggerArgs.builder
    com.pulumi.cloudflare.WorkerCronTrigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  @deprecated("cloudflare.index/workerdomain.WorkerDomain has been deprecated in favor of cloudflare.index/workerscustomdomain.WorkersCustomDomain") def WorkerDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerDomainArgs.builder
    com.pulumi.cloudflare.WorkerDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * 
   * &gt; For more direct control over Workers resources, we recommend the beta `cloudflare.Worker`, `cloudflare.WorkerVersion`, and `cloudflare.WorkersDeployment` resources. See how to use them in the [developer documentation](https://developers.cloudflare.com/workers/platform/infrastructure-as-code/).
   */
  @deprecated("cloudflare.index/workerscript.WorkerScript has been deprecated in favor of cloudflare.index/workersscript.WorkersScript") def WorkerScript(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerScriptArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerScriptArgs.builder
    com.pulumi.cloudflare.WorkerScript(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  def WorkerVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkerVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkerVersionArgs.builder
    com.pulumi.cloudflare.WorkerVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  def WorkersCronTrigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersCronTriggerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersCronTriggerArgs.builder
    com.pulumi.cloudflare.WorkersCronTrigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   */
  def WorkersCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersCustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersCustomDomainArgs.builder
    com.pulumi.cloudflare.WorkersCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  def WorkersDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersDeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersDeploymentArgs.builder
    com.pulumi.cloudflare.WorkersDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  def WorkersForPlatformsDispatchNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersForPlatformsDispatchNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WorkersForPlatformsDispatchNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WorkersForPlatformsDispatchNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  @deprecated("cloudflare.index/workersforplatformsnamespace.WorkersForPlatformsNamespace has been deprecated in favor of cloudflare.index/workersforplatformsdispatchnamespace.WorkersForPlatformsDispatchNamespace") def WorkersForPlatformsNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersForPlatformsNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.WorkersForPlatformsNamespaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.WorkersForPlatformsNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers KV Storage Read`
   * - `Workers KV Storage Write`
   */
  def WorkersKv(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersKvArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersKvArgs.builder
    com.pulumi.cloudflare.WorkersKv(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers KV Storage Read`
   * - `Workers KV Storage Write`
   */
  def WorkersKvNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersKvNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersKvNamespaceArgs.builder
    com.pulumi.cloudflare.WorkersKvNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Routes Read`
   * - `Workers Routes Write`
   */
  def WorkersRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersRouteArgs.builder
    com.pulumi.cloudflare.WorkersRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * 
   * &gt; For more direct control over Workers resources, we recommend the beta `cloudflare.Worker`, `cloudflare.WorkerVersion`, and `cloudflare.WorkersDeployment` resources. See how to use them in the [developer documentation](https://developers.cloudflare.com/workers/platform/infrastructure-as-code/).
   */
  def WorkersScript(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersScriptArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersScriptArgs.builder
    com.pulumi.cloudflare.WorkersScript(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   * 
   * &gt; This resource is redundant with `cloudflare.Worker` and should not be used together. When using the `cloudflare.Worker` resource, use the nested `subdomain` attribute to control subdomain settings instead.
   */
  def WorkersScriptSubdomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkersScriptSubdomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkersScriptSubdomainArgs.builder
    com.pulumi.cloudflare.WorkersScriptSubdomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Workers Scripts Read`
   * - `Workers Scripts Write`
   * - `Workers Tail Read`
   */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.WorkflowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.WorkflowArgs.builder
    com.pulumi.cloudflare.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `MCP Portals Read`
   * - `MCP Portals Write`
   */
  def ZeroTrustAccessAiControlsMcpPortal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortalArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortalArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpPortal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `MCP Portals Read`
   * - `MCP Portals Write`
   */
  def ZeroTrustAccessAiControlsMcpServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessAiControlsMcpServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustAccessApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Custom Pages Read`
   * - `Access: Custom Pages Write`
   */
  def ZeroTrustAccessCustomPage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessCustomPageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessCustomPageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessCustomPage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  def ZeroTrustAccessGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  def ZeroTrustAccessIdentityProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessIdentityProviderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessIdentityProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustAccessInfrastructureTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessInfrastructureTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  def ZeroTrustAccessKeyConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessKeyConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessKeyConfigurationArgs.builder
    com.pulumi.cloudflare.ZeroTrustAccessKeyConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  def ZeroTrustAccessMtlsCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessMtlsCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessMtlsCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessMtlsCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Mutual TLS Certificates Read`
   * - `Access: Mutual TLS Certificates Write`
   */
  def ZeroTrustAccessMtlsHostnameSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustAccessMtlsHostnameSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  def ZeroTrustAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Service Tokens Read`
   * - `Access: Service Tokens Write`
   */
  def ZeroTrustAccessServiceToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessServiceTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessServiceTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessServiceToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Apps and Policies Read`
   * - `Access: Apps and Policies Write`
   */
  def ZeroTrustAccessShortLivedCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessShortLivedCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessShortLivedCertificateArgs.builder
    com.pulumi.cloudflare.ZeroTrustAccessShortLivedCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustAccessTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustAccessTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustAccessTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustAccessTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates and manages a CASB integration. Exactly one vendor and exactly one authentication method must be configured. */
  def ZeroTrustCasbIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustCasbIntegrationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustCasbIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustCasbPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustCasbPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustCasbPolicyArgs.builder
    com.pulumi.cloudflare.ZeroTrustCasbPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustCasbWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustCasbWebhookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustCasbWebhookArgs.builder
    com.pulumi.cloudflare.ZeroTrustCasbWebhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Report`
   * - `Zero Trust Write`
   */
  def ZeroTrustConnectivitySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustConnectivitySettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustConnectivitySettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustConnectivitySettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceCustomProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceCustomProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceCustomProfileLocalDomainFallback(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallbackArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceCustomProfileLocalDomainFallback(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceDefaultProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `SSL and Certificates Read`
   * - `SSL and Certificates Write`
   */
  def ZeroTrustDeviceDefaultProfileCertificates(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileCertificatesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileCertificatesArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileCertificates(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceDefaultProfileLocalDomainFallback(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallbackArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceDefaultProfileLocalDomainFallback(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustDeviceDeploymentGroups(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroupsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroupsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceDeploymentGroups(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceIpProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceIpProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceIpProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceIpProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceManagedNetworks(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworksArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworksArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceManagedNetworks(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDevicePostureIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDevicePostureIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDevicePostureIntegrationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDevicePostureIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDevicePostureRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDevicePostureRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDevicePostureRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  def ZeroTrustDeviceSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceSettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustDeviceSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Read`
   * - `Cloudflare One Networks Write`
   */
  def ZeroTrustDeviceSubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDeviceSubnetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDeviceSubnetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDeviceSubnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare DEX Read`
   * - `Cloudflare DEX Write`
   * - `Zero Trust Read`
   * - `Zero Trust Report`
   */
  def ZeroTrustDexRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDexRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDexRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDexRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare DEX Read`
   * - `Cloudflare DEX Write`
   * - `Zero Trust Read`
   * - `Zero Trust Report`
   */
  def ZeroTrustDexTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDexTestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDexTestArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDexTest(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpCustomEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpCustomEntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpCustomEntryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpCustomEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpCustomProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpCustomProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpCustomProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpDataClass(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDataClassArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDataClassArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataClass(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpDataTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDataTagArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDataTagArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpDataTagCategory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDataTagCategoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDataTagCategoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataTagCategory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpDatasetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpDatasetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpDataset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpEntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpEntryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpIntegrationEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpIntegrationEntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpIntegrationEntryArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpIntegrationEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpPredefinedEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpPredefinedEntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpPredefinedEntryArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpPredefinedEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpPredefinedProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfileArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpPredefinedProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpSensitivityGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSensitivityGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSensitivityGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpSensitivityGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpSensitivityLevel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpSensitivityLevelOrder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelOrderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelOrderArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpSensitivityLevelOrder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDlpSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDlpSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustDlpSettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustDlpSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare Zero Trust Secure DNS Locations Write`
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustDnsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustDnsLocationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustDnsLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustGatewayCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayCertificateArgs.builder
    com.pulumi.cloudflare.ZeroTrustGatewayCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustGatewayLogging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayLoggingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayLoggingArgs.builder
    com.pulumi.cloudflare.ZeroTrustGatewayLogging(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustGatewayPacfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayPacfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayPacfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustGatewayPacfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustGatewayPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustGatewayPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustGatewayProxyEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustGatewayProxyEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustGatewaySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustGatewaySettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustGatewaySettingsArgs.builder
    com.pulumi.cloudflare.ZeroTrustGatewaySettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustListArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Write`
   */
  @deprecated("cloudflare.index/zerotrustlocalfallbackdomain.ZeroTrustLocalFallbackDomain has been deprecated in favor of cloudflare.index/zerotrustdevicecustomprofilelocaldomainfallback.ZeroTrustDeviceCustomProfileLocalDomainFallback") def ZeroTrustLocalFallbackDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustLocalFallbackDomainArgs.builder
    com.pulumi.cloudflare.ZeroTrustLocalFallbackDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Read`
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Read`
   * - `Cloudflare Tunnel Write`
   */
  def ZeroTrustNetworkHostnameRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustNetworkHostnameRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustNetworkHostnameRouteArgs.builder
    com.pulumi.cloudflare.ZeroTrustNetworkHostnameRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Access: Organizations, Identity Providers, and Groups Read`
   * - `Access: Organizations, Identity Providers, and Groups Revoke`
   * - `Access: Organizations, Identity Providers, and Groups Write`
   */
  def ZeroTrustOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustOrganizationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustOrganizationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustOrganization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZeroTrustResourceLibraryApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustResourceLibraryApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustResourceLibraryApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustResourceLibraryApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustRiskBehavior(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustRiskBehaviorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustRiskBehaviorArgs.builder
    com.pulumi.cloudflare.ZeroTrustRiskBehavior(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zero Trust Read`
   * - `Zero Trust Write`
   */
  def ZeroTrustRiskScoringIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustRiskScoringIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustRiskScoringIntegrationArgs.builder
    com.pulumi.cloudflare.ZeroTrustRiskScoringIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ZeroTrustTunnelCloudflared(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflared(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ZeroTrustTunnelCloudflaredConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfigArgs.builder
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  def ZeroTrustTunnelCloudflaredRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredRouteArgs.builder
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Networks Write`
   * - `Cloudflare Tunnel Write`
   */
  def ZeroTrustTunnelCloudflaredVirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredVirtualNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredVirtualNetworkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustTunnelCloudflaredVirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: WARP Read`
   * - `Cloudflare One Connector: WARP Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   */
  def ZeroTrustTunnelWarpConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.ZeroTrustTunnelWarpConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Cloudflare One Connector: WARP Read`
   * - `Cloudflare One Connector: WARP Write`
   * - `Cloudflare One Connectors Read`
   * - `Cloudflare One Connectors Write`
   */
  def ZeroTrustTunnelWarpConnectorConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfigArgs.builder
    com.pulumi.cloudflare.ZeroTrustTunnelWarpConnectorConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.cloudflare.ZoneArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.cloudflare.Zone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZoneAutoOriginTlsKex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneAutoOriginTlsKexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneAutoOriginTlsKexArgs.builder
    com.pulumi.cloudflare.ZoneAutoOriginTlsKex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  def ZoneCacheReserve(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneCacheReserveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneCacheReserveArgs.builder
    com.pulumi.cloudflare.ZoneCacheReserve(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Zone Read`
   * - `Zone Settings Read`
   * - `Zone Settings Write`
   * - `Zone Write`
   */
  def ZoneCacheVariants(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneCacheVariantsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneCacheVariantsArgs.builder
    com.pulumi.cloudflare.ZoneCacheVariants(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   * - `Zone DNS Settings Read`
   * - `Zone DNS Settings Write`
   */
  def ZoneDnsSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneDnsSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneDnsSettingsArgs.builder
    com.pulumi.cloudflare.ZoneDnsSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `DNS Read`
   * - `DNS Write`
   */
  def ZoneDnssec(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneDnssecArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneDnssecArgs.builder
    com.pulumi.cloudflare.ZoneDnssec(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ZoneHold(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneHoldArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneHoldArgs.builder
    com.pulumi.cloudflare.ZoneHold(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Firewall Services Read`
   * - `Firewall Services Write`
   */
  def ZoneLockdown(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneLockdownArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneLockdownArgs.builder
    com.pulumi.cloudflare.ZoneLockdown(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def ZoneSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneSettingArgs.builder
    com.pulumi.cloudflare.ZoneSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Accepted Permissions
   * 
   * - `Billing Read`
   * - `Billing Write`
   */
  def ZoneSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneSubscriptionArgs.builder
    com.pulumi.cloudflare.ZoneSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZoneTracing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneTracingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneTracingArgs.builder
    com.pulumi.cloudflare.ZoneTracing(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  def ZoneTracingRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.cloudflare.ZoneTracingRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.cloudflare.ZoneTracingRulesArgs.builder
    com.pulumi.cloudflare.ZoneTracingRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
