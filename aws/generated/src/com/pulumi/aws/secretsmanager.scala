package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object secretsmanager:
  /** Provides a resource to manage AWS Secrets Manager secret metadata. To manage secret rotation, see the `aws.secretsmanager.SecretRotation` resource. To manage a secret value, see the `aws.secretsmanager.SecretVersion` resource. */
  def Secret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.secretsmanager.SecretArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.secretsmanager.Secret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SecretsmanagerFunctions = com.pulumi.aws.secretsmanager.SecretsmanagerFunctions
  object SecretsmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.*
  extension (self: SecretsmanagerFunctions.type)
    /** Generate a random password. */
    def getRandomPassword(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetRandomPasswordResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getRandomPassword(args(argsBuilder).build)

    /** Generate a random password. */
    def getRandomPasswordPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetRandomPasswordResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getRandomPasswordPlain(args(argsBuilder).build)

    /** Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    def getSecret(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecret(args(argsBuilder).build)

    /** Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    def getSecretPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretPlain(args(argsBuilder).build)

    /** Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    def getSecretRotation(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretRotationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretRotationResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretRotationArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretRotation(args(argsBuilder).build)

    /** Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    def getSecretRotationPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretRotationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretRotationResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretRotationPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretRotationPlain(args(argsBuilder).build)

    /** Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. */
    def getSecretVersion(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersion(args(argsBuilder).build)

    /** Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. */
    def getSecretVersionPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersionPlain(args(argsBuilder).build)

    def getSecretVersions(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersions(args(argsBuilder).build)

    def getSecretVersionsPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersionsPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Secrets Manager secrets matching the specified criteria. */
    def getSecrets(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecrets(args(argsBuilder).build)

    /** Use this data source to get the ARNs and names of Secrets Manager secrets matching the specified criteria. */
    def getSecretsPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder)
    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret. Defined below.
     * @return builder
     */
    def rotationRules(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.Builder]):
        com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.builder
      builder.rotationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.secretsmanager.SecretArgs.Builder)
    /**
     * @param replicas Configuration block to support secret replication. See details below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.Builder]*):
        com.pulumi.aws.secretsmanager.SecretArgs.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  /** Provides a resource to manage AWS Secrets Manager secret policy. */
  def SecretPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.secretsmanager.SecretPolicyArgs.builder
    
    com.pulumi.aws.secretsmanager.SecretPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage AWS Secrets Manager secret rotation. To manage a secret, see the `aws.secretsmanager.Secret` resource. To manage a secret value, see the `aws.secretsmanager.SecretVersion` resource. */
  def SecretRotation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.secretsmanager.SecretRotationArgs.builder
    
    com.pulumi.aws.secretsmanager.SecretRotation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `aws.secretsmanager.Secret` resource.
   *  
   *  &gt; **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
   */
  def SecretVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.secretsmanager.SecretVersionArgs.builder
    
    com.pulumi.aws.secretsmanager.SecretVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.SecretState.Builder)
    /**
     * @param replicas Configuration block to support secret replication. See details below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.Builder]*):
        com.pulumi.aws.secretsmanager.inputs.SecretState.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsFilterArgs.Builder]*):
        com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.Builder =
      def argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.secretsmanager.inputs.SecretRotationState.Builder)
    /**
     * @param rotationRules A structure that defines the rotation configuration for this secret. Defined below.
     * @return builder
     */
    def rotationRules(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.Builder]):
        com.pulumi.aws.secretsmanager.inputs.SecretRotationState.Builder =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.SecretRotationRotationRulesArgs.builder
      builder.rotationRules(args(argsBuilder).build)
