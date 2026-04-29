package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object kms:
  /** Attaches a policy to a KMS Key. */
  def KeyPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.KeyPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.kms.KeyPolicyArgs.builder
    
    com.pulumi.aws.kms.KeyPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kms.CustomKeyStoreArgs.Builder)
    def xksProxyAuthenticationCredential(args: Endofunction[com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.Builder]):
        com.pulumi.aws.kms.CustomKeyStoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.builder
      builder.xksProxyAuthenticationCredential(args(argsBuilder).build)

  /**
   * The KMS ciphertext resource allows you to encrypt plaintext into ciphertext
   *  by using an AWS KMS customer master key. The value returned by this resource
   *  is stable across every apply. For a changing ciphertext value each apply, see
   *  the `aws.kms.Ciphertext` data source.
   */
  def Ciphertext(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.CiphertextArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.kms.CiphertextArgs.builder
    
    com.pulumi.aws.kms.Ciphertext(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an alias for a KMS customer master key. AWS Console enforces 1-to-1 mapping between aliases &amp; keys,
   *  but API (hence this provider too) allows you to create as many aliases as
   *  the [account limits](http://docs.aws.amazon.com/kms/latest/developerguide/limits.html) allow you.
   */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.AliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.AliasArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.kms.Alias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a KMS multi-Region replica key. */
  def ReplicaKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.ReplicaKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.ReplicaKeyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kms.ReplicaKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource-based access control mechanism for a KMS customer master key.
   *  
   *  &gt; **Note:** All arguments including the grant token will be stored in the raw state as plain-text.
   *  ## Import
   *  
   *  Using `pulumi import`, import KMS Grants using the Key ID and Grant ID separated by a colon (`:`). For example:
   *  
   *  ```sh
   *  $ pulumi import aws:kms/grant:Grant test 1234abcd-12ab-34cd-56ef-1234567890ab:abcde1237f76e4ba7987489ac329fbfba6ad343d6f7075dbd1ef191f0120514
   *  ```
   */
  def Grant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.GrantArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.GrantArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.kms.Grant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type KmsFunctions = com.pulumi.aws.kms.KmsFunctions
  object KmsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.kms.KmsFunctions.*
  extension (self: KmsFunctions.type)
    /**
     * Use this data source to get the ARN of a KMS key alias.
     *  By using this data source, you can reference key alias
     *  without having to hard code the ARN as input.
     */
    def getAlias(args: Endofunction[com.pulumi.aws.kms.inputs.GetAliasArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetAliasArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getAlias(args(argsBuilder).build)

    /**
     * Use this data source to get the ARN of a KMS key alias.
     *  By using this data source, you can reference key alias
     *  without having to hard code the ARN as input.
     */
    def getAliasPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetAliasPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetAliasResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetAliasPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getAliasPlain(args(argsBuilder).build)

    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     *  by using an AWS KMS customer master key. The value returned by this data source
     *  changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     *  resource.
     */
    def getCipherText(args: Endofunction[com.pulumi.aws.kms.inputs.GetCipherTextArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetCipherTextResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCipherTextArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCipherText(args(argsBuilder).build)

    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     *  by using an AWS KMS customer master key. The value returned by this data source
     *  changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     *  resource.
     */
    def getCipherTextPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetCipherTextPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetCipherTextResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCipherTextPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCipherTextPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the metadata KMS custom key store.
     *  By using this data source, you can reference KMS custom key store
     *  without having to hard code the ID as input.
     */
    def getCustomKeyStore(args: Endofunction[com.pulumi.aws.kms.inputs.GetCustomKeyStoreArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetCustomKeyStoreResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCustomKeyStoreArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCustomKeyStore(args(argsBuilder).build)

    /**
     * Use this data source to get the metadata KMS custom key store.
     *  By using this data source, you can reference KMS custom key store
     *  without having to hard code the ID as input.
     */
    def getCustomKeyStorePlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetCustomKeyStorePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetCustomKeyStoreResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetCustomKeyStorePlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getCustomKeyStorePlain(args(argsBuilder).build)

    /**
     * Use this data source to get detailed information about
     *  the specified KMS Key with flexible key id input.
     *  This can be useful to reference key alias
     *  without having to hard code the ARN as input.
     */
    def getKey(args: Endofunction[com.pulumi.aws.kms.inputs.GetKeyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetKeyArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getKey(args(argsBuilder).build)

    /**
     * Use this data source to get detailed information about
     *  the specified KMS Key with flexible key id input.
     *  This can be useful to reference key alias
     *  without having to hard code the ARN as input.
     */
    def getKeyPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetKeyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetKeyPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getKeyPlain(args(argsBuilder).build)

    /** Use this data source to get the public key about the specified KMS Key with flexible key id input. This can be useful to reference key alias without having to hard code the ARN as input. */
    def getPublicKey(args: Endofunction[com.pulumi.aws.kms.inputs.GetPublicKeyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetPublicKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetPublicKeyArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getPublicKey(args(argsBuilder).build)

    /** Use this data source to get the public key about the specified KMS Key with flexible key id input. This can be useful to reference key alias without having to hard code the ARN as input. */
    def getPublicKeyPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetPublicKeyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetPublicKeyResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetPublicKeyPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getPublicKeyPlain(args(argsBuilder).build)

    /** !&gt; **WARNING:** This data source&#39;s functionality was removed in version 2.0.0 of the AWS Provider. You can migrate existing configurations to the `aws.kms.getSecrets` data source following instructions available in the Version 2 Upgrade Guide. This data source will be removed in a future version. */
    def getSecret(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecret(args(argsBuilder).build)

    /** !&gt; **WARNING:** This data source&#39;s functionality was removed in version 2.0.0 of the AWS Provider. You can migrate existing configurations to the `aws.kms.getSecrets` data source following instructions available in the Version 2 Upgrade Guide. This data source will be removed in a future version. */
    def getSecretPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecretPlain(args(argsBuilder).build)

    /** Decrypt multiple secrets from data encrypted with the AWS KMS service. */
    def getSecrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kms.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecrets(args(argsBuilder).build)

    /** Decrypt multiple secrets from data encrypted with the AWS KMS service. */
    def getSecretsPlain(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kms.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsPlainArgs.builder
      com.pulumi.aws.kms.KmsFunctions.getSecretsPlain(args(argsBuilder).build)

  /**
   * Manages a KMS multi-Region replica key that uses external key material.
   *  See the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html) for more information on importing key material into multi-Region keys.
   */
  def ReplicaExternalKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.ReplicaExternalKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.ReplicaExternalKeyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kms.ReplicaExternalKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a single-Region or multi-Region primary KMS key.
   *  
   *  &gt; **NOTE on KMS Key Policy:** KMS Key Policy can be configured in either the standalone resource `aws.kms.KeyPolicy`
   *  or with the parameter `policy` in this resource.
   *  Configuring with both will cause inconsistencies and may overwrite configuration.
   */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.KeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.KeyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kms.Key(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a single-Region or multi-Region primary KMS key that uses external key material.
   *  To instead manage a single-Region or multi-Region primary KMS key where AWS automatically generates and potentially rotates key material, see the `aws.kms.Key` resource.
   */
  def ExternalKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.ExternalKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kms.ExternalKeyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kms.ExternalKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS KMS (Key Management) Custom Key Store. */
  def CustomKeyStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kms.CustomKeyStoreArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.kms.CustomKeyStoreArgs.builder
    
    com.pulumi.aws.kms.CustomKeyStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kms.inputs.GrantState.Builder)
    /**
     * @param constraints A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](https://docs.aws.amazon.com/kms/latest/developerguide/encrypt_context.html).
     * @return builder
     */
    def constraints(args: Endofunction[com.pulumi.aws.kms.inputs.GrantConstraintArgs.Builder]*):
        com.pulumi.aws.kms.inputs.GrantState.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GrantConstraintArgs.builder
      builder.constraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.GetSecretsArgs.Builder)
    /**
     * @param secrets One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretsSecretArgs.Builder]*):
        com.pulumi.aws.kms.inputs.GetSecretsArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GetSecretsSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.GetSecretArgs.Builder)
    def secrets(args: Endofunction[com.pulumi.aws.kms.inputs.GetSecretSecretArgs.Builder]*):
        com.pulumi.aws.kms.inputs.GetSecretArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GetSecretSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kms.inputs.CustomKeyStoreState.Builder)
    def xksProxyAuthenticationCredential(args: Endofunction[com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.Builder]):
        com.pulumi.aws.kms.inputs.CustomKeyStoreState.Builder =
      val argsBuilder = com.pulumi.aws.kms.inputs.CustomKeyStoreXksProxyAuthenticationCredentialArgs.builder
      builder.xksProxyAuthenticationCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kms.GrantArgs.Builder)
    /**
     * @param constraints A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](https://docs.aws.amazon.com/kms/latest/developerguide/encrypt_context.html).
     * @return builder
     */
    def constraints(args: Endofunction[com.pulumi.aws.kms.inputs.GrantConstraintArgs.Builder]*):
        com.pulumi.aws.kms.GrantArgs.Builder =
      def argsBuilder = com.pulumi.aws.kms.inputs.GrantConstraintArgs.builder
      builder.constraints(args.map(_(argsBuilder).build)*)
