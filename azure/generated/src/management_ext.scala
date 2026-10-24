package jp.ukiba.ko_pulumi
package azure

object management_ext:
  extension (builder: com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    inline def nonComplianceMessages(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    inline def resourceSelectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    inline def selectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    inline def selectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    inline def nonComplianceMessages(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    inline def overrides(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    inline def resourceSelectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicySetDefinitionState.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    inline def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)
