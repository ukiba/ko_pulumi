package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object secretsmanager:
  /** Provides a resource to manage AWS Secrets Manager secret metadata. To manage secret rotation, see the `aws.secretsmanager.SecretRotation` resource. To manage a secret value, see the `aws.secretsmanager.SecretVersion` resource. */
  inline def Secret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.secretsmanager.SecretArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.secretsmanager.Secret(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage AWS Secrets Manager secret policy. */
  inline def SecretPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.secretsmanager.SecretPolicyArgs.builder
    com.pulumi.aws.secretsmanager.SecretPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage AWS Secrets Manager secret rotation. To manage a secret, see the `aws.secretsmanager.Secret` resource. To manage a secret value, see the `aws.secretsmanager.SecretVersion` resource. */
  inline def SecretRotation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretRotationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.secretsmanager.SecretRotationArgs.builder
    com.pulumi.aws.secretsmanager.SecretRotation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `aws.secretsmanager.Secret` resource.
   * 
   * &gt; **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
   * 
   * &gt; **NOTE:** This resource manages one specific version of a secret. If something else creates newer versions, such as rotation, another Pulumi program, or the console, this resource keeps tracking its own version even after that version is no longer `AWSCURRENT`. To read the current value of a secret, use the `aws.secretsmanager.SecretVersion` data source.
   * 
   * &gt; **NOTE:** When a secret&#39;s KMS key changes, Secrets Manager re-encrypts only the `AWSCURRENT`, `AWSPENDING`, and `AWSPREVIOUS` versions with the new key. Once the previous key is disabled or deleted, older versions can no longer be decrypted. If this resource&#39;s version is one of them, Pulumi keeps the value from state and shows a warning, but cannot import the version or move staging labels onto it. If the version is still `AWSCURRENT` or `AWSPENDING`, reading it fails. See [Change the encryption key for a secret](https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_update-encryption-key.html).
   */
  inline def SecretVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.SecretVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.secretsmanager.SecretVersionArgs.builder
    com.pulumi.aws.secretsmanager.SecretVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SecretsmanagerFunctions:
    /** Generate a random password. */
    inline def getRandomPassword(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetRandomPasswordResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getRandomPassword(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Generate a random password. */
    inline def getRandomPasswordPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetRandomPasswordResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetRandomPasswordPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getRandomPasswordPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    inline def getSecret(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecret(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    inline def getSecretPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    inline def getSecretRotation(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretRotationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretRotationResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretRotationArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretRotation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source. */
    inline def getSecretRotationPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretRotationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretRotationResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretRotationPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretRotationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. */
    inline def getSecretVersion(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. */
    inline def getSecretVersionPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieve the versions of a Secrets Manager secret. To retrieve secret metadata, see the data sources `aws.secretsmanager.Secret` and `aws.secretsmanager.SecretVersion`. */
    inline def getSecretVersions(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieve the versions of a Secrets Manager secret. To retrieve secret metadata, see the data sources `aws.secretsmanager.Secret` and `aws.secretsmanager.SecretVersion`. */
    inline def getSecretVersionsPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretVersionsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretVersionsPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get the ARNs and names of Secrets Manager secrets matching the specified criteria. */
    inline def getSecrets(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.secretsmanager.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecrets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get the ARNs and names of Secrets Manager secrets matching the specified criteria. */
    inline def getSecretsPlain(args: Endofunction[com.pulumi.aws.secretsmanager.inputs.GetSecretsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.secretsmanager.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.secretsmanager.inputs.GetSecretsPlainArgs.builder
      com.pulumi.aws.secretsmanager.SecretsmanagerFunctions.getSecretsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages an individual AWS Secrets Manager secret tag. This resource should only be used in cases where AWS Secrets Manager secrets are created outside Terraform (e.g., [AWS Secrets Manager secrets managed by other AWS services](https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html), such as RDS).
   * 
   * &gt; **NOTE:** This tagging resource should not be combined with the Terraform resource for managing the parent resource. For example, using `aws.secretsmanager.Secret` and `aws.secretsmanager.Tag` to manage tags of the same AWS Secrets Manager secret will cause a perpetual difference where the `aws.secretsmanager.Secret` resource will try to remove the tag being added by the `aws.secretsmanager.Tag` resource. However, if the parent resource is created in the same configuration (i.e., if you have no other choice), you should add `ignoreChanges = [tags]` in the parent resource&#39;s lifecycle block. This ensures that Terraform ignores differences in tags managed via the separate tagging resource, avoiding the perpetual difference mentioned above.
   * 
   * &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  inline def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.secretsmanager.TagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.secretsmanager.TagArgs.builder
    com.pulumi.aws.secretsmanager.Tag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
