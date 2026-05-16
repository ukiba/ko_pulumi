package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object policy:
  /**
   * Manages a policy rule definition on a management group or your provider subscription.
   * 
   *  Policy definitions do not take effect until they are assigned to a scope using a Policy Assignment.
   */
  def Definition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.policy.DefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.policy.DefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.policy.Definition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.Builder)
    /**
     * @param configuration A `configuration` block as defined below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder]):
        com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /**
   * Applies a Guest Configuration Policy to a Virtual Machine.
   * 
   *  &gt; **Note:** You can create Guest Configuration Policies without defining a `azure.compute.Extension` resource, however the policies will not be executed until a `azure.compute.Extension` has been provisioned to the virtual machine.
   */
  def VirtualMachineConfigurationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.policy.VirtualMachineConfigurationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object PolicyFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Policy Assignment. */
    inline def getPolicyAssignment(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyAssignmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyAssignmentArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyAssignment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Policy Assignment. */
    inline def getPolicyAssignmentPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyAssignmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicyAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyAssignmentPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyAssignmentPlain(args(argsBuilder).build)

    /** Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintion(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicyDefintionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintion(args(argsBuilder).build)

    /** Use this data source to access information about a Policy Definition, both custom and built in. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintionPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicyDefintionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintionPlain(args(argsBuilder).build)

    /** Use this data source to access information about a Built-In Policy Definition. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintionBuiltIn(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicyDefintionBuiltInResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintionBuiltIn(args(argsBuilder).build)

    /** Use this data source to access information about a Built-In Policy Definition. Retrieves Policy Definitions from your current subscription by default. */
    inline def getPolicyDefintionBuiltInPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicyDefintionBuiltInResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicyDefintionBuiltInPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicyDefintionBuiltInPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Policy Set Definition. */
    inline def getPolicySetDefinition(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicySetDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetPolicySetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicySetDefinitionArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicySetDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Policy Set Definition. */
    inline def getPolicySetDefinitionPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetPolicySetDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetPolicySetDefinitionResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetPolicySetDefinitionPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getPolicySetDefinitionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Guest Configuration Policy. */
    inline def getVirtualMachineConfigurationAssignment(args: Endofunction[com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.policy.outputs.GetVirtualMachineConfigurationAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getVirtualMachineConfigurationAssignment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Guest Configuration Policy. */
    inline def getVirtualMachineConfigurationAssignmentPlain(args: Endofunction[com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.policy.outputs.GetVirtualMachineConfigurationAssignmentResult] =
      val argsBuilder = com.pulumi.azure.policy.inputs.GetVirtualMachineConfigurationAssignmentPlainArgs.builder
      com.pulumi.azure.policy.PolicyFunctions.getVirtualMachineConfigurationAssignmentPlain(args(argsBuilder).build)

  /**
   * Manages a Policy Set Definition.
   * 
   *  &gt; **Note:** Policy set definitions (also known as policy initiatives) do not take effect until they are assigned to a scope using a Policy Set Assignment.
   */
  def PolicySetDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.policy.PolicySetDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.policy.PolicySetDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.policy.PolicySetDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentState.Builder)
    /**
     * @param configuration A `configuration` block as defined below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder]):
        com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder)
    /**
     * @param parameters One or more `parameter` blocks as defined below which define what configuration parameters and values against.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationParameterArgs.Builder]*):
        com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.policy.inputs.PolicySetDefinitionState.Builder)
    /**
     * @param policyDefinitionGroups One or more `policyDefinitionGroup` blocks as defined below.
     * @return builder
     */
    def policyDefinitionGroups(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.Builder]*):
        com.pulumi.azure.policy.inputs.PolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionGroupArgs.builder
      builder.policyDefinitionGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param policyDefinitionReferences One or more `policyDefinitionReference` blocks as defined below.
     * @return builder
     */
    def policyDefinitionReferences(args: Endofunction[com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.Builder]*):
        com.pulumi.azure.policy.inputs.PolicySetDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.policy.inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs.builder
      builder.policyDefinitionReferences(args.map(_(argsBuilder).build)*)
