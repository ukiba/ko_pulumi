package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object invoicing:
  /** Manages an AWS Invoice Unit for organizational billing. */
  def InvoiceUnit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.invoicing.InvoiceUnitArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.invoicing.InvoiceUnit(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.invoicing.InvoiceUnitArgs.Builder)
    /**
     * @param rules Configuration block for invoice unit rules. See `rule` below.
     * 
     * The following arguments are optional:
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
     * @param rules Configuration block for invoice unit rules. See `rule` below.
     * 
     * The following arguments are optional:
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
