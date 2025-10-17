package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codeguruprofiler:
  object CodeguruprofilerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS CodeGuru Profiler Profiling Group. */
    inline def getProfilingGroup(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.codeguruprofiler.outputs.GetProfilingGroupResult] =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupArgs.builder
      com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.getProfilingGroup(args(argsBuilder).build)

    /** Data source for managing an AWS CodeGuru Profiler Profiling Group. */
    inline def getProfilingGroupPlain(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeguruprofiler.outputs.GetProfilingGroupResult] =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupPlainArgs.builder
      com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.getProfilingGroupPlain(args(argsBuilder).build)

  /** Resource for managing an AWS CodeGuru Profiler Profiling Group. */
  def ProfilingGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.builder
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
    com.pulumi.aws.codeguruprofiler.ProfilingGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
