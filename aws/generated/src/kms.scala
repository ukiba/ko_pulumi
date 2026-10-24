package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object kms:
  /**
   * Provides an alias for a KMS customer master key. AWS Console enforces 1-to-1 mapping between aliases &amp; keys,
   * but API (hence this provider too) allows you to create as many aliases as
   * the [account limits](http://docs.aws.amazon.com/kms/latest/developerguide/limits.html) allow you.
   */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.AliasArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.AliasArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.kms.Alias(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The KMS ciphertext resource allows you to encrypt plaintext into ciphertext
   * by using an AWS KMS customer master key. The value returned by this resource
   * is stable across every apply. For a changing ciphertext value each apply, see
   * the `aws.kms.Ciphertext` data source.
   */
  def Ciphertext(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.CiphertextArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kms.CiphertextArgs.builder
    com.pulumi.aws.kms.Ciphertext(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS KMS (Key Management) Custom Key Store. */
  def CustomKeyStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.CustomKeyStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kms.CustomKeyStoreArgs.builder
    com.pulumi.aws.kms.CustomKeyStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a single-Region or multi-Region primary KMS key that uses external key material.
   * To instead manage a single-Region or multi-Region primary KMS key where AWS automatically generates and potentially rotates key material, see the `aws.kms.Key` resource.
   */
  def ExternalKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.ExternalKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.ExternalKeyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.kms.ExternalKey(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource-based access control mechanism for a KMS customer master key.
   * 
   * &gt; **Note:** All arguments including the grant token will be stored in the raw state as plain-text.
   * ## Import
   * 
   * Using `pulumi import`, import KMS Grants using the Key ID and Grant ID separated by a colon (`:`). For example:
   * 
   * ```sh
   * \$ pulumi import aws:kms/grant:Grant test 1234abcd-12ab-34cd-56ef-1234567890ab:abcde1237f76e4ba7987489ac329fbfba6ad343d6f7075dbd1ef191f0120514
   * ```
   */
  def Grant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.GrantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.GrantArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.kms.Grant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a single-Region or multi-Region primary KMS key.
   * 
   * &gt; **NOTE on KMS Key Policy:** KMS Key Policy can be configured in either the standalone resource `aws.kms.KeyPolicy`
   * or with the parameter `policy` in this resource.
   * Configuring with both will cause inconsistencies and may overwrite configuration.
   */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.KeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.KeyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.kms.Key(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Attaches a policy to a KMS Key. */
  def KeyPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.KeyPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.kms.KeyPolicyArgs.builder
    com.pulumi.aws.kms.KeyPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object KmsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the ARN of a KMS key alias.
     * By using this data source, you can reference key alias
     * without having to hard code the ARN as input.
     */
    inline def getAlias(args: Endofunction[com.pulumi.aws.kms.inputs.GetAliasArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetAliasArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getAlias(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the ARN of a KMS key alias.
     * By using this data source, you can reference key alias
     * without having to hard code the ARN as input.
     */
    inline def getAliasPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetAliasPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetAliasPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getAliasPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     * by using an AWS KMS customer master key. The value returned by this data source
     * changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     * resource.
     */
    inline def getCipherText(args: Endofunction[com.pulumi.aws.kms.inputs.GetCipherTextArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetCipherTextResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCipherTextArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCipherText(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     * by using an AWS KMS customer master key. The value returned by this data source
     * changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     * resource.
     */
    inline def getCipherTextPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetCipherTextPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetCipherTextResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCipherTextPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCipherTextPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get the metadata KMS custom key store.
     * By using this data source, you can reference KMS custom key store
     * without having to hard code the ID as input.
     */
    inline def getCustomKeyStore(args: Endofunction[com.pulumi.aws.kms.inputs.GetCustomKeyStoreArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetCustomKeyStoreResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCustomKeyStoreArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCustomKeyStore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the metadata KMS custom key store.
     * By using this data source, you can reference KMS custom key store
     * without having to hard code the ID as input.
     */
    inline def getCustomKeyStorePlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetCustomKeyStorePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetCustomKeyStoreResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCustomKeyStorePlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCustomKeyStorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get detailed information about
     * the specified KMS Key with flexible key ID input.
     * This can be useful to reference key alias
     * without having to hard code the ARN as input.
     */
    inline def getKey(args: Endofunction[com.pulumi.aws.kms.inputs.GetKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetKeyArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get detailed information about
     * the specified KMS Key with flexible key ID input.
     * This can be useful to reference key alias
     * without having to hard code the ARN as input.
     */
    inline def getKeyPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetKeyPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get the public key about the specified KMS Key with flexible key ID input. This can be useful to reference key alias without having to hard code the ARN as input. */
    inline def getPublicKey(args: Endofunction[com.pulumi.aws.kms.inputs.GetPublicKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetPublicKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetPublicKeyArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getPublicKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get the public key about the specified KMS Key with flexible key ID input. This can be useful to reference key alias without having to hard code the ARN as input. */
    inline def getPublicKeyPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetPublicKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetPublicKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetPublicKeyPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getPublicKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** &gt; **WARNING:** This data source&#39;s functionality was removed in version 2.0.0 of the AWS Provider. You can migrate existing configurations to the `aws.kms.getSecrets` data source following instructions available in the Version 2 Upgrade Guide. This data source will be removed in a future version. */
    inline def getSecret(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecret(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** &gt; **WARNING:** This data source&#39;s functionality was removed in version 2.0.0 of the AWS Provider. You can migrate existing configurations to the `aws.kms.getSecrets` data source following instructions available in the Version 2 Upgrade Guide. This data source will be removed in a future version. */
    inline def getSecretPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecretPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Decrypt multiple secrets from data encrypted with the AWS KMS service. */
    inline def getSecrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecrets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Decrypt multiple secrets from data encrypted with the AWS KMS service. */
    inline def getSecretsPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecretsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages a KMS multi-Region replica key that uses external key material.
   * See the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html) for more information on importing key material into multi-Region keys.
   */
  def ReplicaExternalKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.ReplicaExternalKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.ReplicaExternalKeyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.kms.ReplicaExternalKey(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a KMS multi-Region replica key. */
  def ReplicaKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.ReplicaKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.ReplicaKeyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.kms.ReplicaKey(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
