package jp.ukiba.ko_pulumi
package aws

object cloudwatchomni_ext:
  extension (builder: com.pulumi.aws.cloudwatchomni.AccessGrantArgs.Builder)
    /**
     * @param principal Principal receiving the grant. See below. Changing this forces a new resource.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.AccessGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

    /**
     * @param scopedActions Group of actions to allow, with the resource scopes and conditions that limit them. Up to 20 blocks. Required for the `CUSTOM` permission, and can also be used with the other permissions. See below. Changing this forces a new resource.
     * @return builder
     */
    inline def scopedActions(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionArgs.Builder]*):
        com.pulumi.aws.cloudwatchomni.AccessGrantArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionArgs.builder
      builder.scopedActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatchomni.AccessProfileArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.AccessProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalArgs.Builder)
    /**
     * @param principalAttributes Attribute condition for attribute-based access. When set, the grant targets any principal matching all conditions. Supported only when `principalType` is `IDC_USER`. Up to 10 blocks. See below.
     * @return builder
     */
    inline def principalAttributes(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalPrincipalAttributeArgs.Builder]*):
        com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalPrincipalAttributeArgs.builder
      builder.principalAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionArgs.Builder)
    /**
     * @param resources Resource scope constraining these actions to specific resources. Up to 10 blocks. See below.
     * @return builder
     */
    inline def resources(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceArgs.Builder]*):
        com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceArgs.Builder)
    /**
     * @param rowScopeGroups Row-level filter group. A row is visible when it matches every `rowScope` in any one group. Up to 20 blocks. Must be specified together with `signalTypes`, on a `DataSet` resource scope. See below.
     * @return builder
     */
    inline def rowScopeGroups(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceRowScopeGroupArgs.Builder]*):
        com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceRowScopeGroupArgs.builder
      builder.rowScopeGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceRowScopeGroupArgs.Builder)
    /**
     * @param rowScopes Row filter. 1-20 blocks. See below.
     * @return builder
     */
    inline def rowScopes(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceRowScopeGroupRowScopeArgs.Builder]*):
        com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceRowScopeGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionResourceRowScopeGroupRowScopeArgs.builder
      builder.rowScopes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.AccessGrantState.Builder)
    /**
     * @param principal Principal receiving the grant. See below. Changing this forces a new resource.
     * @return builder
     */
    inline def principal(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.AccessGrantState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

    /**
     * @param scopedActions Group of actions to allow, with the resource scopes and conditions that limit them. Up to 20 blocks. Required for the `CUSTOM` permission, and can also be used with the other permissions. See below. Changing this forces a new resource.
     * @return builder
     */
    inline def scopedActions(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionArgs.Builder]*):
        com.pulumi.aws.cloudwatchomni.inputs.AccessGrantState.Builder =
      def argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessGrantScopedActionArgs.builder
      builder.scopedActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.AccessProfileState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.AccessProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.AccessProfileState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.AccessProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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
