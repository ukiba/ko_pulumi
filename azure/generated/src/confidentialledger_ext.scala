package jp.ukiba.ko_pulumi
package azure

object confidentialledger_ext:
  extension (builder: com.pulumi.azure.confidentialledger.LedgerArgs.Builder)
    /**
     * @param azureadBasedServicePrincipals A list of `azureadBasedServicePrincipal` blocks as defined below.
     * @return builder
     */
    inline def azureadBasedServicePrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.LedgerArgs.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.builder
      builder.azureadBasedServicePrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param certificateBasedSecurityPrincipals A list of `certificateBasedSecurityPrincipal` blocks as defined below.
     * @return builder
     */
    inline def certificateBasedSecurityPrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.LedgerArgs.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.builder
      builder.certificateBasedSecurityPrincipals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder)
    /**
     * @param azureadBasedServicePrincipals A list of `azureadBasedServicePrincipal` blocks as defined below.
     * @return builder
     */
    inline def azureadBasedServicePrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.builder
      builder.azureadBasedServicePrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param certificateBasedSecurityPrincipals A list of `certificateBasedSecurityPrincipal` blocks as defined below.
     * @return builder
     */
    inline def certificateBasedSecurityPrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.builder
      builder.certificateBasedSecurityPrincipals(args.map(_(argsBuilder).build)*)
