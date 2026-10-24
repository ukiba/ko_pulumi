package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object chaosstudio:
  /** Manages a Chaos Studio Capability. */
  def Capability(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.chaosstudio.CapabilityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.chaosstudio.CapabilityArgs.builder
    com.pulumi.azure.chaosstudio.Capability(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Chaos Studio Experiment. */
  def Experiment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.chaosstudio.ExperimentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.chaosstudio.ExperimentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.chaosstudio.Experiment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   * Manages a Chaos Studio Target.
   */
  def Target(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.chaosstudio.TargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.chaosstudio.TargetArgs.builder
    com.pulumi.azure.chaosstudio.Target(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
