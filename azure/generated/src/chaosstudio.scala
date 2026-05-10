package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object chaosstudio:
  extension (builder: com.pulumi.azure.chaosstudio.ExperimentArgs.Builder)
    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentIdentityArgs.Builder]):
        com.pulumi.azure.chaosstudio.ExperimentArgs.Builder =
      val argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param selectors One or more `selectors` blocks as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentSelectorArgs.Builder]*):
        com.pulumi.azure.chaosstudio.ExperimentArgs.Builder =
      def argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

    /**
     * @param steps One or more `steps` blocks as defined below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentStepArgs.Builder]*):
        com.pulumi.azure.chaosstudio.ExperimentArgs.Builder =
      def argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  /** Manages a Chaos Studio Experiment. */
  def Experiment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.chaosstudio.ExperimentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.chaosstudio.ExperimentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.chaosstudio.Experiment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Chaos Studio Capability. */
  def Capability(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.chaosstudio.CapabilityArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.chaosstudio.CapabilityArgs.builder
    com.pulumi.azure.chaosstudio.Capability(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   *  Manages a Chaos Studio Target.
   */
  def Target(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.chaosstudio.TargetArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.chaosstudio.TargetArgs.builder
    com.pulumi.azure.chaosstudio.Target(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.chaosstudio.inputs.ExperimentState.Builder)
    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentIdentityArgs.Builder]):
        com.pulumi.azure.chaosstudio.inputs.ExperimentState.Builder =
      val argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param selectors One or more `selectors` blocks as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentSelectorArgs.Builder]*):
        com.pulumi.azure.chaosstudio.inputs.ExperimentState.Builder =
      def argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

    /**
     * @param steps One or more `steps` blocks as defined below.
     * @return builder
     */
    def steps(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentStepArgs.Builder]*):
        com.pulumi.azure.chaosstudio.inputs.ExperimentState.Builder =
      def argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentStepArgs.builder
      builder.steps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.chaosstudio.inputs.ExperimentStepArgs.Builder)
    /**
     * @param branches One or more `branch` blocks as defined above.
     * @return builder
     */
    def branches(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentStepBranchArgs.Builder]*):
        com.pulumi.azure.chaosstudio.inputs.ExperimentStepArgs.Builder =
      def argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentStepBranchArgs.builder
      builder.branches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.chaosstudio.inputs.ExperimentStepBranchArgs.Builder)
    /**
     * @param actions One or more `actions` blocks as defined above.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.chaosstudio.inputs.ExperimentStepBranchActionArgs.Builder]*):
        com.pulumi.azure.chaosstudio.inputs.ExperimentStepBranchArgs.Builder =
      def argsBuilder = com.pulumi.azure.chaosstudio.inputs.ExperimentStepBranchActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)
