package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codebuild:
  /** Provides a CodeBuild Fleet Resource. */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codebuild.FleetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codebuild.FleetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codebuild.Fleet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CodebuildFunctions = com.pulumi.aws.codebuild.CodebuildFunctions
  object CodebuildFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.codebuild.CodebuildFunctions.*
  extension (self: CodebuildFunctions.type)
    /** Retrieve information about an CodeBuild Fleet. */
    def getFleet(args: Endofunction[com.pulumi.aws.codebuild.inputs.GetFleetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codebuild.outputs.GetFleetResult] =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.GetFleetArgs.builder
      com.pulumi.aws.codebuild.CodebuildFunctions.getFleet(args(argsBuilder).build)

    /** Retrieve information about an CodeBuild Fleet. */
    def getFleetPlain(args: Endofunction[com.pulumi.aws.codebuild.inputs.GetFleetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codebuild.outputs.GetFleetResult] =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.GetFleetPlainArgs.builder
      com.pulumi.aws.codebuild.CodebuildFunctions.getFleetPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.WebhookArgs.Builder)
    /**
     * @param filterGroups Information about the webhook&#39;s trigger. See filterGroup for details.
     * @return builder
     */
    def filterGroups(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs.Builder]*):
        com.pulumi.aws.codebuild.WebhookArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs.builder
      builder.filterGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param pullRequestBuildPolicy Defines comment-based approval requirements for triggering builds on pull requests. See pullRequestBuildPolicy for details.
     * @return builder
     */
    def pullRequestBuildPolicy(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookPullRequestBuildPolicyArgs.Builder]):
        com.pulumi.aws.codebuild.WebhookArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookPullRequestBuildPolicyArgs.builder
      builder.pullRequestBuildPolicy(args(argsBuilder).build)

    /**
     * @param scopeConfiguration Scope configuration for global or organization webhooks. See scopeConfiguration for details.
     * @return builder
     */
    def scopeConfiguration(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookScopeConfigurationArgs.Builder]):
        com.pulumi.aws.codebuild.WebhookArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookScopeConfigurationArgs.builder
      builder.scopeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.ProjectArgs.Builder)
    /**
     * @param artifacts Configuration block. Detailed below.
     * @return builder
     */
    def artifacts(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectArtifactsArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectArtifactsArgs.builder
      builder.artifacts(args(argsBuilder).build)

    /**
     * @param buildBatchConfig Defines the batch build options for the project.
     * @return builder
     */
    def buildBatchConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs.builder
      builder.buildBatchConfig(args(argsBuilder).build)

    /**
     * @param cache Configuration block. Detailed below.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectCacheArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectCacheArgs.builder
      builder.cache(args(argsBuilder).build)

    /**
     * @param environment Configuration block. Detailed below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param fileSystemLocations A set of file system locations to mount inside the build. File system locations
     *  are documented below.
     * @return builder
     */
    def fileSystemLocations(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationArgs.Builder]*):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationArgs.builder
      builder.fileSystemLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param logsConfig Configuration block. Detailed below.
     * @return builder
     */
    def logsConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.builder
      builder.logsConfig(args(argsBuilder).build)

    /**
     * @param secondaryArtifacts Configuration block. Detailed below.
     * @return builder
     */
    def secondaryArtifacts(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactArgs.Builder]*):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactArgs.builder
      builder.secondaryArtifacts(args.map(_(argsBuilder).build)*)

    /**
     * @param secondarySourceVersions Configuration block. Detailed below.
     * @return builder
     */
    def secondarySourceVersions(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionArgs.Builder]*):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionArgs.builder
      builder.secondarySourceVersions(args.map(_(argsBuilder).build)*)

    /**
     * @param secondarySources Configuration block. Detailed below.
     * @return builder
     */
    def secondarySources(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.Builder]*):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.builder
      builder.secondarySources(args.map(_(argsBuilder).build)*)

    /**
     * @param source Configuration block. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block. Detailed below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectVpcConfigArgs.Builder]):
        com.pulumi.aws.codebuild.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.ReportGroupArgs.Builder)
    /**
     * @param exportConfig Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
     * @return builder
     */
    def exportConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs.Builder]):
        com.pulumi.aws.codebuild.ReportGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs.builder
      builder.exportConfig(args(argsBuilder).build)

  /** Provides a CodeBuild Resource Policy Resource. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codebuild.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codebuild.ResourcePolicyArgs.builder
    
    com.pulumi.aws.codebuild.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CodeBuild Report Groups Resource. */
  def ReportGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codebuild.ReportGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codebuild.ReportGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codebuild.ReportGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a CodeBuild Project resource. See also the
   *  `aws.codebuild.Webhook` resource, which manages the webhook to the
   *  source (e.g., the &#34;rebuild every time a code change is pushed&#34; option in the CodeBuild web console).
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codebuild.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codebuild.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codebuild.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a CodeBuild webhook, which is an endpoint accepted by the CodeBuild service to trigger builds from source code repositories. Depending on the source type of the CodeBuild project, the CodeBuild service may also automatically create and delete the actual repository webhook as well. */
  def Webhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codebuild.WebhookArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codebuild.WebhookArgs.builder
    
    com.pulumi.aws.codebuild.Webhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codebuild.FleetArgs.Builder)
    /**
     * @param computeConfiguration The compute configuration of the compute fleet. This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` or `CUSTOM_INSTANCE_TYPE`. See `computeConfiguration` below.
     * @return builder
     */
    def computeConfiguration(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetComputeConfigurationArgs.Builder]):
        com.pulumi.aws.codebuild.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.FleetComputeConfigurationArgs.builder
      builder.computeConfiguration(args(argsBuilder).build)

    /**
     * @param scalingConfiguration Configuration block. This option is only valid when your overflow behavior is `QUEUE`. See `scalingConfiguration` below.
     * @return builder
     */
    def scalingConfiguration(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationArgs.Builder]):
        com.pulumi.aws.codebuild.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationArgs.builder
      builder.scalingConfiguration(args(argsBuilder).build)

    /**
     * @param vpcConfigs Configuration block. See `vpcConfig` below.
     * @return builder
     */
    def vpcConfigs(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetVpcConfigArgs.Builder]*):
        com.pulumi.aws.codebuild.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.FleetVpcConfigArgs.builder
      builder.vpcConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Provides a CodeBuild Source Credentials Resource.
   *  
   *  &gt; **NOTE:
   *  ** [Codebuild only allows a single credential per given server type in a given region](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.GitHubSourceCredentials.html).
   *  Therefore, when you define `aws.codebuild.SourceCredential`,
   *  `aws.codebuild.Project` resource defined in the same module will use it.
   */
  def SourceCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codebuild.SourceCredentialArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codebuild.SourceCredentialArgs.builder
    
    com.pulumi.aws.codebuild.SourceCredential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block. Detailed below.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectLogsConfigCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectLogsConfigCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param s3Logs Configuration block. Detailed below.
     * @return builder
     */
    def s3Logs(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectLogsConfigS3LogsArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectLogsConfigS3LogsArgs.builder
      builder.s3Logs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs.Builder)
    /**
     * @param filters A webhook filter for the group. See filter for details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookFilterGroupFilterArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookFilterGroupFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.Builder)
    /**
     * @param auth Information about the strategy CodeBuild should use when authenticating with the source code host.
     *  Detailed below.
     * @return builder
     */
    def auth(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceAuthArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceAuthArgs.builder
      builder.auth(args(argsBuilder).build)

    /**
     * @param buildStatusConfig Configuration block that contains information that defines how the build project
     *  reports the build status to the source provider. This option is only used when the source provider is GitHub, GitHub
     *  Enterprise, GitLab, GitLab Self Managed, or Bitbucket. `buildStatusConfig` blocks are documented below.
     * @return builder
     */
    def buildStatusConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceBuildStatusConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceBuildStatusConfigArgs.builder
      builder.buildStatusConfig(args(argsBuilder).build)

    /**
     * @param gitSubmodulesConfig Configuration block. Detailed below.
     * @return builder
     */
    def gitSubmodulesConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceGitSubmodulesConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceGitSubmodulesConfigArgs.builder
      builder.gitSubmodulesConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.Builder)
    /**
     * @param auth Information about the strategy CodeBuild should use when authenticating with the source code host.
     *  Detailed below.
     * @return builder
     */
    def auth(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSourceAuthArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSourceAuthArgs.builder
      builder.auth(args(argsBuilder).build)

    /**
     * @param buildStatusConfig Configuration block that contains information that defines how the build project
     *  reports the build status to the source provider. This option is only used when the source provider is GitHub, GitHub
     *  Enterprise, GitLab, GitLab Self Managed, or Bitbucket. `buildStatusConfig` blocks are documented below.
     * @return builder
     */
    def buildStatusConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSourceBuildStatusConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSourceBuildStatusConfigArgs.builder
      builder.buildStatusConfig(args(argsBuilder).build)

    /**
     * @param gitSubmodulesConfig Configuration block. Detailed below.
     * @return builder
     */
    def gitSubmodulesConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSourceGitSubmodulesConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSourceGitSubmodulesConfigArgs.builder
      builder.gitSubmodulesConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationArgs.Builder)
    /**
     * @param targetTrackingScalingConfigs Configuration block. Detailed below.
     * @return builder
     */
    def targetTrackingScalingConfigs(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationTargetTrackingScalingConfigArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationTargetTrackingScalingConfigArgs.builder
      builder.targetTrackingScalingConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder)
    /**
     * @param dockerServer Configuration block. Detailed below.
     * @return builder
     */
    def dockerServer(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectEnvironmentDockerServerArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectEnvironmentDockerServerArgs.builder
      builder.dockerServer(args(argsBuilder).build)

    /**
     * @param environmentVariables Configuration block. Detailed below.
     * @return builder
     */
    def environmentVariables(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectEnvironmentEnvironmentVariableArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectEnvironmentEnvironmentVariableArgs.builder
      builder.environmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param fleet Configuration block. Detailed below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectEnvironmentFleetArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectEnvironmentFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param registryCredential Configuration block. Detailed below.
     * @return builder
     */
    def registryCredential(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectEnvironmentRegistryCredentialArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectEnvironmentRegistryCredentialArgs.builder
      builder.registryCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.ReportGroupState.Builder)
    /**
     * @param exportConfig Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
     * @return builder
     */
    def exportConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ReportGroupState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs.builder
      builder.exportConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.ProjectState.Builder)
    /**
     * @param artifacts Configuration block. Detailed below.
     * @return builder
     */
    def artifacts(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectArtifactsArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectArtifactsArgs.builder
      builder.artifacts(args(argsBuilder).build)

    /**
     * @param buildBatchConfig Defines the batch build options for the project.
     * @return builder
     */
    def buildBatchConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs.builder
      builder.buildBatchConfig(args(argsBuilder).build)

    /**
     * @param cache Configuration block. Detailed below.
     * @return builder
     */
    def cache(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectCacheArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectCacheArgs.builder
      builder.cache(args(argsBuilder).build)

    /**
     * @param environment Configuration block. Detailed below.
     * @return builder
     */
    def environment(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs.builder
      builder.environment(args(argsBuilder).build)

    /**
     * @param fileSystemLocations A set of file system locations to mount inside the build. File system locations
     *  are documented below.
     * @return builder
     */
    def fileSystemLocations(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationArgs.builder
      builder.fileSystemLocations(args.map(_(argsBuilder).build)*)

    /**
     * @param logsConfig Configuration block. Detailed below.
     * @return builder
     */
    def logsConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs.builder
      builder.logsConfig(args(argsBuilder).build)

    /**
     * @param secondaryArtifacts Configuration block. Detailed below.
     * @return builder
     */
    def secondaryArtifacts(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactArgs.builder
      builder.secondaryArtifacts(args.map(_(argsBuilder).build)*)

    /**
     * @param secondarySourceVersions Configuration block. Detailed below.
     * @return builder
     */
    def secondarySourceVersions(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionArgs.builder
      builder.secondarySourceVersions(args.map(_(argsBuilder).build)*)

    /**
     * @param secondarySources Configuration block. Detailed below.
     * @return builder
     */
    def secondarySources(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs.builder
      builder.secondarySources(args.map(_(argsBuilder).build)*)

    /**
     * @param source Configuration block. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectSourceArgs.builder
      builder.source(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block. Detailed below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectVpcConfigArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs.Builder)
    /**
     * @param s3Destination contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigS3DestinationArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs.Builder)
    /**
     * @param restrictions Configuration block specifying the restrictions for the batch build. Detailed below.
     * @return builder
     */
    def restrictions(args: Endofunction[com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigRestrictionsArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.codebuild.inputs.FleetState.Builder)
    /**
     * @param computeConfiguration The compute configuration of the compute fleet. This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` or `CUSTOM_INSTANCE_TYPE`. See `computeConfiguration` below.
     * @return builder
     */
    def computeConfiguration(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetComputeConfigurationArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.FleetComputeConfigurationArgs.builder
      builder.computeConfiguration(args(argsBuilder).build)

    /**
     * @param scalingConfiguration Configuration block. This option is only valid when your overflow behavior is `QUEUE`. See `scalingConfiguration` below.
     * @return builder
     */
    def scalingConfiguration(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.FleetScalingConfigurationArgs.builder
      builder.scalingConfiguration(args(argsBuilder).build)

    /**
     * @param statuses Nested attribute containing information about the current status of the fleet.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetStatusArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.FleetStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcConfigs Configuration block. See `vpcConfig` below.
     * @return builder
     */
    def vpcConfigs(args: Endofunction[com.pulumi.aws.codebuild.inputs.FleetVpcConfigArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.FleetVpcConfigArgs.builder
      builder.vpcConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codebuild.inputs.WebhookState.Builder)
    /**
     * @param filterGroups Information about the webhook&#39;s trigger. See filterGroup for details.
     * @return builder
     */
    def filterGroups(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs.Builder]*):
        com.pulumi.aws.codebuild.inputs.WebhookState.Builder =
      def argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs.builder
      builder.filterGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param pullRequestBuildPolicy Defines comment-based approval requirements for triggering builds on pull requests. See pullRequestBuildPolicy for details.
     * @return builder
     */
    def pullRequestBuildPolicy(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookPullRequestBuildPolicyArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.WebhookState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookPullRequestBuildPolicyArgs.builder
      builder.pullRequestBuildPolicy(args(argsBuilder).build)

    /**
     * @param scopeConfiguration Scope configuration for global or organization webhooks. See scopeConfiguration for details.
     * @return builder
     */
    def scopeConfiguration(args: Endofunction[com.pulumi.aws.codebuild.inputs.WebhookScopeConfigurationArgs.Builder]):
        com.pulumi.aws.codebuild.inputs.WebhookState.Builder =
      val argsBuilder = com.pulumi.aws.codebuild.inputs.WebhookScopeConfigurationArgs.builder
      builder.scopeConfiguration(args(argsBuilder).build)
