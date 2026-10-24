package jp.ukiba.ko_pulumi
package aws

object codeguruprofiler_ext:
  extension (builder: com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder)
    /**
     * @param agentOrchestrationConfig Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
     * @return builder
     */
    inline def agentOrchestrationConfig(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.Builder]):
        com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.builder
      builder.agentOrchestrationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupState.Builder)
    /**
     * @param agentOrchestrationConfig Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
     * @return builder
     */
    inline def agentOrchestrationConfig(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.Builder]):
        com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs.builder
      builder.agentOrchestrationConfig(args(argsBuilder).build)
