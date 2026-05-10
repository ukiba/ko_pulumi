package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object lighthouse:
  /** Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Definition. */
  def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lighthouse.DefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lighthouse.DefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lighthouse.Definition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.lighthouse.DefinitionArgs.Builder)
    /**
     * @param authorizations An `authorization` block as defined below.
     * @return builder
     */
    def authorizations(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionAuthorizationArgs.Builder]*):
        com.pulumi.azure.lighthouse.DefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionAuthorizationArgs.builder
      builder.authorizations(args.map(_(argsBuilder).build)*)

    /**
     * @param eligibleAuthorizations An `eligibleAuthorization` block as defined below.
     * @return builder
     */
    def eligibleAuthorizations(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationArgs.Builder]*):
        com.pulumi.azure.lighthouse.DefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationArgs.builder
      builder.eligibleAuthorizations(args.map(_(argsBuilder).build)*)

    /**
     * @param plan A `plan` block as defined below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionPlanArgs.Builder]):
        com.pulumi.azure.lighthouse.DefinitionArgs.Builder =
      val argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  /** Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Assignment to a subscription, or to a resource group. */
  def Assignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.lighthouse.AssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.lighthouse.AssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.lighthouse.Assignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyArgs.Builder)
    /**
     * @param approvers An `approver` block as defined below.
     * @return builder
     */
    def approvers(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyApproverArgs.Builder]*):
        com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyApproverArgs.builder
      builder.approvers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.lighthouse.inputs.DefinitionState.Builder)
    /**
     * @param authorizations An `authorization` block as defined below.
     * @return builder
     */
    def authorizations(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionAuthorizationArgs.Builder]*):
        com.pulumi.azure.lighthouse.inputs.DefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionAuthorizationArgs.builder
      builder.authorizations(args.map(_(argsBuilder).build)*)

    /**
     * @param eligibleAuthorizations An `eligibleAuthorization` block as defined below.
     * @return builder
     */
    def eligibleAuthorizations(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationArgs.Builder]*):
        com.pulumi.azure.lighthouse.inputs.DefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationArgs.builder
      builder.eligibleAuthorizations(args.map(_(argsBuilder).build)*)

    /**
     * @param plan A `plan` block as defined below.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionPlanArgs.Builder]):
        com.pulumi.azure.lighthouse.inputs.DefinitionState.Builder =
      val argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationArgs.Builder)
    /**
     * @param justInTimeAccessPolicy A `justInTimeAccessPolicy` block as defined below.
     * @return builder
     */
    def justInTimeAccessPolicy(args: Endofunction[com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyArgs.Builder]):
        com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationArgs.Builder =
      val argsBuilder = com.pulumi.azure.lighthouse.inputs.DefinitionEligibleAuthorizationJustInTimeAccessPolicyArgs.builder
      builder.justInTimeAccessPolicy(args(argsBuilder).build)
