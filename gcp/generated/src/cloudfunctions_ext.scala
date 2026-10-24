package jp.ukiba.ko_pulumi
package gcp

object cloudfunctions_ext:
  extension (builder: com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder)
    /**
     * @param automaticUpdatePolicy Security patches are applied automatically to the runtime without requiring the function to be redeployed. This should be specified as an empty block and cannot be set alongside `onDeployUpdatePolicy`.
     * @return builder
     */
    def automaticUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.builder
      builder.automaticUpdatePolicy(args(argsBuilder).build)

    /**
     * @param eventTrigger A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `triggerHttp`.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param onDeployUpdatePolicy Security patches are only applied when a function is redeployed. This should be specified as an empty block and cannot be set alongside `automaticUpdatePolicy`. Structure is documented below.
     * @return builder
     */
    def onDeployUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.builder
      builder.onDeployUpdatePolicy(args(argsBuilder).build)

    /**
     * @param secretEnvironmentVariables Secret environment variables configuration. Structure is documented below.
     * @return builder
     */
    def secretEnvironmentVariables(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.builder
      builder.secretEnvironmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param secretVolumes Secret volumes configuration. Structure is documented below.
     * @return builder
     */
    def secretVolumes(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.builder
      builder.secretVolumes(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceRepository Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `sourceArchiveBucket` or `sourceArchiveObject`. Structure is documented below. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`.*
     * @return builder
     */
    def sourceRepository(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.builder
      builder.sourceRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder)
    /**
     * @param failurePolicy Specifies policy for failed executions. Structure is documented below.
     * @return builder
     */
    def failurePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerFailurePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerFailurePolicyArgs.builder
      builder.failurePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder)
    /**
     * @param versions List of secret versions to mount for this secret. If empty, the &#34;latest&#34; version of the secret will be made available in a file named after the secret under the mount point. Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeVersionArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder)
    /**
     * @param automaticUpdatePolicy Security patches are applied automatically to the runtime without requiring the function to be redeployed. This should be specified as an empty block and cannot be set alongside `onDeployUpdatePolicy`.
     * @return builder
     */
    def automaticUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.builder
      builder.automaticUpdatePolicy(args(argsBuilder).build)

    /**
     * @param eventTrigger A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `triggerHttp`.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param onDeployUpdatePolicy Security patches are only applied when a function is redeployed. This should be specified as an empty block and cannot be set alongside `automaticUpdatePolicy`. Structure is documented below.
     * @return builder
     */
    def onDeployUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.builder
      builder.onDeployUpdatePolicy(args(argsBuilder).build)

    /**
     * @param secretEnvironmentVariables Secret environment variables configuration. Structure is documented below.
     * @return builder
     */
    def secretEnvironmentVariables(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.builder
      builder.secretEnvironmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param secretVolumes Secret volumes configuration. Structure is documented below.
     * @return builder
     */
    def secretVolumes(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.builder
      builder.secretVolumes(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceRepository Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `sourceArchiveBucket` or `sourceArchiveObject`. Structure is documented below. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`.*
     * @return builder
     */
    def sourceRepository(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.builder
      builder.sourceRepository(args(argsBuilder).build)
