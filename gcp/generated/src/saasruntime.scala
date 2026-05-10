package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object saasruntime:
  /**
   * A RolloutKind is a reusable configuration resource that defines the policies, strategies, and targeting for Rollout operations. It acts as a template for repeatable Rollouts, providing guardrails and ensuring that updates are executed in a consistent manner across a fleet of Units.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def RolloutKind(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.RolloutKindArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.RolloutKindArgs.builder
    com.pulumi.gcp.saasruntime.RolloutKind(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.saasruntime.UnitOperationArgs.Builder)
    /**
     * @param deprovision Deprovision is the unit operation that deprovision the underlying
     *  resources represented by a Unit. Can only execute if the Unit is currently
     *  provisioned.
     * @return builder
     */
    def deprovision(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationDeprovisionArgs.Builder]):
        com.pulumi.gcp.saasruntime.UnitOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationDeprovisionArgs.builder
      builder.deprovision(args(argsBuilder).build)

    /**
     * @param provision Provision is the unit operation that provision the underlying resources
     *  represented by a Unit. Can only execute if the Unit is not currently
     *  provisioned.
     *  Structure is documented below.
     * @return builder
     */
    def provision(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionArgs.Builder]):
        com.pulumi.gcp.saasruntime.UnitOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionArgs.builder
      builder.provision(args(argsBuilder).build)

    /**
     * @param upgrade Upgrade is the unit operation that upgrades a provisioned unit, which may
     *  also include the underlying resources represented by a Unit. Can only execute
     *  if the Unit is currently provisioned.
     *  Structure is documented below.
     * @return builder
     */
    def upgrade(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeArgs.Builder]):
        com.pulumi.gcp.saasruntime.UnitOperationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeArgs.builder
      builder.upgrade(args(argsBuilder).build)

  /** A Unit is the fundamental structural building block of a SaaS offering. Each Unit is an instance of a UnitKind. It is a versioned, manageable component of a service that has its own lifecycle, representing elements like infrastructure, workloads, or an entire application stack that a service producer intends to manage as a single entity. */
  def Unit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.UnitArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.UnitArgs.builder
    com.pulumi.gcp.saasruntime.Unit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A UnitKind serves as a template or type definition for a group of Units. Units that belong to the same UnitKind are managed together, follow the same release model, and are typically updated together through rollouts.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def UnitKind(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.UnitKindArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.UnitKindArgs.builder
    com.pulumi.gcp.saasruntime.UnitKind(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.saasruntime.SaaSArgs.Builder)
    /**
     * @param locations List of locations that the service is available in. Rollout refers to the
     *  list to generate a rollout plan.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.SaaSLocationArgs.Builder]*):
        com.pulumi.gcp.saasruntime.SaaSArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.SaaSLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

  /**
   * A version to be propagated and deployed to Units. It points to a specific version of a Blueprint that can be applied to Units, for example, via a Rollout.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def Release(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.ReleaseArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.ReleaseArgs.builder
    com.pulumi.gcp.saasruntime.Release(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Saas resource is the top-level representation of a SaaS service managed by a producer. It contains a list of locations where the service is available, which is used by the Rollout system to generate a rollout plan.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def SaaS(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.SaaSArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.SaaSArgs.builder
    com.pulumi.gcp.saasruntime.SaaS(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.saasruntime.RolloutKindArgs.Builder)
    /**
     * @param errorBudget The configuration for error budget. If the number of failed units exceeds
     *  max(allowed_count, allowedRatio * total_units), the rollout will be paused.
     *  Structure is documented below.
     * @return builder
     */
    def errorBudget(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.RolloutKindErrorBudgetArgs.Builder]):
        com.pulumi.gcp.saasruntime.RolloutKindArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.RolloutKindErrorBudgetArgs.builder
      builder.errorBudget(args(argsBuilder).build)

  /**
   * The Tenant resource represents the service producer&#39;s view of a service instance created for a consumer. It enables the association between the service producer&#39;s managed resources and the end consumer.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def Tenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.TenantArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.TenantArgs.builder
    com.pulumi.gcp.saasruntime.Tenant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.saasruntime.ReleaseArgs.Builder)
    /**
     * @param blueprint Blueprints are OCI Images that contain all of the artifacts needed to
     *  provision a unit. Metadata such as, type of the engine used to actuate the
     *  blueprint (e.g. terraform, helm etc) and version will come from the image
     *  manifest. If the hostname is omitted, it will be assumed to be the regional
     *  path to Artifact Registry (eg. us-east1-docker.pkg.dev).
     *  Structure is documented below.
     * @return builder
     */
    def blueprint(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseBlueprintArgs.Builder]):
        com.pulumi.gcp.saasruntime.ReleaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseBlueprintArgs.builder
      builder.blueprint(args(argsBuilder).build)

    /**
     * @param inputVariableDefaults Mapping of input variables to default values. Maximum 100
     *  Structure is documented below.
     * @return builder
     */
    def inputVariableDefaults(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseInputVariableDefaultArgs.Builder]*):
        com.pulumi.gcp.saasruntime.ReleaseArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseInputVariableDefaultArgs.builder
      builder.inputVariableDefaults(args.map(_(argsBuilder).build)*)

    /**
     * @param releaseRequirements Set of requirements to be fulfilled on the Unit when using this Release.
     *  Structure is documented below.
     * @return builder
     */
    def releaseRequirements(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseReleaseRequirementsArgs.Builder]):
        com.pulumi.gcp.saasruntime.ReleaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseReleaseRequirementsArgs.builder
      builder.releaseRequirements(args(argsBuilder).build)

  /** A UnitOperation encapsulates the intent to change or interact with a Unit. Operations such as provisioning, upgrading, or deprovisioning a Unit are triggered by creating a UnitOperation resource. */
  def UnitOperation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.saasruntime.UnitOperationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.saasruntime.UnitOperationArgs.builder
    com.pulumi.gcp.saasruntime.UnitOperation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.saasruntime.UnitArgs.Builder)
    /**
     * @param maintenance Captures requested directives for performing future maintenance on the
     *  unit. This includes a request for the unit to skip maintenance for a period
     *  of time and remain pinned to its current release as well as controls for
     *  postponing maintenance scheduled in future.
     *  Structure is documented below.
     * @return builder
     */
    def maintenance(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitMaintenanceArgs.Builder]):
        com.pulumi.gcp.saasruntime.UnitArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitMaintenanceArgs.builder
      builder.maintenance(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.saasruntime.UnitKindArgs.Builder)
    /**
     * @param dependencies List of other unit kinds that this release will depend on. Dependencies
     *  will be automatically provisioned if not found. Maximum 10.
     *  Structure is documented below.
     * @return builder
     */
    def dependencies(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindDependencyArgs.Builder]*):
        com.pulumi.gcp.saasruntime.UnitKindArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindDependencyArgs.builder
      builder.dependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param inputVariableMappings List of inputVariables for this release that will either be retrieved from
     *  a dependency\u2019s outputVariables, or will be passed on to a dependency\u2019s
     *  inputVariables. Maximum 100.
     *  Structure is documented below.
     * @return builder
     */
    def inputVariableMappings(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.Builder]*):
        com.pulumi.gcp.saasruntime.UnitKindArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.builder
      builder.inputVariableMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param outputVariableMappings List of outputVariables for this unit kind will be passed to this unit&#39;s
     *  outputVariables. Maximum 100.
     *  Structure is documented below.
     * @return builder
     */
    def outputVariableMappings(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.Builder]*):
        com.pulumi.gcp.saasruntime.UnitKindArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.builder
      builder.outputVariableMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeArgs.Builder)
    /**
     * @param inputVariables Set of input variables. Maximum 100. (optional)
     *  Structure is documented below.
     * @return builder
     */
    def inputVariables(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeInputVariableArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitKindState.Builder)
    /**
     * @param dependencies List of other unit kinds that this release will depend on. Dependencies
     *  will be automatically provisioned if not found. Maximum 10.
     *  Structure is documented below.
     * @return builder
     */
    def dependencies(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindDependencyArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitKindState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindDependencyArgs.builder
      builder.dependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param inputVariableMappings List of inputVariables for this release that will either be retrieved from
     *  a dependency\u2019s outputVariables, or will be passed on to a dependency\u2019s
     *  inputVariables. Maximum 100.
     *  Structure is documented below.
     * @return builder
     */
    def inputVariableMappings(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitKindState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.builder
      builder.inputVariableMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param outputVariableMappings List of outputVariables for this unit kind will be passed to this unit&#39;s
     *  outputVariables. Maximum 100.
     *  Structure is documented below.
     * @return builder
     */
    def outputVariableMappings(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitKindState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.builder
      builder.outputVariableMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.Builder)
    /**
     * @param from Output variables whose values will be passed on to dependencies
     *  Structure is documented below.
     * @return builder
     */
    def from(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingFromArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingFromArgs.builder
      builder.from(args(argsBuilder).build)

    /**
     * @param to Input variables whose values will be passed on to dependencies
     *  Structure is documented below.
     * @return builder
     */
    def to(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingToArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindOutputVariableMappingToArgs.builder
      builder.to(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.ReleaseState.Builder)
    /**
     * @param blueprint Blueprints are OCI Images that contain all of the artifacts needed to
     *  provision a unit. Metadata such as, type of the engine used to actuate the
     *  blueprint (e.g. terraform, helm etc) and version will come from the image
     *  manifest. If the hostname is omitted, it will be assumed to be the regional
     *  path to Artifact Registry (eg. us-east1-docker.pkg.dev).
     *  Structure is documented below.
     * @return builder
     */
    def blueprint(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseBlueprintArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.ReleaseState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseBlueprintArgs.builder
      builder.blueprint(args(argsBuilder).build)

    /**
     * @param inputVariableDefaults Mapping of input variables to default values. Maximum 100
     *  Structure is documented below.
     * @return builder
     */
    def inputVariableDefaults(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseInputVariableDefaultArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.ReleaseState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseInputVariableDefaultArgs.builder
      builder.inputVariableDefaults(args.map(_(argsBuilder).build)*)

    /**
     * @param inputVariables List of input variables declared on the blueprint and can be present with
     *  their values on the unit spec
     *  Structure is documented below.
     * @return builder
     */
    def inputVariables(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseInputVariableArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.ReleaseState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param outputVariables List of output variables declared on the blueprint and can be present with
     *  their values on the unit status
     *  Structure is documented below.
     * @return builder
     */
    def outputVariables(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseOutputVariableArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.ReleaseState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseOutputVariableArgs.builder
      builder.outputVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param releaseRequirements Set of requirements to be fulfilled on the Unit when using this Release.
     *  Structure is documented below.
     * @return builder
     */
    def releaseRequirements(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.ReleaseReleaseRequirementsArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.ReleaseState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.ReleaseReleaseRequirementsArgs.builder
      builder.releaseRequirements(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitOperationState.Builder)
    /**
     * @param conditions A set of conditions which indicate the various conditions this resource can
     *  have.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationConditionArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitOperationState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param deprovision Deprovision is the unit operation that deprovision the underlying
     *  resources represented by a Unit. Can only execute if the Unit is currently
     *  provisioned.
     * @return builder
     */
    def deprovision(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationDeprovisionArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitOperationState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationDeprovisionArgs.builder
      builder.deprovision(args(argsBuilder).build)

    /**
     * @param provision Provision is the unit operation that provision the underlying resources
     *  represented by a Unit. Can only execute if the Unit is not currently
     *  provisioned.
     *  Structure is documented below.
     * @return builder
     */
    def provision(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitOperationState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionArgs.builder
      builder.provision(args(argsBuilder).build)

    /**
     * @param upgrade Upgrade is the unit operation that upgrades a provisioned unit, which may
     *  also include the underlying resources represented by a Unit. Can only execute
     *  if the Unit is currently provisioned.
     *  Structure is documented below.
     * @return builder
     */
    def upgrade(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitOperationState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationUpgradeArgs.builder
      builder.upgrade(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.RolloutKindState.Builder)
    /**
     * @param errorBudget The configuration for error budget. If the number of failed units exceeds
     *  max(allowed_count, allowedRatio * total_units), the rollout will be paused.
     *  Structure is documented below.
     * @return builder
     */
    def errorBudget(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.RolloutKindErrorBudgetArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.RolloutKindState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.RolloutKindErrorBudgetArgs.builder
      builder.errorBudget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitState.Builder)
    /**
     * @param conditions A set of conditions which indicate the various conditions this resource can
     *  have.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitConditionArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param dependencies Set of dependencies for this unit. Maximum 10.
     *  Structure is documented below.
     * @return builder
     */
    def dependencies(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitDependencyArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitDependencyArgs.builder
      builder.dependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param dependents List of Units that depend on this unit. Unit can only be deprovisioned if
     *  this list is empty. Maximum 1000.
     *  Structure is documented below.
     * @return builder
     */
    def dependents(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitDependentArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitDependentArgs.builder
      builder.dependents(args.map(_(argsBuilder).build)*)

    /**
     * @param inputVariables Indicates the current input variables deployed by the unit
     *  Structure is documented below.
     * @return builder
     */
    def inputVariables(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitInputVariableArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenance Captures requested directives for performing future maintenance on the
     *  unit. This includes a request for the unit to skip maintenance for a period
     *  of time and remain pinned to its current release as well as controls for
     *  postponing maintenance scheduled in future.
     *  Structure is documented below.
     * @return builder
     */
    def maintenance(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitMaintenanceArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitState.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitMaintenanceArgs.builder
      builder.maintenance(args(argsBuilder).build)

    /**
     * @param outputVariables Set of key/value pairs corresponding to output variables from execution of
     *  actuation templates. The variables are declared in actuation configs (e.g
     *  in helm chart or terraform) and the values are fetched and returned by the
     *  actuation engine upon completion of execution.
     *  Structure is documented below.
     * @return builder
     */
    def outputVariables(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOutputVariableArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOutputVariableArgs.builder
      builder.outputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionArgs.Builder)
    /**
     * @param inputVariables Set of input variables. Maximum 100. (optional)
     *  Structure is documented below.
     * @return builder
     */
    def inputVariables(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionInputVariableArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitOperationProvisionInputVariableArgs.builder
      builder.inputVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.Builder)
    /**
     * @param from Output variables whose values will be passed on to dependencies
     *  Structure is documented below.
     * @return builder
     */
    def from(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingFromArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingFromArgs.builder
      builder.from(args(argsBuilder).build)

    /**
     * @param to Input variables whose values will be passed on to dependencies
     *  Structure is documented below.
     * @return builder
     */
    def to(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingToArgs.Builder]):
        com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.saasruntime.inputs.UnitKindInputVariableMappingToArgs.builder
      builder.to(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.saasruntime.inputs.SaaSState.Builder)
    /**
     * @param locations List of locations that the service is available in. Rollout refers to the
     *  list to generate a rollout plan.
     *  Structure is documented below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.gcp.saasruntime.inputs.SaaSLocationArgs.Builder]*):
        com.pulumi.gcp.saasruntime.inputs.SaaSState.Builder =
      def argsBuilder = com.pulumi.gcp.saasruntime.inputs.SaaSLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)
