package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object confidentialledger:
  /** Manages a Confidential Ledger. */
  def Ledger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.confidentialledger.LedgerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.confidentialledger.LedgerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.confidentialledger.Ledger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.confidentialledger.LedgerArgs.Builder)
    /**
     * @param azureadBasedServicePrincipals A list of `azureadBasedServicePrincipal` blocks as defined below.
     * @return builder
     */
    def azureadBasedServicePrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.LedgerArgs.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.builder
      builder.azureadBasedServicePrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param certificateBasedSecurityPrincipals A list of `certificateBasedSecurityPrincipal` blocks as defined below.
     * @return builder
     */
    def certificateBasedSecurityPrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.LedgerArgs.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.builder
      builder.certificateBasedSecurityPrincipals(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.confidentialledger.LedgerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder)
    /**
     * @param azureadBasedServicePrincipals A list of `azureadBasedServicePrincipal` blocks as defined below.
     * @return builder
     */
    def azureadBasedServicePrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerAzureadBasedServicePrincipalArgs.builder
      builder.azureadBasedServicePrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param certificateBasedSecurityPrincipals A list of `certificateBasedSecurityPrincipal` blocks as defined below.
     * @return builder
     */
    def certificateBasedSecurityPrincipals(args: Endofunction[com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.Builder]*):
        com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder =
      def argsBuilder = com.pulumi.azure.confidentialledger.inputs.LedgerCertificateBasedSecurityPrincipalArgs.builder
      builder.certificateBasedSecurityPrincipals(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.confidentialledger.inputs.LedgerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
