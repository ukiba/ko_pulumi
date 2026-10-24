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
        resourceOptions(conf.customResourceOptionsBuilder).build)
