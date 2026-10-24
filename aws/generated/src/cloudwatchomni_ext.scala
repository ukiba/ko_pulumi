package jp.ukiba.ko_pulumi
package aws

object cloudwatchomni_ext:
  extension (builder: com.pulumi.aws.cloudwatchomni.DomainArgs.Builder)
    /**
     * @param identityProviderConfiguration Identity provider configuration. Required when `identityProviders` includes `IDC`. See below.
     * @return builder
     */
    inline def identityProviderConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.builder
      builder.identityProviderConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption of the space&#39;s data at rest. Omit for AWS owned encryption. See below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder)
    /**
     * @param identityCenterConfiguration IAM Identity Center configuration. See below.
     * @return builder
     */
    inline def identityCenterConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationIdentityCenterConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationIdentityCenterConfigurationArgs.builder
      builder.identityCenterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.DomainState.Builder)
    /**
     * @param identityProviderConfiguration Identity provider configuration. Required when `identityProviders` includes `IDC`. See below.
     * @return builder
     */
    inline def identityProviderConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.builder
      builder.identityProviderConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.SpaceState.Builder)
    /**
     * @param encryptionConfiguration Encryption of the space&#39;s data at rest. Omit for AWS owned encryption. See below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)
