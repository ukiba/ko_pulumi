package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object codeguruprofiler:
  object CodeguruprofilerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS CodeGuru Profiler Profiling Group. */
    inline def getProfilingGroup(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codeguruprofiler.outputs.GetProfilingGroupResult] =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupArgs.builder
      com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.getProfilingGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS CodeGuru Profiler Profiling Group. */
    inline def getProfilingGroupPlain(args: Endofunction[com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codeguruprofiler.outputs.GetProfilingGroupResult] =
      val argsBuilder = com.pulumi.aws.codeguruprofiler.inputs.GetProfilingGroupPlainArgs.builder
      com.pulumi.aws.codeguruprofiler.CodeguruprofilerFunctions.getProfilingGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing an AWS CodeGuru Profiler Profiling Group. */
  def ProfilingGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)
