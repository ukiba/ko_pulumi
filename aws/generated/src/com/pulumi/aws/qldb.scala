package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object qldb:
  /**
   * Provides an AWS Quantum Ledger Database (QLDB) resource
   *  
   *  &gt; **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletionProtection = false` must be applied before attempting deletion.
   */
  def Ledger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.qldb.LedgerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.qldb.LedgerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.qldb.Ledger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type QldbFunctions = com.pulumi.aws.qldb.QldbFunctions
  object QldbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.qldb.QldbFunctions.*
  extension (self: QldbFunctions.type)
    /** Use this data source to fetch information about a Quantum Ledger Database. */
    def getLedger(args: Endofunction[com.pulumi.aws.qldb.inputs.GetLedgerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.qldb.outputs.GetLedgerResult] =
      val argsBuilder = com.pulumi.aws.qldb.inputs.GetLedgerArgs.builder
      com.pulumi.aws.qldb.QldbFunctions.getLedger(args(argsBuilder).build)

    /** Use this data source to fetch information about a Quantum Ledger Database. */
    def getLedgerPlain(args: Endofunction[com.pulumi.aws.qldb.inputs.GetLedgerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.qldb.outputs.GetLedgerResult] =
      val argsBuilder = com.pulumi.aws.qldb.inputs.GetLedgerPlainArgs.builder
      com.pulumi.aws.qldb.QldbFunctions.getLedgerPlain(args(argsBuilder).build)

  /** Provides an AWS Quantum Ledger Database (QLDB) Stream resource */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.qldb.StreamArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.qldb.StreamArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.qldb.Stream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.qldb.StreamArgs.Builder)
    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * @return builder
     */
    def kinesisConfiguration(args: Endofunction[com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.Builder]):
        com.pulumi.aws.qldb.StreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.builder
      builder.kinesisConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.qldb.inputs.StreamState.Builder)
    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * @return builder
     */
    def kinesisConfiguration(args: Endofunction[com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.Builder]):
        com.pulumi.aws.qldb.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.builder
      builder.kinesisConfiguration(args(argsBuilder).build)
