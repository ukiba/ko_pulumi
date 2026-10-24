package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object qldb:
  /**
   * Provides an AWS Quantum Ledger Database (QLDB) resource
   * 
   * &gt; **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletionProtection = false` must be applied before attempting deletion.
   */
  def Ledger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.qldb.LedgerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.qldb.LedgerArgs.builder
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
    com.pulumi.aws.qldb.Ledger(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object QldbFunctions:
    /** Use this data source to fetch information about a Quantum Ledger Database. */
    inline def getLedger(args: Endofunction[com.pulumi.aws.qldb.inputs.GetLedgerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.qldb.outputs.GetLedgerResult] =
      val argsBuilder = com.pulumi.aws.qldb.inputs.GetLedgerArgs.builder
      com.pulumi.aws.qldb.QldbFunctions.getLedger(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to fetch information about a Quantum Ledger Database. */
    inline def getLedgerPlain(args: Endofunction[com.pulumi.aws.qldb.inputs.GetLedgerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.qldb.outputs.GetLedgerResult] =
      val argsBuilder = com.pulumi.aws.qldb.inputs.GetLedgerPlainArgs.builder
      com.pulumi.aws.qldb.QldbFunctions.getLedgerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an AWS Quantum Ledger Database (QLDB) Stream resource */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.qldb.StreamArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.qldb.StreamArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.qldb.Stream(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
