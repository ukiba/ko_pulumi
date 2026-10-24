package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object pim:
  /** Manages a PIM Active Role Assignment. */
  inline def ActiveRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.pim.ActiveRoleAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.pim.ActiveRoleAssignmentArgs.builder
    com.pulumi.azure.pim.ActiveRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a PIM Eligible Role Assignment. */
  inline def EligibleRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.pim.EligibleRoleAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.pim.EligibleRoleAssignmentArgs.builder
    com.pulumi.azure.pim.EligibleRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object PimFunctions:
    /** Use this data source to access information about existing Role Assignments. */
    inline def getRoleAssignments(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleAssignmentsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.pim.outputs.GetRoleAssignmentsResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleAssignmentsArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleAssignments(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Role Assignments. */
    inline def getRoleAssignmentsPlain(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleAssignmentsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.pim.outputs.GetRoleAssignmentsResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleAssignmentsPlainArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleAssignmentsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource. */
    inline def getRoleManagementPolicy(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleManagementPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.pim.outputs.GetRoleManagementPolicyResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleManagementPolicyArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleManagementPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource. */
    inline def getRoleManagementPolicyPlain(args: Endofunction[com.pulumi.azure.pim.inputs.GetRoleManagementPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.pim.outputs.GetRoleManagementPolicyResult] =
      val argsBuilder = com.pulumi.azure.pim.inputs.GetRoleManagementPolicyPlainArgs.builder
      com.pulumi.azure.pim.PimFunctions.getRoleManagementPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manage a role policy for an Azure Management Group, Subscription, Resource Group or resource. */
  inline def RoleManagementPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.pim.RoleManagementPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.pim.RoleManagementPolicyArgs.builder
    com.pulumi.azure.pim.RoleManagementPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
