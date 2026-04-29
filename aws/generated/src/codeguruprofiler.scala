package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codeguruprofiler:
  type CodeguruprofilerFunctions = com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions
  object CodeguruprofilerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.*
  extension (self: CodeguruprofilerFunctions.type)
    /** Data source for managing an AWS CodeGuru Profiler Profiling Group. */
    def getProfilingGroup(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codeguruprofiler.outputs.GetProfilingGroupResult] =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupArgs.builder
      com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.getProfilingGroup(args(argsBuilder).build)

    /** Data source for managing an AWS CodeGuru Profiler Profiling Group. */
    def getProfilingGroupPlain(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeguruprofiler.outputs.GetProfilingGroupResult] =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupPlainArgs.builder
      com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.getProfilingGroupPlain(args(argsBuilder).build)

  /** Resource for managing an AWS CodeGuru Profiler Profiling Group. */
  def ProfilingGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codeguruprofiler.ProfilingGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder)
    /**
     * @param agentOrchestrationConfig Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
     * @return builder
     */
    def agentOrchestrationConfig(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.Builder]):
        com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.builder
      builder.agentOrchestrationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupState.Builder)
    /**
     * @param agentOrchestrationConfig Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
     * @return builder
     */
    def agentOrchestrationConfig(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.Builder]):
        com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.builder
      builder.agentOrchestrationConfig(args(argsBuilder).build)
