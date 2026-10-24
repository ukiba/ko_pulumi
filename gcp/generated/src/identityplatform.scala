package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object identityplatform:
  /**
   * Identity Platform configuration for a Cloud project. Identity Platform is an
   * end-to-end authentication system for third-party users to access apps
   * and services.
   * 
   * This entity is created only once during intialization and cannot be deleted,
   * individual Identity Providers may be disabled instead.  This resource may only
   * be created in billing-enabled projects.
   * 
   * To get more information about Config, see:
   * 
   * * [API documentation](https://cloud.google.com/identity-platform/docs/reference/rest/v2/Config)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/identity-platform/docs)
   */
  inline def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.ConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.identityplatform.ConfigArgs.builder
    com.pulumi.gcp.identityplatform.Config(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Configurations options for authenticating with a the standard set of Identity Toolkit-trusted IDPs.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   */
  inline def DefaultSupportedIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.DefaultSupportedIdpConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.identityplatform.DefaultSupportedIdpConfigArgs.builder
    com.pulumi.gcp.identityplatform.DefaultSupportedIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Inbound SAML configuration for a Identity Toolkit project.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   */
  inline def InboundSamlConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.InboundSamlConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * OIDC IdP configuration for a Identity Toolkit project.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   */
  inline def OauthIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.OauthIdpConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.OauthIdpConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.OauthIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Tenant configuration in a multi-tenant project.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   * 
   * You must [enable multi-tenancy](https://cloud.google.com/identity-platform/docs/multi-tenancy-quickstart) via
   * the Cloud Console prior to creating tenants.
   */
  inline def Tenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.identityplatform.TenantArgs.builder
    com.pulumi.gcp.identityplatform.Tenant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Configurations options for the tenant for authenticating with a the standard set of Identity Toolkit-trusted IDPs.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   */
  inline def TenantDefaultSupportedIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfigArgs.builder
    com.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Inbound SAML configuration for a Identity Toolkit tenant.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   */
  inline def TenantInboundSamlConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.TenantInboundSamlConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * OIDC IdP configuration for a Identity Toolkit project within a tenant.
   * 
   * You must enable the
   * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   * the marketplace prior to using this resource.
   */
  inline def TenantOauthIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.TenantOauthIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
