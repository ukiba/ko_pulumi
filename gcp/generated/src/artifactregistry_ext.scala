package jp.ukiba.ko_pulumi
package gcp

object artifactregistry_ext:
  extension (builder: com.pulumi.gcp.artifactregistry.ProjectConfigArgs.Builder)
    /**
     * @param platformLogsConfig Configuration for platform logs.
     * Structure is documented below.
     * @return builder
     */
    def platformLogsConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.ProjectConfigPlatformLogsConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.ProjectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.ProjectConfigPlatformLogsConfigArgs.builder
      builder.platformLogsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder)
    /**
     * @param cleanupPolicies Cleanup policies for this repository. Cleanup policies indicate when
     * certain package versions can be automatically deleted.
     * Map keys are policy IDs supplied by users during policy creation. They must
     * unique within a repository and be under 128 characters in length.
     * Structure is documented below.
     * @return builder
     */
    def cleanupPolicies(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder]*):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.builder
      builder.cleanupPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param dockerConfig Docker repository config contains repository level configuration for the repositories of docker type.
     * Structure is documented below.
     * @return builder
     */
    def dockerConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.builder
      builder.dockerConfig(args(argsBuilder).build)

    /**
     * @param mavenConfig MavenRepositoryConfig is maven related repository details.
     * Provides additional configuration details for repositories of the maven
     * format type.
     * Structure is documented below.
     * @return builder
     */
    def mavenConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.builder
      builder.mavenConfig(args(argsBuilder).build)

    /**
     * @param remoteRepositoryConfig Configuration specific for a Remote Repository.
     * Structure is documented below.
     * @return builder
     */
    def remoteRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.builder
      builder.remoteRepositoryConfig(args(argsBuilder).build)

    /**
     * @param virtualRepositoryConfig Configuration specific for a Virtual Repository.
     * Structure is documented below.
     * @return builder
     */
    def virtualRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.builder
      builder.virtualRepositoryConfig(args(argsBuilder).build)

    /**
     * @param vulnerabilityScanningConfig Configuration for vulnerability scanning of artifacts stored in this repository.
     * Structure is documented below.
     * @return builder
     */
    def vulnerabilityScanningConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.builder
      builder.vulnerabilityScanningConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RuleArgs.Builder)
    /**
     * @param condition Optional. A CEL expression for conditions that must be met in order for the
     * rule to apply. If not provided, the rule matches all objects.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.ProjectConfigState.Builder)
    /**
     * @param platformLogsConfig Configuration for platform logs.
     * Structure is documented below.
     * @return builder
     */
    def platformLogsConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.ProjectConfigPlatformLogsConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.ProjectConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.ProjectConfigPlatformLogsConfigArgs.builder
      builder.platformLogsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder)
    /**
     * @param condition Policy condition for matching versions.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param mostRecentVersions Policy condition for retaining a minimum number of versions. May only be
     * specified with a Keep action.
     * Structure is documented below.
     * @return builder
     */
    def mostRecentVersions(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyMostRecentVersionsArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyMostRecentVersionsArgs.builder
      builder.mostRecentVersions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.Builder)
    /**
     * @param publicRepository One of the publicly available Apt repositories supported by Artifact Registry.
     * Structure is documented below.
     * @return builder
     */
    def publicRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryArgs.builder
      builder.publicRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder)
    /**
     * @param aptRepository Specific settings for an Apt remote repository.
     * Structure is documented below.
     * @return builder
     */
    def aptRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.builder
      builder.aptRepository(args(argsBuilder).build)

    /**
     * @param commonRepository Specific settings for an Artifact Registory remote repository.
     * Structure is documented below.
     * @return builder
     */
    def commonRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigCommonRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigCommonRepositoryArgs.builder
      builder.commonRepository(args(argsBuilder).build)

    /**
     * @param dockerRepository Specific settings for a Docker remote repository.
     * Structure is documented below.
     * @return builder
     */
    def dockerRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.builder
      builder.dockerRepository(args(argsBuilder).build)

    /**
     * @param mavenRepository Specific settings for a Maven remote repository.
     * Structure is documented below.
     * @return builder
     */
    def mavenRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.builder
      builder.mavenRepository(args(argsBuilder).build)

    /**
     * @param noCache The repository will act as a non-caching proxy (connector mode).
     * @return builder
     */
    def noCache(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNoCacheArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNoCacheArgs.builder
      builder.noCache(args(argsBuilder).build)

    /**
     * @param npmRepository Specific settings for an Npm remote repository.
     * Structure is documented below.
     * @return builder
     */
    def npmRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.builder
      builder.npmRepository(args(argsBuilder).build)

    /**
     * @param pythonRepository Specific settings for a Python remote repository.
     * Structure is documented below.
     * @return builder
     */
    def pythonRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.builder
      builder.pythonRepository(args(argsBuilder).build)

    /**
     * @param upstreamCredentials The credentials used to access the remote repository.
     * Structure is documented below.
     * @return builder
     */
    def upstreamCredentials(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.builder
      builder.upstreamCredentials(args(argsBuilder).build)

    /**
     * @param yumRepository Specific settings for an Yum remote repository.
     * Structure is documented below.
     * @return builder
     */
    def yumRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.builder
      builder.yumRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     * Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     * Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     * Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     * Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.Builder)
    /**
     * @param usernamePasswordCredentials Use username and password to access the remote repository.
     * Structure is documented below.
     * @return builder
     */
    def usernamePasswordCredentials(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs.builder
      builder.usernamePasswordCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.Builder)
    /**
     * @param publicRepository One of the publicly available Yum repositories supported by Artifact Registry.
     * Structure is documented below.
     * @return builder
     */
    def publicRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs.builder
      builder.publicRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder)
    /**
     * @param cleanupPolicies Cleanup policies for this repository. Cleanup policies indicate when
     * certain package versions can be automatically deleted.
     * Map keys are policy IDs supplied by users during policy creation. They must
     * unique within a repository and be under 128 characters in length.
     * Structure is documented below.
     * @return builder
     */
    def cleanupPolicies(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder]*):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.builder
      builder.cleanupPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param dockerConfig Docker repository config contains repository level configuration for the repositories of docker type.
     * Structure is documented below.
     * @return builder
     */
    def dockerConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.builder
      builder.dockerConfig(args(argsBuilder).build)

    /**
     * @param mavenConfig MavenRepositoryConfig is maven related repository details.
     * Provides additional configuration details for repositories of the maven
     * format type.
     * Structure is documented below.
     * @return builder
     */
    def mavenConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.builder
      builder.mavenConfig(args(argsBuilder).build)

    /**
     * @param remoteRepositoryConfig Configuration specific for a Remote Repository.
     * Structure is documented below.
     * @return builder
     */
    def remoteRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.builder
      builder.remoteRepositoryConfig(args(argsBuilder).build)

    /**
     * @param virtualRepositoryConfig Configuration specific for a Virtual Repository.
     * Structure is documented below.
     * @return builder
     */
    def virtualRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.builder
      builder.virtualRepositoryConfig(args(argsBuilder).build)

    /**
     * @param vulnerabilityScanningConfig Configuration for vulnerability scanning of artifacts stored in this repository.
     * Structure is documented below.
     * @return builder
     */
    def vulnerabilityScanningConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.builder
      builder.vulnerabilityScanningConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder)
    /**
     * @param upstreamPolicies Policies that configure the upstream artifacts distributed by the Virtual
     * Repository. Upstream policies cannot be set on a standard repository.
     * Structure is documented below.
     * @return builder
     */
    def upstreamPolicies(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigUpstreamPolicyArgs.Builder]*):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigUpstreamPolicyArgs.builder
      builder.upstreamPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RuleState.Builder)
    /**
     * @param condition Optional. A CEL expression for conditions that must be met in order for the
     * rule to apply. If not provided, the rule matches all objects.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)
