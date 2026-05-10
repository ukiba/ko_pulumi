package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object keyvault:
  /**
   * Manages a Key Vault Managed Hardware Security Module.
   * 
   *  &gt; **Note:** The Azure Provider includes a Feature Toggle which will purge a Key Vault Managed Hardware Security Module resource on destroy, rather than the default soft-delete. See `purgeSoftDeletedHardwareSecurityModulesOnDestroy` for more information.
   */
  def ManagedHardwareSecurityModule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Key Vault Certificate Issuer. */
  def CertificateIssuer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertificateIssuerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.CertificateIssuerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.keyvault.CertificateIssuer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.keyvault.CertifiateArgs.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.CertifiateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     *  &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.CertifiateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.CertifiateArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Key Vault Secret. */
  def Secret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.SecretArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.SecretArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.Secret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages Key Vault Certificate Contacts. */
  def CertificateContacts(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertificateContactsArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.keyvault.CertificateContactsArgs.builder
    com.pulumi.azure.keyvault.CertificateContacts(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder)
    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Managed Hardware Security Module Role Assignment. */
  def ManagedHardwareSecurityModuleRoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.keyvault.KeyArgs.Builder)
    /**
     * @param rotationPolicy A `rotationPolicy` block as defined below.
     * @return builder
     */
    def rotationPolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder]):
        com.pulumi.azure.keyvault.KeyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.builder
      builder.rotationPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.KeyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Key Vault Access Policy.
   * 
   *  &gt; **NOTE:** It&#39;s possible to define Key Vault Access Policies both within the `azure.keyvault.KeyVault` resource via the `accessPolicy` block and by using the `azure.keyvault.AccessPolicy` resource. However it&#39;s not possible to use both methods to manage Access Policies within a KeyVault, since there&#39;ll be conflicts.
   * 
   *  &gt; **NOTE:** Azure permits a maximum of 1024 Access Policies per Key Vault - [more information can be found in this document](https://docs.microsoft.com/azure/key-vault/key-vault-secure-your-key-vault#data-plane-access-control).
   * 
   *  ## Import
   * 
   *  Key Vault Access Policies can be imported using the Resource ID of the Key Vault, plus some additional metadata.
   * 
   *  If both an `objectId` and `applicationId` are specified, then the Access Policy can be imported using the following code:
   * 
   *  ```sh
   *  $ pulumi import azure:keyvault/accessPolicy:AccessPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.KeyVault/vaults/test-vault/objectId/11111111-1111-1111-1111-111111111111/applicationId/22222222-2222-2222-2222-222222222222
   *  ```
   * 
   *  where `11111111-1111-1111-1111-111111111111` is the `objectId` and `22222222-2222-2222-2222-222222222222` is the `applicationId`.
   * 
   *  ***
   * 
   *  Access Policies with an `objectId` but no `applicationId` can be imported using the following command:
   * 
   *  ```sh
   *  $ pulumi import azure:keyvault/accessPolicy:AccessPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.KeyVault/vaults/test-vault/objectId/11111111-1111-1111-1111-111111111111
   *  ```
   * 
   *  where `11111111-1111-1111-1111-111111111111` is the `objectId`.
   * 
   *  &gt; **NOTE:** Both Identifiers are unique to this provider and don&#39;t map to an existing object within Azure.
   */
  def AccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.AccessPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.keyvault.AccessPolicyArgs.builder
    com.pulumi.azure.keyvault.AccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Key Vault Certificate. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.keyvault.KeyVaultArgs.Builder)
    /**
     * @param accessPolicies A list of up to 1024 objects describing access policies, as described below.
     * 
     *  &gt; **Note:** Since `accessPolicy` can be configured both inline and via the separate `azure.keyvault.AccessPolicy` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def accessPolicies(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.Builder]*):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated As the `contact` property uses a data plane API, to better support private endpoints and key vaults with public network access disabled, new key vaults with the `contact` field defined in the configuration file will now be required to use the `azure.keyvault.CertificateContacts` resource instead of the exposed `contact` field in the key vault resource itself. This field will be removed in v5.0 of the provider.
     */
    @deprecated def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.Builder]*):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.keyvault.CertificateIssuerArgs.Builder)
    /**
     * @param admins One or more `admin` blocks as defined below.
     * @return builder
     */
    def admins(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.Builder]*):
        com.pulumi.azure.keyvault.CertificateIssuerArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.builder
      builder.admins(args.map(_(argsBuilder).build)*)

  /** Manages a Key Vault Certificate. */
  @deprecated() def Certifiate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.CertifiateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.CertifiateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.Certifiate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.keyvault.CertificateContactsArgs.Builder)
    /**
     * @param contacts One or more `contact` blocks as defined below.
     * @return builder
     */
    def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.Builder]*):
        com.pulumi.azure.keyvault.CertificateContactsArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

  /** Manages a Key Vault Managed Storage Account. */
  def ManagedStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedStorageAccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedStorageAccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.ManagedStorageAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Key Vault Managed Hardware Security Module Role Definition. This resource works together with Managed hardware security module resource. */
  def ManagedHardwareSecurityModuleRoleDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Key Vault Key. */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.KeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.KeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.Key(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type KeyvaultFunctions = com.pulumi.azure.keyvault.KeyvaultFunctions
  object KeyvaultFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.keyvault.KeyvaultFunctions.*
  extension (self: KeyvaultFunctions.type)
    /** Use this data source to access information about the permissions from the Management Key Vault Templates. */
    def getAccessPolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetAccessPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetAccessPolicyArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getAccessPolicy(args(argsBuilder).build)

    /** Use this data source to access information about the permissions from the Management Key Vault Templates. */
    def getAccessPolicyPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetAccessPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetAccessPolicyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetAccessPolicyPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getAccessPolicyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Certificate. */
    def getCertificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificate(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Certificate. */
    def getCertificatePlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificatePlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificatePlain(args(argsBuilder).build)

    /**
     * Use this data source to access data stored in an existing Key Vault Certificate.
     * 
     *  &gt; **Note:** This data source uses the `GetSecret` function of the Azure API, to get the key of the certificate. Therefore you need secret/get permission
     */
    def getCertificateData(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateDataArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificateDataResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateDataArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateData(args(argsBuilder).build)

    /**
     * Use this data source to access data stored in an existing Key Vault Certificate.
     * 
     *  &gt; **Note:** This data source uses the `GetSecret` function of the Azure API, to get the key of the certificate. Therefore you need secret/get permission
     */
    def getCertificateDataPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateDataPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificateDataResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateDataPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateDataPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Certificate Issuer. */
    def getCertificateIssuer(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateIssuerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificateIssuerResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateIssuerArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateIssuer(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Certificate Issuer. */
    def getCertificateIssuerPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificateIssuerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificateIssuerResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificateIssuerPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificateIssuerPlain(args(argsBuilder).build)

    /** Use this data source to retrieve a list of certificate names from an existing Key Vault. */
    def getCertificates(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificatesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificatesArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificates(args(argsBuilder).build)

    /** Use this data source to retrieve a list of certificate names from an existing Key Vault. */
    def getCertificatesPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetCertificatesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetCertificatesResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetCertificatesPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getCertificatesPlain(args(argsBuilder).build)

    /** Encrypts or Decrypts a value using a Key Vault Key. */
    def getEncryptedValue(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetEncryptedValueArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetEncryptedValueResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetEncryptedValueArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getEncryptedValue(args(argsBuilder).build)

    /** Encrypts or Decrypts a value using a Key Vault Key. */
    def getEncryptedValuePlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetEncryptedValuePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetEncryptedValueResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetEncryptedValuePlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getEncryptedValuePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Key. */
    def getKey(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKey(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Key. */
    def getKeyPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKeyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault. */
    def getKeyVault(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetKeyVaultResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyVaultArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKeyVault(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault. */
    def getKeyVaultPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetKeyVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetKeyVaultResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetKeyVaultPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getKeyVaultPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module. */
    def getManagedHardwareSecurityModule(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module. */
    def getManagedHardwareSecurityModulePlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModulePlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModulePlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Managed Hardware Security Module Key.
     * 
     *  &gt; **Note:** All arguments including the secret value will be stored in the raw state as plain-text.
     *  [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
     */
    def getManagedHardwareSecurityModuleKey(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleKey(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Managed Hardware Security Module Key.
     * 
     *  &gt; **Note:** All arguments including the secret value will be stored in the raw state as plain-text.
     *  [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
     */
    def getManagedHardwareSecurityModuleKeyPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleKeyResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleKeyPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleKeyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module Role Definition. */
    def getManagedHardwareSecurityModuleRoleDefinition(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleRoleDefinition(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Managed Hardware Security Module Role Definition. */
    def getManagedHardwareSecurityModuleRoleDefinitionPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetManagedHardwareSecurityModuleRoleDefinitionResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetManagedHardwareSecurityModuleRoleDefinitionPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getManagedHardwareSecurityModuleRoleDefinitionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Secret. */
    def getSecret(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecret(args(argsBuilder).build)

    /** Use this data source to access information about an existing Key Vault Secret. */
    def getSecretPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecretPlain(args(argsBuilder).build)

    /** Use this data source to retrieve a list of secret names from an existing Key Vault Secret. */
    def getSecrets(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.keyvault.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretsArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecrets(args(argsBuilder).build)

    /** Use this data source to retrieve a list of secret names from an existing Key Vault Secret. */
    def getSecretsPlain(args: Endofunction[com.pulumi.azure.keyvault.inputs.GetSecretsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.keyvault.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.GetSecretsPlainArgs.builder
      com.pulumi.azure.keyvault.KeyvaultFunctions.getSecretsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.CertificateArgs.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     *  &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.CertificateArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Key Vault.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** It&#39;s possible to define Key Vault Access Policies both within the `azure.keyvault.KeyVault` resource via the `accessPolicy` block and by using the `azure.keyvault.AccessPolicy` resource. However it&#39;s not possible to use both methods to manage Access Policies within a KeyVault, since there&#39;ll be conflicts.
   * 
   *  &gt; **Note:** It&#39;s possible to define Key Vault Certificate Contacts both within the `azure.keyvault.KeyVault` resource via the `contact` block and by using the `azure.keyvault.CertificateContacts` resource. However it&#39;s not possible to use both methods to manage Certificate Contacts within a KeyVault, since there&#39;ll be conflicts.
   */
  def KeyVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.KeyVaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.KeyVaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.KeyVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Key Vault Managed Hardware Security Module Key.
   * 
   *  &gt; **Note:** The Azure Provider includes a Feature Toggle which will purge a Key Vault Managed Hardware Security Module Key resource on destroy, rather than the default soft-delete. See `purgeSoftDeletedHardwareSecurityModulesOnDestroy` for more information.
   */
  def ManagedHardwareSecurityModuleKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Key Vault Managed Storage Account SAS Definition. */
  def ManagedStorageAccountSasTokenDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedStorageAccountSasTokenDefinitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.keyvault.ManagedStorageAccountSasTokenDefinitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.keyvault.ManagedStorageAccountSasTokenDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateState.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificateAttributes A `certificateAttribute` block as defined below.
     * @return builder
     */
    def certificateAttributes(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificateAttributeArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificateAttributeArgs.builder
      builder.certificateAttributes(args.map(_(argsBuilder).build)*)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     *  &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateState.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificateAttributes A `certificateAttribute` block as defined below.
     * @return builder
     */
    def certificateAttributes(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificateAttributeArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificateAttributeArgs.builder
      builder.certificateAttributes(args.map(_(argsBuilder).build)*)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     *  &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder)
    /**
     * @param accessPolicies A list of up to 1024 objects describing access policies, as described below.
     * 
     *  &gt; **Note:** Since `accessPolicy` can be configured both inline and via the separate `azure.keyvault.AccessPolicy` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    def accessPolicies(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated As the `contact` property uses a data plane API, to better support private endpoints and key vaults with public network access disabled, new key vaults with the `contact` field defined in the configuration file will now be required to use the `azure.keyvault.CertificateContacts` resource instead of the exposed `contact` field in the key vault resource itself. This field will be removed in v5.0 of the provider.
     */
    @deprecated def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.Builder)
    /**
     * @param subjectAlternativeNames A `subjectAlternativeNames` block as defined below.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionState.Builder)
    /**
     * @param permissions One or more `permission` blocks as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateContactsState.Builder)
    /**
     * @param contacts One or more `contact` blocks as defined below.
     * @return builder
     */
    def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateContactsState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateIssuerState.Builder)
    /**
     * @param admins One or more `admin` blocks as defined below.
     * @return builder
     */
    def admins(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateIssuerState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.builder
      builder.admins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.Builder)
    /**
     * @param subjectAlternativeNames A `subjectAlternativeNames` block as defined below.
     * @return builder
     */
    def subjectAlternativeNames(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder)
    /**
     * @param action A `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionActionArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionTriggerArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleState.Builder)
    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder)
    /**
     * @param issuerParameters A `issuerParameters` block as defined below.
     * @return builder
     */
    def issuerParameters(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyIssuerParametersArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyIssuerParametersArgs.builder
      builder.issuerParameters(args(argsBuilder).build)

    /**
     * @param keyProperties A `keyProperties` block as defined below.
     * @return builder
     */
    def keyProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyKeyPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyKeyPropertiesArgs.builder
      builder.keyProperties(args(argsBuilder).build)

    /**
     * @param lifetimeActions A `lifetimeAction` block as defined below.
     * @return builder
     */
    def lifetimeActions(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.builder
      builder.lifetimeActions(args.map(_(argsBuilder).build)*)

    /**
     * @param secretProperties A `secretProperties` block as defined below.
     * @return builder
     */
    def secretProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicySecretPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicySecretPropertiesArgs.builder
      builder.secretProperties(args(argsBuilder).build)

    /**
     * @param x509CertificateProperties A `x509CertificateProperties` block as defined below. Required when `certificate` block is not specified.
     * @return builder
     */
    def x509CertificateProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.builder
      builder.x509CertificateProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder)
    /**
     * @param automatic An `automatic` block as defined below.
     * @return builder
     */
    def automatic(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyRotationPolicyAutomaticArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyRotationPolicyAutomaticArgs.builder
      builder.automatic(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder)
    /**
     * @param action A `action` block as defined below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionActionArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionTriggerArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.KeyState.Builder)
    /**
     * @param rotationPolicy A `rotationPolicy` block as defined below.
     * @return builder
     */
    def rotationPolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.builder
      builder.rotationPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.keyvault.inputs.KeyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder)
    /**
     * @param issuerParameters A `issuerParameters` block as defined below.
     * @return builder
     */
    def issuerParameters(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyIssuerParametersArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyIssuerParametersArgs.builder
      builder.issuerParameters(args(argsBuilder).build)

    /**
     * @param keyProperties A `keyProperties` block as defined below.
     * @return builder
     */
    def keyProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyKeyPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyKeyPropertiesArgs.builder
      builder.keyProperties(args(argsBuilder).build)

    /**
     * @param lifetimeActions A `lifetimeAction` block as defined below.
     * @return builder
     */
    def lifetimeActions(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.builder
      builder.lifetimeActions(args.map(_(argsBuilder).build)*)

    /**
     * @param secretProperties A `secretProperties` block as defined below.
     * @return builder
     */
    def secretProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicySecretPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicySecretPropertiesArgs.builder
      builder.secretProperties(args(argsBuilder).build)

    /**
     * @param x509CertificateProperties A `x509CertificateProperties` block as defined below. Required when `certificate` block is not specified.
     * @return builder
     */
    def x509CertificateProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.builder
      builder.x509CertificateProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.Builder)
    /**
     * @param permissions One or more `permission` blocks as defined below.
     * @return builder
     */
    def permissions(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  /** Manages a Managed HSM Key rotation policy. */
  def ManagedHardwareSecurityModuleKeyRotationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicyArgs.builder
    com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
