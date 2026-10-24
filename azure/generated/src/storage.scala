package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object storage:
  /** Manages an Azure Storage Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.AccountArgs.builder
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
    com.pulumi.azure.storage.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages network rules inside of a Azure Storage Account.
   * 
   * &gt; **Note:** Network Rules can be defined either directly on the `azure.storage.Account` resource, or using the `azure.storage.AccountNetworkRules` resource - but the two cannot be used together. Spurious changes will occur if both are used against the same Storage Account.
   * 
   * &gt; **Note:** Only one `azure.storage.AccountNetworkRules` can be tied to an `azure.storage.Account`. Spurious changes will occur if more than `azure.storage.AccountNetworkRules` is tied to the same `azure.storage.Account`.
   * 
   * &gt; **Note:** Deleting this resource updates the storage account back to the default values it had when the storage account was created.
   */
  def AccountNetworkRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountNetworkRulesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.AccountNetworkRulesArgs.builder
    com.pulumi.azure.storage.AccountNetworkRules(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Queue Properties of an Azure Storage Account. */
  def AccountQueueProperties(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountQueuePropertiesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.AccountQueuePropertiesArgs.builder
    com.pulumi.azure.storage.AccountQueueProperties(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Static Website of an Azure Storage Account. */
  def AccountStaticWebsite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountStaticWebsiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.AccountStaticWebsiteArgs.builder
    com.pulumi.azure.storage.AccountStaticWebsite(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the Table Properties of an Azure Storage Account. */
  def AccountTableProperties(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.AccountTablePropertiesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.AccountTablePropertiesArgs.builder
    com.pulumi.azure.storage.AccountTableProperties(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Blob within a Storage Container. */
  def Blob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.BlobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.BlobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Blob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Blob Inventory Policy. */
  def BlobInventoryPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.BlobInventoryPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.BlobInventoryPolicyArgs.builder
    com.pulumi.azure.storage.BlobInventoryPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container within an Azure Storage Account. */
  def Container(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ContainerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ContainerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Container(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Immutability Policy for a Container within an Azure Storage Account. */
  def ContainerImmutabilityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ContainerImmutabilityPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.ContainerImmutabilityPolicyArgs.builder
    com.pulumi.azure.storage.ContainerImmutabilityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Customer Managed Key for a Storage Account.
   * 
   * &gt; **Note:** It&#39;s possible to define a Customer Managed Key both within the `azure.storage.Account` resource via the `customerManagedKey` block and by using the `azure.storage.CustomerManagedKey` resource. However it&#39;s not possible to use both methods to manage a Customer Managed Key for a Storage Account, since there&#39;ll be conflicts.
   */
  def CustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.CustomerManagedKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.CustomerManagedKeyArgs.builder
    com.pulumi.azure.storage.CustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Data Lake Gen2 File System within an Azure Storage Account.
   * 
   * &gt; **Note:** This resource requires some `Storage` specific roles which are not granted by default. Some of the built-ins roles that can be attributed are [`Storage Account Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-account-contributor), [`Storage Blob Data Owner`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-owner), [`Storage Blob Data Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-contributor), [`Storage Blob Data Reader`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-reader).
   */
  def DataLakeGen2Filesystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.DataLakeGen2FilesystemArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.DataLakeGen2Filesystem(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Data Lake Gen2 Path in a File System within an Azure Storage Account.
   * 
   * &gt; **Note:** This resource requires some `Storage` specific roles which are not granted by default. Some of the built-ins roles that can be attributed are [`Storage Account Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-account-contributor), [`Storage Blob Data Owner`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-owner), [`Storage Blob Data Contributor`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-contributor), [`Storage Blob Data Reader`](https://docs.microsoft.com/azure/role-based-access-control/built-in-roles#storage-blob-data-reader).
   */
  def DataLakeGen2Path(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.DataLakeGen2PathArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.DataLakeGen2PathArgs.builder
    com.pulumi.azure.storage.DataLakeGen2Path(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Storage Encryption Scope.
   * 
   * &gt; **Note:** Storage Encryption Scopes are in Preview [more information can be found here](https://docs.microsoft.com/azure/storage/blobs/encryption-scope-manage).
   */
  def EncryptionScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.EncryptionScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.EncryptionScopeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.EncryptionScope(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Account Local User. */
  def LocalUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.LocalUserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.LocalUserArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.LocalUser(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Storage Account Management Policy. */
  def ManagementPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ManagementPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.ManagementPolicyArgs.builder
    com.pulumi.azure.storage.ManagementPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Mover. */
  def Mover(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverArgs.builder
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
    com.pulumi.azure.storage.Mover(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Mover Agent. */
  def MoverAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverAgentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverAgent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Mover Job Definition. */
  def MoverJobDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverJobDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverJobDefinitionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverJobDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Mover Project. */
  def MoverProject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverProject(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Mover Source Endpoint. */
  def MoverSourceEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverSourceEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverSourceEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverSourceEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Mover Target Endpoint. */
  def MoverTargetEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.MoverTargetEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.MoverTargetEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.MoverTargetEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Object Replication. */
  def ObjectReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ObjectReplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.ObjectReplicationArgs.builder
    com.pulumi.azure.storage.ObjectReplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Queue within an Azure Storage Account. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.QueueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.QueueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Queue(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a File Share within Azure Storage.
   * 
   * &gt; **Note:** The storage share supports two storage tiers: premium and standard. Standard file shares are created in general purpose (GPv1 or GPv2) storage accounts and premium file shares are created in FileStorage storage accounts. For further information, refer to the section &#34;What storage tiers are supported in Azure Files?&#34; of [documentation](https://docs.microsoft.com/azure/storage/files/storage-files-faq#general).
   * 
   * &gt; **Note:** Shared Key authentication will always be used for this resource, as AzureAD authentication is not supported by the Storage API for files.
   */
  def Share(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ShareArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ShareArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Share(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Directory within an Azure Storage File Share.
   * 
   * &gt; **Note:** When using Azure Active Directory Authentication (i.e. setting the provider property `storageUseAzuread = true`), the principal running Terraform must have the *Storage File Data Privileged Contributor* IAM role assigned. The *Storage File Data SMB Share Contributor* does not have sufficient permissions to create directories. Refer to [official documentation](https://learn.microsoft.com/en-us/rest/api/storageservices/authorize-with-azure-active-directory#permissions-for-file-service-operations) for more details.
   */
  def ShareDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ShareDirectoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ShareDirectoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.ShareDirectory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a File within an Azure Storage File Share.
   * 
   * &gt; **Note:** When using Azure Active Directory Authentication (i.e. setting the provider property `storageUseAzuread = true`), the principal running Terraform must have the *Storage File Data Privileged Contributor* IAM role assigned. The *Storage File Data SMB Share Contributor* does not have sufficient permissions to create files. Refer to [official documentation](https://learn.microsoft.com/en-us/rest/api/storageservices/authorize-with-azure-active-directory#permissions-for-file-service-operations) for more details.
   */
  def ShareFile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ShareFileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ShareFileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.ShareFile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object StorageFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Storage Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
     */
    inline def getAccountBlobContainerSAS(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetAccountBlobContainerSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountBlobContainerSAS(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
     */
    inline def getAccountBlobContainerSASPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetAccountBlobContainerSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountBlobContainerSASPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountBlobContainerSASPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
     * 
     * Note that this is an [Account SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-an-account-sas)
     * and *not* a [Service SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-a-service-sas).
     */
    inline def getAccountSAS(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetAccountSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountSAS(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account.
     * 
     * Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account.
     * 
     * Note that this is an [Account SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-an-account-sas)
     * and *not* a [Service SAS](https://docs.microsoft.com/rest/api/storageservices/constructing-a-service-sas).
     */
    inline def getAccountSASPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetAccountSASResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetAccountSASPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getAccountSASPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Blob. */
    inline def getBlob(args: Endofunction[com.pulumi.azure.storage.inputs.GetBlobArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetBlobResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetBlobArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getBlob(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Blob. */
    inline def getBlobPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetBlobPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetBlobResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetBlobPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getBlobPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about the existing Storage Containers within a Storage Account. */
    inline def getContainers(args: Endofunction[com.pulumi.azure.storage.inputs.GetContainersArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetContainersResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetContainersArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getContainers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about the existing Storage Containers within a Storage Account. */
    inline def getContainersPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetContainersPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetContainersResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetContainersPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getContainersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Encryption Scope. */
    inline def getEncryptionScope(args: Endofunction[com.pulumi.azure.storage.inputs.GetEncryptionScopeArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetEncryptionScopeResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetEncryptionScopeArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getEncryptionScope(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Encryption Scope. */
    inline def getEncryptionScopePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetEncryptionScopePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetEncryptionScopeResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetEncryptionScopePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getEncryptionScopePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Management Policy. */
    inline def getPolicy(args: Endofunction[com.pulumi.azure.storage.inputs.GetPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetPolicyArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Management Policy. */
    inline def getPolicyPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetPolicyPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Queue. */
    inline def getQueue(args: Endofunction[com.pulumi.azure.storage.inputs.GetQueueArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetQueueArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getQueue(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Queue. */
    inline def getQueuePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetQueuePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetQueueResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetQueuePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getQueuePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing File Share.
     * 
     * &gt; **Note:** Shared Key authentication will always be used for this data source, as AzureAD authentication is not supported by the Storage API for files.
     */
    inline def getShare(args: Endofunction[com.pulumi.azure.storage.inputs.GetShareArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetShareArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getShare(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing File Share.
     * 
     * &gt; **Note:** Shared Key authentication will always be used for this data source, as AzureAD authentication is not supported by the Storage API for files.
     */
    inline def getSharePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetSharePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetShareResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSharePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSharePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Container. */
    inline def getStorageContainer(args: Endofunction[com.pulumi.azure.storage.inputs.GetStorageContainerArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetStorageContainerResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetStorageContainerArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getStorageContainer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Container. */
    inline def getStorageContainerPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetStorageContainerPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetStorageContainerResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetStorageContainerPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getStorageContainerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Sync. */
    inline def getSync(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetSyncResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSync(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Sync. */
    inline def getSyncPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetSyncResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSyncPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Sync Group. */
    inline def getSyncGroup(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetSyncGroupResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncGroupArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSyncGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Sync Group. */
    inline def getSyncGroupPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetSyncGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetSyncGroupResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetSyncGroupPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getSyncGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Table. */
    inline def getTable(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Table. */
    inline def getTablePlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetTablePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTablePlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    inline def getTableEntities(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntitiesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetTableEntitiesResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntitiesArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntities(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    inline def getTableEntitiesPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntitiesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetTableEntitiesResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntitiesPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntitiesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    inline def getTableEntity(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntityArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.storage.outputs.GetTableEntityResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntityArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntity(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Storage Table Entity. */
    inline def getTableEntityPlain(args: Endofunction[com.pulumi.azure.storage.inputs.GetTableEntityPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.storage.outputs.GetTableEntityResult] =
      val argsBuilder = com.pulumi.azure.storage.inputs.GetTableEntityPlainArgs.builder
      com.pulumi.azure.storage.StorageFunctions.getTableEntityPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Storage Sync. */
  def Sync(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncArgs.builder
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
    com.pulumi.azure.storage.Sync(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Storage Sync Cloud Endpoint.
   * 
   * &gt; **Note:** Please ensure Azure File Sync has access to the storage account in your subscription, which indicates that `Microsoft.StorageSync` is assigned role `Reader and Data Access` ( refer to details [here](https://docs.microsoft.com/azure/storage/files/storage-sync-files-troubleshoot?tabs=portal1%2Cazure-portal#common-troubleshooting-steps)).
   */
  def SyncCloudEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncCloudEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncCloudEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.SyncCloudEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Storage Sync Group. */
  def SyncGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.SyncGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Storage Sync Server Endpoint.
   * 
   * &gt; **Note:** The parent `azure.storage.SyncGroup` must have an `azure.storage.SyncCloudEndpoint` available before an `azure.storage.SyncServerEndpoint` resource can be created.
   */
  def SyncServerEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.SyncServerEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.SyncServerEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.SyncServerEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Table within an Azure Storage Account.
   * 
   * &gt; **Note:** Shared Key authentication will always be used for this resource, as AzureAD authentication is not supported when setting or retrieving ACLs for Tables.
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.TableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.TableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.Table(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Entity within a Table in an Azure Storage Account. */
  def TableEntity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.TableEntityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.storage.TableEntityArgs.builder
    com.pulumi.azure.storage.TableEntity(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** @deprecated ZipBlob resource is deprecated in the 2.0 version of the provider. Use Blob resource instead. */
  @deprecated("ZipBlob resource is deprecated in the 2.0 version of the provider. Use Blob resource instead.") def ZipBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.storage.ZipBlobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.storage.ZipBlobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.storage.ZipBlob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
