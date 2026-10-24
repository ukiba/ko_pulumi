package jp.ukiba.ko_pulumi
package aws

object acm_ext:
  extension (builder: com.pulumi.aws.acm.CertificateArgs.Builder)
    inline def options(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateOptionsArgs.Builder]):
        com.pulumi.aws.acm.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.acm.inputs.CertificateOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    inline def validationOptions(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.Builder]*):
        com.pulumi.aws.acm.CertificateArgs.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.builder
      builder.validationOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.acm.inputs.CertificateState.Builder)
    /**
     * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation.
     * Can have more than one element, e.g., if SANs are defined.
     * Only set if `DNS`-validation was used.
     * @return builder
     */
    inline def domainValidationOptions(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateDomainValidationOptionArgs.Builder]*):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateDomainValidationOptionArgs.builder
      builder.domainValidationOptions(args.map(_(argsBuilder).build)*)

    inline def options(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateOptionsArgs.Builder]):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.aws.acm.inputs.CertificateOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param renewalSummaries Contains information about the status of ACM&#39;s [managed renewal](https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html) for the certificate.
     * @return builder
     */
    inline def renewalSummaries(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateRenewalSummaryArgs.Builder]*):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateRenewalSummaryArgs.builder
      builder.renewalSummaries(args.map(_(argsBuilder).build)*)

    inline def validationOptions(args: Endofunction[com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.Builder]*):
        com.pulumi.aws.acm.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs.builder
      builder.validationOptions(args.map(_(argsBuilder).build)*)
