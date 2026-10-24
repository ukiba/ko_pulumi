package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object keyvault:
  /**
   * Manages a Key Vault Access Policy.
   * 
   * &gt; **NOTE:** It&#39;s possible to define Key Vault Access Policies both within the `azure.keyvault.KeyVault` resource via the `accessPolicy` block and by using the `azure.keyvault.AccessPolicy` resource. However it&#39;s not possible to use both methods to manage Access Policies within a KeyVault, since there&#39;ll be conflicts.
   * 
   * &gt; **NOTE:** Azure permits a maximum of 1024 Access Policies per Key Vault - [more information can be found in this document](https://docs.microsoft.com/azure/key-vault/key-vault-secure-your-key-vault#data-plane-access-control).
   * 
   * ## Import
   * 
   * Key Vault Access Policies can be imported using the Resource ID of the Key Vault, plus some additional metadata.
   * 
   * If both an `objectId` and `applicationId` are specified, then the Access Policy can be imported using the following code:
   * 
   * ```sh
   * \$ pulumi import azure:keyvault/accessPolicy:AccessPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.KeyVault/vaults/test-vault/objectId/11111111-1111-1111-1111-111111111111/applicationId/22222222-2222-2222-2222-222222222222
   * ```
   * 
   * where `11111111-1111-1111-1111-111111111111` is the `objectId` and `22222222-2222-2222-2222-222222222222` is the `applicationId`.
   * 
   * ***
   * 
   * Access Policies with an `objectId` but no `applicationId` can be imported using the following command:
   * 
   * ```sh
   * \$ pulumi import azure:keyvault/accessPolicy:AccessPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.KeyVault/vaults/test-vault/objectId/11111111-1111-1111-1111-111111111111
   * ```
   * 
   * where `11111111-1111-1111-1111-111111111111` is the `objectId`.
   * 
   * &gt; **NOTE:** Both Identifiers are unique to this provider and don&#39;t map to an existing object within Azure.
   */
  def AccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.AccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.keyvault.AccessPolicyArgs.builder
    com.pulumi.azure.keyvault.AccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Certificate. */
  @deprecated("azure.keyvault.Certifiate has been deprecated in favor of azure.keyvault.Certificate") def Certifiate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertifiateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.CertifiateArgs.builder
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
    com.pulumi.azure.keyvault.Certifiate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Certificate. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.CertificateArgs.builder
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
    com.pulumi.azure.keyvault.Certificate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Key Vault Certificate Contacts. */
  def CertificateContacts(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertificateContactsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.keyvault.CertificateContactsArgs.builder
    com.pulumi.azure.keyvault.CertificateContacts(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Certificate Issuer. */
  def CertificateIssuer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertificateIssuerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.CertificateIssuerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.keyvault.CertificateIssuer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Key. */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.KeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.KeyArgs.builder
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
    com.pulumi.azure.keyvault.Key(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Key Vault.
   * 
   * ## Disclaimers
   * 
   * &gt; **Note:** It&#39;s possible to define Key Vault Access Policies both within the `azure.keyvault.KeyVault` resource via the `accessPolicy` block and by using the `azure.keyvault.AccessPolicy` resource. However it&#39;s not possible to use both methods to manage Access Policies within a KeyVault, since there&#39;ll be conflicts.
   * 
   * &gt; **Note:** It&#39;s possible to define Key Vault Certificate Contacts both within the `azure.keyvault.KeyVault` resource via the `contact` block and by using the `azure.keyvault.CertificateContacts` resource. However it&#39;s not possible to use both methods to manage Certificate Contacts within a KeyVault, since there&#39;ll be conflicts.
   */
  def KeyVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.KeyVaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.KeyVaultArgs.builder
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
    com.pulumi.azure.keyvault.KeyVault(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object KeyvaultFunctions:
    /** Use this data source to access information about the permissions from the Management Key Vault Templates. */
    inline def getAccessPolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetAccessPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetAccessPolicyArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getAccessPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about the permissions from the Management Key Vault Templates. */
    inline def getAccessPolicyPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetAccessPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetAccessPolicyPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getAccessPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault Certificate. */
    inline def getCertificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault Certificate. */
    inline def getCertificatePlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificatePlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access data stored in an existing Key Vault Certificate.
     * 
     * &gt; **Note:** This data source uses the `GetSecret` function of the Azure API, to get the key of the certificate. Therefore you need secret/get permission
     */
    inline def getCertificateData(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateDataArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificateDataResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateDataArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateData(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access data stored in an existing Key Vault Certificate.
     * 
     * &gt; **Note:** This data source uses the `GetSecret` function of the Azure API, to get the key of the certificate. Therefore you need secret/get permission
     */
    inline def getCertificateDataPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateDataPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificateDataResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateDataPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateDataPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault Certificate Issuer. */
    inline def getCertificateIssuer(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateIssuerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificateIssuerResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateIssuerArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateIssuer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault Certificate Issuer. */
    inline def getCertificateIssuerPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateIssuerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificateIssuerResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateIssuerPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateIssuerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve a list of certificate names from an existing Key Vault. */
    inline def getCertificates(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificatesArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve a list of certificate names from an existing Key Vault. */
    inline def getCertificatesPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificatesPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Encrypts or Decrypts a value using a Key Vault Key. */
    inline def getEncryptedValue(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetEncryptedValueArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetEncryptedValueResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetEncryptedValueArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getEncryptedValue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Encrypts or Decrypts a value using a Key Vault Key. */
    inline def getEncryptedValuePlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetEncryptedValuePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetEncryptedValueResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetEncryptedValuePlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getEncryptedValuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault Key. */
    inline def getKey(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault Key. */
    inline def getKeyPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault. */
    inline def getKeyVault(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyVaultArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetKeyVaultResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyVaultArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKeyVault(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault. */
    inline def getKeyVaultPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyVaultPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetKeyVaultResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyVaultPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKeyVaultPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module. */
    inline def getManagedHardwareSecurityModule(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module. */
    inline def getManagedHardwareSecurityModulePlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModulePlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing Managed Hardware Security Module Key.
     * 
     * &gt; **Note:** All arguments including the secret value will be stored in the raw state as plain-text.
     * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
     */
    inline def getManagedHardwareSecurityModuleKey(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing Managed Hardware Security Module Key.
     * 
     * &gt; **Note:** All arguments including the secret value will be stored in the raw state as plain-text.
     * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
     */
    inline def getManagedHardwareSecurityModuleKeyPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module Role Definition. */
    inline def getManagedHardwareSecurityModuleRoleDefinition(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleRoleDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module Role Definition. */
    inline def getManagedHardwareSecurityModuleRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleRoleDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Key Vault Secret. */
    inline def getSecret(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecret(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Key Vault Secret. */
    inline def getSecretPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecretPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve a list of secret names from an existing Key Vault Secret. */
    inline def getSecrets(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretsArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecrets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve a list of secret names from an existing Key Vault Secret. */
    inline def getSecretsPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretsPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecretsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages a Key Vault Managed Hardware Security Module.
   * 
   * &gt; **Note:** The Azure Provider includes a Feature Toggle which will purge a Key Vault Managed Hardware Security Module resource on destroy, rather than the default soft-delete. See `purgeSoftDeletedHardwareSecurityModulesOnDestroy` for more information.
   */
  def ManagedHardwareSecurityModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.builder
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
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Key Vault Managed Hardware Security Module Key.
   * 
   * &gt; **Note:** The Azure Provider includes a Feature Toggle which will purge a Key Vault Managed Hardware Security Module Key resource on destroy, rather than the default soft-delete. See `purgeSoftDeletedHardwareSecurityModulesOnDestroy` for more information.
   */
  def ManagedHardwareSecurityModuleKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyArgs.builder
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
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKey(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Managed HSM Key rotation policy. */
  def ManagedHardwareSecurityModuleKeyRotationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicyArgs.builder
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Managed Hardware Security Module Role Assignment. */
  def ManagedHardwareSecurityModuleRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleAssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Managed Hardware Security Module Role Definition. This resource works together with Managed hardware security module resource. */
  def ManagedHardwareSecurityModuleRoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Managed Storage Account. */
  def ManagedStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedStorageAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedStorageAccountArgs.builder
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
    com.pulumi.azure.keyvault.ManagedStorageAccount(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Managed Storage Account SAS Definition. */
  def ManagedStorageAccountSasTokenDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedStorageAccountSasTokenDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedStorageAccountSasTokenDefinitionArgs.builder
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
    com.pulumi.azure.keyvault.ManagedStorageAccountSasTokenDefinition(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Key Vault Secret. */
  def Secret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.keyvault.SecretArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.SecretArgs.builder
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
    com.pulumi.azure.keyvault.Secret(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
