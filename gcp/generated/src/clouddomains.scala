package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object clouddomains:
  /**
   * Registers a new domain name and creates a corresponding Registration resource.
   * 
   *  To get more information about Registration, see:
   * 
   *  * [API documentation](https://cloud.google.com/domains/docs/reference/rest/v1/projects.locations.registrations)
   *  * How-to Guides
   *      * [Register a domain with Cloud Domains](https://cloud.google.com/domains/docs/buy-register-domain)
   * 
   *  &gt; **Warning:** The Terraform implementation of this resource will not actually delete a Registration during
   *  `terraform destroy`. Instead it will &#34;abandon&#34; the resource and remove it from state.
   *  For information on deleting a registered domain, see https://cloud.google.com/domains/docs/delete-domain
   */
  def Registration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.clouddomains.RegistrationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.clouddomains.RegistrationArgs.builder
    com.pulumi.gcp.clouddomains.Registration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsAdminContactArgs.Builder)
    /**
     * @param postalAddress Required. Postal address of the contact.
     *  Structure is documented below.
     * @return builder
     */
    def postalAddress(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsAdminContactPostalAddressArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsAdminContactArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsAdminContactPostalAddressArgs.builder
      builder.postalAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.Builder)
    /**
     * @param adminContact Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.
     *  Warning: For new Registrations, the registrant receives an email confirmation that they must complete within 15 days to
     *  avoid domain suspension.
     *  Structure is documented below.
     * @return builder
     */
    def adminContact(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsAdminContactArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsAdminContactArgs.builder
      builder.adminContact(args(argsBuilder).build)

    /**
     * @param registrantContact Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.
     *  Warning: For new Registrations, the registrant receives an email confirmation that they must complete within 15 days to
     *  avoid domain suspension.
     *  Structure is documented below.
     * @return builder
     */
    def registrantContact(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsRegistrantContactArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsRegistrantContactArgs.builder
      builder.registrantContact(args(argsBuilder).build)

    /**
     * @param technicalContact Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.
     *  Warning: For new Registrations, the registrant receives an email confirmation that they must complete within 15 days to
     *  avoid domain suspension.
     *  Structure is documented below.
     * @return builder
     */
    def technicalContact(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsTechnicalContactArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsTechnicalContactArgs.builder
      builder.technicalContact(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.Builder)
    /**
     * @param customDns Configuration for an arbitrary DNS provider.
     *  Structure is documented below.
     * @return builder
     */
    def customDns(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsCustomDnsArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsCustomDnsArgs.builder
      builder.customDns(args(argsBuilder).build)

    /**
     * @param glueRecords The list of glue records for this Registration. Commonly empty.
     *  Structure is documented below.
     * @return builder
     */
    def glueRecords(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsGlueRecordArgs.Builder]*):
        com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsGlueRecordArgs.builder
      builder.glueRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsTechnicalContactArgs.Builder)
    /**
     * @param postalAddress Required. Postal address of the contact.
     *  Structure is documented below.
     * @return builder
     */
    def postalAddress(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsTechnicalContactPostalAddressArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsTechnicalContactArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsTechnicalContactPostalAddressArgs.builder
      builder.postalAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsRegistrantContactArgs.Builder)
    /**
     * @param postalAddress Required. Postal address of the contact.
     *  Structure is documented below.
     * @return builder
     */
    def postalAddress(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsRegistrantContactPostalAddressArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsRegistrantContactArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsRegistrantContactPostalAddressArgs.builder
      builder.postalAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationState.Builder)
    /**
     * @param contactSettings Required. Settings for contact information linked to the Registration.
     *  Structure is documented below.
     * @return builder
     */
    def contactSettings(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.builder
      builder.contactSettings(args(argsBuilder).build)

    /**
     * @param dnsSettings Settings controlling the DNS configuration of the Registration.
     *  Structure is documented below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param managementSettings Settings for management of the Registration, including renewal, billing, and transfer
     *  Structure is documented below.
     * @return builder
     */
    def managementSettings(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationManagementSettingsArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationManagementSettingsArgs.builder
      builder.managementSettings(args(argsBuilder).build)

    /**
     * @param yearlyPrice Required. Yearly price to register or renew the domain. The value that should be put here can be obtained from
     *  registrations.retrieveRegisterParameters or registrations.searchDomains calls.
     *  Structure is documented below.
     * @return builder
     */
    def yearlyPrice(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationYearlyPriceArgs.Builder]):
        com.pulumi.gcp.clouddomains.inputs.RegistrationState.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationYearlyPriceArgs.builder
      builder.yearlyPrice(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsCustomDnsArgs.Builder)
    /**
     * @param dsRecords The list of DS records for this domain, which are used to enable DNSSEC. The domain&#39;s DNS provider can provide
     *  the values to set here. If this field is empty, DNSSEC is disabled.
     *  Structure is documented below.
     * @return builder
     */
    def dsRecords(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsCustomDnsDsRecordArgs.Builder]*):
        com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsCustomDnsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsCustomDnsDsRecordArgs.builder
      builder.dsRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.clouddomains.RegistrationArgs.Builder)
    /**
     * @param contactSettings Required. Settings for contact information linked to the Registration.
     *  Structure is documented below.
     * @return builder
     */
    def contactSettings(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.Builder]):
        com.pulumi.gcp.clouddomains.RegistrationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationContactSettingsArgs.builder
      builder.contactSettings(args(argsBuilder).build)

    /**
     * @param dnsSettings Settings controlling the DNS configuration of the Registration.
     *  Structure is documented below.
     * @return builder
     */
    def dnsSettings(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.Builder]):
        com.pulumi.gcp.clouddomains.RegistrationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationDnsSettingsArgs.builder
      builder.dnsSettings(args(argsBuilder).build)

    /**
     * @param managementSettings Settings for management of the Registration, including renewal, billing, and transfer
     *  Structure is documented below.
     * @return builder
     */
    def managementSettings(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationManagementSettingsArgs.Builder]):
        com.pulumi.gcp.clouddomains.RegistrationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationManagementSettingsArgs.builder
      builder.managementSettings(args(argsBuilder).build)

    /**
     * @param yearlyPrice Required. Yearly price to register or renew the domain. The value that should be put here can be obtained from
     *  registrations.retrieveRegisterParameters or registrations.searchDomains calls.
     *  Structure is documented below.
     * @return builder
     */
    def yearlyPrice(args: Endofunction[com.pulumi.gcp.clouddomains.inputs.RegistrationYearlyPriceArgs.Builder]):
        com.pulumi.gcp.clouddomains.RegistrationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.clouddomains.inputs.RegistrationYearlyPriceArgs.builder
      builder.yearlyPrice(args(argsBuilder).build)
