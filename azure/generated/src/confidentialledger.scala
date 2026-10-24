package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object confidentialledger:
  /** Manages a Confidential Ledger. */
  inline def Ledger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.confidentialledger.LedgerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.confidentialledger.LedgerArgs.builder
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
    com.pulumi.azure.confidentialledger.Ledger(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
