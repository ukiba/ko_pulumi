package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataform:
  extension (builder: com.pulumi.gcp.dataform.RepositoryArgs.Builder)
    /**
     * @param gitRemoteSettings Optional. If set, configures this repository to be linked to a Git remote.
     *  Structure is documented below.
     * @return builder
     */
    def gitRemoteSettings(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.builder
      builder.gitRemoteSettings(args(argsBuilder).build)

    /**
     * @param workspaceCompilationOverrides If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceCompilationOverrides(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.builder
      builder.workspaceCompilationOverrides(args(argsBuilder).build)

  /**
   * A resource represents a Dataform release configuration
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about RepositoryReleaseConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories.releaseConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataform/docs/release-configurations)
   */
  def RepositoryReleaseConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataform.RepositoryReleaseConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A resource represents a Dataform TeamFolder
   * 
   *  To get more information about TeamFolder, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataform/reference/rest/v1/projects.locations.teamFolders)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def TeamFolder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.TeamFolderArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataform.TeamFolderArgs.builder
    com.pulumi.gcp.dataform.TeamFolder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def RepositoryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataform.RepositoryIamMemberArgs.builder
    com.pulumi.gcp.dataform.RepositoryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.Builder)
    /**
     * @param codeCompilationConfig Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
     *  Structure is documented below.
     * @return builder
     */
    def codeCompilationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.builder
      builder.codeCompilationConfig(args(argsBuilder).build)

  def RepositoryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataform.RepositoryIamPolicyArgs.builder
    com.pulumi.gcp.dataform.RepositoryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.Builder)
    /**
     * @param invocationConfig Optional. If left unset, a default InvocationConfig will be used.
     *  Structure is documented below.
     * @return builder
     */
    def invocationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.builder
      builder.invocationConfig(args(argsBuilder).build)

  def RepositoryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataform.RepositoryIamBindingArgs.builder
    com.pulumi.gcp.dataform.RepositoryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A resource represents a Dataform Git repository
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Repository, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataform.RepositoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataform.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A resource represents a Dataform workflow configuration
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about RepositoryWorkflowConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations.repositories.workflowConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataform/docs/workflow-configurations)
   */
  def RepositoryWorkflowConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataform.RepositoryWorkflowConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Config is a singleton resource used to configure the default Dataform settings for a specified location.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Config, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataform/reference/rest/v1beta1/projects.locations)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.ConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataform.ConfigArgs.builder
    com.pulumi.gcp.dataform.Config(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DataformFunctions = com.pulumi.gcp.dataform.DataformFunctions
  object DataformFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.dataform.DataformFunctions.*
  extension (self: DataformFunctions.type)
    /**
     * Retrieves the current IAM policy data for repository
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getRepositoryIamPolicy(args: Endofunction[com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataform.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyArgs.builder
      com.pulumi.gcp.dataform.DataformFunctions.getRepositoryIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for repository
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getRepositoryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataform.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.GetRepositoryIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataform.DataformFunctions.getRepositoryIamPolicyPlain(args(argsBuilder).build)

  /**
   * A resource represents a Dataform folder
   * 
   *  To get more information about Folder, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataform/reference/rest/v1/projects.locations.folders)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataform/docs/)
   */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataform.FolderArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataform.FolderArgs.builder
    com.pulumi.gcp.dataform.Folder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigState.Builder)
    /**
     * @param codeCompilationConfig Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
     *  Structure is documented below.
     * @return builder
     */
    def codeCompilationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.builder
      builder.codeCompilationConfig(args(argsBuilder).build)

    /**
     * @param recentScheduledReleaseRecords Records of the 10 most recent scheduled release attempts, ordered in in descending order of releaseTime. Updated whenever automatic creation of a compilation result is triggered by cronSchedule.
     *  Structure is documented below.
     * @return builder
     */
    def recentScheduledReleaseRecords(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.builder
      builder.recentScheduledReleaseRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.Builder)
    /**
     * @param errorStatuses (Output)
     *  The error status encountered upon this attempt to create the workflow invocation, if the attempt was unsuccessful.
     *  Structure is documented below.
     * @return builder
     */
    def errorStatuses(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatusArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatusArgs.builder
      builder.errorStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.Builder)
    /**
     * @param errorStatuses (Output)
     *  The error status encountered upon this attempt to create the compilation result, if the attempt was unsuccessful.
     *  Structure is documented below.
     * @return builder
     */
    def errorStatuses(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatusArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatusArgs.builder
      builder.errorStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder)
    /**
     * @param includedTargets Optional. The set of action identifiers to include.
     *  Structure is documented below.
     * @return builder
     */
    def includedTargets(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigIncludedTargetArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigIncludedTargetArgs.builder
      builder.includedTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder)
    /**
     * @param sshAuthenticationConfig Authentication fields for remote uris using SSH protocol.
     *  Structure is documented below.
     * @return builder
     */
    def sshAuthenticationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsSshAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsSshAuthenticationConfigArgs.builder
      builder.sshAuthenticationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryState.Builder)
    /**
     * @param gitRemoteSettings Optional. If set, configures this repository to be linked to a Git remote.
     *  Structure is documented below.
     * @return builder
     */
    def gitRemoteSettings(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.builder
      builder.gitRemoteSettings(args(argsBuilder).build)

    /**
     * @param workspaceCompilationOverrides If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     *  Structure is documented below.
     * @return builder
     */
    def workspaceCompilationOverrides(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.builder
      builder.workspaceCompilationOverrides(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigState.Builder)
    /**
     * @param invocationConfig Optional. If left unset, a default InvocationConfig will be used.
     *  Structure is documented below.
     * @return builder
     */
    def invocationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.builder
      builder.invocationConfig(args(argsBuilder).build)

    /**
     * @param recentScheduledExecutionRecords Records of the 10 most recent scheduled execution attempts, ordered in in descending order of executionTime. Updated whenever automatic creation of a workflow invocation is triggered by cronSchedule.
     *  Structure is documented below.
     * @return builder
     */
    def recentScheduledExecutionRecords(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.builder
      builder.recentScheduledExecutionRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
