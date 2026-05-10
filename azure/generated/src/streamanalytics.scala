package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object streamanalytics:
  extension (builder: com.pulumi.azure.streamanalytics.FunctionJavaScriptUDFArgs.Builder)
    /**
     * @param inputs One or more `input` blocks as defined below.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFInputArgs.Builder]*):
        com.pulumi.azure.streamanalytics.FunctionJavaScriptUDFArgs.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param output An `output` blocks as defined below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFOutputArgs.Builder]):
        com.pulumi.azure.streamanalytics.FunctionJavaScriptUDFArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFOutputArgs.builder
      builder.output(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.OutputEventHubArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputEventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.ReferenceInputBlobArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.ReferenceInputBlobArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  /** Manages a Stream Analytics Output to an Azure Synapse Analytics Workspace. */
  def OutputSynapse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputSynapseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputSynapseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputSynapse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output to a ServiceBus Topic. */
  def OutputServicebusTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputServicebusTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output to Blob Storage. */
  def OutputBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputBlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputBlobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputIotHubArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputIotHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  /** Manages a JavaScript UDF Function within Stream Analytics Streaming Job. */
  def FunctionJavaScriptUDF(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.FunctionJavaScriptUDFArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.FunctionJavaScriptUDFArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.FunctionJavaScriptUDF(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output powerBI. */
  def OutputPowerbi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputPowerbiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputPowerbiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputPowerbi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output to CosmosDB. */
  def OutputCosmosdb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputCosmosdbArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputCosmosdbArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputCosmosdb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Job Schedule. */
  def JobSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.JobScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.streamanalytics.JobScheduleArgs.builder
    com.pulumi.azure.streamanalytics.JobSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output Table. */
  def OutputTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Stream Input IoTHub. */
  def StreamInputIotHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.StreamInputIotHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.StreamInputIotHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.StreamInputIotHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a JavaScript UDA Function within a Stream Analytics Streaming Job. */
  def FunctionJavascriptUda(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.FunctionJavascriptUdaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.FunctionJavascriptUdaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.FunctionJavascriptUda(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Job. */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.JobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.JobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.streamanalytics.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.streamanalytics.JobArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.JobIdentityArgs.Builder]):
        com.pulumi.azure.streamanalytics.JobArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.JobIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param jobStorageAccounts The details of the job storage account. A `jobStorageAccount` block as defined below.
     * 
     *  &gt; **Note:** `contentStoragePolicy` must be set to `JobStorageAccount` when specifying `jobStorageAccount`.
     * @return builder
     */
    def jobStorageAccounts(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.Builder]*):
        com.pulumi.azure.streamanalytics.JobArgs.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.builder
      builder.jobStorageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.streamanalytics.JobArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.streamanalytics.OutputServiceBusQueueArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputServiceBusQueueArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.FunctionJavascriptUdaArgs.Builder)
    /**
     * @param inputs One or more `input` blocks as defined below.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaInputArgs.Builder]*):
        com.pulumi.azure.streamanalytics.FunctionJavascriptUdaArgs.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param output An `output` block as defined below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaOutputArgs.Builder]):
        com.pulumi.azure.streamanalytics.FunctionJavascriptUdaArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaOutputArgs.builder
      builder.output(args(argsBuilder).build)

  /** Manages a Stream Analytics Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.streamanalytics.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputBlobArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputBlobArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.OutputBlobArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputBlobArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  /**
   * Manages a Stream Analytics Job Storage Account. Use this resource for managing the Job Storage Account using `Msi` authentication with a `SystemAssigned` identity.
   * 
   *  &gt; **Note:** The Job Storage Account for a Stream Analytics Job can be managed on the `azure.streamanalytics.Job` resource with the `jobStorageAccount` block, or with this resource. We do not recommend managing the Job Storage Account through both means as this can lead to conflicts.
   */
  def JobStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.JobStorageAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.streamanalytics.JobStorageAccountArgs.builder
    com.pulumi.azure.streamanalytics.JobStorageAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource creates a Stream Input of type `Microsoft.EventHub/EventHub`, to create a Stream Input of type `Microsoft.ServiceBus/EventHub` please use the resource azurerm_stream_analytics_stream_input_eventhub.
   * 
   *  Manages a Stream Analytics Stream Input EventHub V2.
   */
  def StreamInputEventHubV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.StreamInputEventHubV2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.StreamInputEventHubV2Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.StreamInputEventHubV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type StreamanalyticsFunctions = com.pulumi.azure.streamanalytics.StreamanalyticsFunctions
  object StreamanalyticsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.streamanalytics.StreamanalyticsFunctions.*
  extension (self: StreamanalyticsFunctions.type)
    /** Use this data source to access information about an existing Stream Analytics Job. */
    def getJob(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.GetJobArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.streamanalytics.outputs.GetJobResult] =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.GetJobArgs.builder
      com.pulumi.azure.streamanalytics.StreamanalyticsFunctions.getJob(args(argsBuilder).build)

    /** Use this data source to access information about an existing Stream Analytics Job. */
    def getJobPlain(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.GetJobPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.streamanalytics.outputs.GetJobResult] =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.GetJobPlainArgs.builder
      com.pulumi.azure.streamanalytics.StreamanalyticsFunctions.getJobPlain(args(argsBuilder).build)

  /** Manages a Stream Analytics Reference Input Blob. Reference data (also known as a lookup table) is a finite data set that is static or slowly changing in nature, used to perform a lookup or to correlate with your data stream. Learn more [here](https://docs.microsoft.com/azure/stream-analytics/stream-analytics-use-reference-data#azure-blob-storage). */
  def ReferenceInputBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.ReferenceInputBlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.ReferenceInputBlobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.ReferenceInputBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Managed Private Endpoint. */
  def ManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.ManagedPrivateEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.ManagedPrivateEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.ManagedPrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputEventHubV2Args.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2SerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputEventHubV2Args.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2SerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputEventHubArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputEventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  /**
   * &gt; **Note:** This resource creates a Stream Input of type `Microsoft.ServiceBus/EventHub`, to create a Stream Input of type `Microsoft.EventHub/EventHub` please use the resource azurerm_stream_analytics_stream_input_eventhub_v2.
   * 
   *  Manages a Stream Analytics Stream Input EventHub.
   */
  def StreamInputEventHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.StreamInputEventHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.StreamInputEventHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.StreamInputEventHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output to a ServiceBus Queue. */
  def OutputServiceBusQueue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputServiceBusQueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputServiceBusQueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputServiceBusQueue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output to Microsoft SQL Server Database. */
  def OutputMssql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputMssqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputMssqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputMssql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Stream Input Blob. */
  def StreamInputBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.StreamInputBlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.StreamInputBlobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.StreamInputBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Reference Input from MS SQL. Reference data (also known as a lookup table) is a finite data set that is static or slowly changing in nature, used to perform a lookup or to correlate with your data stream. Learn more [here](https://docs.microsoft.com/azure/stream-analytics/stream-analytics-use-reference-data#azure-sql-database). */
  def ReferenceInputMssql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.ReferenceInputMssqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.ReferenceInputMssqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.ReferenceInputMssql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaState.Builder)
    /**
     * @param inputs One or more `input` blocks as defined below.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaInputArgs.Builder]*):
        com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaState.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param output An `output` block as defined below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaOutputArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaOutputArgs.builder
      builder.output(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputBlobState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputBlobState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2State.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2SerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2State.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2SerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFState.Builder)
    /**
     * @param inputs One or more `input` blocks as defined below.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFInputArgs.Builder]*):
        com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFState.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param output An `output` blocks as defined below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFOutputArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.FunctionJavaScriptUDFOutputArgs.builder
      builder.output(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.StreamInputBlobState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.StreamInputBlobState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputEventHubState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputEventHubState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.JobState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.JobIdentityArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.JobIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param jobStorageAccounts The details of the job storage account. A `jobStorageAccount` block as defined below.
     * 
     *  &gt; **Note:** `contentStoragePolicy` must be set to `JobStorageAccount` when specifying `jobStorageAccount`.
     * @return builder
     */
    def jobStorageAccounts(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.Builder]*):
        com.pulumi.azure.streamanalytics.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.builder
      builder.jobStorageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.streamanalytics.inputs.JobState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  /** Manages a Stream Analytics Output Function. */
  def OutputFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputFunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputFunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Stream Analytics Output to an EventHub. */
  def OutputEventHub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.streamanalytics.OutputEventHubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.streamanalytics.OutputEventHubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.streamanalytics.OutputEventHub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
