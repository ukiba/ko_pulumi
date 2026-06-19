package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object acm:
  object AcmFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the ARN of a certificate in AWS Certificate Manager (ACM).
     * You can reference the certificate by domain or tags without having to hard code the ARNs as input.
     */
    inline def getCertificate(args: Endofunction[com.pulumi.aws.acm.inputs.GetCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.acm.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.acm.inputs.GetCertificateArgs.builder
      com.pulumi.aws.acm.AcmFunctions.getCertificate(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a certificate in AWS Certificate Manager (ACM).
     * You can reference the certificate by domain or tags without having to hard code the ARNs as input.
     */
    inline def getCertificatePlain(args: Endofunction[com.pulumi.aws.acm.inputs.GetCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.acm.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.acm.inputs.GetCertificatePlainArgs.builder
      com.pulumi.aws.acm.AcmFunctions.getCertificatePlain(args(argsBuilder).build)

  /**
   * The ACM certificate resource allows requesting and management of certificates
   * from the Amazon Certificate Manager.
   * 
   * ACM certificates can be created in three ways:
   * Amazon-issued, where AWS provides the certificate authority and automatically manages renewal;
   * imported certificates, issued by another certificate authority;
   * and private certificates, issued using an ACM Private Certificate Authority.
   * 
   * For Amazon-issued certificates, this resource deals with requesting certificates and managing their attributes and life-cycle. It does not wait for a certificate to be issued \u2014 use `aws.acm.CertificateValidation` for that. Most commonly used together with `aws.route53.Record` and `aws.acm.CertificateValidation` to request a DNS validated certificate, deploy the required validation records, and wait for validation to complete. It&#39;s recommended to specify `createBeforeDestroy = true` in a lifecycle block to replace a certificate which is currently in use (e.g., by `aws.lb.Listener`).
   * 
   * Imported certificates can be used to make certificates created with an external certificate authority available for AWS services. As they are not managed by AWS, imported certificates are not eligible for automatic renewal. New certificate materials can be supplied to an existing imported certificate to update it in place.
   * 
   * Private certificates are issued by an ACM Private Certificate Authority, which can be created using `aws.acmpca.CertificateAuthority`. Private certificates created using this resource are eligible for managed renewal if they have been exported or associated with another AWS service. See [managed renewal documentation](https://docs.aws.amazon.com/acm/latest/userguide/managed-renewal.html) for more information. By default, a certificate is valid for 395 days and the managed renewal process will start 60 days before expiration. To renew the certificate earlier than 60 days before expiration, configure `earlyRenewalDuration`.
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acm.CertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.acm.CertificateArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.acm.Certificate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.acm.CertificateArgs.Builder)
    def options(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateOptionsArgs.Builder]):
        com.pulumi.aws.acm.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.acm.inputs.CertificateOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    def validationOptions(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.Builder]*):
        com.pulumi.aws.acm.CertificateArgs.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.builder
      builder.validationOptions(args.map(_(argsBuilder).build)*)

  /**
   * This resource represents a successful validation of an ACM certificate in concert
   * with other resources.
   * 
   * Most commonly, this resource is used together with `aws.route53.Record` and
   * `aws.acm.Certificate` to request a DNS validated certificate,
   * deploy the required validation records and wait for validation to complete.
   * 
   * &gt; **WARNING:** This resource implements a part of the validation workflow. It does not represent a real-world entity in AWS, therefore changing or deleting this resource on its own has no immediate effect.
   */
  def CertificateValidation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.acm.CertificateValidationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.acm.CertificateValidationArgs.builder
    com.pulumi.aws.acm.CertificateValidation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.acm.inputs.CertificateState.Builder)
    /**
     * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation.
     * Can have more than one element, e.g., if SANs are defined.
     * Only set if `DNS`-validation was used.
     * @return builder
     */
    def domainValidationOptions(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateDomainValidationOptionArgs.Builder]*):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateDomainValidationOptionArgs.builder
      builder.domainValidationOptions(args.map(_(argsBuilder).build)*)

    def options(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateOptionsArgs.Builder]):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.aws.acm.inputs.CertificateOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param renewalSummaries Contains information about the status of ACM&#39;s [managed renewal](https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html) for the certificate.
     * @return builder
     */
    def renewalSummaries(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateRenewalSummaryArgs.Builder]*):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateRenewalSummaryArgs.builder
      builder.renewalSummaries(args.map(_(argsBuilder).build)*)

    def validationOptions(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.Builder]*):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.builder
      builder.validationOptions(args.map(_(argsBuilder).build)*)
