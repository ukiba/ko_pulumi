package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object mediaconvert:
  object MediaconvertFunctions:
    /** Retrieve information about a AWS Elemental MediaConvert Queue. */
    inline def getQueue(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.GetQueueArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mediaconvert.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.GetQueueArgs.builder
      com.pulumi.aws.mediaconvert.MediaconvertFunctions.getQueue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a AWS Elemental MediaConvert Queue. */
    inline def getQueuePlain(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.GetQueuePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mediaconvert.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.mediaconvert.MediaconvertFunctions.getQueuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an AWS Elemental MediaConvert Queue. */
  inline def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mediaconvert.QueueArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mediaconvert.QueueArgs.builder
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
    com.pulumi.aws.mediaconvert.Queue(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
