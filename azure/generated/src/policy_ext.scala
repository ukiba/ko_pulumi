package jp.ukiba.ko_pulumi
package azure

object policy_ext:
  extension (builder: com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.Builder)
    /**
     * @param configuration A `configuration` block as defined below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder]):
        com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.policy.inputs.PolicySetDefinitionState.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.policy.inputs.PolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.policy.inputs.PolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder)
    /**
     * @param parameters One or more `parameter` blocks as defined below which define what configuration parameters and values against.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationParameterArgs.Builder]*):
        com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentState.Builder)
    /**
     * @param configuration A `configuration` block as defined below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder]):
        com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)
