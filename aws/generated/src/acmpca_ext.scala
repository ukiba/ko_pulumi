package jp.ukiba.ko_pulumi
package aws

object acmpca_ext:
  extension (builder: com.pulumi.aws.acmpca.CertificateArgs.Builder)
    /**
     * @param validity Configures end of the validity period for the certificate. See validity block below.
     * @return builder
     */
    def validity(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.Builder]):
        com.pulumi.aws.acmpca.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.builder
      builder.validity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.acmpca.CertificateAuthorityArgs.Builder)
    /**
     * @param certificateAuthorityConfiguration Nested argument containing algorithms and certificate subject information. Defined below.
     * @return builder
     */
    def certificateAuthorityConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.CertificateAuthorityArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.builder
      builder.certificateAuthorityConfiguration(args(argsBuilder).build)

    /**
     * @param revocationConfiguration Nested argument containing revocation configuration. Defined below.
     * @return builder
     */
    def revocationConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.CertificateAuthorityArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.builder
      builder.revocationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.Builder)
    /**
     * @param subject Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
     * @return builder
     */
    def subject(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.Builder)
    /**
     * @param crlConfiguration Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
     * @return builder
     */
    def crlConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationCrlConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationCrlConfigurationArgs.builder
      builder.crlConfiguration(args(argsBuilder).build)

    /**
     * @param ocspConfiguration Nested argument containing configuration of
     * the custom OCSP responder endpoint. Defined below.
     * @return builder
     */
    def ocspConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationOcspConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationOcspConfigurationArgs.builder
      builder.ocspConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.acmpca.inputs.CertificateAuthorityState.Builder)
    /**
     * @param certificateAuthorityConfiguration Nested argument containing algorithms and certificate subject information. Defined below.
     * @return builder
     */
    def certificateAuthorityConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityState.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.builder
      builder.certificateAuthorityConfiguration(args(argsBuilder).build)

    /**
     * @param revocationConfiguration Nested argument containing revocation configuration. Defined below.
     * @return builder
     */
    def revocationConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityState.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.builder
      builder.revocationConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.acmpca.inputs.CertificateState.Builder)
    /**
     * @param validity Configures end of the validity period for the certificate. See validity block below.
     * @return builder
     */
    def validity(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.builder
      builder.validity(args(argsBuilder).build)
