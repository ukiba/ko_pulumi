package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object controltower:
  /** Resource for managing an AWS Control Tower Baseline. */
  def Baseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.controltower.BaselineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.controltower.BaselineArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.controltower.Baseline(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Allows the application of pre-defined controls to organizational units. For more information on usage, please see the
   * [AWS Control Tower User Guide](https://docs.aws.amazon.com/controltower/latest/userguide/enable-guardrails.html).
   */
  def ControlTowerControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.controltower.ControlTowerControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.controltower.ControlTowerControlArgs.builder
    com.pulumi.aws.controltower.ControlTowerControl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ControltowerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** List of Control Tower controls applied to an OU. */
    inline def getControls(args: Endofunction[com.pulumi.aws.controltower.inputs.GetControlsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.controltower.outputs.GetControlsResult] =
      val argsBuilder = com.pulumi.aws.controltower.inputs.GetControlsArgs.builder
      com.pulumi.aws.controltower.ControltowerFunctions.getControls(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** List of Control Tower controls applied to an OU. */
    inline def getControlsPlain(args: Endofunction[com.pulumi.aws.controltower.inputs.GetControlsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.controltower.outputs.GetControlsResult] =
      val argsBuilder = com.pulumi.aws.controltower.inputs.GetControlsPlainArgs.builder
      com.pulumi.aws.controltower.ControltowerFunctions.getControlsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Creates a new landing zone using Control Tower. For more information on usage, please see the
   * [AWS Control Tower Landing Zone User Guide](https://docs.aws.amazon.com/controltower/latest/userguide/how-control-tower-works.html).
   * 
   * ## Import
   * 
   * Using `pulumi import`, import a Control Tower Landing Zone using the `id`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:controltower/landingZone:LandingZone example 1A2B3C4D5E6F7G8H
   * ```
   */
  def LandingZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.controltower.LandingZoneArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.controltower.LandingZoneArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.controltower.LandingZone(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
