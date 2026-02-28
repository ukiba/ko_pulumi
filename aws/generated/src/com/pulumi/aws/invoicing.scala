package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object invoicing:
  /** Manages an AWS Invoice Unit for organizational billing. */
  def InvoiceUnit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.invoicing.InvoiceUnitArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.invoicing.InvoiceUnit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder)
    /**
     * @param rules Configuration block for invoice unit rules. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.Builder]*):
        com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder =
      def argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.Builder]):
        com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder =
      val argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.invoicing.inputs.InvoiceUnitState.Builder)
    /**
     * @param rules Configuration block for invoice unit rules. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.Builder]*):
        com.pulumi.aws.invoicing.inputs.InvoiceUnitState.Builder =
      def argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.Builder]):
        com.pulumi.aws.invoicing.inputs.InvoiceUnitState.Builder =
      val argsBuilder = com.pulumi.aws.invoicing.inputs.InvoiceUnitTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
