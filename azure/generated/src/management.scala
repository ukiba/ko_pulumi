package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object management:
  /**
   * Manages a Management Group.
   * 
   *  !&gt; **Note:** Configuring `subscriptionIds` is not supported when using the `azure.management.GroupSubscriptionAssociation` resource, results will be unpredictable.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Resource Management Private Link to restrict access for managing resources in the tenant. */
  def PrivateLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.PrivateLinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.PrivateLinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.PrivateLink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Template Deployment at a Management Group Scope.
   * 
   *  &gt; **Note:** Deleting a Deployment at the Management Group Scope will not delete any resources created by the deployment.
   * 
   *  &gt; **Note:** Deployments to a Management Group are always Incrementally applied. Existing resources that are not part of the template will not be removed.
   */
  def GroupTemplateDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupTemplateDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupTemplateDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.management.GroupTemplateDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Policy Assignment to a Management Group. */
  def GroupPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicyAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Policy Set Definition for a Management Group. */
  def GroupPolicySetDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicySetDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicySetDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ManagementFunctions = com.pulumi.azure.management.ManagementFunctions
  object ManagementFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.management.ManagementFunctions.*
  extension (self: ManagementFunctions.type)
    /** Use this data source to access information about an existing Management Group. */
    def getGroup(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.management.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group. */
    def getGroupPlain(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.management.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupPlainArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group Template Deployment. */
    def getGroupTemplateDeployment(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.management.outputs.GetGroupTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroupTemplateDeployment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Management Group Template Deployment. */
    def getGroupTemplateDeploymentPlain(args: Endofunction[com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.management.outputs.GetGroupTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.management.inputs.GetGroupTemplateDeploymentPlainArgs.builder
      com.pulumi.azure.management.ManagementFunctions.getGroupTemplateDeploymentPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)

  /** Manages a Management Lock which is scoped to a Subscription, Resource Group or Resource. */
  def Lock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.LockArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.LockArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.Lock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Management Group Policy Exemption. */
  def GroupPolicyExemption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicyExemptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicyExemptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicyExemption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.management.GroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  /** Manages an Azure Management Group Policy Remediation. */
  def GroupPolicyRemediation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupPolicyRemediationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.GroupPolicyRemediationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.GroupPolicyRemediation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Resource Management Private Link Association. */
  def PrivateLinkAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.PrivateLinkAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.management.PrivateLinkAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.management.PrivateLinkAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Management Group Subscription Association.
   * 
   *  !&gt; **Note:** When using this resource, configuring `subscriptionIds` on the `azure.management.Group` resource is not supported.
   */
  def GroupSubscriptionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.management.GroupSubscriptionAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.management.GroupSubscriptionAssociationArgs.builder
    com.pulumi.azure.management.GroupSubscriptionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicySetDefinitionState.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.management.inputs.GroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.management.inputs.GroupPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)
