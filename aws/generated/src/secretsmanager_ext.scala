package jp.ukiba.ko_pulumi
package aws

object secretsmanager_ext:
  extension (builder: com.pulumi.aws.secretsmanager.SecretArgs.Builder)
    /**
     * @param replicas Configuration block to support secret replication. See details below.
     * @return builder
     */
    inline def replicas(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.Builder]*):
        com.pulumi.aws.secretsmanager.SecretArgs.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder)
    /**
     * @param externalSecretRotationMetadatas Configuration block for metadata required by the external secret partner. Required for managed external secrets. See details below.
     * @return builder
     */
    inline def externalSecretRotationMetadatas(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretRotationExternalSecretRotationMetadataArgs.Builder]*):
        com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretRotationExternalSecretRotationMetadataArgs.builder
      builder.externalSecretRotationMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param rotationRules Structure that defines the rotation configuration for this secret. Required unless `rotationEnabled` is `false`. Defined below.
     * @return builder
     */
    inline def rotationRules(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.Builder]):
        com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.builder
      builder.rotationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsFilterArgs.Builder]*):
        com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.GetSecretsPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsFilter.Builder]*):
        com.pulumi.aws.secretsmanager.inputs.GetSecretsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.SecretRotationState.Builder)
    /**
     * @param externalSecretRotationMetadatas Configuration block for metadata required by the external secret partner. Required for managed external secrets. See details below.
     * @return builder
     */
    inline def externalSecretRotationMetadatas(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretRotationExternalSecretRotationMetadataArgs.Builder]*):
        com.pulumi.aws.secretsmanager.inputs.SecretRotationState.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretRotationExternalSecretRotationMetadataArgs.builder
      builder.externalSecretRotationMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param rotationRules Structure that defines the rotation configuration for this secret. Required unless `rotationEnabled` is `false`. Defined below.
     * @return builder
     */
    inline def rotationRules(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.Builder]):
        com.pulumi.aws.secretsmanager.inputs.SecretRotationState.Builder =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.builder
      builder.rotationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.SecretState.Builder)
    /**
     * @param replicas Configuration block to support secret replication. See details below.
     * @return builder
     */
    inline def replicas(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.Builder]*):
        com.pulumi.aws.secretsmanager.inputs.SecretState.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)
