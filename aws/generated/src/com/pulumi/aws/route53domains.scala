package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object route53domains:
  extension (builder: com.pulumi.aws.route53domains.DelegationSignerRecordArgs.Builder)
    /**
     * @param signingAttributes The information about a key, including the algorithm, public key-value, and flags.
     * @return builder
     */
    def signingAttributes(args: Endofunction[com.pulumi.aws.route53domains.inputs.DelegationSignerRecordSigningAttributesArgs.Builder]):
        com.pulumi.aws.route53domains.DelegationSignerRecordArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DelegationSignerRecordSigningAttributesArgs.builder
      builder.signingAttributes(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.route53domains.inputs.DelegationSignerRecordTimeoutsArgs.Builder]):
        com.pulumi.aws.route53domains.DelegationSignerRecordArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DelegationSignerRecordTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53domains.DomainArgs.Builder)
    /**
     * @param adminContact Details about the domain administrative contact. See Contact Blocks for more details.
     * @return builder
     */
    def adminContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainAdminContactArgs.Builder]):
        com.pulumi.aws.route53domains.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainAdminContactArgs.builder
      builder.adminContact(args(argsBuilder).build)

    /**
     * @param billingContacts Details about the domain billing contact. See Contact Blocks for more details.
     * @return builder
     */
    def billingContacts(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainBillingContactArgs.Builder]*):
        com.pulumi.aws.route53domains.DomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainBillingContactArgs.builder
      builder.billingContacts(args.map(_(argsBuilder).build)*)

    /**
     * @param nameServers The list of nameservers for the domain. See `nameServer` Blocks for more details.
     * @return builder
     */
    def nameServers(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainNameServerArgs.Builder]*):
        com.pulumi.aws.route53domains.DomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainNameServerArgs.builder
      builder.nameServers(args.map(_(argsBuilder).build)*)

    /**
     * @param registrantContact Details about the domain registrant. See Contact Blocks for more details.
     * @return builder
     */
    def registrantContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainRegistrantContactArgs.Builder]):
        com.pulumi.aws.route53domains.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainRegistrantContactArgs.builder
      builder.registrantContact(args(argsBuilder).build)

    /**
     * @param techContact Details about the domain technical contact. See Contact Blocks for more details.
     * @return builder
     */
    def techContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainTechContactArgs.Builder]):
        com.pulumi.aws.route53domains.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainTechContactArgs.builder
      builder.techContact(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainTimeoutsArgs.Builder]):
        com.pulumi.aws.route53domains.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder)
    /**
     * @param adminContact Details about the domain administrative contact. See Contact Blocks for more details.
     * @return builder
     */
    def adminContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainAdminContactArgs.Builder]):
        com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainAdminContactArgs.builder
      builder.adminContact(args(argsBuilder).build)

    /**
     * @param billingContact Details about the domain billing contact. See Contact Blocks for more details.
     * @return builder
     */
    def billingContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainBillingContactArgs.Builder]):
        com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainBillingContactArgs.builder
      builder.billingContact(args(argsBuilder).build)

    /**
     * @param nameServers The list of nameservers for the domain. See `nameServer` Blocks for more details.
     * @return builder
     */
    def nameServers(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainNameServerArgs.Builder]*):
        com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainNameServerArgs.builder
      builder.nameServers(args.map(_(argsBuilder).build)*)

    /**
     * @param registrantContact Details about the domain registrant. See Contact Blocks for more details.
     * @return builder
     */
    def registrantContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainRegistrantContactArgs.Builder]):
        com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainRegistrantContactArgs.builder
      builder.registrantContact(args(argsBuilder).build)

    /**
     * @param techContact Details about the domain technical contact. See Contact Blocks for more details.
     * @return builder
     */
    def techContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainTechContactArgs.Builder]):
        com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainTechContactArgs.builder
      builder.techContact(args(argsBuilder).build)

  /** Provides a resource to manage a [delegation signer record](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-enable-signing.html#dns-configuring-dnssec-enable-signing-step-1) in the parent DNS zone for domains registered with Route53. */
  def DelegationSignerRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53domains.DelegationSignerRecordArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.route53domains.DelegationSignerRecordArgs.builder
    
    com.pulumi.aws.route53domains.DelegationSignerRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53domains.inputs.DomainState.Builder)
    /**
     * @param adminContact Details about the domain administrative contact. See Contact Blocks for more details.
     * @return builder
     */
    def adminContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainAdminContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainAdminContactArgs.builder
      builder.adminContact(args(argsBuilder).build)

    /**
     * @param billingContacts Details about the domain billing contact. See Contact Blocks for more details.
     * @return builder
     */
    def billingContacts(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainBillingContactArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainBillingContactArgs.builder
      builder.billingContacts(args.map(_(argsBuilder).build)*)

    /**
     * @param nameServers The list of nameservers for the domain. See `nameServer` Blocks for more details.
     * @return builder
     */
    def nameServers(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainNameServerArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainNameServerArgs.builder
      builder.nameServers(args.map(_(argsBuilder).build)*)

    /**
     * @param registrantContact Details about the domain registrant. See Contact Blocks for more details.
     * @return builder
     */
    def registrantContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainRegistrantContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainRegistrantContactArgs.builder
      builder.registrantContact(args(argsBuilder).build)

    /**
     * @param techContact Details about the domain technical contact. See Contact Blocks for more details.
     * @return builder
     */
    def techContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainTechContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainTechContactArgs.builder
      builder.techContact(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainTimeoutsArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DomainTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53domains.inputs.DomainRegistrantContactArgs.Builder)
    /**
     * @param extraParams A list of name-value pairs for parameters required by certain top-level domains.
     * @return builder
     */
    def extraParams(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainRegistrantContactExtraParamArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.DomainRegistrantContactArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainRegistrantContactExtraParamArgs.builder
      builder.extraParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53domains.inputs.DelegationSignerRecordState.Builder)
    /**
     * @param signingAttributes The information about a key, including the algorithm, public key-value, and flags.
     * @return builder
     */
    def signingAttributes(args: Endofunction[com.pulumi.aws.route53domains.inputs.DelegationSignerRecordSigningAttributesArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.DelegationSignerRecordState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DelegationSignerRecordSigningAttributesArgs.builder
      builder.signingAttributes(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.route53domains.inputs.DelegationSignerRecordTimeoutsArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.DelegationSignerRecordState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.DelegationSignerRecordTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53domains.inputs.DomainTechContactArgs.Builder)
    /**
     * @param extraParams A list of name-value pairs for parameters required by certain top-level domains.
     * @return builder
     */
    def extraParams(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainTechContactExtraParamArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.DomainTechContactArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainTechContactExtraParamArgs.builder
      builder.extraParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53domains.inputs.RegisteredDomainState.Builder)
    /**
     * @param adminContact Details about the domain administrative contact. See Contact Blocks for more details.
     * @return builder
     */
    def adminContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainAdminContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.RegisteredDomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainAdminContactArgs.builder
      builder.adminContact(args(argsBuilder).build)

    /**
     * @param billingContact Details about the domain billing contact. See Contact Blocks for more details.
     * @return builder
     */
    def billingContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainBillingContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.RegisteredDomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainBillingContactArgs.builder
      builder.billingContact(args(argsBuilder).build)

    /**
     * @param nameServers The list of nameservers for the domain. See `nameServer` Blocks for more details.
     * @return builder
     */
    def nameServers(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainNameServerArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.RegisteredDomainState.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainNameServerArgs.builder
      builder.nameServers(args.map(_(argsBuilder).build)*)

    /**
     * @param registrantContact Details about the domain registrant. See Contact Blocks for more details.
     * @return builder
     */
    def registrantContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainRegistrantContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.RegisteredDomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainRegistrantContactArgs.builder
      builder.registrantContact(args(argsBuilder).build)

    /**
     * @param techContact Details about the domain technical contact. See Contact Blocks for more details.
     * @return builder
     */
    def techContact(args: Endofunction[com.pulumi.aws.route53domains.inputs.RegisteredDomainTechContactArgs.Builder]):
        com.pulumi.aws.route53domains.inputs.RegisteredDomainState.Builder =
      val argsBuilder = com.pulumi.aws.route53domains.inputs.RegisteredDomainTechContactArgs.builder
      builder.techContact(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.route53domains.inputs.DomainAdminContactArgs.Builder)
    /**
     * @param extraParams A list of name-value pairs for parameters required by certain top-level domains.
     * @return builder
     */
    def extraParams(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainAdminContactExtraParamArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.DomainAdminContactArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainAdminContactExtraParamArgs.builder
      builder.extraParams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53domains.inputs.DomainBillingContactArgs.Builder)
    /**
     * @param extraParams A list of name-value pairs for parameters required by certain top-level domains.
     * @return builder
     */
    def extraParams(args: Endofunction[com.pulumi.aws.route53domains.inputs.DomainBillingContactExtraParamArgs.Builder]*):
        com.pulumi.aws.route53domains.inputs.DomainBillingContactArgs.Builder =
      def argsBuilder = com.pulumi.aws.route53domains.inputs.DomainBillingContactExtraParamArgs.builder
      builder.extraParams(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage a domain that has been [registered](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html) and associated with the current AWS account. To register, renew and deregister a domain use the `aws.route53domains.Domain` resource instead.
   *  
   *  **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
   *  
   *  The `aws.route53domains.RegisteredDomain` resource behaves differently from normal resources in that if a domain has been registered, the provider does not _register_ this domain, but instead &#34;adopts&#34; it into management. A destroy does not delete the domain but does remove the resource from state.
   */
  def RegisteredDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53domains.RegisteredDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53domains.RegisteredDomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53domains.RegisteredDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage a domain. This resource registers, renews and deregisters a domain name. If a domain name&#39;s lifecycle is managed outside of Terraform use the `aws.route53domains.RegisteredDomain` resource instead. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53domains.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53domains.DomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53domains.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
