package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mediaconvert:
  extension (builder: com.pulumi.aws.mediaconvert.QueueArgs.Builder)
    /**
     * @param reservationPlanSettings A detail pricing plan of the  reserved queue. See below.
     * @return builder
     */
    def reservationPlanSettings(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.Builder]):
        com.pulumi.aws.mediaconvert.QueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.builder
      builder.reservationPlanSettings(args(argsBuilder).build)

  /** Provides an AWS Elemental MediaConvert Queue. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mediaconvert.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mediaconvert.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mediaconvert.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type MediaconvertFunctions = com.pulumi.aws.mediaconvert.MediaconvertFunctions
  object MediaconvertFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.mediaconvert.MediaconvertFunctions.*
  extension (self: MediaconvertFunctions.type)
    /** Retrieve information about a AWS Elemental MediaConvert Queue. */
    def getQueue(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.GetQueueArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mediaconvert.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.GetQueueArgs.builder
      com.pulumi.aws.mediaconvert.MediaconvertFunctions.getQueue(args(argsBuilder).build)

    /** Retrieve information about a AWS Elemental MediaConvert Queue. */
    def getQueuePlain(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.GetQueuePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mediaconvert.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.mediaconvert.MediaconvertFunctions.getQueuePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mediaconvert.inputs.QueueState.Builder)
    /**
     * @param reservationPlanSettings A detail pricing plan of the  reserved queue. See below.
     * @return builder
     */
    def reservationPlanSettings(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.Builder]):
        com.pulumi.aws.mediaconvert.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.builder
      builder.reservationPlanSettings(args(argsBuilder).build)
