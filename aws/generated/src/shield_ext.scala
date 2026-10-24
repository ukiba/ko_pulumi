package jp.ukiba.ko_pulumi
package aws

object shield_ext:
  extension (builder: com.pulumi.aws.shield.ApplicationLayerAutomaticResponseArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.ApplicationLayerAutomaticResponseArgs.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.ProactiveEngagementArgs.Builder)
    /**
     * @param emergencyContacts One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     * @return builder
     */
    inline def emergencyContacts(args: Endofunction[com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.Builder]*):
        com.pulumi.aws.shield.ProactiveEngagementArgs.Builder =
      def argsBuilder = com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.builder
      builder.emergencyContacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseState.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.inputs.ProactiveEngagementState.Builder)
    /**
     * @param emergencyContacts One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     * @return builder
     */
    inline def emergencyContacts(args: Endofunction[com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.Builder]*):
        com.pulumi.aws.shield.inputs.ProactiveEngagementState.Builder =
      def argsBuilder = com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.builder
      builder.emergencyContacts(args.map(_(argsBuilder).build)*)
