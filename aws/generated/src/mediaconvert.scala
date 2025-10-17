package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object mediaconvert:
  object MediaconvertFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieve information about a AWS Elemental MediaConvert Queue. */
    inline def getQueue(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.GetQueueArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.mediaconvert.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.GetQueueArgs.builder
      com.pulumi.aws.mediaconvert.MediaconvertFunctions.getQueue(args(argsBuilder).build)

    /** Retrieve information about a AWS Elemental MediaConvert Queue. */
    inline def getQueuePlain(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.GetQueuePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mediaconvert.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.GetQueuePlainArgs.builder
      com.pulumi.aws.mediaconvert.MediaconvertFunctions.getQueuePlain(args(argsBuilder).build)

  /** Provides an AWS Elemental MediaConvert Queue. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.mediaconvert.QueueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.mediaconvert.QueueArgs.Builder)
    /**
     * @param reservationPlanSettings A detail pricing plan of the  reserved queue. See below.
     * @return builder
     */
    def reservationPlanSettings(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.Builder]):
        com.pulumi.aws.mediaconvert.QueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.builder
      builder.reservationPlanSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mediaconvert.inputs.QueueState.Builder)
    /**
     * @param reservationPlanSettings A detail pricing plan of the  reserved queue. See below.
     * @return builder
     */
    def reservationPlanSettings(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.Builder]):
        com.pulumi.aws.mediaconvert.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.builder
      builder.reservationPlanSettings(args(argsBuilder).build)
