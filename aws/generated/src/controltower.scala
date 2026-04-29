package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object controltower:
  /**
   * Allows the application of pre-defined controls to organizational units. For more information on usage, please see the
   *  [AWS Control Tower User Guide](https://docs.aws.amazon.com/controltower/latest/userguide/enable-guardrails.html).
   */
  def ControlTowerControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.controltower.ControlTowerControlArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.controltower.ControlTowerControlArgs.builder
    
    com.pulumi.aws.controltower.ControlTowerControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a new landing zone using Control Tower. For more information on usage, please see the
   *  [AWS Control Tower Landing Zone User Guide](https://docs.aws.amazon.com/controltower/latest/userguide/how-control-tower-works.html).
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import a Control Tower Landing Zone using the `id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:controltower/landingZone:LandingZone example 1A2B3C4D5E6F7G8H
   *  ```
   */
  def LandingZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.controltower.LandingZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.controltower.LandingZoneArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.controltower.LandingZone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Control Tower Baseline. */
  def Baseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.controltower.BaselineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.controltower.BaselineArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.controltower.Baseline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ControltowerFunctions = com.pulumi.aws.controltower.ControltowerFunctions
  object ControltowerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.controltower.ControltowerFunctions.*
  extension (self: ControltowerFunctions.type)
    /** List of Control Tower controls applied to an OU. */
    def getControls(args: Endofunction[com.pulumi.aws.controltower.inputs.GetControlsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.controltower.outputs.GetControlsResult] =
      val argsBuilder = com.pulumi.aws.controltower.inputs.GetControlsArgs.builder
      com.pulumi.aws.controltower.ControltowerFunctions.getControls(args(argsBuilder).build)

    /** List of Control Tower controls applied to an OU. */
    def getControlsPlain(args: Endofunction[com.pulumi.aws.controltower.inputs.GetControlsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.controltower.outputs.GetControlsResult] =
      val argsBuilder = com.pulumi.aws.controltower.inputs.GetControlsPlainArgs.builder
      com.pulumi.aws.controltower.ControltowerFunctions.getControlsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.controltower.ControlTowerControlArgs.Builder)
    /**
     * @param parameters Parameter values which are specified to configure the control when you enable it. See Parameters for more details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.Builder]*):
        com.pulumi.aws.controltower.ControlTowerControlArgs.Builder =
      def argsBuilder = com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.controltower.inputs.ControlTowerControlState.Builder)
    /**
     * @param parameters Parameter values which are specified to configure the control when you enable it. See Parameters for more details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.Builder]*):
        com.pulumi.aws.controltower.inputs.ControlTowerControlState.Builder =
      def argsBuilder = com.pulumi.aws.controltower.inputs.ControlTowerControlParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.controltower.inputs.BaselineState.Builder)
    /**
     * @param parameters A list of key-value objects that specify enablement parameters, where key is a string and value is a document of any type. See Parameter below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineParametersArgs.Builder]):
        com.pulumi.aws.controltower.inputs.BaselineState.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.Builder]):
        com.pulumi.aws.controltower.inputs.BaselineState.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.controltower.inputs.LandingZoneState.Builder)
    /**
     * @param driftStatuses The drift status summary of the landing zone.
     * @return builder
     */
    def driftStatuses(args: Endofunction[com.pulumi.aws.controltower.inputs.LandingZoneDriftStatusArgs.Builder]*):
        com.pulumi.aws.controltower.inputs.LandingZoneState.Builder =
      def argsBuilder = com.pulumi.aws.controltower.inputs.LandingZoneDriftStatusArgs.builder
      builder.driftStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.controltower.BaselineArgs.Builder)
    /**
     * @param parameters A list of key-value objects that specify enablement parameters, where key is a string and value is a document of any type. See Parameter below for details.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineParametersArgs.Builder]):
        com.pulumi.aws.controltower.BaselineArgs.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineParametersArgs.builder
      builder.parameters(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.Builder]):
        com.pulumi.aws.controltower.BaselineArgs.Builder =
      val argsBuilder = com.pulumi.aws.controltower.inputs.BaselineTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
