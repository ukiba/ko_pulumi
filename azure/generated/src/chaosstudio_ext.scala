package jp.ukiba.ko_pulumi
package azure

object chaosstudio_ext:
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
