package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object acmpca:
  /** Associates a certificate with an AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). An ACM PCA Certificate Authority is unable to issue certificates until it has a certificate associated with it. A root level ACM PCA Certificate Authority is able to self-sign its own root certificate. */
  def CertificateAuthorityCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs.builder
    
    com.pulumi.aws.acmpca.CertificateAuthorityCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type AcmpcaFunctions = com.pulumi.aws.acmpca.AcmpcaFunctions
  object AcmpcaFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.acmpca.AcmpcaFunctions.*
  extension (self: AcmpcaFunctions.type)
    /** Get information on a Certificate issued by a AWS Certificate Manager Private Certificate Authority. */
    def getCertificate(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.acmpca.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificateArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificate(args(argsBuilder).build)

    /** Get information on a Certificate issued by a AWS Certificate Manager Private Certificate Authority. */
    def getCertificatePlain(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.acmpca.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificatePlainArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificatePlain(args(argsBuilder).build)

    /** Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). */
    def getCertificateAuthority(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificateAuthority(args(argsBuilder).build)

    /** Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). */
    def getCertificateAuthorityPlain(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityPlainArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificateAuthorityPlain(args(argsBuilder).build)

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

  /**
   * Provides a resource to issue a certificate using AWS Certificate Manager Private Certificate Authority (ACM PCA).
   *  
   *  Certificates created using `aws.acmpca.Certificate` are not eligible for automatic renewal,
   *  and must be replaced instead.
   *  To issue a renewable certificate using an ACM PCA, create a `aws.acm.Certificate`
   *  with the parameter `certificateAuthorityArn`.
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.acmpca.CertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.acmpca.CertificateArgs.builder
    
    com.pulumi.aws.acmpca.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage an AWS Certificate Manager Private Certificate Authorities Permission.
   *  Currently, this is only required in order to allow the ACM service to automatically renew certificates issued by a PCA.
   */
  def Permission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.acmpca.PermissionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.acmpca.PermissionArgs.builder
    
    com.pulumi.aws.acmpca.Permission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.acmpca.CertificateArgs.Builder)
    /**
     * @param validity Configures end of the validity period for the certificate. See validity block below.
     * @return builder
     */
    def validity(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.Builder]):
        com.pulumi.aws.acmpca.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.builder
      builder.validity(args(argsBuilder).build)

  /** Attaches a resource based policy to a private CA. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.acmpca.PolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.acmpca.PolicyArgs.builder
    
    com.pulumi.aws.acmpca.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage AWS Certificate Manager Private Certificate Authorities (ACM PCA Certificate Authorities).
   *  
   *  &gt; **NOTE:** Creating this resource will leave the certificate authority in a `PENDING_CERTIFICATE` status, which means it cannot yet issue certificates. To complete this setup, you must fully sign the certificate authority CSR available in the `certificateSigningRequest` attribute. The `aws.acmpca.CertificateAuthorityCertificate` resource can be used for this purpose.
   */
  def CertificateAuthority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.acmpca.CertificateAuthorityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.acmpca.CertificateAuthorityArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.acmpca.CertificateAuthority(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.acmpca.inputs.CertificateState.Builder)
    /**
     * @param validity Configures end of the validity period for the certificate. See validity block below.
     * @return builder
     */
    def validity(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateValidityArgs.builder
      builder.validity(args(argsBuilder).build)

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
     *  the custom OCSP responder endpoint. Defined below.
     * @return builder
     */
    def ocspConfiguration(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationOcspConfigurationArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationOcspConfigurationArgs.builder
      builder.ocspConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.Builder)
    /**
     * @param subject Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
     * @return builder
     */
    def subject(args: Endofunction[com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.Builder]):
        com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

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
