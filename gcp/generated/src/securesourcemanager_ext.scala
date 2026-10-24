package jp.ukiba.ko_pulumi
package gcp

object securesourcemanager_ext:
  extension (builder: com.pulumi.gcp.securesourcemanager.HookArgs.Builder)
    /**
     * @param pushOption The trigger option for push events.
     * Structure is documented below.
     * @return builder
     */
    inline def pushOption(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.HookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.builder
      builder.pushOption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder)
    /**
     * @param privateConfig Private settings for private instance.
     * Structure is documented below.
     * @return builder
     */
    inline def privateConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.builder
      builder.privateConfig(args(argsBuilder).build)

    /**
     * @param workforceIdentityFederationConfig Configuration for Workforce Identity Federation to support third party identity provider.
     * If unset, defaults to the Google OIDC IdP.
     * Structure is documented below.
     * @return builder
     */
    inline def workforceIdentityFederationConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.builder
      builder.workforceIdentityFederationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.InstanceIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.InstanceIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.RepositoryArgs.Builder)
    /**
     * @param initialConfig Initial configurations for the repository.
     * Structure is documented below.
     * @return builder
     */
    inline def initialConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.builder
      builder.initialConfig(args(argsBuilder).build)

    /**
     * @param scanConfig Provides configuration for scanning.
     * Structure is documented below.
     * @return builder
     */
    inline def scanConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigArgs.builder
      builder.scanConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.HookState.Builder)
    /**
     * @param pushOption The trigger option for push events.
     * Structure is documented below.
     * @return builder
     */
    inline def pushOption(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.HookState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.builder
      builder.pushOption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder)
    /**
     * @param customHostConfig Custom host configuration for the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def customHostConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigCustomHostConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigCustomHostConfigArgs.builder
      builder.customHostConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder)
    /**
     * @param hostConfigs A list of hostnames for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def hostConfigs(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceHostConfigArgs.Builder]*):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceHostConfigArgs.builder
      builder.hostConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param privateConfig Private settings for private instance.
     * Structure is documented below.
     * @return builder
     */
    inline def privateConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.builder
      builder.privateConfig(args(argsBuilder).build)

    /**
     * @param workforceIdentityFederationConfig Configuration for Workforce Identity Federation to support third party identity provider.
     * If unset, defaults to the Google OIDC IdP.
     * Structure is documented below.
     * @return builder
     */
    inline def workforceIdentityFederationConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.builder
      builder.workforceIdentityFederationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigArgs.Builder)
    /**
     * @param secretScanConfig Configuration for secret scanning.
     * Structure is documented below.
     * @return builder
     */
    inline def secretScanConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigSecretScanConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigSecretScanConfigArgs.builder
      builder.secretScanConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder)
    /**
     * @param initialConfig Initial configurations for the repository.
     * Structure is documented below.
     * @return builder
     */
    inline def initialConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.builder
      builder.initialConfig(args(argsBuilder).build)

    /**
     * @param scanConfig Provides configuration for scanning.
     * Structure is documented below.
     * @return builder
     */
    inline def scanConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryScanConfigArgs.builder
      builder.scanConfig(args(argsBuilder).build)

    /**
     * @param uris URIs for the repository.
     * Structure is documented below.
     * @return builder
     */
    inline def uris(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryUriArgs.Builder]*):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryUriArgs.builder
      builder.uris(args.map(_(argsBuilder).build)*)
