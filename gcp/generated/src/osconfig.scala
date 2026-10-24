package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object osconfig:
  /**
   * An OS Config resource representing a guest configuration policy. These policies represent
   * the desired state for VM instance guest environments including packages to install or remove,
   * package repository configurations, and software to install.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about GuestPolicies, see:
   * 
   * * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/compute/docs/os-config-management)
   */
  def GuestPolicies(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.GuestPoliciesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.osconfig.GuestPoliciesArgs.builder
    com.pulumi.gcp.osconfig.GuestPolicies(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * OS policy assignment is an API resource that is used to apply a set of OS
   * policies to a dynamically targeted group of Compute Engine VM instances. An OS
   * policy is used to define the desired state configuration for a Compute Engine VM
   * instance through a set of configuration resources that provide capabilities such
   * as installing or removing software packages, or executing a script. For more
   * information about the OS policy resource definitions and examples, see
   * [OS policy and OS policy assignment](https://cloud.google.com/compute/docs/os-configuration-management/working-with-os-policies).
   * 
   * To get more information about OSPolicyAssignment, see:
   * 
   * *   [API documentation](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments)
   * *   How-to Guides
   *     *   [Official Documentation](https://cloud.google.com/compute/docs/os-configuration-management/create-os-policy-assignment)
   */
  def OsPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.osconfig.OsPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Patch deployments are configurations that individual patch jobs use to complete a patch.
   * These configurations include instance filter, package repository settings, and a schedule.
   * 
   * To get more information about PatchDeployment, see:
   * 
   * * [API documentation](https://cloud.google.com/compute/docs/osconfig/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/compute/docs/os-patch-management)
   */
  def PatchDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.PatchDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.osconfig.PatchDeploymentArgs.builder
    com.pulumi.gcp.osconfig.PatchDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
   * OS Policy Assignments), by providing tools to create, update and delete them
   * across projects and locations, at scale.
   */
  def V2PolicyOrchestrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.osconfig.V2PolicyOrchestratorArgs.builder
    com.pulumi.gcp.osconfig.V2PolicyOrchestrator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
   * OS Policy Assignments), by providing tools to create, update and delete them
   * across projects and locations, at scale.
   */
  def V2PolicyOrchestratorForFolder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolderArgs.builder
    com.pulumi.gcp.osconfig.V2PolicyOrchestratorForFolder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * PolicyOrchestrator helps managing project+zone level policy resources (e.g.
   * OS Policy Assignments), by providing tools to create, update and delete them
   * across projects and locations, at scale.
   */
  def V2PolicyOrchestratorForOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganizationArgs.builder
    com.pulumi.gcp.osconfig.V2PolicyOrchestratorForOrganization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
