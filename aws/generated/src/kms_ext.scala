package jp.ukiba.ko_pulumi
package aws

object kms_ext:
  extension (builder: com.pulumi.aws.kms.CustomKeyStoreArgs.Builder)
    /**
     * @param xksProxyAuthenticationCredential Authentication credential for the external key store proxy (XKS proxy). Applies when `customKeyStoreType` is `EXTERNAL_KEY_STORE`. See `xksProxyAuthenticationCredential` block below.
     * @return builder
     */
    inline def xksProxyAuthenticationCredential(args: Endofunction[com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.Builder]):
        com.pulumi.aws.kms.CustomKeyStoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.builder
      builder.xksProxyAuthenticationCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kms.GrantArgs.Builder)
    /**
     * @param constraints Structure that you can use to allow certain operations in the grant only when the desired encryption context is present. See `constraints` Block for details. For more information about encryption context, see [Encryption Context](https://docs.aws.amazon.com/kms/latest/developerguide/encrypt_context.html).
     * @return builder
     */
    inline def constraints(args: Endofunction[com.pulumi.aws.kms.inputs.GrantConstraintArgs.Builder]*):
        com.pulumi.aws.kms.GrantArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GrantConstraintArgs.builder
      builder.constraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.CustomKeyStoreState.Builder)
    /**
     * @param xksProxyAuthenticationCredential Authentication credential for the external key store proxy (XKS proxy). Applies when `customKeyStoreType` is `EXTERNAL_KEY_STORE`. See `xksProxyAuthenticationCredential` block below.
     * @return builder
     */
    inline def xksProxyAuthenticationCredential(args: Endofunction[com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.Builder]):
        com.pulumi.aws.kms.inputs.CustomKeyStoreState.Builder =
      val argsBuilder = com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.builder
      builder.xksProxyAuthenticationCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kms.inputs.GetSecretArgs.Builder)
    inline def secrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretSecretArgs.Builder]*):
        com.pulumi.aws.kms.inputs.GetSecretArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GetSecretSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.GetSecretPlainArgs.Builder)
    inline def secrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretSecret.Builder]*):
        com.pulumi.aws.kms.inputs.GetSecretPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GetSecretSecret.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.GetSecretsArgs.Builder)
    /**
     * @param secrets One or more encrypted payload definitions from the KMS service. See `secret` below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsSecretArgs.Builder]*):
        com.pulumi.aws.kms.inputs.GetSecretsArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.GetSecretsPlainArgs.Builder)
    /**
     * @param secrets One or more encrypted payload definitions from the KMS service. See `secret` below.
     * @return builder
     */
    inline def secrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsSecret.Builder]*):
        com.pulumi.aws.kms.inputs.GetSecretsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsSecret.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.GrantState.Builder)
    /**
     * @param constraints Structure that you can use to allow certain operations in the grant only when the desired encryption context is present. See `constraints` Block for details. For more information about encryption context, see [Encryption Context](https://docs.aws.amazon.com/kms/latest/developerguide/encrypt_context.html).
     * @return builder
     */
    inline def constraints(args: Endofunction[com.pulumi.aws.kms.inputs.GrantConstraintArgs.Builder]*):
        com.pulumi.aws.kms.inputs.GrantState.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GrantConstraintArgs.builder
      builder.constraints(args.map(_(argsBuilder).build)*)
