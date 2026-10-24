package jp.ukiba.ko_pulumi
package aws

object mediaconvert_ext:
  extension (builder: com.pulumi.aws.mediaconvert.QueueArgs.Builder)
    /**
     * @param reservationPlanSettings Detail pricing plan of the reserved queue. See below.
     * @return builder
     */
    inline def reservationPlanSettings(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.Builder]):
        com.pulumi.aws.mediaconvert.QueueArgs.Builder =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.builder
      builder.reservationPlanSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mediaconvert.inputs.QueueState.Builder)
    /**
     * @param reservationPlanSettings Detail pricing plan of the reserved queue. See below.
     * @return builder
     */
    inline def reservationPlanSettings(args: Endofunction[com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.Builder]):
        com.pulumi.aws.mediaconvert.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.aws.mediaconvert.inputs.QueueReservationPlanSettingsArgs.builder
      builder.reservationPlanSettings(args(argsBuilder).build)
