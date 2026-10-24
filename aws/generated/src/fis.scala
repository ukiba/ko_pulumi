package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object fis:
  /**
   * Provides an FIS Experiment Template, which can be used to run an experiment.
   * An experiment template contains one or more actions to run on specified targets during an experiment.
   * It also contains the stop conditions that prevent the experiment from going out of bounds.
   * See [Amazon Fault Injection Simulator](https://docs.aws.amazon.com/fis/index.html)
   * for more information.
   */
  def ExperimentTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fis.ExperimentTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fis.ExperimentTemplateArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.fis.ExperimentTemplate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object FisFunctions:
    /** This resource can be useful for getting back a set of FIS experiment template IDs. */
    inline def getExperimentTemplates(args: Endofunction[com.pulumi.aws.fis.inputs.GetExperimentTemplatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.fis.outputs.GetExperimentTemplatesResult] =
      val argsBuilder = com.pulumi.aws.fis.inputs.GetExperimentTemplatesArgs.builder
      com.pulumi.aws.fis.FisFunctions.getExperimentTemplates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** This resource can be useful for getting back a set of FIS experiment template IDs. */
    inline def getExperimentTemplatesPlain(args: Endofunction[com.pulumi.aws.fis.inputs.GetExperimentTemplatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.fis.outputs.GetExperimentTemplatesResult] =
      val argsBuilder = com.pulumi.aws.fis.inputs.GetExperimentTemplatesPlainArgs.builder
      com.pulumi.aws.fis.FisFunctions.getExperimentTemplatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages the state of the AWS FIS (Fault Injection Simulator) safety lever for the account and Region. The safety lever is a single, account/Region-wide emergency stop: engaging it immediately stops all running experiments and blocks new ones from starting.
   * 
   * There is exactly one safety lever per account and Region, and it always exists \u2014 AWS does not provide APIs to create or delete it. Because of this, deleting this resource only removes it from Terraform state; it does not change the live value in AWS, so it never risks silently disengaging a safety control.
   * 
   * &gt; **Note:** AWS rejects a `reason` change unless `status` is also actually transitioning (for example, `engaged` to `disengaged`). Creating or updating this resource with a `status` that already matches the live safety lever succeeds only if the configured `reason` also matches the live `reason`; otherwise it fails at apply time. Pair a `reason` change with an actual `status` change.
   */
  def SafetyLeverState(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fis.SafetyLeverStateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.fis.SafetyLeverStateArgs.builder
    com.pulumi.aws.fis.SafetyLeverState(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS FIS (Fault Injection Simulator) Target Account Configuration. */
  def TargetAccountConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fis.TargetAccountConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.fis.TargetAccountConfigurationArgs.builder
    com.pulumi.aws.fis.TargetAccountConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
