package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object identityplatform:
  extension (builder: com.pulumi.gcp.identityplatform.TenantArgs.Builder)
    /**
     * @param client Options related to how clients making requests on behalf of a tenant should be configured.
     *  Structure is documented below.
     * @return builder
     */
    def client(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantClientArgs.Builder]):
        com.pulumi.gcp.identityplatform.TenantArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantClientArgs.builder
      builder.client(args(argsBuilder).build)

  /**
   * Inbound SAML configuration for a Identity Toolkit tenant.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   */
  def TenantInboundSamlConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.TenantInboundSamlConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * OIDC IdP configuration for a Identity Toolkit project within a tenant.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   */
  def TenantOauthIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.TenantOauthIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.Builder)
    /**
     * @param idpConfig SAML IdP configuration when the project acts as the relying party
     *  Structure is documented below.
     * @return builder
     */
    def idpConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

    /**
     * @param spConfig SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     *  and accept an authentication assertion issued by a SAML identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def spConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.TenantInboundSamlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs.builder
      builder.spConfig(args(argsBuilder).build)

  /**
   * Configurations options for the tenant for authenticating with a the standard set of Identity Toolkit-trusted IDPs.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   */
  def TenantDefaultSupportedIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfigArgs.builder
    com.pulumi.gcp.identityplatform.TenantDefaultSupportedIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.identityplatform.OauthIdpConfigArgs.Builder)
    /**
     * @param responseType The response type to request for in the OAuth authorization flow.
     *  You can set either idToken or code to true, but not both.
     *  Setting both types to be simultaneously true ({code: true, idToken: true}) is not yet supported.
     *  Structure is documented below.
     * @return builder
     */
    def responseType(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.OauthIdpConfigResponseTypeArgs.Builder]):
        com.pulumi.gcp.identityplatform.OauthIdpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.OauthIdpConfigResponseTypeArgs.builder
      builder.responseType(args(argsBuilder).build)

  /**
   * OIDC IdP configuration for a Identity Toolkit project.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   */
  def OauthIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.OauthIdpConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.OauthIdpConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.OauthIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Inbound SAML configuration for a Identity Toolkit project.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   */
  def InboundSamlConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.identityplatform.InboundSamlConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Identity Platform configuration for a Cloud project. Identity Platform is an
   *  end-to-end authentication system for third-party users to access apps
   *  and services.
   * 
   *  This entity is created only once during intialization and cannot be deleted,
   *  individual Identity Providers may be disabled instead.  This resource may only
   *  be created in billing-enabled projects.
   * 
   *  To get more information about Config, see:
   * 
   *  * [API documentation](https://cloud.google.com/identity-platform/docs/reference/rest/v2/Config)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/identity-platform/docs)
   */
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.ConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.identityplatform.ConfigArgs.builder
    com.pulumi.gcp.identityplatform.Config(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Configurations options for authenticating with a the standard set of Identity Toolkit-trusted IDPs.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   */
  def DefaultSupportedIdpConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.DefaultSupportedIdpConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.identityplatform.DefaultSupportedIdpConfigArgs.builder
    com.pulumi.gcp.identityplatform.DefaultSupportedIdpConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Tenant configuration in a multi-tenant project.
   * 
   *  You must enable the
   *  [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
   *  the marketplace prior to using this resource.
   * 
   *  You must [enable multi-tenancy](https://cloud.google.com/identity-platform/docs/multi-tenancy-quickstart) via
   *  the Cloud Console prior to creating tenants.
   */
  def Tenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.identityplatform.TenantArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.identityplatform.TenantArgs.builder
    com.pulumi.gcp.identityplatform.Tenant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.Builder)
    /**
     * @param idpConfig SAML IdP configuration when the project acts as the relying party
     *  Structure is documented below.
     * @return builder
     */
    def idpConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

    /**
     * @param spConfig SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     *  and accept an authentication assertion issued by a SAML identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def spConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.InboundSamlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigArgs.builder
      builder.spConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.ConfigArgs.Builder)
    /**
     * @param blockingFunctions Configuration related to blocking functions.
     *  Structure is documented below.
     * @return builder
     */
    def blockingFunctions(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.builder
      builder.blockingFunctions(args(argsBuilder).build)

    /**
     * @param client Options related to how clients making requests on behalf of a project should be configured.
     *  Structure is documented below.
     * @return builder
     */
    def client(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigClientArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigClientArgs.builder
      builder.client(args(argsBuilder).build)

    /**
     * @param mfa Options related to how clients making requests on behalf of a project should be configured.
     *  Structure is documented below.
     * @return builder
     */
    def mfa(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMfaArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMfaArgs.builder
      builder.mfa(args(argsBuilder).build)

    /**
     * @param monitoring Configuration related to monitoring project activity.
     *  Structure is documented below.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param multiTenant Configuration related to multi-tenant functionality.
     *  Structure is documented below.
     * @return builder
     */
    def multiTenant(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMultiTenantArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMultiTenantArgs.builder
      builder.multiTenant(args(argsBuilder).build)

    /**
     * @param quota Configuration related to quotas.
     *  Structure is documented below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigQuotaArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

    /**
     * @param signIn Configuration related to local sign in methods.
     *  Structure is documented below.
     * @return builder
     */
    def signIn(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.builder
      builder.signIn(args(argsBuilder).build)

    /**
     * @param smsRegionConfig Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
     *  Structure is documented below.
     * @return builder
     */
    def smsRegionConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.builder
      builder.smsRegionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigMfaArgs.Builder)
    /**
     * @param providerConfigs A list of usable second factors for this project along with their configurations.
     *  This field does not support phone based MFA, for that use the &#39;enabledProviders&#39; field.
     *  Structure is documented below.
     * @return builder
     */
    def providerConfigs(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMfaProviderConfigArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.ConfigMfaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMfaProviderConfigArgs.builder
      builder.providerConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.Builder)
    /**
     * @param allowByDefault A policy of allowing SMS to every region by default and adding disallowed regions to a disallow list.
     *  Structure is documented below.
     * @return builder
     */
    def allowByDefault(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigAllowByDefaultArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigAllowByDefaultArgs.builder
      builder.allowByDefault(args(argsBuilder).build)

    /**
     * @param allowlistOnly A policy of only allowing regions by explicitly adding them to an allowlist.
     *  Structure is documented below.
     * @return builder
     */
    def allowlistOnly(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigAllowlistOnlyArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigAllowlistOnlyArgs.builder
      builder.allowlistOnly(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs.Builder)
    /**
     * @param idpCertificates The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     *  Structure is documented below.
     * @return builder
     */
    def idpCertificates(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigIdpCertificateArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigIdpCertificateArgs.builder
      builder.idpCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder)
    /**
     * @param anonymous Configuration options related to authenticating an anonymous user.
     *  Structure is documented below.
     * @return builder
     */
    def anonymous(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSignInAnonymousArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSignInAnonymousArgs.builder
      builder.anonymous(args(argsBuilder).build)

    /**
     * @param email Configuration options related to authenticating a user by their email address.
     *  Structure is documented below.
     * @return builder
     */
    def email(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSignInEmailArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSignInEmailArgs.builder
      builder.email(args(argsBuilder).build)

    /**
     * @param hashConfigs (Output)
     *  Output only. Hash config information.
     *  Structure is documented below.
     * @return builder
     */
    def hashConfigs(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSignInHashConfigArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSignInHashConfigArgs.builder
      builder.hashConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param phoneNumber Configuration options related to authenticated a user by their phone number.
     *  Structure is documented below.
     * @return builder
     */
    def phoneNumber(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSignInPhoneNumberArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSignInPhoneNumberArgs.builder
      builder.phoneNumber(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigArgs.Builder)
    /**
     * @param spCertificates (Output)
     *  The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedSpConfigSpCertificates&#34;&gt;&lt;/a&gt;The `spCertificates` block contains:
     * @return builder
     */
    def spCertificates(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigSpCertificateArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigSpCertificateArgs.builder
      builder.spCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigArgs.Builder)
    /**
     * @param idpCertificates The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     *  Structure is documented below.
     * @return builder
     */
    def idpCertificates(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigIdpCertificateArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigIdpCertificateArgs.builder
      builder.idpCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigState.Builder)
    /**
     * @param idpConfig SAML IdP configuration when the project acts as the relying party
     *  Structure is documented below.
     * @return builder
     */
    def idpConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

    /**
     * @param spConfig SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     *  and accept an authentication assertion issued by a SAML identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def spConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs.builder
      builder.spConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.TenantClientArgs.Builder)
    /**
     * @param permissions Configuration related to restricting a user&#39;s ability to affect their account.
     *  Structure is documented below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantClientPermissionsArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.TenantClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantClientPermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigMfaProviderConfigArgs.Builder)
    /**
     * @param totpProviderConfig TOTP MFA provider config for this project.
     *  Structure is documented below.
     * @return builder
     */
    def totpProviderConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMfaProviderConfigTotpProviderConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigMfaProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMfaProviderConfigTotpProviderConfigArgs.builder
      builder.totpProviderConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigQuotaArgs.Builder)
    /**
     * @param signUpQuotaConfig Quota for the Signup endpoint, if overwritten. Signup quota is measured in sign ups per project per hour per IP. None of quota, startTime, or quotaDuration can be skipped.
     *  Structure is documented below.
     * @return builder
     */
    def signUpQuotaConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigQuotaSignUpQuotaConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigQuotaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigQuotaSignUpQuotaConfigArgs.builder
      builder.signUpQuotaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder)
    /**
     * @param blockingFunctions Configuration related to blocking functions.
     *  Structure is documented below.
     * @return builder
     */
    def blockingFunctions(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.builder
      builder.blockingFunctions(args(argsBuilder).build)

    /**
     * @param client Options related to how clients making requests on behalf of a project should be configured.
     *  Structure is documented below.
     * @return builder
     */
    def client(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigClientArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigClientArgs.builder
      builder.client(args(argsBuilder).build)

    /**
     * @param mfa Options related to how clients making requests on behalf of a project should be configured.
     *  Structure is documented below.
     * @return builder
     */
    def mfa(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMfaArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMfaArgs.builder
      builder.mfa(args(argsBuilder).build)

    /**
     * @param monitoring Configuration related to monitoring project activity.
     *  Structure is documented below.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param multiTenant Configuration related to multi-tenant functionality.
     *  Structure is documented below.
     * @return builder
     */
    def multiTenant(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMultiTenantArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMultiTenantArgs.builder
      builder.multiTenant(args(argsBuilder).build)

    /**
     * @param quota Configuration related to quotas.
     *  Structure is documented below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigQuotaArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

    /**
     * @param signIn Configuration related to local sign in methods.
     *  Structure is documented below.
     * @return builder
     */
    def signIn(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSignInArgs.builder
      builder.signIn(args(argsBuilder).build)

    /**
     * @param smsRegionConfig Configures the regions where users are allowed to send verification SMS for the project or tenant. This is based on the calling code of the destination phone number.
     *  Structure is documented below.
     * @return builder
     */
    def smsRegionConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigSmsRegionConfigArgs.builder
      builder.smsRegionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringArgs.Builder)
    /**
     * @param requestLogging Configuration for logging requests made to this project to Stackdriver Logging
     *  Structure is documented below.
     * @return builder
     */
    def requestLogging(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringRequestLoggingArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigMonitoringRequestLoggingArgs.builder
      builder.requestLogging(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs.Builder)
    /**
     * @param spCertificates (Output)
     *  The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedSpConfigSpCertificates&#34;&gt;&lt;/a&gt;The `spCertificates` block contains:
     * @return builder
     */
    def spCertificates(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigSpCertificateArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigSpCertificateArgs.builder
      builder.spCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.OauthIdpConfigState.Builder)
    /**
     * @param responseType The response type to request for in the OAuth authorization flow.
     *  You can set either idToken or code to true, but not both.
     *  Setting both types to be simultaneously true ({code: true, idToken: true}) is not yet supported.
     *  Structure is documented below.
     * @return builder
     */
    def responseType(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.OauthIdpConfigResponseTypeArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.OauthIdpConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.OauthIdpConfigResponseTypeArgs.builder
      builder.responseType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigState.Builder)
    /**
     * @param idpConfig SAML IdP configuration when the project acts as the relying party
     *  Structure is documented below.
     * @return builder
     */
    def idpConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigArgs.builder
      builder.idpConfig(args(argsBuilder).build)

    /**
     * @param spConfig SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     *  and accept an authentication assertion issued by a SAML identity provider.
     *  Structure is documented below.
     * @return builder
     */
    def spConfig(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigSpConfigArgs.builder
      builder.spConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.Builder)
    /**
     * @param forwardInboundCredentials The user credentials to include in the JWT payload that is sent to the registered Blocking Functions.
     *  Structure is documented below.
     * @return builder
     */
    def forwardInboundCredentials(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsForwardInboundCredentialsArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsForwardInboundCredentialsArgs.builder
      builder.forwardInboundCredentials(args(argsBuilder).build)

    /**
     * @param triggers Map of Trigger to event type. Key should be one of the supported event types: &#34;beforeCreate&#34;, &#34;beforeSignIn&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def triggers(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsTriggerArgs.Builder]*):
        com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigBlockingFunctionsTriggerArgs.builder
      builder.triggers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.ConfigClientArgs.Builder)
    /**
     * @param permissions Configuration related to restricting a user&#39;s ability to affect their account.
     *  Structure is documented below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.ConfigClientPermissionsArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.ConfigClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.ConfigClientPermissionsArgs.builder
      builder.permissions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.identityplatform.inputs.TenantState.Builder)
    /**
     * @param client Options related to how clients making requests on behalf of a tenant should be configured.
     *  Structure is documented below.
     * @return builder
     */
    def client(args: Endofunction[com.pulumi.gcp.identityplatform.inputs.TenantClientArgs.Builder]):
        com.pulumi.gcp.identityplatform.inputs.TenantState.Builder =
      val argsBuilder = com.pulumi.gcp.identityplatform.inputs.TenantClientArgs.builder
      builder.client(args(argsBuilder).build)
