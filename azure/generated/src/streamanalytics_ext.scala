package jp.ukiba.ko_pulumi
package azure

object streamanalytics_ext:
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
     * &gt; **Note:** `contentStoragePolicy` must be set to `JobStorageAccount` when specifying `jobStorageAccount`.
     * @return builder
     */
    def jobStorageAccounts(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.Builder]*):
        com.pulumi.azure.streamanalytics.JobArgs.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.builder
      builder.jobStorageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.streamanalytics.OutputBlobArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputBlobArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.OutputEventHubArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputEventHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.OutputServiceBusQueueArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputServiceBusQueueArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.OutputServicebusTopicArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.builder
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

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputBlobArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputBlobArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.builder
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

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputEventHubV2Args.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2SerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputEventHubV2Args.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputEventHubV2SerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.StreamInputIotHubArgs.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.StreamInputIotHubArgs.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.builder
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
     * &gt; **Note:** `contentStoragePolicy` must be set to `JobStorageAccount` when specifying `jobStorageAccount`.
     * @return builder
     */
    def jobStorageAccounts(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.Builder]*):
        com.pulumi.azure.streamanalytics.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs.builder
      builder.jobStorageAccounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputBlobState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputBlobState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputBlobSerializationArgs.builder
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

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServiceBusQueueSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs.builder
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

  extension (builder: com.pulumi.azure.streamanalytics.inputs.StreamInputBlobState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.StreamInputBlobState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputBlobSerializationArgs.builder
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

  extension (builder: com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubState.Builder)
    /**
     * @param serialization A `serialization` block as defined below.
     * @return builder
     */
    def serialization(args: Endofunction[com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.Builder]):
        com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubState.Builder =
      val argsBuilder = com.pulumi.azure.streamanalytics.inputs.StreamInputIotHubSerializationArgs.builder
      builder.serialization(args(argsBuilder).build)
