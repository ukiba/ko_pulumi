package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object pim:
  /** Manages a PIM Active Role Assignment. */
  def ActiveRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.pim.ActiveRoleAssignmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.pim.ActiveRoleAssignmentArgs.builder
    com.pulumi.azure.pim.ActiveRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a PIM Eligible Role Assignment. */
  def EligibleRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.pim.EligibleRoleAssignmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.pim.EligibleRoleAssignmentArgs.builder
    com.pulumi.azure.pim.EligibleRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object PimFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about existing Role Assignments. */
    inline def getRoleAssignments(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleAssignmentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.pim.outputs.GetRoleAssignmentsResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleAssignmentsArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleAssignments(args(argsBuilder).build)

    /** Use this data source to access information about existing Role Assignments. */
    inline def getRoleAssignmentsPlain(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleAssignmentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.pim.outputs.GetRoleAssignmentsResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleAssignmentsPlainArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleAssignmentsPlain(args(argsBuilder).build)

    /** Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource. */
    inline def getRoleManagementPolicy(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleManagementPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.pim.outputs.GetRoleManagementPolicyResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleManagementPolicyArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleManagementPolicy(args(argsBuilder).build)

    /** Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource. */
    inline def getRoleManagementPolicyPlain(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleManagementPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.pim.outputs.GetRoleManagementPolicyResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleManagementPolicyPlainArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleManagementPolicyPlain(args(argsBuilder).build)

  /** Manage a role policy for an Azure Management Group, Subscription, Resource Group or resource. */
  def RoleManagementPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.pim.RoleManagementPolicyArgs.builder
    com.pulumi.azure.pim.RoleManagementPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
