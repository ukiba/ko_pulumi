package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object certificatemanager:
  type CertificatemanagerFunctions = com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions
  object CertificatemanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.*
  extension (self: CertificatemanagerFunctions.type)
    /** Get info about a Google Certificate Manager Certificate Map resource. */
    def getCertificateMap(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificatemanager.outputs.GetCertificateMapResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificateMap(args(argsBuilder).build)

    /** Get info about a Google Certificate Manager Certificate Map resource. */
    def getCertificateMapPlain(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificatemanager.outputs.GetCertificateMapResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapPlainArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificateMapPlain(args(argsBuilder).build)

    /** List all certificates within Google Certificate Manager for a given project, region or filter. */
    def getCertificates(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificatemanager.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificatesArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificates(args(argsBuilder).build)

    /** List all certificates within Google Certificate Manager for a given project, region or filter. */
    def getCertificatesPlain(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificatemanager.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetCertificatesPlainArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getCertificatesPlain(args(argsBuilder).build)

    /** Use this data source to get information about a Certificate Manager DNS Authorization. For more details, see the [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.dnsAuthorizations). */
    def getDnsAuthorization(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificatemanager.outputs.GetDnsAuthorizationResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getDnsAuthorization(args(argsBuilder).build)

    /** Use this data source to get information about a Certificate Manager DNS Authorization. For more details, see the [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.dnsAuthorizations). */
    def getDnsAuthorizationPlain(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificatemanager.outputs.GetDnsAuthorizationResult] =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.GetDnsAuthorizationPlainArgs.builder
      com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions.getDnsAuthorizationPlain(args(argsBuilder).build)

  /**
   * Certificate represents a HTTP-reachable backend for a Certificate.
   * 
   *  To get more information about CertificateIssuanceConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.certificateIssuanceConfigs)
   *  * How-to Guides
   *      * [Manage certificate issuance configs](https://cloud.google.com/certificate-manager/docs/issuance-configs)
   */
  def CertificateIssuanceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.CertificateIssuanceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder)
    /**
     * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
     *  the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
     *  Structure is documented below.
     * @return builder
     */
    def allowlistedCertificates(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.builder
      builder.allowlistedCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustStores Set of trust stores to perform validation against.
     *  This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     *  Structure is documented below.
     * @return builder
     */
    def trustStores(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.builder
      builder.trustStores(args.map(_(argsBuilder).build)*)

  /**
   * CertificateMap defines a collection of certificate configurations,
   *  which are usable by any associated target proxies
   */
  def CertificateMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateMapArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateMapArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.CertificateMap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Certificate represents a HTTP-reachable backend for a Certificate.
   * 
   *  To get more information about Certificate, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.certificates)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/certificate-manager/docs/certificates)
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * TrustConfig represents a resource that represents your Public Key Infrastructure (PKI) configuration in Certificate Manager for use in mutual TLS authentication scenarios.
   * 
   *  To get more information about TrustConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.trustConfigs/create)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/certificate-manager/docs)
   */
  def TrustConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.TrustConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.TrustConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.Builder)
    /**
     * @param certificateAuthorityConfig The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
     *  Structure is documented below.
     * @return builder
     */
    def certificateAuthorityConfig(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder]):
        com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.builder
      builder.certificateAuthorityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.CertificateArgs.Builder)
    /**
     * @param managed Configuration and state of a Managed Certificate.
     *  Certificate Manager provisions and renews Managed Certificates
     *  automatically, for as long as it&#39;s authorized to do so.
     *  Structure is documented below.
     * @return builder
     */
    def managed(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

    /**
     * @param selfManaged Certificate data for a SelfManaged Certificate.
     *  SelfManaged Certificates are uploaded by the user. Updating such
     *  certificates before they expire remains the user&#39;s responsibility.
     *  Structure is documented below.
     * @return builder
     */
    def selfManaged(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.builder
      builder.selfManaged(args(argsBuilder).build)

  /** DnsAuthorization represents a HTTP-reachable backend for a DnsAuthorization. */
  def DnsAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.DnsAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.DnsAuthorizationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.DnsAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * CertificateMapEntry is a list of certificate configurations,
   *  that have been issued for a particular hostname
   */
  def CertificateMapEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.certificatemanager.CertificateMapEntryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificatemanager.CertificateMapEntryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificatemanager.CertificateMapEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateState.Builder)
    /**
     * @param managed Configuration and state of a Managed Certificate.
     *  Certificate Manager provisions and renews Managed Certificates
     *  automatically, for as long as it&#39;s authorized to do so.
     *  Structure is documented below.
     * @return builder
     */
    def managed(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

    /**
     * @param selfManaged Certificate data for a SelfManaged Certificate.
     *  SelfManaged Certificates are uploaded by the user. Updating such
     *  certificates before they expire remains the user&#39;s responsibility.
     *  Structure is documented below.
     * @return builder
     */
    def selfManaged(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.builder
      builder.selfManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.Builder)
    /**
     * @param ipConfigs An IP configuration where this Certificate Map is serving
     *  Structure is documented below.
     * @return builder
     */
    def ipConfigs(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetIpConfigArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetIpConfigArgs.builder
      builder.ipConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder)
    /**
     * @param authorizationAttemptInfos (Output)
     *  Detailed state of the latest authorization attempt for each domain
     *  specified for this Managed Certificate.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedManagedProvisioningIssue&#34;&gt;&lt;/a&gt;The `provisioningIssue` block contains:
     * @return builder
     */
    def authorizationAttemptInfos(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedAuthorizationAttemptInfoArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedAuthorizationAttemptInfoArgs.builder
      builder.authorizationAttemptInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param provisioningIssues (Output)
     *  Information about issues with provisioning this Managed Certificate.
     *  Structure is documented below.
     * @return builder
     */
    def provisioningIssues(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedProvisioningIssueArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedProvisioningIssueArgs.builder
      builder.provisioningIssues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder)
    /**
     * @param intermediateCas Set of intermediate CA certificates used for the path building phase of chain validation.
     *  The field is currently not supported if trust config is used for the workload certificate feature.
     *  Structure is documented below.
     * @return builder
     */
    def intermediateCas(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreIntermediateCaArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreIntermediateCaArgs.builder
      builder.intermediateCas(args.map(_(argsBuilder).build)*)

    /**
     * @param trustAnchors List of Trust Anchors to be used while performing validation against a given TrustStore.
     *  Structure is documented below.
     * @return builder
     */
    def trustAnchors(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreTrustAnchorArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreTrustAnchorArgs.builder
      builder.trustAnchors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateMapState.Builder)
    /**
     * @param gclbTargets A list of target proxies that use this Certificate Map
     *  Structure is documented below.
     * @return builder
     */
    def gclbTargets(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateMapState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.builder
      builder.gclbTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.TrustConfigState.Builder)
    /**
     * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
     *  the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
     *  Structure is documented below.
     * @return builder
     */
    def allowlistedCertificates(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.builder
      builder.allowlistedCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustStores Set of trust stores to perform validation against.
     *  This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     *  Structure is documented below.
     * @return builder
     */
    def trustStores(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.builder
      builder.trustStores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationState.Builder)
    /**
     * @param dnsResourceRecords The structure describing the DNS Resource Record that needs to be added
     *  to DNS configuration for the authorization to be usable by
     *  certificate.
     *  Structure is documented below.
     * @return builder
     */
    def dnsResourceRecords(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationDnsResourceRecordArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationDnsResourceRecordArgs.builder
      builder.dnsResourceRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder)
    /**
     * @param certificateAuthorityServiceConfig Defines a CertificateAuthorityServiceConfig.
     *  Structure is documented below.
     * @return builder
     */
    def certificateAuthorityServiceConfig(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigCertificateAuthorityServiceConfigArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigCertificateAuthorityServiceConfigArgs.builder
      builder.certificateAuthorityServiceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigState.Builder)
    /**
     * @param certificateAuthorityConfig The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
     *  Structure is documented below.
     * @return builder
     */
    def certificateAuthorityConfig(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.builder
      builder.certificateAuthorityConfig(args(argsBuilder).build)
