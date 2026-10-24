package jp.ukiba.ko_pulumi
package aws

object datapipeline_ext:
  extension (builder: com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder)
    /**
     * @param parameterObjects Configuration block for the parameter objects used in the pipeline definition. See below
     * @return builder
     */
    def parameterObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.builder
      builder.parameterObjects(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterValues Configuration block for the parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.Builder]*):
        com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineObjects Configuration block for the objects that define the pipeline. See below
     * 
     * The following arguments are optional:
     * @return builder
     */
    def pipelineObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.builder
      builder.pipelineObjects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.Builder)
    /**
     * @param parameterValues Parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterValueArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterValueArgs.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionPlainArgs.Builder)
    /**
     * @param parameterValues Parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterValue.Builder]*):
        com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterValue.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder)
    /**
     * @param attributes Configuration block for attributes of the parameter object. See below
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectAttributeArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder)
    /**
     * @param fields Configuration block for Key-value pairs that define the properties of the object. See below
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectFieldArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder)
    /**
     * @param parameterObjects Configuration block for the parameter objects used in the pipeline definition. See below
     * @return builder
     */
    def parameterObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.builder
      builder.parameterObjects(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterValues Configuration block for the parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineObjects Configuration block for the objects that define the pipeline. See below
     * 
     * The following arguments are optional:
     * @return builder
     */
    def pipelineObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.builder
      builder.pipelineObjects(args.map(_(argsBuilder).build)*)
