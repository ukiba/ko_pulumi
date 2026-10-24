package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object policy:
  /**
   * Manages a policy rule definition on a management group or your provider subscription.
   * 
   * Policy definitions do not take effect until they are assigned to a scope using a Policy Assignment.
   */
  def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.policy.DefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.policy.DefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.policy.Definition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object PolicyFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Policy Assignment. */
    inline def getPolicyAssignment(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyAssignmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyAssignmentArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyAssignment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Policy Assignment. */
    inline def getPolicyAssignmentPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyAssignmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyAssignmentPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyAssignmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintion(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicyDefintionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintionPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicyDefintionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about a Built-In Policy Definition. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintionBuiltIn(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicyDefintionBuiltInResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintionBuiltIn(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about a Built-In Policy Definition. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintionBuiltInPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicyDefintionBuiltInResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintionBuiltInPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Policy Set Definition. */
    inline def getPolicySetDefinition(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicySetDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicySetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicySetDefinitionArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicySetDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Policy Set Definition. */
    inline def getPolicySetDefinitionPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicySetDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicySetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicySetDefinitionPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicySetDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Guest Configuration Policy. */
    inline def getVirtualMachineConfigurationAssignment(args: Endofunction[com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetVirtualMachineConfigurationAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getVirtualMachineConfigurationAssignment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Guest Configuration Policy. */
    inline def getVirtualMachineConfigurationAssignmentPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetVirtualMachineConfigurationAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getVirtualMachineConfigurationAssignmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages a Policy Set Definition.
   * 
   * &gt; **Note:** Policy set definitions (also known as policy initiatives) do not take effect until they are assigned to a scope using a Policy Set Assignment.
   */
  def PolicySetDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.policy.PolicySetDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.policy.PolicySetDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Applies a Guest Configuration Policy to a Virtual Machine.
   * 
   * &gt; **Note:** You can create Guest Configuration Policies without defining a `azure.compute.Extension` resource, however the policies will not be executed until a `azure.compute.Extension` has been provisioned to the virtual machine.
   */
  def VirtualMachineConfigurationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.policy.VirtualMachineConfigurationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
