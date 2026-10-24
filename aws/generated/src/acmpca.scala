package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object acmpca:
  object AcmpcaFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information on a Certificate issued by a AWS Certificate Manager Private Certificate Authority. */
    inline def getCertificate(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.acmpca.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificateArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificate(args(argsBuilder).build)

    /** Get information on a Certificate issued by a AWS Certificate Manager Private Certificate Authority. */
    inline def getCertificatePlain(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.acmpca.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificatePlainArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificatePlain(args(argsBuilder).build)

    /** Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). */
    inline def getCertificateAuthority(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificateAuthority(args(argsBuilder).build)

    /** Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). */
    inline def getCertificateAuthorityPlain(args: Endofunction[com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityResult] =
      val argsBuilder = com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityPlainArgs.builder
      com.pulumi.aws.acmpca.AcmpcaFunctions.getCertificateAuthorityPlain(args(argsBuilder).build)

  /**
   * Provides a resource to issue a certificate using AWS Certificate Manager Private Certificate Authority (ACM PCA).
   * 
   * Certificates created using `aws.acmpca.Certificate` are not eligible for automatic renewal,
   * and must be replaced instead.
   * To issue a renewable certificate using an ACM PCA, create a `aws.acm.Certificate`
   * with the parameter `certificateAuthorityArn`.
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acmpca.CertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.acmpca.CertificateArgs.builder
    com.pulumi.aws.acmpca.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to manage AWS Certificate Manager Private Certificate Authorities (ACM PCA Certificate Authorities).
   * 
   * &gt; **NOTE:** Creating this resource will leave the certificate authority in a `PENDING_CERTIFICATE` status, which means it cannot yet issue certificates. To complete this setup, you must fully sign the certificate authority CSR available in the `certificateSigningRequest` attribute. The `aws.acmpca.CertificateAuthorityCertificate` resource can be used for this purpose.
   */
  def CertificateAuthority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acmpca.CertificateAuthorityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.acmpca.CertificateAuthorityArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.acmpca.CertificateAuthority(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates a certificate with an AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority). An ACM PCA Certificate Authority is unable to issue certificates until it has a certificate associated with it. A root level ACM PCA Certificate Authority is able to self-sign its own root certificate. */
  def CertificateAuthorityCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.acmpca.CertificateAuthorityCertificateArgs.builder
    com.pulumi.aws.acmpca.CertificateAuthorityCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to manage an AWS Certificate Manager Private Certificate Authorities Permission.
   * Currently, this is only required in order to allow the ACM service to automatically renew certificates issued by a PCA.
   */
  def Permission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acmpca.PermissionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.acmpca.PermissionArgs.builder
    com.pulumi.aws.acmpca.Permission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Attaches a resource based policy to a private CA. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acmpca.PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.acmpca.PolicyArgs.builder
    com.pulumi.aws.acmpca.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
