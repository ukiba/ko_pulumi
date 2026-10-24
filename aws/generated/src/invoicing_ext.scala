package jp.ukiba.ko_pulumi
package aws

object invoicing_ext:
  extension (builder: com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder)
    /**
     * @param rules Configuration block for invoice unit rules. See `rule` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.Builder]*):
        com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder =
      def argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.Builder]):
        com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder =
      val argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.invoicing.inputs.InvoiceUnitState.Builder)
    /**
     * @param rules Configuration block for invoice unit rules. See `rule` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.Builder]*):
        com.pulumi.aws.invoicing.inputs.InvoiceUnitState.Builder =
      def argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.Builder]):
        com.pulumi.aws.invoicing.inputs.InvoiceUnitState.Builder =
      val argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
