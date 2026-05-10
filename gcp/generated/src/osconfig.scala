package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object osconfig:
  /**
   * OS policy assignment is an API resource that is used to apply a set of OS
   *  policies to a dynamically targeted group of Compute Engine VM instances. An OS
   *  policy is used to define the desired state configuration for a Compute Engine VM
   *  instance through a set of configuration resources that provide capabilities such
   *  as installing or removing software packages, or executing a script. For more
   *  information about the OS policy resource definitions and examples, see
   *  [OS policy and OS policy assignment](https://cloud.google.com/compute/docs/os-configuration-management/working-with-os-policies).
   * 
   *  To get more information about OSPolicyAssignment, see:
   * 
   *  *   [API documentation](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments)
   *  *   How-to Guides
   *      *   [Official Documentation](https://cloud.google.com/compute/docs/os-configuration-management/create-os-policy-assignment)
   */
  def OsPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.osconfig.OsPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder)
    /**
     * @param instanceFilter VM instances to patch.
     *  Structure is documented below.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param oneTimeSchedule Schedule a one-time execution.
     *  Structure is documented below.
     * @return builder
     */
    def oneTimeSchedule(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs.Builder]):
        com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs.builder
      builder.oneTimeSchedule(args(argsBuilder).build)

    /**
     * @param patchConfig Patch configuration that is applied.
     *  Structure is documented below.
     * @return builder
     */
    def patchConfig(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder]):
        com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.builder
      builder.patchConfig(args(argsBuilder).build)

    /**
     * @param recurringSchedule Schedule recurring executions.
     *  Structure is documented below.
     * @return builder
     */
    def recurringSchedule(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder]):
        com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.builder
      builder.recurringSchedule(args(argsBuilder).build)

    /**
     * @param rollout Rollout strategy of the patch job.
     *  Structure is documented below.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder)
    /**
     * @param assignment Specifies the VM instances that are assigned to this policy. This allows you to target sets
     *  or groups of VM instances by different parameters such as labels, names, OS, or zones.
     *  If left empty, all VM instances underneath this policy are targeted.
     *  At the same level in the resource hierarchy (that is within a project), the service prevents
     *  the creation of multiple policies that conflict with each other.
     *  For more information, see how the service
     *  [handles assignment conflicts](https://cloud.google.com/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     *  Structure is documented below.
     * @return builder
     */
    def assignment(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.Builder]):
        com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.builder
      builder.assignment(args(argsBuilder).build)

    /**
     * @param packageRepositories A list of package repositories to configure on the VM instance.
     *  This is done before any other configs are applied so they can use these repos.
     *  Package repositories are only configured if the corresponding package manager(s) are available.
     *  Structure is documented below.
     * @return builder
     */
    def packageRepositories(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder]*):
        com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.builder
      builder.packageRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param packages The software packages to be managed by this policy.
     *  Structure is documented below.
     * @return builder
     */
    def packages(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageArgs.Builder]*):
        com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageArgs.builder
      builder.packages(args.map(_(argsBuilder).build)*)

    /**
     * @param recipes A list of Recipes to install on the VM instance.
     *  Structure is documented below.
     * @return builder
     */
    def recipes(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.Builder]*):
        com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.builder
      builder.recipes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.Builder)
    /**
     * @param instanceFilter Filter to select VMs. Structure is
     *  documented below.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param osPolicies List of OS policies to be applied to the VMs.
     *  Structure is documented below.
     * @return builder
     */
    def osPolicies(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs.Builder]*):
        com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs.builder
      builder.osPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param rollout Rollout to deploy the OS policy assignment. A rollout
     *  is triggered in the following situations: 1) OSPolicyAssignment is created.
     *  2) OSPolicyAssignment is updated and the update contains changes to one of
     *  the following fields: - instanceFilter - osPolicies 3) OSPolicyAssignment
     *  is deleted. Structure is documented below.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.Builder)
    /**
     * @param orchestratedResource Represents a resource that is being orchestrated by the policy orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def orchestratedResource(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs.Builder]):
        com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs.builder
      builder.orchestratedResource(args(argsBuilder).build)

    /**
     * @param orchestrationScope Defines a set of selectors which drive which resources are in scope of policy
     *  orchestration.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationScope(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs.Builder]):
        com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs.builder
      builder.orchestrationScope(args(argsBuilder).build)

  /**
   * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
   *  OS Policy Assignments), by providing tools to create, update and delete them
   *  across projects and locations, at scale.
   */
  def V2PolicyOrchestratorForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.builder
    com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An OS Config resource representing a guest configuration policy. These policies represent
   *  the desired state for VM instance guest environments including packages to install or remove,
   *  package repository configurations, and software to install.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about GuestPolicies, see:
   * 
   *  * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/compute/docs/os-config-management)
   */
  def GuestPolicies(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.osconfig.GuestPoliciesArgs.builder
    com.pulumi.gcp.osconfig.GuestPolicies(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Patch deployments are configurations that individual patch jobs use to complete a patch.
   *  These configurations include instance filter, package repository settings, and a schedule.
   * 
   *  To get more information about PatchDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/compute/docs/os-patch-management)
   */
  def PatchDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.osconfig.PatchDeploymentArgs.builder
    com.pulumi.gcp.osconfig.PatchDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
   *  OS Policy Assignments), by providing tools to create, update and delete them
   *  across projects and locations, at scale.
   */
  def V2PolicyOrchestratorForFolder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.builder
    com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
   *  OS Policy Assignments), by providing tools to create, update and delete them
   *  across projects and locations, at scale.
   */
  def V2PolicyOrchestrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.builder
    com.pulumi.gcp.osconfig.V2PolicyOrchestrator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.Builder)
    /**
     * @param orchestratedResource Represents a resource that is being orchestrated by the policy orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def orchestratedResource(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceArgs.Builder]):
        com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceArgs.builder
      builder.orchestratedResource(args(argsBuilder).build)

    /**
     * @param orchestrationScope Defines a set of selectors which drive which resources are in scope of policy
     *  orchestration.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationScope(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeArgs.Builder]):
        com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeArgs.builder
      builder.orchestrationScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceArgs.Builder)
    /**
     * @param osPolicyAssignmentV1Payload OS policy assignment is an API resource that is used to
     *  apply a set of OS policies to a dynamically targeted group of Compute Engine
     *  VM instances.
     *  An OS policy is used to define the desired state configuration for a
     *  Compute Engine VM instance through a set of configuration resources that
     *  provide capabilities such as installing or removing software packages, or
     *  executing a script.
     *  For more information about the OS policy resource definitions and examples,
     *  see
     *  [OS policy and OS policy
     *  assignment](https://cloud.google.com/compute/docs/os-configuration-management/working-with-os-policies).
     *  Structure is documented below.
     * @return builder
     */
    def osPolicyAssignmentV1Payload(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.builder
      builder.osPolicyAssignmentV1Payload(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder)
    /**
     * @param apt A package managed by Apt. Structure is
     *  documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param deb A deb package file. Structure is
     *  documented below.
     * @return builder
     */
    def deb(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs.builder
      builder.deb(args(argsBuilder).build)

    /**
     * @param googet A package managed by GooGet. Structure is
     *  documented below.
     * @return builder
     */
    def googet(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetArgs.builder
      builder.googet(args(argsBuilder).build)

    /**
     * @param msi An MSI package. Structure is
     *  documented below.
     * @return builder
     */
    def msi(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs.builder
      builder.msi(args(argsBuilder).build)

    /**
     * @param rpm An rpm package file. Structure is
     *  documented below.
     * @return builder
     */
    def rpm(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs.builder
      builder.rpm(args(argsBuilder).build)

    /**
     * @param yum A package managed by YUM. Structure is
     *  documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper A package managed by Zypper. Structure is
     *  documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs.Builder)
    /**
     * @param selectors Selectors of the orchestration scope. There is a logical AND between each
     *  selector defined.
     *  When there is no explicit `ResourceHierarchySelector` selector specified,
     *  the scope is by default bounded to the parent of the policy orchestrator
     *  resource.
     *  Structure is documented below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentState.Builder)
    /**
     * @param instanceFilter Filter to select VMs. Structure is
     *  documented below.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param osPolicies List of OS policies to be applied to the VMs.
     *  Structure is documented below.
     * @return builder
     */
    def osPolicies(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs.builder
      builder.osPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param rollout Rollout to deploy the OS policy assignment. A rollout
     *  is triggered in the following situations: 1) OSPolicyAssignment is created.
     *  2) OSPolicyAssignment is updated and the update contains changes to one of
     *  the following fields: - instanceFilter - osPolicies 3) OSPolicyAssignment
     *  is deleted. Structure is documented below.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorState.Builder)
    /**
     * @param orchestratedResource Represents a resource that is being orchestrated by the policy orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def orchestratedResource(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceArgs.builder
      builder.orchestratedResource(args(argsBuilder).build)

    /**
     * @param orchestrationScope Defines a set of selectors which drive which resources are in scope of policy
     *  orchestration.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationScope(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeArgs.builder
      builder.orchestrationScope(args(argsBuilder).build)

    /**
     * @param orchestrationStates Describes the state of the orchestration process.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateArgs.builder
      builder.orchestrationStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder)
    /**
     * @param enforce A file or script to execute.
     *  Structure is documented below.
     * @return builder
     */
    def enforce(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.builder
      builder.enforce(args(argsBuilder).build)

    /**
     * @param validate A file or script to execute.
     *  Structure is documented below.
     * @return builder
     */
    def validate(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.builder
      builder.validate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder)
    /**
     * @param resourceGroups List of resource groups for the policy.
     *  For a particular VM, resource groups are evaluated in the order specified
     *  and the first resource group that is applicable is selected and the rest
     *  are ignored.
     *  If none of the resource groups are applicable for a VM, the VM is
     *  considered to be non-compliant w.r.t this policy. This behavior can be
     *  toggled by the flag `allowNoResourceGroupMatch`
     *  Structure is documented below.
     * @return builder
     */
    def resourceGroups(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.builder
      builder.resourceGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.Builder)
    /**
     * @param artifacts Resources available to be used in the steps in the recipe.
     *  Structure is documented below.
     * @return builder
     */
    def artifacts(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactArgs.builder
      builder.artifacts(args.map(_(argsBuilder).build)*)

    /**
     * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
     *  Any steps taken (including partially completed steps) are not rolled back.
     *  Structure is documented below.
     * @return builder
     */
    def installSteps(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.builder
      builder.installSteps(args.map(_(argsBuilder).build)*)

    /**
     * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
     *  Any steps taken (including partially completed steps) are not rolled back.
     *  Structure is documented below.
     * @return builder
     */
    def updateSteps(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.builder
      builder.updateSteps(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder)
    /**
     * @param apt Represents a single apt package repository. These will be added to
     *  a repo file that will be managed at
     *  `/etc/apt/sources.list.d/google_osconfig.list`.
     *  Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param goo Represents a Goo package repository. These are added to a repo file
     *  that is managed at
     *  `C:/ProgramData/GooGet/repos/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def goo(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryGooArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryGooArgs.builder
      builder.goo(args(argsBuilder).build)

    /**
     * @param yum Represents a single yum package repository. These are added to a
     *  repo file that is managed at
     *  `/etc/yum.repos.d/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper Represents a single zypper package repository. These are added to a
     *  repo file that is managed at
     *  `/etc/zypp/repos.d/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigArgs.Builder)
    /**
     * @param gcsObject A Cloud Storage object containing the executable.
     *  Structure is documented below.
     * @return builder
     */
    def gcsObject(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs.builder
      builder.gcsObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesState.Builder)
    /**
     * @param assignment Specifies the VM instances that are assigned to this policy. This allows you to target sets
     *  or groups of VM instances by different parameters such as labels, names, OS, or zones.
     *  If left empty, all VM instances underneath this policy are targeted.
     *  At the same level in the resource hierarchy (that is within a project), the service prevents
     *  the creation of multiple policies that conflict with each other.
     *  For more information, see how the service
     *  [handles assignment conflicts](https://cloud.google.com/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     *  Structure is documented below.
     * @return builder
     */
    def assignment(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.builder
      builder.assignment(args(argsBuilder).build)

    /**
     * @param packageRepositories A list of package repositories to configure on the VM instance.
     *  This is done before any other configs are applied so they can use these repos.
     *  Package repositories are only configured if the corresponding package manager(s) are available.
     *  Structure is documented below.
     * @return builder
     */
    def packageRepositories(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.builder
      builder.packageRepositories(args.map(_(argsBuilder).build)*)

    /**
     * @param packages The software packages to be managed by this policy.
     *  Structure is documented below.
     * @return builder
     */
    def packages(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageArgs.builder
      builder.packages(args.map(_(argsBuilder).build)*)

    /**
     * @param recipes A list of Recipes to install on the VM instance.
     *  Structure is documented below.
     * @return builder
     */
    def recipes(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs.builder
      builder.recipes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs.Builder)
    /**
     * @param resourceGroups List of resource groups for the policy. For a
     *  particular VM, resource groups are evaluated in the order specified and the
     *  first resource group that is applicable is selected and the rest are
     *  ignored. If none of the resource groups are applicable for a VM, the VM is
     *  considered to be non-compliant w.r.t this policy. This behavior can be
     *  toggled by the flag `allowNoResourceGroupMatch` Structure is
     *  documented below.
     * @return builder
     */
    def resourceGroups(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupArgs.builder
      builder.resourceGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder)
    /**
     * @param apt Apt update settings. Use this setting to override the default apt patch rules.
     *  Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param goo goo update settings. Use this setting to override the default goo patch rules.
     *  Structure is documented below.
     * @return builder
     */
    def goo(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigGooArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigGooArgs.builder
      builder.goo(args(argsBuilder).build)

    /**
     * @param postStep The ExecStep to run after the patch update.
     *  Structure is documented below.
     * @return builder
     */
    def postStep(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepArgs.builder
      builder.postStep(args(argsBuilder).build)

    /**
     * @param preStep The ExecStep to run before the patch update.
     *  Structure is documented below.
     * @return builder
     */
    def preStep(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepArgs.builder
      builder.preStep(args(argsBuilder).build)

    /**
     * @param windowsUpdate Windows update settings. Use this setting to override the default Windows patch rules.
     *  Structure is documented below.
     * @return builder
     */
    def windowsUpdate(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigWindowsUpdateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigWindowsUpdateArgs.builder
      builder.windowsUpdate(args(argsBuilder).build)

    /**
     * @param yum Yum update settings. Use this setting to override the default yum patch rules.
     *  Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper zypper update settings. Use this setting to override the default zypper patch rules.
     *  Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs.Builder)
    /**
     * @param file A remote or local source. Structure is
     *  documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs.Builder)
    /**
     * @param source An rpm package. Structure is
     *  documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs.Builder)
    /**
     * @param gcsObject A Cloud Storage object containing the executable.
     *  Structure is documented below.
     * @return builder
     */
    def gcsObject(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs.builder
      builder.gcsObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateArgs.Builder)
    /**
     * @param errors (Output)
     *  The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateErrorArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs.Builder)
    /**
     * @param disruptionBudget The maximum number (or percentage) of VMs
     *  per zone to disrupt at any given moment. Structure is
     *  documented below.
     * @return builder
     */
    def disruptionBudget(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutDisruptionBudgetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutDisruptionBudgetArgs.builder
      builder.disruptionBudget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs.Builder)
    /**
     * @param osPolicyAssignmentV1Payload OS policy assignment is an API resource that is used to
     *  apply a set of OS policies to a dynamically targeted group of Compute Engine
     *  VM instances.
     *  An OS policy is used to define the desired state configuration for a
     *  Compute Engine VM instance through a set of configuration resources that
     *  provide capabilities such as installing or removing software packages, or
     *  executing a script.
     *  For more information about the OS policy resource definitions and examples,
     *  see
     *  [OS policy and OS policy
     *  assignment](https://cloud.google.com/compute/docs/os-configuration-management/working-with-os-policies).
     *  Structure is documented below.
     * @return builder
     */
    def osPolicyAssignmentV1Payload(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.builder
      builder.osPolicyAssignmentV1Payload(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateArgs.Builder)
    /**
     * @param error The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def error(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateErrorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateErrorArgs.builder
      builder.error(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupArgs.Builder)
    /**
     * @param inventoryFilters List of inventory filters for the resource
     *  group. The resources in this resource group are applied to the target VM if
     *  it satisfies at least one of the following inventory filters. For example,
     *  to apply this resource group to VMs running either `RHEL` or `CentOS`
     *  operating systems, specify 2 items for the list with following values:
     *  inventory_filters[0].os_short_name=&#39;rhel&#39; and
     *  inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this
     *  resource group will be applied to the target VM unconditionally. Structure
     *  is documented below.
     * @return builder
     */
    def inventoryFilters(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs.builder
      builder.inventoryFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param resources List of resources configured for this resource
     *  group. The resources are executed in the exact order specified here.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeArgs.Builder)
    /**
     * @param selectors Optional. Selectors of the orchestration scope. There is a logical AND between each
     *  selector defined.
     *  When there is no explicit `ResourceHierarchySelector` selector specified,
     *  the scope is by default bounded to the parent of the policy orchestrator
     *  resource.
     *  Structure is documented below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateArgs.Builder)
    /**
     * @param error The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def error(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateErrorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateErrorArgs.builder
      builder.error(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder)
    /**
     * @param apt Represents a single apt package repository. These will be added to
     *  a repo file that will be managed at
     *  `/etc/apt/sources.list.d/google_osconfig.list`.
     *  Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param goo Represents a Goo package repository. These are added to a repo file
     *  that is managed at
     *  `C:/ProgramData/GooGet/repos/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def goo(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryGooArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryGooArgs.builder
      builder.goo(args(argsBuilder).build)

    /**
     * @param yum Represents a single yum package repository. These are added to a
     *  repo file that is managed at
     *  `/etc/yum.repos.d/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper Represents a single zypper package repository. These are added to a
     *  repo file that is managed at
     *  `/etc/zypp/repos.d/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateArgs.Builder)
    /**
     * @param error The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def error(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateErrorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateErrorArgs.builder
      builder.error(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactArgs.Builder)
    /**
     * @param gcs A Google Cloud Storage artifact.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote artifact.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder)
    /**
     * @param gcs A Cloud Storage object. Structure is
     *  documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote file. Structure is
     *  documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.Builder)
    /**
     * @param groupLabels Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     *  for example &#34;env=prod or env=staging&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def groupLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentGroupLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentGroupLabelArgs.builder
      builder.groupLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param osTypes Targets VM instances matching at least one of the following OS types.
     *  VM instances must match all supplied criteria for a given OsType to be included.
     *  Structure is documented below.
     * @return builder
     */
    def osTypes(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentOsTypeArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentOsTypeArgs.builder
      builder.osTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder)
    /**
     * @param inventoryFilters List of inventory filters for the resource group.
     *  The resources in this resource group are applied to the target VM if it
     *  satisfies at least one of the following inventory filters.
     *  For example, to apply this resource group to VMs running either `RHEL` or
     *  `CentOS` operating systems, specify 2 items for the list with following
     *  values:
     *  inventory_filters[0].os_short_name=&#39;rhel&#39; and
     *  inventory_filters[1].os_short_name=&#39;centos&#39;
     *  If the list is empty, this resource group will be applied to the target
     *  VM unconditionally.
     *  Structure is documented below.
     * @return builder
     */
    def inventoryFilters(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilterArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilterArgs.builder
      builder.inventoryFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param resources List of resources configured for this resource group.
     *  The resources are executed in the exact order specified here.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs.Builder)
    /**
     * @param gcs A Cloud Storage object. Structure is
     *  documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote file. Structure is
     *  documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.Builder)
    /**
     * @param exec Exec resource Structure is
     *  documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param file File resource Structure is
     *  documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param pkg Package resource Structure is
     *  documented below.
     * @return builder
     */
    def pkg(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs.builder
      builder.pkg(args(argsBuilder).build)

    /**
     * @param repository Package repository resource Structure is
     *  documented below.
     * @return builder
     */
    def repository(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.builder
      builder.repository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs.Builder)
    /**
     * @param groupLabels Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     *  Structure is documented below.
     * @return builder
     */
    def groupLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterGroupLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterGroupLabelArgs.builder
      builder.groupLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateErrorArgs.Builder)
    /**
     * @param details A list of messages that carry the error details.  There is a common set of
     *  message types for APIs to use.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateErrorDetailArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeArgs.Builder)
    /**
     * @param selectors Optional. Selectors of the orchestration scope. There is a logical AND between each
     *  selector defined.
     *  When there is no explicit `ResourceHierarchySelector` selector specified,
     *  the scope is by default bounded to the parent of the policy orchestrator
     *  resource.
     *  Structure is documented below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateErrorArgs.Builder)
    /**
     * @param details A list of messages that carry the error details.  There is a common set of
     *  message types for APIs to use.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateErrorDetailArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder)
    /**
     * @param apt A package managed by APT.
     *  - install: `apt-get update &amp;&amp; apt-get -y install [name]`
     *  - remove: `apt-get -y remove [name]`
     *    Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param deb A deb package file. dpkg packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def deb(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.builder
      builder.deb(args(argsBuilder).build)

    /**
     * @param googet A package managed by GooGet.
     *  - install: `googet -noconfirm install package`
     *  - remove: `googet -noconfirm remove package`
     *    Structure is documented below.
     * @return builder
     */
    def googet(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGoogetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGoogetArgs.builder
      builder.googet(args(argsBuilder).build)

    /**
     * @param msi An MSI package. MSI packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def msi(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.builder
      builder.msi(args(argsBuilder).build)

    /**
     * @param rpm An RPM package file. RPM packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def rpm(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.builder
      builder.rpm(args(argsBuilder).build)

    /**
     * @param yum A package managed by YUM.
     *  - install: `yum -y install package`
     *  - remove: `yum -y remove package`
     *    Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper A package managed by Zypper.
     *  - install: `zypper -y install package`
     *  - remove: `zypper -y rm package`
     *    Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepArgs.Builder)
    /**
     * @param linuxExecStepConfig The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     *  Structure is documented below.
     * @return builder
     */
    def linuxExecStepConfig(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigArgs.builder
      builder.linuxExecStepConfig(args(argsBuilder).build)

    /**
     * @param windowsExecStepConfig The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     *  Structure is documented below.
     * @return builder
     */
    def windowsExecStepConfig(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigArgs.builder
      builder.windowsExecStepConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder)
    /**
     * @param apt A package managed by APT.
     *  - install: `apt-get update &amp;&amp; apt-get -y install [name]`
     *  - remove: `apt-get -y remove [name]`
     *    Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param deb A deb package file. dpkg packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def deb(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.builder
      builder.deb(args(argsBuilder).build)

    /**
     * @param googet A package managed by GooGet.
     *  - install: `googet -noconfirm install package`
     *  - remove: `googet -noconfirm remove package`
     *    Structure is documented below.
     * @return builder
     */
    def googet(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGoogetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGoogetArgs.builder
      builder.googet(args(argsBuilder).build)

    /**
     * @param msi An MSI package. MSI packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def msi(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.builder
      builder.msi(args(argsBuilder).build)

    /**
     * @param rpm An RPM package file. RPM packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def rpm(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.builder
      builder.rpm(args(argsBuilder).build)

    /**
     * @param yum A package managed by YUM.
     *  - install: `yum -y install package`
     *  - remove: `yum -y remove package`
     *    Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper A package managed by Zypper.
     *  - install: `zypper -y install package`
     *  - remove: `zypper -y rm package`
     *    Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.Builder)
    /**
     * @param apt An Apt Repository. Structure is
     *  documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param goo A Goo Repository. Structure is
     *  documented below.
     * @return builder
     */
    def goo(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooArgs.builder
      builder.goo(args(argsBuilder).build)

    /**
     * @param yum A Yum Repository. Structure is
     *  documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper A Zypper Repository. Structure is
     *  documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder)
    /**
     * @param exec A resource that allows executing scripts on the VM.
     *  The `ExecResource` has 2 stages: `validate` and `enforce` and both stages
     *  accept a script as an argument to execute.
     *  When the `ExecResource` is applied by the agent, it first executes the
     *  script in the `validate` stage. The `validate` stage can signal that the
     *  `ExecResource` is already in the desired state by returning an exit code
     *  of `100`. If the `ExecResource` is not in the desired state, it should
     *  return an exit code of `101`. Any other exit code returned by this stage
     *  is considered an error.
     *  If the `ExecResource` is not in the desired state based on the exit code
     *  from the `validate` stage, the agent proceeds to execute the script from
     *  the `enforce` stage. If the `ExecResource` is already in the desired
     *  state, the `enforce` stage will not be run.
     *  Similar to `validate` stage, the `enforce` stage should return an exit
     *  code of `100` to indicate that the resource in now in its desired state.
     *  Any other exit code is considered an error.
     *  NOTE: An exit code of `100` was chosen over `0` (and `101` vs `1`) to
     *  have an explicit indicator of `in desired state`, `not in desired state`
     *  and errors. Because, for example, Powershell will always return an exit
     *  code of `0` unless an `exit` statement is provided in the script. So, for
     *  reasons of consistency and being explicit, exit codes `100` and `101`
     *  were chosen.
     *  Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param file A resource that manages the state of a file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param pkg A resource that manages a system package.
     *  Structure is documented below.
     * @return builder
     */
    def pkg(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.builder
      builder.pkg(args(argsBuilder).build)

    /**
     * @param repository A resource that manages a package repository.
     *  Structure is documented below.
     * @return builder
     */
    def repository(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.builder
      builder.repository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder)
    /**
     * @param archiveExtraction Extracts an archive into the specified directory.
     *  Structure is documented below.
     * @return builder
     */
    def archiveExtraction(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArchiveExtractionArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArchiveExtractionArgs.builder
      builder.archiveExtraction(args(argsBuilder).build)

    /**
     * @param dpkgInstallation Installs a deb file via dpkg.
     *  Structure is documented below.
     * @return builder
     */
    def dpkgInstallation(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepDpkgInstallationArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepDpkgInstallationArgs.builder
      builder.dpkgInstallation(args(argsBuilder).build)

    /**
     * @param fileCopy Copies a file onto the instance.
     *  Structure is documented below.
     * @return builder
     */
    def fileCopy(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileCopyArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileCopyArgs.builder
      builder.fileCopy(args(argsBuilder).build)

    /**
     * @param fileExec Executes an artifact or local file.
     *  Structure is documented below.
     * @return builder
     */
    def fileExec(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileExecArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepFileExecArgs.builder
      builder.fileExec(args(argsBuilder).build)

    /**
     * @param msiInstallation Installs an MSI file.
     *  Structure is documented below.
     * @return builder
     */
    def msiInstallation(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepMsiInstallationArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepMsiInstallationArgs.builder
      builder.msiInstallation(args(argsBuilder).build)

    /**
     * @param rpmInstallation Installs an rpm file via the rpm utility.
     *  Structure is documented below.
     * @return builder
     */
    def rpmInstallation(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepRpmInstallationArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepRpmInstallationArgs.builder
      builder.rpmInstallation(args(argsBuilder).build)

    /**
     * @param scriptRun Runs commands in a shell.
     *  Structure is documented below.
     * @return builder
     */
    def scriptRun(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepScriptRunArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepScriptRunArgs.builder
      builder.scriptRun(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder)
    /**
     * @param disruptionBudget Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
     *  relative (&#34;percent&#34;) to a value.
     *  Structure is documented below.
     * @return builder
     */
    def disruptionBudget(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.builder
      builder.disruptionBudget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder)
    /**
     * @param enforce A file or script to execute.
     *  Structure is documented below.
     * @return builder
     */
    def enforce(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.builder
      builder.enforce(args(argsBuilder).build)

    /**
     * @param validate A file or script to execute.
     *  Structure is documented below.
     * @return builder
     */
    def validate(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.builder
      builder.validate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder)
    /**
     * @param exclusionLabels List of label sets used for VM exclusion.
     *  If the list has more than one label set, the VM is excluded if any
     *  of the label sets are applicable for the VM.
     *  Structure is documented below.
     * @return builder
     */
    def exclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterExclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterExclusionLabelArgs.builder
      builder.exclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inclusionLabels List of label sets used for VM inclusion.
     *  If the list has more than one `LabelSet`, the VM is included if any
     *  of the label sets are applicable for the VM.
     *  Structure is documented below.
     * @return builder
     */
    def inclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInclusionLabelArgs.builder
      builder.inclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inventories List of inventories to select VMs.
     *  A VM is selected if its inventory data matches at least one of the
     *  following inventories.
     *  Structure is documented below.
     * @return builder
     */
    def inventories(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.builder
      builder.inventories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateArgs.Builder)
    /**
     * @param error The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def error(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateErrorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateErrorArgs.builder
      builder.error(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder)
    /**
     * @param exec A resource that allows executing scripts on the VM.
     *  The `ExecResource` has 2 stages: `validate` and `enforce` and both stages
     *  accept a script as an argument to execute.
     *  When the `ExecResource` is applied by the agent, it first executes the
     *  script in the `validate` stage. The `validate` stage can signal that the
     *  `ExecResource` is already in the desired state by returning an exit code
     *  of `100`. If the `ExecResource` is not in the desired state, it should
     *  return an exit code of `101`. Any other exit code returned by this stage
     *  is considered an error.
     *  If the `ExecResource` is not in the desired state based on the exit code
     *  from the `validate` stage, the agent proceeds to execute the script from
     *  the `enforce` stage. If the `ExecResource` is already in the desired
     *  state, the `enforce` stage will not be run.
     *  Similar to `validate` stage, the `enforce` stage should return an exit
     *  code of `100` to indicate that the resource in now in its desired state.
     *  Any other exit code is considered an error.
     *  NOTE: An exit code of `100` was chosen over `0` (and `101` vs `1`) to
     *  have an explicit indicator of `in desired state`, `not in desired state`
     *  and errors. Because, for example, Powershell will always return an exit
     *  code of `0` unless an `exit` statement is provided in the script. So, for
     *  reasons of consistency and being explicit, exit codes `100` and `101`
     *  were chosen.
     *  Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param file A resource that manages the state of a file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param pkg A resource that manages a system package.
     *  Structure is documented below.
     * @return builder
     */
    def pkg(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.builder
      builder.pkg(args(argsBuilder).build)

    /**
     * @param repository A resource that manages a package repository.
     *  Structure is documented below.
     * @return builder
     */
    def repository(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.builder
      builder.repository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs.Builder)
    /**
     * @param disruptionBudget The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up.
     *  During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps.
     *  A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget.
     *  For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone.
     *  For example, if the disruption budget has a fixed value of 10, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     *  Structure is documented below.
     * @return builder
     */
    def disruptionBudget(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutDisruptionBudgetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutDisruptionBudgetArgs.builder
      builder.disruptionBudget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder)
    /**
     * @param enforce A file or script to execute.
     *  Structure is documented below.
     * @return builder
     */
    def enforce(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.builder
      builder.enforce(args(argsBuilder).build)

    /**
     * @param validate A file or script to execute.
     *  Structure is documented below.
     * @return builder
     */
    def validate(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.builder
      builder.validate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateErrorArgs.Builder)
    /**
     * @param details A list of messages that carry the error details.  There is a common set of
     *  message types for APIs to use.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateErrorDetailArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs.Builder)
    /**
     * @param source The MSI package. Structure is
     *  documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepArgs.Builder)
    /**
     * @param linuxExecStepConfig The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     *  Structure is documented below.
     * @return builder
     */
    def linuxExecStepConfig(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs.builder
      builder.linuxExecStepConfig(args(argsBuilder).build)

    /**
     * @param windowsExecStepConfig The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     *  Structure is documented below.
     * @return builder
     */
    def windowsExecStepConfig(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs.builder
      builder.windowsExecStepConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateArgs.Builder)
    /**
     * @param errors (Output)
     *  The `Status` type defines a logical error model that is suitable for
     *  different programming environments, including REST APIs and RPC APIs. It is
     *  used by [gRPC](https://github.com/grpc). Each `Status` message contains
     *  three pieces of data: error code, error message, and error details.
     *  You can find out more about this error model and how to work with it in the
     *  [API Design Guide](https://cloud.google.com/apis/design/errors).
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder)
    /**
     * @param monthly Schedule with monthly executions.
     *  Structure is documented below.
     * @return builder
     */
    def monthly(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyArgs.builder
      builder.monthly(args(argsBuilder).build)

    /**
     * @param timeOfDay Time of the day to run a recurring deployment.
     *  Structure is documented below.
     * @return builder
     */
    def timeOfDay(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeOfDayArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeOfDayArgs.builder
      builder.timeOfDay(args(argsBuilder).build)

    /**
     * @param timeZone Defines the time zone that timeOfDay is relative to. The rules for daylight saving time are
     *  determined by the chosen time zone.
     *  Structure is documented below.
     * @return builder
     */
    def timeZone(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeZoneArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

    /**
     * @param weekly Schedule with weekly executions.
     *  Structure is documented below.
     * @return builder
     */
    def weekly(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleWeeklyArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleWeeklyArgs.builder
      builder.weekly(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderState.Builder)
    /**
     * @param orchestratedResource Represents a resource that is being orchestrated by the policy orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def orchestratedResource(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs.builder
      builder.orchestratedResource(args(argsBuilder).build)

    /**
     * @param orchestrationScope Defines a set of selectors which drive which resources are in scope of policy
     *  orchestration.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationScope(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs.builder
      builder.orchestrationScope(args(argsBuilder).build)

    /**
     * @param orchestrationStates Describes the state of the orchestration process.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateArgs.builder
      builder.orchestrationStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceArgs.Builder)
    /**
     * @param osPolicyAssignmentV1Payload OS policy assignment is an API resource that is used to
     *  apply a set of OS policies to a dynamically targeted group of Compute Engine
     *  VM instances.
     *  An OS policy is used to define the desired state configuration for a
     *  Compute Engine VM instance through a set of configuration resources that
     *  provide capabilities such as installing or removing software packages, or
     *  executing a script.
     *  For more information about the OS policy resource definitions and examples,
     *  see
     *  [OS policy and OS policy
     *  assignment](https://cloud.google.com/compute/docs/os-configuration-management/working-with-os-policies).
     *  Structure is documented below.
     * @return builder
     */
    def osPolicyAssignmentV1Payload(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.builder
      builder.osPolicyAssignmentV1Payload(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder)
    /**
     * @param inventoryFilters List of inventory filters for the resource group.
     *  The resources in this resource group are applied to the target VM if it
     *  satisfies at least one of the following inventory filters.
     *  For example, to apply this resource group to VMs running either `RHEL` or
     *  `CentOS` operating systems, specify 2 items for the list with following
     *  values:
     *  inventory_filters[0].os_short_name=&#39;rhel&#39; and
     *  inventory_filters[1].os_short_name=&#39;centos&#39;
     *  If the list is empty, this resource group will be applied to the target
     *  VM unconditionally.
     *  Structure is documented below.
     * @return builder
     */
    def inventoryFilters(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilterArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilterArgs.builder
      builder.inventoryFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Required. List of resources configured for this resource group.
     *  The resources are executed in the exact order specified here.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder)
    /**
     * @param instanceFilter Filters to select target VMs for an assignment.
     * 
     *  If more than one filter criteria is specified below, a VM will be selected
     *  if and only if it satisfies all of them.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param osPolicies Required. List of OS policies to be applied to the VMs.
     * @return builder
     */
    def osPolicies(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.builder
      builder.osPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param rollout Message to configure the rollout at the zonal level for the OS policy
     *  assignment.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder)
    /**
     * @param apt A package managed by APT.
     *  - install: `apt-get update &amp;&amp; apt-get -y install [name]`
     *  - remove: `apt-get -y remove [name]`
     *    Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param deb A deb package file. dpkg packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def deb(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.builder
      builder.deb(args(argsBuilder).build)

    /**
     * @param googet A package managed by GooGet.
     *  - install: `googet -noconfirm install package`
     *  - remove: `googet -noconfirm remove package`
     *    Structure is documented below.
     * @return builder
     */
    def googet(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGoogetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGoogetArgs.builder
      builder.googet(args(argsBuilder).build)

    /**
     * @param msi An MSI package. MSI packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def msi(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.builder
      builder.msi(args(argsBuilder).build)

    /**
     * @param rpm An RPM package file. RPM packages only support INSTALLED state.
     *  Structure is documented below.
     * @return builder
     */
    def rpm(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpmArgs.builder
      builder.rpm(args(argsBuilder).build)

    /**
     * @param yum A package managed by YUM.
     *  - install: `yum -y install package`
     *  - remove: `yum -y remove package`
     *    Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper A package managed by Zypper.
     *  - install: `zypper -y install package`
     *  - remove: `zypper -y rm package`
     *    Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs.Builder)
    /**
     * @param file A remote or local file. Structure is
     *  documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateArgs.Builder)
    /**
     * @param currentIterationStates (Output)
     *  Describes the state of a single iteration of the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def currentIterationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateCurrentIterationStateArgs.builder
      builder.currentIterationStates(args.map(_(argsBuilder).build)*)

    /**
     * @param previousIterationState Describes the state of a single iteration of the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def previousIterationState(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateArgs.builder
      builder.previousIterationState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder)
    /**
     * @param apt An Apt Repository.
     *  Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param goo A Goo Repository.
     *  Structure is documented below.
     * @return builder
     */
    def goo(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryGooArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryGooArgs.builder
      builder.goo(args(argsBuilder).build)

    /**
     * @param yum A Yum Repository.
     *  Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper A Zypper Repository.
     *  Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder)
    /**
     * @param disruptionBudget Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
     *  relative (&#34;percent&#34;) to a value.
     *  Structure is documented below.
     * @return builder
     */
    def disruptionBudget(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.builder
      builder.disruptionBudget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.Builder)
    /**
     * @param exclusionLabels List of label sets used for VM exclusion. If
     *  the list has more than one label set, the VM is excluded if any of the label
     *  sets are applicable for the VM. Structure is
     *  documented below.
     * @return builder
     */
    def exclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelArgs.builder
      builder.exclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inclusionLabels List of label sets used for VM inclusion. If
     *  the list has more than one `LabelSet`, the VM is included if any of the
     *  label sets are applicable for the VM. Structure is
     *  documented below.
     * @return builder
     */
    def inclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelArgs.builder
      builder.inclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inventories List of inventories to select VMs. A VM is
     *  selected if its inventory data matches at least one of the following
     *  inventories. Structure is documented below.
     * @return builder
     */
    def inventories(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryArgs.builder
      builder.inventories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder)
    /**
     * @param gcs A Cloud Storage object. Structure is
     *  documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote file. Structure is
     *  documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder)
    /**
     * @param gcs A Cloud Storage object. Structure is
     *  documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote file. Structure is
     *  documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder)
    /**
     * @param disruptionBudget Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
     *  relative (&#34;percent&#34;) to a value.
     *  Structure is documented below.
     * @return builder
     */
    def disruptionBudget(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs.builder
      builder.disruptionBudget(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder)
    /**
     * @param archiveExtraction Extracts an archive into the specified directory.
     *  Structure is documented below.
     * @return builder
     */
    def archiveExtraction(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArchiveExtractionArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArchiveExtractionArgs.builder
      builder.archiveExtraction(args(argsBuilder).build)

    /**
     * @param dpkgInstallation Installs a deb file via dpkg.
     *  Structure is documented below.
     * @return builder
     */
    def dpkgInstallation(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepDpkgInstallationArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepDpkgInstallationArgs.builder
      builder.dpkgInstallation(args(argsBuilder).build)

    /**
     * @param fileCopy Copies a file onto the instance.
     *  Structure is documented below.
     * @return builder
     */
    def fileCopy(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileCopyArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileCopyArgs.builder
      builder.fileCopy(args(argsBuilder).build)

    /**
     * @param fileExec Executes an artifact or local file.
     *  Structure is documented below.
     * @return builder
     */
    def fileExec(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileExecArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileExecArgs.builder
      builder.fileExec(args(argsBuilder).build)

    /**
     * @param msiInstallation Installs an MSI file.
     *  Structure is documented below.
     * @return builder
     */
    def msiInstallation(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepMsiInstallationArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepMsiInstallationArgs.builder
      builder.msiInstallation(args(argsBuilder).build)

    /**
     * @param rpmInstallation Installs an rpm file via the rpm utility.
     *  Structure is documented below.
     * @return builder
     */
    def rpmInstallation(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepRpmInstallationArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepRpmInstallationArgs.builder
      builder.rpmInstallation(args(argsBuilder).build)

    /**
     * @param scriptRun Runs commands in a shell.
     *  Structure is documented below.
     * @return builder
     */
    def scriptRun(args: Endofunction[com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepScriptRunArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepScriptRunArgs.builder
      builder.scriptRun(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder)
    /**
     * @param instanceFilter Filters to select target VMs for an assignment.
     * 
     *  If more than one filter criteria is specified below, a VM will be selected
     *  if and only if it satisfies all of them.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param osPolicies Required. List of OS policies to be applied to the VMs.
     * @return builder
     */
    def osPolicies(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.builder
      builder.osPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param rollout Message to configure the rollout at the zonal level for the OS policy
     *  assignment.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder)
    /**
     * @param exclusionLabels List of label sets used for VM exclusion.
     *  If the list has more than one label set, the VM is excluded if any
     *  of the label sets are applicable for the VM.
     *  Structure is documented below.
     * @return builder
     */
    def exclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterExclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterExclusionLabelArgs.builder
      builder.exclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inclusionLabels List of label sets used for VM inclusion.
     *  If the list has more than one `LabelSet`, the VM is included if any
     *  of the label sets are applicable for the VM.
     *  Structure is documented below.
     * @return builder
     */
    def inclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInclusionLabelArgs.builder
      builder.inclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inventories List of inventories to select VMs.
     *  A VM is selected if its inventory data matches at least one of the
     *  following inventories.
     *  Structure is documented below.
     * @return builder
     */
    def inventories(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.builder
      builder.inventories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder)
    /**
     * @param exec A resource that allows executing scripts on the VM.
     *  The `ExecResource` has 2 stages: `validate` and `enforce` and both stages
     *  accept a script as an argument to execute.
     *  When the `ExecResource` is applied by the agent, it first executes the
     *  script in the `validate` stage. The `validate` stage can signal that the
     *  `ExecResource` is already in the desired state by returning an exit code
     *  of `100`. If the `ExecResource` is not in the desired state, it should
     *  return an exit code of `101`. Any other exit code returned by this stage
     *  is considered an error.
     *  If the `ExecResource` is not in the desired state based on the exit code
     *  from the `validate` stage, the agent proceeds to execute the script from
     *  the `enforce` stage. If the `ExecResource` is already in the desired
     *  state, the `enforce` stage will not be run.
     *  Similar to `validate` stage, the `enforce` stage should return an exit
     *  code of `100` to indicate that the resource in now in its desired state.
     *  Any other exit code is considered an error.
     *  NOTE: An exit code of `100` was chosen over `0` (and `101` vs `1`) to
     *  have an explicit indicator of `in desired state`, `not in desired state`
     *  and errors. Because, for example, Powershell will always return an exit
     *  code of `0` unless an `exit` statement is provided in the script. So, for
     *  reasons of consistency and being explicit, exit codes `100` and `101`
     *  were chosen.
     *  Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param file A resource that manages the state of a file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.builder
      builder.file(args(argsBuilder).build)

    /**
     * @param pkg A resource that manages a system package.
     *  Structure is documented below.
     * @return builder
     */
    def pkg(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgArgs.builder
      builder.pkg(args(argsBuilder).build)

    /**
     * @param repository A resource that manages a package repository.
     *  Structure is documented below.
     * @return builder
     */
    def repository(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.builder
      builder.repository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs.Builder)
    /**
     * @param gcsObject A Cloud Storage object containing the executable.
     *  Structure is documented below.
     * @return builder
     */
    def gcsObject(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs.builder
      builder.gcsObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateArgs.Builder)
    /**
     * @param currentIterationStates (Output)
     *  Describes the state of a single iteration of the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def currentIterationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateCurrentIterationStateArgs.builder
      builder.currentIterationStates(args.map(_(argsBuilder).build)*)

    /**
     * @param previousIterationState Describes the state of a single iteration of the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def previousIterationState(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationStatePreviousIterationStateArgs.builder
      builder.previousIterationState(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateErrorArgs.Builder)
    /**
     * @param details A list of messages that carry the error details.  There is a common set of
     *  message types for APIs to use.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateErrorDetailArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStatePreviousIterationStateErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs.Builder)
    /**
     * @param gcs A Cloud Storage object. Structure is
     *  documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote file. Structure is
     *  documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder)
    /**
     * @param gcs A Cloud Storage object. Structure is
     *  documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote A generic remote file. Structure is
     *  documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs.Builder)
    /**
     * @param file A remote or local file. Structure is
     *  documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs.Builder)
    /**
     * @param enforce What to run to bring this resource into the desired
     *  state. An exit code of 100 indicates &#34;success&#34;, any other exit code
     *  indicates a failure running enforce. Structure is
     *  documented below.
     * @return builder
     */
    def enforce(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs.builder
      builder.enforce(args(argsBuilder).build)

    /**
     * @param validate What to run to validate this resource is in the
     *  desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit
     *  code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates
     *  a failure running validate. Structure is
     *  documented below.
     * @return builder
     */
    def validate(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs.builder
      builder.validate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder)
    /**
     * @param exclusionLabels List of label sets used for VM exclusion.
     *  If the list has more than one label set, the VM is excluded if any
     *  of the label sets are applicable for the VM.
     *  Structure is documented below.
     * @return builder
     */
    def exclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterExclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterExclusionLabelArgs.builder
      builder.exclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inclusionLabels List of label sets used for VM inclusion.
     *  If the list has more than one `LabelSet`, the VM is included if any
     *  of the label sets are applicable for the VM.
     *  Structure is documented below.
     * @return builder
     */
    def inclusionLabels(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInclusionLabelArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInclusionLabelArgs.builder
      builder.inclusionLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param inventories List of inventories to select VMs.
     *  A VM is selected if its inventory data matches at least one of the
     *  following inventories.
     *  Structure is documented below.
     * @return builder
     */
    def inventories(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs.builder
      builder.inventories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentState.Builder)
    /**
     * @param instanceFilter VM instances to patch.
     *  Structure is documented below.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param oneTimeSchedule Schedule a one-time execution.
     *  Structure is documented below.
     * @return builder
     */
    def oneTimeSchedule(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs.builder
      builder.oneTimeSchedule(args(argsBuilder).build)

    /**
     * @param patchConfig Patch configuration that is applied.
     *  Structure is documented below.
     * @return builder
     */
    def patchConfig(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs.builder
      builder.patchConfig(args(argsBuilder).build)

    /**
     * @param recurringSchedule Schedule recurring executions.
     *  Structure is documented below.
     * @return builder
     */
    def recurringSchedule(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs.builder
      builder.recurringSchedule(args(argsBuilder).build)

    /**
     * @param rollout Rollout strategy of the patch job.
     *  Structure is documented below.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsiSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorArgs.Builder)
    /**
     * @param locationSelector Selector containing locations in scope.
     *  Structure is documented below.
     * @return builder
     */
    def locationSelector(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorLocationSelectorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorLocationSelectorArgs.builder
      builder.locationSelector(args(argsBuilder).build)

    /**
     * @param resourceHierarchySelector Selector containing Cloud Resource Manager resource hierarchy nodes.
     *  Structure is documented below.
     * @return builder
     */
    def resourceHierarchySelector(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorResourceHierarchySelectorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeSelectorResourceHierarchySelectorArgs.builder
      builder.resourceHierarchySelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs.Builder)
    /**
     * @param source A deb package. Structure is
     *  documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateErrorArgs.Builder)
    /**
     * @param details (Output)
     *  A list of messages that carry the error details.  There is a common set of
     *  message types for APIs to use.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateErrorDetailArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigArgs.Builder)
    /**
     * @param gcsObject A Cloud Storage object containing the executable.
     *  Structure is documented below.
     * @return builder
     */
    def gcsObject(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectArgs.builder
      builder.gcsObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs.Builder)
    /**
     * @param locationSelector Selector containing locations in scope.
     *  Structure is documented below.
     * @return builder
     */
    def locationSelector(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs.builder
      builder.locationSelector(args(argsBuilder).build)

    /**
     * @param resourceHierarchySelector Selector containing Cloud Resource Manager resource hierarchy nodes.
     *  Structure is documented below.
     * @return builder
     */
    def resourceHierarchySelector(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorResourceHierarchySelectorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorResourceHierarchySelectorArgs.builder
      builder.resourceHierarchySelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder)
    /**
     * @param inventoryFilters List of inventory filters for the resource group.
     *  The resources in this resource group are applied to the target VM if it
     *  satisfies at least one of the following inventory filters.
     *  For example, to apply this resource group to VMs running either `RHEL` or
     *  `CentOS` operating systems, specify 2 items for the list with following
     *  values:
     *  inventory_filters[0].os_short_name=&#39;rhel&#39; and
     *  inventory_filters[1].os_short_name=&#39;centos&#39;
     *  If the list is empty, this resource group will be applied to the target
     *  VM unconditionally.
     *  Structure is documented below.
     * @return builder
     */
    def inventoryFilters(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilterArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilterArgs.builder
      builder.inventoryFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param resources Required. List of resources configured for this resource group.
     *  The resources are executed in the exact order specified here.
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder)
    /**
     * @param apt Represents a single apt package repository. These will be added to
     *  a repo file that will be managed at
     *  `/etc/apt/sources.list.d/google_osconfig.list`.
     *  Structure is documented below.
     * @return builder
     */
    def apt(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryAptArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryAptArgs.builder
      builder.apt(args(argsBuilder).build)

    /**
     * @param goo Represents a Goo package repository. These are added to a repo file
     *  that is managed at
     *  `C:/ProgramData/GooGet/repos/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def goo(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryGooArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryGooArgs.builder
      builder.goo(args(argsBuilder).build)

    /**
     * @param yum Represents a single yum package repository. These are added to a
     *  repo file that is managed at
     *  `/etc/yum.repos.d/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def yum(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryYumArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryYumArgs.builder
      builder.yum(args(argsBuilder).build)

    /**
     * @param zypper Represents a single zypper package repository. These are added to a
     *  repo file that is managed at
     *  `/etc/zypp/repos.d/google_osconfig.repo`.
     *  Structure is documented below.
     * @return builder
     */
    def zypper(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypperArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypperArgs.builder
      builder.zypper(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationState.Builder)
    /**
     * @param orchestratedResource Represents a resource that is being orchestrated by the policy orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def orchestratedResource(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceArgs.builder
      builder.orchestratedResource(args(argsBuilder).build)

    /**
     * @param orchestrationScope Defines a set of selectors which drive which resources are in scope of policy
     *  orchestration.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationScope(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationState.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationScopeArgs.builder
      builder.orchestrationScope(args(argsBuilder).build)

    /**
     * @param orchestrationStates Describes the state of the orchestration process.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationState.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestrationStateArgs.builder
      builder.orchestrationStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder)
    /**
     * @param file A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def file(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceExecValidateFileArgs.builder
      builder.file(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder)
    /**
     * @param gcs Specifies a file available as a Cloud Storage Object.
     *  Structure is documented below.
     * @return builder
     */
    def gcs(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceGcsArgs.builder
      builder.gcs(args(argsBuilder).build)

    /**
     * @param remote Specifies a file available via some URI.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateArgs.Builder)
    /**
     * @param currentIterationStates (Output)
     *  Describes the state of a single iteration of the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def currentIterationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateArgs.builder
      builder.currentIterationStates(args.map(_(argsBuilder).build)*)

    /**
     * @param previousIterationStates (Output)
     *  Describes the state of a single iteration of the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def previousIterationStates(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStatePreviousIterationStateArgs.builder
      builder.previousIterationStates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyArgs.Builder)
    /**
     * @param weekDayOfMonth Week day in a month.
     *  Structure is documented below.
     * @return builder
     */
    def weekDayOfMonth(args: Endofunction[com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthArgs.builder
      builder.weekDayOfMonth(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorArgs.Builder)
    /**
     * @param details (Output)
     *  A list of messages that carry the error details.  There is a common set of
     *  message types for APIs to use.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorDetailArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder)
    /**
     * @param resourceGroups Required. List of resource groups for the policy.
     *  For a particular VM, resource groups are evaluated in the order specified
     *  and the first resource group that is applicable is selected and the rest
     *  are ignored.
     *  If none of the resource groups are applicable for a VM, the VM is
     *  considered to be non-compliant w.r.t this policy. This behavior can be
     *  toggled by the flag `allowNoResourceGroupMatch`
     *  Structure is documented below.
     * @return builder
     */
    def resourceGroups(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.builder
      builder.resourceGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorArgs.Builder)
    /**
     * @param locationSelector Selector containing locations in scope.
     *  Structure is documented below.
     * @return builder
     */
    def locationSelector(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorLocationSelectorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorLocationSelectorArgs.builder
      builder.locationSelector(args(argsBuilder).build)

    /**
     * @param resourceHierarchySelector Selector containing Cloud Resource Manager resource hierarchy nodes.
     *  Structure is documented below.
     * @return builder
     */
    def resourceHierarchySelector(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorResourceHierarchySelectorArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeSelectorResourceHierarchySelectorArgs.builder
      builder.resourceHierarchySelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder)
    /**
     * @param source A remote or local file.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDebSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder)
    /**
     * @param instanceFilter Filters to select target VMs for an assignment.
     * 
     *  If more than one filter criteria is specified below, a VM will be selected
     *  if and only if it satisfies all of them.
     * @return builder
     */
    def instanceFilter(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs.builder
      builder.instanceFilter(args(argsBuilder).build)

    /**
     * @param osPolicies List of OS policies to be applied to the VMs.
     * @return builder
     */
    def osPolicies(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.builder
      builder.osPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param rollout Message to configure the rollout at the zonal level for the OS policy
     *  assignment.
     * @return builder
     */
    def rollout(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.Builder]):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs.builder
      builder.rollout(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder)
    /**
     * @param resourceGroups Required. List of resource groups for the policy.
     *  For a particular VM, resource groups are evaluated in the order specified
     *  and the first resource group that is applicable is selected and the rest
     *  are ignored.
     *  If none of the resource groups are applicable for a VM, the VM is
     *  considered to be non-compliant w.r.t this policy. This behavior can be
     *  toggled by the flag `allowNoResourceGroupMatch`
     *  Structure is documented below.
     * @return builder
     */
    def resourceGroups(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.Builder]*):
        com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs.builder
      builder.resourceGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.Builder)
    /**
     * @param orchestratedResource Represents a resource that is being orchestrated by the policy orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def orchestratedResource(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceArgs.Builder]):
        com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestratedResourceArgs.builder
      builder.orchestratedResource(args(argsBuilder).build)

    /**
     * @param orchestrationScope Defines a set of selectors which drive which resources are in scope of policy
     *  orchestration.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrationScope(args: Endofunction[com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeArgs.Builder]):
        com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorOrchestrationScopeArgs.builder
      builder.orchestrationScope(args(argsBuilder).build)
