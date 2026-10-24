package jp.ukiba.ko_pulumi
package gcp

object cloudfunctionsv2_ext:
  extension (builder: com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder)
    /**
     * @param buildConfig Describes the Build step of the function that builds a container
     * from the given source.
     * Structure is documented below.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param eventTrigger An Eventarc trigger managed by Google Cloud Functions that fires events in
     * response to a condition in another service.
     * Structure is documented below.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param serviceConfig Describes the Service being deployed.
     * Structure is documented below.
     * @return builder
     */
    def serviceConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.builder
      builder.serviceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder)
    /**
     * @param automaticUpdatePolicy Security patches are applied automatically to the runtime without requiring
     * the function to be redeployed.
     * @return builder
     */
    def automaticUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigAutomaticUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigAutomaticUpdatePolicyArgs.builder
      builder.automaticUpdatePolicy(args(argsBuilder).build)

    /**
     * @param onDeployUpdatePolicy Security patches are only applied when a function is redeployed.
     * Structure is documented below.
     * @return builder
     */
    def onDeployUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigOnDeployUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigOnDeployUpdatePolicyArgs.builder
      builder.onDeployUpdatePolicy(args(argsBuilder).build)

    /**
     * @param source The location of the function source code.
     * Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder)
    /**
     * @param repoSource If provided, get the source from this location in a Cloud Source Repository.
     * Structure is documented below.
     * @return builder
     */
    def repoSource(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceRepoSourceArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceRepoSourceArgs.builder
      builder.repoSource(args(argsBuilder).build)

    /**
     * @param storageSource If provided, get the source from this location in Google Cloud Storage.
     * Structure is documented below.
     * @return builder
     */
    def storageSource(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceStorageSourceArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceStorageSourceArgs.builder
      builder.storageSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder)
    /**
     * @param eventFilters Criteria used to filter events.
     * Structure is documented below.
     * @return builder
     */
    def eventFilters(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerEventFilterArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerEventFilterArgs.builder
      builder.eventFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder)
    /**
     * @param directVpcNetworkInterfaces The Direct VPC network interface for the Cloud Function. Currently only a single Direct VPC is supported.
     * Structure is documented below.
     * @return builder
     */
    def directVpcNetworkInterfaces(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigDirectVpcNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigDirectVpcNetworkInterfaceArgs.builder
      builder.directVpcNetworkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param secretEnvironmentVariables Secret environment variables configuration.
     * Structure is documented below.
     * @return builder
     */
    def secretEnvironmentVariables(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretEnvironmentVariableArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretEnvironmentVariableArgs.builder
      builder.secretEnvironmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param secretVolumes Secret volumes configuration.
     * Structure is documented below.
     * @return builder
     */
    def secretVolumes(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.builder
      builder.secretVolumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.Builder)
    /**
     * @param versions List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
     * Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeVersionArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder)
    /**
     * @param buildConfig Describes the Build step of the function that builds a container
     * from the given source.
     * Structure is documented below.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param eventTrigger An Eventarc trigger managed by Google Cloud Functions that fires events in
     * response to a condition in another service.
     * Structure is documented below.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param serviceConfig Describes the Service being deployed.
     * Structure is documented below.
     * @return builder
     */
    def serviceConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.builder
      builder.serviceConfig(args(argsBuilder).build)
