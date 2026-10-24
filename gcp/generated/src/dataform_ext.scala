package jp.ukiba.ko_pulumi
package gcp

object dataform_ext:
  extension (builder: com.pulumi.gcp.dataform.RepositoryArgs.Builder)
    /**
     * @param gitRemoteSettings Optional. If set, configures this repository to be linked to a Git remote.
     * Structure is documented below.
     * @return builder
     */
    inline def gitRemoteSettings(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.builder
      builder.gitRemoteSettings(args(argsBuilder).build)

    /**
     * @param workspaceCompilationOverrides If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     * Structure is documented below.
     * @return builder
     */
    inline def workspaceCompilationOverrides(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.builder
      builder.workspaceCompilationOverrides(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.Builder)
    /**
     * @param codeCompilationConfig Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
     * Structure is documented below.
     * @return builder
     */
    inline def codeCompilationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryReleaseConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.builder
      builder.codeCompilationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.Builder)
    /**
     * @param invocationConfig Optional. If left unset, a default InvocationConfig will be used.
     * Structure is documented below.
     * @return builder
     */
    inline def invocationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.RepositoryWorkflowConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.builder
      builder.invocationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder)
    /**
     * @param sshAuthenticationConfig Authentication fields for remote uris using SSH protocol.
     * Structure is documented below.
     * @return builder
     */
    inline def sshAuthenticationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsSshAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsSshAuthenticationConfigArgs.builder
      builder.sshAuthenticationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.Builder)
    /**
     * @param errorStatuses (Output)
     * The error status encountered upon this attempt to create the compilation result, if the attempt was unsuccessful.
     * Structure is documented below.
     * @return builder
     */
    inline def errorStatuses(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatusArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatusArgs.builder
      builder.errorStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigState.Builder)
    /**
     * @param codeCompilationConfig Optional. If set, fields of codeCompilationConfig override the default compilation settings that are specified in dataform.json.
     * Structure is documented below.
     * @return builder
     */
    inline def codeCompilationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigCodeCompilationConfigArgs.builder
      builder.codeCompilationConfig(args(argsBuilder).build)

    /**
     * @param recentScheduledReleaseRecords Records of the 10 most recent scheduled release attempts, ordered in in descending order of releaseTime. Updated whenever automatic creation of a compilation result is triggered by cronSchedule.
     * Structure is documented below.
     * @return builder
     */
    inline def recentScheduledReleaseRecords(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryReleaseConfigRecentScheduledReleaseRecordArgs.builder
      builder.recentScheduledReleaseRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryState.Builder)
    /**
     * @param gitRemoteSettings Optional. If set, configures this repository to be linked to a Git remote.
     * Structure is documented below.
     * @return builder
     */
    inline def gitRemoteSettings(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs.builder
      builder.gitRemoteSettings(args(argsBuilder).build)

    /**
     * @param workspaceCompilationOverrides If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     * Structure is documented below.
     * @return builder
     */
    inline def workspaceCompilationOverrides(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs.builder
      builder.workspaceCompilationOverrides(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder)
    /**
     * @param includedTargets Optional. The set of action identifiers to include.
     * Structure is documented below.
     * @return builder
     */
    inline def includedTargets(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigIncludedTargetArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigIncludedTargetArgs.builder
      builder.includedTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.Builder)
    /**
     * @param errorStatuses (Output)
     * The error status encountered upon this attempt to create the workflow invocation, if the attempt was unsuccessful.
     * Structure is documented below.
     * @return builder
     */
    inline def errorStatuses(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatusArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatusArgs.builder
      builder.errorStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigState.Builder)
    /**
     * @param invocationConfig Optional. If left unset, a default InvocationConfig will be used.
     * Structure is documented below.
     * @return builder
     */
    inline def invocationConfig(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.Builder]):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigInvocationConfigArgs.builder
      builder.invocationConfig(args(argsBuilder).build)

    /**
     * @param recentScheduledExecutionRecords Records of the 10 most recent scheduled execution attempts, ordered in in descending order of executionTime. Updated whenever automatic creation of a workflow invocation is triggered by cronSchedule.
     * Structure is documented below.
     * @return builder
     */
    inline def recentScheduledExecutionRecords(args: Endofunction[com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.Builder]*):
        com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.dataform.inputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordArgs.builder
      builder.recentScheduledExecutionRecords(args.map(_(argsBuilder).build)*)
