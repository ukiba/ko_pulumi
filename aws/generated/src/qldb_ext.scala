package jp.ukiba.ko_pulumi
package aws

object qldb_ext:
  extension (builder: com.pulumi.aws.qldb.StreamArgs.Builder)
    /**
     * @param kinesisConfiguration Configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * @return builder
     */
    inline def kinesisConfiguration(args: Endofunction[com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.Builder]):
        com.pulumi.aws.qldb.StreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.builder
      builder.kinesisConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.qldb.inputs.StreamState.Builder)
    /**
     * @param kinesisConfiguration Configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * @return builder
     */
    inline def kinesisConfiguration(args: Endofunction[com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.Builder]):
        com.pulumi.aws.qldb.inputs.StreamState.Builder =
      val argsBuilder = com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs.builder
      builder.kinesisConfiguration(args(argsBuilder).build)
