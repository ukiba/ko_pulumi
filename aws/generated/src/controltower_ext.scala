package jp.ukiba.ko_pulumi
package aws

object controltower_ext:
  extension (builder: com.pulumi.aws.controltower.BaselineArgs.Builder)
    /**
     * @param parameters A list of key-value objects that specify enablement parameters, where key is a string and value is a document of any type. See Parameter below for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineParametersArgs.Builder]):
        com.pulumi.aws.controltower.BaselineArgs.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.Builder]):
        com.pulumi.aws.controltower.BaselineArgs.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.controltower.ControlTowerControlArgs.Builder)
    /**
     * @param parameters Parameter values which are specified to configure the control when you enable it. See Parameters for more details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.Builder]*):
        com.pulumi.aws.controltower.ControlTowerControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.controltower.inputs.BaselineState.Builder)
    /**
     * @param parameters A list of key-value objects that specify enablement parameters, where key is a string and value is a document of any type. See Parameter below for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineParametersArgs.Builder]):
        com.pulumi.aws.controltower.inputs.BaselineState.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.Builder]):
        com.pulumi.aws.controltower.inputs.BaselineState.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.controltower.inputs.ControlTowerControlState.Builder)
    /**
     * @param parameters Parameter values which are specified to configure the control when you enable it. See Parameters for more details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.Builder]*):
        com.pulumi.aws.controltower.inputs.ControlTowerControlState.Builder =
      def argsBuilder = com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.controltower.inputs.LandingZoneState.Builder)
    /**
     * @param driftStatuses The drift status summary of the landing zone.
     * @return builder
     */
    inline def driftStatuses(args: Endofunction[com.pulumi.aws.controltower.inputs.LandingZoneDriftStatusArgs.Builder]*):
        com.pulumi.aws.controltower.inputs.LandingZoneState.Builder =
      def argsBuilder = com.pulumi.aws.controltower.inputs.LandingZoneDriftStatusArgs.builder
      builder.driftStatuses(args.map(_(argsBuilder).build)*)
