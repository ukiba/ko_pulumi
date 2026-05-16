package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object qldb:
  /**
   * Provides an AWS Quantum Ledger Database (QLDB) resource
   * 
   *  &gt; **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletionProtection = false` must be applied before attempting deletion.
   */
  def Ledger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
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

  object QldbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to fetch information about a Quantum Ledger Database. */
    inline def getLedger(args: Endofunction[com.pulumi.aws.qldb.inputs.GetLedgerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.qldb.outputs.GetLedgerResult] =
      val argsBuilder = com.pulumi.aws.qldb.inputs.GetLedgerArgs.builder
      com.pulumi.aws.qldb.QldbFunctions.getLedger(args(argsBuilder).build)

    /** Use this data source to fetch information about a Quantum Ledger Database. */
    inline def getLedgerPlain(args: Endofunction[com.pulumi.aws.qldb.inputs.GetLedgerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.qldb.outputs.GetLedgerResult] =
      val argsBuilder = com.pulumi.aws.qldb.inputs.GetLedgerPlainArgs.builder
      com.pulumi.aws.qldb.QldbFunctions.getLedgerPlain(args(argsBuilder).build)

  /** Provides an AWS Quantum Ledger Database (QLDB) Stream resource */
  def Stream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.qldb.StreamArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.qldb.inputs.StreamState.Builder)
    /**
     * @param kinesisConfiguration The configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * @return builder
     */
    def kinesisConfiguration(args: Endofunction[com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.Builder]):
        com.pulumi.aws.qldb.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.builder
      builder.kinesisConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.qldb.inputs.StreamState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
