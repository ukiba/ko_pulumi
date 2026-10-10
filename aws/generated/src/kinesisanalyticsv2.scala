package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object kinesisanalyticsv2:
  /**
   * Manages a Kinesis Analytics v2 Application.
   * This resource can be used to manage both Kinesis Data Analytics for SQL applications and Kinesis Data Analytics for Apache Flink applications.
   * 
   * &gt; **Note:** Kinesis Data Analytics for SQL applications created using this resource cannot currently be viewed in the AWS Console. To manage Kinesis Data Analytics for SQL applications that can also be viewed in the AWS Console, use the `aws.kinesis.AnalyticsApplication` resource.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.builder
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
    com.pulumi.aws.kinesisanalyticsv2.Application(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.Builder)
    /**
     * @param applicationConfiguration Application configuration. See `applicationConfiguration` Block below.
     * @return builder
     */
    def applicationConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.builder
      builder.applicationConfiguration(args(argsBuilder).build)

    /**
     * @param cloudwatchLoggingOptions CloudWatch log stream to monitor application configuration errors. See `cloudwatchLoggingOptions` Block below.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)

  /**
   * Manages a Kinesis Analytics v2 Application Snapshot.
   * Snapshots are the AWS implementation of [Flink Savepoints](https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/state/savepoints.html).
   */
  def ApplicationSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs.builder
    com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationArgs.Builder)
    /**
     * @param codeContent Location and type of the application code. See `codeContent` Block below.
     * @return builder
     */
    def codeContent(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs.builder
      builder.codeContent(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs.Builder)
    /**
     * @param s3ContentLocation Information about the Amazon S3 bucket containing the application code. See `s3ContentLocation` Block below.
     * @return builder
     */
    def s3ContentLocation(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs.builder
      builder.s3ContentLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder)
    /**
     * @param applicationCodeConfiguration Code location and type parameters for the application. See `applicationCodeConfiguration` Block below.
     * @return builder
     */
    def applicationCodeConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationArgs.builder
      builder.applicationCodeConfiguration(args(argsBuilder).build)

    /**
     * @param applicationEncryptionConfiguration Encryption configuration for the application. Use this to encrypt data at rest in the application. See `applicationEncryptionConfiguration` Block below.
     * @return builder
     */
    def applicationEncryptionConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationEncryptionConfigurationArgs.builder
      builder.applicationEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param applicationSnapshotConfiguration Snapshot configuration for a Flink-based application. See `applicationSnapshotConfiguration` Block below.
     * @return builder
     */
    def applicationSnapshotConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs.builder
      builder.applicationSnapshotConfiguration(args(argsBuilder).build)

    /**
     * @param environmentProperties Execution properties for a Flink-based application. See `environmentProperties` Block below.
     * @return builder
     */
    def environmentProperties(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesArgs.builder
      builder.environmentProperties(args(argsBuilder).build)

    /**
     * @param flinkApplicationConfiguration Configuration of a Flink-based application. See `flinkApplicationConfiguration` Block below.
     * @return builder
     */
    def flinkApplicationConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs.builder
      builder.flinkApplicationConfiguration(args(argsBuilder).build)

    /**
     * @param runConfiguration Starting properties for a Flink-based application. See `runConfiguration` Block below.
     * @return builder
     */
    def runConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs.builder
      builder.runConfiguration(args(argsBuilder).build)

    /**
     * @param sqlApplicationConfiguration Configuration of a SQL-based application. See `sqlApplicationConfiguration` Block below.
     * @return builder
     */
    def sqlApplicationConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs.builder
      builder.sqlApplicationConfiguration(args(argsBuilder).build)

    /**
     * @param vpcConfiguration VPC configuration of a Flink-based application. See `vpcConfiguration` Block below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationVpcConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesArgs.Builder)
    /**
     * @param propertyGroups Execution property groups. See `propertyGroup` Block below.
     * @return builder
     */
    def propertyGroups(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs.Builder]*):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs.builder
      builder.propertyGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs.Builder)
    /**
     * @param checkpointConfiguration Application&#39;s checkpointing configuration. See `checkpointConfiguration` Block below.
     * @return builder
     */
    def checkpointConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs.builder
      builder.checkpointConfiguration(args(argsBuilder).build)

    /**
     * @param monitoringConfiguration Configuration parameters for CloudWatch logging for an application. See `monitoringConfiguration` Block below.
     * @return builder
     */
    def monitoringConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs.builder
      builder.monitoringConfiguration(args(argsBuilder).build)

    /**
     * @param parallelismConfiguration Parameters for how an application executes multiple tasks simultaneously. See `parallelismConfiguration` Block below.
     * @return builder
     */
    def parallelismConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs.builder
      builder.parallelismConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs.Builder)
    /**
     * @param applicationRestoreConfiguration Restore behavior of a restarting application. See `applicationRestoreConfiguration` Block below.
     * @return builder
     */
    def applicationRestoreConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs.builder
      builder.applicationRestoreConfiguration(args(argsBuilder).build)

    /**
     * @param flinkRunConfiguration Starting parameters for a Flink-based application. See `flinkRunConfiguration` Block below.
     * @return builder
     */
    def flinkRunConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs.builder
      builder.flinkRunConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs.Builder)
    /**
     * @param input Input stream used by the application. See `input` Block below.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param outputs Destination streams used by the application. See `output` Block below.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.Builder]*):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

    /**
     * @param referenceDataSource Reference data source used by the application. See `referenceDataSource` Block below.
     * @return builder
     */
    def referenceDataSource(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs.builder
      builder.referenceDataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder)
    /**
     * @param inputParallelism Number of in-application streams to create. See `inputParallelism` Block below.
     * @return builder
     */
    def inputParallelism(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs.builder
      builder.inputParallelism(args(argsBuilder).build)

    /**
     * @param inputProcessingConfiguration Input processing configuration for the input. An input processor transforms records as they are received from the stream, before the application&#39;s SQL code executes. See `inputProcessingConfiguration` Block below.
     * @return builder
     */
    def inputProcessingConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs.builder
      builder.inputProcessingConfiguration(args(argsBuilder).build)

    /**
     * @param inputSchema Format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. See `inputSchema` Block below.
     * @return builder
     */
    def inputSchema(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs.builder
      builder.inputSchema(args(argsBuilder).build)

    /**
     * @param inputStartingPositionConfigurations Point at which the application starts processing records from the streaming source. See `inputStartingPositionConfiguration` Block below.
     * @return builder
     */
    def inputStartingPositionConfigurations(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs.Builder]*):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs.builder
      builder.inputStartingPositionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param kinesisFirehoseInput If the streaming source is a Kinesis Data Firehose delivery stream, identifies the delivery stream&#39;s ARN. See `kinesisFirehoseInput` Block below.
     * @return builder
     */
    def kinesisFirehoseInput(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInputArgs.builder
      builder.kinesisFirehoseInput(args(argsBuilder).build)

    /**
     * @param kinesisStreamsInput If the streaming source is a Kinesis data stream, identifies the stream&#39;s ARN. See `kinesisStreamsInput` Block below.
     * @return builder
     */
    def kinesisStreamsInput(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInputArgs.builder
      builder.kinesisStreamsInput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs.Builder)
    /**
     * @param inputLambdaProcessor Lambda function used to preprocess the records in the stream before being processed by your application code. See `inputLambdaProcessor` Block below.
     * @return builder
     */
    def inputLambdaProcessor(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorArgs.builder
      builder.inputLambdaProcessor(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs.Builder)
    /**
     * @param recordColumns Mapping of each data element in the streaming source to the corresponding column in the in-application stream. See `recordColumn` Block below.
     * @return builder
     */
    def recordColumns(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs.Builder]*):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs.builder
      builder.recordColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param recordFormat Format of the records on the streaming source. See `recordFormat` Block below.
     * @return builder
     */
    def recordFormat(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs.builder
      builder.recordFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs.Builder)
    /**
     * @param mappingParameters Additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source. See `mappingParameters` Block below.
     * @return builder
     */
    def mappingParameters(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersArgs.builder
      builder.mappingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersArgs.Builder)
    /**
     * @param csvMappingParameters Additional mapping information when the record format uses delimiters (for example, CSV). See `csvMappingParameters` Block below.
     * @return builder
     */
    def csvMappingParameters(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersCsvMappingParametersArgs.builder
      builder.csvMappingParameters(args(argsBuilder).build)

    /**
     * @param jsonMappingParameters Additional mapping information when JSON is the record format on the streaming source. See `jsonMappingParameters` Block below.
     * @return builder
     */
    def jsonMappingParameters(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatMappingParametersJsonMappingParametersArgs.builder
      builder.jsonMappingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.Builder)
    /**
     * @param destinationSchema Data format when records are written to the destination. See `destinationSchema` Block below.
     * @return builder
     */
    def destinationSchema(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs.builder
      builder.destinationSchema(args(argsBuilder).build)

    /**
     * @param kinesisFirehoseOutput Destination Kinesis Data Firehose delivery stream. See `kinesisFirehoseOutput` Block below.
     * @return builder
     */
    def kinesisFirehoseOutput(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputArgs.builder
      builder.kinesisFirehoseOutput(args(argsBuilder).build)

    /**
     * @param kinesisStreamsOutput Destination Kinesis data stream. See `kinesisStreamsOutput` Block below.
     * @return builder
     */
    def kinesisStreamsOutput(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputArgs.builder
      builder.kinesisStreamsOutput(args(argsBuilder).build)

    /**
     * @param lambdaOutput Destination Lambda function. See `lambdaOutput` Block below.
     * @return builder
     */
    def lambdaOutput(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputArgs.builder
      builder.lambdaOutput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs.Builder)
    /**
     * @param referenceSchema Format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. See `referenceSchema` Block below.
     * @return builder
     */
    def referenceSchema(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs.builder
      builder.referenceSchema(args(argsBuilder).build)

    /**
     * @param s3ReferenceDataSource S3 bucket and object that contains the reference data. See `s3ReferenceDataSource` Block below.
     * @return builder
     */
    def s3ReferenceDataSource(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs.builder
      builder.s3ReferenceDataSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs.Builder)
    /**
     * @param recordColumns Mapping of each data element in the streaming source to the corresponding column in the in-application stream. See `recordColumn` Block above.
     * @return builder
     */
    def recordColumns(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs.Builder]*):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs.Builder =
      def argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumnArgs.builder
      builder.recordColumns(args.map(_(argsBuilder).build)*)

    /**
     * @param recordFormat Format of the records on the streaming source. See `recordFormat` Block above.
     * @return builder
     */
    def recordFormat(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs.builder
      builder.recordFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs.Builder)
    /**
     * @param mappingParameters Additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source. See `mappingParameters` Block below.
     * @return builder
     */
    def mappingParameters(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs.builder
      builder.mappingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs.Builder)
    /**
     * @param csvMappingParameters Additional mapping information when the record format uses delimiters (for example, CSV). See `csvMappingParameters` Block below.
     * @return builder
     */
    def csvMappingParameters(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParametersArgs.builder
      builder.csvMappingParameters(args(argsBuilder).build)

    /**
     * @param jsonMappingParameters Additional mapping information when JSON is the record format on the streaming source. See `jsonMappingParameters` Block below.
     * @return builder
     */
    def jsonMappingParameters(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParametersArgs.builder
      builder.jsonMappingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationState.Builder)
    /**
     * @param applicationConfiguration Application configuration. See `applicationConfiguration` Block below.
     * @return builder
     */
    def applicationConfiguration(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs.builder
      builder.applicationConfiguration(args(argsBuilder).build)

    /**
     * @param cloudwatchLoggingOptions CloudWatch log stream to monitor application configuration errors. See `cloudwatchLoggingOptions` Block below.
     * @return builder
     */
    def cloudwatchLoggingOptions(args: Endofunction[com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsArgs.Builder]):
        com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsArgs.builder
      builder.cloudwatchLoggingOptions(args(argsBuilder).build)
