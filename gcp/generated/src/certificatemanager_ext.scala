package jp.ukiba.ko_pulumi
package gcp

object certificatemanager_ext:
  extension (builder: com.pulumi.gcp.certificatemanager.CertificateArgs.Builder)
    /**
     * @param managed Configuration and state of a Managed Certificate.
     * Certificate Manager provisions and renews Managed Certificates
     * automatically, for as long as it&#39;s authorized to do so.
     * Structure is documented below.
     * @return builder
     */
    inline def managed(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

    /**
     * @param selfManaged Certificate data for a SelfManaged Certificate.
     * SelfManaged Certificates are uploaded by the user. Updating such
     * certificates before they expire remains the user&#39;s responsibility.
     * The certificate data can be updated in place; changes to `pemCertificate`
     * and `pemPrivateKey` are applied via the API&#39;s PATCH method instead of
     * forcing recreation of the certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def selfManaged(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.builder
      builder.selfManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.Builder)
    /**
     * @param certificateAuthorityConfig The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateAuthorityConfig(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder]):
        com.pulumi.gcp.certificatemanager.CertificateIssuanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.builder
      builder.certificateAuthorityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder)
    /**
     * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
     * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
     * Structure is documented below.
     * @return builder
     */
    inline def allowlistedCertificates(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.builder
      builder.allowlistedCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustStores Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     * @return builder
     */
    inline def trustStores(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.TrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.builder
      builder.trustStores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder)
    /**
     * @param certificateAuthorityServiceConfig Defines a CertificateAuthorityServiceConfig.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateAuthorityServiceConfig(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigCertificateAuthorityServiceConfigArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigCertificateAuthorityServiceConfigArgs.builder
      builder.certificateAuthorityServiceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigState.Builder)
    /**
     * @param certificateAuthorityConfig The CA that issues the workload certificate. It includes the CA address, type, authentication to CA service, etc.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateAuthorityConfig(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateIssuanceConfigCertificateAuthorityConfigArgs.builder
      builder.certificateAuthorityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder)
    /**
     * @param authorizationAttemptInfos (Output)
     * Detailed state of the latest authorization attempt for each domain
     * specified for this Managed Certificate.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedManagedProvisioningIssue&#34;&gt;&lt;/a&gt;The `provisioningIssue` block contains:
     * @return builder
     */
    inline def authorizationAttemptInfos(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedAuthorizationAttemptInfoArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedAuthorizationAttemptInfoArgs.builder
      builder.authorizationAttemptInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param provisioningIssues (Output)
     * Information about issues with provisioning this Managed Certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def provisioningIssues(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedProvisioningIssueArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedProvisioningIssueArgs.builder
      builder.provisioningIssues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.Builder)
    /**
     * @param ipConfigs An IP configuration where this Certificate Map is serving
     * Structure is documented below.
     * @return builder
     */
    inline def ipConfigs(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetIpConfigArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetIpConfigArgs.builder
      builder.ipConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateMapState.Builder)
    /**
     * @param gclbTargets A list of target proxies that use this Certificate Map
     * Structure is documented below.
     * @return builder
     */
    inline def gclbTargets(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.CertificateMapState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateMapGclbTargetArgs.builder
      builder.gclbTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.CertificateState.Builder)
    /**
     * @param managed Configuration and state of a Managed Certificate.
     * Certificate Manager provisions and renews Managed Certificates
     * automatically, for as long as it&#39;s authorized to do so.
     * Structure is documented below.
     * @return builder
     */
    inline def managed(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateManagedArgs.builder
      builder.managed(args(argsBuilder).build)

    /**
     * @param selfManaged Certificate data for a SelfManaged Certificate.
     * SelfManaged Certificates are uploaded by the user. Updating such
     * certificates before they expire remains the user&#39;s responsibility.
     * The certificate data can be updated in place; changes to `pemCertificate`
     * and `pemPrivateKey` are applied via the API&#39;s PATCH method instead of
     * forcing recreation of the certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def selfManaged(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.Builder]):
        com.pulumi.gcp.certificatemanager.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificatemanager.inputs.CertificateSelfManagedArgs.builder
      builder.selfManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationState.Builder)
    /**
     * @param dnsResourceRecords The structure describing the DNS Resource Record that needs to be added
     * to DNS configuration for the authorization to be usable by
     * certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def dnsResourceRecords(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationDnsResourceRecordArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.DnsAuthorizationDnsResourceRecordArgs.builder
      builder.dnsResourceRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.TrustConfigState.Builder)
    /**
     * @param allowlistedCertificates Allowlisted PEM-encoded certificates. A certificate matching an allowlisted certificate is always considered valid as long as
     * the certificate is parseable, proof of private key possession is established, and constraints on the certificate&#39;s SAN field are met.
     * Structure is documented below.
     * @return builder
     */
    inline def allowlistedCertificates(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigAllowlistedCertificateArgs.builder
      builder.allowlistedCertificates(args.map(_(argsBuilder).build)*)

    /**
     * @param trustStores Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     * @return builder
     */
    inline def trustStores(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.builder
      builder.trustStores(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder)
    /**
     * @param intermediateCas Set of intermediate CA certificates used for the path building phase of chain validation.
     * The field is currently not supported if trust config is used for the workload certificate feature.
     * Structure is documented below.
     * @return builder
     */
    inline def intermediateCas(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreIntermediateCaArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreIntermediateCaArgs.builder
      builder.intermediateCas(args.map(_(argsBuilder).build)*)

    /**
     * @param trustAnchors List of Trust Anchors to be used while performing validation against a given TrustStore.
     * Structure is documented below.
     * @return builder
     */
    inline def trustAnchors(args: Endofunction[com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreTrustAnchorArgs.Builder]*):
        com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreTrustAnchorArgs.builder
      builder.trustAnchors(args.map(_(argsBuilder).build)*)
