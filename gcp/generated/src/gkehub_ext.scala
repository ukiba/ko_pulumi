package jp.ukiba.ko_pulumi
package gcp

object gkehub_ext:
  extension (builder: com.pulumi.gcp.gkehub.FeatureArgs.Builder)
    /**
     * @param fleetDefaultMemberConfig Optional. Fleet Default Membership Configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def fleetDefaultMemberConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.builder
      builder.fleetDefaultMemberConfig(args(argsBuilder).build)

    /**
     * @param spec Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * Structure is documented below.
     * @return builder
     */
    inline def spec(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder)
    /**
     * @param configmanagement Config Management-specific spec. Structure is documented below.
     * @return builder
     */
    inline def configmanagement(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.builder
      builder.configmanagement(args(argsBuilder).build)

    /**
     * @param mesh Service mesh specific spec. Structure is documented below.
     * @return builder
     */
    inline def mesh(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.builder
      builder.mesh(args(argsBuilder).build)

    /**
     * @param policycontroller Policy Controller-specific spec. Structure is documented below.
     * @return builder
     */
    inline def policycontroller(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.builder
      builder.policycontroller(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.FleetArgs.Builder)
    /**
     * @param defaultClusterConfig The default cluster configurations to apply across the fleet.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultClusterConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.FleetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.builder
      builder.defaultClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipArgs.Builder)
    /**
     * @param authority Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * @return builder
     */
    inline def authority(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.builder
      builder.authority(args(argsBuilder).build)

    /**
     * @param endpoint If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * @return builder
     */
    inline def endpoint(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs.Builder)
    /**
     * @param role Role to bind to the principal.
     * Structure is documented below.
     * @return builder
     */
    inline def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder)
    /**
     * @param autoUpgradeConfig Configuration for automatic upgrades.
     * If not specified, the system applies default behavior.
     * Structure is documented below.
     * @return builder
     */
    inline def autoUpgradeConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigArgs.builder
      builder.autoUpgradeConfig(args(argsBuilder).build)

    /**
     * @param ignoredClustersSelector Selector for clusters to exclude from the Rollout Sequence.
     * Structure is documented below.
     * @return builder
     */
    inline def ignoredClustersSelector(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.Builder]):
        com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.builder
      builder.ignoredClustersSelector(args(argsBuilder).build)

    /**
     * @param stages Ordered list of stages that constitute this Rollout Sequence.
     * Structure is documented below.
     * @return builder
     */
    inline def stages(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder]*):
        com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.ScopeIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.ScopeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.ScopeIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.ScopeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.ScopeRbacRoleBindingArgs.Builder)
    /**
     * @param role Role to bind to the principal.
     * Structure is documented below.
     * @return builder
     */
    inline def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.ScopeRbacRoleBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder)
    /**
     * @param configmanagement Config Management spec
     * Structure is documented below.
     * @return builder
     */
    inline def configmanagement(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.builder
      builder.configmanagement(args(argsBuilder).build)

    /**
     * @param mesh Service Mesh spec
     * Structure is documented below.
     * @return builder
     */
    inline def mesh(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigMeshArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigMeshArgs.builder
      builder.mesh(args(argsBuilder).build)

    /**
     * @param policycontroller Policy Controller spec
     * Structure is documented below.
     * @return builder
     */
    inline def policycontroller(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.builder
      builder.policycontroller(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.Builder)
    /**
     * @param configSync ConfigSync configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    inline def configSync(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.builder
      builder.configSync(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder)
    /**
     * @param git Git repo configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    inline def git(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs.builder
      builder.git(args(argsBuilder).build)

    /**
     * @param oci OCI repo configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    inline def oci(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOciArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOciArgs.builder
      builder.oci(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.Builder)
    /**
     * @param policyControllerHubConfig Configuration of Policy Controller
     * Structure is documented below.
     * @return builder
     */
    inline def policyControllerHubConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.builder
      builder.policyControllerHubConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder)
    /**
     * @param deploymentConfigs Map of deployment configs to deployments (&#34;admission&#34;, &#34;audit&#34;, &#34;mutation&#34;).
     * Structure is documented below.
     * @return builder
     */
    inline def deploymentConfigs(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.builder
      builder.deploymentConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param monitoring Monitoring specifies the configuration of monitoring Policy Controller.
     * Structure is documented below.
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param policyContent Specifies the desired policy content on the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def policyContent(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.builder
      builder.policyContent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder)
    /**
     * @param containerResources Container resource requirements.
     * Structure is documented below.
     * @return builder
     */
    inline def containerResources(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.builder
      builder.containerResources(args(argsBuilder).build)

    /**
     * @param podTolerations Pod tolerations of node taints.
     * Structure is documented below.
     * @return builder
     */
    inline def podTolerations(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.builder
      builder.podTolerations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder)
    /**
     * @param limits Limits describes the maximum amount of compute resources allowed for use by the running container.
     * Structure is documented below.
     * @return builder
     */
    inline def limits(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param requests Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
     * Structure is documented below.
     * @return builder
     */
    inline def requests(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder)
    /**
     * @param bundles Configures which bundles to install and their corresponding install specs.
     * Structure is documented below.
     * @return builder
     */
    inline def bundles(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.builder
      builder.bundles(args.map(_(argsBuilder).build)*)

    /**
     * @param templateLibrary Configures the installation of the Template Library.
     * Structure is documented below.
     * @return builder
     */
    inline def templateLibrary(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.builder
      builder.templateLibrary(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder)
    /**
     * @param configSync Config Sync configuration for the cluster. Structure is documented below.
     * @return builder
     */
    inline def configSync(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.builder
      builder.configSync(args(argsBuilder).build)

    /**
     * @param hierarchyController Hierarchy Controller configuration for the cluster. Structure is documented below.
     * Configuring Hierarchy Controller through the configmanagement feature is no longer recommended.
     * Use open source Kubernetes [Hierarchical Namespace Controller (HNC)](https://github.com/kubernetes-sigs/hierarchical-namespaces) instead.
     * Follow the [instructions](https://cloud.google.com/kubernetes-engine/enterprise/config-sync/docs/how-to/migrate-hierarchy-controller)
     * to migrate from Hierarchy Controller to HNC.
     * @return builder
     */
    inline def hierarchyController(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementHierarchyControllerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementHierarchyControllerArgs.builder
      builder.hierarchyController(args(argsBuilder).build)

    /**
     * @param policyController Policy Controller configuration for the cluster. Structure is documented below.
     * Configuring Policy Controller through the configmanagement feature is no longer recommended.
     * Use the policycontroller feature instead.
     * @return builder
     */
    inline def policyController(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.builder
      builder.policyController(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder)
    /**
     * @param deploymentOverrides The override configurations for the Config Sync Deployments. Structure is documented below. The field is only available on Config Sync version 1.20.1 or later.
     * @return builder
     */
    inline def deploymentOverrides(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.builder
      builder.deploymentOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param git (Optional) Structure is documented below.
     * @return builder
     */
    inline def git(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncGitArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncGitArgs.builder
      builder.git(args(argsBuilder).build)

    /**
     * @param oci (Optional) Supported from Config Sync versions 1.12.0 onwards. Structure is documented below.
     * 
     * Use either `git` or `oci` config option.
     * @return builder
     */
    inline def oci(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncOciArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncOciArgs.builder
      builder.oci(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.Builder)
    /**
     * @param containers The override configurations for the containers in the Deployment. Structure is documented below.
     * @return builder
     */
    inline def containers(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.Builder)
    /**
     * @param monitoring Specifies the backends Policy Controller should export metrics to. For example, to specify metrics should be exported to Cloud Monitoring and Prometheus, specify backends: [&#34;cloudmonitoring&#34;, &#34;prometheus&#34;]. Default: [&#34;cloudmonitoring&#34;, &#34;prometheus&#34;]
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerMonitoringArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder)
    /**
     * @param policyControllerHubConfig Policy Controller configuration for the cluster. Structure is documented below.
     * @return builder
     */
    inline def policyControllerHubConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.builder
      builder.policyControllerHubConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder)
    /**
     * @param deploymentConfigs Map of deployment configs to deployments (&#34;admission&#34;, &#34;audit&#34;, &#34;mutation&#34;).
     * @return builder
     */
    inline def deploymentConfigs(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.builder
      builder.deploymentConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param monitoring Specifies the backends Policy Controller should export metrics to. Structure is documented below.
     * @return builder
     */
    inline def monitoring(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoringArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param policyContent Specifies the desired policy content on the cluster. Structure is documented below.
     * @return builder
     */
    inline def policyContent(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.builder
      builder.policyContent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder)
    /**
     * @param containerResources Container resource requirements.
     * @return builder
     */
    inline def containerResources(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.builder
      builder.containerResources(args(argsBuilder).build)

    /**
     * @param podTolerations Pod tolerations of node taints.
     * @return builder
     */
    inline def podTolerations(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.builder
      builder.podTolerations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder)
    /**
     * @param limits Limits describes the maximum amount of compute resources allowed for use by the running container.
     * @return builder
     */
    inline def limits(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param requests Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
     * @return builder
     */
    inline def requests(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder)
    /**
     * @param bundles map of bundle name to BundleInstallSpec. The bundle name maps to the `bundleName` key in the `policycontroller.gke.io/constraintData` annotation on a constraint.
     * @return builder
     */
    inline def bundles(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.builder
      builder.bundles(args.map(_(argsBuilder).build)*)

    /**
     * @param templateLibrary Configures the installation of the Template Library. Structure is documented below.
     * @return builder
     */
    inline def templateLibrary(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.builder
      builder.templateLibrary(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder)
    /**
     * @param configmanagement Config Management-specific spec. Structure is documented below.
     * @return builder
     */
    inline def configmanagement(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.builder
      builder.configmanagement(args(argsBuilder).build)

    /**
     * @param mesh Service mesh specific spec. Structure is documented below.
     * @return builder
     */
    inline def mesh(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.builder
      builder.mesh(args(argsBuilder).build)

    /**
     * @param policycontroller Policy Controller-specific spec. Structure is documented below.
     * @return builder
     */
    inline def policycontroller(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.builder
      builder.policycontroller(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder)
    /**
     * @param clusterupgrade Clusterupgrade feature spec.
     * Structure is documented below.
     * @return builder
     */
    inline def clusterupgrade(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.builder
      builder.clusterupgrade(args(argsBuilder).build)

    /**
     * @param fleetobservability Fleet Observability feature spec.
     * Structure is documented below.
     * @return builder
     */
    inline def fleetobservability(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.builder
      builder.fleetobservability(args(argsBuilder).build)

    /**
     * @param multiclusteringress Multicluster Ingress-specific spec.
     * Structure is documented below.
     * @return builder
     */
    inline def multiclusteringress(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecMulticlusteringressArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecMulticlusteringressArgs.builder
      builder.multiclusteringress(args(argsBuilder).build)

    /**
     * @param rbacrolebindingactuation RBACRolebinding Actuation feature spec.
     * Structure is documented below.
     * @return builder
     */
    inline def rbacrolebindingactuation(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecRbacrolebindingactuationArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecRbacrolebindingactuationArgs.builder
      builder.rbacrolebindingactuation(args(argsBuilder).build)

    /**
     * @param workloadidentity Workload Identity feature spec.
     * Structure is documented below.
     * @return builder
     */
    inline def workloadidentity(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecWorkloadidentityArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecWorkloadidentityArgs.builder
      builder.workloadidentity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder)
    /**
     * @param gkeUpgradeOverrides Configuration overrides for individual upgrades.
     * Structure is documented below.
     * @return builder
     */
    inline def gkeUpgradeOverrides(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.builder
      builder.gkeUpgradeOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param postConditions Post conditions to override for the specified upgrade.
     * Structure is documented below.
     * @return builder
     */
    inline def postConditions(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradePostConditionsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradePostConditionsArgs.builder
      builder.postConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder)
    /**
     * @param postConditions Post conditions to override for the specified upgrade.
     * Structure is documented below.
     * @return builder
     */
    inline def postConditions(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverridePostConditionsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverridePostConditionsArgs.builder
      builder.postConditions(args(argsBuilder).build)

    /**
     * @param upgrade Which upgrade to override.
     * Structure is documented below.
     * @return builder
     */
    inline def upgrade(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeArgs.builder
      builder.upgrade(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.Builder)
    /**
     * @param loggingConfig Specified if fleet logging feature is enabled for the entire fleet. If UNSPECIFIED, fleet logging feature is disabled for the entire fleet.
     * Structure is documented below.
     * @return builder
     */
    inline def loggingConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder)
    /**
     * @param defaultConfig Specified if applying the default routing config to logs not specified in other configs.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs.builder
      builder.defaultConfig(args(argsBuilder).build)

    /**
     * @param fleetScopeLogsConfig Specified if applying the routing config to all logs for all fleet scopes.
     * Structure is documented below.
     * @return builder
     */
    inline def fleetScopeLogsConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs.builder
      builder.fleetScopeLogsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureState.Builder)
    /**
     * @param fleetDefaultMemberConfig Optional. Fleet Default Membership Configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def fleetDefaultMemberConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.builder
      builder.fleetDefaultMemberConfig(args(argsBuilder).build)

    /**
     * @param resourceStates State of the Feature resource itself.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceStates(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureResourceStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureResourceStateArgs.builder
      builder.resourceStates(args.map(_(argsBuilder).build)*)

    /**
     * @param spec Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * Structure is documented below.
     * @return builder
     */
    inline def spec(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param states (Output)
     * Output only. The &#34;running state&#34; of the Feature in this Hub.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.Builder)
    /**
     * @param states (Output)
     * Output only. The &#34;running state&#34; of the Feature in this Hub.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureStateStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureStateStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder)
    /**
     * @param binaryAuthorizationConfig Enable/Disable binary authorization features for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def binaryAuthorizationConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.builder
      builder.binaryAuthorizationConfig(args(argsBuilder).build)

    /**
     * @param compliancePostureConfig Enable/Disable Compliance Posture features for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def compliancePostureConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigCompliancePostureConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigCompliancePostureConfigArgs.builder
      builder.compliancePostureConfig(args(argsBuilder).build)

    /**
     * @param securityPostureConfig Enable/Disable Security Posture features for the cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def securityPostureConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigSecurityPostureConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigSecurityPostureConfigArgs.builder
      builder.securityPostureConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.Builder)
    /**
     * @param policyBindings Binauthz policies that apply to this cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def policyBindings(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs.builder
      builder.policyBindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigCompliancePostureConfigArgs.Builder)
    /**
     * @param complianceStandards List of enabled compliance standards.
     * Structure is documented below.
     * @return builder
     */
    inline def complianceStandards(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigCompliancePostureConfigComplianceStandardArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigCompliancePostureConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigCompliancePostureConfigComplianceStandardArgs.builder
      builder.complianceStandards(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetState.Builder)
    /**
     * @param defaultClusterConfig The default cluster configurations to apply across the fleet.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultClusterConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.builder
      builder.defaultClusterConfig(args(argsBuilder).build)

    /**
     * @param states The state of the fleet resource.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipBindingState.Builder)
    /**
     * @param states State of the membership binding resource.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipBindingStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.MembershipBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipBindingStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder)
    /**
     * @param gkeCluster If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * @return builder
     */
    inline def gkeCluster(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterArgs.builder
      builder.gkeCluster(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState.Builder)
    /**
     * @param role Role to bind to the principal.
     * Structure is documented below.
     * @return builder
     */
    inline def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

    /**
     * @param states State of the RBAC Role Binding resource.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipState.Builder)
    /**
     * @param authority Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * @return builder
     */
    inline def authority(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.builder
      builder.authority(args(argsBuilder).build)

    /**
     * @param endpoint If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * @return builder
     */
    inline def endpoint(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.NamespaceState.Builder)
    /**
     * @param states State of the namespace resource.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.NamespaceStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.NamespaceState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.NamespaceStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigArgs.Builder)
    /**
     * @param rolloutCreationScope Specifies the scope of automation for the creation of rollouts.
     * Represents the types of rollouts (version upgrades) the sequence should
     * initiate automatically.
     * If this field is not specified, it defaults to all types.
     * If this field is specified, but the nested upgradeTypes field is empty,
     * most automatic rollouts are disabled for this sequence.
     * Exceptions are rollouts enforcing our security policies (e.g. such as
     * end-of-support and outdated control plane patch enforcements).
     * These policy enforcements cannot be disabled.
     * Structure is documented below.
     * @return builder
     */
    inline def rolloutCreationScope(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigRolloutCreationScopeArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigRolloutCreationScopeArgs.builder
      builder.rolloutCreationScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder)
    /**
     * @param clusterSelector Filter to select a subset of clusters from the specified Fleet projects.
     * If not specified, all clusters in the fleet projects are selected.
     * Structure is documented below.
     * @return builder
     */
    inline def clusterSelector(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageClusterSelectorArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageClusterSelectorArgs.builder
      builder.clusterSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder)
    /**
     * @param autoUpgradeConfig Configuration for automatic upgrades.
     * If not specified, the system applies default behavior.
     * Structure is documented below.
     * @return builder
     */
    inline def autoUpgradeConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceAutoUpgradeConfigArgs.builder
      builder.autoUpgradeConfig(args(argsBuilder).build)

    /**
     * @param ignoredClustersSelector Selector for clusters to exclude from the Rollout Sequence.
     * Structure is documented below.
     * @return builder
     */
    inline def ignoredClustersSelector(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.builder
      builder.ignoredClustersSelector(args(argsBuilder).build)

    /**
     * @param operationalStates The operational state of the rollout sequence.
     * Structure is documented below.
     * @return builder
     */
    inline def operationalStates(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceOperationalStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceOperationalStateArgs.builder
      builder.operationalStates(args.map(_(argsBuilder).build)*)

    /**
     * @param stages Ordered list of stages that constitute this Rollout Sequence.
     * Structure is documented below.
     * @return builder
     */
    inline def stages(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.ScopeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.ScopeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingState.Builder)
    /**
     * @param role Role to bind to the principal.
     * Structure is documented below.
     * @return builder
     */
    inline def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

    /**
     * @param states State of the RBAC Role Binding resource.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeState.Builder)
    /**
     * @param states State of the scope resource.
     * Structure is documented below.
     * @return builder
     */
    inline def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.ScopeState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)
